package com.interpreter.runtime.env.value;

import com.interpreter.runtime.env.Environment;
import hardtyped.Absyn.Expr;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class FunctionValue implements Serializable {

    private final Map<String, FunctionParameter> parameters;
    private final List<Expr> body;
    private final Environment capturedContext;

    public FunctionValue(Map<String, FunctionParameter> parameters,
                         List<Expr> body,
                         Environment capturedContext) {
        this.parameters = parameters;
        this.body = body;
        this.capturedContext = capturedContext;
    }

    public Map<String, FunctionParameter> getParameters() {
        return parameters;
    }

    public List<Expr> getBody() {
        return body;
    }

    public Environment getCapturedContext() {
        return capturedContext;
    }

    @Override
    public String toString() {
        return "func";
    }
}
