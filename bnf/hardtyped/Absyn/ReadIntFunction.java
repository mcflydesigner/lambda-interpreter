// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class ReadIntFunction  extends Expr {
  public final String readint_;
  public final ListExprSequence listexprsequence_;
  public ReadIntFunction(String p1, ListExprSequence p2) { readint_ = p1; listexprsequence_ = p2; }

  public <R,A> R accept(hardtyped.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.ReadIntFunction) {
      hardtyped.Absyn.ReadIntFunction x = (hardtyped.Absyn.ReadIntFunction)o;
      return this.readint_.equals(x.readint_) && this.listexprsequence_.equals(x.listexprsequence_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.readint_.hashCode())+this.listexprsequence_.hashCode();
  }


}
