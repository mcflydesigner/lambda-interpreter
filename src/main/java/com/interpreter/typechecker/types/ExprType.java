package com.interpreter.typechecker.types;

import java.util.*;

public class ExprType {
    final Type type;

    protected ExprType(Type type) {
        if (type == null) {
            throw new IllegalArgumentException();
        }
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public static ExprType integer() {
        return new ExprType(Type.INTEGER);
    }
    public static ExprType real() {
        return new ExprType(Type.REAL);
    }
    public static ExprType bool() {
        return new ExprType(Type.BOOL);
    }
    public static ExprType string() {
        return new ExprType(Type.STRING);
    }
    public static ExprType unit() {
        return new ExprType(Type.UNIT);
    }
    public static ExprType any() {
        return new ExprType(Type.ANY);
    }
    public static RecordType record(List<IdTypePair> map) {
        return new RecordType(map);
    }
    public static FunctionType function(ExprType from, ExprType to) {
        return new FunctionType(from, to);
    }
    public static FunctionType functionFromList(List<ExprType> list) {
        if (list.size() < 2) {
            throw new IllegalStateException("Function must have at least two arguments");
        }
        Deque<ExprType> args = new ArrayDeque<>(list);
        ExprType retType = args.removeLast();
        FunctionType resType = ExprType.function(args.removeLast(), retType);
        while (!args.isEmpty()) {
            resType = ExprType.function(args.removeLast(), resType);
        }
        return resType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExprType exprType = (ExprType) o;
        return type == exprType.type;
    }

    public boolean isSubtypeOf(ExprType that) {
        return this.equals(that) || that.getType() == Type.ANY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return type.toString();
    }

    public enum Type {
        INTEGER,
        REAL,
        BOOL,
        STRING,
        UNIT,
        RECORD,
        FUNCTION,
        ANY,
    }
}
