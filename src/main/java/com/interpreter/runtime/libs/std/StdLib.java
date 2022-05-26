package com.interpreter.runtime.libs.std;

import com.interpreter.exception.IncorrectFunctionArgumentException;
import com.interpreter.runtime.env.value.Value;
import com.interpreter.runtime.env.value.ValueType;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StdLib {

    private final IoOperationHandler ioHandler = new IoOperationHandler();

    public Value print(Value value) {

        verifyAllowedTypes("print", Set.of(ValueType.UNIT), value);
        IoOperationHandler.handlePrint(value);
        return Value.ofUnit(value.getLineColPair());
    }

    public Value readInt(Value value) {

        verifyAllowedTypes("readInt", Set.of(ValueType.UNIT), value);
        return Value.ofInt(ioHandler.readInt(), value.getLineColPair());
    }

    public Value readReal(Value value) {

        verifyAllowedTypes("readReal", Set.of(ValueType.UNIT), value);
        return Value.ofReal(ioHandler.readReal(), value.getLineColPair());
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

}
