package com.interpreter.runtime.visitor;

import hardtyped.Absyn.*;
import org.antlr.v4.runtime.misc.Pair;

public class VarDecVisitor implements VarDec.Visitor<Pair<String, Type>, Void> {

    @Override
    public Pair<String, Type> visit(TypedVar p, Void arg) {
        return new Pair<>(p.ident_, p.type_);
    }

    @Override
    public Pair<String, Type> visit(UntypedVar p, Void arg) {
        return new Pair<>(p.ident_, null);
    }
}
