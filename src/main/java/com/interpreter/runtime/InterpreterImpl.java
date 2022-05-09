package com.interpreter.runtime;

import com.interpreter.runtime.environment.Environment;
import hardtyped.Absyn.Expr;
import hardtyped.Absyn.Let;
import hardtyped.Absyn.ListExpr;

public class InterpreterImpl implements Interpreter {

    private final Environment environment = new Environment();

    @Override
    public void run(ListExpr exprs) {
        exprs.forEach(this::parseExpr);
    }

    private void parseExpr(Expr expr) {
        if (expr instanceof Let) {
            parseLet(expr);
        }

    }

    private void parseLet(Expr expr) {
        assertGrammar(Let.class, expr);


    }



    private void assertGrammar(Class<?> expected, Expr actual) {
        if(!actual.getClass().equals(expected)) {
            throw new IllegalStateException(String.format(
                    "Actual type %s differs from expected one %s",
                        actual.getClass(),
                        expected
                    ));
        }
    }

}
