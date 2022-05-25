// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class DotVar  extends VarDec {
  public final String ident_1, ident_2;
  public DotVar(String p1, String p2) { ident_1 = p1; ident_2 = p2; }

  public <R,A> R accept(hardtyped.Absyn.VarDec.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.DotVar) {
      hardtyped.Absyn.DotVar x = (hardtyped.Absyn.DotVar)o;
      return this.ident_1.equals(x.ident_1) && this.ident_2.equals(x.ident_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.ident_1.hashCode())+this.ident_2.hashCode();
  }


}