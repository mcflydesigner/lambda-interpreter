// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped;
/** Composition Visitor
*/

public class ComposVisitor<A> implements
  hardtyped.Absyn.Expr.Visitor<hardtyped.Absyn.Expr,A>,
  hardtyped.Absyn.ModuleIdentifier.Visitor<hardtyped.Absyn.ModuleIdentifier,A>,
  hardtyped.Absyn.ImportFileName.Visitor<hardtyped.Absyn.ImportFileName,A>,
  hardtyped.Absyn.Path.Visitor<hardtyped.Absyn.Path,A>,
  hardtyped.Absyn.Let.Visitor<hardtyped.Absyn.Let,A>,
  hardtyped.Absyn.VarDec.Visitor<hardtyped.Absyn.VarDec,A>,
  hardtyped.Absyn.VarName.Visitor<hardtyped.Absyn.VarName,A>,
  hardtyped.Absyn.VarPath.Visitor<hardtyped.Absyn.VarPath,A>,
  hardtyped.Absyn.ExprSequence.Visitor<hardtyped.Absyn.ExprSequence,A>,
  hardtyped.Absyn.FuncArg.Visitor<hardtyped.Absyn.FuncArg,A>,
  hardtyped.Absyn.IfExpr.Visitor<hardtyped.Absyn.IfExpr,A>,
  hardtyped.Absyn.ElseExpr.Visitor<hardtyped.Absyn.ElseExpr,A>,
  hardtyped.Absyn.Op.Visitor<hardtyped.Absyn.Op,A>,
  hardtyped.Absyn.Type.Visitor<hardtyped.Absyn.Type,A>,
  hardtyped.Absyn.Record.Visitor<hardtyped.Absyn.Record,A>
{
    /* Expr */
    public hardtyped.Absyn.Expr visit(hardtyped.Absyn.Import p, A arg)
    {
      hardtyped.Absyn.ModuleIdentifier moduleidentifier_ = p.moduleidentifier_.accept(this, arg);
      return new hardtyped.Absyn.Import(moduleidentifier_);
    }
    public hardtyped.Absyn.Expr visit(hardtyped.Absyn.BaseLet p, A arg)
    {
      hardtyped.Absyn.Let let_ = p.let_.accept(this, arg);
      return new hardtyped.Absyn.BaseLet(let_);
    }
    public hardtyped.Absyn.Expr visit(hardtyped.Absyn.IfStmt p, A arg)
    {
      hardtyped.Absyn.ListIfExpr listifexpr_ = new hardtyped.Absyn.ListIfExpr();
      for (hardtyped.Absyn.IfExpr x : p.listifexpr_)
      {
        listifexpr_.add(x.accept(this,arg));
      }
      hardtyped.Absyn.ElseExpr elseexpr_ = p.elseexpr_.accept(this, arg);
      return new hardtyped.Absyn.IfStmt(listifexpr_, elseexpr_);
    }
    public hardtyped.Absyn.Expr visit(hardtyped.Absyn.Function p, A arg)
    {
      hardtyped.Absyn.ListFuncArg listfuncarg_ = new hardtyped.Absyn.ListFuncArg();
      for (hardtyped.Absyn.FuncArg x : p.listfuncarg_)
      {
        listfuncarg_.add(x.accept(this,arg));
      }
      hardtyped.Absyn.ListExpr listexpr_ = new hardtyped.Absyn.ListExpr();
      for (hardtyped.Absyn.Expr x : p.listexpr_)
      {
        listexpr_.add(x.accept(this,arg));
      }
      return new hardtyped.Absyn.Function(listfuncarg_, listexpr_);
    }
    public hardtyped.Absyn.Expr visit(hardtyped.Absyn.FunctionWithReturnType p, A arg)
    {
      hardtyped.Absyn.ListFuncArg listfuncarg_ = new hardtyped.Absyn.ListFuncArg();
      for (hardtyped.Absyn.FuncArg x : p.listfuncarg_)
      {
        listfuncarg_.add(x.accept(this,arg));
      }
      hardtyped.Absyn.ListExpr listexpr_ = new hardtyped.Absyn.ListExpr();
      for (hardtyped.Absyn.Expr x : p.listexpr_)
      {
        listexpr_.add(x.accept(this,arg));
      }
      hardtyped.Absyn.Type type_ = p.type_.accept(this, arg);
      return new hardtyped.Absyn.FunctionWithReturnType(listfuncarg_, listexpr_, type_);
    }
    public hardtyped.Absyn.Expr visit(hardtyped.Absyn.Application p, A arg)
    {
      hardtyped.Absyn.VarName varname_ = p.varname_.accept(this, arg);
      hardtyped.Absyn.ListExprSequence listexprsequence_ = new hardtyped.Absyn.ListExprSequence();
      for (hardtyped.Absyn.ExprSequence x : p.listexprsequence_)
      {
        listexprsequence_.add(x.accept(this,arg));
      }
      return new hardtyped.Absyn.Application(varname_, listexprsequence_);
    }
    public hardtyped.Absyn.Expr visit(hardtyped.Absyn.PrintFunction p, A arg)
    {
      String print_ = p.print_;
      hardtyped.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new hardtyped.Absyn.PrintFunction(print_, expr_);
    }
    public hardtyped.Absyn.Expr visit(hardtyped.Absyn.ReadRealFunction p, A arg)
    {
      String readreal_ = p.readreal_;
      hardtyped.Absyn.ListExprSequence listexprsequence_ = new hardtyped.Absyn.ListExprSequence();
      for (hardtyped.Absyn.ExprSequence x : p.listexprsequence_)
      {
        listexprsequence_.add(x.accept(this,arg));
      }
      return new hardtyped.Absyn.ReadRealFunction(readreal_, listexprsequence_);
    }
    public hardtyped.Absyn.Expr visit(hardtyped.Absyn.ReadIntFunction p, A arg)
    {
      String readint_ = p.readint_;
      hardtyped.Absyn.ListExprSequence listexprsequence_ = new hardtyped.Absyn.ListExprSequence();
      for (hardtyped.Absyn.ExprSequence x : p.listexprsequence_)
      {
        listexprsequence_.add(x.accept(this,arg));
      }
      return new hardtyped.Absyn.ReadIntFunction(readint_, listexprsequence_);
    }
    public hardtyped.Absyn.Expr visit(hardtyped.Absyn.ReadStringFunction p, A arg)
    {
      String readstring_ = p.readstring_;
      hardtyped.Absyn.ListExprSequence listexprsequence_ = new hardtyped.Absyn.ListExprSequence();
      for (hardtyped.Absyn.ExprSequence x : p.listexprsequence_)
      {
        listexprsequence_.add(x.accept(this,arg));
      }
      return new hardtyped.Absyn.ReadStringFunction(readstring_, listexprsequence_);
    }
    public hardtyped.Absyn.Expr visit(hardtyped.Absyn.ReadBoolFunction p, A arg)
    {
      String readbool_ = p.readbool_;
      hardtyped.Absyn.ListExprSequence listexprsequence_ = new hardtyped.Absyn.ListExprSequence();
      for (hardtyped.Absyn.ExprSequence x : p.listexprsequence_)
      {
        listexprsequence_.add(x.accept(this,arg));
      }
      return new hardtyped.Absyn.ReadBoolFunction(readbool_, listexprsequence_);
    }
    public hardtyped.Absyn.Expr visit(hardtyped.Absyn.Operation p, A arg)
    {
      hardtyped.Absyn.Op op_ = p.op_.accept(this, arg);
      return new hardtyped.Absyn.Operation(op_);
    }
    public hardtyped.Absyn.Expr visit(hardtyped.Absyn.AtomicExpr p, A arg)
    {
      String ident_ = p.ident_;
      return new hardtyped.Absyn.AtomicExpr(ident_);
    }
    public hardtyped.Absyn.Expr visit(hardtyped.Absyn.IntValue p, A arg)
    {
      Integer integer_ = p.integer_;
      return new hardtyped.Absyn.IntValue(integer_);
    }
    public hardtyped.Absyn.Expr visit(hardtyped.Absyn.RealValue p, A arg)
    {
      Double double_ = p.double_;
      return new hardtyped.Absyn.RealValue(double_);
    }
    public hardtyped.Absyn.Expr visit(hardtyped.Absyn.StringValue p, A arg)
    {
      String string_ = p.string_;
      return new hardtyped.Absyn.StringValue(string_);
    }
    public hardtyped.Absyn.Expr visit(hardtyped.Absyn.BoolValue p, A arg)
    {
      String bool_ = p.bool_;
      return new hardtyped.Absyn.BoolValue(bool_);
    }
    public hardtyped.Absyn.Expr visit(hardtyped.Absyn.UnitValue p, A arg)
    {
      String unit_ = p.unit_;
      return new hardtyped.Absyn.UnitValue(unit_);
    }
    public hardtyped.Absyn.Expr visit(hardtyped.Absyn.RecordConstr p, A arg)
    {
      hardtyped.Absyn.ListRecord listrecord_ = new hardtyped.Absyn.ListRecord();
      for (hardtyped.Absyn.Record x : p.listrecord_)
      {
        listrecord_.add(x.accept(this,arg));
      }
      return new hardtyped.Absyn.RecordConstr(listrecord_);
    }

    /* ModuleIdentifier */
    public hardtyped.Absyn.ModuleIdentifier visit(hardtyped.Absyn.ImportPath p, A arg)
    {
      hardtyped.Absyn.ListPath listpath_ = new hardtyped.Absyn.ListPath();
      for (hardtyped.Absyn.Path x : p.listpath_)
      {
        listpath_.add(x.accept(this,arg));
      }
      hardtyped.Absyn.ImportFileName importfilename_ = p.importfilename_.accept(this, arg);
      return new hardtyped.Absyn.ImportPath(listpath_, importfilename_);
    }

    /* ImportFileName */
    public hardtyped.Absyn.ImportFileName visit(hardtyped.Absyn.ImportFile p, A arg)
    {
      String ident_ = p.ident_;
      String packageextension_ = p.packageextension_;
      return new hardtyped.Absyn.ImportFile(ident_, packageextension_);
    }

    /* Path */
    public hardtyped.Absyn.Path visit(hardtyped.Absyn.BasePath p, A arg)
    {
      String ident_ = p.ident_;
      return new hardtyped.Absyn.BasePath(ident_);
    }

    /* Let */
    public hardtyped.Absyn.Let visit(hardtyped.Absyn.LetVariable p, A arg)
    {
      hardtyped.Absyn.VarDec vardec_ = p.vardec_.accept(this, arg);
      hardtyped.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new hardtyped.Absyn.LetVariable(vardec_, expr_);
    }
    public hardtyped.Absyn.Let visit(hardtyped.Absyn.LetInference p, A arg)
    {
      hardtyped.Absyn.VarDec vardec_ = p.vardec_.accept(this, arg);
      hardtyped.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      hardtyped.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new hardtyped.Absyn.LetInference(vardec_, expr_1, expr_2);
    }
    public hardtyped.Absyn.Let visit(hardtyped.Absyn.LetInferenceMany p, A arg)
    {
      hardtyped.Absyn.VarDec vardec_ = p.vardec_.accept(this, arg);
      hardtyped.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      hardtyped.Absyn.ListExpr listexpr_ = new hardtyped.Absyn.ListExpr();
      for (hardtyped.Absyn.Expr x : p.listexpr_)
      {
        listexpr_.add(x.accept(this,arg));
      }
      return new hardtyped.Absyn.LetInferenceMany(vardec_, expr_, listexpr_);
    }
    public hardtyped.Absyn.Let visit(hardtyped.Absyn.LetRec p, A arg)
    {
      hardtyped.Absyn.VarDec vardec_ = p.vardec_.accept(this, arg);
      hardtyped.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new hardtyped.Absyn.LetRec(vardec_, expr_);
    }
    public hardtyped.Absyn.Let visit(hardtyped.Absyn.LetType p, A arg)
    {
      hardtyped.Absyn.VarDec vardec_ = p.vardec_.accept(this, arg);
      hardtyped.Absyn.Type type_ = p.type_.accept(this, arg);
      return new hardtyped.Absyn.LetType(vardec_, type_);
    }

    /* VarDec */
    public hardtyped.Absyn.VarDec visit(hardtyped.Absyn.TypedVar p, A arg)
    {
      String ident_ = p.ident_;
      hardtyped.Absyn.Type type_ = p.type_.accept(this, arg);
      return new hardtyped.Absyn.TypedVar(ident_, type_);
    }
    public hardtyped.Absyn.VarDec visit(hardtyped.Absyn.UntypedVar p, A arg)
    {
      String ident_ = p.ident_;
      return new hardtyped.Absyn.UntypedVar(ident_);
    }

    /* VarName */
    public hardtyped.Absyn.VarName visit(hardtyped.Absyn.Func p, A arg)
    {
      hardtyped.Absyn.ListVarPath listvarpath_ = new hardtyped.Absyn.ListVarPath();
      for (hardtyped.Absyn.VarPath x : p.listvarpath_)
      {
        listvarpath_.add(x.accept(this,arg));
      }
      String ident_ = p.ident_;
      return new hardtyped.Absyn.Func(listvarpath_, ident_);
    }

    /* VarPath */
    public hardtyped.Absyn.VarPath visit(hardtyped.Absyn.Lib p, A arg)
    {
      String ident_ = p.ident_;
      return new hardtyped.Absyn.Lib(ident_);
    }

    /* ExprSequence */
    public hardtyped.Absyn.ExprSequence visit(hardtyped.Absyn.Seq p, A arg)
    {
      hardtyped.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new hardtyped.Absyn.Seq(expr_);
    }

    /* FuncArg */
    public hardtyped.Absyn.FuncArg visit(hardtyped.Absyn.Argument p, A arg)
    {
      String ident_ = p.ident_;
      hardtyped.Absyn.Type type_ = p.type_.accept(this, arg);
      return new hardtyped.Absyn.Argument(ident_, type_);
    }

    /* IfExpr */
    public hardtyped.Absyn.IfExpr visit(hardtyped.Absyn.If p, A arg)
    {
      hardtyped.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      hardtyped.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new hardtyped.Absyn.If(expr_1, expr_2);
    }
    public hardtyped.Absyn.IfExpr visit(hardtyped.Absyn.IfMultiple p, A arg)
    {
      hardtyped.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      hardtyped.Absyn.ListExpr listexpr_ = new hardtyped.Absyn.ListExpr();
      for (hardtyped.Absyn.Expr x : p.listexpr_)
      {
        listexpr_.add(x.accept(this,arg));
      }
      return new hardtyped.Absyn.IfMultiple(expr_, listexpr_);
    }

    /* ElseExpr */
    public hardtyped.Absyn.ElseExpr visit(hardtyped.Absyn.Else p, A arg)
    {
      hardtyped.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new hardtyped.Absyn.Else(expr_);
    }
    public hardtyped.Absyn.ElseExpr visit(hardtyped.Absyn.ElseMultiple p, A arg)
    {
      hardtyped.Absyn.ListExpr listexpr_ = new hardtyped.Absyn.ListExpr();
      for (hardtyped.Absyn.Expr x : p.listexpr_)
      {
        listexpr_.add(x.accept(this,arg));
      }
      return new hardtyped.Absyn.ElseMultiple(listexpr_);
    }

    /* Op */
    public hardtyped.Absyn.Op visit(hardtyped.Absyn.Not p, A arg)
    {
      hardtyped.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new hardtyped.Absyn.Not(expr_);
    }
    public hardtyped.Absyn.Op visit(hardtyped.Absyn.UnaryPlus p, A arg)
    {
      hardtyped.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new hardtyped.Absyn.UnaryPlus(expr_);
    }
    public hardtyped.Absyn.Op visit(hardtyped.Absyn.UnaryMinus p, A arg)
    {
      hardtyped.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new hardtyped.Absyn.UnaryMinus(expr_);
    }
    public hardtyped.Absyn.Op visit(hardtyped.Absyn.Multiply p, A arg)
    {
      hardtyped.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      hardtyped.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new hardtyped.Absyn.Multiply(expr_1, expr_2);
    }
    public hardtyped.Absyn.Op visit(hardtyped.Absyn.Divide p, A arg)
    {
      hardtyped.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      hardtyped.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new hardtyped.Absyn.Divide(expr_1, expr_2);
    }
    public hardtyped.Absyn.Op visit(hardtyped.Absyn.More p, A arg)
    {
      hardtyped.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      hardtyped.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new hardtyped.Absyn.More(expr_1, expr_2);
    }
    public hardtyped.Absyn.Op visit(hardtyped.Absyn.MoreEql p, A arg)
    {
      hardtyped.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      hardtyped.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new hardtyped.Absyn.MoreEql(expr_1, expr_2);
    }
    public hardtyped.Absyn.Op visit(hardtyped.Absyn.Eql p, A arg)
    {
      hardtyped.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      hardtyped.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new hardtyped.Absyn.Eql(expr_1, expr_2);
    }
    public hardtyped.Absyn.Op visit(hardtyped.Absyn.NotEql p, A arg)
    {
      hardtyped.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      hardtyped.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new hardtyped.Absyn.NotEql(expr_1, expr_2);
    }
    public hardtyped.Absyn.Op visit(hardtyped.Absyn.LessEql p, A arg)
    {
      hardtyped.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      hardtyped.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new hardtyped.Absyn.LessEql(expr_1, expr_2);
    }
    public hardtyped.Absyn.Op visit(hardtyped.Absyn.Less p, A arg)
    {
      hardtyped.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      hardtyped.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new hardtyped.Absyn.Less(expr_1, expr_2);
    }
    public hardtyped.Absyn.Op visit(hardtyped.Absyn.Sum p, A arg)
    {
      hardtyped.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      hardtyped.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new hardtyped.Absyn.Sum(expr_1, expr_2);
    }
    public hardtyped.Absyn.Op visit(hardtyped.Absyn.Substract p, A arg)
    {
      hardtyped.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      hardtyped.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new hardtyped.Absyn.Substract(expr_1, expr_2);
    }
    public hardtyped.Absyn.Op visit(hardtyped.Absyn.And p, A arg)
    {
      hardtyped.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      hardtyped.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new hardtyped.Absyn.And(expr_1, expr_2);
    }
    public hardtyped.Absyn.Op visit(hardtyped.Absyn.Or p, A arg)
    {
      hardtyped.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      hardtyped.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new hardtyped.Absyn.Or(expr_1, expr_2);
    }

    /* Type */
    public hardtyped.Absyn.Type visit(hardtyped.Absyn.IntType p, A arg)
    {
      return new hardtyped.Absyn.IntType();
    }
    public hardtyped.Absyn.Type visit(hardtyped.Absyn.RealType p, A arg)
    {
      return new hardtyped.Absyn.RealType();
    }
    public hardtyped.Absyn.Type visit(hardtyped.Absyn.BoolType p, A arg)
    {
      return new hardtyped.Absyn.BoolType();
    }
    public hardtyped.Absyn.Type visit(hardtyped.Absyn.StringType p, A arg)
    {
      return new hardtyped.Absyn.StringType();
    }
    public hardtyped.Absyn.Type visit(hardtyped.Absyn.UnitType p, A arg)
    {
      return new hardtyped.Absyn.UnitType();
    }
    public hardtyped.Absyn.Type visit(hardtyped.Absyn.AnyType p, A arg)
    {
      return new hardtyped.Absyn.AnyType();
    }
    public hardtyped.Absyn.Type visit(hardtyped.Absyn.FunctionType p, A arg)
    {
      hardtyped.Absyn.Type type_1 = p.type_1.accept(this, arg);
      hardtyped.Absyn.Type type_2 = p.type_2.accept(this, arg);
      return new hardtyped.Absyn.FunctionType(type_1, type_2);
    }
    public hardtyped.Absyn.Type visit(hardtyped.Absyn.RecordType p, A arg)
    {
      hardtyped.Absyn.ListRecord listrecord_ = new hardtyped.Absyn.ListRecord();
      for (hardtyped.Absyn.Record x : p.listrecord_)
      {
        listrecord_.add(x.accept(this,arg));
      }
      return new hardtyped.Absyn.RecordType(listrecord_);
    }

    /* Record */
    public hardtyped.Absyn.Record visit(hardtyped.Absyn.BaseRecordNameValue p, A arg)
    {
      hardtyped.Absyn.VarDec vardec_ = p.vardec_.accept(this, arg);
      hardtyped.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new hardtyped.Absyn.BaseRecordNameValue(vardec_, expr_);
    }
    public hardtyped.Absyn.Record visit(hardtyped.Absyn.BaseRecordName p, A arg)
    {
      hardtyped.Absyn.VarDec vardec_ = p.vardec_.accept(this, arg);
      return new hardtyped.Absyn.BaseRecordName(vardec_);
    }
}
