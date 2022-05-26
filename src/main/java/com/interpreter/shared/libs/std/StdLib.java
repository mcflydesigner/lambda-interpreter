package com.interpreter.shared.libs.std;

import com.interpreter.runtime.env.Environment;
import com.interpreter.shared.exceptions.IncorrectFunctionArgumentException;
import com.interpreter.shared.exceptions.LineColPair;
import com.interpreter.shared.libs.LibInterface;
import com.interpreter.runtime.env.value.Value;
import com.interpreter.runtime.env.value.ValueType;
import com.interpreter.shared.libs.SerializableFunction;

import java.util.*;
import java.util.stream.Collectors;

public class StdLib implements LibInterface {

    public Value print(Environment environment) {

        Map<String, Value> values = environment.getLocalScopeDefinitons();
        verifyArgumentListSize(1, values.keySet().stream().toList());

        Value value = values.values().stream().toList().get(0);
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
        return Value.ofInt(IoOperationHandler.readInt(), value.getLineColPair());
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
        return Value.ofReal((Double) value.getValue(), value.getLineColPair());
    }

    public Value intToString(Environment environment) {

        Value value = verifyArgumentsAndGetLast(environment, 1);
        verifyAllowedTypes("intToString", Set.of(ValueType.INT), value);
        return Value.ofString((String) value.getValue(), value.getLineColPair());
    }

    public Value realToInt(Environment environment) {

        Value value = verifyArgumentsAndGetLast(environment, 1);
        verifyAllowedTypes("realToInt", Set.of(ValueType.REAL), value);
        return Value.ofInt((Integer) value.getValue(), value.getLineColPair());
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




    private Value verifyArgumentsAndGetLast(Environment environment, int size) {

        Map<String, Value> values = environment.getLocalScopeDefinitons();
        verifyArgumentListSize(size, values.keySet().stream().toList());

        return values.values().stream().toList().get(size - 1);
    }

    private void verifyArgumentListSize(int expectedSize, List<String> values) {
        if (expectedSize != values.size()) {
            throw new IncorrectFunctionArgumentException(String.format(
                    "The functions expected %s arguments, but got %s",
                    expectedSize,
                    values.size()),
                    LineColPair.of(0, 0)
            );
        }
    }

    private void verifyAllowedTypes(String funName, Set<ValueType> allowedTypes, Value...values) {

        List<Value> wrongValues = Arrays.stream(values).filter(e -> !allowedTypes.contains(e.getType())).toList();
        if (wrongValues.size() > 0) {
            Value firstWrong = wrongValues.get(0);
            throw new IncorrectFunctionArgumentException(
                    String.format("Incorrect invocation of function '%s': expected type(s) %s, but got %s",
                            funName,
                            allowedTypes.stream().map(Enum::toString).collect(Collectors.joining(",")),
                            firstWrong.getType()),
                    firstWrong.getLineColPair()
            );
        }
    }

    @Override
    public Map<String, SerializableFunction<Environment, Value>> getFunctions() {
        Map<String, SerializableFunction<Environment, Value>> map = new HashMap<>();
        map.put("printS", this::print);
        map.put("readIntS", this::readInt);
        map.put("readRealS", this::readReal);
        map.put("readBoolS", this::readBool);
        map.put("readStringS", this::readString);
        map.put("intToRealS", this::intToReal);
        map.put("intToStringS", this::intToString);
        map.put("realToIntS", this::realToInt);
        map.put("realToStringS", this::realToString);
        map.put("stringToRealS", this::stringToReal);
        map.put("stringToIntS", this::stringToInt);

        return map;
    }

    @Override
    public Map<String, String> getDefinitions() {
        Map<String, String> map = new HashMap<>();
        map.put("printS", StdLibDefinitions.PRINT_DEFINITION);
        map.put("readIntS", StdLibDefinitions.READ_INT);
        map.put("readRealS", StdLibDefinitions.READ_REAL);
        map.put("readBoolS", StdLibDefinitions.READ_BOOL);
        map.put("readStringS", StdLibDefinitions.READ_STRING);

        return map;
    }
}
