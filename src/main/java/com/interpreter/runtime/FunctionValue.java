package com.interpreter.runtime;

import hardtyped.Absyn.Expr;
import hardtyped.Absyn.ListExpr;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FunctionValue {

    private final LinkedHashMap<String, FunctionParameter> parameters;
    private final ListExpr body;

    public FunctionValue(LinkedHashMap<String, FunctionParameter> parameters, ListExpr body) {
        this.parameters = parameters;
        this.body = body;
    }

    public static class FunctionParameter {

        private final ValueType type;
        private Object bindValue;

        public FunctionParameter(ValueType type) {
            this.type = type;
            this.bindValue = null;
        }

        public FunctionParameter(ValueType type, Object value) {
            this.type = type;
            this.bindValue = value;
        }

        public ValueType getType() {
            return type;
        }

        public Value convertToValue() {
            if (this.bindValue == null) {
                throw new IllegalStateException("Value for function parameter must be non-null before convertation");
            }

            return new Value(type, bindValue);
        }

        public void setBindValue(Object bindValue) {
            if (this.bindValue != null) {
                throw new IllegalStateException("Value for function parameter cannot be reassigned");
            }
            this.bindValue = bindValue;
        }

        public boolean isInitialized() {
            return bindValue != null;
        }
    }

    public Map<String, FunctionParameter> getParameters() {
        return parameters;
    }

    public ListExpr getBody() {
        return body;
    }
}
