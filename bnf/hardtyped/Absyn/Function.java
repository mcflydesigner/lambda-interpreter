// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class Function  extends Expr {
  public final VarDec vardec_;
  public final Expr expr_;
  public Function(VarDec p1, Expr p2) { vardec_ = p1; expr_ = p2; }

  public <R,A> R accept(hardtyped.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.Function) {
      hardtyped.Absyn.Function x = (hardtyped.Absyn.Function)o;
      return this.vardec_.equals(x.vardec_) && this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.vardec_.hashCode())+this.expr_.hashCode();
  }


}
