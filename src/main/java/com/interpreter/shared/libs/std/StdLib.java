package com.interpreter.shared.libs.std;

import com.interpreter.runtime.env.Environment;
import com.interpreter.shared.exceptions.LineColPair;
import com.interpreter.shared.libs.LibInterface;
import com.interpreter.runtime.env.value.Value;
import com.interpreter.runtime.env.value.ValueType;
import com.interpreter.shared.libs.SerializableFunction;

import java.util.*;

import static com.interpreter.shared.libs.LibUtils.*;

public class StdLib implements LibInterface {

    public Value print(Environment environment) {

        Value value = verifyArgumentsAndGetLast(environment, 1);
        IoOperationHandler.handlePrint(value);
        return Value.ofUnit(LineColPair.of(0, 0));
    }

    public Value readInt(Environment environment) {

        Value value = verifyArgumentsAndGetLast(environment, 1);
        verifyAllowedTypes("readInt", Set.of(ValueType.UNIT), value);
        return Value.ofInt(IoOperationHandler.readInt(), value.getLineColPair());
    }

    public Value readReal(Environment environment) {

        Value value = verifyArgumentsAndGetLast(environment, 1);
        verifyAllowedTypes("readReal", Set.of(ValueType.UNIT), value);
        return Value.ofReal(IoOperationHandler.readReal(), value.getLineColPair());
    }

    public Value readString(Environment environment) {

        Value value = verifyArgumentsAndGetLast(environment, 1);
        verifyAllowedTypes("readString", Set.of(ValueType.UNIT), value);
        return Value.ofString(IoOperationHandler.readString(), value.getLineColPair());
    }

    public Value readBool(Environment environment) {

        Value value = verifyArgumentsAndGetLast(environment, 1);
        verifyAllowedTypes("readBool", Set.of(ValueType.UNIT), value);
        return Value.ofBool(IoOperationHandler.readBool(), value.getLineColPair());
    }

    public Value intToReal(Environment environment) {

        Value value = verifyArgumentsAndGetLast(environment, 1);
        verifyAllowedTypes("intToReal", Set.of(ValueType.INT), value);
        return Value.ofReal(Double.valueOf((Integer) value.getValue()), value.getLineColPair());
    }

    public Value intToString(Environment environment) {

        Value value = verifyArgumentsAndGetLast(environment, 1);
        verifyAllowedTypes("intToString", Set.of(ValueType.INT), value);
        return Value.ofString(value.getValue().toString(), value.getLineColPair());
    }

    public Value realToInt(Environment environment) {

        Value value = verifyArgumentsAndGetLast(environment, 1);
        verifyAllowedTypes("realToInt", Set.of(ValueType.REAL), value);
        return Value.ofInt(((Double) value.getValue()).intValue(), value.getLineColPair());
    }

    public Value realToString(Environment environment) {

        Value value = verifyArgumentsAndGetLast(environment, 1);
        verifyAllowedTypes("realToString", Set.of(ValueType.REAL), value);
        return Value.ofString(value.getValue().toString(), value.getLineColPair());
    }

    public Value stringToReal(Environment environment) {

        Value value = verifyArgumentsAndGetLast(environment, 1);
        verifyAllowedTypes("stringToReal", Set.of(ValueType.STRING), value);
        return Value.ofReal(Double.parseDouble((String) value.getValue()), value.getLineColPair());
    }

    public Value stringToInt(Environment environment) {

        Value value = verifyArgumentsAndGetLast(environment, 1);
        verifyAllowedTypes("stringToInt", Set.of(ValueType.STRING), value);
        return Value.ofInt(Integer.parseInt((String) value.getValue()), value.getLineColPair());
    }

    @Override
    public Map<String, SerializableFunction<Environment, Value>> getFunctions() {
        Map<String, SerializableFunction<Environment, Value>> functions = new HashMap<>();
        functions.put("print", this::print);
        functions.put("readInt", this::readInt);
        functions.put("readReal", this::readReal);
        functions.put("readBool", this::readBool);
        functions.put("readString", this::readString);
        functions.put("intToReal", this::intToReal);
        functions.put("intToString", this::intToString);
        functions.put("realToInt", this::realToInt);
        functions.put("realToString", this::realToString);
        functions.put("stringToReal", this::stringToReal);
        functions.put("stringToInt", this::stringToInt);

        return functions;
    }

    @Override
    public Map<String, String> getDefinitions() {
        Map<String, String> definitions = new HashMap<>();
        definitions.put("print", StdLibDefinitions.PRINT_DEFINITION);
        definitions.put("readInt", StdLibDefinitions.READ_INT);
        definitions.put("readReal", StdLibDefinitions.READ_REAL);
        definitions.put("readBool", StdLibDefinitions.READ_BOOL);
        definitions.put("readString", StdLibDefinitions.READ_STRING);
        definitions.put("intToReal", StdLibDefinitions.INT_TO_REAL);
        definitions.put("intToString", StdLibDefinitions.INT_TO_STRING);
        definitions.put("realToInt", StdLibDefinitions.REAL_TO_INT);
        definitions.put("realToString", StdLibDefinitions.REAL_TO_STRING);
        definitions.put("stringToReal", StdLibDefinitions.STRING_TO_REAL);
        definitions.put("stringToInt", StdLibDefinitions.STRING_TO_INT);

        return definitions;
    }
}
