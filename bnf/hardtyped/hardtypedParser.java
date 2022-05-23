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
		Surrogate_id_SYMB_20=21, Surrogate_id_SYMB_21=22, Surrogate_id_SYMB_22=23, 
		Surrogate_id_SYMB_23=24, Surrogate_id_SYMB_24=25, Surrogate_id_SYMB_25=26, 
		Surrogate_id_SYMB_26=27, Surrogate_id_SYMB_27=28, Surrogate_id_SYMB_28=29, 
		Surrogate_id_SYMB_29=30, Surrogate_id_SYMB_30=31, Surrogate_id_SYMB_31=32, 
		Surrogate_id_SYMB_32=33, Surrogate_id_SYMB_33=34, Surrogate_id_SYMB_34=35, 
		Surrogate_id_SYMB_35=36, Surrogate_id_SYMB_36=37, COMMENT_antlr_builtin=38, 
		MULTICOMMENT_antlr_builtin=39, Bool=40, Unit=41, Print=42, Read=43, DOUBLE=44, 
		INTEGER=45, IDENT=46, WS=47, ErrorToken=48, STRING=49, STRINGESC=50;
	public static final int
		RULE_start_ListExpr = 0, RULE_start_Expr = 1, RULE_start_Let = 2, RULE_start_Value = 3, 
		RULE_start_Record = 4, RULE_start_InExpr = 5, RULE_start_InnerExpr = 6, 
		RULE_start_FuncArg = 7, RULE_start_VarDec = 8, RULE_start_Type = 9, RULE_listExpr = 10, 
		RULE_expr = 11, RULE_let = 12, RULE_value = 13, RULE_record = 14, RULE_inExpr = 15, 
		RULE_innerExpr = 16, RULE_funcArg = 17, RULE_varDec = 18, RULE_type = 19;
	public static final String[] ruleNames = {
		"start_ListExpr", "start_Expr", "start_Let", "start_Value", "start_Record", 
		"start_InExpr", "start_InnerExpr", "start_FuncArg", "start_VarDec", "start_Type", 
		"listExpr", "expr", "let", "value", "record", "inExpr", "innerExpr", "funcArg", 
		"varDec", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'-|'", "'/\\'", "'{'", "'}'", "'('", "')'", "','", "'|'", 
		"':'", "'|:'", "'+'", "'-'", "'*'", "'/'", "'>'", "'>='", "'=='", "'<='", 
		"'<'", "'='", "'.'", "'->'", "'Any'", "'Boolean'", "'Integer'", "'Real'", 
		"'String'", "'Unit'", "'and'", "'as'", "'in'", "'let'", "'letrec'", "'lettype'", 
		"'not'", "'or'", null, null, null, null, null, null, null, null, null, 
		null, null, "'\"'", "'\\'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Surrogate_id_SYMB_0", "Surrogate_id_SYMB_1", "Surrogate_id_SYMB_2", 
		"Surrogate_id_SYMB_3", "Surrogate_id_SYMB_4", "Surrogate_id_SYMB_5", "Surrogate_id_SYMB_6", 
		"Surrogate_id_SYMB_7", "Surrogate_id_SYMB_8", "Surrogate_id_SYMB_9", "Surrogate_id_SYMB_10", 
		"Surrogate_id_SYMB_11", "Surrogate_id_SYMB_12", "Surrogate_id_SYMB_13", 
		"Surrogate_id_SYMB_14", "Surrogate_id_SYMB_15", "Surrogate_id_SYMB_16", 
		"Surrogate_id_SYMB_17", "Surrogate_id_SYMB_18", "Surrogate_id_SYMB_19", 
		"Surrogate_id_SYMB_20", "Surrogate_id_SYMB_21", "Surrogate_id_SYMB_22", 
		"Surrogate_id_SYMB_23", "Surrogate_id_SYMB_24", "Surrogate_id_SYMB_25", 
		"Surrogate_id_SYMB_26", "Surrogate_id_SYMB_27", "Surrogate_id_SYMB_28", 
		"Surrogate_id_SYMB_29", "Surrogate_id_SYMB_30", "Surrogate_id_SYMB_31", 
		"Surrogate_id_SYMB_32", "Surrogate_id_SYMB_33", "Surrogate_id_SYMB_34", 
		"Surrogate_id_SYMB_35", "Surrogate_id_SYMB_36", "COMMENT_antlr_builtin", 
		"MULTICOMMENT_antlr_builtin", "Bool", "Unit", "Print", "Read", "DOUBLE", 
		"INTEGER", "IDENT", "WS", "ErrorToken", "STRING", "STRINGESC"
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
			setState(40);
			((Start_ListExprContext)_localctx).x = listExpr();
			setState(41);
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
			setState(44);
			((Start_ExprContext)_localctx).x = expr(0);
			setState(45);
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

	public static class Start_LetContext extends ParserRuleContext {
		public hardtyped.Absyn.Let result;
		public LetContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public Start_LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Let(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Let(this);
		}
	}

	public final Start_LetContext start_Let() throws RecognitionException {
		Start_LetContext _localctx = new Start_LetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start_Let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			((Start_LetContext)_localctx).x = let();
			setState(49);
			match(EOF);
			 ((Start_LetContext)_localctx).result =  ((Start_LetContext)_localctx).x.result; 
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

	public static class Start_ValueContext extends ParserRuleContext {
		public hardtyped.Absyn.Value result;
		public ValueContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Start_ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Value(this);
		}
	}

	public final Start_ValueContext start_Value() throws RecognitionException {
		Start_ValueContext _localctx = new Start_ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_start_Value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			((Start_ValueContext)_localctx).x = value();
			setState(53);
			match(EOF);
			 ((Start_ValueContext)_localctx).result =  ((Start_ValueContext)_localctx).x.result; 
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

	public static class Start_RecordContext extends ParserRuleContext {
		public hardtyped.Absyn.Record result;
		public RecordContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public Start_RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Record(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Record(this);
		}
	}

	public final Start_RecordContext start_Record() throws RecognitionException {
		Start_RecordContext _localctx = new Start_RecordContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_start_Record);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			((Start_RecordContext)_localctx).x = record(0);
			setState(57);
			match(EOF);
			 ((Start_RecordContext)_localctx).result =  ((Start_RecordContext)_localctx).x.result; 
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
		enterRule(_localctx, 10, RULE_start_InExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			((Start_InExprContext)_localctx).x = inExpr(0);
			setState(61);
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

	public static class Start_InnerExprContext extends ParserRuleContext {
		public hardtyped.Absyn.InnerExpr result;
		public InnerExprContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public InnerExprContext innerExpr() {
			return getRuleContext(InnerExprContext.class,0);
		}
		public Start_InnerExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_InnerExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_InnerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_InnerExpr(this);
		}
	}

	public final Start_InnerExprContext start_InnerExpr() throws RecognitionException {
		Start_InnerExprContext _localctx = new Start_InnerExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_start_InnerExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			((Start_InnerExprContext)_localctx).x = innerExpr(0);
			setState(65);
			match(EOF);
			 ((Start_InnerExprContext)_localctx).result =  ((Start_InnerExprContext)_localctx).x.result; 
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
		enterRule(_localctx, 14, RULE_start_FuncArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((Start_FuncArgContext)_localctx).x = funcArg();
			setState(69);
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
		enterRule(_localctx, 16, RULE_start_VarDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			((Start_VarDecContext)_localctx).x = varDec();
			setState(73);
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
		enterRule(_localctx, 18, RULE_start_Type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			((Start_TypeContext)_localctx).x = type(0);
			setState(77);
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
		enterRule(_localctx, 20, RULE_listExpr);
		try {
			setState(89);
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
				setState(81);
				((ListExprContext)_localctx).p_2_1 = expr(0);
				 ((ListExprContext)_localctx).result =  new hardtyped.Absyn.ListExpr(); _localctx.result.addLast(((ListExprContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				((ListExprContext)_localctx).p_3_1 = expr(0);
				setState(85);
				match(Surrogate_id_SYMB_0);
				setState(86);
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
		public ExprContext p_3_1;
		public ExprContext p_8_1;
		public ExprContext p_11_1;
		public ExprContext p_12_1;
		public ExprContext p_13_1;
		public ExprContext p_14_1;
		public ExprContext p_15_1;
		public ExprContext p_16_1;
		public ExprContext p_18_1;
		public ExprContext p_19_1;
		public ExprContext p_20_1;
		public ExprContext p_21_1;
		public ExprContext p_22_1;
		public VarDecContext p_1_2;
		public FuncArgContext p_2_2;
		public InExprContext p_2_4;
		public Token p_4_1;
		public ExprContext p_4_3;
		public Token p_5_1;
		public ExprContext p_5_3;
		public Token p_6_1;
		public Token p_7_1;
		public ExprContext p_9_3;
		public ExprContext p_9_6;
		public ExprContext p_10_2;
		public ExprContext p_17_2;
		public ExprContext p_23_2;
		public ExprContext p_24_2;
		public LetContext p_25_1;
		public ValueContext p_26_1;
		public Token p_27_1;
		public InnerExprContext p_28_2;
		public ExprContext p_8_3;
		public ExprContext p_11_3;
		public ExprContext p_12_3;
		public ExprContext p_13_3;
		public ExprContext p_14_3;
		public ExprContext p_15_3;
		public ExprContext p_16_3;
		public ExprContext p_18_3;
		public ExprContext p_19_3;
		public ExprContext p_20_3;
		public ExprContext p_21_3;
		public ExprContext p_22_3;
		public ExprContext p_3_3;
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(hardtypedParser.Surrogate_id_SYMB_1, 0); }
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(hardtypedParser.Surrogate_id_SYMB_2, 0); }
		public TerminalNode Surrogate_id_SYMB_3() { return getToken(hardtypedParser.Surrogate_id_SYMB_3, 0); }
		public TerminalNode Surrogate_id_SYMB_4() { return getToken(hardtypedParser.Surrogate_id_SYMB_4, 0); }
		public FuncArgContext funcArg() {
			return getRuleContext(FuncArgContext.class,0);
		}
		public InExprContext inExpr() {
			return getRuleContext(InExprContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_5() { return getToken(hardtypedParser.Surrogate_id_SYMB_5, 0); }
		public TerminalNode Surrogate_id_SYMB_6() { return getToken(hardtypedParser.Surrogate_id_SYMB_6, 0); }
		public TerminalNode Print() { return getToken(hardtypedParser.Print, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Read() { return getToken(hardtypedParser.Read, 0); }
		public TerminalNode Surrogate_id_SYMB_8() { return getToken(hardtypedParser.Surrogate_id_SYMB_8, 0); }
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(hardtypedParser.Surrogate_id_SYMB_9, 0); }
		public TerminalNode Surrogate_id_SYMB_10() { return getToken(hardtypedParser.Surrogate_id_SYMB_10, 0); }
		public TerminalNode Surrogate_id_SYMB_35() { return getToken(hardtypedParser.Surrogate_id_SYMB_35, 0); }
		public TerminalNode Surrogate_id_SYMB_11() { return getToken(hardtypedParser.Surrogate_id_SYMB_11, 0); }
		public TerminalNode Surrogate_id_SYMB_12() { return getToken(hardtypedParser.Surrogate_id_SYMB_12, 0); }
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(hardtypedParser.IDENT, 0); }
		public InnerExprContext innerExpr() {
			return getRuleContext(InnerExprContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(hardtypedParser.Surrogate_id_SYMB_7, 0); }
		public TerminalNode Surrogate_id_SYMB_13() { return getToken(hardtypedParser.Surrogate_id_SYMB_13, 0); }
		public TerminalNode Surrogate_id_SYMB_14() { return getToken(hardtypedParser.Surrogate_id_SYMB_14, 0); }
		public TerminalNode Surrogate_id_SYMB_29() { return getToken(hardtypedParser.Surrogate_id_SYMB_29, 0); }
		public TerminalNode Surrogate_id_SYMB_36() { return getToken(hardtypedParser.Surrogate_id_SYMB_36, 0); }
		public TerminalNode Surrogate_id_SYMB_15() { return getToken(hardtypedParser.Surrogate_id_SYMB_15, 0); }
		public TerminalNode Surrogate_id_SYMB_16() { return getToken(hardtypedParser.Surrogate_id_SYMB_16, 0); }
		public TerminalNode Surrogate_id_SYMB_17() { return getToken(hardtypedParser.Surrogate_id_SYMB_17, 0); }
		public TerminalNode Surrogate_id_SYMB_18() { return getToken(hardtypedParser.Surrogate_id_SYMB_18, 0); }
		public TerminalNode Surrogate_id_SYMB_19() { return getToken(hardtypedParser.Surrogate_id_SYMB_19, 0); }
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(92);
				match(Surrogate_id_SYMB_1);
				setState(93);
				((ExprContext)_localctx).p_1_2 = varDec();
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Import(((ExprContext)_localctx).p_1_2.result); 
				}
				break;
			case 2:
				{
				setState(96);
				match(Surrogate_id_SYMB_2);
				setState(97);
				((ExprContext)_localctx).p_2_2 = funcArg();
				setState(98);
				match(Surrogate_id_SYMB_3);
				setState(99);
				((ExprContext)_localctx).p_2_4 = inExpr(0);
				setState(100);
				match(Surrogate_id_SYMB_4);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Function(((ExprContext)_localctx).p_2_2.result,((ExprContext)_localctx).p_2_4.result); 
				}
				break;
			case 3:
				{
				setState(103);
				((ExprContext)_localctx).p_4_1 = match(Print);
				setState(104);
				match(Surrogate_id_SYMB_5);
				setState(105);
				((ExprContext)_localctx).p_4_3 = expr(0);
				setState(106);
				match(Surrogate_id_SYMB_6);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.PrintFunction(((ExprContext)_localctx).p_4_1.getText(),((ExprContext)_localctx).p_4_3.result); 
				}
				break;
			case 4:
				{
				setState(109);
				((ExprContext)_localctx).p_5_1 = match(Read);
				setState(110);
				match(Surrogate_id_SYMB_5);
				setState(111);
				((ExprContext)_localctx).p_5_3 = expr(0);
				setState(112);
				match(Surrogate_id_SYMB_6);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.ReadFunction(((ExprContext)_localctx).p_5_1.getText(),((ExprContext)_localctx).p_5_3.result); 
				}
				break;
			case 5:
				{
				setState(115);
				((ExprContext)_localctx).p_6_1 = match(Print);
				setState(116);
				match(Surrogate_id_SYMB_5);
				setState(117);
				match(Surrogate_id_SYMB_6);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.EmptyPrintFunction(((ExprContext)_localctx).p_6_1.getText()); 
				}
				break;
			case 6:
				{
				setState(119);
				((ExprContext)_localctx).p_7_1 = match(Read);
				setState(120);
				match(Surrogate_id_SYMB_5);
				setState(121);
				match(Surrogate_id_SYMB_6);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.EmptyReadFunction(((ExprContext)_localctx).p_7_1.getText()); 
				}
				break;
			case 7:
				{
				setState(123);
				match(Surrogate_id_SYMB_8);
				setState(124);
				match(Surrogate_id_SYMB_5);
				setState(125);
				((ExprContext)_localctx).p_9_3 = expr(0);
				setState(126);
				match(Surrogate_id_SYMB_6);
				setState(127);
				match(Surrogate_id_SYMB_9);
				setState(128);
				((ExprContext)_localctx).p_9_6 = expr(20);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.If(((ExprContext)_localctx).p_9_3.result,((ExprContext)_localctx).p_9_6.result); 
				}
				break;
			case 8:
				{
				setState(131);
				match(Surrogate_id_SYMB_10);
				setState(132);
				((ExprContext)_localctx).p_10_2 = expr(19);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Else(((ExprContext)_localctx).p_10_2.result); 
				}
				break;
			case 9:
				{
				setState(135);
				match(Surrogate_id_SYMB_35);
				setState(136);
				((ExprContext)_localctx).p_17_2 = expr(12);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Not(((ExprContext)_localctx).p_17_2.result); 
				}
				break;
			case 10:
				{
				setState(139);
				match(Surrogate_id_SYMB_11);
				setState(140);
				((ExprContext)_localctx).p_23_2 = expr(6);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.UnaryPlus(((ExprContext)_localctx).p_23_2.result); 
				}
				break;
			case 11:
				{
				setState(143);
				match(Surrogate_id_SYMB_12);
				setState(144);
				((ExprContext)_localctx).p_24_2 = expr(5);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.UnaryMinus(((ExprContext)_localctx).p_24_2.result); 
				}
				break;
			case 12:
				{
				setState(147);
				((ExprContext)_localctx).p_25_1 = let();
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.BaseLet(((ExprContext)_localctx).p_25_1.result); 
				}
				break;
			case 13:
				{
				setState(150);
				((ExprContext)_localctx).p_26_1 = value();
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.BaseValue(((ExprContext)_localctx).p_26_1.result); 
				}
				break;
			case 14:
				{
				setState(153);
				((ExprContext)_localctx).p_27_1 = match(IDENT);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.AtomicExpression(((ExprContext)_localctx).p_27_1.getText()); 
				}
				break;
			case 15:
				{
				setState(155);
				match(Surrogate_id_SYMB_5);
				setState(156);
				((ExprContext)_localctx).p_28_2 = innerExpr(0);
				setState(157);
				match(Surrogate_id_SYMB_6);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.ParenthesesExpression(((ExprContext)_localctx).p_28_2.result); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_8_1 = _prevctx;
						_localctx.p_8_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(163);
						match(Surrogate_id_SYMB_7);
						setState(164);
						((ExprContext)_localctx).p_8_3 = expr(22);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.MultipleArgFunction(((ExprContext)_localctx).p_8_1.result,((ExprContext)_localctx).p_8_3.result); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_11_1 = _prevctx;
						_localctx.p_11_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(168);
						match(Surrogate_id_SYMB_11);
						setState(169);
						((ExprContext)_localctx).p_11_3 = expr(19);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Sum(((ExprContext)_localctx).p_11_1.result,((ExprContext)_localctx).p_11_3.result); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_12_1 = _prevctx;
						_localctx.p_12_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(173);
						match(Surrogate_id_SYMB_12);
						setState(174);
						((ExprContext)_localctx).p_12_3 = expr(18);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Substract(((ExprContext)_localctx).p_12_1.result,((ExprContext)_localctx).p_12_3.result); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_13_1 = _prevctx;
						_localctx.p_13_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(178);
						match(Surrogate_id_SYMB_13);
						setState(179);
						((ExprContext)_localctx).p_13_3 = expr(17);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Multiply(((ExprContext)_localctx).p_13_1.result,((ExprContext)_localctx).p_13_3.result); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_14_1 = _prevctx;
						_localctx.p_14_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(183);
						match(Surrogate_id_SYMB_14);
						setState(184);
						((ExprContext)_localctx).p_14_3 = expr(16);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Divide(((ExprContext)_localctx).p_14_1.result,((ExprContext)_localctx).p_14_3.result); 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_15_1 = _prevctx;
						_localctx.p_15_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(188);
						match(Surrogate_id_SYMB_29);
						setState(189);
						((ExprContext)_localctx).p_15_3 = expr(15);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.And(((ExprContext)_localctx).p_15_1.result,((ExprContext)_localctx).p_15_3.result); 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_16_1 = _prevctx;
						_localctx.p_16_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(193);
						match(Surrogate_id_SYMB_36);
						setState(194);
						((ExprContext)_localctx).p_16_3 = expr(14);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Or(((ExprContext)_localctx).p_16_1.result,((ExprContext)_localctx).p_16_3.result); 
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_18_1 = _prevctx;
						_localctx.p_18_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(198);
						match(Surrogate_id_SYMB_15);
						setState(199);
						((ExprContext)_localctx).p_18_3 = expr(12);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.More(((ExprContext)_localctx).p_18_1.result,((ExprContext)_localctx).p_18_3.result); 
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_19_1 = _prevctx;
						_localctx.p_19_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(202);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(203);
						match(Surrogate_id_SYMB_16);
						setState(204);
						((ExprContext)_localctx).p_19_3 = expr(11);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.MoreEql(((ExprContext)_localctx).p_19_1.result,((ExprContext)_localctx).p_19_3.result); 
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_20_1 = _prevctx;
						_localctx.p_20_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(208);
						match(Surrogate_id_SYMB_17);
						setState(209);
						((ExprContext)_localctx).p_20_3 = expr(10);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Eql(((ExprContext)_localctx).p_20_1.result,((ExprContext)_localctx).p_20_3.result); 
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_21_1 = _prevctx;
						_localctx.p_21_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(213);
						match(Surrogate_id_SYMB_18);
						setState(214);
						((ExprContext)_localctx).p_21_3 = expr(9);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.LessEql(((ExprContext)_localctx).p_21_1.result,((ExprContext)_localctx).p_21_3.result); 
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_22_1 = _prevctx;
						_localctx.p_22_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(217);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(218);
						match(Surrogate_id_SYMB_19);
						setState(219);
						((ExprContext)_localctx).p_22_3 = expr(8);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Less(((ExprContext)_localctx).p_22_1.result,((ExprContext)_localctx).p_22_3.result); 
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.p_3_1 = _prevctx;
						_localctx.p_3_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(223);
						match(Surrogate_id_SYMB_5);
						setState(224);
						((ExprContext)_localctx).p_3_3 = expr(0);
						setState(225);
						match(Surrogate_id_SYMB_6);
						 ((ExprContext)_localctx).result =  new hardtyped.Absyn.ApplyFunction(((ExprContext)_localctx).p_3_1.result,((ExprContext)_localctx).p_3_3.result); 
						}
						break;
					}
					} 
				}
				setState(232);
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

	public static class LetContext extends ParserRuleContext {
		public hardtyped.Absyn.Let result;
		public VarDecContext p_1_2;
		public ExprContext p_1_4;
		public VarDecContext p_2_2;
		public ExprContext p_2_4;
		public ExprContext p_2_6;
		public VarDecContext p_3_2;
		public ExprContext p_3_4;
		public TypeContext p_3_6;
		public VarDecContext p_4_2;
		public ExprContext p_4_4;
		public VarDecContext p_5_2;
		public TypeContext p_5_4;
		public TerminalNode Surrogate_id_SYMB_32() { return getToken(hardtypedParser.Surrogate_id_SYMB_32, 0); }
		public TerminalNode Surrogate_id_SYMB_20() { return getToken(hardtypedParser.Surrogate_id_SYMB_20, 0); }
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Surrogate_id_SYMB_31() { return getToken(hardtypedParser.Surrogate_id_SYMB_31, 0); }
		public TerminalNode Surrogate_id_SYMB_30() { return getToken(hardtypedParser.Surrogate_id_SYMB_30, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_33() { return getToken(hardtypedParser.Surrogate_id_SYMB_33, 0); }
		public TerminalNode Surrogate_id_SYMB_34() { return getToken(hardtypedParser.Surrogate_id_SYMB_34, 0); }
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitLet(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_let);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(Surrogate_id_SYMB_32);
				setState(234);
				((LetContext)_localctx).p_1_2 = varDec();
				setState(235);
				match(Surrogate_id_SYMB_20);
				setState(236);
				((LetContext)_localctx).p_1_4 = expr(0);
				 ((LetContext)_localctx).result =  new hardtyped.Absyn.LetVariable(((LetContext)_localctx).p_1_2.result,((LetContext)_localctx).p_1_4.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(Surrogate_id_SYMB_32);
				setState(240);
				((LetContext)_localctx).p_2_2 = varDec();
				setState(241);
				match(Surrogate_id_SYMB_20);
				setState(242);
				((LetContext)_localctx).p_2_4 = expr(0);
				setState(243);
				match(Surrogate_id_SYMB_31);
				setState(244);
				((LetContext)_localctx).p_2_6 = expr(0);
				 ((LetContext)_localctx).result =  new hardtyped.Absyn.LetInference(((LetContext)_localctx).p_2_2.result,((LetContext)_localctx).p_2_4.result,((LetContext)_localctx).p_2_6.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(Surrogate_id_SYMB_32);
				setState(248);
				((LetContext)_localctx).p_3_2 = varDec();
				setState(249);
				match(Surrogate_id_SYMB_20);
				setState(250);
				((LetContext)_localctx).p_3_4 = expr(0);
				setState(251);
				match(Surrogate_id_SYMB_30);
				setState(252);
				((LetContext)_localctx).p_3_6 = type(0);
				 ((LetContext)_localctx).result =  new hardtyped.Absyn.LetAscription(((LetContext)_localctx).p_3_2.result,((LetContext)_localctx).p_3_4.result,((LetContext)_localctx).p_3_6.result); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				match(Surrogate_id_SYMB_33);
				setState(256);
				((LetContext)_localctx).p_4_2 = varDec();
				setState(257);
				match(Surrogate_id_SYMB_20);
				setState(258);
				((LetContext)_localctx).p_4_4 = expr(0);
				 ((LetContext)_localctx).result =  new hardtyped.Absyn.LetRec(((LetContext)_localctx).p_4_2.result,((LetContext)_localctx).p_4_4.result); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(261);
				match(Surrogate_id_SYMB_34);
				setState(262);
				((LetContext)_localctx).p_5_2 = varDec();
				setState(263);
				match(Surrogate_id_SYMB_20);
				setState(264);
				((LetContext)_localctx).p_5_4 = type(0);
				 ((LetContext)_localctx).result =  new hardtyped.Absyn.LetType(((LetContext)_localctx).p_5_2.result,((LetContext)_localctx).p_5_4.result); 
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

	public static class ValueContext extends ParserRuleContext {
		public hardtyped.Absyn.Value result;
		public Token p_1_1;
		public Token p_2_1;
		public Token p_3_1;
		public Token p_4_1;
		public Token p_5_1;
		public RecordContext p_6_2;
		public TerminalNode INTEGER() { return getToken(hardtypedParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(hardtypedParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(hardtypedParser.STRING, 0); }
		public TerminalNode Bool() { return getToken(hardtypedParser.Bool, 0); }
		public TerminalNode Unit() { return getToken(hardtypedParser.Unit, 0); }
		public TerminalNode Surrogate_id_SYMB_3() { return getToken(hardtypedParser.Surrogate_id_SYMB_3, 0); }
		public TerminalNode Surrogate_id_SYMB_4() { return getToken(hardtypedParser.Surrogate_id_SYMB_4, 0); }
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				((ValueContext)_localctx).p_1_1 = match(INTEGER);
				 ((ValueContext)_localctx).result =  new hardtyped.Absyn.IntValue(Integer.parseInt(((ValueContext)_localctx).p_1_1.getText())); 
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				((ValueContext)_localctx).p_2_1 = match(DOUBLE);
				 ((ValueContext)_localctx).result =  new hardtyped.Absyn.RealValue(Double.parseDouble(((ValueContext)_localctx).p_2_1.getText())); 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				((ValueContext)_localctx).p_3_1 = match(STRING);
				 ((ValueContext)_localctx).result =  new hardtyped.Absyn.StringValue(((ValueContext)_localctx).p_3_1.getText().substring(1, ((ValueContext)_localctx).p_3_1.getText().length()-1)); 
				}
				break;
			case Bool:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				((ValueContext)_localctx).p_4_1 = match(Bool);
				 ((ValueContext)_localctx).result =  new hardtyped.Absyn.BoolValue(((ValueContext)_localctx).p_4_1.getText()); 
				}
				break;
			case Unit:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				((ValueContext)_localctx).p_5_1 = match(Unit);
				 ((ValueContext)_localctx).result =  new hardtyped.Absyn.UnitValue(((ValueContext)_localctx).p_5_1.getText()); 
				}
				break;
			case Surrogate_id_SYMB_3:
				enterOuterAlt(_localctx, 6);
				{
				setState(279);
				match(Surrogate_id_SYMB_3);
				setState(280);
				((ValueContext)_localctx).p_6_2 = record(0);
				setState(281);
				match(Surrogate_id_SYMB_4);
				 ((ValueContext)_localctx).result =  new hardtyped.Absyn.RecordConstr(((ValueContext)_localctx).p_6_2.result); 
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

	public static class RecordContext extends ParserRuleContext {
		public hardtyped.Absyn.Record result;
		public RecordContext p_3_1;
		public VarDecContext p_1_1;
		public ValueContext p_1_3;
		public VarDecContext p_2_1;
		public RecordContext p_3_3;
		public TerminalNode Surrogate_id_SYMB_20() { return getToken(hardtypedParser.Surrogate_id_SYMB_20, 0); }
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(hardtypedParser.Surrogate_id_SYMB_7, 0); }
		public List<RecordContext> record() {
			return getRuleContexts(RecordContext.class);
		}
		public RecordContext record(int i) {
			return getRuleContext(RecordContext.class,i);
		}
		public RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitRecord(this);
		}
	}

	public final RecordContext record() throws RecognitionException {
		return record(0);
	}

	private RecordContext record(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RecordContext _localctx = new RecordContext(_ctx, _parentState);
		RecordContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_record, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(287);
				((RecordContext)_localctx).p_1_1 = varDec();
				setState(288);
				match(Surrogate_id_SYMB_20);
				setState(289);
				((RecordContext)_localctx).p_1_3 = value();
				 ((RecordContext)_localctx).result =  new hardtyped.Absyn.BaseRecordNameValue(((RecordContext)_localctx).p_1_1.result,((RecordContext)_localctx).p_1_3.result); 
				}
				break;
			case 2:
				{
				setState(292);
				((RecordContext)_localctx).p_2_1 = varDec();
				 ((RecordContext)_localctx).result =  new hardtyped.Absyn.BaseRecordName(((RecordContext)_localctx).p_2_1.result); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RecordContext(_parentctx, _parentState);
					_localctx.p_3_1 = _prevctx;
					_localctx.p_3_1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_record);
					setState(297);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(298);
					match(Surrogate_id_SYMB_7);
					setState(299);
					((RecordContext)_localctx).p_3_3 = record(2);
					 ((RecordContext)_localctx).result =  new hardtyped.Absyn.MultipleRecordValue(((RecordContext)_localctx).p_3_1.result,((RecordContext)_localctx).p_3_3.result); 
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_inExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(308);
			((InExprContext)_localctx).p_3_1 = expr(0);
			 ((InExprContext)_localctx).result =  new hardtyped.Absyn.InnerExpression(((InExprContext)_localctx).p_3_1.result); 
			}
			_ctx.stop = _input.LT(-1);
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(319);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new InExprContext(_parentctx, _parentState);
						_localctx.p_1_1 = _prevctx;
						_localctx.p_1_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_inExpr);
						setState(311);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(312);
						match(Surrogate_id_SYMB_0);
						setState(313);
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
						setState(316);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(317);
						match(Surrogate_id_SYMB_0);
						 ((InExprContext)_localctx).result =  new hardtyped.Absyn.FinalExpression(((InExprContext)_localctx).p_2_1.result); 
						}
						break;
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class InnerExprContext extends ParserRuleContext {
		public hardtyped.Absyn.InnerExpr result;
		public InnerExprContext p_2_1;
		public InnerExprContext p_3_1;
		public ExprContext p_1_1;
		public InnerExprContext p_2_3;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(hardtypedParser.Surrogate_id_SYMB_0, 0); }
		public List<InnerExprContext> innerExpr() {
			return getRuleContexts(InnerExprContext.class);
		}
		public InnerExprContext innerExpr(int i) {
			return getRuleContext(InnerExprContext.class,i);
		}
		public InnerExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterInnerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitInnerExpr(this);
		}
	}

	public final InnerExprContext innerExpr() throws RecognitionException {
		return innerExpr(0);
	}

	private InnerExprContext innerExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InnerExprContext _localctx = new InnerExprContext(_ctx, _parentState);
		InnerExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_innerExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(325);
			((InnerExprContext)_localctx).p_1_1 = expr(0);
			 ((InnerExprContext)_localctx).result =  new hardtyped.Absyn.BaseInnerExpression(((InnerExprContext)_localctx).p_1_1.result); 
			}
			_ctx.stop = _input.LT(-1);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(336);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new InnerExprContext(_parentctx, _parentState);
						_localctx.p_2_1 = _prevctx;
						_localctx.p_2_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_innerExpr);
						setState(328);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(329);
						match(Surrogate_id_SYMB_0);
						setState(330);
						((InnerExprContext)_localctx).p_2_3 = innerExpr(3);
						 ((InnerExprContext)_localctx).result =  new hardtyped.Absyn.MultipleInnerExpression(((InnerExprContext)_localctx).p_2_1.result,((InnerExprContext)_localctx).p_2_3.result); 
						}
						break;
					case 2:
						{
						_localctx = new InnerExprContext(_parentctx, _parentState);
						_localctx.p_3_1 = _prevctx;
						_localctx.p_3_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_innerExpr);
						setState(333);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(334);
						match(Surrogate_id_SYMB_0);
						 ((InnerExprContext)_localctx).result =  new hardtyped.Absyn.FinalInnerExpression(((InnerExprContext)_localctx).p_3_1.result); 
						}
						break;
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public TerminalNode Surrogate_id_SYMB_21() { return getToken(hardtypedParser.Surrogate_id_SYMB_21, 0); }
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
		enterRule(_localctx, 34, RULE_funcArg);
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				((FuncArgContext)_localctx).p_1_1 = varDec();
				setState(342);
				match(Surrogate_id_SYMB_21);
				setState(343);
				((FuncArgContext)_localctx).p_1_3 = funcArg();
				 ((FuncArgContext)_localctx).result =  new hardtyped.Absyn.MultipleArgs(((FuncArgContext)_localctx).p_1_1.result,((FuncArgContext)_localctx).p_1_3.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				((FuncArgContext)_localctx).p_2_1 = varDec();
				setState(347);
				match(Surrogate_id_SYMB_21);
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
		public Token p_3_1;
		public Token p_3_3;
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(hardtypedParser.Surrogate_id_SYMB_9, 0); }
		public List<TerminalNode> IDENT() { return getTokens(hardtypedParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(hardtypedParser.IDENT, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_21() { return getToken(hardtypedParser.Surrogate_id_SYMB_21, 0); }
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
		enterRule(_localctx, 36, RULE_varDec);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				((VarDecContext)_localctx).p_1_1 = match(IDENT);
				setState(353);
				match(Surrogate_id_SYMB_9);
				setState(354);
				((VarDecContext)_localctx).p_1_3 = type(0);
				 ((VarDecContext)_localctx).result =  new hardtyped.Absyn.TypedVar(((VarDecContext)_localctx).p_1_1.getText(),((VarDecContext)_localctx).p_1_3.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				((VarDecContext)_localctx).p_2_1 = match(IDENT);
				 ((VarDecContext)_localctx).result =  new hardtyped.Absyn.UntypedVar(((VarDecContext)_localctx).p_2_1.getText()); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				((VarDecContext)_localctx).p_3_1 = match(IDENT);
				setState(360);
				match(Surrogate_id_SYMB_21);
				setState(361);
				((VarDecContext)_localctx).p_3_3 = match(IDENT);
				 ((VarDecContext)_localctx).result =  new hardtyped.Absyn.DotVar(((VarDecContext)_localctx).p_3_1.getText(),((VarDecContext)_localctx).p_3_3.getText()); 
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
		public TypeContext p_7_1;
		public RecordContext p_8_2;
		public TypeContext p_7_3;
		public TerminalNode Surrogate_id_SYMB_25() { return getToken(hardtypedParser.Surrogate_id_SYMB_25, 0); }
		public TerminalNode Surrogate_id_SYMB_26() { return getToken(hardtypedParser.Surrogate_id_SYMB_26, 0); }
		public TerminalNode Surrogate_id_SYMB_24() { return getToken(hardtypedParser.Surrogate_id_SYMB_24, 0); }
		public TerminalNode Surrogate_id_SYMB_27() { return getToken(hardtypedParser.Surrogate_id_SYMB_27, 0); }
		public TerminalNode Surrogate_id_SYMB_28() { return getToken(hardtypedParser.Surrogate_id_SYMB_28, 0); }
		public TerminalNode Surrogate_id_SYMB_23() { return getToken(hardtypedParser.Surrogate_id_SYMB_23, 0); }
		public TerminalNode Surrogate_id_SYMB_3() { return getToken(hardtypedParser.Surrogate_id_SYMB_3, 0); }
		public TerminalNode Surrogate_id_SYMB_4() { return getToken(hardtypedParser.Surrogate_id_SYMB_4, 0); }
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_22() { return getToken(hardtypedParser.Surrogate_id_SYMB_22, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
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
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_25:
				{
				setState(366);
				match(Surrogate_id_SYMB_25);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.IntType(); 
				}
				break;
			case Surrogate_id_SYMB_26:
				{
				setState(368);
				match(Surrogate_id_SYMB_26);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.RealType(); 
				}
				break;
			case Surrogate_id_SYMB_24:
				{
				setState(370);
				match(Surrogate_id_SYMB_24);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.BoolType(); 
				}
				break;
			case Surrogate_id_SYMB_27:
				{
				setState(372);
				match(Surrogate_id_SYMB_27);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.StringType(); 
				}
				break;
			case Surrogate_id_SYMB_28:
				{
				setState(374);
				match(Surrogate_id_SYMB_28);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.UnitType(); 
				}
				break;
			case Surrogate_id_SYMB_23:
				{
				setState(376);
				match(Surrogate_id_SYMB_23);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.AnyType(); 
				}
				break;
			case Surrogate_id_SYMB_3:
				{
				setState(378);
				match(Surrogate_id_SYMB_3);
				setState(379);
				((TypeContext)_localctx).p_8_2 = record(0);
				setState(380);
				match(Surrogate_id_SYMB_4);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.RecordType(((TypeContext)_localctx).p_8_2.result); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					_localctx.p_7_1 = _prevctx;
					_localctx.p_7_1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(385);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(386);
					match(Surrogate_id_SYMB_22);
					setState(387);
					((TypeContext)_localctx).p_7_3 = type(3);
					 ((TypeContext)_localctx).result =  new hardtyped.Absyn.FunctionType(((TypeContext)_localctx).p_7_1.result,((TypeContext)_localctx).p_7_3.result); 
					}
					} 
				}
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 14:
			return record_sempred((RecordContext)_localctx, predIndex);
		case 15:
			return inExpr_sempred((InExprContext)_localctx, predIndex);
		case 16:
			return innerExpr_sempred((InnerExprContext)_localctx, predIndex);
		case 19:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 26);
		}
		return true;
	}
	private boolean record_sempred(RecordContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inExpr_sempred(InExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean innerExpr_sempred(InnerExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u018e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\\\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a3\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00e7\n\r\f\r\16\r\u00ea\13\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u010e\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u011f\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u012a\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u0131\n\20\f\20\16\20\u0134\13\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0142\n\21\f\21\16\21\u0145\13\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0153"+
		"\n\22\f\22\16\22\u0156\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\5\23\u0161\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u016e\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0182\n\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u0189\n\25\f\25\16\25\u018c\13\25\3\25\2\7\30\36 \"(\26"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\2\u01af\2*\3\2\2\2\4"+
		".\3\2\2\2\6\62\3\2\2\2\b\66\3\2\2\2\n:\3\2\2\2\f>\3\2\2\2\16B\3\2\2\2"+
		"\20F\3\2\2\2\22J\3\2\2\2\24N\3\2\2\2\26[\3\2\2\2\30\u00a2\3\2\2\2\32\u010d"+
		"\3\2\2\2\34\u011e\3\2\2\2\36\u0129\3\2\2\2 \u0135\3\2\2\2\"\u0146\3\2"+
		"\2\2$\u0160\3\2\2\2&\u016d\3\2\2\2(\u0181\3\2\2\2*+\5\26\f\2+,\7\2\2\3"+
		",-\b\2\1\2-\3\3\2\2\2./\5\30\r\2/\60\7\2\2\3\60\61\b\3\1\2\61\5\3\2\2"+
		"\2\62\63\5\32\16\2\63\64\7\2\2\3\64\65\b\4\1\2\65\7\3\2\2\2\66\67\5\34"+
		"\17\2\678\7\2\2\389\b\5\1\29\t\3\2\2\2:;\5\36\20\2;<\7\2\2\3<=\b\6\1\2"+
		"=\13\3\2\2\2>?\5 \21\2?@\7\2\2\3@A\b\7\1\2A\r\3\2\2\2BC\5\"\22\2CD\7\2"+
		"\2\3DE\b\b\1\2E\17\3\2\2\2FG\5$\23\2GH\7\2\2\3HI\b\t\1\2I\21\3\2\2\2J"+
		"K\5&\24\2KL\7\2\2\3LM\b\n\1\2M\23\3\2\2\2NO\5(\25\2OP\7\2\2\3PQ\b\13\1"+
		"\2Q\25\3\2\2\2R\\\b\f\1\2ST\5\30\r\2TU\b\f\1\2U\\\3\2\2\2VW\5\30\r\2W"+
		"X\7\3\2\2XY\5\26\f\2YZ\b\f\1\2Z\\\3\2\2\2[R\3\2\2\2[S\3\2\2\2[V\3\2\2"+
		"\2\\\27\3\2\2\2]^\b\r\1\2^_\7\4\2\2_`\5&\24\2`a\b\r\1\2a\u00a3\3\2\2\2"+
		"bc\7\5\2\2cd\5$\23\2de\7\6\2\2ef\5 \21\2fg\7\7\2\2gh\b\r\1\2h\u00a3\3"+
		"\2\2\2ij\7,\2\2jk\7\b\2\2kl\5\30\r\2lm\7\t\2\2mn\b\r\1\2n\u00a3\3\2\2"+
		"\2op\7-\2\2pq\7\b\2\2qr\5\30\r\2rs\7\t\2\2st\b\r\1\2t\u00a3\3\2\2\2uv"+
		"\7,\2\2vw\7\b\2\2wx\7\t\2\2x\u00a3\b\r\1\2yz\7-\2\2z{\7\b\2\2{|\7\t\2"+
		"\2|\u00a3\b\r\1\2}~\7\13\2\2~\177\7\b\2\2\177\u0080\5\30\r\2\u0080\u0081"+
		"\7\t\2\2\u0081\u0082\7\f\2\2\u0082\u0083\5\30\r\26\u0083\u0084\b\r\1\2"+
		"\u0084\u00a3\3\2\2\2\u0085\u0086\7\r\2\2\u0086\u0087\5\30\r\25\u0087\u0088"+
		"\b\r\1\2\u0088\u00a3\3\2\2\2\u0089\u008a\7&\2\2\u008a\u008b\5\30\r\16"+
		"\u008b\u008c\b\r\1\2\u008c\u00a3\3\2\2\2\u008d\u008e\7\16\2\2\u008e\u008f"+
		"\5\30\r\b\u008f\u0090\b\r\1\2\u0090\u00a3\3\2\2\2\u0091\u0092\7\17\2\2"+
		"\u0092\u0093\5\30\r\7\u0093\u0094\b\r\1\2\u0094\u00a3\3\2\2\2\u0095\u0096"+
		"\5\32\16\2\u0096\u0097\b\r\1\2\u0097\u00a3\3\2\2\2\u0098\u0099\5\34\17"+
		"\2\u0099\u009a\b\r\1\2\u009a\u00a3\3\2\2\2\u009b\u009c\7\60\2\2\u009c"+
		"\u00a3\b\r\1\2\u009d\u009e\7\b\2\2\u009e\u009f\5\"\22\2\u009f\u00a0\7"+
		"\t\2\2\u00a0\u00a1\b\r\1\2\u00a1\u00a3\3\2\2\2\u00a2]\3\2\2\2\u00a2b\3"+
		"\2\2\2\u00a2i\3\2\2\2\u00a2o\3\2\2\2\u00a2u\3\2\2\2\u00a2y\3\2\2\2\u00a2"+
		"}\3\2\2\2\u00a2\u0085\3\2\2\2\u00a2\u0089\3\2\2\2\u00a2\u008d\3\2\2\2"+
		"\u00a2\u0091\3\2\2\2\u00a2\u0095\3\2\2\2\u00a2\u0098\3\2\2\2\u00a2\u009b"+
		"\3\2\2\2\u00a2\u009d\3\2\2\2\u00a3\u00e8\3\2\2\2\u00a4\u00a5\f\27\2\2"+
		"\u00a5\u00a6\7\n\2\2\u00a6\u00a7\5\30\r\30\u00a7\u00a8\b\r\1\2\u00a8\u00e7"+
		"\3\2\2\2\u00a9\u00aa\f\24\2\2\u00aa\u00ab\7\16\2\2\u00ab\u00ac\5\30\r"+
		"\25\u00ac\u00ad\b\r\1\2\u00ad\u00e7\3\2\2\2\u00ae\u00af\f\23\2\2\u00af"+
		"\u00b0\7\17\2\2\u00b0\u00b1\5\30\r\24\u00b1\u00b2\b\r\1\2\u00b2\u00e7"+
		"\3\2\2\2\u00b3\u00b4\f\22\2\2\u00b4\u00b5\7\20\2\2\u00b5\u00b6\5\30\r"+
		"\23\u00b6\u00b7\b\r\1\2\u00b7\u00e7\3\2\2\2\u00b8\u00b9\f\21\2\2\u00b9"+
		"\u00ba\7\21\2\2\u00ba\u00bb\5\30\r\22\u00bb\u00bc\b\r\1\2\u00bc\u00e7"+
		"\3\2\2\2\u00bd\u00be\f\20\2\2\u00be\u00bf\7 \2\2\u00bf\u00c0\5\30\r\21"+
		"\u00c0\u00c1\b\r\1\2\u00c1\u00e7\3\2\2\2\u00c2\u00c3\f\17\2\2\u00c3\u00c4"+
		"\7\'\2\2\u00c4\u00c5\5\30\r\20\u00c5\u00c6\b\r\1\2\u00c6\u00e7\3\2\2\2"+
		"\u00c7\u00c8\f\r\2\2\u00c8\u00c9\7\22\2\2\u00c9\u00ca\5\30\r\16\u00ca"+
		"\u00cb\b\r\1\2\u00cb\u00e7\3\2\2\2\u00cc\u00cd\f\f\2\2\u00cd\u00ce\7\23"+
		"\2\2\u00ce\u00cf\5\30\r\r\u00cf\u00d0\b\r\1\2\u00d0\u00e7\3\2\2\2\u00d1"+
		"\u00d2\f\13\2\2\u00d2\u00d3\7\24\2\2\u00d3\u00d4\5\30\r\f\u00d4\u00d5"+
		"\b\r\1\2\u00d5\u00e7\3\2\2\2\u00d6\u00d7\f\n\2\2\u00d7\u00d8\7\25\2\2"+
		"\u00d8\u00d9\5\30\r\13\u00d9\u00da\b\r\1\2\u00da\u00e7\3\2\2\2\u00db\u00dc"+
		"\f\t\2\2\u00dc\u00dd\7\26\2\2\u00dd\u00de\5\30\r\n\u00de\u00df\b\r\1\2"+
		"\u00df\u00e7\3\2\2\2\u00e0\u00e1\f\34\2\2\u00e1\u00e2\7\b\2\2\u00e2\u00e3"+
		"\5\30\r\2\u00e3\u00e4\7\t\2\2\u00e4\u00e5\b\r\1\2\u00e5\u00e7\3\2\2\2"+
		"\u00e6\u00a4\3\2\2\2\u00e6\u00a9\3\2\2\2\u00e6\u00ae\3\2\2\2\u00e6\u00b3"+
		"\3\2\2\2\u00e6\u00b8\3\2\2\2\u00e6\u00bd\3\2\2\2\u00e6\u00c2\3\2\2\2\u00e6"+
		"\u00c7\3\2\2\2\u00e6\u00cc\3\2\2\2\u00e6\u00d1\3\2\2\2\u00e6\u00d6\3\2"+
		"\2\2\u00e6\u00db\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\31\3\2\2\2\u00ea\u00e8\3\2\2"+
		"\2\u00eb\u00ec\7#\2\2\u00ec\u00ed\5&\24\2\u00ed\u00ee\7\27\2\2\u00ee\u00ef"+
		"\5\30\r\2\u00ef\u00f0\b\16\1\2\u00f0\u010e\3\2\2\2\u00f1\u00f2\7#\2\2"+
		"\u00f2\u00f3\5&\24\2\u00f3\u00f4\7\27\2\2\u00f4\u00f5\5\30\r\2\u00f5\u00f6"+
		"\7\"\2\2\u00f6\u00f7\5\30\r\2\u00f7\u00f8\b\16\1\2\u00f8\u010e\3\2\2\2"+
		"\u00f9\u00fa\7#\2\2\u00fa\u00fb\5&\24\2\u00fb\u00fc\7\27\2\2\u00fc\u00fd"+
		"\5\30\r\2\u00fd\u00fe\7!\2\2\u00fe\u00ff\5(\25\2\u00ff\u0100\b\16\1\2"+
		"\u0100\u010e\3\2\2\2\u0101\u0102\7$\2\2\u0102\u0103\5&\24\2\u0103\u0104"+
		"\7\27\2\2\u0104\u0105\5\30\r\2\u0105\u0106\b\16\1\2\u0106\u010e\3\2\2"+
		"\2\u0107\u0108\7%\2\2\u0108\u0109\5&\24\2\u0109\u010a\7\27\2\2\u010a\u010b"+
		"\5(\25\2\u010b\u010c\b\16\1\2\u010c\u010e\3\2\2\2\u010d\u00eb\3\2\2\2"+
		"\u010d\u00f1\3\2\2\2\u010d\u00f9\3\2\2\2\u010d\u0101\3\2\2\2\u010d\u0107"+
		"\3\2\2\2\u010e\33\3\2\2\2\u010f\u0110\7/\2\2\u0110\u011f\b\17\1\2\u0111"+
		"\u0112\7.\2\2\u0112\u011f\b\17\1\2\u0113\u0114\7\63\2\2\u0114\u011f\b"+
		"\17\1\2\u0115\u0116\7*\2\2\u0116\u011f\b\17\1\2\u0117\u0118\7+\2\2\u0118"+
		"\u011f\b\17\1\2\u0119\u011a\7\6\2\2\u011a\u011b\5\36\20\2\u011b\u011c"+
		"\7\7\2\2\u011c\u011d\b\17\1\2\u011d\u011f\3\2\2\2\u011e\u010f\3\2\2\2"+
		"\u011e\u0111\3\2\2\2\u011e\u0113\3\2\2\2\u011e\u0115\3\2\2\2\u011e\u0117"+
		"\3\2\2\2\u011e\u0119\3\2\2\2\u011f\35\3\2\2\2\u0120\u0121\b\20\1\2\u0121"+
		"\u0122\5&\24\2\u0122\u0123\7\27\2\2\u0123\u0124\5\34\17\2\u0124\u0125"+
		"\b\20\1\2\u0125\u012a\3\2\2\2\u0126\u0127\5&\24\2\u0127\u0128\b\20\1\2"+
		"\u0128\u012a\3\2\2\2\u0129\u0120\3\2\2\2\u0129\u0126\3\2\2\2\u012a\u0132"+
		"\3\2\2\2\u012b\u012c\f\3\2\2\u012c\u012d\7\n\2\2\u012d\u012e\5\36\20\4"+
		"\u012e\u012f\b\20\1\2\u012f\u0131\3\2\2\2\u0130\u012b\3\2\2\2\u0131\u0134"+
		"\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\37\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0136\b\21\1\2\u0136\u0137\5\30\r\2\u0137\u0138\b"+
		"\21\1\2\u0138\u0143\3\2\2\2\u0139\u013a\f\5\2\2\u013a\u013b\7\3\2\2\u013b"+
		"\u013c\5 \21\6\u013c\u013d\b\21\1\2\u013d\u0142\3\2\2\2\u013e\u013f\f"+
		"\4\2\2\u013f\u0140\7\3\2\2\u0140\u0142\b\21\1\2\u0141\u0139\3\2\2\2\u0141"+
		"\u013e\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144!\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\b\22\1\2\u0147\u0148"+
		"\5\30\r\2\u0148\u0149\b\22\1\2\u0149\u0154\3\2\2\2\u014a\u014b\f\4\2\2"+
		"\u014b\u014c\7\3\2\2\u014c\u014d\5\"\22\5\u014d\u014e\b\22\1\2\u014e\u0153"+
		"\3\2\2\2\u014f\u0150\f\3\2\2\u0150\u0151\7\3\2\2\u0151\u0153\b\22\1\2"+
		"\u0152\u014a\3\2\2\2\u0152\u014f\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155#\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u0158\5&\24\2\u0158\u0159\7\30\2\2\u0159\u015a\5$\23\2\u015a\u015b\b"+
		"\23\1\2\u015b\u0161\3\2\2\2\u015c\u015d\5&\24\2\u015d\u015e\7\30\2\2\u015e"+
		"\u015f\b\23\1\2\u015f\u0161\3\2\2\2\u0160\u0157\3\2\2\2\u0160\u015c\3"+
		"\2\2\2\u0161%\3\2\2\2\u0162\u0163\7\60\2\2\u0163\u0164\7\f\2\2\u0164\u0165"+
		"\5(\25\2\u0165\u0166\b\24\1\2\u0166\u016e\3\2\2\2\u0167\u0168\7\60\2\2"+
		"\u0168\u016e\b\24\1\2\u0169\u016a\7\60\2\2\u016a\u016b\7\30\2\2\u016b"+
		"\u016c\7\60\2\2\u016c\u016e\b\24\1\2\u016d\u0162\3\2\2\2\u016d\u0167\3"+
		"\2\2\2\u016d\u0169\3\2\2\2\u016e\'\3\2\2\2\u016f\u0170\b\25\1\2\u0170"+
		"\u0171\7\34\2\2\u0171\u0182\b\25\1\2\u0172\u0173\7\35\2\2\u0173\u0182"+
		"\b\25\1\2\u0174\u0175\7\33\2\2\u0175\u0182\b\25\1\2\u0176\u0177\7\36\2"+
		"\2\u0177\u0182\b\25\1\2\u0178\u0179\7\37\2\2\u0179\u0182\b\25\1\2\u017a"+
		"\u017b\7\32\2\2\u017b\u0182\b\25\1\2\u017c\u017d\7\6\2\2\u017d\u017e\5"+
		"\36\20\2\u017e\u017f\7\7\2\2\u017f\u0180\b\25\1\2\u0180\u0182\3\2\2\2"+
		"\u0181\u016f\3\2\2\2\u0181\u0172\3\2\2\2\u0181\u0174\3\2\2\2\u0181\u0176"+
		"\3\2\2\2\u0181\u0178\3\2\2\2\u0181\u017a\3\2\2\2\u0181\u017c\3\2\2\2\u0182"+
		"\u018a\3\2\2\2\u0183\u0184\f\4\2\2\u0184\u0185\7\31\2\2\u0185\u0186\5"+
		"(\25\5\u0186\u0187\b\25\1\2\u0187\u0189\3\2\2\2\u0188\u0183\3\2\2\2\u0189"+
		"\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b)\3\2\2\2"+
		"\u018c\u018a\3\2\2\2\22[\u00a2\u00e6\u00e8\u010d\u011e\u0129\u0132\u0141"+
		"\u0143\u0152\u0154\u0160\u016d\u0181\u018a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}