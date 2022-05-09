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
		RULE_start_ListExpr = 0, RULE_start_Expr = 1, RULE_start_InExpr = 2, RULE_start_VarDec = 3, 
		RULE_start_Type = 4, RULE_listExpr = 5, RULE_expr = 6, RULE_inExpr = 7, 
		RULE_varDec = 8, RULE_type = 9;
	public static final String[] ruleNames = {
		"start_ListExpr", "start_Expr", "start_InExpr", "start_VarDec", "start_Type", 
		"listExpr", "expr", "inExpr", "varDec", "type"
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
			setState(20);
			((Start_ListExprContext)_localctx).x = listExpr();
			setState(21);
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
			setState(24);
			((Start_ExprContext)_localctx).x = expr(0);
			setState(25);
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
			setState(28);
			((Start_InExprContext)_localctx).x = inExpr(0);
			setState(29);
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
		enterRule(_localctx, 6, RULE_start_VarDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			((Start_VarDecContext)_localctx).x = varDec(0);
			setState(33);
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
		enterRule(_localctx, 8, RULE_start_Type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			((Start_TypeContext)_localctx).x = type();
			setState(37);
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
		enterRule(_localctx, 10, RULE_listExpr);
		try {
			setState(49);
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
				setState(41);
				((ListExprContext)_localctx).p_2_1 = expr(0);
				 ((ListExprContext)_localctx).result =  new hardtyped.Absyn.ListExpr(); _localctx.result.addLast(((ListExprContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				((ListExprContext)_localctx).p_3_1 = expr(0);
				setState(45);
				match(Surrogate_id_SYMB_0);
				setState(46);
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
		public VarDecContext p_1_2;
		public InExprContext p_1_4;
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
		public Token p_13_1;
		public ExprContext p_3_3;
		public ExprContext p_4_3;
		public ExprContext p_5_3;
		public ExprContext p_6_3;
		public ExprContext p_2_3;
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(hardtypedParser.Surrogate_id_SYMB_1, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(hardtypedParser.Surrogate_id_SYMB_2, 0); }
		public TerminalNode Surrogate_id_SYMB_3() { return getToken(hardtypedParser.Surrogate_id_SYMB_3, 0); }
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public InExprContext inExpr() {
			return getRuleContext(InExprContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_20() { return getToken(hardtypedParser.Surrogate_id_SYMB_20, 0); }
		public TerminalNode Surrogate_id_SYMB_10() { return getToken(hardtypedParser.Surrogate_id_SYMB_10, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		public TerminalNode Surrogate_id_SYMB_6() { return getToken(hardtypedParser.Surrogate_id_SYMB_6, 0); }
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(hardtypedParser.Surrogate_id_SYMB_7, 0); }
		public TerminalNode Surrogate_id_SYMB_8() { return getToken(hardtypedParser.Surrogate_id_SYMB_8, 0); }
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(hardtypedParser.Surrogate_id_SYMB_9, 0); }
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(52);
				match(Surrogate_id_SYMB_1);
				setState(53);
				((ExprContext)_localctx).p_1_2 = varDec(0);
				setState(54);
				match(Surrogate_id_SYMB_2);
				setState(55);
				((ExprContext)_localctx).p_1_4 = inExpr(0);
				setState(56);
				match(Surrogate_id_SYMB_3);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Function(((ExprContext)_localctx).p_1_2.result,((ExprContext)_localctx).p_1_4.result); 
				}
				break;
			case 2:
				{
				setState(59);
				match(Surrogate_id_SYMB_20);
				setState(60);
				((ExprContext)_localctx).p_7_2 = varDec(0);
				setState(61);
				match(Surrogate_id_SYMB_10);
				setState(62);
				((ExprContext)_localctx).p_7_4 = expr(7);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Let(((ExprContext)_localctx).p_7_2.result,((ExprContext)_localctx).p_7_4.result); 
				}
				break;
			case 3:
				{
				setState(65);
				match(Surrogate_id_SYMB_20);
				setState(66);
				((ExprContext)_localctx).p_8_2 = varDec(0);
				setState(67);
				match(Surrogate_id_SYMB_10);
				setState(68);
				((ExprContext)_localctx).p_8_4 = expr(0);
				setState(69);
				match(Surrogate_id_SYMB_19);
				setState(70);
				((ExprContext)_localctx).p_8_6 = expr(6);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.LetInference(((ExprContext)_localctx).p_8_2.result,((ExprContext)_localctx).p_8_4.result,((ExprContext)_localctx).p_8_6.result); 
				}
				break;
			case 4:
				{
				setState(73);
				match(Surrogate_id_SYMB_20);
				setState(74);
				((ExprContext)_localctx).p_9_2 = varDec(0);
				setState(75);
				match(Surrogate_id_SYMB_10);
				setState(76);
				((ExprContext)_localctx).p_9_4 = expr(0);
				setState(77);
				match(Surrogate_id_SYMB_18);
				setState(78);
				((ExprContext)_localctx).p_9_6 = type();
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.LetAscription(((ExprContext)_localctx).p_9_2.result,((ExprContext)_localctx).p_9_4.result,((ExprContext)_localctx).p_9_6.result); 
				}
				break;
			case 5:
				{
				setState(81);
				((ExprContext)_localctx).p_10_1 = match(INTEGER);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.IntValue(Integer.parseInt(((ExprContext)_localctx).p_10_1.getText())); 
				}
				break;
			case 6:
				{
				setState(83);
				((ExprContext)_localctx).p_11_1 = match(DOUBLE);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.RealValue(Double.parseDouble(((ExprContext)_localctx).p_11_1.getText())); 
				}
				break;
			case 7:
				{
				setState(85);
				((ExprContext)_localctx).p_12_1 = match(STRING);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.StringValue(((ExprContext)_localctx).p_12_1.getText().substring(1, ((ExprContext)_localctx).p_12_1.getText().length()-1)); 
				}
				break;
			case 8:
				{
				setState(87);
				((ExprContext)_localctx).p_13_1 = match(IDENT);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.AtomicExpression(((ExprContext)_localctx).p_13_1.getText()); 
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
						setState(91);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(92);
						match(Surrogate_id_SYMB_6);
						setState(93);
						((ExprContext)_localctx).p_3_3 = expr(12);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Sum(((ExprContext)_localctx).p_3_1.result,((ExprContext)_localctx).p_3_3.result); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_4_1 = _prevctx;
						_localctx.p_4_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(97);
						match(Surrogate_id_SYMB_7);
						setState(98);
						((ExprContext)_localctx).p_4_3 = expr(11);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Substract(((ExprContext)_localctx).p_4_1.result,((ExprContext)_localctx).p_4_3.result); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_5_1 = _prevctx;
						_localctx.p_5_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(102);
						match(Surrogate_id_SYMB_8);
						setState(103);
						((ExprContext)_localctx).p_5_3 = expr(10);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Multiply(((ExprContext)_localctx).p_5_1.result,((ExprContext)_localctx).p_5_3.result); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_6_1 = _prevctx;
						_localctx.p_6_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(107);
						match(Surrogate_id_SYMB_9);
						setState(108);
						((ExprContext)_localctx).p_6_3 = expr(9);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Divide(((ExprContext)_localctx).p_6_1.result,((ExprContext)_localctx).p_6_3.result); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_2_1 = _prevctx;
						_localctx.p_2_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(112);
						match(Surrogate_id_SYMB_4);
						setState(113);
						((ExprContext)_localctx).p_2_3 = expr(0);
						setState(114);
						match(Surrogate_id_SYMB_5);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.ApplyFunction(((ExprContext)_localctx).p_2_1.result,((ExprContext)_localctx).p_2_3.result); 
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_inExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(123);
			((InExprContext)_localctx).p_3_1 = expr(0);
			 ((InExprContext)_localctx).result =  new hardtyped.Absyn.InnerExpression(((InExprContext)_localctx).p_3_1.result); 
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(134);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new InExprContext(_parentctx, _parentState);
						_localctx.p_1_1 = _prevctx;
						_localctx.p_1_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_inExpr);
						setState(126);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(127);
						match(Surrogate_id_SYMB_0);
						setState(128);
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
						setState(131);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(132);
						match(Surrogate_id_SYMB_0);
						 ((InExprContext)_localctx).result =  new hardtyped.Absyn.FinalExpression(((InExprContext)_localctx).p_2_1.result); 
						}
						break;
					}
					} 
				}
				setState(138);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_varDec, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(140);
				((VarDecContext)_localctx).p_3_1 = match(IDENT);
				setState(141);
				match(Surrogate_id_SYMB_12);
				setState(142);
				((VarDecContext)_localctx).p_3_3 = type();
				 ((VarDecContext)_localctx).result =  new hardtyped.Absyn.TypedVar(((VarDecContext)_localctx).p_3_1.getText(),((VarDecContext)_localctx).p_3_3.result); 
				}
				break;
			case 2:
				{
				setState(145);
				((VarDecContext)_localctx).p_4_1 = match(IDENT);
				 ((VarDecContext)_localctx).result =  new hardtyped.Absyn.UntypedVar(((VarDecContext)_localctx).p_4_1.getText()); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new VarDecContext(_parentctx, _parentState);
						_localctx.p_1_1 = _prevctx;
						_localctx.p_1_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_varDec);
						setState(149);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(150);
						match(Surrogate_id_SYMB_11);
						setState(151);
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
						setState(154);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(155);
						match(Surrogate_id_SYMB_11);
						 ((VarDecContext)_localctx).result =  new hardtyped.Absyn.MultipleVarsFinal(((VarDecContext)_localctx).p_2_1.result); 
						}
						break;
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_14:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(Surrogate_id_SYMB_14);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.IntType(); 
				}
				break;
			case Surrogate_id_SYMB_15:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(Surrogate_id_SYMB_15);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.RealType(); 
				}
				break;
			case Surrogate_id_SYMB_13:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(Surrogate_id_SYMB_13);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.BoolType(); 
				}
				break;
			case Surrogate_id_SYMB_16:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(Surrogate_id_SYMB_16);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.StringType(); 
				}
				break;
			case Surrogate_id_SYMB_17:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
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
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 7:
			return inExpr_sempred((InExprContext)_localctx, predIndex);
		case 8:
			return varDec_sempred((VarDecContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 12);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00b1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\64\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\\\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bx\n\b\f\b\16\b{\13"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0089\n\t\f\t\16"+
		"\t\u008c\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0096\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a0\n\n\f\n\16\n\u00a3\13\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00af\n\13\3\13\2\5\16\20\22"+
		"\f\2\4\6\b\n\f\16\20\22\24\2\2\2\u00bd\2\26\3\2\2\2\4\32\3\2\2\2\6\36"+
		"\3\2\2\2\b\"\3\2\2\2\n&\3\2\2\2\f\63\3\2\2\2\16[\3\2\2\2\20|\3\2\2\2\22"+
		"\u0095\3\2\2\2\24\u00ae\3\2\2\2\26\27\5\f\7\2\27\30\7\2\2\3\30\31\b\2"+
		"\1\2\31\3\3\2\2\2\32\33\5\16\b\2\33\34\7\2\2\3\34\35\b\3\1\2\35\5\3\2"+
		"\2\2\36\37\5\20\t\2\37 \7\2\2\3 !\b\4\1\2!\7\3\2\2\2\"#\5\22\n\2#$\7\2"+
		"\2\3$%\b\5\1\2%\t\3\2\2\2&\'\5\24\13\2\'(\7\2\2\3()\b\6\1\2)\13\3\2\2"+
		"\2*\64\b\7\1\2+,\5\16\b\2,-\b\7\1\2-\64\3\2\2\2./\5\16\b\2/\60\7\3\2\2"+
		"\60\61\5\f\7\2\61\62\b\7\1\2\62\64\3\2\2\2\63*\3\2\2\2\63+\3\2\2\2\63"+
		".\3\2\2\2\64\r\3\2\2\2\65\66\b\b\1\2\66\67\7\4\2\2\678\5\22\n\289\7\5"+
		"\2\29:\5\20\t\2:;\7\6\2\2;<\b\b\1\2<\\\3\2\2\2=>\7\27\2\2>?\5\22\n\2?"+
		"@\7\r\2\2@A\5\16\b\tAB\b\b\1\2B\\\3\2\2\2CD\7\27\2\2DE\5\22\n\2EF\7\r"+
		"\2\2FG\5\16\b\2GH\7\26\2\2HI\5\16\b\bIJ\b\b\1\2J\\\3\2\2\2KL\7\27\2\2"+
		"LM\5\22\n\2MN\7\r\2\2NO\5\16\b\2OP\7\25\2\2PQ\5\24\13\2QR\b\b\1\2R\\\3"+
		"\2\2\2ST\7\33\2\2T\\\b\b\1\2UV\7\32\2\2V\\\b\b\1\2WX\7\37\2\2X\\\b\b\1"+
		"\2YZ\7\34\2\2Z\\\b\b\1\2[\65\3\2\2\2[=\3\2\2\2[C\3\2\2\2[K\3\2\2\2[S\3"+
		"\2\2\2[U\3\2\2\2[W\3\2\2\2[Y\3\2\2\2\\y\3\2\2\2]^\f\r\2\2^_\7\t\2\2_`"+
		"\5\16\b\16`a\b\b\1\2ax\3\2\2\2bc\f\f\2\2cd\7\n\2\2de\5\16\b\ref\b\b\1"+
		"\2fx\3\2\2\2gh\f\13\2\2hi\7\13\2\2ij\5\16\b\fjk\b\b\1\2kx\3\2\2\2lm\f"+
		"\n\2\2mn\7\f\2\2no\5\16\b\13op\b\b\1\2px\3\2\2\2qr\f\16\2\2rs\7\7\2\2"+
		"st\5\16\b\2tu\7\b\2\2uv\b\b\1\2vx\3\2\2\2w]\3\2\2\2wb\3\2\2\2wg\3\2\2"+
		"\2wl\3\2\2\2wq\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\17\3\2\2\2{y\3\2"+
		"\2\2|}\b\t\1\2}~\5\16\b\2~\177\b\t\1\2\177\u008a\3\2\2\2\u0080\u0081\f"+
		"\5\2\2\u0081\u0082\7\3\2\2\u0082\u0083\5\20\t\6\u0083\u0084\b\t\1\2\u0084"+
		"\u0089\3\2\2\2\u0085\u0086\f\4\2\2\u0086\u0087\7\3\2\2\u0087\u0089\b\t"+
		"\1\2\u0088\u0080\3\2\2\2\u0088\u0085\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\21\3\2\2\2\u008c\u008a\3\2\2"+
		"\2\u008d\u008e\b\n\1\2\u008e\u008f\7\34\2\2\u008f\u0090\7\17\2\2\u0090"+
		"\u0091\5\24\13\2\u0091\u0092\b\n\1\2\u0092\u0096\3\2\2\2\u0093\u0094\7"+
		"\34\2\2\u0094\u0096\b\n\1\2\u0095\u008d\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u00a1\3\2\2\2\u0097\u0098\f\6\2\2\u0098\u0099\7\16\2\2\u0099\u009a\5"+
		"\22\n\7\u009a\u009b\b\n\1\2\u009b\u00a0\3\2\2\2\u009c\u009d\f\5\2\2\u009d"+
		"\u009e\7\16\2\2\u009e\u00a0\b\n\1\2\u009f\u0097\3\2\2\2\u009f\u009c\3"+
		"\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\23\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\21\2\2\u00a5\u00af\b\13"+
		"\1\2\u00a6\u00a7\7\22\2\2\u00a7\u00af\b\13\1\2\u00a8\u00a9\7\20\2\2\u00a9"+
		"\u00af\b\13\1\2\u00aa\u00ab\7\23\2\2\u00ab\u00af\b\13\1\2\u00ac\u00ad"+
		"\7\24\2\2\u00ad\u00af\b\13\1\2\u00ae\u00a4\3\2\2\2\u00ae\u00a6\3\2\2\2"+
		"\u00ae\u00a8\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\25"+
		"\3\2\2\2\f\63[wy\u0088\u008a\u0095\u009f\u00a1\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}