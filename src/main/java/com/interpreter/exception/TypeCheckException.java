package com.interpreter.exception;

public abstract class TypeCheckException extends RuntimeException {

    public TypeCheckException(String message) {
        super(message);
    }

}
