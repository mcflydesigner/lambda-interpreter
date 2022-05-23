// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class StringValue  extends Value {
  public final String string_;
  public StringValue(String p1) { string_ = p1; }

  public <R,A> R accept(hardtyped.Absyn.Value.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.StringValue) {
      hardtyped.Absyn.StringValue x = (hardtyped.Absyn.StringValue)o;
      return this.string_.equals(x.string_);
    }
    return false;
  }

  public int hashCode() {
    return this.string_.hashCode();
  }


}
