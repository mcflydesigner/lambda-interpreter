// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public abstract class MultDiv implements java.io.Serializable {
  public abstract <R,A> R accept(MultDiv.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(hardtyped.Absyn.Mult p, A arg);
    public R visit(hardtyped.Absyn.Div p, A arg);

  }

}
