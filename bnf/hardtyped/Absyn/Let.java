// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class Let  extends Stm {
  public final Identifier identifier_;
  public final Type type_;
  public final Expression expression_1, expression_2;
  public Let(Identifier p1, Type p2, Expression p3, Expression p4) { identifier_ = p1; type_ = p2; expression_1 = p3; expression_2 = p4; }

  public <R,A> R accept(hardtyped.Absyn.Stm.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.Let) {
      hardtyped.Absyn.Let x = (hardtyped.Absyn.Let)o;
      return this.identifier_.equals(x.identifier_) && this.type_.equals(x.type_) && this.expression_1.equals(x.expression_1) && this.expression_2.equals(x.expression_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(37*(this.identifier_.hashCode())+this.type_.hashCode())+this.expression_1.hashCode())+this.expression_2.hashCode();
  }


}
