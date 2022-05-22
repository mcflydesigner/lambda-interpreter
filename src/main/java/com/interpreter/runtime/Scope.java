package com.interpreter.runtime;

import java.util.HashMap;
import java.util.Map;

public class Scope {

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

//    public boolean hasIdentifierWithType(String identifier, ValueType type) {
//        return (declarations.get(identifier).getType().equals(type));
//    }

}
