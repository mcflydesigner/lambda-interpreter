package com.interpreter.typechecker.types;

import java.util.Objects;

public class TypeVariable extends ExprType {

    private final String name;

    private static int next = 0;
    protected TypeVariable() {
        super(Type.TYPEVAR);
        name = computeName(next++);
    }

//    private String computeName(int n) {
//        int base = 26;
//        StringBuilder s = new StringBuilder();
//        while (n > 0) {
//            s.append((char)('A' + n % base));
//            n = n / base;
//        }
//        return s.reverse().toString();
//    }

    private String computeName(int n) {
        return Character.toString('A' + n);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        TypeVariable that = (TypeVariable) o;
//        return Objects.equals(name, that.name);
        return this == o;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}
