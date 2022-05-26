package com.interpreter.typechecker.types;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FunctionType extends ExprType {

    private final ExprType from;
    private final ExprType to;
    protected FunctionType(ExprType from, ExprType to) {
        super(Type.FUNCTION);
        if (from == null || to == null) {
            throw new IllegalArgumentException();
        }
        this.from = from;
        this.to = to;
    }

    public ExprType getTo() {
        return to;
    }

    public ExprType getFrom() {
        return from;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FunctionType that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(from, that.from) && Objects.equals(to, that.to);
    }

    public static List<ExprType> listFromFunction(FunctionType func) {
        List<ExprType> list = new ArrayList<>();
        list.add(func.from);
        ExprType t = func;
        while (t.getType() == Type.FUNCTION) {
            ExprType next = ((FunctionType) t).to;
            list.add(next);
            t = next;
        }
        return list;
    }

    public boolean isSubtypeOf(ExprType that) {
        if (this == that || that.getType() == Type.ANY) {
            return true;
        }
        if (!(that instanceof FunctionType other)) {
            return false;
        }
        return other.from.isSubtypeOf(from) && to.isSubtypeOf(other.to);
    }

    public static ExprType calcReturnType(ExprType f, List<ExprType> args) {
        if (!(f instanceof FunctionType)) return null;
        ExprType retType = f;
        for (var arg : args) {
            if (!(retType instanceof FunctionType func)) {
                return null;
            }
            if (!arg.isSubtypeOf(func.from)) {
                return null;
            }
            retType = func.to;
        }
        return retType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), from, to);
    }

    @Override
    public String toString() {
        return "(" + from.toString() + "->" + to.toString() + ")";
    }
}
