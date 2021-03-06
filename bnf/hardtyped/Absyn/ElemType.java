// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class ElemType  extends RecordElemType {
  public final String ident_;
  public final Type type_;
  public int line_num, col_num, offset;
  public ElemType(String p1, Type p2) { ident_ = p1; type_ = p2; }

  public <R,A> R accept(hardtyped.Absyn.RecordElemType.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.ElemType) {
      hardtyped.Absyn.ElemType x = (hardtyped.Absyn.ElemType)o;
      return this.ident_.equals(x.ident_) && this.type_.equals(x.type_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.ident_.hashCode())+this.type_.hashCode();
  }


}
