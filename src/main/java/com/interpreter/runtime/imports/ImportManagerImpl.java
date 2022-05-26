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
import com.interpreter.shared.libs.std.StdLib;
import hardtyped.Absyn.Expr;
import hardtyped.Absyn.ListExpr;
import hardtyped.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.*;

public class ImportManagerImpl implements ImportManager, Serializable {

    private Set<String> loadedModules = new HashSet<>();

    @Override
    public Map<String, List<Expr>> loadModuleDefinitions(String name, LineColPair lineColPair) {
        if (loadedModules.contains(name)) {
            throw new ModuleAlreadyLoadedException(
                    String.format("Module '%s' was already loaded before", name),
                    lineColPair);
        }

        return switch (name) {
            case "std" -> {
                LibInterface std = new StdLib();

                Map<String, List<Expr>> result = processModuleDefinitions(std, lineColPair);
                loadedModules.add(name);
                yield result;
            }

            default -> throw new ModuleNotFoundException(
                    String.format("Module with name '%s' is not found", name),
                    lineColPair
            );
        };
    }

    @Override
    public Map<String, List<Expr>> loadModuleRuntime(String name, Environment environment, LineColPair lineColPair) {
        return null;
    }



    private Map<String, List<Expr>> processModuleDefinitions(LibInterface module, LineColPair lineColPair) {
        Map<String, String> definitions = module.getDefinitions();

        Map<String, List<Expr>> result = new HashMap<>();

        InputStream defaultIn = System.in;
        definitions.forEach((name, definition) -> {
            ByteArrayInputStream defInput = new ByteArrayInputStream(definition.getBytes());
            System.setIn(defInput);
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

        return result;
    }
}
