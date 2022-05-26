package com.interpreter.typechecker.types;

import com.interpreter.exception.IdentifierNotFoundException;
import com.interpreter.typechecker.types.ExprType;

import java.util.*;


public class TypeContext {

    private final List<TypeConstraint> constraints = new ArrayList<>();

    private final Deque<IdTypePair> variables = new ArrayDeque<>();
    private final Deque<IdTypePair> userTypes = new ArrayDeque<>();
    private final Map<String, ExprType> globalVariables = new HashMap<>();
    private final Map<String, ExprType> globalUserTypes = new HashMap<>();
    public void addEqualityConstraint(ExprType x, ExprType t, int line_num, int col_num) {
        constraints.add(new TypeConstraint(x, t, line_num, col_num));
        constraints.add(new TypeConstraint(t, x, line_num, col_num));
    }

    public void addSubtypeConstraint(ExprType x, ExprType t, int line_num, int col_num) {
        constraints.add(new TypeConstraint(x, t, line_num, col_num));
    }

    public void addGlobalType(String s, ExprType type) {
        globalVariables.put(s, type);
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
        throw new IdentifierNotFoundException(String.format("Variable or type %s is not declared", id));
    }

    public List<TypeConstraint> getConstraints() {
        return constraints;
    }

}
