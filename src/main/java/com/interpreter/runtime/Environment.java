package com.interpreter.runtime;

import com.interpreter.exception.IdentifierAlreadyDeclaredException;
import com.interpreter.exception.IdentifierNotFoundException;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class Environment {

    private final Deque<Scope> scopes = new ArrayDeque<>();

    public Environment() {
        // Push global scope to the deque
        scopes.add(new Scope());
    }

    public void pushScope() {
        scopes.add(new Scope());
    }

    public void flushScope() {
        if (scopes.size() == 1) {
            throw new IllegalStateException("Global environment cannot be flushed.");
        }

        scopes.removeLast();
    }

    public Value getVariableValue(String identifier) {
        for (Scope scope : scopes) {
            if (scope.hasIdentifier(identifier)) {
                return scope.getValue(identifier);
            }
        }

        throw new IdentifierNotFoundException(String.format(
                "Identifier '%s' is not declared in the scope",
                identifier
        ));
    }

    public void declareVariablesAndAssignValues(Map<String, Value> variables) {
        variables.entrySet().forEach(e -> declareVariableAndAssignValue(e.getKey(), e.getValue()));
    }

    public void declareVariableAndAssignValue(String identifier, Value value) {
        for (Scope scope : scopes) {
            if (scope.hasIdentifier(identifier)) {
                throw new IdentifierAlreadyDeclaredException(String.format("Identifier '%s' was already declared before",
                        identifier));
            }
        }
        scopes.getLast().addDeclaration(identifier, value);
    }



}
