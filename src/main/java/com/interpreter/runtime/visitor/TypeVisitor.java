package com.interpreter.runtime.visitor;

import com.interpreter.runtime.env.Environment;
import com.interpreter.runtime.env.value.Value;
import com.interpreter.runtime.env.value.ValueType;
import hardtyped.Absyn.*;

public class TypeVisitor implements Type.Visitor<ValueType, Environment> {

    @Override
    public ValueType visit(UserType p, Environment arg) {
        Value value = arg.getVariableValue(p.ident_);

        if (!value.getType().equals(ValueType.USER_ALIAS)) {
            throw new IllegalStateException(String.format(
                    "Type alias has wrong value: expected %s, but got %s",
                    ValueType.USER_ALIAS,
                    value.getType()
            ));
        }

        return (ValueType) value.getValue();
    }

    @Override
    public ValueType visit(IntType p, Environment arg) {
        return ValueType.INT;
    }

    @Override
    public ValueType visit(RealType p, Environment arg) {
        return ValueType.REAL;
    }

    @Override
    public ValueType visit(BoolType p, Environment arg) {
        return ValueType.BOOL;
    }

    @Override
    public ValueType visit(StringType p, Environment arg) {
        return ValueType.STRING;
    }

    @Override
    public ValueType visit(UnitType p, Environment arg) {
        return ValueType.UNIT;
    }

    @Override
    public ValueType visit(AnyType p, Environment arg) {
        return ValueType.ANY;
    }

    @Override
    public ValueType visit(FunctionType p, Environment arg) {
        return ValueType.FUNCTION;
    }

    @Override
    public ValueType visit(RecordType p, Environment arg) {
        return ValueType.RECORD;
    }
}
