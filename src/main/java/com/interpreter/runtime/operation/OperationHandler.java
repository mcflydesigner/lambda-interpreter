package com.interpreter.runtime.operation;

import com.interpreter.exception.IllegalArgumentsOperationException;
import com.interpreter.runtime.Value;
import com.interpreter.runtime.ValueType;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class OperationHandler {

    public static Value handleBinaryOperation(BinaryOperationType operationType, Value firstOp, Value secondOp) {
        return switch (operationType) {
            case ADDITION -> handleBinaryAddition(firstOp, secondOp);
            case SUBTRACTION -> handleBinarySubtraction(firstOp, secondOp);
            case MULTIPLICATION -> handleBinaryMultiplication(firstOp, secondOp);
            case DIVISION -> handleBinaryDivision(firstOp, secondOp);
        };
    }

    private static Value handleBinaryAddition(Value firstOp, Value secondOp) {

        Set<ValueType> allowedValueTypes = Set.of(ValueType.INT, ValueType.REAL);
        assertOperandsType("addition", allowedValueTypes, firstOp, secondOp);

        if (firstOp.getType().equals(ValueType.INT) && secondOp.getType().equals(ValueType.INT)) {
            return Value.ofInt((Integer) firstOp.getValue() + (Integer) secondOp.getValue());
        }

        return Value.ofReal((Double) firstOp.getValue() + (Double) secondOp.getValue());
    }

    private static Value handleBinarySubtraction(Value firstOp, Value secondOp) {

        Set<ValueType> allowedValueTypes = Set.of(ValueType.INT, ValueType.REAL);
        assertOperandsType("subtraction", allowedValueTypes, firstOp, secondOp);

        if (firstOp.getType().equals(ValueType.INT) && secondOp.getType().equals(ValueType.INT)) {
            return Value.ofInt((Integer) firstOp.getValue() - (Integer) secondOp.getValue());
        }

        return Value.ofReal((Double) firstOp.getValue() - (Double) secondOp.getValue());
    }

    private static Value handleBinaryMultiplication(Value firstOp, Value secondOp) {

        Set<ValueType> allowedValueTypes = Set.of(ValueType.INT, ValueType.REAL);
        assertOperandsType("multiplication", allowedValueTypes, firstOp, secondOp);

        if (firstOp.getType().equals(ValueType.INT) && secondOp.getType().equals(ValueType.INT)) {
            return Value.ofInt((Integer) firstOp.getValue() * (Integer) secondOp.getValue());
        }

        return Value.ofReal((Double) firstOp.getValue() * (Double) secondOp.getValue());
    }

    private static Value handleBinaryDivision(Value firstOp, Value secondOp) {

        Set<ValueType> allowedValueTypes = Set.of(ValueType.INT, ValueType.REAL);
        assertOperandsType("division", allowedValueTypes, firstOp, secondOp);

        if (firstOp.getType().equals(ValueType.INT) && secondOp.getType().equals(ValueType.INT)) {
            return Value.ofInt((Integer) firstOp.getValue() / (Integer) secondOp.getValue());
        }

        return Value.ofReal((Double) firstOp.getValue() / (Double) secondOp.getValue());
    }

    private static void assertOperandsType(String operation, Set<ValueType> allowedValueTypes, Value... values) {

        Arrays.stream(values).forEach(v -> {
            if (!allowedValueTypes.contains(v.getType())) {
                throw new IllegalArgumentsOperationException(String.format(
                        "Operation %s is not supported for operand type %s",
                        operation,
                        v.getType()
                ));
            }
        });

        // All operands must have the same type
        Set<ValueType> actualTypes = Arrays.stream(values).map(Value::getType).collect(Collectors.toSet());
        if (actualTypes.size() != 1) {
            throw new IllegalArgumentsOperationException(String.format(
                    "Operands error for operation %s because of different types %s. Explicit cast is required.",
                    operation,
                    actualTypes.stream().map(Enum::toString).collect(Collectors.joining(", "))
            ));
        }
    }

}
