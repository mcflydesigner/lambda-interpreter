package com.interpreter.runtime.env.value;

import com.interpreter.runtime.env.Environment;

import java.io.Serializable;
import java.util.Map;
import java.util.function.Function;

public class FunctionLibraryValue implements Serializable {

    private final Map<String, FunctionParameter> parameters;
    private final Function<Environment, Value> libFunc;
    private final Environment capturedContext;

    public FunctionLibraryValue(Map<String, FunctionParameter> parameters,
                                Function<Environment, Value> libFunc,
                                Environment capturedContext) {
        this.parameters = parameters;
        this.libFunc = libFunc;
        this.capturedContext = capturedContext;
    }

    public Map<String, FunctionParameter> getParameters() {
        return parameters;
    }

    public Function<Environment, Value> getLibFunc() {
        return libFunc;
    }

    public Environment getCapturedContext() {
        return capturedContext;
    }

    @Override
    public String toString() {
        return "libraryFunction";
    }
}
