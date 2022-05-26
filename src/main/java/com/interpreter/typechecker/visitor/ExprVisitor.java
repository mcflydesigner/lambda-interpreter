package com.interpreter.typechecker.visitor;

import com.interpreter.typechecker.types.FunctionType;
import com.interpreter.typechecker.types.IdTypePair;
import com.interpreter.typechecker.types.TypeContext;
import com.interpreter.typechecker.types.ExprType;
import hardtyped.Absyn.*;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ExprVisitor implements Expr.Visitor<ExprType, TypeContext>,
        ExprSequence.Visitor<ExprType, TypeContext> {

    MainVisitor mainVisitor;
    public ExprVisitor(MainVisitor mainVisitor) {
        this.mainVisitor = mainVisitor;
    }

    @Override
    public ExprType visit(Import p, TypeContext arg) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ExprType visit(Import1 p, TypeContext arg) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ExprType visit(ArrowExpr p, TypeContext arg) {
        throw new UnsupportedOperationException();
    }

    private ExprType visitExprs(List<Expr> exprs, TypeContext ctx) {
        for (int i = 0; i < exprs.size() - 1; i++) {
            exprs.get(i).accept(this, ctx);
        }
        return exprs.get(exprs.size() - 1).accept(this, ctx);
    }

    @Override
    public ExprType visit(Exprs p, TypeContext ctx) {
        return visitExprs(p.listexpr_, ctx);
    }

    @Override
    public ExprType visit(Variable p, TypeContext ctx) {
        return ctx.getType(p.ident_);
    }

    @Override
    public ExprType visit(LetVariable p, TypeContext ctx) {
        IdTypePair pair = p.vardec_.accept(mainVisitor.varDecVisitor, ctx);
        ExprType actualType = p.expr_.accept(mainVisitor.exprVisitor, ctx);
        ctx.addSubtypeConstraint(actualType, pair.b, p.line_num, p.col_num);

        ctx.addGlobalType(pair.a, pair.b);
        return ExprType.unit();
    }

    @Override
    public ExprType visit(LetInference p, TypeContext ctx) {
        IdTypePair pair = p.vardec_.accept(mainVisitor.varDecVisitor, ctx);
        ExprType actualType = p.expr_1.accept(mainVisitor.exprVisitor, ctx);
        ctx.addSubtypeConstraint(actualType, pair.b, p.line_num, p.col_num);

        ctx.addType(pair.a, pair.b);
        ExprType retType = p.expr_2.accept(mainVisitor.exprVisitor, ctx);
        ctx.removeType();

        return retType;
    }

    @Override
    public ExprType visit(LetRec p, TypeContext ctx) {
        IdTypePair pair = p.vardec_.accept(mainVisitor.varDecVisitor, ctx);
        if (pair.b.getType() == ExprType.Type.TYPEVAR) {
            throw new IllegalStateException("Type for recursive functions should be specified. Recursive types are not allowed");
        }
        ctx.addGlobalType(pair.a, pair.b);
        ExprType actualType = p.expr_.accept(mainVisitor.exprVisitor, ctx);
        ctx.addSubtypeConstraint(actualType, pair.b, p.line_num, p.col_num);

        return ExprType.unit();
    }

    @Override
    public ExprType visit(LetRecInference p, TypeContext ctx) {
        IdTypePair pair = p.vardec_.accept(mainVisitor.varDecVisitor, ctx);
        if (pair.b.getType() == ExprType.Type.TYPEVAR) {
            throw new IllegalStateException("Type for recursive functions should be specified. Recursive types are not allowed");
        }
        ctx.addType(pair.a, pair.b);
        ExprType actualType = p.expr_1.accept(mainVisitor.exprVisitor, ctx);
        ctx.addSubtypeConstraint(actualType, pair.b, p.line_num, p.col_num);
        ExprType retType = p.expr_2.accept(mainVisitor.exprVisitor, ctx);
        ctx.removeType();

        return retType;
    }

    @Override
    public ExprType visit(LetType p, TypeContext ctx) {
        IdTypePair pair = p.vardec_.accept(mainVisitor.varDecVisitor, ctx);
        ExprType newType = p.type_.accept(mainVisitor.typeVisitor, ctx);

        ctx.addGlobalUserType(pair.a, newType);
        return ExprType.unit();
    }

    @Override
    public ExprType visit(LetTypeInference p, TypeContext ctx) {
        IdTypePair pair = p.vardec_.accept(mainVisitor.varDecVisitor, ctx);
        ExprType newType = p.type_.accept(mainVisitor.typeVisitor, ctx);

        ctx.addUserType(pair.a, newType);
        ExprType retType = p.expr_.accept(mainVisitor.exprVisitor, ctx);
        ctx.removeUserType();

        return retType;
    }

    private ExprType visitFunction(List<FuncArg> funcArgs, List<Expr> exprs,
                                   ExprType declaredType, TypeContext ctx, int line_num, int col_num) {
        Deque<IdTypePair> args = new ArrayDeque<>();
        funcArgs.forEach(fa -> args.add(fa.accept(mainVisitor.funcArgVisitor, ctx)));

        args.forEach(arg -> ctx.addType(arg.a, arg.b));
        ExprType retType = visitExprs(exprs, ctx);
        args.forEach(arg -> ctx.removeType());

        ctx.addSubtypeConstraint(retType, declaredType, line_num, col_num);

        List<ExprType> funType = new ArrayList<>(args.stream().map(p -> p.b).toList());
        funType.add(retType);
        return ExprType.functionFromList(funType);
    }

    @Override
    public ExprType visit(Function p, TypeContext ctx) {
        return visitFunction(p.listfuncarg_, p.listexpr_, ExprType.typeVariable(), ctx, p.line_num, p.col_num);
    }

    @Override
    public ExprType visit(FunctionApplication p, TypeContext ctx) {
        Application app = new Application(new Function(p.listfuncarg_, p.listexpr_), p.listexprsequence_);
        return app.accept(this, ctx);
    }

    @Override
    public ExprType visit(FunctionWithReturnType p, TypeContext ctx) {
        ExprType declaredType = p.type_.accept(mainVisitor.typeVisitor, ctx);
        return visitFunction(p.listfuncarg_, p.listexpr_, declaredType, ctx, p.line_num, p.col_num);
    }

    @Override
    public ExprType visit(Application p, TypeContext ctx) {
        List<ExprType> args = new ArrayList<>();
        p.listexprsequence_.forEach(expr -> args.add(expr.accept(this, ctx)));

        List<ExprType> funcTypes = new ArrayList<>(args.stream().map(a -> (ExprType) ExprType.typeVariable()).toList());
        for (int i = 0; i < args.size(); i++) {
            ctx.addSubtypeConstraint(args.get(i), funcTypes.get(i), p.line_num, p.col_num);
        }

        funcTypes.add(ExprType.typeVariable());
        ExprType funType = ExprType.functionFromList(funcTypes);
        ExprType applicantType = p.expr_.accept(this, ctx);
        ctx.addSubtypeConstraint(applicantType, funType, p.line_num, p.col_num);

        return funcTypes.get(funcTypes.size()-1);
    }

    @Override
    public ExprType visit(PrintFunction p, TypeContext arg) {
        p.expr_.accept(this, arg);
        return ExprType.unit();
    }

    @Override
    public ExprType visit(ReadRealFunction p, TypeContext arg) {
        return ExprType.real();
    }

    @Override
    public ExprType visit(ReadIntFunction p, TypeContext arg) {
        return ExprType.integer();
    }

    @Override
    public ExprType visit(ReadStringFunction p, TypeContext arg) {
        return ExprType.string();
    }

    @Override
    public ExprType visit(ReadBoolFunction p, TypeContext arg) {
        return ExprType.bool();
    }

    @Override
    public ExprType visit(DotExpr p, TypeContext ctx) {
        ExprType retType = ExprType.typeVariable();
        ExprType actual = p.expr_.accept(this, ctx);
        ctx.addSubtypeConstraint(actual, ExprType.record(List.of(new IdTypePair(p.ident_, retType))),
                p.line_num, p.col_num);
        return retType;
    }

    @Override
    public ExprType visit(IfStmt p, TypeContext ctx) {
        ExprType retType = ExprType.typeVariable();
        p.listifexpr_.forEach(iff -> iff.accept(mainVisitor.ifVisitor, new Pair<>(retType, ctx)));
        p.elseexpr_.accept(mainVisitor.ifVisitor, new Pair<>(retType, ctx));
        return retType;
    }

    @Override
    public ExprType visit(Operation p, TypeContext ctx) {
        return p.op_.accept(mainVisitor.opVisitor, ctx);
    }

    @Override
    public ExprType visit(IntValue p, TypeContext arg) {
        return ExprType.integer();
    }

    @Override
    public ExprType visit(RealValue p, TypeContext arg) {
        return ExprType.real();
    }

    @Override
    public ExprType visit(StringValue p, TypeContext arg) {
        return ExprType.string();
    }

    @Override
    public ExprType visit(BoolValue p, TypeContext arg) {
        return ExprType.bool();
    }

    @Override
    public ExprType visit(UnitValue p, TypeContext arg) {
        return ExprType.unit();
    }

    @Override
    public ExprType visit(RecordConst p, TypeContext ctx) {
        List<IdTypePair> elems = new ArrayList<>();
        p.listrecordelem_.forEach(e -> elems.add(e.accept(mainVisitor.recordVisitor, ctx)));
        return ExprType.record(elems);
    }

    @Override
    public ExprType visit(Seq p, TypeContext ctx) {
        return p.expr_.accept(this, ctx);
    }
}
