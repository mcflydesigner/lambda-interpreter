package com.interpreter.shared.exceptions;

public class IncorrectFunctionArgumentException extends BaseInterpreterException {

    public IncorrectFunctionArgumentException(String message, LineColPair lineColPair) {
        super(message, lineColPair);
    }

}
