package com.interpreter.runtime.env;

import com.interpreter.runtime.env.value.Value;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Scope implements Serializable {

    private final Map<String, Value> declarations = new HashMap<>();

    public Value getValue(String identifier) {
        return declarations.get(identifier);
    }

    public void addDeclaration(String identifier, Value value) {
        declarations.put(identifier, value);
    }

    public boolean hasIdentifier(String identifier) {
        return declarations.containsKey(identifier);
    }

    public Map<String, Value> getDeclarations() {
        return declarations;
    }
}
