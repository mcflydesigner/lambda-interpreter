package com.interpreter.shared.libs.std;

import com.interpreter.runtime.env.Environment;
import com.interpreter.shared.exceptions.IncorrectFunctionArgumentException;
import com.interpreter.shared.exceptions.LineColPair;
import com.interpreter.shared.libs.LibInterface;
import com.interpreter.runtime.env.value.Value;
import com.interpreter.runtime.env.value.ValueType;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StdLib implements LibInterface {

    private final IoOperationHandler ioHandler = new IoOperationHandler();

    public Value print(Environment environment) {

        Map<String, Value> values = environment.getLocalScopeDefinitons();
        verifyArgumentListSize(1, values.keySet().stream().toList());

        Value value = values.values().stream().toList().get(0);
        IoOperationHandler.handlePrint(value);
        return Value.ofUnit(LineColPair.of(0, 0));
    }

//    public Value readInt(Value value) {
//
//        verifyAllowedTypes("readInt", Set.of(ValueType.UNIT), value);
//        return Value.ofInt(ioHandler.readInt(), value.getLineColPair());
//    }
//
//    public Value readReal(Value value) {
//
//        verifyAllowedTypes("readReal", Set.of(ValueType.UNIT), value);
//        return Value.ofReal(ioHandler.readReal(), value.getLineColPair());
//    }

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

    private void verifyAllowedTypes(String funName, Set<ValueType> allowedTypes, Set<Value> values) {

        List<Value> wrongValues = values.stream().filter(e -> !allowedTypes.contains(e.getType())).toList();
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
    public Map<String, Function<Environment, Value>> getFunctions() {
        Map<String, Function<Environment, Value>> map = new HashMap<>();
        map.put("print1", this::print);

        return map;
    }

    @Override
    public Map<String, String> getDefinitions() {
        Map<String, String> map = new HashMap<>();
        map.put("print1", StdLibDefinitions.PRINT_DEFINITION);

        return map;
    }
}
