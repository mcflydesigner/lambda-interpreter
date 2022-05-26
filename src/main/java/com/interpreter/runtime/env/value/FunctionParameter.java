package com.interpreter.runtime.env.value;

import com.interpreter.shared.exceptions.LineColPair;

import java.io.Serializable;

public class FunctionParameter implements Serializable {

    private ValueType type;
    private Object bindValue;
    private LineColPair lineColPair;
    private Boolean isAssigned = false;

    public FunctionParameter(ValueType type) {
        this.type = type;
        this.bindValue = null;
    }

    public FunctionParameter(ValueType type, Object value, LineColPair lineColPair) {
        this.type = type;
        this.bindValue = value;
        this.lineColPair = lineColPair;
    }

    public ValueType getType() {
        return type;
    }

    public Value convertToValue() {
        if (!this.isAssigned) {
            throw new IllegalStateException("Value for function parameter must be set before convertation");
        }

        return new Value(type, bindValue, lineColPair);
    }

    public void setBindValue(Object bindValue) {
        if (this.isAssigned) {
            throw new IllegalStateException("Value for function parameter cannot be reassigned");
        }
        this.bindValue = bindValue;
        this.isAssigned = true;
    }

    public void setConcreteType(ValueType type) {
        if (this.type != ValueType.ANY) {
            throw new IllegalStateException(String.format(
                    "Type %s cannot be changed as it is not %s",
                    this.type,
                    ValueType.ANY
            ));
        }

        this.type = type;
    }

    public boolean isInitialized() {
        return isAssigned;
    }
}
