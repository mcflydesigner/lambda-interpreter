// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped;

/** All Visitor */

public interface AllVisitor<R,A> extends
  hardtyped.Absyn.Expr.Visitor<R,A>,
  hardtyped.Absyn.Let.Visitor<R,A>,
  hardtyped.Absyn.Value.Visitor<R,A>,
  hardtyped.Absyn.Record.Visitor<R,A>,
  hardtyped.Absyn.InExpr.Visitor<R,A>,
  hardtyped.Absyn.InnerExpr.Visitor<R,A>,
  hardtyped.Absyn.FuncArg.Visitor<R,A>,
  hardtyped.Absyn.VarDec.Visitor<R,A>,
  hardtyped.Absyn.Type.Visitor<R,A>
{}
