// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class FinalExpression  extends InExpr {
  public final InExpr inexpr_;
  public FinalExpression(InExpr p1) { inexpr_ = p1; }

  public <R,A> R accept(hardtyped.Absyn.InExpr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.FinalExpression) {
      hardtyped.Absyn.FinalExpression x = (hardtyped.Absyn.FinalExpression)o;
      return this.inexpr_.equals(x.inexpr_);
    }
    return false;
  }

  public int hashCode() {
    return this.inexpr_.hashCode();
  }


}
