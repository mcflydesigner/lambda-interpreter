// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class RecordElement1  extends RecordElement {
  public final Identifier identifier_;
  public final Expression expression_;
  public RecordElement1(Identifier p1, Expression p2) { identifier_ = p1; expression_ = p2; }

  public <R,A> R accept(hardtyped.Absyn.RecordElement.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.RecordElement1) {
      hardtyped.Absyn.RecordElement1 x = (hardtyped.Absyn.RecordElement1)o;
      return this.identifier_.equals(x.identifier_) && this.expression_.equals(x.expression_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.identifier_.hashCode())+this.expression_.hashCode();
  }


}