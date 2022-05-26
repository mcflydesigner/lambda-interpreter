package com.interpreter.runtime.visitor;

import com.interpreter.exception.IncorrectDeclarationException;
import com.interpreter.exception.LineColPair;
import com.interpreter.runtime.env.Environment;
import com.interpreter.runtime.env.value.Value;
import com.interpreter.runtime.env.value.ValueType;
import hardtyped.Absyn.If;
import hardtyped.Absyn.IfExpr;

public class IfExprVisitor implements IfExpr.Visitor<Value, Environment> {

    @Override
    public Value visit(If p, Environment arg) {
        Value conditionRes = p.expr_1.accept(AllVisitors.exprVisitor, arg);

        if (!conditionRes.getType().equals(ValueType.BOOL)) {
            throw new IncorrectDeclarationException(String.format(
                    "Incorrect result of condition evaluation: expected type %s, but got %s",
                    ValueType.BOOL,
                    conditionRes.getType()),
                    conditionRes.getLineColPair());
        }

        if((Boolean) conditionRes.getValue()) {
            return p.expr_2.accept(AllVisitors.exprVisitor, arg);
        }

        return null;
    }
}
