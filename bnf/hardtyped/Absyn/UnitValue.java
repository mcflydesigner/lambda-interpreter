// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class UnitValue  extends Value {
  public final String unit_;
  public UnitValue(String p1) { unit_ = p1; }

  public <R,A> R accept(hardtyped.Absyn.Value.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.UnitValue) {
      hardtyped.Absyn.UnitValue x = (hardtyped.Absyn.UnitValue)o;
      return this.unit_.equals(x.unit_);
    }
    return false;
  }

  public int hashCode() {
    return this.unit_.hashCode();
  }


}
