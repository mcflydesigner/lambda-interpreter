package com.interpreter.runtime.env.value;

import com.interpreter.runtime.env.Environment;

import java.util.LinkedHashMap;
import java.util.function.Function;

public class FunctionLibraryValue {

    private final LinkedHashMap<String, FunctionValue.FunctionParameter> parameters;
    private final Function<Environment, Value> libFunc;
    private final Environment capturedContext;

    public FunctionLibraryValue(LinkedHashMap<String, FunctionValue.FunctionParameter> parameters,
                                Function<Environment, Value> libFunc,
                                Environment capturedContext) {
        this.parameters = parameters;
        this.libFunc = libFunc;
        this.capturedContext = capturedContext;
    }

}
