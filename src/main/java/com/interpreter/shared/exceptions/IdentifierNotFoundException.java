package com.interpreter.shared.exceptions;

public class IdentifierNotFoundException extends BaseInterpreterException {

    public IdentifierNotFoundException(String message, LineColPair lineColPair) {
        super(message, lineColPair);
    }
}
