package com.interpreter;

import com.interpreter.runtime.Interpreter;
import com.interpreter.runtime.InterpreterImpl;
import hardtyped.Absyn.ListExpr;
import hardtyped.Test;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/*
    * For tests only.
*/
public class MainTest {

    public static void test(InputStream inputStream, OutputStream outputStream) {

        PrintStream printOutputStream = new PrintStream(outputStream);
        System.setIn(inputStream);

        try {
            Test t = new Test(new String[0]);
            ListExpr ast = t.parse();

            Interpreter interpreter = new InterpreterImpl(printOutputStream);
            interpreter.run(ast);
        } catch (Exception e) {
            System.out.println("Exception occurred:");
            e.printStackTrace();
            System.exit(1);
        } finally {
            printOutputStream.close();
        }
    }
}
