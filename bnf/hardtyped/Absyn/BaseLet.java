// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class BaseLet  extends Expr {
  public final Let let_;
  public BaseLet(Let p1) { let_ = p1; }

  public <R,A> R accept(hardtyped.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.BaseLet) {
      hardtyped.Absyn.BaseLet x = (hardtyped.Absyn.BaseLet)o;
      return this.let_.equals(x.let_);
    }
    return false;
  }

  public int hashCode() {
    return this.let_.hashCode();
  }


}