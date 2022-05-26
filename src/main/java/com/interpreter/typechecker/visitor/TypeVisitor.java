package com.interpreter.typechecker.visitor;

import com.interpreter.typechecker.types.TypeContext;
import com.interpreter.typechecker.types.ExprType;
import com.interpreter.typechecker.types.IdTypePair;
import hardtyped.Absyn.*;

import java.util.ArrayList;
import java.util.List;

public class TypeVisitor implements Type.Visitor<ExprType, TypeContext> {

    MainVisitor mainVisitor;
    public TypeVisitor(MainVisitor mainVisitor) {
        this.mainVisitor = mainVisitor;
    }


    @Override
    public ExprType visit(UserType p, TypeContext ctx) {
        return ctx.getUserType(p.ident_);
    }

    @Override
    public ExprType visit(IntType p, TypeContext ctx) {
        return ExprType.integer();
    }

    @Override
    public ExprType visit(RealType p, TypeContext ctx) {
        return ExprType.real();
    }

    @Override
    public ExprType visit(BoolType p, TypeContext ctx) {
        return ExprType.bool();
    }

    @Override
    public ExprType visit(StringType p, TypeContext ctx) {
        return ExprType.string();
    }

    @Override
    public ExprType visit(UnitType p, TypeContext ctx) {
        return ExprType.unit();
    }

    @Override
    public ExprType visit(AnyType p, TypeContext ctx) {
        return ExprType.any();
    }

    @Override
    public ExprType visit(FunctionType p, TypeContext ctx) {
        ExprType left = p.type_1.accept(this, ctx);
        ExprType right = p.type_2.accept(this, ctx);

        return ExprType.function(left, right);
    }

    @Override
    public ExprType visit(RecordType p, TypeContext ctx) {
        List<IdTypePair> elems = new ArrayList<>();
        p.listrecordelemtype_.
                forEach(elemType -> elems.add(elemType.accept(mainVisitor.recordVisitor, ctx)));
        return ExprType.record(elems);
    }
}
