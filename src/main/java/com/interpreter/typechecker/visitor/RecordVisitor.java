package com.interpreter.typechecker.visitor;

import com.interpreter.typechecker.types.TypeContext;
import com.interpreter.typechecker.types.ExprType;
import com.interpreter.typechecker.types.IdTypePair;
import hardtyped.Absyn.Elem;
import hardtyped.Absyn.ElemType;
import hardtyped.Absyn.RecordElem;
import hardtyped.Absyn.RecordElemType;

public class RecordVisitor implements RecordElemType.Visitor<IdTypePair, TypeContext>,
        RecordElem.Visitor<IdTypePair, TypeContext> {

    MainVisitor mainVisitor;
    public RecordVisitor(MainVisitor mainVisitor) {
        this.mainVisitor = mainVisitor;
    }

    @Override
    public IdTypePair visit(ElemType p, TypeContext ctx) {
        ExprType type = p.type_.accept(mainVisitor.typeVisitor, ctx);
        return new IdTypePair(p.ident_, type);
    }

    @Override
    public IdTypePair visit(Elem p, TypeContext ctx) {
        ExprType type = p.expr_.accept(mainVisitor.exprVisitor, ctx);
        return new IdTypePair(p.ident_, type);
    }
}
