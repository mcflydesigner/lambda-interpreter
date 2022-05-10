// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public abstract class Expr implements java.io.Serializable {
  public abstract <R,A> R accept(Expr.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(hardtyped.Absyn.Function p, A arg);
    public R visit(hardtyped.Absyn.ApplyFunction p, A arg);
    public R visit(hardtyped.Absyn.Sum p, A arg);
    public R visit(hardtyped.Absyn.Substract p, A arg);
    public R visit(hardtyped.Absyn.Multiply p, A arg);
    public R visit(hardtyped.Absyn.Divide p, A arg);
    public R visit(hardtyped.Absyn.UnaryPlus p, A arg);
    public R visit(hardtyped.Absyn.UnaryMinus p, A arg);
    public R visit(hardtyped.Absyn.Let p, A arg);
    public R visit(hardtyped.Absyn.LetInference p, A arg);
    public R visit(hardtyped.Absyn.LetAscription p, A arg);
    public R visit(hardtyped.Absyn.IntValue p, A arg);
    public R visit(hardtyped.Absyn.RealValue p, A arg);
    public R visit(hardtyped.Absyn.StringValue p, A arg);
    public R visit(hardtyped.Absyn.AtomicExpression p, A arg);
    public R visit(hardtyped.Absyn.ParenthesesExpression p, A arg);

  }

}