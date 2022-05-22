package com.interpreter.runtime;

import hardtyped.Absyn.ListExpr;

public interface Interpreter {

    void run(ListExpr exprs);

}
