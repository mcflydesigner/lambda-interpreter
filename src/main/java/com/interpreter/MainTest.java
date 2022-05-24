package com.interpreter;

import com.interpreter.runtime.Interpreter;
import com.interpreter.runtime.InterpreterImpl;
import hardtyped.Absyn.ListExpr;
import hardtyped.Test;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/*
    * For tests only.
*/
public class MainTest {

    public static void test(InputStream inputStream, OutputStream errorStream, OutputStream outputStream) throws Exception {

        System.setIn(inputStream);
        PrintStream printErrorStream = new PrintStream(errorStream);
        System.setErr(printErrorStream);
        PrintStream printOutputStream = new PrintStream(outputStream);
        System.setOut(printOutputStream);

        try {
            Test t = new Test(new String[0]);
            ListExpr ast = t.parse();

            Interpreter interpreter = new InterpreterImpl(printOutputStream);
            interpreter.run(ast);
        } catch (Exception e) {
            System.out.println("Exception occurred:");
            e.printStackTrace();
        } finally {
            printOutputStream.close();
            printErrorStream.close();
        }
    }
}
