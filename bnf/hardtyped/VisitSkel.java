// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped;

/*** Visitor Design Pattern Skeleton. ***/

/* This implements the common visitor design pattern.
   Tests show it to be slightly less efficient than the
   instanceof method, but easier to use.
   Replace the R and A parameters with the desired return
   and context types.*/

public class VisitSkel
{
  public class ExprVisitor<R,A> implements hardtyped.Absyn.Expr.Visitor<R,A>
  {
    public R visit(hardtyped.Absyn.Import p, A arg)
    { /* Code for Import goes here */
      p.vardec_.accept(new VarDecVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.Function p, A arg)
    { /* Code for Function goes here */
      p.funcarg_.accept(new FuncArgVisitor<R,A>(), arg);
      p.inexpr_.accept(new InExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.ApplyFunction p, A arg)
    { /* Code for ApplyFunction goes here */
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.PrintFunction p, A arg)
    { /* Code for PrintFunction goes here */
      //p.print_;
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.ReadFunction p, A arg)
    { /* Code for ReadFunction goes here */
      //p.read_;
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.EmptyPrintFunction p, A arg)
    { /* Code for EmptyPrintFunction goes here */
      //p.print_;
      return null;
    }
    public R visit(hardtyped.Absyn.EmptyReadFunction p, A arg)
    { /* Code for EmptyReadFunction goes here */
      //p.read_;
      return null;
    }
    public R visit(hardtyped.Absyn.MultipleArgFunction p, A arg)
    { /* Code for MultipleArgFunction goes here */
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.If p, A arg)
    { /* Code for If goes here */
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.Else p, A arg)
    { /* Code for Else goes here */
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.Sum p, A arg)
    { /* Code for Sum goes here */
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.Substract p, A arg)
    { /* Code for Substract goes here */
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.Multiply p, A arg)
    { /* Code for Multiply goes here */
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.Divide p, A arg)
    { /* Code for Divide goes here */
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.And p, A arg)
    { /* Code for And goes here */
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.Or p, A arg)
    { /* Code for Or goes here */
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.Not p, A arg)
    { /* Code for Not goes here */
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.More p, A arg)
    { /* Code for More goes here */
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.MoreEql p, A arg)
    { /* Code for MoreEql goes here */
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.Eql p, A arg)
    { /* Code for Eql goes here */
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.LessEql p, A arg)
    { /* Code for LessEql goes here */
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.Less p, A arg)
    { /* Code for Less goes here */
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.UnaryPlus p, A arg)
    { /* Code for UnaryPlus goes here */
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.UnaryMinus p, A arg)
    { /* Code for UnaryMinus goes here */
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.BaseLet p, A arg)
    { /* Code for BaseLet goes here */
      p.let_.accept(new LetVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.BaseValue p, A arg)
    { /* Code for BaseValue goes here */
      p.value_.accept(new ValueVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.AtomicExpression p, A arg)
    { /* Code for AtomicExpression goes here */
      //p.ident_;
      return null;
    }
    public R visit(hardtyped.Absyn.ParenthesesExpression p, A arg)
    { /* Code for ParenthesesExpression goes here */
      p.innerexpr_.accept(new InnerExprVisitor<R,A>(), arg);
      return null;
    }
  }
  public class LetVisitor<R,A> implements hardtyped.Absyn.Let.Visitor<R,A>
  {
    public R visit(hardtyped.Absyn.LetVariable p, A arg)
    { /* Code for LetVariable goes here */
      p.vardec_.accept(new VarDecVisitor<R,A>(), arg);
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.LetInference p, A arg)
    { /* Code for LetInference goes here */
      p.vardec_.accept(new VarDecVisitor<R,A>(), arg);
      p.expr_1.accept(new ExprVisitor<R,A>(), arg);
      p.expr_2.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.LetAscription p, A arg)
    { /* Code for LetAscription goes here */
      p.vardec_.accept(new VarDecVisitor<R,A>(), arg);
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.LetRec p, A arg)
    { /* Code for LetRec goes here */
      p.vardec_.accept(new VarDecVisitor<R,A>(), arg);
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.LetType p, A arg)
    { /* Code for LetType goes here */
      p.vardec_.accept(new VarDecVisitor<R,A>(), arg);
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      return null;
    }
  }
  public class ValueVisitor<R,A> implements hardtyped.Absyn.Value.Visitor<R,A>
  {
    public R visit(hardtyped.Absyn.IntValue p, A arg)
    { /* Code for IntValue goes here */
      //p.integer_;
      return null;
    }
    public R visit(hardtyped.Absyn.RealValue p, A arg)
    { /* Code for RealValue goes here */
      //p.double_;
      return null;
    }
    public R visit(hardtyped.Absyn.StringValue p, A arg)
    { /* Code for StringValue goes here */
      //p.string_;
      return null;
    }
    public R visit(hardtyped.Absyn.BoolValue p, A arg)
    { /* Code for BoolValue goes here */
      //p.bool_;
      return null;
    }
    public R visit(hardtyped.Absyn.UnitValue p, A arg)
    { /* Code for UnitValue goes here */
      //p.unit_;
      return null;
    }
    public R visit(hardtyped.Absyn.RecordConstr p, A arg)
    { /* Code for RecordConstr goes here */
      p.record_.accept(new RecordVisitor<R,A>(), arg);
      return null;
    }
  }
  public class RecordVisitor<R,A> implements hardtyped.Absyn.Record.Visitor<R,A>
  {
    public R visit(hardtyped.Absyn.BaseRecordNameValue p, A arg)
    { /* Code for BaseRecordNameValue goes here */
      p.vardec_.accept(new VarDecVisitor<R,A>(), arg);
      p.value_.accept(new ValueVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.BaseRecordName p, A arg)
    { /* Code for BaseRecordName goes here */
      p.vardec_.accept(new VarDecVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.MultipleRecordValue p, A arg)
    { /* Code for MultipleRecordValue goes here */
      p.record_1.accept(new RecordVisitor<R,A>(), arg);
      p.record_2.accept(new RecordVisitor<R,A>(), arg);
      return null;
    }
  }
  public class InExprVisitor<R,A> implements hardtyped.Absyn.InExpr.Visitor<R,A>
  {
    public R visit(hardtyped.Absyn.MultipleExpressions p, A arg)
    { /* Code for MultipleExpressions goes here */
      p.inexpr_1.accept(new InExprVisitor<R,A>(), arg);
      p.inexpr_2.accept(new InExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.FinalExpression p, A arg)
    { /* Code for FinalExpression goes here */
      p.inexpr_.accept(new InExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.InnerExpression p, A arg)
    { /* Code for InnerExpression goes here */
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
  }
  public class InnerExprVisitor<R,A> implements hardtyped.Absyn.InnerExpr.Visitor<R,A>
  {
    public R visit(hardtyped.Absyn.BaseInnerExpression p, A arg)
    { /* Code for BaseInnerExpression goes here */
      p.expr_.accept(new ExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.MultipleInnerExpression p, A arg)
    { /* Code for MultipleInnerExpression goes here */
      p.innerexpr_1.accept(new InnerExprVisitor<R,A>(), arg);
      p.innerexpr_2.accept(new InnerExprVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.FinalInnerExpression p, A arg)
    { /* Code for FinalInnerExpression goes here */
      p.innerexpr_.accept(new InnerExprVisitor<R,A>(), arg);
      return null;
    }
  }
  public class FuncArgVisitor<R,A> implements hardtyped.Absyn.FuncArg.Visitor<R,A>
  {
    public R visit(hardtyped.Absyn.MultipleArgs p, A arg)
    { /* Code for MultipleArgs goes here */
      p.vardec_.accept(new VarDecVisitor<R,A>(), arg);
      p.funcarg_.accept(new FuncArgVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.FinalArg p, A arg)
    { /* Code for FinalArg goes here */
      p.vardec_.accept(new VarDecVisitor<R,A>(), arg);
      return null;
    }
  }
  public class VarDecVisitor<R,A> implements hardtyped.Absyn.VarDec.Visitor<R,A>
  {
    public R visit(hardtyped.Absyn.TypedVar p, A arg)
    { /* Code for TypedVar goes here */
      //p.ident_;
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.UntypedVar p, A arg)
    { /* Code for UntypedVar goes here */
      //p.ident_;
      return null;
    }
    public R visit(hardtyped.Absyn.DotVar p, A arg)
    { /* Code for DotVar goes here */
      //p.ident_1;
      //p.ident_2;
      return null;
    }
  }
  public class TypeVisitor<R,A> implements hardtyped.Absyn.Type.Visitor<R,A>
  {
    public R visit(hardtyped.Absyn.IntType p, A arg)
    { /* Code for IntType goes here */
      return null;
    }
    public R visit(hardtyped.Absyn.RealType p, A arg)
    { /* Code for RealType goes here */
      return null;
    }
    public R visit(hardtyped.Absyn.BoolType p, A arg)
    { /* Code for BoolType goes here */
      return null;
    }
    public R visit(hardtyped.Absyn.StringType p, A arg)
    { /* Code for StringType goes here */
      return null;
    }
    public R visit(hardtyped.Absyn.UnitType p, A arg)
    { /* Code for UnitType goes here */
      return null;
    }
    public R visit(hardtyped.Absyn.AnyType p, A arg)
    { /* Code for AnyType goes here */
      return null;
    }
    public R visit(hardtyped.Absyn.FunctionType p, A arg)
    { /* Code for FunctionType goes here */
      p.type_1.accept(new TypeVisitor<R,A>(), arg);
      p.type_2.accept(new TypeVisitor<R,A>(), arg);
      return null;
    }
    public R visit(hardtyped.Absyn.RecordType p, A arg)
    { /* Code for RecordType goes here */
      p.record_.accept(new RecordVisitor<R,A>(), arg);
      return null;
    }
  }
}
