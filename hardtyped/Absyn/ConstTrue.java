// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped.Absyn;

<<<<<<<< HEAD:bnf/hardtyped/Absyn/BoolType.java
public class BoolType  extends Type {
  public int line_num, col_num, offset;
  public BoolType() { }
========
public class ConstTrue  extends Expr {
  public ConstTrue() { }
>>>>>>>> main:hardtyped/Absyn/ConstTrue.java

  public <R,A> R accept(hardtyped.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
<<<<<<<< HEAD:bnf/hardtyped/Absyn/BoolType.java
    if (o instanceof hardtyped.Absyn.BoolType) {
========
    if (o instanceof hardtyped.Absyn.ConstTrue) {
>>>>>>>> main:hardtyped/Absyn/ConstTrue.java
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}