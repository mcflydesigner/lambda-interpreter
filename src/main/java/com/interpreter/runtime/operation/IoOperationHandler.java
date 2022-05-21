package com.interpreter.runtime.operation;

import com.interpreter.runtime.Value;

import java.io.PrintStream;
import java.util.Arrays;

public class IoOperationHandler {

    private final PrintStream printStream;

    public IoOperationHandler(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void handlePrint(Value... values) {
        StringBuilder out = new StringBuilder();
        Arrays.stream(values).forEach(out::append);
        printStream.println(out);
    }
}
