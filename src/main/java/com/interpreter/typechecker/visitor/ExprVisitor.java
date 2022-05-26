package com.interpreter.typechecker.visitor;

import com.interpreter.shared.exceptions.LineColPair;
import com.interpreter.shared.exceptions.TypeCheckException;
import com.interpreter.typechecker.types.FunctionType;
import com.interpreter.typechecker.types.IdTypePair;
import com.interpreter.typechecker.types.RecordType;
import com.interpreter.typechecker.types.TypeContext;
import com.interpreter.typechecker.types.ExprType;
import hardtyped.Absyn.*;
import hardtyped.PrettyPrinter;

import java.util.*;

public class ExprVisitor implements Expr.Visitor<ExprType, TypeContext>,
        ExprSequence.Visitor<ExprType, TypeContext> {

    MainVisitor mainVisitor;
    public ExprVisitor(MainVisitor mainVisitor) {
        this.mainVisitor = mainVisitor;
    }


    private void processImport(String lib, Optional<String> alias, TypeContext ctx) {
        Map<String, List<Expr>> defs = MainVisitor.importManager.loadModuleDefinitions(lib, null);
        TypeContext libContext = new TypeContext(false);
        Map<String, ExprType> parsedDefs = new HashMap<>();
        for (var e : defs.entrySet()) {
            parsedDefs.put(e.getKey(), visitExprs(e.getValue(), libContext));
        }
        if (alias.isPresent()) {
            ctx.addLib(alias.get(), parsedDefs);
        } else {
            ctx.addGlobalVariables(parsedDefs);
        }
    }
    @Override
    public ExprType visit(Import p, TypeContext ctx) {
        processImport(p.string_, Optional.of(p.ident_), ctx);
        return ExprType.unit();
    }

    @Override
    public ExprType visit(Import1 p, TypeContext ctx) {
        processImport(p.string_, Optional.empty(), ctx);
        return ExprType.unit();
    }

    @Override
    public ExprType visit(ArrowExpr p, TypeContext ctx) {
        throw new UnsupportedOperationException();
    }

    private ExprType visitExprs(List<Expr> exprs, TypeContext ctx) {
        for (int i = 0; i < exprs.size() - 1; i++) {
            if (ctx.isPrintTypes())
                System.out.println(String.format("%s: %s\n------", PrettyPrinter.print(exprs.get(i)),
                        exprs.get(i).accept(this, ctx).toString()));
        }
        ExprType ret = exprs.get(exprs.size() - 1).accept(this, ctx);
        if (ctx.isPrintTypes())
            System.out.println(String.format("%s: %s\n------", PrettyPrinter.print(exprs.get(exprs.size() - 1)),
                ret.toString()));
        return ret;
    }

    @Override
    public ExprType visit(Exprs p, TypeContext ctx) {
        return visitExprs(p.listexpr_, ctx);
    }

    @Override
    public ExprType visit(Variable p, TypeContext ctx) {
        return ctx.getType(p.ident_);
    }


    public void checkForSubtype(ExprType left, ExprType right, int line_num, int col_num) {
        if (!left.isSubtypeOf(right)) {
            throw new TypeCheckException(String.format("%s is not a subtype of %s at %d, %d",
                    left.toString(), right.toString(), line_num, col_num));
        }
    }
    public void checkForEquality(ExprType left, ExprType right, int line_num, int col_num) {
        if (!left.equals(right)) {
            throw new TypeCheckException(String.format("%s is not equal to %s at %d, %d",
                    left.toString(), right.toString(), line_num, col_num));
        }
    }
    @Override
    public ExprType visit(LetVariable p, TypeContext ctx) {
        IdTypePair pair = p.vardec_.accept(mainVisitor.varDecVisitor, ctx);
        ExprType actualType = p.expr_.accept(mainVisitor.exprVisitor, ctx);
        if (pair.b != null) {
            checkForSubtype(actualType, pair.b, p.line_num, p.col_num);
        }

        ctx.addGlobalType(pair.a, actualType);
        return ExprType.unit();
    }

    @Override
    public ExprType visit(LetInference p, TypeContext ctx) {
        IdTypePair pair = p.vardec_.accept(mainVisitor.varDecVisitor, ctx);
        ExprType actualType = p.expr_1.accept(mainVisitor.exprVisitor, ctx);
        if (pair.b != null) {
            checkForSubtype(actualType, pair.b, p.line_num, p.col_num);
        }

        ctx.addType(pair.a, actualType);
        ExprType retType = p.expr_2.accept(mainVisitor.exprVisitor, ctx);
        ctx.removeType();

        return retType;
    }

    @Override
    public ExprType visit(LetRec p, TypeContext ctx) {
        IdTypePair pair = p.vardec_.accept(mainVisitor.varDecVisitor, ctx);
        if (pair.b == null) {
            throw new IllegalStateException("Type for recursive functions should be specified. Recursive types are not allowed");
        }
        ctx.addGlobalType(pair.a, pair.b);
        ExprType actualType = p.expr_.accept(mainVisitor.exprVisitor, ctx);
        checkForSubtype(actualType, pair.b, p.line_num, p.col_num);

        return ExprType.unit();
    }

    @Override
    public ExprType visit(LetRecInference p, TypeContext ctx) {
        IdTypePair pair = p.vardec_.accept(mainVisitor.varDecVisitor, ctx);
        if (pair.b == null) {
            throw new IllegalStateException("Type for recursive functions should be specified. Recursive types are not allowed");
        }
        ctx.addType(pair.a, pair.b);
        ExprType actualType = p.expr_1.accept(mainVisitor.exprVisitor, ctx);
        checkForSubtype(actualType, pair.b, p.line_num, p.col_num);
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

        if (declaredType != null) {
            checkForSubtype(retType, declaredType, line_num, col_num);
            return declaredType;
        }

        List<ExprType> funType = new ArrayList<>(args.stream().map(p -> p.b).toList());
        funType.add(retType);
        return ExprType.functionFromList(funType);
    }

    @Override
    public ExprType visit(Function p, TypeContext ctx) {
        return visitFunction(p.listfuncarg_, p.listexpr_, null, ctx, p.line_num, p.col_num);
    }

    @Override
    public ExprType visit(FunctionApplication p, TypeContext ctx) {
        Application app = new Application(new Function(p.listfuncarg_, p.listexpr_), p.listexprsequence_);
        app.line_num = p.line_num;
        app.col_num = p.col_num;
        app.offset = p.offset;
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
        ExprType applicantType = p.expr_.accept(this, ctx);
        ExprType retType = FunctionType.calcReturnType(applicantType, args);
        if (retType == null) {
            throw new TypeCheckException(String.format("Function of type %s is not applicable to arguments: %s at %d, %d",
                    applicantType.toString(), args.toString(), p.line_num, p.col_num));
        }
        return retType;
    }

    @Override
    public ExprType visit(DotExpr p, TypeContext ctx) {
        ExprType actual = p.expr_.accept(this, ctx);
        if (!(actual instanceof RecordType rec)) {
            throw new TypeCheckException(String.format("Not a record at %d, %d",
                    p.line_num, p.col_num));
        }
        if (!rec.containsLabel(p.ident_)) {
            throw new TypeCheckException(String.format("Record does not contain label %s at %d, %d",
                    p.ident_, p.line_num, p.col_num));
        }
        return rec.getRecordElem(p.ident_);
    }

    @Override
    public ExprType visit(IfStmt p, TypeContext ctx) {
        List<ExprType> returns = new ArrayList<>();
        p.listifexpr_.forEach(iff -> returns.add(iff.accept(mainVisitor.ifVisitor, ctx)));
        returns.add(p.elseexpr_.accept(mainVisitor.ifVisitor, ctx));

        int size = returns.size();
        for (int i = 0; i < size; i++) {
            boolean supertype = true;
            for (int j = 0; j < size; j++) {
                if (i==j) continue;
                if (!returns.get(j).isSubtypeOf(returns.get(i)))
                    supertype = false;
            }
            if (supertype) return returns.get(i);
        }
        throw new TypeCheckException(String.format("Return types of the if expression do not have a common supertype at %d, %d",
                p.line_num, p.col_num));
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
