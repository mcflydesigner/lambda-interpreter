// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class LetAscription  extends Expr {
  public final VarDec vardec_;
  public final Expr expr_;
  public final Type type_;
  public LetAscription(VarDec p1, Expr p2, Type p3) { vardec_ = p1; expr_ = p2; type_ = p3; }

  public <R,A> R accept(hardtyped.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.LetAscription) {
      hardtyped.Absyn.LetAscription x = (hardtyped.Absyn.LetAscription)o;
      return this.vardec_.equals(x.vardec_) && this.expr_.equals(x.expr_) && this.type_.equals(x.type_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.vardec_.hashCode())+this.expr_.hashCode())+this.type_.hashCode();
  }


}
