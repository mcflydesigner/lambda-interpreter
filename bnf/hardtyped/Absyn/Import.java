// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class Import  extends Expr {
  public final String string_, ident_;
  public int line_num, col_num, offset;
  public Import(String p1, String p2) { string_ = p1; ident_ = p2; }

  public <R,A> R accept(hardtyped.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.Import) {
      hardtyped.Absyn.Import x = (hardtyped.Absyn.Import)o;
      return this.string_.equals(x.string_) && this.ident_.equals(x.ident_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.string_.hashCode())+this.ident_.hashCode();
  }


}
