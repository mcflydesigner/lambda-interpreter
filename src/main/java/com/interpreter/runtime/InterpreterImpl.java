package com.interpreter.runtime;

import com.interpreter.exception.IllegalFunctionCallException;
import com.interpreter.exception.IncorrectFunctionArgumentException;
import com.interpreter.runtime.operation.BinaryOperationType;
import com.interpreter.runtime.operation.IoOperationHandler;
import com.interpreter.runtime.operation.OperationHandler;
import hardtyped.Absyn.*;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class InterpreterImpl implements Interpreter {

    private final Environment environment = new Environment();
    private final IoOperationHandler ioOperationHandler;

    public InterpreterImpl(PrintStream printStream) {
        this.ioOperationHandler = new IoOperationHandler(printStream);
    }

    @Override
    // TODO: rename
    public void run(ListExpr exprs) {
        exprs.forEach(this::executeStatements);
    }

    private void executeStatements(Expr expr) {
        if (expr instanceof Let let) {
            executeLet(let);
        } else if (expr instanceof PrintFunction printFunction) {
            executePrintFunction(printFunction);
        }


    }

    private void executeLet(Let let) {

        if (let.vardec_ instanceof TypedVar typedVar) {
            Value calculatedExpr = evaluateExpr(let.expr_);
            assertValueTypesEqual(ValueType.fromBnfType(typedVar.type_), calculatedExpr.getType());

            environment.declareVariableAndAssignValue(typedVar.ident_, calculatedExpr);
        } else if(let.vardec_ instanceof UntypedVar untypedVar) {
            Value calculatedExpr = evaluateExpr(let.expr_);

            environment.declareVariableAndAssignValue(untypedVar.ident_, calculatedExpr);
        } else {
            fail();
        }
    }

    private void executePrintFunction(PrintFunction printFunction) {

        Value calculatedExpr = evaluateExpr(printFunction.expr_);
        ioOperationHandler.handlePrint(calculatedExpr);
    }

    private Value evaluateExpr(Expr expr) {

        if (expr instanceof IntValue intValue) {
            return Value.ofInt(intValue.integer_);
        } else if (expr instanceof RealValue realValue) {
            return Value.ofReal(realValue.double_);
        } else if (expr instanceof StringValue stringValue) {
            return Value.ofString(stringValue.string_);
        } else if (expr instanceof AtomicExpression atomicExpression) {
            return environment.getVariableValue(atomicExpression.ident_);
        } else if (expr instanceof Sum sum) {
            Value firstOp = evaluateExpr(sum.expr_1);
            Value secondOp = evaluateExpr(sum.expr_2);

            return OperationHandler.handleBinaryOperation(BinaryOperationType.ADDITION, firstOp, secondOp);
        } else if (expr instanceof Substract substract) {
            Value firstOp = evaluateExpr(substract.expr_1);
            Value secondOp = evaluateExpr(substract.expr_2);

            return OperationHandler.handleBinaryOperation(BinaryOperationType.SUBTRACTION, firstOp, secondOp);
        } else if (expr instanceof Multiply multiply) {
            Value firstOp = evaluateExpr(multiply.expr_1);
            Value secondOp = evaluateExpr(multiply.expr_2);

            return OperationHandler.handleBinaryOperation(BinaryOperationType.MULTIPLICATION, firstOp, secondOp);
        } else if (expr instanceof Divide divide) {
            Value firstOp = evaluateExpr(divide.expr_1);
            Value secondOp = evaluateExpr(divide.expr_2);

            return OperationHandler.handleBinaryOperation(BinaryOperationType.DIVISION, firstOp, secondOp);
        } else if (expr instanceof ParenthesesExpression parenthesesExpression) {
            return evaluateExpr(parenthesesExpression.expr_);
        } else if (expr instanceof Function function) {
            return evaluateFunction(function);
        } else if (expr instanceof ApplyFunction applyFunction) {
            return executeFunction(applyFunction);
        }

        fail();
        return null;
    }

    private Value executeFunction(ApplyFunction applyFunction) {
        Value fun = evaluateExpr(applyFunction.expr_1);
        Value args = evaluateExpr(applyFunction.expr_2);

        if (!fun.getType().equals(ValueType.FUNCTION)) {
            throw new IllegalFunctionCallException(String.format(
                    "Cannot call a function via identifier '%s' because it has type %s",
                    fun.toString(),
                    fun.getType().toString()
            ));
        }

        FunctionValue functionValue = (FunctionValue) fun.getValue();
        LinkedHashMap<String, FunctionValue.FunctionParameter> funArgs =
                (LinkedHashMap<String, FunctionValue.FunctionParameter>) functionValue.getParameters();

        boolean isInitializedArg = false;
        for (String key : funArgs.keySet()) {
            if (isInitializedArg) {
                break;
            }

            FunctionValue.FunctionParameter functionParameter = funArgs.get(key);
            if(!functionParameter.isInitialized()) {
                if (!functionParameter.getType().equals(args.getType())) {
                    throw new IncorrectFunctionArgumentException(String.format(
                       "Incorrect argument passed to the function: expected %s, but got %s",
                       functionParameter.getType(),
                       args.getType()
                    ));
                }

                functionParameter.setBindValue(args.getValue());
                isInitializedArg = true;
            }
        }

        // High-order functions(function args are partially initialized by now)
        for (String key : funArgs.keySet()) {
            if(!funArgs.get(key).isInitialized()) {
                return fun;
            }
        }

        // Function args are fully initialized by now
        environment.pushScope();

        Map<String, Value> mappedFunArgs = funArgs.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().convertToValue()));

        environment.declareVariablesAndAssignValues(mappedFunArgs);

        // Execute body of the function
        InExpr body = functionValue.getBody();
        Value result = null;

        if (body instanceof MultipleExpressions multipleExpressions) {
            executeFunctionBody(multipleExpressions.inexpr_1);

            if (multipleExpressions.inexpr_2 instanceof InnerExpression innerExpression) {
                result = evaluateExpr(innerExpression.expr_);
            }
        } else if (body instanceof InnerExpression innerExpression) {
            result = evaluateExpr(innerExpression.expr_);
        }

        environment.flushScope();

        return result;
    }

    private void executeFunctionBody(InExpr body) {

        if (body instanceof MultipleExpressions multipleExpressions) {
            executeFunctionBody(multipleExpressions.inexpr_1);
            executeFunctionBody(multipleExpressions.inexpr_2);
        } else if (body instanceof InnerExpression innerExpression) {
            evaluateExpr(innerExpression.expr_);
        } else {
            fail();
        }
    }

    private Value evaluateFunction(Function function) {

        // Collect all arguments
        LinkedHashMap<String, FunctionValue.FunctionParameter> parameters = new LinkedHashMap<>();
        evaluateFunctionFunArg(parameters, function.funcarg_);

        FunctionValue result = new FunctionValue(parameters, function.inexpr_);

        return Value.ofFunction(result);
    }

    private void evaluateFunctionFunArg(
            LinkedHashMap<String, FunctionValue.FunctionParameter> parameters,
            FuncArg funcArg
        ) {

        if (funcArg instanceof MultipleArgs multipleArgs) {
            if (multipleArgs.vardec_ instanceof UntypedVar untypedVar) {
                throw new IncorrectFunctionArgumentException(String.format(
                        "Inside function declaration found untyped argument '%s'",
                        untypedVar.ident_
                ));
            }

            if (multipleArgs.vardec_ instanceof TypedVar typedVar && parameters.containsKey(typedVar.ident_)) {
                throw new IncorrectFunctionArgumentException(String.format(
                   "Inside function declaration parameter '%s' was declared more than once",
                   typedVar.ident_
                ));
            } else if (multipleArgs.vardec_ instanceof TypedVar typedVar && !parameters.containsKey(typedVar.ident_)) {
                parameters.put(typedVar.ident_, new FunctionValue.FunctionParameter(ValueType.fromBnfType(typedVar.type_)));
                evaluateFunctionFunArg(parameters, multipleArgs.funcarg_);
            } else {
                fail();
            }
        } else if (funcArg instanceof FinalArg finalArg) {
            if (finalArg.vardec_ instanceof UntypedVar untypedVar) {
                throw new IncorrectFunctionArgumentException(String.format(
                        "Inside function declaration found untyped argument '%s'",
                        untypedVar.ident_
                ));
            }

            if (finalArg.vardec_ instanceof TypedVar typedVar && parameters.containsKey(typedVar.ident_)) {
                throw new IncorrectFunctionArgumentException(String.format(
                        "Inside function declaration parameter '%s' was declared more than once",
                        typedVar.ident_
                ));
            } else if (finalArg.vardec_ instanceof TypedVar typedVar && !parameters.containsKey(typedVar.ident_)) {
                parameters.put(typedVar.ident_, new FunctionValue.FunctionParameter(ValueType.fromBnfType(typedVar.type_)));
            } else {
                fail();
            }
        }

    }


    private void fail() {
        throw new IllegalStateException("Reached fail point");
    }

    private void assertValueTypesEqual(ValueType expected, ValueType actual) {

        if(!expected.equals(actual)) {
            throw new IllegalStateException(String.format(
                    "Expected type %s, but got actual type %s",
                    expected,
                    actual
            ));
        }
    }

//    private void assertGrammar(Class<?> expected, Expr actual) {
//
//        if(!actual.getClass().equals(expected)) {
//            throw new IllegalStateException(String.format(
//                    "Actual type %s differs from expected one %s",
//                        actual.getClass(),
//                        expected
//                    ));
//        }
//    }

}
