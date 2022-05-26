package com.interpreter.exception;

public class IdentifierNotFoundException extends BaseInterpreterException {

    public IdentifierNotFoundException(String message, LineColPair lineColPair) {
        super(message, lineColPair);
    }
}
