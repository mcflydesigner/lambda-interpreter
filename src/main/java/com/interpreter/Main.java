package com.interpreter;

import com.interpreter.runtime.Interpreter;
import com.interpreter.runtime.InterpreterImpl;
import com.interpreter.runtime.imports.ImportManager;
import com.interpreter.runtime.imports.ImportManagerImpl;
import hardtyped.Absyn.ListExpr;
import hardtyped.Test;

public class Main {

    public static final ImportManager importManager = new ImportManagerImpl();

    public static void main(String args[]) {
        try  {
            Test t = new Test(args);
            ListExpr ast = t.parse();

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
