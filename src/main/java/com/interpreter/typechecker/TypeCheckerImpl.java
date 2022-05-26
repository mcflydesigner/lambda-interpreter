package com.interpreter.typechecker;

import com.interpreter.typechecker.visitor.MainVisitor;
import hardtyped.Absyn.ListExpr;

public class TypeCheckerImpl implements TypeChecker {

    private final MainVisitor visitor = new MainVisitor();

    public void typeCheck(ListExpr exprs) {
        visitor.visit(exprs);
    }
}
