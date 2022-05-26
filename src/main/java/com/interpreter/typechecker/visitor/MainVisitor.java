package com.interpreter.typechecker.visitor;

import com.interpreter.typechecker.types.TypeConstraint;
import com.interpreter.typechecker.types.TypeContext;
import hardtyped.Absyn.*;

import java.util.List;


public class MainVisitor {

    public OpVisitor opVisitor = new OpVisitor(this);
    public RecordVisitor recordVisitor = new RecordVisitor(this);
    public TypeVisitor typeVisitor = new TypeVisitor(this);
    public FuncArgVisitor funcArgVisitor = new FuncArgVisitor(this);
    public VarDecVisitor varDecVisitor = new VarDecVisitor(this);
    public ExprVisitor exprVisitor = new ExprVisitor(this);
    public IfVisitor ifVisitor = new IfVisitor(this);

    public void visit(ListExpr exprs) {
        TypeContext ctx = new TypeContext();
        exprs.forEach(expr -> expr.accept(exprVisitor, ctx));

        List<TypeConstraint> constraints = ctx.getConstraints();
        for (var c : constraints) {
            System.out.println(c.toString());
        }
    }
}
