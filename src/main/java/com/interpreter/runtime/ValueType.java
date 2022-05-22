package com.interpreter.runtime;

import hardtyped.Absyn.*;

public enum ValueType {
    INT,
    REAL,
    BOOL,
    STRING,
    UNIT,
    FUNCTION;

    public static ValueType fromBnfType(Type type) {
        if (type instanceof IntType) {
            return ValueType.INT;
        } else if (type instanceof RealType) {
            return ValueType.REAL;
        } else if (type instanceof StringType) {
            return ValueType.STRING;
        } else if (type instanceof BoolType) {
            return ValueType.BOOL;
        } else if (type instanceof UnitType) {
            return ValueType.UNIT;
        }

        throw new IllegalStateException(String.format(
                "Unknown bnf type %s passed that cannot be translated to ValueType",
                type.getClass()
        ));
    }
}