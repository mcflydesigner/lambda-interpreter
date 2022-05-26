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

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), from, to);
    }

    @Override
    public String toString() {
        return "(" + from.toString() + "->" + to.toString() + ")";
    }
}
