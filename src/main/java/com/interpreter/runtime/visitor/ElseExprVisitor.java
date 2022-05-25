package com.interpreter.runtime.visitor;

import com.interpreter.runtime.env.Environment;
import com.interpreter.runtime.env.value.Value;
import hardtyped.Absyn.Else;
import hardtyped.Absyn.ElseExpr;

public class ElseExprVisitor implements ElseExpr.Visitor<Value, Environment> {

    @Override
    public Value visit(Else p, Environment arg) {
        return p.expr_.accept(AllVisitors.exprVisitor, arg);
    }
}
