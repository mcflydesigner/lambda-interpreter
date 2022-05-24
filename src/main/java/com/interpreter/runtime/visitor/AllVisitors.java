package com.interpreter.runtime.visitor;

public class AllVisitors {

    public static final FuncArgVisitor funcArgVisitor = new FuncArgVisitor();
    public static final ExprSequenceVisitor exprSequenceVisitor = new ExprSequenceVisitor();
    public static final ExprVisitor exprVisitor = new ExprVisitor();
}
