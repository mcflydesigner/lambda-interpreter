// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class FunctionApplication  extends Expr {
  public final ListFuncArg listfuncarg_;
  public final ListExpr listexpr_;
  public final ListExprSequence listexprsequence_;
  public FunctionApplication(ListFuncArg p1, ListExpr p2, ListExprSequence p3) { listfuncarg_ = p1; listexpr_ = p2; listexprsequence_ = p3; }

  public <R,A> R accept(hardtyped.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.FunctionApplication) {
      hardtyped.Absyn.FunctionApplication x = (hardtyped.Absyn.FunctionApplication)o;
      return this.listfuncarg_.equals(x.listfuncarg_) && this.listexpr_.equals(x.listexpr_) && this.listexprsequence_.equals(x.listexprsequence_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.listfuncarg_.hashCode())+this.listexpr_.hashCode())+this.listexprsequence_.hashCode();
  }


}
