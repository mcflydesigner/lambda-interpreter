// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class RecordType  extends Type {
  public final ListRecord listrecord_;
  public RecordType(ListRecord p1) { listrecord_ = p1; }

  public <R,A> R accept(hardtyped.Absyn.Type.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.RecordType) {
      hardtyped.Absyn.RecordType x = (hardtyped.Absyn.RecordType)o;
      return this.listrecord_.equals(x.listrecord_);
    }
    return false;
  }

  public int hashCode() {
    return this.listrecord_.hashCode();
  }


}
