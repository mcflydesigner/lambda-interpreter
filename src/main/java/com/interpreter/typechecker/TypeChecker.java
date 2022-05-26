package com.interpreter.typechecker;

import hardtyped.Absyn.ListExpr;

public interface TypeChecker {

    void typeCheck(ListExpr exprs);

    void setPrintTypes(boolean flag);
}
