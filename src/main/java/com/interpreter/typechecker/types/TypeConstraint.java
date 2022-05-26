package com.interpreter.typechecker.types;

public class TypeConstraint {
    public ExprType left;
    // left subtype of right
    public ExprType right;

    private int line_num, col_num;

    public TypeConstraint(ExprType left, ExprType right,
                          int line_num, int col_num) {
        this.left = left;
        this.right = right;
        this.line_num = line_num;
        this.col_num = col_num;
    }

    @Override
    public String toString() {
        return left.toString() + "<=" + right.toString();
    }
}
