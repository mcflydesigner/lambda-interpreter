// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class Ascription1  extends Ascription {
  public final Type type_;
  public Ascription1(Type p1) { type_ = p1; }

  public <R,A> R accept(hardtyped.Absyn.Ascription.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.Ascription1) {
      hardtyped.Absyn.Ascription1 x = (hardtyped.Absyn.Ascription1)o;
      return this.type_.equals(x.type_);
    }
    return false;
  }

  public int hashCode() {
    return this.type_.hashCode();
  }


}