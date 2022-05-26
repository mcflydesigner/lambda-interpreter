package com.interpreter.shared.exceptions;

public class IllegalArgumentsOperationException extends BaseInterpreterException {

    public IllegalArgumentsOperationException(String message, LineColPair lineColPair) {
        super(message, lineColPair);
    }
}
