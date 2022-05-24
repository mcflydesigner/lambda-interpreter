// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class LetVariable  extends Let {
  public final VarDec vardec_;
  public final Expr expr_;
  public LetVariable(VarDec p1, Expr p2) { vardec_ = p1; expr_ = p2; }

  public <R,A> R accept(hardtyped.Absyn.Let.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.LetVariable) {
      hardtyped.Absyn.LetVariable x = (hardtyped.Absyn.LetVariable)o;
      return this.vardec_.equals(x.vardec_) && this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.vardec_.hashCode())+this.expr_.hashCode();
  }


}