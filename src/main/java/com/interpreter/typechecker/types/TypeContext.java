package com.interpreter.typechecker.types;

import com.interpreter.shared.exceptions.IdentifierNotFoundException;
import com.interpreter.shared.exceptions.TypeCheckException;
import com.interpreter.typechecker.types.ExprType;
import org.antlr.v4.runtime.misc.Pair;

import java.util.*;


public class TypeContext {

    private final boolean printTypes;

    public TypeContext(boolean printTypes) {
        this.printTypes = printTypes;
    }
    public boolean isPrintTypes() {
        return printTypes;
    }

    private final Deque<IdTypePair> variables = new ArrayDeque<>();
    private final Deque<IdTypePair> userTypes = new ArrayDeque<>();
    private final Map<String, ExprType> globalVariables = new HashMap<>();
    private final Map<String, ExprType> globalUserTypes = new HashMap<>();

    private final Map<String, Map<String, ExprType>> imports = new HashMap<>();

    public void addGlobalType(String s, ExprType type) {
        globalVariables.put(s, type);
    }

    public void addLib(String lib, Map<String, ExprType> defs) {
        imports.put(lib, defs);
    }
    public ExprType getFromLib(String lib, String name) {
        if (!imports.containsKey(lib)) {
            throw new TypeCheckException(String.format("Module by alias %s is not found", lib));
        }
        var defs = imports.get(lib);
        if (!defs.containsKey(name)) {
            throw new TypeCheckException(String.format("%s is not found in module %s", name, lib));
        }
        return defs.get(name);
    }

    public void addGlobalVariables(Map<String, ExprType> vars) {
        globalVariables.putAll(vars);
    }

    public Map<String, ExprType> getGlobalVariables() {
        return globalVariables;
    }

    public void addType(String s, ExprType type) {
        variables.push(new IdTypePair(s, type));
    }
    public void removeType() {
        variables.pop();
    }
    public void addUserType(String s, ExprType type) {
        userTypes.push(new IdTypePair(s, type));
    }

    public void removeUserType() {
        userTypes.pop();
    }
    public void addGlobalUserType(String s, ExprType type) {
        globalUserTypes.put(s, type);
    }

    public ExprType getType(String id) {
        return get(globalVariables, variables, id);
    }

    public ExprType getUserType(String name) {
        return get(globalUserTypes, userTypes, name);
    }

    private ExprType get(Map<String, ExprType> map, Deque<IdTypePair> deque, String id) {
        if (!map.containsKey(id)) {
            for (IdTypePair p : deque) {
                if (id.equals(p.a)) {
                    return p.b;
                }
            }
        } else {
            return map.get(id);
        }
        throw new TypeCheckException(String.format("Variable or type %s is not declared", id));
    }

}
