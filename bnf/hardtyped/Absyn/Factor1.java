// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class Factor1  extends Factor {
  public final Term term_;
  public Factor1(Term p1) { term_ = p1; }

  public <R,A> R accept(hardtyped.Absyn.Factor.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.Factor1) {
      hardtyped.Absyn.Factor1 x = (hardtyped.Absyn.Factor1)o;
      return this.term_.equals(x.term_);
    }
    return false;
  }

  public int hashCode() {
    return this.term_.hashCode();
  }


}
