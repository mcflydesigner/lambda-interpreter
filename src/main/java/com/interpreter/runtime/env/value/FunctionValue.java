package com.interpreter.runtime.env.value;

import com.interpreter.runtime.env.Environment;
import com.interpreter.runtime.env.value.Value;
import com.interpreter.runtime.env.value.ValueType;
import hardtyped.Absyn.Expr;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FunctionValue implements Serializable {

    private final LinkedHashMap<String, FunctionParameter> parameters;
    private final List<Expr> body;
    private final Environment capturedContext;

    public FunctionValue(LinkedHashMap<String, FunctionParameter> parameters, List<Expr> body, Environment capturedContext) {
        this.parameters = parameters;
        this.body = body;
        this.capturedContext = capturedContext;
    }

    public static class FunctionParameter implements Serializable {

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

    public List<Expr> getBody() {
        return body;
    }

    public Environment getCapturedContext() {
        return capturedContext;
    }
}
