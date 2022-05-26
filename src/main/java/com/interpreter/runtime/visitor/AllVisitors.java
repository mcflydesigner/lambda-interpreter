package com.interpreter.runtime.visitor;

public class AllVisitors {

    public static final FuncArgVisitor funcArgVisitor = new FuncArgVisitor();
    public static final ExprSequenceVisitor exprSequenceVisitor = new ExprSequenceVisitor();
    public static final ExprVisitor exprVisitor = new ExprVisitor();
    public static final VarDecVisitor varDecVisitor = new VarDecVisitor();
    public static final OpVisitor opVisitor = new OpVisitor();
    public static final TypeVisitor typeVisitor = new TypeVisitor();
    public static final IfExprVisitor ifExprVisitor = new IfExprVisitor();
    public static final ElseExprVisitor elseExprVisitor = new ElseExprVisitor();
    public static final RecordElemVisitor recordElemVisitor = new RecordElemVisitor();
}
