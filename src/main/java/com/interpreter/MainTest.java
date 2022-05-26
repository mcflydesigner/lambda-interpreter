package com.interpreter;

import com.interpreter.runtime.Interpreter;
import com.interpreter.runtime.InterpreterImpl;
import com.interpreter.runtime.imports.ImportManager;
import com.interpreter.runtime.imports.ImportManagerImpl;
import hardtyped.Absyn.ListExpr;
import hardtyped.Test;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/*
    * For tests only.
*/
public class MainTest {

    public static final ImportManager importManager = new ImportManagerImpl();

    public static void test(InputStream inputStream, OutputStream errorStream, OutputStream outputStream) throws Exception {

        System.setIn(inputStream);
        PrintStream printErrorStream = new PrintStream(errorStream);
        System.setErr(printErrorStream);
        PrintStream printOutputStream = new PrintStream(outputStream);

        try {
            Test t = new Test(new String[0]);
            ListExpr ast = t.parse();

            // Ignore everything above produced by basic BNF
            System.setOut(printOutputStream);
            Interpreter interpreter = new InterpreterImpl();
            interpreter.run(ast);
        } catch (Exception e) {
            // Redirect error to stderr
            System.setOut(printErrorStream);
            System.out.println("Exception occurred:");
            e.printStackTrace();
        } finally {
            printOutputStream.close();
            printErrorStream.close();
        }
    }
}
