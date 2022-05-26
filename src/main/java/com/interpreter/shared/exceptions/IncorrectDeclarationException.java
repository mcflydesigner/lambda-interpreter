package com.interpreter.shared.exceptions;

public class IncorrectDeclarationException extends BaseInterpreterException {

    public IncorrectDeclarationException(String message, LineColPair lineColPair) {
        super(message, lineColPair);
    }

}
