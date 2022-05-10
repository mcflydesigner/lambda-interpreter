// Generated from hardtypedParser.g4 by ANTLR 4.7.1
package hardtyped;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class hardtypedParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Surrogate_id_SYMB_0=1, Surrogate_id_SYMB_1=2, Surrogate_id_SYMB_2=3, Surrogate_id_SYMB_3=4, 
		Surrogate_id_SYMB_4=5, Surrogate_id_SYMB_5=6, Surrogate_id_SYMB_6=7, Surrogate_id_SYMB_7=8, 
		Surrogate_id_SYMB_8=9, Surrogate_id_SYMB_9=10, Surrogate_id_SYMB_10=11, 
		Surrogate_id_SYMB_11=12, Surrogate_id_SYMB_12=13, Surrogate_id_SYMB_13=14, 
		Surrogate_id_SYMB_14=15, Surrogate_id_SYMB_15=16, Surrogate_id_SYMB_16=17, 
		Surrogate_id_SYMB_17=18, Surrogate_id_SYMB_18=19, Surrogate_id_SYMB_19=20, 
		Surrogate_id_SYMB_20=21, COMMENT_antlr_builtin=22, MULTICOMMENT_antlr_builtin=23, 
		DOUBLE=24, INTEGER=25, IDENT=26, WS=27, ErrorToken=28, STRING=29, STRINGESC=30;
	public static final int
		RULE_start_ListExpr = 0, RULE_start_Expr = 1, RULE_start_InExpr = 2, RULE_start_FuncArg = 3, 
		RULE_start_VarDec = 4, RULE_start_Type = 5, RULE_listExpr = 6, RULE_expr = 7, 
		RULE_inExpr = 8, RULE_funcArg = 9, RULE_varDec = 10, RULE_type = 11;
	public static final String[] ruleNames = {
		"start_ListExpr", "start_Expr", "start_InExpr", "start_FuncArg", "start_VarDec", 
		"start_Type", "listExpr", "expr", "inExpr", "funcArg", "varDec", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'/\\'", "'{'", "'}'", "'('", "')'", "'+'", "'-'", "'*'", 
		"'/'", "'='", "'.'", "':'", "'Boolean'", "'Integer'", "'Real'", "'String'", 
		"'Unit'", "'as'", "'in'", "'let'", null, null, null, null, null, null, 
		null, "'\"'", "'\\'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Surrogate_id_SYMB_0", "Surrogate_id_SYMB_1", "Surrogate_id_SYMB_2", 
		"Surrogate_id_SYMB_3", "Surrogate_id_SYMB_4", "Surrogate_id_SYMB_5", "Surrogate_id_SYMB_6", 
		"Surrogate_id_SYMB_7", "Surrogate_id_SYMB_8", "Surrogate_id_SYMB_9", "Surrogate_id_SYMB_10", 
		"Surrogate_id_SYMB_11", "Surrogate_id_SYMB_12", "Surrogate_id_SYMB_13", 
		"Surrogate_id_SYMB_14", "Surrogate_id_SYMB_15", "Surrogate_id_SYMB_16", 
		"Surrogate_id_SYMB_17", "Surrogate_id_SYMB_18", "Surrogate_id_SYMB_19", 
		"Surrogate_id_SYMB_20", "COMMENT_antlr_builtin", "MULTICOMMENT_antlr_builtin", 
		"DOUBLE", "INTEGER", "IDENT", "WS", "ErrorToken", "STRING", "STRINGESC"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "hardtypedParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public hardtypedParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Start_ListExprContext extends ParserRuleContext {
		public hardtyped.Absyn.ListExpr result;
		public ListExprContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public Start_ListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_ListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_ListExpr(this);
		}
	}

	public final Start_ListExprContext start_ListExpr() throws RecognitionException {
		Start_ListExprContext _localctx = new Start_ListExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_ListExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((Start_ListExprContext)_localctx).x = listExpr();
			setState(25);
			match(EOF);
			 ((Start_ListExprContext)_localctx).result =  ((Start_ListExprContext)_localctx).x.result; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_ExprContext extends ParserRuleContext {
		public hardtyped.Absyn.Expr result;
		public ExprContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Start_ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Expr(this);
		}
	}

	public final Start_ExprContext start_Expr() throws RecognitionException {
		Start_ExprContext _localctx = new Start_ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start_Expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			((Start_ExprContext)_localctx).x = expr(0);
			setState(29);
			match(EOF);
			 ((Start_ExprContext)_localctx).result =  ((Start_ExprContext)_localctx).x.result; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_InExprContext extends ParserRuleContext {
		public hardtyped.Absyn.InExpr result;
		public InExprContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public InExprContext inExpr() {
			return getRuleContext(InExprContext.class,0);
		}
		public Start_InExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_InExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_InExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_InExpr(this);
		}
	}

	public final Start_InExprContext start_InExpr() throws RecognitionException {
		Start_InExprContext _localctx = new Start_InExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start_InExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			((Start_InExprContext)_localctx).x = inExpr(0);
			setState(33);
			match(EOF);
			 ((Start_InExprContext)_localctx).result =  ((Start_InExprContext)_localctx).x.result; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_FuncArgContext extends ParserRuleContext {
		public hardtyped.Absyn.FuncArg result;
		public FuncArgContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public FuncArgContext funcArg() {
			return getRuleContext(FuncArgContext.class,0);
		}
		public Start_FuncArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_FuncArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_FuncArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_FuncArg(this);
		}
	}

	public final Start_FuncArgContext start_FuncArg() throws RecognitionException {
		Start_FuncArgContext _localctx = new Start_FuncArgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_start_FuncArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			((Start_FuncArgContext)_localctx).x = funcArg();
			setState(37);
			match(EOF);
			 ((Start_FuncArgContext)_localctx).result =  ((Start_FuncArgContext)_localctx).x.result; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_VarDecContext extends ParserRuleContext {
		public hardtyped.Absyn.VarDec result;
		public VarDecContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public Start_VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_VarDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_VarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_VarDec(this);
		}
	}

	public final Start_VarDecContext start_VarDec() throws RecognitionException {
		Start_VarDecContext _localctx = new Start_VarDecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_start_VarDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			((Start_VarDecContext)_localctx).x = varDec();
			setState(41);
			match(EOF);
			 ((Start_VarDecContext)_localctx).result =  ((Start_VarDecContext)_localctx).x.result; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_TypeContext extends ParserRuleContext {
		public hardtyped.Absyn.Type result;
		public TypeContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Start_TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Type(this);
		}
	}

	public final Start_TypeContext start_Type() throws RecognitionException {
		Start_TypeContext _localctx = new Start_TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_start_Type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			((Start_TypeContext)_localctx).x = type();
			setState(45);
			match(EOF);
			 ((Start_TypeContext)_localctx).result =  ((Start_TypeContext)_localctx).x.result; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListExprContext extends ParserRuleContext {
		public hardtyped.Absyn.ListExpr result;
		public ExprContext p_2_1;
		public ExprContext p_3_1;
		public ListExprContext p_3_3;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(hardtypedParser.Surrogate_id_SYMB_0, 0); }
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public ListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitListExpr(this);
		}
	}

	public final ListExprContext listExpr() throws RecognitionException {
		ListExprContext _localctx = new ListExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listExpr);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((ListExprContext)_localctx).result =  new hardtyped.Absyn.ListExpr(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				((ListExprContext)_localctx).p_2_1 = expr(0);
				 ((ListExprContext)_localctx).result =  new hardtyped.Absyn.ListExpr(); _localctx.result.addLast(((ListExprContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				((ListExprContext)_localctx).p_3_1 = expr(0);
				setState(53);
				match(Surrogate_id_SYMB_0);
				setState(54);
				((ListExprContext)_localctx).p_3_3 = listExpr();
				 ((ListExprContext)_localctx).result =  ((ListExprContext)_localctx).p_3_3.result; _localctx.result.addFirst(((ListExprContext)_localctx).p_3_1.result); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public hardtyped.Absyn.Expr result;
		public ExprContext p_2_1;
		public ExprContext p_3_1;
		public ExprContext p_4_1;
		public ExprContext p_5_1;
		public ExprContext p_6_1;
		public FuncArgContext p_1_2;
		public InExprContext p_1_4;
		public ExprContext p_7_2;
		public ExprContext p_8_2;
		public VarDecContext p_9_2;
		public ExprContext p_9_4;
		public VarDecContext p_10_2;
		public ExprContext p_10_4;
		public ExprContext p_10_6;
		public VarDecContext p_11_2;
		public ExprContext p_11_4;
		public TypeContext p_11_6;
		public Token p_12_1;
		public Token p_13_1;
		public Token p_14_1;
		public Token p_15_1;
		public ExprContext p_16_2;
		public ExprContext p_3_3;
		public ExprContext p_4_3;
		public ExprContext p_5_3;
		public ExprContext p_6_3;
		public ExprContext p_2_3;
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(hardtypedParser.Surrogate_id_SYMB_1, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(hardtypedParser.Surrogate_id_SYMB_2, 0); }
		public TerminalNode Surrogate_id_SYMB_3() { return getToken(hardtypedParser.Surrogate_id_SYMB_3, 0); }
		public FuncArgContext funcArg() {
			return getRuleContext(FuncArgContext.class,0);
		}
		public InExprContext inExpr() {
			return getRuleContext(InExprContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_6() { return getToken(hardtypedParser.Surrogate_id_SYMB_6, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(hardtypedParser.Surrogate_id_SYMB_7, 0); }
		public TerminalNode Surrogate_id_SYMB_20() { return getToken(hardtypedParser.Surrogate_id_SYMB_20, 0); }
		public TerminalNode Surrogate_id_SYMB_10() { return getToken(hardtypedParser.Surrogate_id_SYMB_10, 0); }
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_19() { return getToken(hardtypedParser.Surrogate_id_SYMB_19, 0); }
		public TerminalNode Surrogate_id_SYMB_18() { return getToken(hardtypedParser.Surrogate_id_SYMB_18, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(hardtypedParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(hardtypedParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(hardtypedParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(hardtypedParser.IDENT, 0); }
		public TerminalNode Surrogate_id_SYMB_4() { return getToken(hardtypedParser.Surrogate_id_SYMB_4, 0); }
		public TerminalNode Surrogate_id_SYMB_5() { return getToken(hardtypedParser.Surrogate_id_SYMB_5, 0); }
		public TerminalNode Surrogate_id_SYMB_8() { return getToken(hardtypedParser.Surrogate_id_SYMB_8, 0); }
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(hardtypedParser.Surrogate_id_SYMB_9, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(60);
				match(Surrogate_id_SYMB_1);
				setState(61);
				((ExprContext)_localctx).p_1_2 = funcArg();
				setState(62);
				match(Surrogate_id_SYMB_2);
				setState(63);
				((ExprContext)_localctx).p_1_4 = inExpr(0);
				setState(64);
				match(Surrogate_id_SYMB_3);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Function(((ExprContext)_localctx).p_1_2.result,((ExprContext)_localctx).p_1_4.result); 
				}
				break;
			case 2:
				{
				setState(67);
				match(Surrogate_id_SYMB_6);
				setState(68);
				((ExprContext)_localctx).p_7_2 = expr(10);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.UnaryPlus(((ExprContext)_localctx).p_7_2.result); 
				}
				break;
			case 3:
				{
				setState(71);
				match(Surrogate_id_SYMB_7);
				setState(72);
				((ExprContext)_localctx).p_8_2 = expr(9);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.UnaryMinus(((ExprContext)_localctx).p_8_2.result); 
				}
				break;
			case 4:
				{
				setState(75);
				match(Surrogate_id_SYMB_20);
				setState(76);
				((ExprContext)_localctx).p_9_2 = varDec();
				setState(77);
				match(Surrogate_id_SYMB_10);
				setState(78);
				((ExprContext)_localctx).p_9_4 = expr(8);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Let(((ExprContext)_localctx).p_9_2.result,((ExprContext)_localctx).p_9_4.result); 
				}
				break;
			case 5:
				{
				setState(81);
				match(Surrogate_id_SYMB_20);
				setState(82);
				((ExprContext)_localctx).p_10_2 = varDec();
				setState(83);
				match(Surrogate_id_SYMB_10);
				setState(84);
				((ExprContext)_localctx).p_10_4 = expr(0);
				setState(85);
				match(Surrogate_id_SYMB_19);
				setState(86);
				((ExprContext)_localctx).p_10_6 = expr(7);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.LetInference(((ExprContext)_localctx).p_10_2.result,((ExprContext)_localctx).p_10_4.result,((ExprContext)_localctx).p_10_6.result); 
				}
				break;
			case 6:
				{
				setState(89);
				match(Surrogate_id_SYMB_20);
				setState(90);
				((ExprContext)_localctx).p_11_2 = varDec();
				setState(91);
				match(Surrogate_id_SYMB_10);
				setState(92);
				((ExprContext)_localctx).p_11_4 = expr(0);
				setState(93);
				match(Surrogate_id_SYMB_18);
				setState(94);
				((ExprContext)_localctx).p_11_6 = type();
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.LetAscription(((ExprContext)_localctx).p_11_2.result,((ExprContext)_localctx).p_11_4.result,((ExprContext)_localctx).p_11_6.result); 
				}
				break;
			case 7:
				{
				setState(97);
				((ExprContext)_localctx).p_12_1 = match(INTEGER);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.IntValue(Integer.parseInt(((ExprContext)_localctx).p_12_1.getText())); 
				}
				break;
			case 8:
				{
				setState(99);
				((ExprContext)_localctx).p_13_1 = match(DOUBLE);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.RealValue(Double.parseDouble(((ExprContext)_localctx).p_13_1.getText())); 
				}
				break;
			case 9:
				{
				setState(101);
				((ExprContext)_localctx).p_14_1 = match(STRING);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.StringValue(((ExprContext)_localctx).p_14_1.getText().substring(1, ((ExprContext)_localctx).p_14_1.getText().length()-1)); 
				}
				break;
			case 10:
				{
				setState(103);
				((ExprContext)_localctx).p_15_1 = match(IDENT);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.AtomicExpression(((ExprContext)_localctx).p_15_1.getText()); 
				}
				break;
			case 11:
				{
				setState(105);
				match(Surrogate_id_SYMB_4);
				setState(106);
				((ExprContext)_localctx).p_16_2 = expr(0);
				setState(107);
				match(Surrogate_id_SYMB_5);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.ParenthesesExpression(((ExprContext)_localctx).p_16_2.result); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_3_1 = _prevctx;
						_localctx.p_3_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(112);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(113);
						match(Surrogate_id_SYMB_6);
						setState(114);
						((ExprContext)_localctx).p_3_3 = expr(15);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Sum(((ExprContext)_localctx).p_3_1.result,((ExprContext)_localctx).p_3_3.result); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_4_1 = _prevctx;
						_localctx.p_4_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(118);
						match(Surrogate_id_SYMB_7);
						setState(119);
						((ExprContext)_localctx).p_4_3 = expr(14);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Substract(((ExprContext)_localctx).p_4_1.result,((ExprContext)_localctx).p_4_3.result); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_5_1 = _prevctx;
						_localctx.p_5_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(123);
						match(Surrogate_id_SYMB_8);
						setState(124);
						((ExprContext)_localctx).p_5_3 = expr(13);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Multiply(((ExprContext)_localctx).p_5_1.result,((ExprContext)_localctx).p_5_3.result); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_6_1 = _prevctx;
						_localctx.p_6_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(127);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(128);
						match(Surrogate_id_SYMB_9);
						setState(129);
						((ExprContext)_localctx).p_6_3 = expr(12);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Divide(((ExprContext)_localctx).p_6_1.result,((ExprContext)_localctx).p_6_3.result); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_2_1 = _prevctx;
						_localctx.p_2_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(133);
						match(Surrogate_id_SYMB_4);
						setState(134);
						((ExprContext)_localctx).p_2_3 = expr(0);
						setState(135);
						match(Surrogate_id_SYMB_5);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.ApplyFunction(((ExprContext)_localctx).p_2_1.result,((ExprContext)_localctx).p_2_3.result); 
						}
						break;
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InExprContext extends ParserRuleContext {
		public hardtyped.Absyn.InExpr result;
		public InExprContext p_1_1;
		public InExprContext p_2_1;
		public ExprContext p_3_1;
		public InExprContext p_1_3;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(hardtypedParser.Surrogate_id_SYMB_0, 0); }
		public List<InExprContext> inExpr() {
			return getRuleContexts(InExprContext.class);
		}
		public InExprContext inExpr(int i) {
			return getRuleContext(InExprContext.class,i);
		}
		public InExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterInExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitInExpr(this);
		}
	}

	public final InExprContext inExpr() throws RecognitionException {
		return inExpr(0);
	}

	private InExprContext inExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InExprContext _localctx = new InExprContext(_ctx, _parentState);
		InExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_inExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(144);
			((InExprContext)_localctx).p_3_1 = expr(0);
			 ((InExprContext)_localctx).result =  new hardtyped.Absyn.InnerExpression(((InExprContext)_localctx).p_3_1.result); 
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(155);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new InExprContext(_parentctx, _parentState);
						_localctx.p_1_1 = _prevctx;
						_localctx.p_1_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_inExpr);
						setState(147);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(148);
						match(Surrogate_id_SYMB_0);
						setState(149);
						((InExprContext)_localctx).p_1_3 = inExpr(4);
						 ((InExprContext)_localctx).result =  new hardtyped.Absyn.MultipleExpressions(((InExprContext)_localctx).p_1_1.result,((InExprContext)_localctx).p_1_3.result); 
						}
						break;
					case 2:
						{
						_localctx = new InExprContext(_parentctx, _parentState);
						_localctx.p_2_1 = _prevctx;
						_localctx.p_2_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_inExpr);
						setState(152);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(153);
						match(Surrogate_id_SYMB_0);
						 ((InExprContext)_localctx).result =  new hardtyped.Absyn.FinalExpression(((InExprContext)_localctx).p_2_1.result); 
						}
						break;
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FuncArgContext extends ParserRuleContext {
		public hardtyped.Absyn.FuncArg result;
		public VarDecContext p_1_1;
		public FuncArgContext p_1_3;
		public VarDecContext p_2_1;
		public TerminalNode Surrogate_id_SYMB_11() { return getToken(hardtypedParser.Surrogate_id_SYMB_11, 0); }
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public FuncArgContext funcArg() {
			return getRuleContext(FuncArgContext.class,0);
		}
		public FuncArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterFuncArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitFuncArg(this);
		}
	}

	public final FuncArgContext funcArg() throws RecognitionException {
		FuncArgContext _localctx = new FuncArgContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcArg);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				((FuncArgContext)_localctx).p_1_1 = varDec();
				setState(161);
				match(Surrogate_id_SYMB_11);
				setState(162);
				((FuncArgContext)_localctx).p_1_3 = funcArg();
				 ((FuncArgContext)_localctx).result =  new hardtyped.Absyn.MultipleArgs(((FuncArgContext)_localctx).p_1_1.result,((FuncArgContext)_localctx).p_1_3.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				((FuncArgContext)_localctx).p_2_1 = varDec();
				setState(166);
				match(Surrogate_id_SYMB_11);
				 ((FuncArgContext)_localctx).result =  new hardtyped.Absyn.FinalArg(((FuncArgContext)_localctx).p_2_1.result); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDecContext extends ParserRuleContext {
		public hardtyped.Absyn.VarDec result;
		public Token p_1_1;
		public TypeContext p_1_3;
		public Token p_2_1;
		public TerminalNode Surrogate_id_SYMB_12() { return getToken(hardtypedParser.Surrogate_id_SYMB_12, 0); }
		public TerminalNode IDENT() { return getToken(hardtypedParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitVarDec(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varDec);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				((VarDecContext)_localctx).p_1_1 = match(IDENT);
				setState(172);
				match(Surrogate_id_SYMB_12);
				setState(173);
				((VarDecContext)_localctx).p_1_3 = type();
				 ((VarDecContext)_localctx).result =  new hardtyped.Absyn.TypedVar(((VarDecContext)_localctx).p_1_1.getText(),((VarDecContext)_localctx).p_1_3.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				((VarDecContext)_localctx).p_2_1 = match(IDENT);
				 ((VarDecContext)_localctx).result =  new hardtyped.Absyn.UntypedVar(((VarDecContext)_localctx).p_2_1.getText()); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public hardtyped.Absyn.Type result;
		public TerminalNode Surrogate_id_SYMB_14() { return getToken(hardtypedParser.Surrogate_id_SYMB_14, 0); }
		public TerminalNode Surrogate_id_SYMB_15() { return getToken(hardtypedParser.Surrogate_id_SYMB_15, 0); }
		public TerminalNode Surrogate_id_SYMB_13() { return getToken(hardtypedParser.Surrogate_id_SYMB_13, 0); }
		public TerminalNode Surrogate_id_SYMB_16() { return getToken(hardtypedParser.Surrogate_id_SYMB_16, 0); }
		public TerminalNode Surrogate_id_SYMB_17() { return getToken(hardtypedParser.Surrogate_id_SYMB_17, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_14:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(Surrogate_id_SYMB_14);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.IntType(); 
				}
				break;
			case Surrogate_id_SYMB_15:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(Surrogate_id_SYMB_15);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.RealType(); 
				}
				break;
			case Surrogate_id_SYMB_13:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(Surrogate_id_SYMB_13);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.BoolType(); 
				}
				break;
			case Surrogate_id_SYMB_16:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(Surrogate_id_SYMB_16);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.StringType(); 
				}
				break;
			case Surrogate_id_SYMB_17:
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				match(Surrogate_id_SYMB_17);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.UnitType(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 8:
			return inExpr_sempred((InExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 15);
		}
		return true;
	}
	private boolean inExpr_sempred(InExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b<\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\tq\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u008d"+
		"\n\t\f\t\16\t\u0090\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u009e\n\n\f\n\16\n\u00a1\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00ac\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b5\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c1\n\r\3\r\2\4\20\22\16"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u00cf\2\32\3\2\2\2\4\36\3\2\2\2\6"+
		"\"\3\2\2\2\b&\3\2\2\2\n*\3\2\2\2\f.\3\2\2\2\16;\3\2\2\2\20p\3\2\2\2\22"+
		"\u0091\3\2\2\2\24\u00ab\3\2\2\2\26\u00b4\3\2\2\2\30\u00c0\3\2\2\2\32\33"+
		"\5\16\b\2\33\34\7\2\2\3\34\35\b\2\1\2\35\3\3\2\2\2\36\37\5\20\t\2\37 "+
		"\7\2\2\3 !\b\3\1\2!\5\3\2\2\2\"#\5\22\n\2#$\7\2\2\3$%\b\4\1\2%\7\3\2\2"+
		"\2&\'\5\24\13\2\'(\7\2\2\3()\b\5\1\2)\t\3\2\2\2*+\5\26\f\2+,\7\2\2\3,"+
		"-\b\6\1\2-\13\3\2\2\2./\5\30\r\2/\60\7\2\2\3\60\61\b\7\1\2\61\r\3\2\2"+
		"\2\62<\b\b\1\2\63\64\5\20\t\2\64\65\b\b\1\2\65<\3\2\2\2\66\67\5\20\t\2"+
		"\678\7\3\2\289\5\16\b\29:\b\b\1\2:<\3\2\2\2;\62\3\2\2\2;\63\3\2\2\2;\66"+
		"\3\2\2\2<\17\3\2\2\2=>\b\t\1\2>?\7\4\2\2?@\5\24\13\2@A\7\5\2\2AB\5\22"+
		"\n\2BC\7\6\2\2CD\b\t\1\2Dq\3\2\2\2EF\7\t\2\2FG\5\20\t\fGH\b\t\1\2Hq\3"+
		"\2\2\2IJ\7\n\2\2JK\5\20\t\13KL\b\t\1\2Lq\3\2\2\2MN\7\27\2\2NO\5\26\f\2"+
		"OP\7\r\2\2PQ\5\20\t\nQR\b\t\1\2Rq\3\2\2\2ST\7\27\2\2TU\5\26\f\2UV\7\r"+
		"\2\2VW\5\20\t\2WX\7\26\2\2XY\5\20\t\tYZ\b\t\1\2Zq\3\2\2\2[\\\7\27\2\2"+
		"\\]\5\26\f\2]^\7\r\2\2^_\5\20\t\2_`\7\25\2\2`a\5\30\r\2ab\b\t\1\2bq\3"+
		"\2\2\2cd\7\33\2\2dq\b\t\1\2ef\7\32\2\2fq\b\t\1\2gh\7\37\2\2hq\b\t\1\2"+
		"ij\7\34\2\2jq\b\t\1\2kl\7\7\2\2lm\5\20\t\2mn\7\b\2\2no\b\t\1\2oq\3\2\2"+
		"\2p=\3\2\2\2pE\3\2\2\2pI\3\2\2\2pM\3\2\2\2pS\3\2\2\2p[\3\2\2\2pc\3\2\2"+
		"\2pe\3\2\2\2pg\3\2\2\2pi\3\2\2\2pk\3\2\2\2q\u008e\3\2\2\2rs\f\20\2\2s"+
		"t\7\t\2\2tu\5\20\t\21uv\b\t\1\2v\u008d\3\2\2\2wx\f\17\2\2xy\7\n\2\2yz"+
		"\5\20\t\20z{\b\t\1\2{\u008d\3\2\2\2|}\f\16\2\2}~\7\13\2\2~\177\5\20\t"+
		"\17\177\u0080\b\t\1\2\u0080\u008d\3\2\2\2\u0081\u0082\f\r\2\2\u0082\u0083"+
		"\7\f\2\2\u0083\u0084\5\20\t\16\u0084\u0085\b\t\1\2\u0085\u008d\3\2\2\2"+
		"\u0086\u0087\f\21\2\2\u0087\u0088\7\7\2\2\u0088\u0089\5\20\t\2\u0089\u008a"+
		"\7\b\2\2\u008a\u008b\b\t\1\2\u008b\u008d\3\2\2\2\u008cr\3\2\2\2\u008c"+
		"w\3\2\2\2\u008c|\3\2\2\2\u008c\u0081\3\2\2\2\u008c\u0086\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\21\3\2\2"+
		"\2\u0090\u008e\3\2\2\2\u0091\u0092\b\n\1\2\u0092\u0093\5\20\t\2\u0093"+
		"\u0094\b\n\1\2\u0094\u009f\3\2\2\2\u0095\u0096\f\5\2\2\u0096\u0097\7\3"+
		"\2\2\u0097\u0098\5\22\n\6\u0098\u0099\b\n\1\2\u0099\u009e\3\2\2\2\u009a"+
		"\u009b\f\4\2\2\u009b\u009c\7\3\2\2\u009c\u009e\b\n\1\2\u009d\u0095\3\2"+
		"\2\2\u009d\u009a\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\23\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\5\26\f"+
		"\2\u00a3\u00a4\7\16\2\2\u00a4\u00a5\5\24\13\2\u00a5\u00a6\b\13\1\2\u00a6"+
		"\u00ac\3\2\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00a9\7\16\2\2\u00a9\u00aa\b"+
		"\13\1\2\u00aa\u00ac\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac"+
		"\25\3\2\2\2\u00ad\u00ae\7\34\2\2\u00ae\u00af\7\17\2\2\u00af\u00b0\5\30"+
		"\r\2\u00b0\u00b1\b\f\1\2\u00b1\u00b5\3\2\2\2\u00b2\u00b3\7\34\2\2\u00b3"+
		"\u00b5\b\f\1\2\u00b4\u00ad\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\27\3\2\2"+
		"\2\u00b6\u00b7\7\21\2\2\u00b7\u00c1\b\r\1\2\u00b8\u00b9\7\22\2\2\u00b9"+
		"\u00c1\b\r\1\2\u00ba\u00bb\7\20\2\2\u00bb\u00c1\b\r\1\2\u00bc\u00bd\7"+
		"\23\2\2\u00bd\u00c1\b\r\1\2\u00be\u00bf\7\24\2\2\u00bf\u00c1\b\r\1\2\u00c0"+
		"\u00b6\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00bc\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c1\31\3\2\2\2\13;p\u008c\u008e\u009d\u009f"+
		"\u00ab\u00b4\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}