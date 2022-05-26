package com.interpreter.typechecker.visitor;

import com.interpreter.typechecker.types.ExprType;
import com.interpreter.typechecker.types.TypeContext;
import com.interpreter.typechecker.types.IdTypePair;
import hardtyped.Absyn.TypedVar;
import hardtyped.Absyn.UntypedVar;
import hardtyped.Absyn.VarDec;

public class VarDecVisitor implements VarDec.Visitor<IdTypePair, TypeContext> {

    MainVisitor mainVisitor;
    public VarDecVisitor(MainVisitor mainVisitor) {
        this.mainVisitor = mainVisitor;
    }

    @Override
    public IdTypePair visit(TypedVar p, TypeContext ctx) {
        return new IdTypePair(p.ident_, p.type_.accept(mainVisitor.typeVisitor, ctx));
    }

    @Override
    public IdTypePair visit(UntypedVar p, TypeContext arg) {
        return new IdTypePair(p.ident_, null);
    }
}
