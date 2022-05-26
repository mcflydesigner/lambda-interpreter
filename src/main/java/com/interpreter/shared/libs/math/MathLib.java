package com.interpreter.shared.libs.math;

import com.interpreter.runtime.env.Environment;
import com.interpreter.runtime.env.value.Value;
import com.interpreter.runtime.env.value.ValueType;
import com.interpreter.shared.libs.LibInterface;
import com.interpreter.shared.libs.SerializableFunction;
import com.interpreter.shared.libs.std.IoOperationHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.interpreter.shared.libs.LibUtils.*;

public class MathLib implements LibInterface {

    public Value sqrt(Environment environment) {

        Value value = verifyArgumentsAndGetLast(environment, 1);
        verifyAllowedTypes("sqrt", Set.of(ValueType.REAL), value);
        return Value.ofReal(Math.sqrt((Double) value.getValue()), value.getLineColPair());
    }

    public Value abs(Environment environment) {

        Value value = verifyArgumentsAndGetLast(environment, 1);
        verifyAllowedTypes("abs", Set.of(ValueType.REAL), value);
        return Value.ofReal(Math.abs((Double) value.getValue()), value.getLineColPair());
    }

    public Value pow(Environment environment) {

        List<Value> values = verifyArgumentsAndGetList(environment, 2);
        verifyAllowedTypes("sqrt", Set.of(ValueType.REAL), values);

        Value base = values.get(0);
        Value exponent = values.get(1);
        return Value.ofReal(Math.pow((Double) base.getValue(), (Double) exponent.getValue()), base.getLineColPair());
    }

    public Value round(Environment environment) {

        Value value = verifyArgumentsAndGetLast(environment, 1);
        verifyAllowedTypes("round", Set.of(ValueType.REAL), value);
        return Value.ofInt((int) Math.round((Double) value.getValue()), value.getLineColPair());
    }

    public Value getPi(Environment environment) {

        Value value = verifyArgumentsAndGetLast(environment, 1);
        verifyAllowedTypes("getPi", Set.of(ValueType.UNIT), value);
        return Value.ofReal(Math.PI, value.getLineColPair());
    }

    public Value getE(Environment environment) {

        Value value = verifyArgumentsAndGetLast(environment, 1);
        verifyAllowedTypes("getE", Set.of(ValueType.UNIT), value);
        return Value.ofReal(Math.E, value.getLineColPair());
    }

    @Override
    public Map<String, SerializableFunction<Environment, Value>> getFunctions() {
        Map<String, SerializableFunction<Environment, Value>> functions = new HashMap<>();
        functions.put("sqrt", this::sqrt);
        functions.put("abs", this::abs);
        functions.put("pow", this::pow);
        functions.put("round", this::round);
        functions.put("getPi", this::getPi);
        functions.put("getE", this::getE);

        return functions;
    }

    @Override
    public Map<String, String> getDefinitions() {
        Map<String, String> definitions = new HashMap<>();
        definitions.put("sqrt", MathLibDefinitions.SQRT);
        definitions.put("abs", MathLibDefinitions.ABS);
        definitions.put("pow", MathLibDefinitions.POW);
        definitions.put("round", MathLibDefinitions.ROUND);
        definitions.put("getPi", MathLibDefinitions.GET_PI);
        definitions.put("getE", MathLibDefinitions.GET_E);

        return definitions;
    }
}
