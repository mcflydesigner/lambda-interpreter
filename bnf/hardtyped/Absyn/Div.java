// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class Div  extends MultDiv {
  public Div() { }

  public <R,A> R accept(hardtyped.Absyn.MultDiv.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.Div) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}