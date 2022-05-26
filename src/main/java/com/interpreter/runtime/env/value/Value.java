package com.interpreter.runtime.env.value;

import com.interpreter.exception.LineColPair;
import org.antlr.v4.runtime.misc.Pair;

import java.io.Serializable;
import java.util.List;

public class Value implements Serializable {

    private final ValueType type;
    private final Object value;
    private final LineColPair lineColPair;

    public Value(ValueType type, Object value, LineColPair lineColPair) {
        this.type = type;
        this.value = value;
        this.lineColPair = lineColPair;
    }

    public static Value ofInt(Integer value, LineColPair lineColPair) {
        return new Value(ValueType.INT, value, lineColPair);
    }

    public static Value ofReal(Double value, LineColPair lineColPair) {
        return new Value(ValueType.REAL, value, lineColPair);
    }

    public static Value ofString(String string, LineColPair lineColPair) {
        return new Value(ValueType.STRING, string, lineColPair);
    }

    public static Value ofFunction(FunctionValue functionValue, LineColPair lineColPair) {
        return new Value(ValueType.FUNCTION, functionValue, lineColPair);
    }

    public static Value ofBool(Boolean value, LineColPair lineColPair) {
        return new Value(ValueType.BOOL, value, lineColPair);
    }

    public static Value ofUnit(LineColPair lineColPair) {
        return new Value(ValueType.UNIT, null, lineColPair);
    }

    public static Value ofUserTypeAlias(ValueType valueType, LineColPair lineColPair) {
        return new Value(ValueType.USER_ALIAS, valueType, lineColPair);
    }

    public static Value ofRecord(List<Pair<String, Value>> entries, LineColPair lineColPair) {
        return new Value(ValueType.RECORD, new RecordValue(entries), lineColPair);
    }

    public ValueType getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    public LineColPair getLineColPair() {
        return lineColPair;
    }

    @Override
    public String toString() {
        return switch (type) {
            case UNIT -> "unit";
            default -> value.toString();
        };
    }
}
