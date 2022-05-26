// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class ArrowExpr  extends Expr {
  public final String ident_;
  public final Expr expr_;
  public int line_num, col_num, offset;
  public ArrowExpr(String p1, Expr p2) { ident_ = p1; expr_ = p2; }

  public <R,A> R accept(hardtyped.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.ArrowExpr) {
      hardtyped.Absyn.ArrowExpr x = (hardtyped.Absyn.ArrowExpr)o;
      return this.ident_.equals(x.ident_) && this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.ident_.hashCode())+this.expr_.hashCode();
  }


}
