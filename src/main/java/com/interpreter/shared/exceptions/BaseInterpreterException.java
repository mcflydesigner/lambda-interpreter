package com.interpreter.shared.exceptions;

public class BaseInterpreterException extends RuntimeException {

    public BaseInterpreterException(String message, LineColPair lineColPair) {
        super(String.format("%s(%d:%d)", message, lineColPair.getLineNum(), lineColPair.getColNum()));
    }

}
