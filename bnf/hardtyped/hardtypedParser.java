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
		RULE_start_ListExpr = 0, RULE_start_Expr = 1, RULE_start_VarDec = 2, RULE_start_Type = 3, 
		RULE_listExpr = 4, RULE_expr = 5, RULE_varDec = 6, RULE_type = 7;
	public static final String[] ruleNames = {
		"start_ListExpr", "start_Expr", "start_VarDec", "start_Type", "listExpr", 
		"expr", "varDec", "type"
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
			setState(16);
			((Start_ListExprContext)_localctx).x = listExpr();
			setState(17);
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
			setState(20);
			((Start_ExprContext)_localctx).x = expr(0);
			setState(21);
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
		enterRule(_localctx, 4, RULE_start_VarDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((Start_VarDecContext)_localctx).x = varDec(0);
			setState(25);
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
		enterRule(_localctx, 6, RULE_start_Type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			((Start_TypeContext)_localctx).x = type();
			setState(29);
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
		enterRule(_localctx, 8, RULE_listExpr);
		try {
			setState(41);
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
				setState(33);
				((ListExprContext)_localctx).p_2_1 = expr(0);
				 ((ListExprContext)_localctx).result =  new hardtyped.Absyn.ListExpr(); _localctx.result.addLast(((ListExprContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				((ListExprContext)_localctx).p_3_1 = expr(0);
				setState(37);
				match(Surrogate_id_SYMB_0);
				setState(38);
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
		public ExprContext p_13_1;
		public ExprContext p_14_1;
		public VarDecContext p_1_2;
		public ExprContext p_1_4;
		public VarDecContext p_7_2;
		public ExprContext p_7_4;
		public VarDecContext p_8_2;
		public ExprContext p_8_4;
		public ExprContext p_8_6;
		public VarDecContext p_9_2;
		public ExprContext p_9_4;
		public TypeContext p_9_6;
		public Token p_10_1;
		public Token p_11_1;
		public Token p_12_1;
		public Token p_15_1;
		public ExprContext p_3_3;
		public ExprContext p_4_3;
		public ExprContext p_5_3;
		public ExprContext p_6_3;
		public ExprContext p_13_3;
		public ExprContext p_2_3;
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(hardtypedParser.Surrogate_id_SYMB_1, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(hardtypedParser.Surrogate_id_SYMB_2, 0); }
		public TerminalNode Surrogate_id_SYMB_3() { return getToken(hardtypedParser.Surrogate_id_SYMB_3, 0); }
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Surrogate_id_SYMB_20() { return getToken(hardtypedParser.Surrogate_id_SYMB_20, 0); }
		public TerminalNode Surrogate_id_SYMB_10() { return getToken(hardtypedParser.Surrogate_id_SYMB_10, 0); }
		public TerminalNode Surrogate_id_SYMB_19() { return getToken(hardtypedParser.Surrogate_id_SYMB_19, 0); }
		public TerminalNode Surrogate_id_SYMB_18() { return getToken(hardtypedParser.Surrogate_id_SYMB_18, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(hardtypedParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(hardtypedParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(hardtypedParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(hardtypedParser.IDENT, 0); }
		public TerminalNode Surrogate_id_SYMB_6() { return getToken(hardtypedParser.Surrogate_id_SYMB_6, 0); }
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(hardtypedParser.Surrogate_id_SYMB_7, 0); }
		public TerminalNode Surrogate_id_SYMB_8() { return getToken(hardtypedParser.Surrogate_id_SYMB_8, 0); }
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(hardtypedParser.Surrogate_id_SYMB_9, 0); }
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(hardtypedParser.Surrogate_id_SYMB_0, 0); }
		public TerminalNode Surrogate_id_SYMB_4() { return getToken(hardtypedParser.Surrogate_id_SYMB_4, 0); }
		public TerminalNode Surrogate_id_SYMB_5() { return getToken(hardtypedParser.Surrogate_id_SYMB_5, 0); }
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(44);
				match(Surrogate_id_SYMB_1);
				setState(45);
				((ExprContext)_localctx).p_1_2 = varDec(0);
				setState(46);
				match(Surrogate_id_SYMB_2);
				setState(47);
				((ExprContext)_localctx).p_1_4 = expr(0);
				setState(48);
				match(Surrogate_id_SYMB_3);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Function(((ExprContext)_localctx).p_1_2.result,((ExprContext)_localctx).p_1_4.result); 
				}
				break;
			case 2:
				{
				setState(51);
				match(Surrogate_id_SYMB_20);
				setState(52);
				((ExprContext)_localctx).p_7_2 = varDec(0);
				setState(53);
				match(Surrogate_id_SYMB_10);
				setState(54);
				((ExprContext)_localctx).p_7_4 = expr(9);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Let(((ExprContext)_localctx).p_7_2.result,((ExprContext)_localctx).p_7_4.result); 
				}
				break;
			case 3:
				{
				setState(57);
				match(Surrogate_id_SYMB_20);
				setState(58);
				((ExprContext)_localctx).p_8_2 = varDec(0);
				setState(59);
				match(Surrogate_id_SYMB_10);
				setState(60);
				((ExprContext)_localctx).p_8_4 = expr(0);
				setState(61);
				match(Surrogate_id_SYMB_19);
				setState(62);
				((ExprContext)_localctx).p_8_6 = expr(8);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.LetInference(((ExprContext)_localctx).p_8_2.result,((ExprContext)_localctx).p_8_4.result,((ExprContext)_localctx).p_8_6.result); 
				}
				break;
			case 4:
				{
				setState(65);
				match(Surrogate_id_SYMB_20);
				setState(66);
				((ExprContext)_localctx).p_9_2 = varDec(0);
				setState(67);
				match(Surrogate_id_SYMB_10);
				setState(68);
				((ExprContext)_localctx).p_9_4 = expr(0);
				setState(69);
				match(Surrogate_id_SYMB_18);
				setState(70);
				((ExprContext)_localctx).p_9_6 = type();
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.LetAscription(((ExprContext)_localctx).p_9_2.result,((ExprContext)_localctx).p_9_4.result,((ExprContext)_localctx).p_9_6.result); 
				}
				break;
			case 5:
				{
				setState(73);
				((ExprContext)_localctx).p_10_1 = match(INTEGER);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.IntValue(Integer.parseInt(((ExprContext)_localctx).p_10_1.getText())); 
				}
				break;
			case 6:
				{
				setState(75);
				((ExprContext)_localctx).p_11_1 = match(DOUBLE);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.RealValue(Double.parseDouble(((ExprContext)_localctx).p_11_1.getText())); 
				}
				break;
			case 7:
				{
				setState(77);
				((ExprContext)_localctx).p_12_1 = match(STRING);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.StringValue(((ExprContext)_localctx).p_12_1.getText().substring(1, ((ExprContext)_localctx).p_12_1.getText().length()-1)); 
				}
				break;
			case 8:
				{
				setState(79);
				((ExprContext)_localctx).p_15_1 = match(IDENT);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.AtomicExpression(((ExprContext)_localctx).p_15_1.getText()); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(117);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_3_1 = _prevctx;
						_localctx.p_3_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(83);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(84);
						match(Surrogate_id_SYMB_6);
						setState(85);
						((ExprContext)_localctx).p_3_3 = expr(14);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Sum(((ExprContext)_localctx).p_3_1.result,((ExprContext)_localctx).p_3_3.result); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_4_1 = _prevctx;
						_localctx.p_4_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(88);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(89);
						match(Surrogate_id_SYMB_7);
						setState(90);
						((ExprContext)_localctx).p_4_3 = expr(13);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Substract(((ExprContext)_localctx).p_4_1.result,((ExprContext)_localctx).p_4_3.result); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_5_1 = _prevctx;
						_localctx.p_5_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(94);
						match(Surrogate_id_SYMB_8);
						setState(95);
						((ExprContext)_localctx).p_5_3 = expr(12);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Multiply(((ExprContext)_localctx).p_5_1.result,((ExprContext)_localctx).p_5_3.result); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_6_1 = _prevctx;
						_localctx.p_6_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(99);
						match(Surrogate_id_SYMB_9);
						setState(100);
						((ExprContext)_localctx).p_6_3 = expr(11);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Divide(((ExprContext)_localctx).p_6_1.result,((ExprContext)_localctx).p_6_3.result); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_13_1 = _prevctx;
						_localctx.p_13_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(104);
						match(Surrogate_id_SYMB_0);
						setState(105);
						((ExprContext)_localctx).p_13_3 = expr(4);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.MultipleExpressions(((ExprContext)_localctx).p_13_1.result,((ExprContext)_localctx).p_13_3.result); 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_2_1 = _prevctx;
						_localctx.p_2_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(109);
						match(Surrogate_id_SYMB_4);
						setState(110);
						((ExprContext)_localctx).p_2_3 = expr(0);
						setState(111);
						match(Surrogate_id_SYMB_5);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.ApplyFunction(((ExprContext)_localctx).p_2_1.result,((ExprContext)_localctx).p_2_3.result); 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_14_1 = _prevctx;
						_localctx.p_14_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(115);
						match(Surrogate_id_SYMB_0);
						 ((ExprContext)_localctx).result =  ((ExprContext)_localctx).p_14_1.result; 
						}
						break;
					}
					} 
				}
				setState(121);
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

	public static class VarDecContext extends ParserRuleContext {
		public hardtyped.Absyn.VarDec result;
		public VarDecContext p_1_1;
		public VarDecContext p_2_1;
		public Token p_3_1;
		public TypeContext p_3_3;
		public Token p_4_1;
		public VarDecContext p_1_3;
		public TerminalNode Surrogate_id_SYMB_12() { return getToken(hardtypedParser.Surrogate_id_SYMB_12, 0); }
		public TerminalNode IDENT() { return getToken(hardtypedParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_11() { return getToken(hardtypedParser.Surrogate_id_SYMB_11, 0); }
		public List<VarDecContext> varDec() {
			return getRuleContexts(VarDecContext.class);
		}
		public VarDecContext varDec(int i) {
			return getRuleContext(VarDecContext.class,i);
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
		return varDec(0);
	}

	private VarDecContext varDec(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarDecContext _localctx = new VarDecContext(_ctx, _parentState);
		VarDecContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_varDec, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(123);
				((VarDecContext)_localctx).p_3_1 = match(IDENT);
				setState(124);
				match(Surrogate_id_SYMB_12);
				setState(125);
				((VarDecContext)_localctx).p_3_3 = type();
				 ((VarDecContext)_localctx).result =  new hardtyped.Absyn.TypedVar(((VarDecContext)_localctx).p_3_1.getText(),((VarDecContext)_localctx).p_3_3.result); 
				}
				break;
			case 2:
				{
				setState(128);
				((VarDecContext)_localctx).p_4_1 = match(IDENT);
				 ((VarDecContext)_localctx).result =  new hardtyped.Absyn.UntypedVar(((VarDecContext)_localctx).p_4_1.getText()); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(140);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new VarDecContext(_parentctx, _parentState);
						_localctx.p_1_1 = _prevctx;
						_localctx.p_1_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_varDec);
						setState(132);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(133);
						match(Surrogate_id_SYMB_11);
						setState(134);
						((VarDecContext)_localctx).p_1_3 = varDec(5);
						 ((VarDecContext)_localctx).result =  new hardtyped.Absyn.MultipleVars(((VarDecContext)_localctx).p_1_1.result,((VarDecContext)_localctx).p_1_3.result); 
						}
						break;
					case 2:
						{
						_localctx = new VarDecContext(_parentctx, _parentState);
						_localctx.p_2_1 = _prevctx;
						_localctx.p_2_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_varDec);
						setState(137);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(138);
						match(Surrogate_id_SYMB_11);
						 ((VarDecContext)_localctx).result =  new hardtyped.Absyn.MultipleVarsFinal(((VarDecContext)_localctx).p_2_1.result); 
						}
						break;
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_14:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(Surrogate_id_SYMB_14);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.IntType(); 
				}
				break;
			case Surrogate_id_SYMB_15:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(Surrogate_id_SYMB_15);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.RealType(); 
				}
				break;
			case Surrogate_id_SYMB_13:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(Surrogate_id_SYMB_13);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.BoolType(); 
				}
				break;
			case Surrogate_id_SYMB_16:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				match(Surrogate_id_SYMB_16);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.StringType(); 
				}
				break;
			case Surrogate_id_SYMB_17:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
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
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 6:
			return varDec_sempred((VarDecContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean varDec_sempred(VarDecContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00a0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6,\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7T\n\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7x\n\7\f\7\16\7{\13\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0085\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\7\b\u008f\n\b\f\b\16\b\u0092\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u009e\n\t\3\t\2\4\f\16\n\2\4\6\b\n\f\16\20\2\2\2\u00ae\2"+
		"\22\3\2\2\2\4\26\3\2\2\2\6\32\3\2\2\2\b\36\3\2\2\2\n+\3\2\2\2\fS\3\2\2"+
		"\2\16\u0084\3\2\2\2\20\u009d\3\2\2\2\22\23\5\n\6\2\23\24\7\2\2\3\24\25"+
		"\b\2\1\2\25\3\3\2\2\2\26\27\5\f\7\2\27\30\7\2\2\3\30\31\b\3\1\2\31\5\3"+
		"\2\2\2\32\33\5\16\b\2\33\34\7\2\2\3\34\35\b\4\1\2\35\7\3\2\2\2\36\37\5"+
		"\20\t\2\37 \7\2\2\3 !\b\5\1\2!\t\3\2\2\2\",\b\6\1\2#$\5\f\7\2$%\b\6\1"+
		"\2%,\3\2\2\2&\'\5\f\7\2\'(\7\3\2\2()\5\n\6\2)*\b\6\1\2*,\3\2\2\2+\"\3"+
		"\2\2\2+#\3\2\2\2+&\3\2\2\2,\13\3\2\2\2-.\b\7\1\2./\7\4\2\2/\60\5\16\b"+
		"\2\60\61\7\5\2\2\61\62\5\f\7\2\62\63\7\6\2\2\63\64\b\7\1\2\64T\3\2\2\2"+
		"\65\66\7\27\2\2\66\67\5\16\b\2\678\7\r\2\289\5\f\7\139:\b\7\1\2:T\3\2"+
		"\2\2;<\7\27\2\2<=\5\16\b\2=>\7\r\2\2>?\5\f\7\2?@\7\26\2\2@A\5\f\7\nAB"+
		"\b\7\1\2BT\3\2\2\2CD\7\27\2\2DE\5\16\b\2EF\7\r\2\2FG\5\f\7\2GH\7\25\2"+
		"\2HI\5\20\t\2IJ\b\7\1\2JT\3\2\2\2KL\7\33\2\2LT\b\7\1\2MN\7\32\2\2NT\b"+
		"\7\1\2OP\7\37\2\2PT\b\7\1\2QR\7\34\2\2RT\b\7\1\2S-\3\2\2\2S\65\3\2\2\2"+
		"S;\3\2\2\2SC\3\2\2\2SK\3\2\2\2SM\3\2\2\2SO\3\2\2\2SQ\3\2\2\2Ty\3\2\2\2"+
		"UV\f\17\2\2VW\7\t\2\2WX\5\f\7\20XY\b\7\1\2Yx\3\2\2\2Z[\f\16\2\2[\\\7\n"+
		"\2\2\\]\5\f\7\17]^\b\7\1\2^x\3\2\2\2_`\f\r\2\2`a\7\13\2\2ab\5\f\7\16b"+
		"c\b\7\1\2cx\3\2\2\2de\f\f\2\2ef\7\f\2\2fg\5\f\7\rgh\b\7\1\2hx\3\2\2\2"+
		"ij\f\5\2\2jk\7\3\2\2kl\5\f\7\6lm\b\7\1\2mx\3\2\2\2no\f\20\2\2op\7\7\2"+
		"\2pq\5\f\7\2qr\7\b\2\2rs\b\7\1\2sx\3\2\2\2tu\f\4\2\2uv\7\3\2\2vx\b\7\1"+
		"\2wU\3\2\2\2wZ\3\2\2\2w_\3\2\2\2wd\3\2\2\2wi\3\2\2\2wn\3\2\2\2wt\3\2\2"+
		"\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\r\3\2\2\2{y\3\2\2\2|}\b\b\1\2}~\7\34"+
		"\2\2~\177\7\17\2\2\177\u0080\5\20\t\2\u0080\u0081\b\b\1\2\u0081\u0085"+
		"\3\2\2\2\u0082\u0083\7\34\2\2\u0083\u0085\b\b\1\2\u0084|\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0090\3\2\2\2\u0086\u0087\f\6\2\2\u0087\u0088\7\16"+
		"\2\2\u0088\u0089\5\16\b\7\u0089\u008a\b\b\1\2\u008a\u008f\3\2\2\2\u008b"+
		"\u008c\f\5\2\2\u008c\u008d\7\16\2\2\u008d\u008f\b\b\1\2\u008e\u0086\3"+
		"\2\2\2\u008e\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\17\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\21\2"+
		"\2\u0094\u009e\b\t\1\2\u0095\u0096\7\22\2\2\u0096\u009e\b\t\1\2\u0097"+
		"\u0098\7\20\2\2\u0098\u009e\b\t\1\2\u0099\u009a\7\23\2\2\u009a\u009e\b"+
		"\t\1\2\u009b\u009c\7\24\2\2\u009c\u009e\b\t\1\2\u009d\u0093\3\2\2\2\u009d"+
		"\u0095\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009e\21\3\2\2\2\n+Swy\u0084\u008e\u0090\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}