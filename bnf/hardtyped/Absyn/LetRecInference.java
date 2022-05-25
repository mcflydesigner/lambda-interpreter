// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class LetRecInference  extends Expr {
  public final VarDec vardec_;
  public final Expr expr_1, expr_2;
  public LetRecInference(VarDec p1, Expr p2, Expr p3) { vardec_ = p1; expr_1 = p2; expr_2 = p3; }

  public <R,A> R accept(hardtyped.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.LetRecInference) {
      hardtyped.Absyn.LetRecInference x = (hardtyped.Absyn.LetRecInference)o;
      return this.vardec_.equals(x.vardec_) && this.expr_1.equals(x.expr_1) && this.expr_2.equals(x.expr_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.vardec_.hashCode())+this.expr_1.hashCode())+this.expr_2.hashCode();
  }


}