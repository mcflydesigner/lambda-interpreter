package com.interpreter.shared.exceptions;

public class DeclarationErrorException extends BaseInterpreterException {

    public DeclarationErrorException(String message, LineColPair lineColPair) {
        super(message, lineColPair);
    }
}
