package com.interpreter.exception;

public class DeclarationErrorException extends BaseInterpreterException {

    public DeclarationErrorException(String message, LineColPair lineColPair) {
        super(message, lineColPair);
    }
}
