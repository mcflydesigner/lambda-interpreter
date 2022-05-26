package com.interpreter.typechecker.visitor;

import com.interpreter.typechecker.types.TypeContext;
import com.interpreter.typechecker.types.ExprType;
import hardtyped.Absyn.Else;
import hardtyped.Absyn.ElseExpr;
import hardtyped.Absyn.If;
import hardtyped.Absyn.IfExpr;
import org.antlr.v4.runtime.misc.Pair;

public class IfVisitor implements IfExpr.Visitor<ExprType, TypeContext>,
        ElseExpr.Visitor<ExprType, TypeContext> {

    MainVisitor mainVisitor;
    public IfVisitor(MainVisitor mainVisitor) {
        this.mainVisitor = mainVisitor;
    }

    @Override
    public ExprType visit(Else p, TypeContext ctx) {
        return p.expr_.accept(mainVisitor.exprVisitor, ctx);
    }

    @Override
    public ExprType visit(If p, TypeContext ctx) {
        ExprType conditionType = p.expr_1.accept(mainVisitor.exprVisitor, ctx);
        mainVisitor.exprVisitor.checkForEquality(conditionType, ExprType.bool(), p.line_num, p.col_num);

        return p.expr_2.accept(mainVisitor.exprVisitor, ctx);
    }
}
