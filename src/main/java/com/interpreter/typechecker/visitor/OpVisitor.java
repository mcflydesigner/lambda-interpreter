package com.interpreter.typechecker.visitor;

import com.interpreter.exception.IllegalArgumentsOperationException;
import com.interpreter.typechecker.types.TypeContext;
import com.interpreter.typechecker.types.ExprType;
import hardtyped.Absyn.*;
import hardtyped.PrettyPrinter;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import static com.interpreter.typechecker.types.ExprType.*;
import static com.interpreter.typechecker.types.ExprType.real;

public class OpVisitor implements Op.Visitor<ExprType, TypeContext> {

    MainVisitor mainVisitor;
    public OpVisitor(MainVisitor mainVisitor) {
        this.mainVisitor = mainVisitor;
    }

    private ExprType checkForEquality(Op p, ExprType left, ExprType right, Set<ExprType> allowed) {
        boolean wellTyped = Objects.equals(left, right) && allowed.containsAll(List.of(left, right));
        if (!wellTyped) {
            throw new IllegalArgumentsOperationException(String.format("Illegal types for the operation %s",
                    PrettyPrinter.print(p)));
        }
        return left;
    }

    private ExprType checkIfAllowed(Op p, ExprType left, Set<ExprType> allowed) {
        boolean wellTyped = allowed.contains(left);
        if (!wellTyped) {
            throw new IllegalArgumentsOperationException(String.format("Illegal type for the operation %s",
                    PrettyPrinter.print(p)));
        }
        return left;
    }

    @Override
    public ExprType visit(Sum p, TypeContext ctx) {
        ExprType left = p.expr_1.accept(this.mainVisitor.exprVisitor, ctx);
        ExprType right = p.expr_2.accept(this.mainVisitor.exprVisitor, ctx);

        ctx.addEqualityConstraint(left, right, p.line_num, p.col_num);

        return left;
    }

    @Override
    public ExprType visit(Substract p, TypeContext ctx) {
        ExprType left = p.expr_1.accept(this.mainVisitor.exprVisitor, ctx);
        ExprType right = p.expr_2.accept(this.mainVisitor.exprVisitor, ctx);

        ctx.addEqualityConstraint(left, right, p.line_num, p.col_num);

        return left;
    }

    @Override
    public ExprType visit(Multiply p, TypeContext ctx) {
        ExprType left = p.expr_1.accept(this.mainVisitor.exprVisitor, ctx);
        ExprType right = p.expr_2.accept(this.mainVisitor.exprVisitor, ctx);

        ctx.addEqualityConstraint(left, right, p.line_num, p.col_num);

        return left;
    }

    @Override
    public ExprType visit(Divide p, TypeContext ctx) {
        ExprType left = p.expr_1.accept(this.mainVisitor.exprVisitor, ctx);
        ExprType right = p.expr_2.accept(this.mainVisitor.exprVisitor, ctx);

        ctx.addEqualityConstraint(left, right, p.line_num, p.col_num);

        return left;
    }

    @Override
    public ExprType visit(And p, TypeContext ctx) {
        ExprType left = p.expr_1.accept(this.mainVisitor.exprVisitor, ctx);
        ExprType right = p.expr_2.accept(this.mainVisitor.exprVisitor, ctx);

        ctx.addEqualityConstraint(left, right, p.line_num, p.col_num);

        return bool();
    }

    @Override
    public ExprType visit(Or p, TypeContext ctx) {
        ExprType left = p.expr_1.accept(this.mainVisitor.exprVisitor, ctx);
        ExprType right = p.expr_2.accept(this.mainVisitor.exprVisitor, ctx);

        ctx.addEqualityConstraint(left, right, p.line_num, p.col_num);

        return bool();
    }

    @Override
    public ExprType visit(Not p, TypeContext ctx) {
        ExprType left = p.expr_.accept(this.mainVisitor.exprVisitor, ctx);

        return bool();
    }

    @Override
    public ExprType visit(More p, TypeContext ctx) {
        ExprType left = p.expr_1.accept(this.mainVisitor.exprVisitor, ctx);
        ExprType right = p.expr_2.accept(this.mainVisitor.exprVisitor, ctx);

        ctx.addEqualityConstraint(left, right, p.line_num, p.col_num);

        return bool();
    }

    @Override
    public ExprType visit(MoreEql p, TypeContext ctx) {
        ExprType left = p.expr_1.accept(this.mainVisitor.exprVisitor, ctx);
        ExprType right = p.expr_2.accept(this.mainVisitor.exprVisitor, ctx);

        ctx.addEqualityConstraint(left, right, p.line_num, p.col_num);

        return bool();
    }

    @Override
    public ExprType visit(Eql p, TypeContext ctx) {
        ExprType left = p.expr_1.accept(this.mainVisitor.exprVisitor, ctx);
        ExprType right = p.expr_2.accept(this.mainVisitor.exprVisitor, ctx);

        ctx.addEqualityConstraint(left, right, p.line_num, p.col_num);

        return bool();
    }

    @Override
    public ExprType visit(NotEql p, TypeContext ctx) {
        ExprType left = p.expr_1.accept(this.mainVisitor.exprVisitor, ctx);
        ExprType right = p.expr_2.accept(this.mainVisitor.exprVisitor, ctx);

        ctx.addEqualityConstraint(left, right, p.line_num, p.col_num);

        return bool();
    }

    @Override
    public ExprType visit(LessEql p, TypeContext ctx) {
        ExprType left = p.expr_1.accept(this.mainVisitor.exprVisitor, ctx);
        ExprType right = p.expr_2.accept(this.mainVisitor.exprVisitor, ctx);

        ctx.addEqualityConstraint(left, right, p.line_num, p.col_num);

        return bool();
    }

    @Override
    public ExprType visit(Less p, TypeContext ctx) {
        ExprType left = p.expr_1.accept(this.mainVisitor.exprVisitor, ctx);
        ExprType right = p.expr_2.accept(this.mainVisitor.exprVisitor, ctx);

        ctx.addEqualityConstraint(left, right, p.line_num, p.col_num);

        return bool();
    }

    @Override
    public ExprType visit(UnaryPlus p, TypeContext ctx) {
        ExprType left = p.expr_.accept(this.mainVisitor.exprVisitor, ctx);

        return left;
    }

    @Override
    public ExprType visit(UnaryMinus p, TypeContext ctx) {
        ExprType left = p.expr_.accept(this.mainVisitor.exprVisitor, ctx);

        return left;
    }
}
