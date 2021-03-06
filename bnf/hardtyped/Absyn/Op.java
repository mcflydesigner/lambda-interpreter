// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public abstract class Op implements java.io.Serializable {
  public abstract <R,A> R accept(Op.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(hardtyped.Absyn.Sum p, A arg);
    public R visit(hardtyped.Absyn.Substract p, A arg);
    public R visit(hardtyped.Absyn.Multiply p, A arg);
    public R visit(hardtyped.Absyn.Divide p, A arg);
    public R visit(hardtyped.Absyn.And p, A arg);
    public R visit(hardtyped.Absyn.Or p, A arg);
    public R visit(hardtyped.Absyn.Not p, A arg);
    public R visit(hardtyped.Absyn.More p, A arg);
    public R visit(hardtyped.Absyn.MoreEql p, A arg);
    public R visit(hardtyped.Absyn.Eql p, A arg);
    public R visit(hardtyped.Absyn.NotEql p, A arg);
    public R visit(hardtyped.Absyn.LessEql p, A arg);
    public R visit(hardtyped.Absyn.Less p, A arg);
    public R visit(hardtyped.Absyn.UnaryPlus p, A arg);
    public R visit(hardtyped.Absyn.UnaryMinus p, A arg);

  }

}
