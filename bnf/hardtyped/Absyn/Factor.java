// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public abstract class Factor implements java.io.Serializable {
  public abstract <R,A> R accept(Factor.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(hardtyped.Absyn.Factor1 p, A arg);
    public R visit(hardtyped.Absyn.Factor2 p, A arg);

  }

}