// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class LetInferenceMany  extends Let {
  public final VarDec vardec_;
  public final Expr expr_;
  public final ListExpr listexpr_;
  public LetInferenceMany(VarDec p1, Expr p2, ListExpr p3) { vardec_ = p1; expr_ = p2; listexpr_ = p3; }

  public <R,A> R accept(hardtyped.Absyn.Let.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.LetInferenceMany) {
      hardtyped.Absyn.LetInferenceMany x = (hardtyped.Absyn.LetInferenceMany)o;
      return this.vardec_.equals(x.vardec_) && this.expr_.equals(x.expr_) && this.listexpr_.equals(x.listexpr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.vardec_.hashCode())+this.expr_.hashCode())+this.listexpr_.hashCode();
  }


}