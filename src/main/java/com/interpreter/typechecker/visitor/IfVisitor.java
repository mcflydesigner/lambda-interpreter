package com.interpreter.typechecker.visitor;

import com.interpreter.typechecker.types.TypeContext;
import com.interpreter.typechecker.types.ExprType;
import hardtyped.Absyn.Else;
import hardtyped.Absyn.ElseExpr;
import hardtyped.Absyn.If;
import hardtyped.Absyn.IfExpr;
import org.antlr.v4.runtime.misc.Pair;

public class IfVisitor implements IfExpr.Visitor<Void, Pair<ExprType, TypeContext>>,
        ElseExpr.Visitor<Void, Pair<ExprType, TypeContext>> {

    MainVisitor mainVisitor;
    public IfVisitor(MainVisitor mainVisitor) {
        this.mainVisitor = mainVisitor;
    }

    @Override
    public Void visit(Else p, Pair<ExprType, TypeContext> arg) {
        ExprType retType = arg.a;
        TypeContext ctx = arg.b;

        ExprType actual = p.expr_.accept(mainVisitor.exprVisitor, ctx);
        ctx.addSubtypeConstraint(actual, retType, p.line_num, p.col_num);
        return null;
    }

    @Override
    public Void visit(If p, Pair<ExprType, TypeContext> arg) {
        ExprType retType = arg.a;
        TypeContext ctx = arg.b;

        ExprType conditionType = p.expr_1.accept(mainVisitor.exprVisitor, ctx);
        ctx.addEqualityConstraint(conditionType, ExprType.bool(), p.line_num, p.col_num);

        ExprType actual = p.expr_2.accept(mainVisitor.exprVisitor, ctx);
        ctx.addSubtypeConstraint(actual, retType, p.line_num, p.col_num);
        return null;
    }
}
