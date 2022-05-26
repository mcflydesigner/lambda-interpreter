package com.interpreter.typechecker.visitor;

import com.interpreter.runtime.imports.ImportManager;
import com.interpreter.runtime.imports.ImportManagerImpl;
import com.interpreter.typechecker.types.TypeContext;
import hardtyped.Absyn.*;



public class MainVisitor {

    public boolean printTypes = false;

    public static final ImportManager importManager = new ImportManagerImpl();

    public OpVisitor opVisitor = new OpVisitor(this);
    public RecordVisitor recordVisitor = new RecordVisitor(this);
    public TypeVisitor typeVisitor = new TypeVisitor(this);
    public FuncArgVisitor funcArgVisitor = new FuncArgVisitor(this);
    public VarDecVisitor varDecVisitor = new VarDecVisitor(this);
    public ExprVisitor exprVisitor = new ExprVisitor(this);
    public IfVisitor ifVisitor = new IfVisitor(this);

    public void visit(ListExpr exprs) {
        TypeContext ctx = new TypeContext(printTypes);
        exprs.forEach(expr -> expr.accept(exprVisitor, ctx));
    }
}
