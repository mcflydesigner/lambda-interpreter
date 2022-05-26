package com.interpreter.runtime;

import com.interpreter.runtime.env.Environment;
import com.interpreter.runtime.env.value.Value;
import com.interpreter.runtime.imports.ImportManager;
import com.interpreter.runtime.imports.ImportManagerImpl;
import com.interpreter.runtime.visitor.AllVisitors;
import hardtyped.Absyn.*;

import java.util.List;

public class InterpreterImpl implements Interpreter {

    private final Environment environment = new Environment();

    @Override
    public List<Value> run(ListExpr exprs) {
        return exprs.stream().map(e -> e.accept(AllVisitors.exprVisitor, environment)).toList();
    }

}
