// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped;

/** Abstract Visitor */

public class AbstractVisitor<R,A> implements AllVisitor<R,A> {
    /* Expr */
    public R visit(hardtyped.Absyn.Function p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.ApplyFunction p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.Sum p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.Substract p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.Multiply p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.Divide p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.Let p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.LetInference p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.LetAscription p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.IntValue p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.RealValue p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.StringValue p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.AtomicExpression p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.ParenthesesExpression p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(hardtyped.Absyn.Expr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* InExpr */
    public R visit(hardtyped.Absyn.MultipleExpressions p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.FinalExpression p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.InnerExpression p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(hardtyped.Absyn.InExpr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* VarDec */
    public R visit(hardtyped.Absyn.MultipleVars p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.MultipleVarsFinal p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.TypedVar p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.UntypedVar p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(hardtyped.Absyn.VarDec p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Type */
    public R visit(hardtyped.Absyn.IntType p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.RealType p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.BoolType p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.StringType p, A arg) { return visitDefault(p, arg); }
    public R visit(hardtyped.Absyn.UnitType p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(hardtyped.Absyn.Type p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }

}
