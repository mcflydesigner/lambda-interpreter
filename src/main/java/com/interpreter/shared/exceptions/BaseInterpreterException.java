package com.interpreter.shared.exceptions;

public class BaseInterpreterException extends RuntimeException {

    public BaseInterpreterException(String message, LineColPair lineColPair) {
        super(String.format("%s(%d:%d)", message, getLineNum(lineColPair), getColNum(lineColPair)));
    }

    private static int getLineNum(LineColPair lineColPair) {
        if (lineColPair != null) {
            return lineColPair.getLineNum();
        }
        return 0;
    }

    private static int getColNum(LineColPair lineColPair) {
        if (lineColPair != null) {
            return lineColPair.getColNum();
        }
        return 0;
    }

}
