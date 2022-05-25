package com.interpreter.runtime.libs.std;

import com.interpreter.runtime.Value;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class IoOperationHandler {

    private final Scanner scanner;

    public IoOperationHandler() {
        scanner = new Scanner(System.in);
    }

    public int readInt() {
        return scanner.nextInt();
    }

    public double readReal() {
        return scanner.nextDouble();
    }

    public static void handlePrint(Value value) {
        System.out.println(value);
    }
}
