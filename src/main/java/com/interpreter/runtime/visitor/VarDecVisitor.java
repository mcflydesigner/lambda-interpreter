package com.interpreter.runtime.visitor;

import com.interpreter.runtime.env.Environment;
import hardtyped.Absyn.*;
import org.antlr.v4.runtime.misc.Pair;

public class VarDecVisitor implements VarDec.Visitor<Pair<String, Type>, Environment> {

    @Override
    public Pair<String, Type> visit(TypedVar p, Environment arg) {
        return new Pair<>(p.ident_, p.type_);
    }

    @Override
    public Pair<String, Type> visit(UntypedVar p, Environment arg) {
        return new Pair<>(p.ident_, null);
    }
}
