// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class Function  extends Expr {
  public final ListFuncParameter listfuncparameter_;
  public final FuncBody funcbody_;
  public Function(ListFuncParameter p1, FuncBody p2) { listfuncparameter_ = p1; funcbody_ = p2; }

  public <R,A> R accept(hardtyped.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.Function) {
      hardtyped.Absyn.Function x = (hardtyped.Absyn.Function)o;
      return this.listfuncparameter_.equals(x.listfuncparameter_) && this.funcbody_.equals(x.funcbody_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.listfuncparameter_.hashCode())+this.funcbody_.hashCode();
  }


}
