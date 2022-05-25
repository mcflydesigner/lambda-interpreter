package com.interpreter.runtime.libs;

import com.interpreter.runtime.env.value.FunctionValue;

import java.util.Map;

public interface LibInterface {

    Map<String, FunctionValue> registerFunctions();

}
