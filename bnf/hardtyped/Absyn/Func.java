// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class Func  extends VarName {
  public final ListVarPath listvarpath_;
  public final String ident_;
  public Func(ListVarPath p1, String p2) { listvarpath_ = p1; ident_ = p2; }

  public <R,A> R accept(hardtyped.Absyn.VarName.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.Func) {
      hardtyped.Absyn.Func x = (hardtyped.Absyn.Func)o;
      return this.listvarpath_.equals(x.listvarpath_) && this.ident_.equals(x.ident_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.listvarpath_.hashCode())+this.ident_.hashCode();
  }


}