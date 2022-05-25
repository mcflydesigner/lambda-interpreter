package com.interpreter.runtime.visitor;

import com.interpreter.runtime.Environment;
import com.interpreter.runtime.Value;
import com.interpreter.runtime.operation.BinaryOperationType;
import com.interpreter.runtime.operation.OperationHandler;
import hardtyped.Absyn.*;

public class OpVisitor implements Op.Visitor<Value, Environment> {

    @Override
    public Value visit(Sum p, Environment arg) {

        Value op1 = p.expr_1.accept(AllVisitors.exprVisitor, arg);
        Value op2 = p.expr_2.accept(AllVisitors.exprVisitor, arg);
        return OperationHandler.handleBinaryOperation(
                BinaryOperationType.ADDITION,
                op1,
                op2
        );
    }

    @Override
    public Value visit(Substract p, Environment arg) {

        Value op1 = p.expr_1.accept(AllVisitors.exprVisitor, arg);
        Value op2 = p.expr_2.accept(AllVisitors.exprVisitor, arg);
        return OperationHandler.handleBinaryOperation(
                BinaryOperationType.SUBTRACTION,
                op1,
                op2
        );
    }

    @Override
    public Value visit(Multiply p, Environment arg) {

        Value op1 = p.expr_1.accept(AllVisitors.exprVisitor, arg);
        Value op2 = p.expr_2.accept(AllVisitors.exprVisitor, arg);
        return OperationHandler.handleBinaryOperation(
                BinaryOperationType.MULTIPLICATION,
                op1,
                op2
        );
    }

    @Override
    public Value visit(Divide p, Environment arg) {

        Value op1 = p.expr_1.accept(AllVisitors.exprVisitor, arg);
        Value op2 = p.expr_2.accept(AllVisitors.exprVisitor, arg);
        return OperationHandler.handleBinaryOperation(
                BinaryOperationType.DIVISION,
                op1,
                op2
        );
    }

    @Override
    public Value visit(And p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(Or p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(Not p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(More p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(MoreEql p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(Eql p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(NotEql p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(LessEql p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(Less p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(UnaryPlus p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(UnaryMinus p, Environment arg) {
        return null;
    }
}
