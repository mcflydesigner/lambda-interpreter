// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public abstract class Relation implements java.io.Serializable {
  public abstract <R,A> R accept(Relation.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(hardtyped.Absyn.Relation1 p, A arg);
    public R visit(hardtyped.Absyn.Relation2 p, A arg);

  }

}