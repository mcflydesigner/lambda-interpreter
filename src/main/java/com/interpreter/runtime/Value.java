package com.interpreter.runtime;

import hardtyped.Absyn.Type;

import java.io.Serializable;

public class Value implements Serializable {

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

    public static Value ofBool(Boolean value) { return new Value(ValueType.BOOL, value); }

    public static Value ofUnit() { return new Value(ValueType.UNIT, null); }

    public static Value ofUserTypeAlias(ValueType valueType) { return new Value(ValueType.USER_ALIAS, valueType); }

    public ValueType getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return switch (type) {
            case UNIT -> "unit";
            default -> value.toString();
        };
    }
}
