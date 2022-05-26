package com.interpreter.shared.exceptions;

public class ModuleAlreadyLoadedException extends BaseInterpreterException {

    public ModuleAlreadyLoadedException(String message, LineColPair lineColPair) {
        super(message, lineColPair);
    }
}
