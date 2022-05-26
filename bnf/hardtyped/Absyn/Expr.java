// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public abstract class Expr implements java.io.Serializable {
  public abstract <R,A> R accept(Expr.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(hardtyped.Absyn.Exprs p, A arg);
    public R visit(hardtyped.Absyn.Variable p, A arg);
    public R visit(hardtyped.Absyn.Import p, A arg);
    public R visit(hardtyped.Absyn.Import1 p, A arg);
    public R visit(hardtyped.Absyn.LetVariable p, A arg);
    public R visit(hardtyped.Absyn.LetInference p, A arg);
    public R visit(hardtyped.Absyn.LetRec p, A arg);
    public R visit(hardtyped.Absyn.LetRecInference p, A arg);
    public R visit(hardtyped.Absyn.LetType p, A arg);
    public R visit(hardtyped.Absyn.LetTypeInference p, A arg);
    public R visit(hardtyped.Absyn.Function p, A arg);
    public R visit(hardtyped.Absyn.FunctionApplication p, A arg);
    public R visit(hardtyped.Absyn.FunctionWithReturnType p, A arg);
    public R visit(hardtyped.Absyn.Application p, A arg);
    public R visit(hardtyped.Absyn.PrintFunction p, A arg);
    public R visit(hardtyped.Absyn.ReadRealFunction p, A arg);
    public R visit(hardtyped.Absyn.ReadIntFunction p, A arg);
    public R visit(hardtyped.Absyn.ReadStringFunction p, A arg);
    public R visit(hardtyped.Absyn.ReadBoolFunction p, A arg);
    public R visit(hardtyped.Absyn.ArrowExpr p, A arg);
    public R visit(hardtyped.Absyn.DotExpr p, A arg);
    public R visit(hardtyped.Absyn.IfStmt p, A arg);
    public R visit(hardtyped.Absyn.Operation p, A arg);
    public R visit(hardtyped.Absyn.IntValue p, A arg);
    public R visit(hardtyped.Absyn.RealValue p, A arg);
    public R visit(hardtyped.Absyn.StringValue p, A arg);
    public R visit(hardtyped.Absyn.BoolValue p, A arg);
    public R visit(hardtyped.Absyn.UnitValue p, A arg);
    public R visit(hardtyped.Absyn.RecordConst p, A arg);

  }

}
