// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public abstract class IfExpr implements java.io.Serializable {
  public abstract <R,A> R accept(IfExpr.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(hardtyped.Absyn.If p, A arg);
    public R visit(hardtyped.Absyn.IfMultiple p, A arg);

  }

}