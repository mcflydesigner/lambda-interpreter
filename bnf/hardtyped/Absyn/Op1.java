// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class Op1  extends Op {
  public Op1() { }

  public <R,A> R accept(hardtyped.Absyn.Op.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.Op1) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
