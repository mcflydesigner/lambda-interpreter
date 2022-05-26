package com.interpreter.runtime.imports;

import com.interpreter.runtime.Interpreter;
import com.interpreter.runtime.InterpreterImpl;
import com.interpreter.runtime.env.Environment;
import com.interpreter.runtime.env.value.FunctionLibraryValue;
import com.interpreter.runtime.env.value.FunctionValue;
import com.interpreter.runtime.env.value.Value;
import com.interpreter.runtime.env.value.ValueType;
import com.interpreter.shared.exceptions.IncorrectModuleDefinitionException;
import com.interpreter.shared.exceptions.LineColPair;
import com.interpreter.shared.exceptions.ModuleAlreadyLoadedException;
import com.interpreter.shared.exceptions.ModuleNotFoundException;
import com.interpreter.shared.libs.LibInterface;
import com.interpreter.shared.libs.SerializableFunction;
import com.interpreter.shared.libs.std.StdLib;
import hardtyped.Absyn.Expr;
import hardtyped.Absyn.ListExpr;
import hardtyped.Test;

import java.io.*;
import java.util.*;
import java.util.function.Function;

public class ImportManagerImpl implements ImportManager, Serializable {

    private final Set<String> loadedModules;
    private final Map<String, LibInterface> libs;

    public ImportManagerImpl() {
        this.loadedModules = new HashSet<>();
        this.libs = new HashMap<>();

        libs.put("std", new StdLib());
    }


    @Override
    public Map<String, List<Expr>> loadModuleDefinitions(String name, LineColPair lineColPair) {

        if (!libs.containsKey(name)) {
            throw new ModuleNotFoundException(
                    String.format("Module with name '%s' is not found", name),
                    lineColPair
            );
        }

        LibInterface lib = libs.get(name);
        return processModuleDefinitions(lib, lineColPair);
    }

    @Override
    public void loadModuleRuntime(String name, Environment environment, LineColPair lineColPair) {
        if (loadedModules.contains(name)) {
            throw new ModuleAlreadyLoadedException(
                    String.format("Module '%s' was already loaded before", name),
                    lineColPair);
        }

        Map<String, List<Expr>> libDefinitions = loadModuleDefinitions(name, lineColPair);
        Map<String, SerializableFunction<Environment, Value>> libFunctions = libs.get(name).getFunctions();

        libDefinitions.forEach((identifier, ast) -> {

            Interpreter interpreter = new InterpreterImpl();
            List<Value> interpretedFunc = interpreter.run((ListExpr) ast);

            if (interpretedFunc.size() != 1 || !interpretedFunc.get(0).getType().equals(ValueType.FUNCTION)) {
                throw new IncorrectModuleDefinitionException(
                        String.format("Incorrect definition found inside of module '%s'", name),
                        interpretedFunc.get(0).getLineColPair()
                );
            }

            FunctionValue funcValue = (FunctionValue) interpretedFunc.get(0).getValue();
            Value functionLibraryValue = Value.ofLibraryFunction(new FunctionLibraryValue(
                    funcValue.getParameters(),
                    libFunctions.get(identifier),
                    funcValue.getCapturedContext()
            ), LineColPair.of(0, 0));

            environment.declareVariableAndAssignValue(identifier, functionLibraryValue);
        });

        loadedModules.add(name);
    }



    private Map<String, List<Expr>> processModuleDefinitions(LibInterface module, LineColPair lineColPair) {
        Map<String, String> definitions = module.getDefinitions();

        Map<String, List<Expr>> result = new HashMap<>();

        // For legacy bnf to use default impl
        InputStream defaultIn = System.in;
        PrintStream defaultOut = System.out;
        definitions.forEach((name, definition) -> {
            ByteArrayInputStream defInput = new ByteArrayInputStream(definition.getBytes());
            ByteArrayOutputStream defOutput = new ByteArrayOutputStream();
            System.setIn(defInput);
            System.setOut(new PrintStream(defOutput));
            Test t = new Test(new String[0]);
            try {
                ListExpr ast = t.parse();

                result.put(name, ast);
            } catch (Exception e) {
                throw new IncorrectModuleDefinitionException(
                        String.format("Module '%s' could not be loaded", name),
                        lineColPair
                );
            }
        });

        System.setIn(defaultIn);
        System.setOut(defaultOut);

        return result;
    }
}
