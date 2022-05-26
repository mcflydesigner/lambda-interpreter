// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped;

/** Fold Visitor */
public abstract class FoldVisitor<R,A> implements AllVisitor<R,A> {
    public abstract R leaf(A arg);
    public abstract R combine(R x, R y, A arg);

/* Program */
    public R visit(hardtyped.Absyn.ProgramExprs p, A arg) {
      R r = leaf(arg);
      for (hardtyped.Absyn.Expr x : p.listexpr_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }

/* Expr */
    public R visit(hardtyped.Absyn.ConstTrue p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(hardtyped.Absyn.ConstFalse p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(hardtyped.Absyn.If p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      r = combine(p.expr_3.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.ConstZero p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(hardtyped.Absyn.Succ p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.Pred p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.IsZero p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.Var p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(hardtyped.Absyn.Abstraction p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(hardtyped.Absyn.Application p, A arg) {
      R r = leaf(arg);
      r = combine(p.expr_1.accept(this, arg), r, arg);
      r = combine(p.expr_2.accept(this, arg), r, arg);
      return r;
    }


}