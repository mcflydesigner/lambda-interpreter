package com.interpreter.shared.exceptions;

public class IncorrectModuleDefinitionException extends BaseInterpreterException {

    public IncorrectModuleDefinitionException(String message, LineColPair lineColPair) {
        super(message, lineColPair);
    }
}
