// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class IfStmt  extends Expr {
  public final ListIfExpr listifexpr_;
  public final ElseExpr elseexpr_;
  public int line_num, col_num, offset;
  public IfStmt(ListIfExpr p1, ElseExpr p2) { listifexpr_ = p1; elseexpr_ = p2; }

  public <R,A> R accept(hardtyped.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.IfStmt) {
      hardtyped.Absyn.IfStmt x = (hardtyped.Absyn.IfStmt)o;
      return this.listifexpr_.equals(x.listifexpr_) && this.elseexpr_.equals(x.elseexpr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.listifexpr_.hashCode())+this.elseexpr_.hashCode();
  }


}
