package com.interpreter.runtime.visitor;

import com.interpreter.runtime.env.Environment;
import com.interpreter.runtime.env.value.Value;
import hardtyped.Absyn.Elem;
import hardtyped.Absyn.RecordElem;
import org.antlr.v4.runtime.misc.Pair;

public class RecordElemVisitor implements RecordElem.Visitor<Pair<String, Value>, Environment> {

    @Override
    public Pair<String, Value> visit(Elem p, Environment arg) {
        Value value = p.expr_.accept(AllVisitors.exprVisitor, arg);
        return new Pair<>(p.ident_, value);
    }
}
