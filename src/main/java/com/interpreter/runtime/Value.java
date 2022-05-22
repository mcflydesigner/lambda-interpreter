package com.interpreter.runtime;

public class Value {

    private final ValueType type;
    private final Object value;

    public Value(ValueType type, Object value) {
        this.type = type;
        this.value = value;
    }

    public static Value ofInt(Integer value) {
        return new Value(ValueType.INT, value);
    }

    public static Value ofReal(Double value) {
        return new Value(ValueType.REAL, value);
    }

    public static Value ofString(String string) {
        return new Value(ValueType.STRING, string);
    }

    public static Value ofFunction(FunctionValue functionValue) {
        return new Value(ValueType.FUNCTION, functionValue);
    }

    public ValueType getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
