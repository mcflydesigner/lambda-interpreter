package com.interpreter.runtime;

import com.interpreter.runtime.env.value.Value;
import hardtyped.Absyn.Expr;
import hardtyped.Absyn.ListExpr;

import java.util.List;

public interface Interpreter {

    List<Value> run(ListExpr exprs);

}
