package com.interpreter.runtime.visitor;

import com.google.common.collect.Streams;
import com.interpreter.exception.DeclarationErrorException;
import com.interpreter.exception.IllegalFunctionCallException;
import com.interpreter.exception.IncorrectDeclarationException;
import com.interpreter.exception.IncorrectFunctionArgumentException;
import com.interpreter.runtime.env.Environment;
import com.interpreter.runtime.env.value.FunctionValue;
import com.interpreter.runtime.env.value.RecordValue;
import com.interpreter.runtime.env.value.Value;
import com.interpreter.runtime.env.value.ValueType;
import com.interpreter.runtime.libs.std.IoOperationHandler;
import com.interpreter.runtime.utils.DeepCopy;
import hardtyped.Absyn.*;
import org.antlr.v4.runtime.misc.Pair;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ExprVisitor implements Expr.Visitor<Value, Environment> {

    @Override
    public Value visit(Exprs p, Environment arg) {
        List<Value> result = p.listexpr_.stream().map(e -> e.accept(this, arg)).toList();
        return result.get(result.size() - 1);
    }

    @Override
    public Value visit(Variable p, Environment arg) {
        return arg.getVariableValue(p.ident_);
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

        Pair<String, Type> declInfo = p.vardec_.accept(AllVisitors.varDecVisitor, arg);

        if (!arg.isCurrentScopeGlobal()) {
            throw new IncorrectDeclarationException(String.format(
                    "You cannot declare global variable '%s' not in global scope",
                    declInfo.a
            ));
        }

        Value val = p.expr_.accept(this, arg);
        arg.declareVariableAndAssignValue(declInfo.a, val);

        return Value.ofUnit();
    }

    @Override
    public Value visit(LetInference p, Environment arg) {

        Pair<String, Type> declInfo = p.vardec_.accept(AllVisitors.varDecVisitor, arg);

        arg.pushScope();

        Value value = p.expr_1.accept(this, arg);
        arg.declareVariableAndAssignValue(declInfo.a, value);
        Value result = p.expr_2.accept(this, arg);

        arg.flushScope();

        return result;
    }

    @Override
    public Value visit(LetRec p, Environment arg) {

        Pair<String, Type> declInfo = p.vardec_.accept(AllVisitors.varDecVisitor, arg);
        if (!arg.isCurrentScopeGlobal()) {
            throw new IncorrectDeclarationException(String.format(
                    "You cannot declare global variable '%s' not in global scope",
                    declInfo.a
            ));
        }

        Value value = p.expr_.accept(this, arg);
        if(!value.getType().equals(ValueType.FUNCTION)) {
            throw new IncorrectDeclarationException(String.format(
                    "Expression letrec must have type on right side %s, but got %s",
                    ValueType.FUNCTION,
                    value.getValue()
            ));
        }

        // Update context of the recursive function
        FunctionValue functionValue = (FunctionValue) value.getValue();
        functionValue.getCapturedContext().declareVariableAndAssignValue(declInfo.a, value);

        arg.declareVariableAndAssignValue(declInfo.a, value);
        return value;
    }

    @Override
    public Value visit(LetRecInference p, Environment arg) {

        Pair<String, Type> declInfo = p.vardec_.accept(AllVisitors.varDecVisitor, arg);

        Value func = p.expr_1.accept(this, arg);
        if(!func.getType().equals(ValueType.FUNCTION)) {
            throw new IncorrectDeclarationException(String.format(
                    "Construction 'letrec in' must have type on right side %s, but got %s",
                    ValueType.FUNCTION,
                    func.getValue()
            ));
        }

        // Update context of the recursive function
        FunctionValue functionValue = (FunctionValue) func.getValue();
        functionValue.getCapturedContext().declareVariableAndAssignValue(declInfo.a, func);

        arg.pushScope();
        arg.declareVariableAndAssignValue(declInfo.a, func);

        Value result = p.expr_2.accept(this, arg);
        arg.flushScope();

        return result;
    }

    @Override
    public Value visit(LetType p, Environment arg) {

        Pair<String, Type> declInfo = p.vardec_.accept(AllVisitors.varDecVisitor, arg);
        if (!arg.isCurrentScopeGlobal()) {
            throw new IncorrectDeclarationException(String.format(
                    "You cannot declare global alias '%s' being not in global scope",
                    declInfo.a
            ));
        }

        ValueType valueType = p.type_.accept(AllVisitors.typeVisitor, arg);
        Value value = Value.ofUserTypeAlias(valueType);
        arg.declareVariableAndAssignValue(declInfo.a, value);
        return value;
    }

    @Override
    public Value visit(LetTypeInference p, Environment arg) {

        // ignore p.type_ as it's only for type checker
        Pair<String, Type> declInfo = p.vardec_.accept(AllVisitors.varDecVisitor, arg);

        arg.pushScope();
        ValueType valueType = p.type_.accept(AllVisitors.typeVisitor, arg);
        arg.declareVariableAndAssignValue(declInfo.a, Value.ofUserTypeAlias(valueType));

        Value result = p.expr_.accept(this, arg);
        arg.flushScope();

        return result;
    }

    @Override
    public Value visit(Function p, Environment arg) {

        LinkedHashMap<String, FunctionValue.FunctionParameter> args = parseFunctionArguments(p.listfuncarg_, arg);
        return Value.ofFunction(new FunctionValue(args, p.listexpr_, (Environment) DeepCopy.perform(arg)));
    }

    @Override
    public Value visit(FunctionApplication p, Environment arg) {

        LinkedHashMap<String, FunctionValue.FunctionParameter> args = parseFunctionArguments(p.listfuncarg_, arg);
        Value fun = Value.ofFunction(new FunctionValue(args, p.listexpr_, (Environment) DeepCopy.perform(arg)));
        List<Value> evaluatedArgs = p.listexprsequence_.stream()
                .map(e -> e.accept(AllVisitors.exprSequenceVisitor, arg))
                .toList();

        return evaluateFunction((Value) DeepCopy.perform(fun), evaluatedArgs, arg);
    }

    @Override
    public Value visit(FunctionWithReturnType p, Environment arg) {
        // p.type_ is ignored since it's only for type checker
        LinkedHashMap<String, FunctionValue.FunctionParameter> args = parseFunctionArguments(p.listfuncarg_, arg);
        return Value.ofFunction(new FunctionValue(args, p.listexpr_, (Environment) DeepCopy.perform(arg)));
    }

    @Override
    public Value visit(Application p, Environment arg) {

        Value fun = p.expr_.accept(this, arg);
        List<Value> evaluatedArgs = p.listexprsequence_.stream()
                .map(e -> e.accept(AllVisitors.exprSequenceVisitor, arg))
                .toList();

        return evaluateFunction((Value) DeepCopy.perform(fun), evaluatedArgs, arg);
    }

    @Override
    public Value visit(PrintFunction p, Environment arg) {

        IoOperationHandler.handlePrint(p.expr_.accept(this, arg));
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
    public Value visit(ArrowExpr p, Environment arg) {
        return null;
    }

    @Override
    public Value visit(DotExpr p, Environment arg) {
        Value expr = p.expr_.accept(this, arg);

        // TODO: handle imports
        return switch (expr.getType()) {
            case RECORD -> {
                RecordValue recordValue = (RecordValue) expr.getValue();
                yield  recordValue.getValue(p.ident_);
            }

            default ->
                throw new IllegalArgumentException(String.format(
                        "Incorrect record element access: expected type %s, but got %s",
                        ValueType.RECORD,
                        expr.getType()
                ));
        };
    }

    @Override
    public Value visit(IfStmt p, Environment arg) {

        Value result = null;
        for (IfExpr ifExpr : p.listifexpr_) {
            result = ifExpr.accept(AllVisitors.ifExprVisitor, arg);
            if (result != null) {
                break;
            }
        }

        if (result != null) {
            return result;
        }

        return p.elseexpr_.accept(AllVisitors.elseExprVisitor, arg);
    }

    @Override
    public Value visit(Operation p, Environment arg) {
        return p.op_.accept(AllVisitors.opVisitor, arg);
    }

    @Override
    public Value visit(IntValue p, Environment arg) {
        return Value.ofInt(p.integer_);
    }

    @Override
    public Value visit(RealValue p, Environment arg) {
        return Value.ofReal(p.double_);
    }

    @Override
    public Value visit(StringValue p, Environment arg) {
        return Value.ofString(p.string_);
    }

    @Override
    public Value visit(BoolValue p, Environment arg) {

        Set<String> allowedValues = Set.of("true", "false");
        if (!allowedValues.contains(p.bool_)) {
            throw new IncorrectDeclarationException(String.format(
                    "Boolean value can take only values: %s, but got %s",
                    String.join(",", allowedValues),
                    p.bool_
            ));
        }

        return Value.ofBool(Boolean.parseBoolean(p.bool_));
    }

    @Override
    public Value visit(UnitValue p, Environment arg) {
        return Value.ofUnit();
    }

    @Override
    public Value visit(RecordConst p, Environment arg) {

        List<Pair<String, Value>> recordEntries
                = p.listrecordelem_.stream().map(e -> e.accept(AllVisitors.recordElemVisitor, arg)).toList();
        return Value.ofRecord(recordEntries);
    }


    private Value evaluateFunction(Value fun, List<Value> userArgs, Environment arg) {

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

        Environment environment = (Environment) DeepCopy.perform(funValue.getCapturedContext());

        List<FunctionValue.FunctionParameter> funParams = Streams.zip(funArgsList.stream(), userArgs.stream(), (funArg, userArg) -> {
            if (!funArg.getType().equals(ValueType.ANY) && !funArg.getType().equals(userArg.getType())) {
                throw new IncorrectFunctionArgumentException(String.format(
                        "Incorrect type of argument passed to the function: expected %s, but got %s",
                        funArg.getType(),
                        userArg.getType()
                ));
            }

            if (funArg.getType().equals(ValueType.ANY)) {
                funArg.setConcreteType(userArg.getType());
            }

            funArg.setBindValue(userArg.getValue());
            return funArg;
        }).toList();

        for (FunctionValue.FunctionParameter param : funArgs.values()) {
            if(!param.isInitialized()) {
                // High-order functions(function is partially initialized by now)
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

        environment.flushScope();

        return resBody.get(resBody.size() - 1);
    }

    private LinkedHashMap<String, FunctionValue.FunctionParameter> parseFunctionArguments(
            List<FuncArg> listFuncArg,
            Environment environment) {

        LinkedHashMap<String, FunctionValue.FunctionParameter> args = new LinkedHashMap<>();
        listFuncArg.stream().map(e -> e.accept(AllVisitors.funcArgVisitor, null)).forEach(pair -> {
                    if (args.containsKey(pair.a)) {
                        throw new DeclarationErrorException(String.format(
                                "Inside function declaration parameter '%s' is declared more than once",
                                pair.a
                        ));
                    }

                    args.put(pair.a, new FunctionValue.FunctionParameter(pair.b.accept(AllVisitors.typeVisitor, environment)));
                }
        );

        return args;
    }


}
