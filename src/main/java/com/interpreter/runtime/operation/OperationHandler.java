package com.interpreter.runtime.operation;

import com.interpreter.shared.exceptions.IllegalArgumentsOperationException;
import com.interpreter.runtime.env.value.Value;
import com.interpreter.runtime.env.value.ValueType;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class OperationHandler {

    public static Value handleUnaryOperation(UnaryOperationType operationType, Value operand) {
        return switch (operationType) {
            case PLUS -> handleUnaryPlus(operand);
            case MINUS -> handleUnaryMinus(operand);
            case NOT -> handleUnaryNot(operand);
        };
    }

    private static Value handleUnaryNot(Value operand) {
        Set<ValueType> allowedValueTypes = Set.of(ValueType.BOOL);
        assertOperandsType("not", allowedValueTypes, operand);

        return Value.ofBool(!(Boolean) operand.getValue(), operand.getLineColPair());
    }

    private static Value handleUnaryMinus(Value operand) {
        Set<ValueType> allowedValueTypes = Set.of(ValueType.INT, ValueType.REAL);
        assertOperandsType("unary -", allowedValueTypes, operand);

        if (operand.getType().equals(ValueType.INT)) {
            return Value.ofInt(-(Integer) operand.getValue(), operand.getLineColPair());
        }

        return Value.ofReal(-(Double) operand.getValue(), operand.getLineColPair());
    }

    private static Value handleUnaryPlus(Value operand) {
        Set<ValueType> allowedValueTypes = Set.of(ValueType.INT, ValueType.REAL);
        assertOperandsType("unary +", allowedValueTypes, operand);

        if (operand.getType().equals(ValueType.INT)) {
            return Value.ofInt(+(Integer) operand.getValue(), operand.getLineColPair());
        }

        return Value.ofReal(+(Double) operand.getValue(), operand.getLineColPair());
    }

    public static Value handleBinaryOperation(BinaryOperationType operationType, Value firstOp, Value secondOp) {
        return switch (operationType) {
            case ADDITION -> handleBinaryAddition(firstOp, secondOp);
            case SUBTRACTION -> handleBinarySubtraction(firstOp, secondOp);
            case MULTIPLICATION -> handleBinaryMultiplication(firstOp, secondOp);
            case DIVISION -> handleBinaryDivision(firstOp, secondOp);
            case GREATER -> handleBinaryGreater(firstOp, secondOp);
            case GREATER_OR_EQUAL -> handleBinaryGreaterOrEqual(firstOp, secondOp);
            case LESS -> handleBinaryLess(firstOp, secondOp);
            case LESS_OR_EQUAL -> handleBinaryLessOrEqual(firstOp, secondOp);
            case EQUAL -> handleBinaryEqual(firstOp, secondOp);
            case AND -> handleBinaryAnd(firstOp, secondOp);
            case OR -> handleBinaryOr(firstOp, secondOp);
            case NOT_EQUAL -> handleBinaryNotEqual(firstOp, secondOp);
        };
    }

    private static Value handleBinaryAnd(Value firstOp, Value secondOp) {
        Set<ValueType> allowedValueTypes = Set.of(ValueType.BOOL);
        assertOperandsType("and", allowedValueTypes, firstOp, secondOp);

        return Value.ofBool((boolean) firstOp.getValue() && (boolean) secondOp.getValue(), secondOp.getLineColPair());
    }

    private static Value handleBinaryOr(Value firstOp, Value secondOp) {
        Set<ValueType> allowedValueTypes = Set.of(ValueType.BOOL);
        assertOperandsType("or", allowedValueTypes, firstOp, secondOp);

        return Value.ofBool((boolean) firstOp.getValue() || (boolean) secondOp.getValue(), secondOp.getLineColPair());
    }

    private static Value handleBinaryGreater(Value firstOp, Value secondOp) {
        Set<ValueType> allowedValueTypes = Set.of(ValueType.INT, ValueType.REAL, ValueType.STRING);
        assertOperandsType(">", allowedValueTypes, firstOp, secondOp);

        if (firstOp.getType().equals(ValueType.INT) && secondOp.getType().equals(ValueType.INT)) {
            return Value.ofBool((Integer) firstOp.getValue() > (Integer) secondOp.getValue(), secondOp.getLineColPair());
        }

        if (firstOp.getType().equals(ValueType.REAL) && secondOp.getType().equals(ValueType.REAL)) {
            return Value.ofBool((Double) firstOp.getValue() > (Double) secondOp.getValue(), secondOp.getLineColPair());
        }

        int resStringComparison = ((String) firstOp.getValue()).compareTo((String) secondOp.getValue());

        return Value.ofBool(resStringComparison > 0, secondOp.getLineColPair());
    }

    private static Value handleBinaryGreaterOrEqual(Value firstOp, Value secondOp) {
        Set<ValueType> allowedValueTypes = Set.of(ValueType.INT, ValueType.REAL, ValueType.STRING);
        assertOperandsType(">=", allowedValueTypes, firstOp, secondOp);

        if (firstOp.getType().equals(ValueType.INT) && secondOp.getType().equals(ValueType.INT)) {
            return Value.ofBool((Integer) firstOp.getValue() >= (Integer) secondOp.getValue(), secondOp.getLineColPair());
        }

        if (firstOp.getType().equals(ValueType.REAL) && secondOp.getType().equals(ValueType.REAL)) {
            return Value.ofBool((Double) firstOp.getValue() >= (Double) secondOp.getValue(), secondOp.getLineColPair());
        }

        int resStringComparison = ((String) firstOp.getValue()).compareTo((String) secondOp.getValue());

        return Value.ofBool(resStringComparison >= 0, secondOp.getLineColPair());
    }

    private static Value handleBinaryLess(Value firstOp, Value secondOp) {
        Set<ValueType> allowedValueTypes = Set.of(ValueType.INT, ValueType.REAL, ValueType.STRING);
        assertOperandsType("<", allowedValueTypes, firstOp, secondOp);

        if (firstOp.getType().equals(ValueType.INT) && secondOp.getType().equals(ValueType.INT)) {
            return Value.ofBool((Integer) firstOp.getValue() < (Integer) secondOp.getValue(), secondOp.getLineColPair());
        }

        if (firstOp.getType().equals(ValueType.REAL) && secondOp.getType().equals(ValueType.REAL)) {
            return Value.ofBool((Double) firstOp.getValue() < (Double) secondOp.getValue(), secondOp.getLineColPair());
        }

        int resStringComparison = ((String) firstOp.getValue()).compareTo((String) secondOp.getValue());

        return Value.ofBool(resStringComparison < 0, secondOp.getLineColPair());
    }

    private static Value handleBinaryLessOrEqual(Value firstOp, Value secondOp) {
        Set<ValueType> allowedValueTypes = Set.of(ValueType.INT, ValueType.REAL, ValueType.STRING);
        assertOperandsType("<=", allowedValueTypes, firstOp, secondOp);

        if (firstOp.getType().equals(ValueType.INT) && secondOp.getType().equals(ValueType.INT)) {
            return Value.ofBool((Integer) firstOp.getValue() <= (Integer) secondOp.getValue(), secondOp.getLineColPair());
        }

        if (firstOp.getType().equals(ValueType.REAL) && secondOp.getType().equals(ValueType.REAL)) {
            return Value.ofBool((Double) firstOp.getValue() <= (Double) secondOp.getValue(), secondOp.getLineColPair());
        }

        int resStringComparison = ((String) firstOp.getValue()).compareTo((String) secondOp.getValue());

        return Value.ofBool(resStringComparison <= 0, secondOp.getLineColPair());
    }

    private static Value handleBinaryAddition(Value firstOp, Value secondOp) {

        Set<ValueType> allowedValueTypes = Set.of(ValueType.INT, ValueType.REAL);
        assertOperandsType("+", allowedValueTypes, firstOp, secondOp);

        if (firstOp.getType().equals(ValueType.INT) && secondOp.getType().equals(ValueType.INT)) {
            return Value.ofInt((Integer) firstOp.getValue() + (Integer) secondOp.getValue(), secondOp.getLineColPair());
        }

        return Value.ofReal((Double) firstOp.getValue() + (Double) secondOp.getValue(), secondOp.getLineColPair());
    }

    private static Value handleBinarySubtraction(Value firstOp, Value secondOp) {

        Set<ValueType> allowedValueTypes = Set.of(ValueType.INT, ValueType.REAL);
        assertOperandsType("-", allowedValueTypes, firstOp, secondOp);

        if (firstOp.getType().equals(ValueType.INT) && secondOp.getType().equals(ValueType.INT)) {
            return Value.ofInt((Integer) firstOp.getValue() - (Integer) secondOp.getValue(), secondOp.getLineColPair());
        }

        return Value.ofReal((Double) firstOp.getValue() - (Double) secondOp.getValue(), secondOp.getLineColPair());
    }

    private static Value handleBinaryMultiplication(Value firstOp, Value secondOp) {

        Set<ValueType> allowedValueTypes = Set.of(ValueType.INT, ValueType.REAL);
        assertOperandsType("*", allowedValueTypes, firstOp, secondOp);

        if (firstOp.getType().equals(ValueType.INT) && secondOp.getType().equals(ValueType.INT)) {
            return Value.ofInt((Integer) firstOp.getValue() * (Integer) secondOp.getValue(), secondOp.getLineColPair());
        }

        return Value.ofReal((Double) firstOp.getValue() * (Double) secondOp.getValue(), secondOp.getLineColPair());
    }

    private static Value handleBinaryDivision(Value firstOp, Value secondOp) {

        Set<ValueType> allowedValueTypes = Set.of(ValueType.INT, ValueType.REAL);
        assertOperandsType("/", allowedValueTypes, firstOp, secondOp);

        if (firstOp.getType().equals(ValueType.INT) && secondOp.getType().equals(ValueType.INT)) {
            return Value.ofInt((Integer) firstOp.getValue() / (Integer) secondOp.getValue(), secondOp.getLineColPair());
        }

        return Value.ofReal((Double) firstOp.getValue() / (Double) secondOp.getValue(), secondOp.getLineColPair());
    }

    private static Value handleBinaryEqual(Value firstOp, Value secondOp) {
        Set<ValueType> allowedValueTypes = Set.of(ValueType.INT,
                ValueType.REAL,
                ValueType.STRING,
                ValueType.UNIT,
                ValueType.BOOL);
        assertOperandsType("==", allowedValueTypes, firstOp, secondOp);

        return Value.ofBool(Objects.equals(firstOp.getValue(), secondOp.getValue()), secondOp.getLineColPair());
    }

    private static Value handleBinaryNotEqual(Value firstOp, Value secondOp) {
        Set<ValueType> allowedValueTypes = Set.of(ValueType.INT,
                ValueType.REAL,
                ValueType.STRING,
                ValueType.UNIT,
                ValueType.BOOL);
        assertOperandsType("!=", allowedValueTypes, firstOp, secondOp);

        return Value.ofBool(!Objects.equals(firstOp.getValue(), secondOp.getValue()), secondOp.getLineColPair());
    }





    private static void assertOperandsType(String operation, Set<ValueType> allowedValueTypes, Value... values) {

        Arrays.stream(values).forEach(v -> {
            if (!allowedValueTypes.contains(v.getType())) {
                throw new IllegalArgumentsOperationException(String.format(
                        "Operation '%s' is not supported for operand type %s",
                        operation,
                        v.getType()),
                        v.getLineColPair()
                );
            }
        });

        // All operands must have the same type
        Set<ValueType> actualTypes = Arrays.stream(values).map(Value::getType).collect(Collectors.toSet());
        if (actualTypes.size() != 1) {
            throw new IllegalArgumentsOperationException(String.format(
                    "Operands error for operation '%s' because of different types %s. Explicit cast is required",
                    operation,
                    actualTypes.stream().map(Enum::toString).collect(Collectors.joining(", "))
            ), Arrays.stream(values).findFirst().get().getLineColPair());
        }
    }

}
