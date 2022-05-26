// File generated by the BNF Converter (bnfc 2.9.4).

package hardtyped;

import hardtyped.*;
import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.*;
import java.util.*;

class TestError extends RuntimeException
{
  int line;
  int column;
  public TestError(String msg, int l, int c)
  {
    super(msg);
    line = l;
    column = c;
  }
}
class BNFCErrorListener implements ANTLRErrorListener
{
  @Override
  public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e)
  {
    throw new TestError(s,i,i1);
  }
  @Override
  public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet)
  {
    throw new TestError("Ambiguity at",i,i1);
  }
  @Override
  public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet)
  {
  }
  @Override
  public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet)
  {
  }
}

public class Test
{
  hardtypedLexer l;
  hardtypedParser p;

  public Test(Optional<String> arg)
  {
    try
    {
      Reader input;
      if (arg.isEmpty()) input = new InputStreamReader(System.in);
      else input = new FileReader(arg.get());
      l = new hardtypedLexer(new ANTLRInputStream(input));
      l.addErrorListener(new BNFCErrorListener());
    }
    catch(IOException e)
    {
      System.err.println("Error: File not found: " + arg.orElse("System.in"));
      System.exit(1);
    }
    p = new hardtypedParser(new CommonTokenStream(l));
    p.addErrorListener(new BNFCErrorListener());
  }

  public hardtyped.Absyn.ListExpr parse() throws Exception
  {
    /* The default parser is the first-defined entry point. */
    /* Other options are: */
    /* expr, varDec, exprSequence, listExprSequence, funcArg,
       listFuncArg, ifExpr, listIfExpr, elseExpr, op, recordElem,
       listRecordElem, type, recordElemType, listRecordElemType */
    hardtypedParser.Start_ListExprContext pc = p.start_ListExpr();
    hardtyped.Absyn.ListExpr ast = pc.result;
    System.out.println();
    System.out.println("Parse Successful!");
    System.out.println();
    System.out.println("[Abstract Syntax]");
    System.out.println();
    System.out.println(PrettyPrinter.show(ast));
    System.out.println();
    System.out.println("[Linearized Tree]");
    System.out.println();
    System.out.println(PrettyPrinter.print(ast));
    return ast;
  }

  public static void main(String[] args) throws Exception
  {
    Test t = (args.length > 0) ? new Test(Optional.of(args[args.length-1])) : new Test(Optional.empty());
    try
    {
      t.parse();
    }
    catch(TestError e)
    {
      System.err.println("At line " + e.line + ", column " + e.column + " :");
      System.err.println("     " + e.getMessage());
      System.exit(1);
    }
  }
}