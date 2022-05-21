// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped;

public class PrettyPrinter
{
  //For certain applications increasing the initial size of the buffer may improve performance.
  private static final int INITIAL_BUFFER_SIZE = 128;
  private static final int INDENT_WIDTH = 2;
  //You may wish to change the parentheses used in precedence.
  private static final String _L_PAREN = new String("(");
  private static final String _R_PAREN = new String(")");
  //You may wish to change render
  private static void render(String s)
  {
    if (s.equals("{"))
    {
       onEmptyLine();
       buf_.append(s);
       _n_ = _n_ + INDENT_WIDTH;
       buf_.append("\n");
       indent();
    }
    else if (s.equals("(") || s.equals("["))
       buf_.append(s);
    else if (s.equals(")") || s.equals("]"))
    {
       removeTrailingWhitespace();
       buf_.append(s);
       buf_.append(" ");
    }
    else if (s.equals("}"))
    {
       _n_ = _n_ - INDENT_WIDTH;
       onEmptyLine();
       buf_.append(s);
       buf_.append("\n");
       indent();
    }
    else if (s.equals(","))
    {
       removeTrailingWhitespace();
       buf_.append(s);
       buf_.append(" ");
    }
    else if (s.equals(";"))
    {
       removeTrailingWhitespace();
       buf_.append(s);
       buf_.append("\n");
       indent();
    }
    else if (s.equals("")) return;
    else if (s.trim().equals(""))
    {
       backup();
       buf_.append(s);
    }
    else
    {
       buf_.append(s);
       buf_.append(" ");
    }
  }


  //  print and show methods are defined for each category.
  public static String print(hardtyped.Absyn.ListExpr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.ListExpr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.Expr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.Expr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.InExpr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.InExpr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.FuncArg foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.FuncArg foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.VarDec foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.VarDec foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.Type foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.Type foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  /***   You shouldn't need to change anything beyond this point.   ***/

  private static void pp(hardtyped.Absyn.ListExpr foo, int _i_)
  {
    ppListExpr(foo.iterator(), _i_);
  }

  private static void ppListExpr(java.util.Iterator<hardtyped.Absyn.Expr> it, int _i_)
  {
    if (it.hasNext())
    {
      hardtyped.Absyn.Expr el = it.next();
      if (!it.hasNext())
      { /* last */
        pp(el, _i_);
      }
      else
      { /* cons */
        pp(el, _i_); render(";"); ppListExpr(it, _i_);
      }
    }
  }


  private static void pp(hardtyped.Absyn.Expr foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.Function)
    {
       hardtyped.Absyn.Function _function = (hardtyped.Absyn.Function) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("/\\");
       pp(_function.funcarg_, 0);
       render("{");
       pp(_function.inexpr_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.ApplyFunction)
    {
       hardtyped.Absyn.ApplyFunction _applyfunction = (hardtyped.Absyn.ApplyFunction) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_applyfunction.expr_1, 0);
       render("(");
       pp(_applyfunction.expr_2, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.PrintFunction)
    {
       hardtyped.Absyn.PrintFunction _printfunction = (hardtyped.Absyn.PrintFunction) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_printfunction.print_, 0);
       render("(");
       pp(_printfunction.expr_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.ReadFunction)
    {
       hardtyped.Absyn.ReadFunction _readfunction = (hardtyped.Absyn.ReadFunction) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_readfunction.read_, 0);
       render("(");
       pp(_readfunction.expr_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.EmptyPrintFunction)
    {
       hardtyped.Absyn.EmptyPrintFunction _emptyprintfunction = (hardtyped.Absyn.EmptyPrintFunction) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_emptyprintfunction.print_, 0);
       render("(");
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.EmptyReadFunction)
    {
       hardtyped.Absyn.EmptyReadFunction _emptyreadfunction = (hardtyped.Absyn.EmptyReadFunction) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_emptyreadfunction.read_, 0);
       render("(");
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.MultipleArgFunction)
    {
       hardtyped.Absyn.MultipleArgFunction _multipleargfunction = (hardtyped.Absyn.MultipleArgFunction) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_multipleargfunction.expr_1, 0);
       render(",");
       pp(_multipleargfunction.expr_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.If)
    {
       hardtyped.Absyn.If _if = (hardtyped.Absyn.If) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("|");
       render("(");
       pp(_if.expr_1, 0);
       render(")");
       render(":");
       pp(_if.expr_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Else)
    {
       hardtyped.Absyn.Else _else = (hardtyped.Absyn.Else) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("|:");
       pp(_else.expr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Sum)
    {
       hardtyped.Absyn.Sum _sum = (hardtyped.Absyn.Sum) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_sum.expr_1, 0);
       render("+");
       pp(_sum.expr_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Substract)
    {
       hardtyped.Absyn.Substract _substract = (hardtyped.Absyn.Substract) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_substract.expr_1, 0);
       render("-");
       pp(_substract.expr_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Multiply)
    {
       hardtyped.Absyn.Multiply _multiply = (hardtyped.Absyn.Multiply) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_multiply.expr_1, 0);
       render("*");
       pp(_multiply.expr_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Divide)
    {
       hardtyped.Absyn.Divide _divide = (hardtyped.Absyn.Divide) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_divide.expr_1, 0);
       render("/");
       pp(_divide.expr_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.And)
    {
       hardtyped.Absyn.And _and = (hardtyped.Absyn.And) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_and.expr_1, 0);
       render("and");
       pp(_and.expr_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Or)
    {
       hardtyped.Absyn.Or _or = (hardtyped.Absyn.Or) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_or.expr_1, 0);
       render("or");
       pp(_or.expr_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Not)
    {
       hardtyped.Absyn.Not _not = (hardtyped.Absyn.Not) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("not");
       pp(_not.expr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.More)
    {
       hardtyped.Absyn.More _more = (hardtyped.Absyn.More) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_more.expr_1, 0);
       render(">");
       pp(_more.expr_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.MoreEql)
    {
       hardtyped.Absyn.MoreEql _moreeql = (hardtyped.Absyn.MoreEql) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_moreeql.expr_1, 0);
       render(">=");
       pp(_moreeql.expr_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Eql)
    {
       hardtyped.Absyn.Eql _eql = (hardtyped.Absyn.Eql) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_eql.expr_1, 0);
       render("==");
       pp(_eql.expr_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.LessEql)
    {
       hardtyped.Absyn.LessEql _lesseql = (hardtyped.Absyn.LessEql) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_lesseql.expr_1, 0);
       render("<=");
       pp(_lesseql.expr_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Less)
    {
       hardtyped.Absyn.Less _less = (hardtyped.Absyn.Less) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_less.expr_1, 0);
       render("<");
       pp(_less.expr_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.UnaryPlus)
    {
       hardtyped.Absyn.UnaryPlus _unaryplus = (hardtyped.Absyn.UnaryPlus) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("+");
       pp(_unaryplus.expr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.UnaryMinus)
    {
       hardtyped.Absyn.UnaryMinus _unaryminus = (hardtyped.Absyn.UnaryMinus) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("-");
       pp(_unaryminus.expr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Let)
    {
       hardtyped.Absyn.Let _let = (hardtyped.Absyn.Let) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("let");
       pp(_let.vardec_, 0);
       render("=");
       pp(_let.expr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.LetInference)
    {
       hardtyped.Absyn.LetInference _letinference = (hardtyped.Absyn.LetInference) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("let");
       pp(_letinference.vardec_, 0);
       render("=");
       pp(_letinference.expr_1, 0);
       render("in");
       pp(_letinference.expr_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.LetAscription)
    {
       hardtyped.Absyn.LetAscription _letascription = (hardtyped.Absyn.LetAscription) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("let");
       pp(_letascription.vardec_, 0);
       render("=");
       pp(_letascription.expr_, 0);
       render("as");
       pp(_letascription.type_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.LetRec)
    {
       hardtyped.Absyn.LetRec _letrec = (hardtyped.Absyn.LetRec) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("letrec");
       pp(_letrec.vardec_, 0);
       render("=");
       pp(_letrec.expr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.IntValue)
    {
       hardtyped.Absyn.IntValue _intvalue = (hardtyped.Absyn.IntValue) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_intvalue.integer_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.RealValue)
    {
       hardtyped.Absyn.RealValue _realvalue = (hardtyped.Absyn.RealValue) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_realvalue.double_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.StringValue)
    {
       hardtyped.Absyn.StringValue _stringvalue = (hardtyped.Absyn.StringValue) foo;
       if (_i_ > 0) render(_L_PAREN);
       printQuoted(_stringvalue.string_);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.BoolValue)
    {
       hardtyped.Absyn.BoolValue _boolvalue = (hardtyped.Absyn.BoolValue) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_boolvalue.bool_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.UnitValue)
    {
       hardtyped.Absyn.UnitValue _unitvalue = (hardtyped.Absyn.UnitValue) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_unitvalue.unit_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.AtomicExpression)
    {
       hardtyped.Absyn.AtomicExpression _atomicexpression = (hardtyped.Absyn.AtomicExpression) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_atomicexpression.ident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.ParenthesesExpression)
    {
       hardtyped.Absyn.ParenthesesExpression _parenthesesexpression = (hardtyped.Absyn.ParenthesesExpression) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("(");
       pp(_parenthesesexpression.expr_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.DotExpression)
    {
       hardtyped.Absyn.DotExpression _dotexpression = (hardtyped.Absyn.DotExpression) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_dotexpression.ident_1, 0);
       render(".");
       pp(_dotexpression.ident_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.InExpr foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.MultipleExpressions)
    {
       hardtyped.Absyn.MultipleExpressions _multipleexpressions = (hardtyped.Absyn.MultipleExpressions) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_multipleexpressions.inexpr_1, 0);
       render(";");
       pp(_multipleexpressions.inexpr_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.FinalExpression)
    {
       hardtyped.Absyn.FinalExpression _finalexpression = (hardtyped.Absyn.FinalExpression) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_finalexpression.inexpr_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.InnerExpression)
    {
       hardtyped.Absyn.InnerExpression _innerexpression = (hardtyped.Absyn.InnerExpression) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_innerexpression.expr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.FuncArg foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.MultipleArgs)
    {
       hardtyped.Absyn.MultipleArgs _multipleargs = (hardtyped.Absyn.MultipleArgs) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_multipleargs.vardec_, 0);
       render(".");
       pp(_multipleargs.funcarg_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.FinalArg)
    {
       hardtyped.Absyn.FinalArg _finalarg = (hardtyped.Absyn.FinalArg) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_finalarg.vardec_, 0);
       render(".");
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.VarDec foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.TypedVar)
    {
       hardtyped.Absyn.TypedVar _typedvar = (hardtyped.Absyn.TypedVar) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_typedvar.ident_, 0);
       render(":");
       pp(_typedvar.type_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.UntypedVar)
    {
       hardtyped.Absyn.UntypedVar _untypedvar = (hardtyped.Absyn.UntypedVar) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_untypedvar.ident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.Type foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.IntType)
    {
       hardtyped.Absyn.IntType _inttype = (hardtyped.Absyn.IntType) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("Integer");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.RealType)
    {
       hardtyped.Absyn.RealType _realtype = (hardtyped.Absyn.RealType) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("Real");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.BoolType)
    {
       hardtyped.Absyn.BoolType _booltype = (hardtyped.Absyn.BoolType) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("Boolean");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.StringType)
    {
       hardtyped.Absyn.StringType _stringtype = (hardtyped.Absyn.StringType) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("String");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.UnitType)
    {
       hardtyped.Absyn.UnitType _unittype = (hardtyped.Absyn.UnitType) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("Unit");
       if (_i_ > 0) render(_R_PAREN);
    }

  }


  private static void sh(hardtyped.Absyn.ListExpr foo)
  {
     for (java.util.Iterator<hardtyped.Absyn.Expr> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(hardtyped.Absyn.Expr foo)
  {
    if (foo instanceof hardtyped.Absyn.Function)
    {
       hardtyped.Absyn.Function _function = (hardtyped.Absyn.Function) foo;
       render("(");
       render("Function");
       sh(_function.funcarg_);
       sh(_function.inexpr_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.ApplyFunction)
    {
       hardtyped.Absyn.ApplyFunction _applyfunction = (hardtyped.Absyn.ApplyFunction) foo;
       render("(");
       render("ApplyFunction");
       sh(_applyfunction.expr_1);
       sh(_applyfunction.expr_2);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.PrintFunction)
    {
       hardtyped.Absyn.PrintFunction _printfunction = (hardtyped.Absyn.PrintFunction) foo;
       render("(");
       render("PrintFunction");
       sh(_printfunction.print_);
       sh(_printfunction.expr_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.ReadFunction)
    {
       hardtyped.Absyn.ReadFunction _readfunction = (hardtyped.Absyn.ReadFunction) foo;
       render("(");
       render("ReadFunction");
       sh(_readfunction.read_);
       sh(_readfunction.expr_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.EmptyPrintFunction)
    {
       hardtyped.Absyn.EmptyPrintFunction _emptyprintfunction = (hardtyped.Absyn.EmptyPrintFunction) foo;
       render("(");
       render("EmptyPrintFunction");
       sh(_emptyprintfunction.print_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.EmptyReadFunction)
    {
       hardtyped.Absyn.EmptyReadFunction _emptyreadfunction = (hardtyped.Absyn.EmptyReadFunction) foo;
       render("(");
       render("EmptyReadFunction");
       sh(_emptyreadfunction.read_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.MultipleArgFunction)
    {
       hardtyped.Absyn.MultipleArgFunction _multipleargfunction = (hardtyped.Absyn.MultipleArgFunction) foo;
       render("(");
       render("MultipleArgFunction");
       sh(_multipleargfunction.expr_1);
       sh(_multipleargfunction.expr_2);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.If)
    {
       hardtyped.Absyn.If _if = (hardtyped.Absyn.If) foo;
       render("(");
       render("If");
       sh(_if.expr_1);
       sh(_if.expr_2);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.Else)
    {
       hardtyped.Absyn.Else _else = (hardtyped.Absyn.Else) foo;
       render("(");
       render("Else");
       sh(_else.expr_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.Sum)
    {
       hardtyped.Absyn.Sum _sum = (hardtyped.Absyn.Sum) foo;
       render("(");
       render("Sum");
       sh(_sum.expr_1);
       sh(_sum.expr_2);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.Substract)
    {
       hardtyped.Absyn.Substract _substract = (hardtyped.Absyn.Substract) foo;
       render("(");
       render("Substract");
       sh(_substract.expr_1);
       sh(_substract.expr_2);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.Multiply)
    {
       hardtyped.Absyn.Multiply _multiply = (hardtyped.Absyn.Multiply) foo;
       render("(");
       render("Multiply");
       sh(_multiply.expr_1);
       sh(_multiply.expr_2);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.Divide)
    {
       hardtyped.Absyn.Divide _divide = (hardtyped.Absyn.Divide) foo;
       render("(");
       render("Divide");
       sh(_divide.expr_1);
       sh(_divide.expr_2);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.And)
    {
       hardtyped.Absyn.And _and = (hardtyped.Absyn.And) foo;
       render("(");
       render("And");
       sh(_and.expr_1);
       sh(_and.expr_2);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.Or)
    {
       hardtyped.Absyn.Or _or = (hardtyped.Absyn.Or) foo;
       render("(");
       render("Or");
       sh(_or.expr_1);
       sh(_or.expr_2);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.Not)
    {
       hardtyped.Absyn.Not _not = (hardtyped.Absyn.Not) foo;
       render("(");
       render("Not");
       sh(_not.expr_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.More)
    {
       hardtyped.Absyn.More _more = (hardtyped.Absyn.More) foo;
       render("(");
       render("More");
       sh(_more.expr_1);
       sh(_more.expr_2);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.MoreEql)
    {
       hardtyped.Absyn.MoreEql _moreeql = (hardtyped.Absyn.MoreEql) foo;
       render("(");
       render("MoreEql");
       sh(_moreeql.expr_1);
       sh(_moreeql.expr_2);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.Eql)
    {
       hardtyped.Absyn.Eql _eql = (hardtyped.Absyn.Eql) foo;
       render("(");
       render("Eql");
       sh(_eql.expr_1);
       sh(_eql.expr_2);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.LessEql)
    {
       hardtyped.Absyn.LessEql _lesseql = (hardtyped.Absyn.LessEql) foo;
       render("(");
       render("LessEql");
       sh(_lesseql.expr_1);
       sh(_lesseql.expr_2);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.Less)
    {
       hardtyped.Absyn.Less _less = (hardtyped.Absyn.Less) foo;
       render("(");
       render("Less");
       sh(_less.expr_1);
       sh(_less.expr_2);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.UnaryPlus)
    {
       hardtyped.Absyn.UnaryPlus _unaryplus = (hardtyped.Absyn.UnaryPlus) foo;
       render("(");
       render("UnaryPlus");
       sh(_unaryplus.expr_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.UnaryMinus)
    {
       hardtyped.Absyn.UnaryMinus _unaryminus = (hardtyped.Absyn.UnaryMinus) foo;
       render("(");
       render("UnaryMinus");
       sh(_unaryminus.expr_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.Let)
    {
       hardtyped.Absyn.Let _let = (hardtyped.Absyn.Let) foo;
       render("(");
       render("Let");
       sh(_let.vardec_);
       sh(_let.expr_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.LetInference)
    {
       hardtyped.Absyn.LetInference _letinference = (hardtyped.Absyn.LetInference) foo;
       render("(");
       render("LetInference");
       sh(_letinference.vardec_);
       sh(_letinference.expr_1);
       sh(_letinference.expr_2);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.LetAscription)
    {
       hardtyped.Absyn.LetAscription _letascription = (hardtyped.Absyn.LetAscription) foo;
       render("(");
       render("LetAscription");
       sh(_letascription.vardec_);
       sh(_letascription.expr_);
       sh(_letascription.type_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.LetRec)
    {
       hardtyped.Absyn.LetRec _letrec = (hardtyped.Absyn.LetRec) foo;
       render("(");
       render("LetRec");
       sh(_letrec.vardec_);
       sh(_letrec.expr_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.IntValue)
    {
       hardtyped.Absyn.IntValue _intvalue = (hardtyped.Absyn.IntValue) foo;
       render("(");
       render("IntValue");
       sh(_intvalue.integer_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.RealValue)
    {
       hardtyped.Absyn.RealValue _realvalue = (hardtyped.Absyn.RealValue) foo;
       render("(");
       render("RealValue");
       sh(_realvalue.double_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.StringValue)
    {
       hardtyped.Absyn.StringValue _stringvalue = (hardtyped.Absyn.StringValue) foo;
       render("(");
       render("StringValue");
       sh(_stringvalue.string_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.BoolValue)
    {
       hardtyped.Absyn.BoolValue _boolvalue = (hardtyped.Absyn.BoolValue) foo;
       render("(");
       render("BoolValue");
       sh(_boolvalue.bool_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.UnitValue)
    {
       hardtyped.Absyn.UnitValue _unitvalue = (hardtyped.Absyn.UnitValue) foo;
       render("(");
       render("UnitValue");
       sh(_unitvalue.unit_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.AtomicExpression)
    {
       hardtyped.Absyn.AtomicExpression _atomicexpression = (hardtyped.Absyn.AtomicExpression) foo;
       render("(");
       render("AtomicExpression");
       sh(_atomicexpression.ident_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.ParenthesesExpression)
    {
       hardtyped.Absyn.ParenthesesExpression _parenthesesexpression = (hardtyped.Absyn.ParenthesesExpression) foo;
       render("(");
       render("ParenthesesExpression");
       sh(_parenthesesexpression.expr_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.DotExpression)
    {
       hardtyped.Absyn.DotExpression _dotexpression = (hardtyped.Absyn.DotExpression) foo;
       render("(");
       render("DotExpression");
       sh(_dotexpression.ident_1);
       sh(_dotexpression.ident_2);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.InExpr foo)
  {
    if (foo instanceof hardtyped.Absyn.MultipleExpressions)
    {
       hardtyped.Absyn.MultipleExpressions _multipleexpressions = (hardtyped.Absyn.MultipleExpressions) foo;
       render("(");
       render("MultipleExpressions");
       sh(_multipleexpressions.inexpr_1);
       sh(_multipleexpressions.inexpr_2);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.FinalExpression)
    {
       hardtyped.Absyn.FinalExpression _finalexpression = (hardtyped.Absyn.FinalExpression) foo;
       render("(");
       render("FinalExpression");
       sh(_finalexpression.inexpr_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.InnerExpression)
    {
       hardtyped.Absyn.InnerExpression _innerexpression = (hardtyped.Absyn.InnerExpression) foo;
       render("(");
       render("InnerExpression");
       sh(_innerexpression.expr_);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.FuncArg foo)
  {
    if (foo instanceof hardtyped.Absyn.MultipleArgs)
    {
       hardtyped.Absyn.MultipleArgs _multipleargs = (hardtyped.Absyn.MultipleArgs) foo;
       render("(");
       render("MultipleArgs");
       sh(_multipleargs.vardec_);
       sh(_multipleargs.funcarg_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.FinalArg)
    {
       hardtyped.Absyn.FinalArg _finalarg = (hardtyped.Absyn.FinalArg) foo;
       render("(");
       render("FinalArg");
       sh(_finalarg.vardec_);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.VarDec foo)
  {
    if (foo instanceof hardtyped.Absyn.TypedVar)
    {
       hardtyped.Absyn.TypedVar _typedvar = (hardtyped.Absyn.TypedVar) foo;
       render("(");
       render("TypedVar");
       sh(_typedvar.ident_);
       sh(_typedvar.type_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.UntypedVar)
    {
       hardtyped.Absyn.UntypedVar _untypedvar = (hardtyped.Absyn.UntypedVar) foo;
       render("(");
       render("UntypedVar");
       sh(_untypedvar.ident_);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.Type foo)
  {
    if (foo instanceof hardtyped.Absyn.IntType)
    {
       hardtyped.Absyn.IntType _inttype = (hardtyped.Absyn.IntType) foo;
       render("IntType");
    }
    if (foo instanceof hardtyped.Absyn.RealType)
    {
       hardtyped.Absyn.RealType _realtype = (hardtyped.Absyn.RealType) foo;
       render("RealType");
    }
    if (foo instanceof hardtyped.Absyn.BoolType)
    {
       hardtyped.Absyn.BoolType _booltype = (hardtyped.Absyn.BoolType) foo;
       render("BoolType");
    }
    if (foo instanceof hardtyped.Absyn.StringType)
    {
       hardtyped.Absyn.StringType _stringtype = (hardtyped.Absyn.StringType) foo;
       render("StringType");
    }
    if (foo instanceof hardtyped.Absyn.UnitType)
    {
       hardtyped.Absyn.UnitType _unittype = (hardtyped.Absyn.UnitType) foo;
       render("UnitType");
    }
  }


  private static void pp(Integer n, int _i_) { buf_.append(n); buf_.append(" "); }
  private static void pp(Double d, int _i_) { buf_.append(String.format(java.util.Locale.ROOT, "%.15g ", d)); }
  private static void pp(String s, int _i_) { buf_.append(s); buf_.append(" "); }
  private static void pp(Character c, int _i_) { buf_.append("'" + c.toString() + "'"); buf_.append(" "); }
  private static void sh(Integer n) { render(n.toString()); }
  private static void sh(Double d) { render(String.format(java.util.Locale.ROOT, "%.15g", d)); }
  private static void sh(Character c) { render("'" + c.toString() + "'"); }
  private static void sh(String s) { printQuoted(s); }

  private static void printQuoted(String s) { render("\"" + s + "\""); }

  private static void indent()
  {
    int n = _n_;
    while (n > 0)
    {
      buf_.append(' ');
      n--;
    }
  }

  private static void backup()
  {
    int prev = buf_.length() - 1;
    if (prev >= 0 && buf_.charAt(prev) == ' ')
      buf_.setLength(prev);
  }

  private static void trim()
  {
    // Trim initial spaces
    int end = 0;
    int len = buf_.length();
    while (end < len && buf_.charAt(end) == ' ')
      end++;
    buf_.delete(0, end);
    // Trim trailing spaces
    removeTrailingSpaces();
  }

  private static void removeTrailingSpaces()
  {
    int end = buf_.length();
    while (end > 0 && buf_.charAt(end-1) == ' ')
      end--;
    buf_.setLength(end);
  }

  private static void removeTrailingWhitespace()
  {
    int end = buf_.length();
    while (end > 0 && (buf_.charAt(end-1) == ' ' || buf_.charAt(end-1) == '\n'))
      end--;
    buf_.setLength(end);
  }

  private static void onEmptyLine()
  {
    removeTrailingSpaces();
    int len = buf_.length();
    if (len > 0 && buf_.charAt(len-1) != '\n') buf_.append("\n");
    indent();
  }

  private static int _n_ = 0;
  private static StringBuilder buf_ = new StringBuilder(INITIAL_BUFFER_SIZE);
}

