// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class IfElseConst  extends IfExpr {
  public final IfExpr ifexpr_1, ifexpr_2;
  public IfElseConst(IfExpr p1, IfExpr p2) { ifexpr_1 = p1; ifexpr_2 = p2; }

  public <R,A> R accept(hardtyped.Absyn.IfExpr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.IfElseConst) {
      hardtyped.Absyn.IfElseConst x = (hardtyped.Absyn.IfElseConst)o;
      return this.ifexpr_1.equals(x.ifexpr_1) && this.ifexpr_2.equals(x.ifexpr_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.ifexpr_1.hashCode())+this.ifexpr_2.hashCode();
  }


}
