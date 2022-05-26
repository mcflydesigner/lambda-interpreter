package com.interpreter;

import com.interpreter.runtime.Interpreter;
import com.interpreter.runtime.InterpreterImpl;
import com.interpreter.runtime.imports.ImportManager;
import com.interpreter.runtime.imports.ImportManagerImpl;
import com.interpreter.typechecker.TypeChecker;
import com.interpreter.typechecker.TypeCheckerImpl;
import hardtyped.Absyn.ListExpr;
import hardtyped.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static final ImportManager importManager = new ImportManagerImpl();

    public static void main(String[] args) {
        try  {
            List<String> argss = Arrays.asList(args);
            boolean printTypes = argss.contains("--print-types");
            Optional<String> fn;
            if (argss.get(argss.size()-1).startsWith("--")) {
                fn = Optional.empty();
            } else {
                fn = Optional.of(argss.get(argss.size()-1));
            }
            Test t = new Test(fn);
            ListExpr ast = t.parse();

            TypeChecker typeChecker = new TypeCheckerImpl();
            typeChecker.setPrintTypes(printTypes);
            typeChecker.typeCheck(ast);

            System.out.println("Program output:");
            Interpreter interpreter = new InterpreterImpl();
            interpreter.run(ast);
        } catch (Exception e) {
            System.out.println("Exception occurred:");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
