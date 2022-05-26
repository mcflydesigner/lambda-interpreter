package com.interpreter.shared.libs;

import java.io.Serializable;
import java.util.function.Function;

public interface SerializableFunction<A, B> extends Function<A, B>, Serializable  {
}
