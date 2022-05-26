package com.interpreter.shared.libs;

import com.interpreter.runtime.env.Environment;
import com.interpreter.runtime.env.value.Value;
import com.interpreter.runtime.env.value.ValueType;
import com.interpreter.shared.exceptions.IncorrectFunctionArgumentException;
import com.interpreter.shared.exceptions.LineColPair;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LibUtils {

    public static List<Value> verifyArgumentsAndGetList(Environment environment, int size) {

        Map<String, Value> values = environment.getLocalScopeDefinitons();
        verifyArgumentListSize(size, values.keySet().stream().toList());

        return values.values().stream().toList();
    }


    public static Value verifyArgumentsAndGetLast(Environment environment, int size) {

        Map<String, Value> values = environment.getLocalScopeDefinitons();
        verifyArgumentListSize(size, values.keySet().stream().toList());

        return values.values().stream().toList().get(size - 1);
    }

    public static void verifyArgumentListSize(int expectedSize, List<String> values) {
        if (expectedSize != values.size()) {
            throw new IncorrectFunctionArgumentException(String.format(
                    "The functions expected %s arguments, but got %s",
                    expectedSize,
                    values.size()),
                    LineColPair.of(0, 0)
            );
        }
    }

    public static void verifyAllowedTypes(String funName, Set<ValueType> allowedTypes, List<Value> values) {
        Value[] valuesArray = new Value[values.size()];
        verifyAllowedTypes(funName, allowedTypes, values.toArray(valuesArray));
    }

    public static void verifyAllowedTypes(String funName, Set<ValueType> allowedTypes, Value...values) {

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
