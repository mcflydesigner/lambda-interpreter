// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public abstract class RecordElem implements java.io.Serializable {
  public abstract <R,A> R accept(RecordElem.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(hardtyped.Absyn.Elem p, A arg);

  }

}
