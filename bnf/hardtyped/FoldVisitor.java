// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped;

/** Fold Visitor */
public abstract class FoldVisitor<R,A> implements AllVisitor<R,A> {
    public abstract R leaf(A arg);
    public abstract R combine(R x, R y, A arg);

/* Expr */
    public R visit(hardtyped.Absyn.Import p, A arg) {
      R r = leaf(arg);
      r = combine(p.vardec_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.Function p, A arg) {
      R r = leaf(arg);
      r = combine(p.funcarg_.accept(this, arg), r, arg);
      r = combine(p.inexpr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.ApplyFunction p, A arg) {
      R r = leaf(arg);
      r = combine(p.vardec_.accept(this, arg), r, arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.PrintFunction p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.ReadFunction p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.EmptyPrintFunction p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(hardtyped.Absyn.EmptyReadFunction p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(hardtyped.Absyn.MultipleArgFunction p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.IfStmt p, A arg) {
      R r = leaf(arg);
      r = combine(p.ifexpr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.Sum p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.Substract p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.Multiply p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.Divide p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.And p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.Or p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.Not p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.More p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.MoreEql p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.Eql p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.LessEql p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.Less p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.UnaryPlus p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.UnaryMinus p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.BaseLet p, A arg) {
      R r = leaf(arg);
      r = combine(p.let_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.BaseValue p, A arg) {
      R r = leaf(arg);
      r = combine(p.value_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.AtomicExpression p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(hardtyped.Absyn.ParenthesesExpression p, A arg) {
      R r = leaf(arg);
      r = combine(p.innerexpr_.accept(this, arg), r, arg);
      return r;
    }

/* IfExpr */
    public R visit(hardtyped.Absyn.IfElseConst p, A arg) {
      R r = leaf(arg);
      r = combine(p.ifexpr_1.accept(this, arg), r, arg);
      r = combine(p.ifexpr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.If p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.Else p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }

/* Let */
    public R visit(hardtyped.Absyn.LetVariable p, A arg) {
      R r = leaf(arg);
      r = combine(p.vardec_.accept(this, arg), r, arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.LetInference p, A arg) {
      R r = leaf(arg);
      r = combine(p.vardec_.accept(this, arg), r, arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.LetAscription p, A arg) {
      R r = leaf(arg);
      r = combine(p.vardec_.accept(this, arg), r, arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.LetRec p, A arg) {
      R r = leaf(arg);
      r = combine(p.vardec_.accept(this, arg), r, arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.LetType p, A arg) {
      R r = leaf(arg);
      r = combine(p.vardec_.accept(this, arg), r, arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }

/* Value */
    public R visit(hardtyped.Absyn.IntValue p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(hardtyped.Absyn.RealValue p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(hardtyped.Absyn.StringValue p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(hardtyped.Absyn.BoolValue p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(hardtyped.Absyn.UnitValue p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(hardtyped.Absyn.RecordConstr p, A arg) {
      R r = leaf(arg);
      r = combine(p.record_.accept(this, arg), r, arg);
      return r;
    }

/* Record */
    public R visit(hardtyped.Absyn.BaseRecordNameValue p, A arg) {
      R r = leaf(arg);
      r = combine(p.vardec_.accept(this, arg), r, arg);
      r = combine(p.value_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.BaseRecordName p, A arg) {
      R r = leaf(arg);
      r = combine(p.vardec_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.MultipleRecordValue p, A arg) {
      R r = leaf(arg);
      r = combine(p.record_1.accept(this, arg), r, arg);
      r = combine(p.record_2.accept(this, arg), r, arg);
      return r;
    }

/* InExpr */
    public R visit(hardtyped.Absyn.MultipleExpressions p, A arg) {
      R r = leaf(arg);
      r = combine(p.inexpr_1.accept(this, arg), r, arg);
      r = combine(p.inexpr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.FinalExpression p, A arg) {
      R r = leaf(arg);
      r = combine(p.inexpr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.InnerExpression p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }

/* InnerExpr */
    public R visit(hardtyped.Absyn.BaseInnerExpression p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.MultipleInnerExpression p, A arg) {
      R r = leaf(arg);
      r = combine(p.innerexpr_1.accept(this, arg), r, arg);
      r = combine(p.innerexpr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.FinalInnerExpression p, A arg) {
      R r = leaf(arg);
      r = combine(p.innerexpr_.accept(this, arg), r, arg);
      return r;
    }

/* FuncArg */
    public R visit(hardtyped.Absyn.MultipleArgs p, A arg) {
      R r = leaf(arg);
      r = combine(p.vardec_.accept(this, arg), r, arg);
      r = combine(p.funcarg_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.FinalArg p, A arg) {
      R r = leaf(arg);
      r = combine(p.vardec_.accept(this, arg), r, arg);
      return r;
    }

/* VarDec */
    public R visit(hardtyped.Absyn.TypedVar p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.UntypedVar p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(hardtyped.Absyn.DotVar p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Type */
    public R visit(hardtyped.Absyn.IntType p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(hardtyped.Absyn.RealType p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(hardtyped.Absyn.BoolType p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(hardtyped.Absyn.StringType p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(hardtyped.Absyn.UnitType p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(hardtyped.Absyn.AnyType p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(hardtyped.Absyn.FunctionType p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_1.accept(this, arg), r, arg);
      r = combine(p.type_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.RecordType p, A arg) {
      R r = leaf(arg);
      r = combine(p.record_.accept(this, arg), r, arg);
      return r;
    }


}
