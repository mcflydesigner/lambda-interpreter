// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class EmptyReadFunction  extends Expr {
  public final String read_;
  public EmptyReadFunction(String p1) { read_ = p1; }

  public <R,A> R accept(hardtyped.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.EmptyReadFunction) {
      hardtyped.Absyn.EmptyReadFunction x = (hardtyped.Absyn.EmptyReadFunction)o;
      return this.read_.equals(x.read_);
    }
    return false;
  }

  public int hashCode() {
    return this.read_.hashCode();
  }


}