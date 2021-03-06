package com.interpreter.typechecker.visitor;

import com.interpreter.typechecker.types.TypeContext;
import com.interpreter.typechecker.types.IdTypePair;
import hardtyped.Absyn.Argument;
import hardtyped.Absyn.FuncArg;

public class FuncArgVisitor implements FuncArg.Visitor<IdTypePair, TypeContext> {

    MainVisitor mainVisitor;
    public FuncArgVisitor(MainVisitor mainVisitor) {
        this.mainVisitor = mainVisitor;
    }

    @Override
    public IdTypePair visit(Argument p, TypeContext ctx) {
        return new IdTypePair(p.ident_, p.type_.accept(mainVisitor.typeVisitor, ctx));
    }
}
