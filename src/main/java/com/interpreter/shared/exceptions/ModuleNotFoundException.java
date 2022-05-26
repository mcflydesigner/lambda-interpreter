package com.interpreter.shared.exceptions;

public class ModuleNotFoundException extends BaseInterpreterException {

    public ModuleNotFoundException(String message, LineColPair lineColPair) {
        super(message, lineColPair);
    }
}
