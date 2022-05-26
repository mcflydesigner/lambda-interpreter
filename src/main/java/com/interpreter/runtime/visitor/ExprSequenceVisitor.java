package com.interpreter.runtime.visitor;

import com.interpreter.runtime.env.Environment;
import com.interpreter.runtime.env.value.Value;
import hardtyped.Absyn.ExprSequence;
import hardtyped.Absyn.Seq;

public class ExprSequenceVisitor implements ExprSequence.Visitor<Value, Environment> {

    @Override
    public Value visit(Seq p, Environment arg) {
        return p.expr_.accept(AllVisitors.exprVisitor, arg);
    }
}
