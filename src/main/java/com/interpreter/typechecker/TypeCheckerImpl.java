package com.interpreter.typechecker;

import com.interpreter.typechecker.visitor.MainVisitor;
import hardtyped.Absyn.ListExpr;

public class TypeCheckerImpl implements TypeChecker {

    private boolean printTypes = false;
    private final MainVisitor visitor = new MainVisitor();

    public void typeCheck(ListExpr exprs) {
        visitor.printTypes = printTypes;
        if (printTypes) {
            System.out.println("Type checker output:");
        }
        visitor.visit(exprs);
    }

    @Override
    public void setPrintTypes(boolean flag) {
        printTypes = flag;
    }


}
