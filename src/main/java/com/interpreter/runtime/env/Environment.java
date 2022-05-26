package com.interpreter.runtime.env;

import com.interpreter.exception.IncorrectDeclarationException;
import com.interpreter.exception.IdentifierNotFoundException;
import com.interpreter.exception.LineColPair;
import com.interpreter.runtime.env.value.Value;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

public class Environment implements Serializable {

    private final ArrayDeque<Scope> scopes = new ArrayDeque<>();

    public Environment() {
        // Push global scope to the deque
        scopes.add(new Scope());
    }

    public void pushScope() {
        scopes.add(new Scope());
    }

    public void flushScope() {
        if (scopes.size() == 1) {
            throw new IllegalStateException("Global scope cannot be flushed.");
        }

        scopes.removeLast();
    }

    public Value getVariableValue(String identifier, LineColPair lineColPair) {
        Iterator<Scope> reversedScopes = scopes.descendingIterator();
        while(reversedScopes.hasNext()) {
            Scope scope = reversedScopes.next();
            if (scope.hasIdentifier(identifier)) {
                return scope.getValue(identifier);
            }
        }

        throw new IdentifierNotFoundException(
                String.format("Identifier '%s' is not declared in the scope", identifier),
                lineColPair
        );
    }

    public void declareVariablesAndAssignValues(Map<String, Value> variables) {
        variables.forEach(this::declareVariableAndAssignValue);
    }

    public void declareVariableAndAssignValue(String identifier, Value value) {
        // Allow shadowing
        if (scopes.getFirst().hasIdentifier(identifier)) {
            throw new IncorrectDeclarationException(
                    String.format("Identifier '%s' was already declared before", identifier),
                    value.getLineColPair());
        }

        scopes.getLast().addDeclaration(identifier, value);
    }

    public boolean isCurrentScopeGlobal() {
        return this.scopes.size() == 1;
    }


}
