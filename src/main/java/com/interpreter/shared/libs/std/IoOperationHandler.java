package com.interpreter.shared.libs.std;

import com.interpreter.runtime.env.value.Value;

import java.io.Serializable;
import java.util.Scanner;

public class IoOperationHandler  {

    public final static Scanner scanner = new Scanner(System.in);

    public static int readInt() {
        return scanner.nextInt();
    }

    public static double readReal() {
        return scanner.nextDouble();
    }

    public static String readString() {
        return scanner.nextLine();
    }

    public static Boolean readBool() {
        return scanner.nextBoolean();
    }

    public static void handlePrint(Value value) {
        System.out.println(value);
    }
}
