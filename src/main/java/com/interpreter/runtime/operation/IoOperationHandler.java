package com.interpreter.runtime.operation;

import com.interpreter.runtime.Value;

import java.util.Arrays;

public class IoOperationHandler {

    public static void handlePrint(Value... values) {
        StringBuilder out = new StringBuilder();
        Arrays.stream(values).forEach(out::append);
        System.out.println(out);
    }
}
