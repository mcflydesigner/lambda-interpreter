package com.interpreter;

import com.interpreter.runtime.Interpreter;
import com.interpreter.runtime.InterpreterImpl;
import hardtyped.Absyn.ListExpr;
import hardtyped.Test;

public class Main {

    public static void main(String args[]) {
        try  {
            Test t = new Test(args);
            ListExpr ast = t.parse();

            Interpreter interpreter = new InterpreterImpl(System.out);
            interpreter.run(ast);
        } catch (Exception e) {
            System.out.println("Exception occurred:");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
