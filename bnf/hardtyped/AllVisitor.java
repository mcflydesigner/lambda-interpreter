// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped;

/** All Visitor */

public interface AllVisitor<R,A> extends
  hardtyped.Absyn.Expr.Visitor<R,A>,
  hardtyped.Absyn.VarDec.Visitor<R,A>,
  hardtyped.Absyn.ExprSequence.Visitor<R,A>,
  hardtyped.Absyn.FuncArg.Visitor<R,A>,
  hardtyped.Absyn.IfExpr.Visitor<R,A>,
  hardtyped.Absyn.ElseExpr.Visitor<R,A>,
  hardtyped.Absyn.Op.Visitor<R,A>,
  hardtyped.Absyn.RecordElem.Visitor<R,A>,
  hardtyped.Absyn.Type.Visitor<R,A>,
  hardtyped.Absyn.RecordElemType.Visitor<R,A>
{}
