package com.interpreter.runtime.visitor;

import com.interpreter.runtime.Environment;
import hardtyped.Absyn.*;
import org.antlr.v4.runtime.misc.Pair;


public class FuncArgVisitor implements FuncArg.Visitor<Pair<String, Type>, Environment> {

    @Override
    public Pair<String, Type> visit(Argument p, Environment arg) {
        return new Pair<>(p.ident_, p.type_);
    }
}
