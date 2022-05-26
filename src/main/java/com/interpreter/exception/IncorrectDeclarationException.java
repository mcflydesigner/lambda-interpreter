package com.interpreter.exception;

public class IncorrectDeclarationException extends BaseInterpreterException {

    public IncorrectDeclarationException(String message, LineColPair lineColPair) {
        super(message, lineColPair);
    }

}
