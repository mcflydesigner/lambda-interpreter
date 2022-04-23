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
  public static String print(hardtyped.Absyn.Program foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.Program foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.Stm foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.Stm foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.IfStart foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.IfStart foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.Else foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.Else foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.Body foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.Body foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.Expression foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.Expression foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.Conjunction foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.Conjunction foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.Relation foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.Relation foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.Factor foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.Factor foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.Term foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.Term foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.Unary foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.Unary foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.Ascription foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.Ascription foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.Literal foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.Literal foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.RecordElement foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.RecordElement foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.FunctionParameters foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.FunctionParameters foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.FunctionBody foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.FunctionBody foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.Identifier foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.Identifier foo)
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
  public static String print(hardtyped.Absyn.Operand foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.Operand foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.PlusMinus foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.PlusMinus foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.MultDiv foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.MultDiv foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(hardtyped.Absyn.UnaryPrefix foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(hardtyped.Absyn.UnaryPrefix foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  /***   You shouldn't need to change anything beyond this point.   ***/

  private static void pp(hardtyped.Absyn.Program foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.Progr)
    {
       hardtyped.Absyn.Progr _progr = (hardtyped.Absyn.Progr) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_progr.stm_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.Stm foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.ImportAs)
    {
       hardtyped.Absyn.ImportAs _importas = (hardtyped.Absyn.ImportAs) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("-|");
       pp(_importas.identifier_1, 0);
       render("as");
       pp(_importas.identifier_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.ImportPlain)
    {
       hardtyped.Absyn.ImportPlain _importplain = (hardtyped.Absyn.ImportPlain) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("-|");
       pp(_importplain.identifier_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.If)
    {
       hardtyped.Absyn.If _if = (hardtyped.Absyn.If) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_if.ifstart_, 0);
       pp(_if.else_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Let)
    {
       hardtyped.Absyn.Let _let = (hardtyped.Absyn.Let) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("let");
       pp(_let.identifier_, 0);
       render(":");
       pp(_let.type_, 0);
       render("=");
       pp(_let.expression_1, 0);
       render("in");
       pp(_let.expression_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Letrec)
    {
       hardtyped.Absyn.Letrec _letrec = (hardtyped.Absyn.Letrec) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("letrec");
       pp(_letrec.identifier_, 0);
       render(":");
       pp(_letrec.type_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.IfStart foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.IfStart1)
    {
       hardtyped.Absyn.IfStart1 _ifstart1 = (hardtyped.Absyn.IfStart1) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("|");
       pp(_ifstart1.expression_, 0);
       render(":");
       pp(_ifstart1.body_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.Else foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.Else1)
    {
       hardtyped.Absyn.Else1 _else1 = (hardtyped.Absyn.Else1) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("|:");
       pp(_else1.body_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.Body foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.Body1)
    {
       hardtyped.Absyn.Body1 _body1 = (hardtyped.Absyn.Body1) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_body1.expression_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.Expression foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.Expression1)
    {
       hardtyped.Absyn.Expression1 _expression1 = (hardtyped.Absyn.Expression1) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_expression1.conjunction_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Expression2)
    {
       hardtyped.Absyn.Expression2 _expression2 = (hardtyped.Absyn.Expression2) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("{");
       pp(_expression2.conjunction_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.Conjunction foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.Conjunction1)
    {
       hardtyped.Absyn.Conjunction1 _conjunction1 = (hardtyped.Absyn.Conjunction1) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_conjunction1.relation_1, 0);
       pp(_conjunction1.relation_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.Relation foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.Relation1)
    {
       hardtyped.Absyn.Relation1 _relation1 = (hardtyped.Absyn.Relation1) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_relation1.factor_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Relation2)
    {
       hardtyped.Absyn.Relation2 _relation2 = (hardtyped.Absyn.Relation2) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_relation2.factor_1, 0);
       pp(_relation2.operand_, 0);
       pp(_relation2.factor_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.Factor foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.Factor1)
    {
       hardtyped.Absyn.Factor1 _factor1 = (hardtyped.Absyn.Factor1) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_factor1.term_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Factor2)
    {
       hardtyped.Absyn.Factor2 _factor2 = (hardtyped.Absyn.Factor2) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_factor2.term_1, 0);
       pp(_factor2.plusminus_, 0);
       pp(_factor2.term_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.Term foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.Term1)
    {
       hardtyped.Absyn.Term1 _term1 = (hardtyped.Absyn.Term1) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_term1.unary_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Term2)
    {
       hardtyped.Absyn.Term2 _term2 = (hardtyped.Absyn.Term2) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_term2.unary_1, 0);
       pp(_term2.multdiv_, 0);
       pp(_term2.unary_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.Unary foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.Unary1)
    {
       hardtyped.Absyn.Unary1 _unary1 = (hardtyped.Absyn.Unary1) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_unary1.expression_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Unary2)
    {
       hardtyped.Absyn.Unary2 _unary2 = (hardtyped.Absyn.Unary2) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_unary2.literal_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Unary3)
    {
       hardtyped.Absyn.Unary3 _unary3 = (hardtyped.Absyn.Unary3) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_unary3.unaryprefix_, 0);
       pp(_unary3.identifier_, 0);
       pp(_unary3.ascription_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.Ascription foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.Ascription1)
    {
       hardtyped.Absyn.Ascription1 _ascription1 = (hardtyped.Absyn.Ascription1) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("as");
       pp(_ascription1.type_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.Literal foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.ArrayLiteral)
    {
       hardtyped.Absyn.ArrayLiteral _arrayliteral = (hardtyped.Absyn.ArrayLiteral) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("[");
       pp(_arrayliteral.expression_, 0);
       render("]");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.FunctionLiteral)
    {
       hardtyped.Absyn.FunctionLiteral _functionliteral = (hardtyped.Absyn.FunctionLiteral) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("/\\");
       pp(_functionliteral.functionparameters_, 0);
       render(".");
       pp(_functionliteral.functionbody_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.RecordLiteral)
    {
       hardtyped.Absyn.RecordLiteral _recordliteral = (hardtyped.Absyn.RecordLiteral) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("{");
       pp(_recordliteral.recordelement_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.RecordElement foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.RecordElement1)
    {
       hardtyped.Absyn.RecordElement1 _recordelement1 = (hardtyped.Absyn.RecordElement1) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_recordelement1.identifier_, 0);
       render("=");
       pp(_recordelement1.expression_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.FunctionParameters foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.FunctionParameters1)
    {
       hardtyped.Absyn.FunctionParameters1 _functionparameters1 = (hardtyped.Absyn.FunctionParameters1) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_functionparameters1.identifier_, 0);
       render(":");
       pp(_functionparameters1.type_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.FunctionBody foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.FunctionBody1)
    {
       hardtyped.Absyn.FunctionBody1 _functionbody1 = (hardtyped.Absyn.FunctionBody1) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_functionbody1.body_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.Identifier foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.Identifier1)
    {
       hardtyped.Absyn.Identifier1 _identifier1 = (hardtyped.Absyn.Identifier1) foo;
       if (_i_ > 0) render(_L_PAREN);
       printQuoted(_identifier1.string_);
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.Type foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.Int)
    {
       hardtyped.Absyn.Int _int = (hardtyped.Absyn.Int) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("Int");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Real)
    {
       hardtyped.Absyn.Real _real = (hardtyped.Absyn.Real) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("Real");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.String)
    {
       hardtyped.Absyn.String _string = (hardtyped.Absyn.String) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("String");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Boolean)
    {
       hardtyped.Absyn.Boolean _boolean = (hardtyped.Absyn.Boolean) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("Boolean");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Unit)
    {
       hardtyped.Absyn.Unit _unit = (hardtyped.Absyn.Unit) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("Unit");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.FunctionTypeIndicator)
    {
       hardtyped.Absyn.FunctionTypeIndicator _functiontypeindicator = (hardtyped.Absyn.FunctionTypeIndicator) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_functiontypeindicator.type_1, 0);
       render("->");
       pp(_functiontypeindicator.type_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.Operand foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.Less)
    {
       hardtyped.Absyn.Less _less = (hardtyped.Absyn.Less) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("<");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.LessEql)
    {
       hardtyped.Absyn.LessEql _lesseql = (hardtyped.Absyn.LessEql) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("<=");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.More)
    {
       hardtyped.Absyn.More _more = (hardtyped.Absyn.More) foo;
       if (_i_ > 0) render(_L_PAREN);
       render(">");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.MoreEql)
    {
       hardtyped.Absyn.MoreEql _moreeql = (hardtyped.Absyn.MoreEql) foo;
       if (_i_ > 0) render(_L_PAREN);
       render(">=");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Eql)
    {
       hardtyped.Absyn.Eql _eql = (hardtyped.Absyn.Eql) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("=");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.NotEql)
    {
       hardtyped.Absyn.NotEql _noteql = (hardtyped.Absyn.NotEql) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("/=");
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.PlusMinus foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.Plus)
    {
       hardtyped.Absyn.Plus _plus = (hardtyped.Absyn.Plus) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("+");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Minus)
    {
       hardtyped.Absyn.Minus _minus = (hardtyped.Absyn.Minus) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("-");
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.MultDiv foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.Mult)
    {
       hardtyped.Absyn.Mult _mult = (hardtyped.Absyn.Mult) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("*");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.Div)
    {
       hardtyped.Absyn.Div _div = (hardtyped.Absyn.Div) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("/");
       if (_i_ > 0) render(_R_PAREN);
    }

  }

  private static void pp(hardtyped.Absyn.UnaryPrefix foo, int _i_)
  {
    if (foo instanceof hardtyped.Absyn.PlusPfx)
    {
       hardtyped.Absyn.PlusPfx _pluspfx = (hardtyped.Absyn.PlusPfx) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("+");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.MinusPfx)
    {
       hardtyped.Absyn.MinusPfx _minuspfx = (hardtyped.Absyn.MinusPfx) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("-");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof hardtyped.Absyn.NotPfx)
    {
       hardtyped.Absyn.NotPfx _notpfx = (hardtyped.Absyn.NotPfx) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("not");
       if (_i_ > 0) render(_R_PAREN);
    }

  }


  private static void sh(hardtyped.Absyn.Program foo)
  {
    if (foo instanceof hardtyped.Absyn.Progr)
    {
       hardtyped.Absyn.Progr _progr = (hardtyped.Absyn.Progr) foo;
       render("(");
       render("Progr");
       sh(_progr.stm_);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.Stm foo)
  {
    if (foo instanceof hardtyped.Absyn.ImportAs)
    {
       hardtyped.Absyn.ImportAs _importas = (hardtyped.Absyn.ImportAs) foo;
       render("(");
       render("ImportAs");
       sh(_importas.identifier_1);
       sh(_importas.identifier_2);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.ImportPlain)
    {
       hardtyped.Absyn.ImportPlain _importplain = (hardtyped.Absyn.ImportPlain) foo;
       render("(");
       render("ImportPlain");
       sh(_importplain.identifier_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.If)
    {
       hardtyped.Absyn.If _if = (hardtyped.Absyn.If) foo;
       render("(");
       render("If");
       sh(_if.ifstart_);
       sh(_if.else_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.Let)
    {
       hardtyped.Absyn.Let _let = (hardtyped.Absyn.Let) foo;
       render("(");
       render("Let");
       sh(_let.identifier_);
       sh(_let.type_);
       sh(_let.expression_1);
       sh(_let.expression_2);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.Letrec)
    {
       hardtyped.Absyn.Letrec _letrec = (hardtyped.Absyn.Letrec) foo;
       render("(");
       render("Letrec");
       sh(_letrec.identifier_);
       sh(_letrec.type_);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.IfStart foo)
  {
    if (foo instanceof hardtyped.Absyn.IfStart1)
    {
       hardtyped.Absyn.IfStart1 _ifstart1 = (hardtyped.Absyn.IfStart1) foo;
       render("(");
       render("IfStart1");
       sh(_ifstart1.expression_);
       sh(_ifstart1.body_);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.Else foo)
  {
    if (foo instanceof hardtyped.Absyn.Else1)
    {
       hardtyped.Absyn.Else1 _else1 = (hardtyped.Absyn.Else1) foo;
       render("(");
       render("Else1");
       sh(_else1.body_);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.Body foo)
  {
    if (foo instanceof hardtyped.Absyn.Body1)
    {
       hardtyped.Absyn.Body1 _body1 = (hardtyped.Absyn.Body1) foo;
       render("(");
       render("Body1");
       sh(_body1.expression_);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.Expression foo)
  {
    if (foo instanceof hardtyped.Absyn.Expression1)
    {
       hardtyped.Absyn.Expression1 _expression1 = (hardtyped.Absyn.Expression1) foo;
       render("(");
       render("Expression1");
       sh(_expression1.conjunction_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.Expression2)
    {
       hardtyped.Absyn.Expression2 _expression2 = (hardtyped.Absyn.Expression2) foo;
       render("(");
       render("Expression2");
       sh(_expression2.conjunction_);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.Conjunction foo)
  {
    if (foo instanceof hardtyped.Absyn.Conjunction1)
    {
       hardtyped.Absyn.Conjunction1 _conjunction1 = (hardtyped.Absyn.Conjunction1) foo;
       render("(");
       render("Conjunction1");
       sh(_conjunction1.relation_1);
       sh(_conjunction1.relation_2);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.Relation foo)
  {
    if (foo instanceof hardtyped.Absyn.Relation1)
    {
       hardtyped.Absyn.Relation1 _relation1 = (hardtyped.Absyn.Relation1) foo;
       render("(");
       render("Relation1");
       sh(_relation1.factor_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.Relation2)
    {
       hardtyped.Absyn.Relation2 _relation2 = (hardtyped.Absyn.Relation2) foo;
       render("(");
       render("Relation2");
       sh(_relation2.factor_1);
       sh(_relation2.operand_);
       sh(_relation2.factor_2);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.Factor foo)
  {
    if (foo instanceof hardtyped.Absyn.Factor1)
    {
       hardtyped.Absyn.Factor1 _factor1 = (hardtyped.Absyn.Factor1) foo;
       render("(");
       render("Factor1");
       sh(_factor1.term_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.Factor2)
    {
       hardtyped.Absyn.Factor2 _factor2 = (hardtyped.Absyn.Factor2) foo;
       render("(");
       render("Factor2");
       sh(_factor2.term_1);
       sh(_factor2.plusminus_);
       sh(_factor2.term_2);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.Term foo)
  {
    if (foo instanceof hardtyped.Absyn.Term1)
    {
       hardtyped.Absyn.Term1 _term1 = (hardtyped.Absyn.Term1) foo;
       render("(");
       render("Term1");
       sh(_term1.unary_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.Term2)
    {
       hardtyped.Absyn.Term2 _term2 = (hardtyped.Absyn.Term2) foo;
       render("(");
       render("Term2");
       sh(_term2.unary_1);
       sh(_term2.multdiv_);
       sh(_term2.unary_2);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.Unary foo)
  {
    if (foo instanceof hardtyped.Absyn.Unary1)
    {
       hardtyped.Absyn.Unary1 _unary1 = (hardtyped.Absyn.Unary1) foo;
       render("(");
       render("Unary1");
       sh(_unary1.expression_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.Unary2)
    {
       hardtyped.Absyn.Unary2 _unary2 = (hardtyped.Absyn.Unary2) foo;
       render("(");
       render("Unary2");
       sh(_unary2.literal_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.Unary3)
    {
       hardtyped.Absyn.Unary3 _unary3 = (hardtyped.Absyn.Unary3) foo;
       render("(");
       render("Unary3");
       sh(_unary3.unaryprefix_);
       sh(_unary3.identifier_);
       sh(_unary3.ascription_);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.Ascription foo)
  {
    if (foo instanceof hardtyped.Absyn.Ascription1)
    {
       hardtyped.Absyn.Ascription1 _ascription1 = (hardtyped.Absyn.Ascription1) foo;
       render("(");
       render("Ascription1");
       sh(_ascription1.type_);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.Literal foo)
  {
    if (foo instanceof hardtyped.Absyn.ArrayLiteral)
    {
       hardtyped.Absyn.ArrayLiteral _arrayliteral = (hardtyped.Absyn.ArrayLiteral) foo;
       render("(");
       render("ArrayLiteral");
       sh(_arrayliteral.expression_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.FunctionLiteral)
    {
       hardtyped.Absyn.FunctionLiteral _functionliteral = (hardtyped.Absyn.FunctionLiteral) foo;
       render("(");
       render("FunctionLiteral");
       sh(_functionliteral.functionparameters_);
       sh(_functionliteral.functionbody_);
       render(")");
    }
    if (foo instanceof hardtyped.Absyn.RecordLiteral)
    {
       hardtyped.Absyn.RecordLiteral _recordliteral = (hardtyped.Absyn.RecordLiteral) foo;
       render("(");
       render("RecordLiteral");
       sh(_recordliteral.recordelement_);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.RecordElement foo)
  {
    if (foo instanceof hardtyped.Absyn.RecordElement1)
    {
       hardtyped.Absyn.RecordElement1 _recordelement1 = (hardtyped.Absyn.RecordElement1) foo;
       render("(");
       render("RecordElement1");
       sh(_recordelement1.identifier_);
       sh(_recordelement1.expression_);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.FunctionParameters foo)
  {
    if (foo instanceof hardtyped.Absyn.FunctionParameters1)
    {
       hardtyped.Absyn.FunctionParameters1 _functionparameters1 = (hardtyped.Absyn.FunctionParameters1) foo;
       render("(");
       render("FunctionParameters1");
       sh(_functionparameters1.identifier_);
       sh(_functionparameters1.type_);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.FunctionBody foo)
  {
    if (foo instanceof hardtyped.Absyn.FunctionBody1)
    {
       hardtyped.Absyn.FunctionBody1 _functionbody1 = (hardtyped.Absyn.FunctionBody1) foo;
       render("(");
       render("FunctionBody1");
       sh(_functionbody1.body_);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.Identifier foo)
  {
    if (foo instanceof hardtyped.Absyn.Identifier1)
    {
       hardtyped.Absyn.Identifier1 _identifier1 = (hardtyped.Absyn.Identifier1) foo;
       render("(");
       render("Identifier1");
       sh(_identifier1.string_);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.Type foo)
  {
    if (foo instanceof hardtyped.Absyn.Int)
    {
       hardtyped.Absyn.Int _int = (hardtyped.Absyn.Int) foo;
       render("Int");
    }
    if (foo instanceof hardtyped.Absyn.Real)
    {
       hardtyped.Absyn.Real _real = (hardtyped.Absyn.Real) foo;
       render("Real");
    }
    if (foo instanceof hardtyped.Absyn.String)
    {
       hardtyped.Absyn.String _string = (hardtyped.Absyn.String) foo;
       render("String");
    }
    if (foo instanceof hardtyped.Absyn.Boolean)
    {
       hardtyped.Absyn.Boolean _boolean = (hardtyped.Absyn.Boolean) foo;
       render("Boolean");
    }
    if (foo instanceof hardtyped.Absyn.Unit)
    {
       hardtyped.Absyn.Unit _unit = (hardtyped.Absyn.Unit) foo;
       render("Unit");
    }
    if (foo instanceof hardtyped.Absyn.FunctionTypeIndicator)
    {
       hardtyped.Absyn.FunctionTypeIndicator _functiontypeindicator = (hardtyped.Absyn.FunctionTypeIndicator) foo;
       render("(");
       render("FunctionTypeIndicator");
       sh(_functiontypeindicator.type_1);
       sh(_functiontypeindicator.type_2);
       render(")");
    }
  }

  private static void sh(hardtyped.Absyn.Operand foo)
  {
    if (foo instanceof hardtyped.Absyn.Less)
    {
       hardtyped.Absyn.Less _less = (hardtyped.Absyn.Less) foo;
       render("Less");
    }
    if (foo instanceof hardtyped.Absyn.LessEql)
    {
       hardtyped.Absyn.LessEql _lesseql = (hardtyped.Absyn.LessEql) foo;
       render("LessEql");
    }
    if (foo instanceof hardtyped.Absyn.More)
    {
       hardtyped.Absyn.More _more = (hardtyped.Absyn.More) foo;
       render("More");
    }
    if (foo instanceof hardtyped.Absyn.MoreEql)
    {
       hardtyped.Absyn.MoreEql _moreeql = (hardtyped.Absyn.MoreEql) foo;
       render("MoreEql");
    }
    if (foo instanceof hardtyped.Absyn.Eql)
    {
       hardtyped.Absyn.Eql _eql = (hardtyped.Absyn.Eql) foo;
       render("Eql");
    }
    if (foo instanceof hardtyped.Absyn.NotEql)
    {
       hardtyped.Absyn.NotEql _noteql = (hardtyped.Absyn.NotEql) foo;
       render("NotEql");
    }
  }

  private static void sh(hardtyped.Absyn.PlusMinus foo)
  {
    if (foo instanceof hardtyped.Absyn.Plus)
    {
       hardtyped.Absyn.Plus _plus = (hardtyped.Absyn.Plus) foo;
       render("Plus");
    }
    if (foo instanceof hardtyped.Absyn.Minus)
    {
       hardtyped.Absyn.Minus _minus = (hardtyped.Absyn.Minus) foo;
       render("Minus");
    }
  }

  private static void sh(hardtyped.Absyn.MultDiv foo)
  {
    if (foo instanceof hardtyped.Absyn.Mult)
    {
       hardtyped.Absyn.Mult _mult = (hardtyped.Absyn.Mult) foo;
       render("Mult");
    }
    if (foo instanceof hardtyped.Absyn.Div)
    {
       hardtyped.Absyn.Div _div = (hardtyped.Absyn.Div) foo;
       render("Div");
    }
  }

  private static void sh(hardtyped.Absyn.UnaryPrefix foo)
  {
    if (foo instanceof hardtyped.Absyn.PlusPfx)
    {
       hardtyped.Absyn.PlusPfx _pluspfx = (hardtyped.Absyn.PlusPfx) foo;
       render("PlusPfx");
    }
    if (foo instanceof hardtyped.Absyn.MinusPfx)
    {
       hardtyped.Absyn.MinusPfx _minuspfx = (hardtyped.Absyn.MinusPfx) foo;
       render("MinusPfx");
    }
    if (foo instanceof hardtyped.Absyn.NotPfx)
    {
       hardtyped.Absyn.NotPfx _notpfx = (hardtyped.Absyn.NotPfx) foo;
       render("NotPfx");
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

