package com.interpreter.shared.libs;

import com.interpreter.runtime.env.Environment;
import com.interpreter.runtime.env.value.Value;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public interface LibInterface {

    Map<String, Function<Environment, Value>> getFunctions();

    Map<String, String> getDefinitions();

}
