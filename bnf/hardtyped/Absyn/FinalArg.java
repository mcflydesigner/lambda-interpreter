// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

public class FinalArg  extends FuncArg {
  public final VarDec vardec_;
  public FinalArg(VarDec p1) { vardec_ = p1; }

  public <R,A> R accept(hardtyped.Absyn.FuncArg.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof hardtyped.Absyn.FinalArg) {
      hardtyped.Absyn.FinalArg x = (hardtyped.Absyn.FinalArg)o;
      return this.vardec_.equals(x.vardec_);
    }
    return false;
  }

  public int hashCode() {
    return this.vardec_.hashCode();
  }


}