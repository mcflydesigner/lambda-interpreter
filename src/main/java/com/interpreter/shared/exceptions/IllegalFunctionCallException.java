package com.interpreter.shared.exceptions;

public class IllegalFunctionCallException extends BaseInterpreterException {

    public IllegalFunctionCallException(String message, LineColPair lineColPair) {
        super(message, lineColPair);
    }
}
