// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class BaseInnerExpression  extends InnerExpr {
  public final Expr expr_;
  public BaseInnerExpression(Expr p1) { expr_ = p1; }

  public <R,A> R accept(hardtyped.Absyn.InnerExpr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.BaseInnerExpression) {
      hardtyped.Absyn.BaseInnerExpression x = (hardtyped.Absyn.BaseInnerExpression)o;
      return this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return this.expr_.hashCode();
  }


}