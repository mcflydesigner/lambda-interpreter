package com.interpreter.runtime.visitor;

import com.google.common.collect.Streams;
import com.interpreter.exception.DeclarationErrorException;
import com.interpreter.exception.IllegalFunctionCallException;
import com.interpreter.exception.IncorrectFunctionArgumentException;
import com.interpreter.runtime.Environment;
import com.interpreter.runtime.FunctionValue;
import com.interpreter.runtime.Value;
import com.interpreter.runtime.ValueType;
import hardtyped.Absyn.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExprVisitor implements Expr.Visitor<Value, Environment> {

    @Override
    public Value visit(Exprs p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(Variable p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(Import p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(Import1 p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(LetVariable p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(LetInference p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(LetRec p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(LetType p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(Function p, Environment arg) {

        LinkedHashMap<String, FunctionValue.FunctionParameter> args = parseFunctionArguments(p.listfuncarg_);
        return Value.ofFunction(new FunctionValue(args, p.listexpr_));
    }

    @Override
    public Value visit(FunctionApplication p, Environment arg) {
        LinkedHashMap<String, FunctionValue.FunctionParameter> args = parseFunctionArguments(p.listfuncarg_);
        Value function = Value.ofFunction(new FunctionValue(args, p.listexpr_));
        List<Value> evaluatedArgs = p.listexprsequence_.stream().map(e -> e.accept(AllVisitors.exprSequenceVisitor, arg)).toList();
        return evaluateFunction(function, evaluatedArgs, arg);
    }

    @Override
    public Value visit(FunctionWithReturnType p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(Application p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(PrintFunction p, Environment arg) {
        p.expr_.accept(this, arg);
        return Value.ofUnit();
    }

    @Override
    public Value visit(ReadRealFunction p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(ReadIntFunction p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(ReadStringFunction p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(ReadBoolFunction p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(IfStmt p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(Operation p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(IntValue p, Environment arg) {
        return Value.ofInt(p.integer_);
    }

    @Override
    public Value visit(RealValue p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(StringValue p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(BoolValue p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(UnitValue p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(RecordConstr p, Environment arg) {
        return null;
    }

//    @Override
//    public Value visit(ApplyFunction p, Environment arg) {
//        Value value = p.expr_.accept(this, arg);
//        //Value args = p.vardec_.accept(this, arg);
//
//        return switch (value.getType()) {
//            case FUNCTION -> handleFunction(value);
//            case STRING -> {
//                Value fun = arg.getVariableValue((String)value.getValue());
//                yield handleFunction(fun);
//            }
//            default -> throw new IllegalFunctionCallException(String.format(
//                            "Cannot call a function via identifier '%s' because it has type %s",
//                            value.toString(),
//                            value.getType().toString()
//                        ));
//        };
//    }

    private Value evaluateFunction(Value fun, List<Value> userArgs, Environment environment) {
        if (!fun.getType().equals(ValueType.FUNCTION)) {
            throw new IllegalFunctionCallException(String.format(
                    "Cannot call a function via identifier '%s' because it has type %s",
                    fun.toString(),
                    fun.getType().toString()
            ));
        }

        FunctionValue funValue = (FunctionValue) fun.getValue();
        LinkedHashMap<String, FunctionValue.FunctionParameter> funArgs =
                (LinkedHashMap<String, FunctionValue.FunctionParameter>) funValue.getParameters();

        List<FunctionValue.FunctionParameter> funArgsList =
                funArgs.values().stream().filter(e -> !e.isInitialized()).toList();

        if (userArgs.size() > funArgsList.size()) {
            throw new IncorrectFunctionArgumentException(String.format(
                    "Too many arguments passed for function. Expected %d, but got %d",
                    funArgsList.size(),
                    userArgs.size()
            ));
        }

        Streams.zip(funArgsList.stream(), userArgs.stream(), (funArg, userArg) -> {
            if (!funArg.getType().equals(userArg.getType())) {
                throw new IncorrectFunctionArgumentException(String.format(
                        "Incorrect type of argument passed to the function: expected %s, but got %s",
                        funArg.getType(),
                        userArg.getType()
                ));
            }

            funArg.setBindValue(userArg.getValue());
            return funArg;
        }).collect(Collectors.toList());

        // High-order functions(function args are partially initialized by now)
        for (FunctionValue.FunctionParameter param : funArgs.values()) {
            if(!param.isInitialized()) {
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
        List<Value> resBody = funValue.getBody().stream().map(e -> e.accept(this, environment)).toList();
        return resBody.get(resBody.size() - 1);
    }

    private LinkedHashMap<String, FunctionValue.FunctionParameter> parseFunctionArguments(List<FuncArg> listFuncArg) {

        LinkedHashMap<String, FunctionValue.FunctionParameter> args = new LinkedHashMap<>();
        listFuncArg.stream().map(e -> e.accept(AllVisitors.funcArgVisitor, null)).forEach(pair -> {
                    if (args.containsKey(pair.a)) {
                        throw new DeclarationErrorException(String.format(
                                "Inside function declaration parameter '%s' is declared more than once",
                                pair.a
                        ));
                    }

                    args.put(pair.a, new FunctionValue.FunctionParameter(ValueType.fromBnfType(pair.b)));
                }
        );

        return args;
    }

//    @Override
//    public Value visit(Not p, Environment arg) {
//        return OperationHandler.handleUnaryOperation(
//                UnaryOperationType.NOT,
//                p.expr_.accept(this, arg)
//        );
//    }
//
//    @Override
//    public Value visit(More p, Environment arg) {
//        return OperationHandler.handleBinaryOperation(
//                BinaryOperationType.GREATER,
//                p.expr_1.accept(this, arg),
//                p.expr_2.accept(this, arg)
//        );
//    }


}
