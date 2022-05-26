package com.interpreter.exception;

public class IllegalArgumentsOperationException extends BaseInterpreterException {

    public IllegalArgumentsOperationException(String message, LineColPair lineColPair) {
        super(message, lineColPair);
    }
}
