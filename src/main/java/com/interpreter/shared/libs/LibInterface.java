package com.interpreter.shared.libs;

import com.interpreter.runtime.env.Environment;
import com.interpreter.runtime.env.value.Value;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public interface LibInterface extends Serializable  {

    Map<String, SerializableFunction<Environment, Value>> getFunctions();

    Map<String, String> getDefinitions();

}
