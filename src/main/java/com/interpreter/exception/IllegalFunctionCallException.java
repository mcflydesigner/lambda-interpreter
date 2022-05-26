package com.interpreter.exception;

public class IllegalFunctionCallException extends BaseInterpreterException {

    public IllegalFunctionCallException(String message, LineColPair lineColPair) {
        super(message, lineColPair);
    }
}
