// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class BoolValue  extends Value {
  public final String bool_;
  public BoolValue(String p1) { bool_ = p1; }

  public <R,A> R accept(hardtyped.Absyn.Value.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.BoolValue) {
      hardtyped.Absyn.BoolValue x = (hardtyped.Absyn.BoolValue)o;
      return this.bool_.equals(x.bool_);
    }
    return false;
  }

  public int hashCode() {
    return this.bool_.hashCode();
  }


}
