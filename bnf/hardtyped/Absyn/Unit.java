// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class Unit  extends Type {
  public Unit() { }

  public <R,A> R accept(hardtyped.Absyn.Type.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.Unit) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
