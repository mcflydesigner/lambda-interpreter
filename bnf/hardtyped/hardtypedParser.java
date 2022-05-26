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
		Surrogate_id_SYMB_35=36, Surrogate_id_SYMB_36=37, Surrogate_id_SYMB_37=38, 
		COMMENT_antlr_builtin=39, MULTICOMMENT_antlr_builtin=40, Bool=41, Unit=42, 
		DOUBLE=43, INTEGER=44, IDENT=45, WS=46, ErrorToken=47, STRING=48, STRINGESC=49;
	public static final int
		RULE_start_ListExpr = 0, RULE_start_Expr = 1, RULE_start_Expr1 = 2, RULE_start_Expr2 = 3, 
		RULE_start_Expr3 = 4, RULE_start_Expr4 = 5, RULE_start_Expr5 = 6, RULE_start_VarDec = 7, 
		RULE_start_ExprSequence = 8, RULE_start_ListExprSequence = 9, RULE_start_FuncArg = 10, 
		RULE_start_ListFuncArg = 11, RULE_start_IfExpr = 12, RULE_start_ListIfExpr = 13, 
		RULE_start_ElseExpr = 14, RULE_start_Op = 15, RULE_start_Op1 = 16, RULE_start_Op2 = 17, 
		RULE_start_Op3 = 18, RULE_start_Op4 = 19, RULE_start_Op5 = 20, RULE_start_Op6 = 21, 
		RULE_start_RecordElem = 22, RULE_start_ListRecordElem = 23, RULE_start_Type = 24, 
		RULE_start_Type1 = 25, RULE_start_Type2 = 26, RULE_start_Type3 = 27, RULE_start_RecordElemType = 28, 
		RULE_start_ListRecordElemType = 29, RULE_listExpr = 30, RULE_expr = 31, 
		RULE_expr1 = 32, RULE_expr2 = 33, RULE_expr3 = 34, RULE_expr4 = 35, RULE_expr5 = 36, 
		RULE_varDec = 37, RULE_exprSequence = 38, RULE_listExprSequence = 39, 
		RULE_funcArg = 40, RULE_listFuncArg = 41, RULE_ifExpr = 42, RULE_listIfExpr = 43, 
		RULE_elseExpr = 44, RULE_op = 45, RULE_op1 = 46, RULE_op2 = 47, RULE_op3 = 48, 
		RULE_op4 = 49, RULE_op5 = 50, RULE_op6 = 51, RULE_recordElem = 52, RULE_listRecordElem = 53, 
		RULE_type = 54, RULE_type1 = 55, RULE_type2 = 56, RULE_type3 = 57, RULE_recordElemType = 58, 
		RULE_listRecordElemType = 59;
	public static final String[] ruleNames = {
		"start_ListExpr", "start_Expr", "start_Expr1", "start_Expr2", "start_Expr3", 
		"start_Expr4", "start_Expr5", "start_VarDec", "start_ExprSequence", "start_ListExprSequence", 
		"start_FuncArg", "start_ListFuncArg", "start_IfExpr", "start_ListIfExpr", 
		"start_ElseExpr", "start_Op", "start_Op1", "start_Op2", "start_Op3", "start_Op4", 
		"start_Op5", "start_Op6", "start_RecordElem", "start_ListRecordElem", 
		"start_Type", "start_Type1", "start_Type2", "start_Type3", "start_RecordElemType", 
		"start_ListRecordElemType", "listExpr", "expr", "expr1", "expr2", "expr3", 
		"expr4", "expr5", "varDec", "exprSequence", "listExprSequence", "funcArg", 
		"listFuncArg", "ifExpr", "listIfExpr", "elseExpr", "op", "op1", "op2", 
		"op3", "op4", "op5", "op6", "recordElem", "listRecordElem", "type", "type1", 
		"type2", "type3", "recordElemType", "listRecordElemType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'-|'", "'='", "':'", "'/\\'", "'{'", "'}'", 
		"'->'", "'.'", "','", "'|'", "'|:'", "'+'", "'-'", "'*'", "'/'", "'>'", 
		"'>='", "'=='", "'!='", "'<='", "'<'", "'Any'", "'Bool'", "'Int'", "'Real'", 
		"'String'", "'Unit'", "'and'", "'as'", "'in'", "'let'", "'letrec'", "'lettype'", 
		"'not'", "'or'", null, null, null, null, null, null, null, null, null, 
		"'\"'", "'\\'"
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
		"Surrogate_id_SYMB_35", "Surrogate_id_SYMB_36", "Surrogate_id_SYMB_37", 
		"COMMENT_antlr_builtin", "MULTICOMMENT_antlr_builtin", "Bool", "Unit", 
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
			setState(120);
			((Start_ListExprContext)_localctx).x = listExpr();
			setState(121);
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
			setState(124);
			((Start_ExprContext)_localctx).x = expr();
			setState(125);
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

	public static class Start_Expr1Context extends ParserRuleContext {
		public hardtyped.Absyn.Expr result;
		public Expr1Context x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Start_Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Expr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Expr1(this);
		}
	}

	public final Start_Expr1Context start_Expr1() throws RecognitionException {
		Start_Expr1Context _localctx = new Start_Expr1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_start_Expr1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			((Start_Expr1Context)_localctx).x = expr1();
			setState(129);
			match(EOF);
			 ((Start_Expr1Context)_localctx).result =  ((Start_Expr1Context)_localctx).x.result; 
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

	public static class Start_Expr2Context extends ParserRuleContext {
		public hardtyped.Absyn.Expr result;
		public Expr2Context x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Start_Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Expr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Expr2(this);
		}
	}

	public final Start_Expr2Context start_Expr2() throws RecognitionException {
		Start_Expr2Context _localctx = new Start_Expr2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_start_Expr2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			((Start_Expr2Context)_localctx).x = expr2();
			setState(133);
			match(EOF);
			 ((Start_Expr2Context)_localctx).result =  ((Start_Expr2Context)_localctx).x.result; 
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

	public static class Start_Expr3Context extends ParserRuleContext {
		public hardtyped.Absyn.Expr result;
		public Expr3Context x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Start_Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Expr3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Expr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Expr3(this);
		}
	}

	public final Start_Expr3Context start_Expr3() throws RecognitionException {
		Start_Expr3Context _localctx = new Start_Expr3Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_start_Expr3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((Start_Expr3Context)_localctx).x = expr3();
			setState(137);
			match(EOF);
			 ((Start_Expr3Context)_localctx).result =  ((Start_Expr3Context)_localctx).x.result; 
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

	public static class Start_Expr4Context extends ParserRuleContext {
		public hardtyped.Absyn.Expr result;
		public Expr4Context x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public Start_Expr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Expr4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Expr4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Expr4(this);
		}
	}

	public final Start_Expr4Context start_Expr4() throws RecognitionException {
		Start_Expr4Context _localctx = new Start_Expr4Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_start_Expr4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((Start_Expr4Context)_localctx).x = expr4(0);
			setState(141);
			match(EOF);
			 ((Start_Expr4Context)_localctx).result =  ((Start_Expr4Context)_localctx).x.result; 
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

	public static class Start_Expr5Context extends ParserRuleContext {
		public hardtyped.Absyn.Expr result;
		public Expr5Context x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public Expr5Context expr5() {
			return getRuleContext(Expr5Context.class,0);
		}
		public Start_Expr5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Expr5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Expr5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Expr5(this);
		}
	}

	public final Start_Expr5Context start_Expr5() throws RecognitionException {
		Start_Expr5Context _localctx = new Start_Expr5Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_start_Expr5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			((Start_Expr5Context)_localctx).x = expr5();
			setState(145);
			match(EOF);
			 ((Start_Expr5Context)_localctx).result =  ((Start_Expr5Context)_localctx).x.result; 
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
		enterRule(_localctx, 14, RULE_start_VarDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((Start_VarDecContext)_localctx).x = varDec();
			setState(149);
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

	public static class Start_ExprSequenceContext extends ParserRuleContext {
		public hardtyped.Absyn.ExprSequence result;
		public ExprSequenceContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public ExprSequenceContext exprSequence() {
			return getRuleContext(ExprSequenceContext.class,0);
		}
		public Start_ExprSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ExprSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_ExprSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_ExprSequence(this);
		}
	}

	public final Start_ExprSequenceContext start_ExprSequence() throws RecognitionException {
		Start_ExprSequenceContext _localctx = new Start_ExprSequenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_start_ExprSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			((Start_ExprSequenceContext)_localctx).x = exprSequence();
			setState(153);
			match(EOF);
			 ((Start_ExprSequenceContext)_localctx).result =  ((Start_ExprSequenceContext)_localctx).x.result; 
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

	public static class Start_ListExprSequenceContext extends ParserRuleContext {
		public hardtyped.Absyn.ListExprSequence result;
		public ListExprSequenceContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public ListExprSequenceContext listExprSequence() {
			return getRuleContext(ListExprSequenceContext.class,0);
		}
		public Start_ListExprSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListExprSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_ListExprSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_ListExprSequence(this);
		}
	}

	public final Start_ListExprSequenceContext start_ListExprSequence() throws RecognitionException {
		Start_ListExprSequenceContext _localctx = new Start_ListExprSequenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_start_ListExprSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			((Start_ListExprSequenceContext)_localctx).x = listExprSequence();
			setState(157);
			match(EOF);
			 ((Start_ListExprSequenceContext)_localctx).result =  ((Start_ListExprSequenceContext)_localctx).x.result; 
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
		enterRule(_localctx, 20, RULE_start_FuncArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			((Start_FuncArgContext)_localctx).x = funcArg();
			setState(161);
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

	public static class Start_ListFuncArgContext extends ParserRuleContext {
		public hardtyped.Absyn.ListFuncArg result;
		public ListFuncArgContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public ListFuncArgContext listFuncArg() {
			return getRuleContext(ListFuncArgContext.class,0);
		}
		public Start_ListFuncArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListFuncArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_ListFuncArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_ListFuncArg(this);
		}
	}

	public final Start_ListFuncArgContext start_ListFuncArg() throws RecognitionException {
		Start_ListFuncArgContext _localctx = new Start_ListFuncArgContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_start_ListFuncArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((Start_ListFuncArgContext)_localctx).x = listFuncArg();
			setState(165);
			match(EOF);
			 ((Start_ListFuncArgContext)_localctx).result =  ((Start_ListFuncArgContext)_localctx).x.result; 
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

	public static class Start_IfExprContext extends ParserRuleContext {
		public hardtyped.Absyn.IfExpr result;
		public IfExprContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public Start_IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_IfExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_IfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_IfExpr(this);
		}
	}

	public final Start_IfExprContext start_IfExpr() throws RecognitionException {
		Start_IfExprContext _localctx = new Start_IfExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_start_IfExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			((Start_IfExprContext)_localctx).x = ifExpr();
			setState(169);
			match(EOF);
			 ((Start_IfExprContext)_localctx).result =  ((Start_IfExprContext)_localctx).x.result; 
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

	public static class Start_ListIfExprContext extends ParserRuleContext {
		public hardtyped.Absyn.ListIfExpr result;
		public ListIfExprContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public ListIfExprContext listIfExpr() {
			return getRuleContext(ListIfExprContext.class,0);
		}
		public Start_ListIfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListIfExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_ListIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_ListIfExpr(this);
		}
	}

	public final Start_ListIfExprContext start_ListIfExpr() throws RecognitionException {
		Start_ListIfExprContext _localctx = new Start_ListIfExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_start_ListIfExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((Start_ListIfExprContext)_localctx).x = listIfExpr();
			setState(173);
			match(EOF);
			 ((Start_ListIfExprContext)_localctx).result =  ((Start_ListIfExprContext)_localctx).x.result; 
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

	public static class Start_ElseExprContext extends ParserRuleContext {
		public hardtyped.Absyn.ElseExpr result;
		public ElseExprContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public ElseExprContext elseExpr() {
			return getRuleContext(ElseExprContext.class,0);
		}
		public Start_ElseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ElseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_ElseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_ElseExpr(this);
		}
	}

	public final Start_ElseExprContext start_ElseExpr() throws RecognitionException {
		Start_ElseExprContext _localctx = new Start_ElseExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_start_ElseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			((Start_ElseExprContext)_localctx).x = elseExpr();
			setState(177);
			match(EOF);
			 ((Start_ElseExprContext)_localctx).result =  ((Start_ElseExprContext)_localctx).x.result; 
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

	public static class Start_OpContext extends ParserRuleContext {
		public hardtyped.Absyn.Op result;
		public OpContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public Start_OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Op(this);
		}
	}

	public final Start_OpContext start_Op() throws RecognitionException {
		Start_OpContext _localctx = new Start_OpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_start_Op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			((Start_OpContext)_localctx).x = op();
			setState(181);
			match(EOF);
			 ((Start_OpContext)_localctx).result =  ((Start_OpContext)_localctx).x.result; 
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

	public static class Start_Op1Context extends ParserRuleContext {
		public hardtyped.Absyn.Op result;
		public Op1Context x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public Op1Context op1() {
			return getRuleContext(Op1Context.class,0);
		}
		public Start_Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Op1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Op1(this);
		}
	}

	public final Start_Op1Context start_Op1() throws RecognitionException {
		Start_Op1Context _localctx = new Start_Op1Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_start_Op1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			((Start_Op1Context)_localctx).x = op1();
			setState(185);
			match(EOF);
			 ((Start_Op1Context)_localctx).result =  ((Start_Op1Context)_localctx).x.result; 
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

	public static class Start_Op2Context extends ParserRuleContext {
		public hardtyped.Absyn.Op result;
		public Op2Context x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public Op2Context op2() {
			return getRuleContext(Op2Context.class,0);
		}
		public Start_Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Op2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Op2(this);
		}
	}

	public final Start_Op2Context start_Op2() throws RecognitionException {
		Start_Op2Context _localctx = new Start_Op2Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_start_Op2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			((Start_Op2Context)_localctx).x = op2();
			setState(189);
			match(EOF);
			 ((Start_Op2Context)_localctx).result =  ((Start_Op2Context)_localctx).x.result; 
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

	public static class Start_Op3Context extends ParserRuleContext {
		public hardtyped.Absyn.Op result;
		public Op3Context x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public Op3Context op3() {
			return getRuleContext(Op3Context.class,0);
		}
		public Start_Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Op3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Op3(this);
		}
	}

	public final Start_Op3Context start_Op3() throws RecognitionException {
		Start_Op3Context _localctx = new Start_Op3Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_start_Op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((Start_Op3Context)_localctx).x = op3();
			setState(193);
			match(EOF);
			 ((Start_Op3Context)_localctx).result =  ((Start_Op3Context)_localctx).x.result; 
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

	public static class Start_Op4Context extends ParserRuleContext {
		public hardtyped.Absyn.Op result;
		public Op4Context x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public Op4Context op4() {
			return getRuleContext(Op4Context.class,0);
		}
		public Start_Op4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Op4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Op4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Op4(this);
		}
	}

	public final Start_Op4Context start_Op4() throws RecognitionException {
		Start_Op4Context _localctx = new Start_Op4Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_start_Op4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			((Start_Op4Context)_localctx).x = op4();
			setState(197);
			match(EOF);
			 ((Start_Op4Context)_localctx).result =  ((Start_Op4Context)_localctx).x.result; 
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

	public static class Start_Op5Context extends ParserRuleContext {
		public hardtyped.Absyn.Op result;
		public Op5Context x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public Op5Context op5() {
			return getRuleContext(Op5Context.class,0);
		}
		public Start_Op5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Op5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Op5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Op5(this);
		}
	}

	public final Start_Op5Context start_Op5() throws RecognitionException {
		Start_Op5Context _localctx = new Start_Op5Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_start_Op5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			((Start_Op5Context)_localctx).x = op5();
			setState(201);
			match(EOF);
			 ((Start_Op5Context)_localctx).result =  ((Start_Op5Context)_localctx).x.result; 
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

	public static class Start_Op6Context extends ParserRuleContext {
		public hardtyped.Absyn.Op result;
		public Op6Context x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public Op6Context op6() {
			return getRuleContext(Op6Context.class,0);
		}
		public Start_Op6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Op6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Op6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Op6(this);
		}
	}

	public final Start_Op6Context start_Op6() throws RecognitionException {
		Start_Op6Context _localctx = new Start_Op6Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_start_Op6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			((Start_Op6Context)_localctx).x = op6();
			setState(205);
			match(EOF);
			 ((Start_Op6Context)_localctx).result =  ((Start_Op6Context)_localctx).x.result; 
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

	public static class Start_RecordElemContext extends ParserRuleContext {
		public hardtyped.Absyn.RecordElem result;
		public RecordElemContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public RecordElemContext recordElem() {
			return getRuleContext(RecordElemContext.class,0);
		}
		public Start_RecordElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_RecordElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_RecordElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_RecordElem(this);
		}
	}

	public final Start_RecordElemContext start_RecordElem() throws RecognitionException {
		Start_RecordElemContext _localctx = new Start_RecordElemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_start_RecordElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			((Start_RecordElemContext)_localctx).x = recordElem();
			setState(209);
			match(EOF);
			 ((Start_RecordElemContext)_localctx).result =  ((Start_RecordElemContext)_localctx).x.result; 
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

	public static class Start_ListRecordElemContext extends ParserRuleContext {
		public hardtyped.Absyn.ListRecordElem result;
		public ListRecordElemContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public ListRecordElemContext listRecordElem() {
			return getRuleContext(ListRecordElemContext.class,0);
		}
		public Start_ListRecordElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListRecordElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_ListRecordElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_ListRecordElem(this);
		}
	}

	public final Start_ListRecordElemContext start_ListRecordElem() throws RecognitionException {
		Start_ListRecordElemContext _localctx = new Start_ListRecordElemContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_start_ListRecordElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			((Start_ListRecordElemContext)_localctx).x = listRecordElem();
			setState(213);
			match(EOF);
			 ((Start_ListRecordElemContext)_localctx).result =  ((Start_ListRecordElemContext)_localctx).x.result; 
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
		enterRule(_localctx, 48, RULE_start_Type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			((Start_TypeContext)_localctx).x = type();
			setState(217);
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

	public static class Start_Type1Context extends ParserRuleContext {
		public hardtyped.Absyn.Type result;
		public Type1Context x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public Type1Context type1() {
			return getRuleContext(Type1Context.class,0);
		}
		public Start_Type1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Type1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Type1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Type1(this);
		}
	}

	public final Start_Type1Context start_Type1() throws RecognitionException {
		Start_Type1Context _localctx = new Start_Type1Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_start_Type1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			((Start_Type1Context)_localctx).x = type1(0);
			setState(221);
			match(EOF);
			 ((Start_Type1Context)_localctx).result =  ((Start_Type1Context)_localctx).x.result; 
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

	public static class Start_Type2Context extends ParserRuleContext {
		public hardtyped.Absyn.Type result;
		public Type2Context x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public Type2Context type2() {
			return getRuleContext(Type2Context.class,0);
		}
		public Start_Type2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Type2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Type2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Type2(this);
		}
	}

	public final Start_Type2Context start_Type2() throws RecognitionException {
		Start_Type2Context _localctx = new Start_Type2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_start_Type2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			((Start_Type2Context)_localctx).x = type2();
			setState(225);
			match(EOF);
			 ((Start_Type2Context)_localctx).result =  ((Start_Type2Context)_localctx).x.result; 
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

	public static class Start_Type3Context extends ParserRuleContext {
		public hardtyped.Absyn.Type result;
		public Type3Context x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public Type3Context type3() {
			return getRuleContext(Type3Context.class,0);
		}
		public Start_Type3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Type3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Type3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Type3(this);
		}
	}

	public final Start_Type3Context start_Type3() throws RecognitionException {
		Start_Type3Context _localctx = new Start_Type3Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_start_Type3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			((Start_Type3Context)_localctx).x = type3();
			setState(229);
			match(EOF);
			 ((Start_Type3Context)_localctx).result =  ((Start_Type3Context)_localctx).x.result; 
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

	public static class Start_RecordElemTypeContext extends ParserRuleContext {
		public hardtyped.Absyn.RecordElemType result;
		public RecordElemTypeContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public RecordElemTypeContext recordElemType() {
			return getRuleContext(RecordElemTypeContext.class,0);
		}
		public Start_RecordElemTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_RecordElemType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_RecordElemType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_RecordElemType(this);
		}
	}

	public final Start_RecordElemTypeContext start_RecordElemType() throws RecognitionException {
		Start_RecordElemTypeContext _localctx = new Start_RecordElemTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_start_RecordElemType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			((Start_RecordElemTypeContext)_localctx).x = recordElemType();
			setState(233);
			match(EOF);
			 ((Start_RecordElemTypeContext)_localctx).result =  ((Start_RecordElemTypeContext)_localctx).x.result; 
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

	public static class Start_ListRecordElemTypeContext extends ParserRuleContext {
		public hardtyped.Absyn.ListRecordElemType result;
		public ListRecordElemTypeContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public ListRecordElemTypeContext listRecordElemType() {
			return getRuleContext(ListRecordElemTypeContext.class,0);
		}
		public Start_ListRecordElemTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListRecordElemType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_ListRecordElemType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_ListRecordElemType(this);
		}
	}

	public final Start_ListRecordElemTypeContext start_ListRecordElemType() throws RecognitionException {
		Start_ListRecordElemTypeContext _localctx = new Start_ListRecordElemTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_start_ListRecordElemType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			((Start_ListRecordElemTypeContext)_localctx).x = listRecordElemType();
			setState(237);
			match(EOF);
			 ((Start_ListRecordElemTypeContext)_localctx).result =  ((Start_ListRecordElemTypeContext)_localctx).x.result; 
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
		public ExprContext p_1_1;
		public ExprContext p_2_1;
		public ListExprContext p_2_3;
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(hardtypedParser.Surrogate_id_SYMB_0, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 60, RULE_listExpr);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				((ListExprContext)_localctx).p_1_1 = expr();
				setState(241);
				match(Surrogate_id_SYMB_0);
				 ((ListExprContext)_localctx).result =  new hardtyped.Absyn.ListExpr(); _localctx.result.addLast(((ListExprContext)_localctx).p_1_1.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				((ListExprContext)_localctx).p_2_1 = expr();
				setState(245);
				match(Surrogate_id_SYMB_0);
				setState(246);
				((ListExprContext)_localctx).p_2_3 = listExpr();
				 ((ListExprContext)_localctx).result =  ((ListExprContext)_localctx).p_2_3.result; _localctx.result.addFirst(((ListExprContext)_localctx).p_2_1.result); 
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
		public Expr1Context p_1_1;
		public Token p_2_2;
		public Token p_2_4;
		public Token p_3_2;
		public VarDecContext p_4_2;
		public Expr1Context p_4_4;
		public VarDecContext p_5_2;
		public Expr1Context p_5_4;
		public Expr1Context p_5_6;
		public VarDecContext p_6_2;
		public Expr1Context p_6_4;
		public VarDecContext p_7_2;
		public Expr1Context p_7_4;
		public Expr1Context p_7_6;
		public VarDecContext p_8_2;
		public TypeContext p_8_4;
		public VarDecContext p_9_2;
		public TypeContext p_9_4;
		public Expr1Context p_9_6;
		public ListIfExprContext p_10_1;
		public ElseExprContext p_10_2;
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode Surrogate_id_SYMB_3() { return getToken(hardtypedParser.Surrogate_id_SYMB_3, 0); }
		public TerminalNode Surrogate_id_SYMB_31() { return getToken(hardtypedParser.Surrogate_id_SYMB_31, 0); }
		public TerminalNode STRING() { return getToken(hardtypedParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(hardtypedParser.IDENT, 0); }
		public TerminalNode Surrogate_id_SYMB_33() { return getToken(hardtypedParser.Surrogate_id_SYMB_33, 0); }
		public TerminalNode Surrogate_id_SYMB_4() { return getToken(hardtypedParser.Surrogate_id_SYMB_4, 0); }
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_32() { return getToken(hardtypedParser.Surrogate_id_SYMB_32, 0); }
		public TerminalNode Surrogate_id_SYMB_34() { return getToken(hardtypedParser.Surrogate_id_SYMB_34, 0); }
		public TerminalNode Surrogate_id_SYMB_35() { return getToken(hardtypedParser.Surrogate_id_SYMB_35, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListIfExprContext listIfExpr() {
			return getRuleContext(ListIfExprContext.class,0);
		}
		public ElseExprContext elseExpr() {
			return getRuleContext(ElseExprContext.class,0);
		}
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
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				((ExprContext)_localctx).p_1_1 = expr1();
				 ((ExprContext)_localctx).result =  ((ExprContext)_localctx).p_1_1.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(Surrogate_id_SYMB_3);
				setState(255);
				((ExprContext)_localctx).p_2_2 = match(STRING);
				setState(256);
				match(Surrogate_id_SYMB_31);
				setState(257);
				((ExprContext)_localctx).p_2_4 = match(IDENT);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Import(((ExprContext)_localctx).p_2_2.getText().substring(1, ((ExprContext)_localctx).p_2_2.getText().length()-1),((ExprContext)_localctx).p_2_4.getText()); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(Surrogate_id_SYMB_3);
				setState(260);
				((ExprContext)_localctx).p_3_2 = match(STRING);
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Import1(((ExprContext)_localctx).p_3_2.getText().substring(1, ((ExprContext)_localctx).p_3_2.getText().length()-1)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				match(Surrogate_id_SYMB_33);
				setState(263);
				((ExprContext)_localctx).p_4_2 = varDec();
				setState(264);
				match(Surrogate_id_SYMB_4);
				setState(265);
				((ExprContext)_localctx).p_4_4 = expr1();
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.LetVariable(((ExprContext)_localctx).p_4_2.result,((ExprContext)_localctx).p_4_4.result); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				match(Surrogate_id_SYMB_33);
				setState(269);
				((ExprContext)_localctx).p_5_2 = varDec();
				setState(270);
				match(Surrogate_id_SYMB_4);
				setState(271);
				((ExprContext)_localctx).p_5_4 = expr1();
				setState(272);
				match(Surrogate_id_SYMB_32);
				setState(273);
				((ExprContext)_localctx).p_5_6 = expr1();
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.LetInference(((ExprContext)_localctx).p_5_2.result,((ExprContext)_localctx).p_5_4.result,((ExprContext)_localctx).p_5_6.result); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(276);
				match(Surrogate_id_SYMB_34);
				setState(277);
				((ExprContext)_localctx).p_6_2 = varDec();
				setState(278);
				match(Surrogate_id_SYMB_4);
				setState(279);
				((ExprContext)_localctx).p_6_4 = expr1();
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.LetRec(((ExprContext)_localctx).p_6_2.result,((ExprContext)_localctx).p_6_4.result); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(282);
				match(Surrogate_id_SYMB_34);
				setState(283);
				((ExprContext)_localctx).p_7_2 = varDec();
				setState(284);
				match(Surrogate_id_SYMB_4);
				setState(285);
				((ExprContext)_localctx).p_7_4 = expr1();
				setState(286);
				match(Surrogate_id_SYMB_32);
				setState(287);
				((ExprContext)_localctx).p_7_6 = expr1();
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.LetRecInference(((ExprContext)_localctx).p_7_2.result,((ExprContext)_localctx).p_7_4.result,((ExprContext)_localctx).p_7_6.result); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(290);
				match(Surrogate_id_SYMB_35);
				setState(291);
				((ExprContext)_localctx).p_8_2 = varDec();
				setState(292);
				match(Surrogate_id_SYMB_4);
				setState(293);
				((ExprContext)_localctx).p_8_4 = type();
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.LetType(((ExprContext)_localctx).p_8_2.result,((ExprContext)_localctx).p_8_4.result); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(296);
				match(Surrogate_id_SYMB_35);
				setState(297);
				((ExprContext)_localctx).p_9_2 = varDec();
				setState(298);
				match(Surrogate_id_SYMB_4);
				setState(299);
				((ExprContext)_localctx).p_9_4 = type();
				setState(300);
				match(Surrogate_id_SYMB_32);
				setState(301);
				((ExprContext)_localctx).p_9_6 = expr1();
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.LetTypeInference(((ExprContext)_localctx).p_9_2.result,((ExprContext)_localctx).p_9_4.result,((ExprContext)_localctx).p_9_6.result); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(304);
				((ExprContext)_localctx).p_10_1 = listIfExpr();
				setState(305);
				((ExprContext)_localctx).p_10_2 = elseExpr();
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.IfStmt(((ExprContext)_localctx).p_10_1.result,((ExprContext)_localctx).p_10_2.result); 
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

	public static class Expr1Context extends ParserRuleContext {
		public hardtyped.Absyn.Expr result;
		public Expr2Context p_1_1;
		public ListFuncArgContext p_2_2;
		public ListExprContext p_2_4;
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_6() { return getToken(hardtypedParser.Surrogate_id_SYMB_6, 0); }
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(hardtypedParser.Surrogate_id_SYMB_7, 0); }
		public TerminalNode Surrogate_id_SYMB_8() { return getToken(hardtypedParser.Surrogate_id_SYMB_8, 0); }
		public ListFuncArgContext listFuncArg() {
			return getRuleContext(ListFuncArgContext.class,0);
		}
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitExpr1(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr1);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				((Expr1Context)_localctx).p_1_1 = expr2();
				 ((Expr1Context)_localctx).result =  ((Expr1Context)_localctx).p_1_1.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(Surrogate_id_SYMB_6);
				setState(314);
				((Expr1Context)_localctx).p_2_2 = listFuncArg();
				setState(315);
				match(Surrogate_id_SYMB_7);
				setState(316);
				((Expr1Context)_localctx).p_2_4 = listExpr();
				setState(317);
				match(Surrogate_id_SYMB_8);
				 ((Expr1Context)_localctx).result =  new hardtyped.Absyn.Function(((Expr1Context)_localctx).p_2_2.result,((Expr1Context)_localctx).p_2_4.result); 
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

	public static class Expr2Context extends ParserRuleContext {
		public hardtyped.Absyn.Expr result;
		public Expr3Context p_1_1;
		public ListFuncArgContext p_2_2;
		public ListExprContext p_2_4;
		public ListExprSequenceContext p_2_7;
		public ListFuncArgContext p_3_2;
		public ListExprContext p_3_4;
		public TypeContext p_3_7;
		public OpContext p_4_1;
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_6() { return getToken(hardtypedParser.Surrogate_id_SYMB_6, 0); }
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(hardtypedParser.Surrogate_id_SYMB_7, 0); }
		public TerminalNode Surrogate_id_SYMB_8() { return getToken(hardtypedParser.Surrogate_id_SYMB_8, 0); }
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(hardtypedParser.Surrogate_id_SYMB_1, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(hardtypedParser.Surrogate_id_SYMB_2, 0); }
		public ListFuncArgContext listFuncArg() {
			return getRuleContext(ListFuncArgContext.class,0);
		}
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public ListExprSequenceContext listExprSequence() {
			return getRuleContext(ListExprSequenceContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(hardtypedParser.Surrogate_id_SYMB_9, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitExpr2(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_expr2);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				((Expr2Context)_localctx).p_1_1 = expr3();
				 ((Expr2Context)_localctx).result =  ((Expr2Context)_localctx).p_1_1.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(Surrogate_id_SYMB_6);
				setState(326);
				((Expr2Context)_localctx).p_2_2 = listFuncArg();
				setState(327);
				match(Surrogate_id_SYMB_7);
				setState(328);
				((Expr2Context)_localctx).p_2_4 = listExpr();
				setState(329);
				match(Surrogate_id_SYMB_8);
				setState(330);
				match(Surrogate_id_SYMB_1);
				setState(331);
				((Expr2Context)_localctx).p_2_7 = listExprSequence();
				setState(332);
				match(Surrogate_id_SYMB_2);
				 ((Expr2Context)_localctx).result =  new hardtyped.Absyn.FunctionApplication(((Expr2Context)_localctx).p_2_2.result,((Expr2Context)_localctx).p_2_4.result,((Expr2Context)_localctx).p_2_7.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(Surrogate_id_SYMB_6);
				setState(336);
				((Expr2Context)_localctx).p_3_2 = listFuncArg();
				setState(337);
				match(Surrogate_id_SYMB_7);
				setState(338);
				((Expr2Context)_localctx).p_3_4 = listExpr();
				setState(339);
				match(Surrogate_id_SYMB_8);
				setState(340);
				match(Surrogate_id_SYMB_9);
				setState(341);
				((Expr2Context)_localctx).p_3_7 = type();
				 ((Expr2Context)_localctx).result =  new hardtyped.Absyn.FunctionWithReturnType(((Expr2Context)_localctx).p_3_2.result,((Expr2Context)_localctx).p_3_4.result,((Expr2Context)_localctx).p_3_7.result); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				((Expr2Context)_localctx).p_4_1 = op();
				 ((Expr2Context)_localctx).result =  new hardtyped.Absyn.Operation(((Expr2Context)_localctx).p_4_1.result); 
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

	public static class Expr3Context extends ParserRuleContext {
		public hardtyped.Absyn.Expr result;
		public Expr4Context p_1_1;
		public Expr4Context p_2_1;
		public ListExprSequenceContext p_2_3;
		public Token p_3_1;
		public Token p_4_1;
		public Token p_5_1;
		public Token p_6_1;
		public Token p_7_1;
		public ListRecordElemContext p_8_2;
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(hardtypedParser.Surrogate_id_SYMB_1, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(hardtypedParser.Surrogate_id_SYMB_2, 0); }
		public ListExprSequenceContext listExprSequence() {
			return getRuleContext(ListExprSequenceContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(hardtypedParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(hardtypedParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(hardtypedParser.STRING, 0); }
		public TerminalNode Bool() { return getToken(hardtypedParser.Bool, 0); }
		public TerminalNode Unit() { return getToken(hardtypedParser.Unit, 0); }
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(hardtypedParser.Surrogate_id_SYMB_7, 0); }
		public TerminalNode Surrogate_id_SYMB_8() { return getToken(hardtypedParser.Surrogate_id_SYMB_8, 0); }
		public ListRecordElemContext listRecordElem() {
			return getRuleContext(ListRecordElemContext.class,0);
		}
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitExpr3(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_expr3);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				((Expr3Context)_localctx).p_1_1 = expr4(0);
				 ((Expr3Context)_localctx).result =  ((Expr3Context)_localctx).p_1_1.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				((Expr3Context)_localctx).p_2_1 = expr4(0);
				setState(353);
				match(Surrogate_id_SYMB_1);
				setState(354);
				((Expr3Context)_localctx).p_2_3 = listExprSequence();
				setState(355);
				match(Surrogate_id_SYMB_2);
				 ((Expr3Context)_localctx).result =  new hardtyped.Absyn.Application(((Expr3Context)_localctx).p_2_1.result,((Expr3Context)_localctx).p_2_3.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				((Expr3Context)_localctx).p_3_1 = match(INTEGER);
				 ((Expr3Context)_localctx).result =  new hardtyped.Absyn.IntValue(Integer.parseInt(((Expr3Context)_localctx).p_3_1.getText())); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				((Expr3Context)_localctx).p_4_1 = match(DOUBLE);
				 ((Expr3Context)_localctx).result =  new hardtyped.Absyn.RealValue(Double.parseDouble(((Expr3Context)_localctx).p_4_1.getText())); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(362);
				((Expr3Context)_localctx).p_5_1 = match(STRING);
				 ((Expr3Context)_localctx).result =  new hardtyped.Absyn.StringValue(((Expr3Context)_localctx).p_5_1.getText().substring(1, ((Expr3Context)_localctx).p_5_1.getText().length()-1)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(364);
				((Expr3Context)_localctx).p_6_1 = match(Bool);
				 ((Expr3Context)_localctx).result =  new hardtyped.Absyn.BoolValue(((Expr3Context)_localctx).p_6_1.getText()); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(366);
				((Expr3Context)_localctx).p_7_1 = match(Unit);
				 ((Expr3Context)_localctx).result =  new hardtyped.Absyn.UnitValue(((Expr3Context)_localctx).p_7_1.getText()); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(368);
				match(Surrogate_id_SYMB_7);
				setState(369);
				((Expr3Context)_localctx).p_8_2 = listRecordElem();
				setState(370);
				match(Surrogate_id_SYMB_8);
				 ((Expr3Context)_localctx).result =  new hardtyped.Absyn.RecordConst(((Expr3Context)_localctx).p_8_2.result); 
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

	public static class Expr4Context extends ParserRuleContext {
		public hardtyped.Absyn.Expr result;
		public Expr4Context p_4_1;
		public Expr5Context p_1_1;
		public Token p_2_1;
		public Token p_3_1;
		public Expr4Context p_3_3;
		public Token p_4_3;
		public Expr5Context expr5() {
			return getRuleContext(Expr5Context.class,0);
		}
		public TerminalNode IDENT() { return getToken(hardtypedParser.IDENT, 0); }
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(hardtypedParser.Surrogate_id_SYMB_9, 0); }
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_10() { return getToken(hardtypedParser.Surrogate_id_SYMB_10, 0); }
		public Expr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterExpr4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitExpr4(this);
		}
	}

	public final Expr4Context expr4() throws RecognitionException {
		return expr4(0);
	}

	private Expr4Context expr4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr4Context _localctx = new Expr4Context(_ctx, _parentState);
		Expr4Context _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_expr4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(376);
				((Expr4Context)_localctx).p_1_1 = expr5();
				 ((Expr4Context)_localctx).result =  ((Expr4Context)_localctx).p_1_1.result; 
				}
				break;
			case 2:
				{
				setState(379);
				((Expr4Context)_localctx).p_2_1 = match(IDENT);
				 ((Expr4Context)_localctx).result =  new hardtyped.Absyn.Variable(((Expr4Context)_localctx).p_2_1.getText()); 
				}
				break;
			case 3:
				{
				setState(381);
				((Expr4Context)_localctx).p_3_1 = match(IDENT);
				setState(382);
				match(Surrogate_id_SYMB_9);
				setState(383);
				((Expr4Context)_localctx).p_3_3 = expr4(2);
				 ((Expr4Context)_localctx).result =  new hardtyped.Absyn.ArrowExpr(((Expr4Context)_localctx).p_3_1.getText(),((Expr4Context)_localctx).p_3_3.result); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr4Context(_parentctx, _parentState);
					_localctx.p_4_1 = _prevctx;
					_localctx.p_4_1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr4);
					setState(388);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(389);
					match(Surrogate_id_SYMB_10);
					setState(390);
					((Expr4Context)_localctx).p_4_3 = match(IDENT);
					 ((Expr4Context)_localctx).result =  new hardtyped.Absyn.DotExpr(((Expr4Context)_localctx).p_4_1.result,((Expr4Context)_localctx).p_4_3.getText()); 
					}
					} 
				}
				setState(396);
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

	public static class Expr5Context extends ParserRuleContext {
		public hardtyped.Absyn.Expr result;
		public ExprContext p_1_2;
		public ListExprContext p_2_2;
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(hardtypedParser.Surrogate_id_SYMB_1, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(hardtypedParser.Surrogate_id_SYMB_2, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public Expr5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterExpr5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitExpr5(this);
		}
	}

	public final Expr5Context expr5() throws RecognitionException {
		Expr5Context _localctx = new Expr5Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_expr5);
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(Surrogate_id_SYMB_1);
				setState(398);
				((Expr5Context)_localctx).p_1_2 = expr();
				setState(399);
				match(Surrogate_id_SYMB_2);
				 ((Expr5Context)_localctx).result =  ((Expr5Context)_localctx).p_1_2.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				match(Surrogate_id_SYMB_1);
				setState(403);
				((Expr5Context)_localctx).p_2_2 = listExpr();
				setState(404);
				match(Surrogate_id_SYMB_2);
				 ((Expr5Context)_localctx).result =  new hardtyped.Absyn.Exprs(((Expr5Context)_localctx).p_2_2.result); 
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
		public TerminalNode Surrogate_id_SYMB_5() { return getToken(hardtypedParser.Surrogate_id_SYMB_5, 0); }
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
		enterRule(_localctx, 74, RULE_varDec);
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				((VarDecContext)_localctx).p_1_1 = match(IDENT);
				setState(410);
				match(Surrogate_id_SYMB_5);
				setState(411);
				((VarDecContext)_localctx).p_1_3 = type();
				 ((VarDecContext)_localctx).result =  new hardtyped.Absyn.TypedVar(((VarDecContext)_localctx).p_1_1.getText(),((VarDecContext)_localctx).p_1_3.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
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

	public static class ExprSequenceContext extends ParserRuleContext {
		public hardtyped.Absyn.ExprSequence result;
		public ExprContext p_1_1;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterExprSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitExprSequence(this);
		}
	}

	public final ExprSequenceContext exprSequence() throws RecognitionException {
		ExprSequenceContext _localctx = new ExprSequenceContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exprSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			((ExprSequenceContext)_localctx).p_1_1 = expr();
			 ((ExprSequenceContext)_localctx).result =  new hardtyped.Absyn.Seq(((ExprSequenceContext)_localctx).p_1_1.result); 
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

	public static class ListExprSequenceContext extends ParserRuleContext {
		public hardtyped.Absyn.ListExprSequence result;
		public ExprSequenceContext p_2_1;
		public ExprSequenceContext p_3_1;
		public ListExprSequenceContext p_3_3;
		public ExprSequenceContext exprSequence() {
			return getRuleContext(ExprSequenceContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_11() { return getToken(hardtypedParser.Surrogate_id_SYMB_11, 0); }
		public ListExprSequenceContext listExprSequence() {
			return getRuleContext(ListExprSequenceContext.class,0);
		}
		public ListExprSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExprSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterListExprSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitListExprSequence(this);
		}
	}

	public final ListExprSequenceContext listExprSequence() throws RecognitionException {
		ListExprSequenceContext _localctx = new ListExprSequenceContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_listExprSequence);
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((ListExprSequenceContext)_localctx).result =  new hardtyped.Absyn.ListExprSequence(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				((ListExprSequenceContext)_localctx).p_2_1 = exprSequence();
				 ((ListExprSequenceContext)_localctx).result =  new hardtyped.Absyn.ListExprSequence(); _localctx.result.addLast(((ListExprSequenceContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(425);
				((ListExprSequenceContext)_localctx).p_3_1 = exprSequence();
				setState(426);
				match(Surrogate_id_SYMB_11);
				setState(427);
				((ListExprSequenceContext)_localctx).p_3_3 = listExprSequence();
				 ((ListExprSequenceContext)_localctx).result =  ((ListExprSequenceContext)_localctx).p_3_3.result; _localctx.result.addFirst(((ListExprSequenceContext)_localctx).p_3_1.result); 
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

	public static class FuncArgContext extends ParserRuleContext {
		public hardtyped.Absyn.FuncArg result;
		public Token p_1_1;
		public TypeContext p_1_3;
		public TerminalNode Surrogate_id_SYMB_5() { return getToken(hardtypedParser.Surrogate_id_SYMB_5, 0); }
		public TerminalNode IDENT() { return getToken(hardtypedParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 80, RULE_funcArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			((FuncArgContext)_localctx).p_1_1 = match(IDENT);
			setState(433);
			match(Surrogate_id_SYMB_5);
			setState(434);
			((FuncArgContext)_localctx).p_1_3 = type();
			 ((FuncArgContext)_localctx).result =  new hardtyped.Absyn.Argument(((FuncArgContext)_localctx).p_1_1.getText(),((FuncArgContext)_localctx).p_1_3.result); 
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

	public static class ListFuncArgContext extends ParserRuleContext {
		public hardtyped.Absyn.ListFuncArg result;
		public FuncArgContext p_1_1;
		public FuncArgContext p_2_1;
		public ListFuncArgContext p_2_3;
		public TerminalNode Surrogate_id_SYMB_10() { return getToken(hardtypedParser.Surrogate_id_SYMB_10, 0); }
		public FuncArgContext funcArg() {
			return getRuleContext(FuncArgContext.class,0);
		}
		public ListFuncArgContext listFuncArg() {
			return getRuleContext(ListFuncArgContext.class,0);
		}
		public ListFuncArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listFuncArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterListFuncArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitListFuncArg(this);
		}
	}

	public final ListFuncArgContext listFuncArg() throws RecognitionException {
		ListFuncArgContext _localctx = new ListFuncArgContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_listFuncArg);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				((ListFuncArgContext)_localctx).p_1_1 = funcArg();
				setState(438);
				match(Surrogate_id_SYMB_10);
				 ((ListFuncArgContext)_localctx).result =  new hardtyped.Absyn.ListFuncArg(); _localctx.result.addLast(((ListFuncArgContext)_localctx).p_1_1.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				((ListFuncArgContext)_localctx).p_2_1 = funcArg();
				setState(442);
				match(Surrogate_id_SYMB_10);
				setState(443);
				((ListFuncArgContext)_localctx).p_2_3 = listFuncArg();
				 ((ListFuncArgContext)_localctx).result =  ((ListFuncArgContext)_localctx).p_2_3.result; _localctx.result.addFirst(((ListFuncArgContext)_localctx).p_2_1.result); 
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

	public static class IfExprContext extends ParserRuleContext {
		public hardtyped.Absyn.IfExpr result;
		public Expr2Context p_1_3;
		public ExprContext p_1_6;
		public TerminalNode Surrogate_id_SYMB_12() { return getToken(hardtypedParser.Surrogate_id_SYMB_12, 0); }
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(hardtypedParser.Surrogate_id_SYMB_1, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(hardtypedParser.Surrogate_id_SYMB_2, 0); }
		public TerminalNode Surrogate_id_SYMB_5() { return getToken(hardtypedParser.Surrogate_id_SYMB_5, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitIfExpr(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(Surrogate_id_SYMB_12);
			setState(449);
			match(Surrogate_id_SYMB_1);
			setState(450);
			((IfExprContext)_localctx).p_1_3 = expr2();
			setState(451);
			match(Surrogate_id_SYMB_2);
			setState(452);
			match(Surrogate_id_SYMB_5);
			setState(453);
			((IfExprContext)_localctx).p_1_6 = expr();
			 ((IfExprContext)_localctx).result =  new hardtyped.Absyn.If(((IfExprContext)_localctx).p_1_3.result,((IfExprContext)_localctx).p_1_6.result); 
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

	public static class ListIfExprContext extends ParserRuleContext {
		public hardtyped.Absyn.ListIfExpr result;
		public IfExprContext p_1_1;
		public IfExprContext p_2_1;
		public ListIfExprContext p_2_2;
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public ListIfExprContext listIfExpr() {
			return getRuleContext(ListIfExprContext.class,0);
		}
		public ListIfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listIfExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterListIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitListIfExpr(this);
		}
	}

	public final ListIfExprContext listIfExpr() throws RecognitionException {
		ListIfExprContext _localctx = new ListIfExprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_listIfExpr);
		try {
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				((ListIfExprContext)_localctx).p_1_1 = ifExpr();
				 ((ListIfExprContext)_localctx).result =  new hardtyped.Absyn.ListIfExpr(); _localctx.result.addLast(((ListIfExprContext)_localctx).p_1_1.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				((ListIfExprContext)_localctx).p_2_1 = ifExpr();
				setState(460);
				((ListIfExprContext)_localctx).p_2_2 = listIfExpr();
				 ((ListIfExprContext)_localctx).result =  ((ListIfExprContext)_localctx).p_2_2.result; _localctx.result.addFirst(((ListIfExprContext)_localctx).p_2_1.result); 
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

	public static class ElseExprContext extends ParserRuleContext {
		public hardtyped.Absyn.ElseExpr result;
		public ExprContext p_1_2;
		public TerminalNode Surrogate_id_SYMB_13() { return getToken(hardtypedParser.Surrogate_id_SYMB_13, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterElseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitElseExpr(this);
		}
	}

	public final ElseExprContext elseExpr() throws RecognitionException {
		ElseExprContext _localctx = new ElseExprContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_elseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(Surrogate_id_SYMB_13);
			setState(466);
			((ElseExprContext)_localctx).p_1_2 = expr();
			 ((ElseExprContext)_localctx).result =  new hardtyped.Absyn.Else(((ElseExprContext)_localctx).p_1_2.result); 
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

	public static class OpContext extends ParserRuleContext {
		public hardtyped.Absyn.Op result;
		public Op1Context p_1_1;
		public Expr3Context p_2_1;
		public Expr3Context p_2_3;
		public Op1Context op1() {
			return getRuleContext(Op1Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_37() { return getToken(hardtypedParser.Surrogate_id_SYMB_37, 0); }
		public List<Expr3Context> expr3() {
			return getRuleContexts(Expr3Context.class);
		}
		public Expr3Context expr3(int i) {
			return getRuleContext(Expr3Context.class,i);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_op);
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				((OpContext)_localctx).p_1_1 = op1();
				 ((OpContext)_localctx).result =  ((OpContext)_localctx).p_1_1.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				((OpContext)_localctx).p_2_1 = expr3();
				setState(473);
				match(Surrogate_id_SYMB_37);
				setState(474);
				((OpContext)_localctx).p_2_3 = expr3();
				 ((OpContext)_localctx).result =  new hardtyped.Absyn.Or(((OpContext)_localctx).p_2_1.result,((OpContext)_localctx).p_2_3.result); 
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

	public static class Op1Context extends ParserRuleContext {
		public hardtyped.Absyn.Op result;
		public Op2Context p_1_1;
		public Expr3Context p_2_1;
		public Expr3Context p_2_3;
		public Op2Context op2() {
			return getRuleContext(Op2Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_30() { return getToken(hardtypedParser.Surrogate_id_SYMB_30, 0); }
		public List<Expr3Context> expr3() {
			return getRuleContexts(Expr3Context.class);
		}
		public Expr3Context expr3(int i) {
			return getRuleContext(Expr3Context.class,i);
		}
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitOp1(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_op1);
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				((Op1Context)_localctx).p_1_1 = op2();
				 ((Op1Context)_localctx).result =  ((Op1Context)_localctx).p_1_1.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				((Op1Context)_localctx).p_2_1 = expr3();
				setState(483);
				match(Surrogate_id_SYMB_30);
				setState(484);
				((Op1Context)_localctx).p_2_3 = expr3();
				 ((Op1Context)_localctx).result =  new hardtyped.Absyn.And(((Op1Context)_localctx).p_2_1.result,((Op1Context)_localctx).p_2_3.result); 
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

	public static class Op2Context extends ParserRuleContext {
		public hardtyped.Absyn.Op result;
		public Op3Context p_1_1;
		public Expr3Context p_2_2;
		public Op3Context op3() {
			return getRuleContext(Op3Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_36() { return getToken(hardtypedParser.Surrogate_id_SYMB_36, 0); }
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitOp2(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_op2);
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_1:
			case Surrogate_id_SYMB_7:
			case Surrogate_id_SYMB_14:
			case Surrogate_id_SYMB_15:
			case Bool:
			case Unit:
			case DOUBLE:
			case INTEGER:
			case IDENT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				((Op2Context)_localctx).p_1_1 = op3();
				 ((Op2Context)_localctx).result =  ((Op2Context)_localctx).p_1_1.result; 
				}
				break;
			case Surrogate_id_SYMB_36:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				match(Surrogate_id_SYMB_36);
				setState(493);
				((Op2Context)_localctx).p_2_2 = expr3();
				 ((Op2Context)_localctx).result =  new hardtyped.Absyn.Not(((Op2Context)_localctx).p_2_2.result); 
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

	public static class Op3Context extends ParserRuleContext {
		public hardtyped.Absyn.Op result;
		public Op4Context p_1_1;
		public Expr3Context p_2_1;
		public Expr3Context p_2_3;
		public Expr3Context p_3_1;
		public Expr3Context p_3_3;
		public Expr3Context p_4_1;
		public Expr3Context p_4_3;
		public Expr3Context p_5_1;
		public Expr3Context p_5_3;
		public Expr3Context p_6_1;
		public Expr3Context p_6_3;
		public Expr3Context p_7_1;
		public Expr3Context p_7_3;
		public Op4Context op4() {
			return getRuleContext(Op4Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_18() { return getToken(hardtypedParser.Surrogate_id_SYMB_18, 0); }
		public List<Expr3Context> expr3() {
			return getRuleContexts(Expr3Context.class);
		}
		public Expr3Context expr3(int i) {
			return getRuleContext(Expr3Context.class,i);
		}
		public TerminalNode Surrogate_id_SYMB_19() { return getToken(hardtypedParser.Surrogate_id_SYMB_19, 0); }
		public TerminalNode Surrogate_id_SYMB_20() { return getToken(hardtypedParser.Surrogate_id_SYMB_20, 0); }
		public TerminalNode Surrogate_id_SYMB_21() { return getToken(hardtypedParser.Surrogate_id_SYMB_21, 0); }
		public TerminalNode Surrogate_id_SYMB_22() { return getToken(hardtypedParser.Surrogate_id_SYMB_22, 0); }
		public TerminalNode Surrogate_id_SYMB_23() { return getToken(hardtypedParser.Surrogate_id_SYMB_23, 0); }
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitOp3(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_op3);
		try {
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				((Op3Context)_localctx).p_1_1 = op4();
				 ((Op3Context)_localctx).result =  ((Op3Context)_localctx).p_1_1.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				((Op3Context)_localctx).p_2_1 = expr3();
				setState(502);
				match(Surrogate_id_SYMB_18);
				setState(503);
				((Op3Context)_localctx).p_2_3 = expr3();
				 ((Op3Context)_localctx).result =  new hardtyped.Absyn.More(((Op3Context)_localctx).p_2_1.result,((Op3Context)_localctx).p_2_3.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(506);
				((Op3Context)_localctx).p_3_1 = expr3();
				setState(507);
				match(Surrogate_id_SYMB_19);
				setState(508);
				((Op3Context)_localctx).p_3_3 = expr3();
				 ((Op3Context)_localctx).result =  new hardtyped.Absyn.MoreEql(((Op3Context)_localctx).p_3_1.result,((Op3Context)_localctx).p_3_3.result); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(511);
				((Op3Context)_localctx).p_4_1 = expr3();
				setState(512);
				match(Surrogate_id_SYMB_20);
				setState(513);
				((Op3Context)_localctx).p_4_3 = expr3();
				 ((Op3Context)_localctx).result =  new hardtyped.Absyn.Eql(((Op3Context)_localctx).p_4_1.result,((Op3Context)_localctx).p_4_3.result); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(516);
				((Op3Context)_localctx).p_5_1 = expr3();
				setState(517);
				match(Surrogate_id_SYMB_21);
				setState(518);
				((Op3Context)_localctx).p_5_3 = expr3();
				 ((Op3Context)_localctx).result =  new hardtyped.Absyn.NotEql(((Op3Context)_localctx).p_5_1.result,((Op3Context)_localctx).p_5_3.result); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(521);
				((Op3Context)_localctx).p_6_1 = expr3();
				setState(522);
				match(Surrogate_id_SYMB_22);
				setState(523);
				((Op3Context)_localctx).p_6_3 = expr3();
				 ((Op3Context)_localctx).result =  new hardtyped.Absyn.LessEql(((Op3Context)_localctx).p_6_1.result,((Op3Context)_localctx).p_6_3.result); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(526);
				((Op3Context)_localctx).p_7_1 = expr3();
				setState(527);
				match(Surrogate_id_SYMB_23);
				setState(528);
				((Op3Context)_localctx).p_7_3 = expr3();
				 ((Op3Context)_localctx).result =  new hardtyped.Absyn.Less(((Op3Context)_localctx).p_7_1.result,((Op3Context)_localctx).p_7_3.result); 
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

	public static class Op4Context extends ParserRuleContext {
		public hardtyped.Absyn.Op result;
		public Op5Context p_1_1;
		public Expr3Context p_2_1;
		public Expr3Context p_2_3;
		public Expr3Context p_3_1;
		public Expr3Context p_3_3;
		public Op5Context op5() {
			return getRuleContext(Op5Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_14() { return getToken(hardtypedParser.Surrogate_id_SYMB_14, 0); }
		public List<Expr3Context> expr3() {
			return getRuleContexts(Expr3Context.class);
		}
		public Expr3Context expr3(int i) {
			return getRuleContext(Expr3Context.class,i);
		}
		public TerminalNode Surrogate_id_SYMB_15() { return getToken(hardtypedParser.Surrogate_id_SYMB_15, 0); }
		public Op4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterOp4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitOp4(this);
		}
	}

	public final Op4Context op4() throws RecognitionException {
		Op4Context _localctx = new Op4Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_op4);
		try {
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				((Op4Context)_localctx).p_1_1 = op5();
				 ((Op4Context)_localctx).result =  ((Op4Context)_localctx).p_1_1.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				((Op4Context)_localctx).p_2_1 = expr3();
				setState(537);
				match(Surrogate_id_SYMB_14);
				setState(538);
				((Op4Context)_localctx).p_2_3 = expr3();
				 ((Op4Context)_localctx).result =  new hardtyped.Absyn.Sum(((Op4Context)_localctx).p_2_1.result,((Op4Context)_localctx).p_2_3.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				((Op4Context)_localctx).p_3_1 = expr3();
				setState(542);
				match(Surrogate_id_SYMB_15);
				setState(543);
				((Op4Context)_localctx).p_3_3 = expr3();
				 ((Op4Context)_localctx).result =  new hardtyped.Absyn.Substract(((Op4Context)_localctx).p_3_1.result,((Op4Context)_localctx).p_3_3.result); 
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

	public static class Op5Context extends ParserRuleContext {
		public hardtyped.Absyn.Op result;
		public Op6Context p_1_1;
		public Expr3Context p_2_1;
		public Expr3Context p_2_3;
		public Expr3Context p_3_1;
		public Expr3Context p_3_3;
		public Op6Context op6() {
			return getRuleContext(Op6Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_16() { return getToken(hardtypedParser.Surrogate_id_SYMB_16, 0); }
		public List<Expr3Context> expr3() {
			return getRuleContexts(Expr3Context.class);
		}
		public Expr3Context expr3(int i) {
			return getRuleContext(Expr3Context.class,i);
		}
		public TerminalNode Surrogate_id_SYMB_17() { return getToken(hardtypedParser.Surrogate_id_SYMB_17, 0); }
		public Op5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterOp5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitOp5(this);
		}
	}

	public final Op5Context op5() throws RecognitionException {
		Op5Context _localctx = new Op5Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_op5);
		try {
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				((Op5Context)_localctx).p_1_1 = op6();
				 ((Op5Context)_localctx).result =  ((Op5Context)_localctx).p_1_1.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				((Op5Context)_localctx).p_2_1 = expr3();
				setState(552);
				match(Surrogate_id_SYMB_16);
				setState(553);
				((Op5Context)_localctx).p_2_3 = expr3();
				 ((Op5Context)_localctx).result =  new hardtyped.Absyn.Multiply(((Op5Context)_localctx).p_2_1.result,((Op5Context)_localctx).p_2_3.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				((Op5Context)_localctx).p_3_1 = expr3();
				setState(557);
				match(Surrogate_id_SYMB_17);
				setState(558);
				((Op5Context)_localctx).p_3_3 = expr3();
				 ((Op5Context)_localctx).result =  new hardtyped.Absyn.Divide(((Op5Context)_localctx).p_3_1.result,((Op5Context)_localctx).p_3_3.result); 
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

	public static class Op6Context extends ParserRuleContext {
		public hardtyped.Absyn.Op result;
		public OpContext p_1_2;
		public Expr3Context p_2_2;
		public Expr3Context p_3_2;
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(hardtypedParser.Surrogate_id_SYMB_1, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(hardtypedParser.Surrogate_id_SYMB_2, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_14() { return getToken(hardtypedParser.Surrogate_id_SYMB_14, 0); }
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_15() { return getToken(hardtypedParser.Surrogate_id_SYMB_15, 0); }
		public Op6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterOp6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitOp6(this);
		}
	}

	public final Op6Context op6() throws RecognitionException {
		Op6Context _localctx = new Op6Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_op6);
		try {
			setState(576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_1:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				match(Surrogate_id_SYMB_1);
				setState(564);
				((Op6Context)_localctx).p_1_2 = op();
				setState(565);
				match(Surrogate_id_SYMB_2);
				 ((Op6Context)_localctx).result =  ((Op6Context)_localctx).p_1_2.result; 
				}
				break;
			case Surrogate_id_SYMB_14:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				match(Surrogate_id_SYMB_14);
				setState(569);
				((Op6Context)_localctx).p_2_2 = expr3();
				 ((Op6Context)_localctx).result =  new hardtyped.Absyn.UnaryPlus(((Op6Context)_localctx).p_2_2.result); 
				}
				break;
			case Surrogate_id_SYMB_15:
				enterOuterAlt(_localctx, 3);
				{
				setState(572);
				match(Surrogate_id_SYMB_15);
				setState(573);
				((Op6Context)_localctx).p_3_2 = expr3();
				 ((Op6Context)_localctx).result =  new hardtyped.Absyn.UnaryMinus(((Op6Context)_localctx).p_3_2.result); 
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

	public static class RecordElemContext extends ParserRuleContext {
		public hardtyped.Absyn.RecordElem result;
		public Token p_1_1;
		public Expr3Context p_1_3;
		public TerminalNode Surrogate_id_SYMB_4() { return getToken(hardtypedParser.Surrogate_id_SYMB_4, 0); }
		public TerminalNode IDENT() { return getToken(hardtypedParser.IDENT, 0); }
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public RecordElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterRecordElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitRecordElem(this);
		}
	}

	public final RecordElemContext recordElem() throws RecognitionException {
		RecordElemContext _localctx = new RecordElemContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_recordElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			((RecordElemContext)_localctx).p_1_1 = match(IDENT);
			setState(579);
			match(Surrogate_id_SYMB_4);
			setState(580);
			((RecordElemContext)_localctx).p_1_3 = expr3();
			 ((RecordElemContext)_localctx).result =  new hardtyped.Absyn.Elem(((RecordElemContext)_localctx).p_1_1.getText(),((RecordElemContext)_localctx).p_1_3.result); 
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

	public static class ListRecordElemContext extends ParserRuleContext {
		public hardtyped.Absyn.ListRecordElem result;
		public RecordElemContext p_2_1;
		public RecordElemContext p_3_1;
		public ListRecordElemContext p_3_3;
		public RecordElemContext recordElem() {
			return getRuleContext(RecordElemContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_11() { return getToken(hardtypedParser.Surrogate_id_SYMB_11, 0); }
		public ListRecordElemContext listRecordElem() {
			return getRuleContext(ListRecordElemContext.class,0);
		}
		public ListRecordElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listRecordElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterListRecordElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitListRecordElem(this);
		}
	}

	public final ListRecordElemContext listRecordElem() throws RecognitionException {
		ListRecordElemContext _localctx = new ListRecordElemContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_listRecordElem);
		try {
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((ListRecordElemContext)_localctx).result =  new hardtyped.Absyn.ListRecordElem(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				((ListRecordElemContext)_localctx).p_2_1 = recordElem();
				 ((ListRecordElemContext)_localctx).result =  new hardtyped.Absyn.ListRecordElem(); _localctx.result.addLast(((ListRecordElemContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(587);
				((ListRecordElemContext)_localctx).p_3_1 = recordElem();
				setState(588);
				match(Surrogate_id_SYMB_11);
				setState(589);
				((ListRecordElemContext)_localctx).p_3_3 = listRecordElem();
				 ((ListRecordElemContext)_localctx).result =  ((ListRecordElemContext)_localctx).p_3_3.result; _localctx.result.addFirst(((ListRecordElemContext)_localctx).p_3_1.result); 
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
		public Type1Context p_1_1;
		public Type1Context type1() {
			return getRuleContext(Type1Context.class,0);
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
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			((TypeContext)_localctx).p_1_1 = type1(0);
			 ((TypeContext)_localctx).result =  ((TypeContext)_localctx).p_1_1.result; 
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

	public static class Type1Context extends ParserRuleContext {
		public hardtyped.Absyn.Type result;
		public Type1Context p_2_1;
		public Type2Context p_1_1;
		public Type2Context p_2_3;
		public Type2Context type2() {
			return getRuleContext(Type2Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(hardtypedParser.Surrogate_id_SYMB_9, 0); }
		public Type1Context type1() {
			return getRuleContext(Type1Context.class,0);
		}
		public Type1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterType1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitType1(this);
		}
	}

	public final Type1Context type1() throws RecognitionException {
		return type1(0);
	}

	private Type1Context type1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type1Context _localctx = new Type1Context(_ctx, _parentState);
		Type1Context _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_type1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(598);
			((Type1Context)_localctx).p_1_1 = type2();
			 ((Type1Context)_localctx).result =  ((Type1Context)_localctx).p_1_1.result; 
			}
			_ctx.stop = _input.LT(-1);
			setState(608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type1Context(_parentctx, _parentState);
					_localctx.p_2_1 = _prevctx;
					_localctx.p_2_1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type1);
					setState(601);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(602);
					match(Surrogate_id_SYMB_9);
					setState(603);
					((Type1Context)_localctx).p_2_3 = type2();
					 ((Type1Context)_localctx).result =  new hardtyped.Absyn.FunctionType(((Type1Context)_localctx).p_2_1.result,((Type1Context)_localctx).p_2_3.result); 
					}
					} 
				}
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class Type2Context extends ParserRuleContext {
		public hardtyped.Absyn.Type result;
		public Type3Context p_1_1;
		public Token p_2_1;
		public ListRecordElemTypeContext p_9_2;
		public Type3Context type3() {
			return getRuleContext(Type3Context.class,0);
		}
		public TerminalNode IDENT() { return getToken(hardtypedParser.IDENT, 0); }
		public TerminalNode Surrogate_id_SYMB_26() { return getToken(hardtypedParser.Surrogate_id_SYMB_26, 0); }
		public TerminalNode Surrogate_id_SYMB_27() { return getToken(hardtypedParser.Surrogate_id_SYMB_27, 0); }
		public TerminalNode Surrogate_id_SYMB_25() { return getToken(hardtypedParser.Surrogate_id_SYMB_25, 0); }
		public TerminalNode Surrogate_id_SYMB_28() { return getToken(hardtypedParser.Surrogate_id_SYMB_28, 0); }
		public TerminalNode Surrogate_id_SYMB_29() { return getToken(hardtypedParser.Surrogate_id_SYMB_29, 0); }
		public TerminalNode Surrogate_id_SYMB_24() { return getToken(hardtypedParser.Surrogate_id_SYMB_24, 0); }
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(hardtypedParser.Surrogate_id_SYMB_7, 0); }
		public TerminalNode Surrogate_id_SYMB_8() { return getToken(hardtypedParser.Surrogate_id_SYMB_8, 0); }
		public ListRecordElemTypeContext listRecordElemType() {
			return getRuleContext(ListRecordElemTypeContext.class,0);
		}
		public Type2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterType2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitType2(this);
		}
	}

	public final Type2Context type2() throws RecognitionException {
		Type2Context _localctx = new Type2Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_type2);
		try {
			setState(633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_1:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				((Type2Context)_localctx).p_1_1 = type3();
				 ((Type2Context)_localctx).result =  ((Type2Context)_localctx).p_1_1.result; 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				((Type2Context)_localctx).p_2_1 = match(IDENT);
				 ((Type2Context)_localctx).result =  new hardtyped.Absyn.UserType(((Type2Context)_localctx).p_2_1.getText()); 
				}
				break;
			case Surrogate_id_SYMB_26:
				enterOuterAlt(_localctx, 3);
				{
				setState(616);
				match(Surrogate_id_SYMB_26);
				 ((Type2Context)_localctx).result =  new hardtyped.Absyn.IntType(); 
				}
				break;
			case Surrogate_id_SYMB_27:
				enterOuterAlt(_localctx, 4);
				{
				setState(618);
				match(Surrogate_id_SYMB_27);
				 ((Type2Context)_localctx).result =  new hardtyped.Absyn.RealType(); 
				}
				break;
			case Surrogate_id_SYMB_25:
				enterOuterAlt(_localctx, 5);
				{
				setState(620);
				match(Surrogate_id_SYMB_25);
				 ((Type2Context)_localctx).result =  new hardtyped.Absyn.BoolType(); 
				}
				break;
			case Surrogate_id_SYMB_28:
				enterOuterAlt(_localctx, 6);
				{
				setState(622);
				match(Surrogate_id_SYMB_28);
				 ((Type2Context)_localctx).result =  new hardtyped.Absyn.StringType(); 
				}
				break;
			case Surrogate_id_SYMB_29:
				enterOuterAlt(_localctx, 7);
				{
				setState(624);
				match(Surrogate_id_SYMB_29);
				 ((Type2Context)_localctx).result =  new hardtyped.Absyn.UnitType(); 
				}
				break;
			case Surrogate_id_SYMB_24:
				enterOuterAlt(_localctx, 8);
				{
				setState(626);
				match(Surrogate_id_SYMB_24);
				 ((Type2Context)_localctx).result =  new hardtyped.Absyn.AnyType(); 
				}
				break;
			case Surrogate_id_SYMB_7:
				enterOuterAlt(_localctx, 9);
				{
				setState(628);
				match(Surrogate_id_SYMB_7);
				setState(629);
				((Type2Context)_localctx).p_9_2 = listRecordElemType();
				setState(630);
				match(Surrogate_id_SYMB_8);
				 ((Type2Context)_localctx).result =  new hardtyped.Absyn.RecordType(((Type2Context)_localctx).p_9_2.result); 
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

	public static class Type3Context extends ParserRuleContext {
		public hardtyped.Absyn.Type result;
		public TypeContext p_1_2;
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(hardtypedParser.Surrogate_id_SYMB_1, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(hardtypedParser.Surrogate_id_SYMB_2, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterType3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitType3(this);
		}
	}

	public final Type3Context type3() throws RecognitionException {
		Type3Context _localctx = new Type3Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_type3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(Surrogate_id_SYMB_1);
			setState(636);
			((Type3Context)_localctx).p_1_2 = type();
			setState(637);
			match(Surrogate_id_SYMB_2);
			 ((Type3Context)_localctx).result =  ((Type3Context)_localctx).p_1_2.result; 
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

	public static class RecordElemTypeContext extends ParserRuleContext {
		public hardtyped.Absyn.RecordElemType result;
		public Token p_1_1;
		public TypeContext p_1_3;
		public TerminalNode Surrogate_id_SYMB_5() { return getToken(hardtypedParser.Surrogate_id_SYMB_5, 0); }
		public TerminalNode IDENT() { return getToken(hardtypedParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RecordElemTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordElemType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterRecordElemType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitRecordElemType(this);
		}
	}

	public final RecordElemTypeContext recordElemType() throws RecognitionException {
		RecordElemTypeContext _localctx = new RecordElemTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_recordElemType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			((RecordElemTypeContext)_localctx).p_1_1 = match(IDENT);
			setState(641);
			match(Surrogate_id_SYMB_5);
			setState(642);
			((RecordElemTypeContext)_localctx).p_1_3 = type();
			 ((RecordElemTypeContext)_localctx).result =  new hardtyped.Absyn.ElemType(((RecordElemTypeContext)_localctx).p_1_1.getText(),((RecordElemTypeContext)_localctx).p_1_3.result); 
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

	public static class ListRecordElemTypeContext extends ParserRuleContext {
		public hardtyped.Absyn.ListRecordElemType result;
		public RecordElemTypeContext p_2_1;
		public RecordElemTypeContext p_3_1;
		public ListRecordElemTypeContext p_3_3;
		public RecordElemTypeContext recordElemType() {
			return getRuleContext(RecordElemTypeContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_11() { return getToken(hardtypedParser.Surrogate_id_SYMB_11, 0); }
		public ListRecordElemTypeContext listRecordElemType() {
			return getRuleContext(ListRecordElemTypeContext.class,0);
		}
		public ListRecordElemTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listRecordElemType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterListRecordElemType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitListRecordElemType(this);
		}
	}

	public final ListRecordElemTypeContext listRecordElemType() throws RecognitionException {
		ListRecordElemTypeContext _localctx = new ListRecordElemTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_listRecordElemType);
		try {
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((ListRecordElemTypeContext)_localctx).result =  new hardtyped.Absyn.ListRecordElemType(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				((ListRecordElemTypeContext)_localctx).p_2_1 = recordElemType();
				 ((ListRecordElemTypeContext)_localctx).result =  new hardtyped.Absyn.ListRecordElemType(); _localctx.result.addLast(((ListRecordElemTypeContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(649);
				((ListRecordElemTypeContext)_localctx).p_3_1 = recordElemType();
				setState(650);
				match(Surrogate_id_SYMB_11);
				setState(651);
				((ListRecordElemTypeContext)_localctx).p_3_3 = listRecordElemType();
				 ((ListRecordElemTypeContext)_localctx).result =  ((ListRecordElemTypeContext)_localctx).p_3_3.result; _localctx.result.addFirst(((ListRecordElemTypeContext)_localctx).p_3_1.result); 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
			return expr4_sempred((Expr4Context)_localctx, predIndex);
		case 55:
			return type1_sempred((Type1Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr4_sempred(Expr4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type1_sempred(Type1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0293\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \5 \u00fc\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5"+
		"!\u0137\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0143\n\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\5#\u015e\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\5$\u0178\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0185"+
		"\n%\3%\3%\3%\3%\7%\u018b\n%\f%\16%\u018e\13%\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\5&\u019a\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01a3\n\'\3(\3(\3(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01b1\n)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\5+\u01c1\n+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\5"+
		"-\u01d2\n-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\5/\u01e0\n/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\5\60\u01ea\n\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u01f3\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0216\n\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0225"+
		"\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u0234\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\5\65\u0243\n\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\5\67\u0253\n\67\38\38\38\39\39\39\39\39\39\3"+
		"9\39\39\79\u0261\n9\f9\169\u0264\139\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u027c\n:\3;\3;\3;\3;\3;\3<\3<\3<"+
		"\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0291\n=\3=\2\4Hp>\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvx\2\2\2\u0290\2z\3\2\2\2\4~\3\2\2\2\6\u0082\3\2\2\2\b\u0086\3"+
		"\2\2\2\n\u008a\3\2\2\2\f\u008e\3\2\2\2\16\u0092\3\2\2\2\20\u0096\3\2\2"+
		"\2\22\u009a\3\2\2\2\24\u009e\3\2\2\2\26\u00a2\3\2\2\2\30\u00a6\3\2\2\2"+
		"\32\u00aa\3\2\2\2\34\u00ae\3\2\2\2\36\u00b2\3\2\2\2 \u00b6\3\2\2\2\"\u00ba"+
		"\3\2\2\2$\u00be\3\2\2\2&\u00c2\3\2\2\2(\u00c6\3\2\2\2*\u00ca\3\2\2\2,"+
		"\u00ce\3\2\2\2.\u00d2\3\2\2\2\60\u00d6\3\2\2\2\62\u00da\3\2\2\2\64\u00de"+
		"\3\2\2\2\66\u00e2\3\2\2\28\u00e6\3\2\2\2:\u00ea\3\2\2\2<\u00ee\3\2\2\2"+
		">\u00fb\3\2\2\2@\u0136\3\2\2\2B\u0142\3\2\2\2D\u015d\3\2\2\2F\u0177\3"+
		"\2\2\2H\u0184\3\2\2\2J\u0199\3\2\2\2L\u01a2\3\2\2\2N\u01a4\3\2\2\2P\u01b0"+
		"\3\2\2\2R\u01b2\3\2\2\2T\u01c0\3\2\2\2V\u01c2\3\2\2\2X\u01d1\3\2\2\2Z"+
		"\u01d3\3\2\2\2\\\u01df\3\2\2\2^\u01e9\3\2\2\2`\u01f2\3\2\2\2b\u0215\3"+
		"\2\2\2d\u0224\3\2\2\2f\u0233\3\2\2\2h\u0242\3\2\2\2j\u0244\3\2\2\2l\u0252"+
		"\3\2\2\2n\u0254\3\2\2\2p\u0257\3\2\2\2r\u027b\3\2\2\2t\u027d\3\2\2\2v"+
		"\u0282\3\2\2\2x\u0290\3\2\2\2z{\5> \2{|\7\2\2\3|}\b\2\1\2}\3\3\2\2\2~"+
		"\177\5@!\2\177\u0080\7\2\2\3\u0080\u0081\b\3\1\2\u0081\5\3\2\2\2\u0082"+
		"\u0083\5B\"\2\u0083\u0084\7\2\2\3\u0084\u0085\b\4\1\2\u0085\7\3\2\2\2"+
		"\u0086\u0087\5D#\2\u0087\u0088\7\2\2\3\u0088\u0089\b\5\1\2\u0089\t\3\2"+
		"\2\2\u008a\u008b\5F$\2\u008b\u008c\7\2\2\3\u008c\u008d\b\6\1\2\u008d\13"+
		"\3\2\2\2\u008e\u008f\5H%\2\u008f\u0090\7\2\2\3\u0090\u0091\b\7\1\2\u0091"+
		"\r\3\2\2\2\u0092\u0093\5J&\2\u0093\u0094\7\2\2\3\u0094\u0095\b\b\1\2\u0095"+
		"\17\3\2\2\2\u0096\u0097\5L\'\2\u0097\u0098\7\2\2\3\u0098\u0099\b\t\1\2"+
		"\u0099\21\3\2\2\2\u009a\u009b\5N(\2\u009b\u009c\7\2\2\3\u009c\u009d\b"+
		"\n\1\2\u009d\23\3\2\2\2\u009e\u009f\5P)\2\u009f\u00a0\7\2\2\3\u00a0\u00a1"+
		"\b\13\1\2\u00a1\25\3\2\2\2\u00a2\u00a3\5R*\2\u00a3\u00a4\7\2\2\3\u00a4"+
		"\u00a5\b\f\1\2\u00a5\27\3\2\2\2\u00a6\u00a7\5T+\2\u00a7\u00a8\7\2\2\3"+
		"\u00a8\u00a9\b\r\1\2\u00a9\31\3\2\2\2\u00aa\u00ab\5V,\2\u00ab\u00ac\7"+
		"\2\2\3\u00ac\u00ad\b\16\1\2\u00ad\33\3\2\2\2\u00ae\u00af\5X-\2\u00af\u00b0"+
		"\7\2\2\3\u00b0\u00b1\b\17\1\2\u00b1\35\3\2\2\2\u00b2\u00b3\5Z.\2\u00b3"+
		"\u00b4\7\2\2\3\u00b4\u00b5\b\20\1\2\u00b5\37\3\2\2\2\u00b6\u00b7\5\\/"+
		"\2\u00b7\u00b8\7\2\2\3\u00b8\u00b9\b\21\1\2\u00b9!\3\2\2\2\u00ba\u00bb"+
		"\5^\60\2\u00bb\u00bc\7\2\2\3\u00bc\u00bd\b\22\1\2\u00bd#\3\2\2\2\u00be"+
		"\u00bf\5`\61\2\u00bf\u00c0\7\2\2\3\u00c0\u00c1\b\23\1\2\u00c1%\3\2\2\2"+
		"\u00c2\u00c3\5b\62\2\u00c3\u00c4\7\2\2\3\u00c4\u00c5\b\24\1\2\u00c5\'"+
		"\3\2\2\2\u00c6\u00c7\5d\63\2\u00c7\u00c8\7\2\2\3\u00c8\u00c9\b\25\1\2"+
		"\u00c9)\3\2\2\2\u00ca\u00cb\5f\64\2\u00cb\u00cc\7\2\2\3\u00cc\u00cd\b"+
		"\26\1\2\u00cd+\3\2\2\2\u00ce\u00cf\5h\65\2\u00cf\u00d0\7\2\2\3\u00d0\u00d1"+
		"\b\27\1\2\u00d1-\3\2\2\2\u00d2\u00d3\5j\66\2\u00d3\u00d4\7\2\2\3\u00d4"+
		"\u00d5\b\30\1\2\u00d5/\3\2\2\2\u00d6\u00d7\5l\67\2\u00d7\u00d8\7\2\2\3"+
		"\u00d8\u00d9\b\31\1\2\u00d9\61\3\2\2\2\u00da\u00db\5n8\2\u00db\u00dc\7"+
		"\2\2\3\u00dc\u00dd\b\32\1\2\u00dd\63\3\2\2\2\u00de\u00df\5p9\2\u00df\u00e0"+
		"\7\2\2\3\u00e0\u00e1\b\33\1\2\u00e1\65\3\2\2\2\u00e2\u00e3\5r:\2\u00e3"+
		"\u00e4\7\2\2\3\u00e4\u00e5\b\34\1\2\u00e5\67\3\2\2\2\u00e6\u00e7\5t;\2"+
		"\u00e7\u00e8\7\2\2\3\u00e8\u00e9\b\35\1\2\u00e99\3\2\2\2\u00ea\u00eb\5"+
		"v<\2\u00eb\u00ec\7\2\2\3\u00ec\u00ed\b\36\1\2\u00ed;\3\2\2\2\u00ee\u00ef"+
		"\5x=\2\u00ef\u00f0\7\2\2\3\u00f0\u00f1\b\37\1\2\u00f1=\3\2\2\2\u00f2\u00f3"+
		"\5@!\2\u00f3\u00f4\7\3\2\2\u00f4\u00f5\b \1\2\u00f5\u00fc\3\2\2\2\u00f6"+
		"\u00f7\5@!\2\u00f7\u00f8\7\3\2\2\u00f8\u00f9\5> \2\u00f9\u00fa\b \1\2"+
		"\u00fa\u00fc\3\2\2\2\u00fb\u00f2\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fc?\3"+
		"\2\2\2\u00fd\u00fe\5B\"\2\u00fe\u00ff\b!\1\2\u00ff\u0137\3\2\2\2\u0100"+
		"\u0101\7\6\2\2\u0101\u0102\7\62\2\2\u0102\u0103\7\"\2\2\u0103\u0104\7"+
		"/\2\2\u0104\u0137\b!\1\2\u0105\u0106\7\6\2\2\u0106\u0107\7\62\2\2\u0107"+
		"\u0137\b!\1\2\u0108\u0109\7$\2\2\u0109\u010a\5L\'\2\u010a\u010b\7\7\2"+
		"\2\u010b\u010c\5B\"\2\u010c\u010d\b!\1\2\u010d\u0137\3\2\2\2\u010e\u010f"+
		"\7$\2\2\u010f\u0110\5L\'\2\u0110\u0111\7\7\2\2\u0111\u0112\5B\"\2\u0112"+
		"\u0113\7#\2\2\u0113\u0114\5B\"\2\u0114\u0115\b!\1\2\u0115\u0137\3\2\2"+
		"\2\u0116\u0117\7%\2\2\u0117\u0118\5L\'\2\u0118\u0119\7\7\2\2\u0119\u011a"+
		"\5B\"\2\u011a\u011b\b!\1\2\u011b\u0137\3\2\2\2\u011c\u011d\7%\2\2\u011d"+
		"\u011e\5L\'\2\u011e\u011f\7\7\2\2\u011f\u0120\5B\"\2\u0120\u0121\7#\2"+
		"\2\u0121\u0122\5B\"\2\u0122\u0123\b!\1\2\u0123\u0137\3\2\2\2\u0124\u0125"+
		"\7&\2\2\u0125\u0126\5L\'\2\u0126\u0127\7\7\2\2\u0127\u0128\5n8\2\u0128"+
		"\u0129\b!\1\2\u0129\u0137\3\2\2\2\u012a\u012b\7&\2\2\u012b\u012c\5L\'"+
		"\2\u012c\u012d\7\7\2\2\u012d\u012e\5n8\2\u012e\u012f\7#\2\2\u012f\u0130"+
		"\5B\"\2\u0130\u0131\b!\1\2\u0131\u0137\3\2\2\2\u0132\u0133\5X-\2\u0133"+
		"\u0134\5Z.\2\u0134\u0135\b!\1\2\u0135\u0137\3\2\2\2\u0136\u00fd\3\2\2"+
		"\2\u0136\u0100\3\2\2\2\u0136\u0105\3\2\2\2\u0136\u0108\3\2\2\2\u0136\u010e"+
		"\3\2\2\2\u0136\u0116\3\2\2\2\u0136\u011c\3\2\2\2\u0136\u0124\3\2\2\2\u0136"+
		"\u012a\3\2\2\2\u0136\u0132\3\2\2\2\u0137A\3\2\2\2\u0138\u0139\5D#\2\u0139"+
		"\u013a\b\"\1\2\u013a\u0143\3\2\2\2\u013b\u013c\7\t\2\2\u013c\u013d\5T"+
		"+\2\u013d\u013e\7\n\2\2\u013e\u013f\5> \2\u013f\u0140\7\13\2\2\u0140\u0141"+
		"\b\"\1\2\u0141\u0143\3\2\2\2\u0142\u0138\3\2\2\2\u0142\u013b\3\2\2\2\u0143"+
		"C\3\2\2\2\u0144\u0145\5F$\2\u0145\u0146\b#\1\2\u0146\u015e\3\2\2\2\u0147"+
		"\u0148\7\t\2\2\u0148\u0149\5T+\2\u0149\u014a\7\n\2\2\u014a\u014b\5> \2"+
		"\u014b\u014c\7\13\2\2\u014c\u014d\7\4\2\2\u014d\u014e\5P)\2\u014e\u014f"+
		"\7\5\2\2\u014f\u0150\b#\1\2\u0150\u015e\3\2\2\2\u0151\u0152\7\t\2\2\u0152"+
		"\u0153\5T+\2\u0153\u0154\7\n\2\2\u0154\u0155\5> \2\u0155\u0156\7\13\2"+
		"\2\u0156\u0157\7\f\2\2\u0157\u0158\5n8\2\u0158\u0159\b#\1\2\u0159\u015e"+
		"\3\2\2\2\u015a\u015b\5\\/\2\u015b\u015c\b#\1\2\u015c\u015e\3\2\2\2\u015d"+
		"\u0144\3\2\2\2\u015d\u0147\3\2\2\2\u015d\u0151\3\2\2\2\u015d\u015a\3\2"+
		"\2\2\u015eE\3\2\2\2\u015f\u0160\5H%\2\u0160\u0161\b$\1\2\u0161\u0178\3"+
		"\2\2\2\u0162\u0163\5H%\2\u0163\u0164\7\4\2\2\u0164\u0165\5P)\2\u0165\u0166"+
		"\7\5\2\2\u0166\u0167\b$\1\2\u0167\u0178\3\2\2\2\u0168\u0169\7.\2\2\u0169"+
		"\u0178\b$\1\2\u016a\u016b\7-\2\2\u016b\u0178\b$\1\2\u016c\u016d\7\62\2"+
		"\2\u016d\u0178\b$\1\2\u016e\u016f\7+\2\2\u016f\u0178\b$\1\2\u0170\u0171"+
		"\7,\2\2\u0171\u0178\b$\1\2\u0172\u0173\7\n\2\2\u0173\u0174\5l\67\2\u0174"+
		"\u0175\7\13\2\2\u0175\u0176\b$\1\2\u0176\u0178\3\2\2\2\u0177\u015f\3\2"+
		"\2\2\u0177\u0162\3\2\2\2\u0177\u0168\3\2\2\2\u0177\u016a\3\2\2\2\u0177"+
		"\u016c\3\2\2\2\u0177\u016e\3\2\2\2\u0177\u0170\3\2\2\2\u0177\u0172\3\2"+
		"\2\2\u0178G\3\2\2\2\u0179\u017a\b%\1\2\u017a\u017b\5J&\2\u017b\u017c\b"+
		"%\1\2\u017c\u0185\3\2\2\2\u017d\u017e\7/\2\2\u017e\u0185\b%\1\2\u017f"+
		"\u0180\7/\2\2\u0180\u0181\7\f\2\2\u0181\u0182\5H%\4\u0182\u0183\b%\1\2"+
		"\u0183\u0185\3\2\2\2\u0184\u0179\3\2\2\2\u0184\u017d\3\2\2\2\u0184\u017f"+
		"\3\2\2\2\u0185\u018c\3\2\2\2\u0186\u0187\f\3\2\2\u0187\u0188\7\r\2\2\u0188"+
		"\u0189\7/\2\2\u0189\u018b\b%\1\2\u018a\u0186\3\2\2\2\u018b\u018e\3\2\2"+
		"\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018dI\3\2\2\2\u018e\u018c"+
		"\3\2\2\2\u018f\u0190\7\4\2\2\u0190\u0191\5@!\2\u0191\u0192\7\5\2\2\u0192"+
		"\u0193\b&\1\2\u0193\u019a\3\2\2\2\u0194\u0195\7\4\2\2\u0195\u0196\5> "+
		"\2\u0196\u0197\7\5\2\2\u0197\u0198\b&\1\2\u0198\u019a\3\2\2\2\u0199\u018f"+
		"\3\2\2\2\u0199\u0194\3\2\2\2\u019aK\3\2\2\2\u019b\u019c\7/\2\2\u019c\u019d"+
		"\7\b\2\2\u019d\u019e\5n8\2\u019e\u019f\b\'\1\2\u019f\u01a3\3\2\2\2\u01a0"+
		"\u01a1\7/\2\2\u01a1\u01a3\b\'\1\2\u01a2\u019b\3\2\2\2\u01a2\u01a0\3\2"+
		"\2\2\u01a3M\3\2\2\2\u01a4\u01a5\5@!\2\u01a5\u01a6\b(\1\2\u01a6O\3\2\2"+
		"\2\u01a7\u01b1\b)\1\2\u01a8\u01a9\5N(\2\u01a9\u01aa\b)\1\2\u01aa\u01b1"+
		"\3\2\2\2\u01ab\u01ac\5N(\2\u01ac\u01ad\7\16\2\2\u01ad\u01ae\5P)\2\u01ae"+
		"\u01af\b)\1\2\u01af\u01b1\3\2\2\2\u01b0\u01a7\3\2\2\2\u01b0\u01a8\3\2"+
		"\2\2\u01b0\u01ab\3\2\2\2\u01b1Q\3\2\2\2\u01b2\u01b3\7/\2\2\u01b3\u01b4"+
		"\7\b\2\2\u01b4\u01b5\5n8\2\u01b5\u01b6\b*\1\2\u01b6S\3\2\2\2\u01b7\u01b8"+
		"\5R*\2\u01b8\u01b9\7\r\2\2\u01b9\u01ba\b+\1\2\u01ba\u01c1\3\2\2\2\u01bb"+
		"\u01bc\5R*\2\u01bc\u01bd\7\r\2\2\u01bd\u01be\5T+\2\u01be\u01bf\b+\1\2"+
		"\u01bf\u01c1\3\2\2\2\u01c0\u01b7\3\2\2\2\u01c0\u01bb\3\2\2\2\u01c1U\3"+
		"\2\2\2\u01c2\u01c3\7\17\2\2\u01c3\u01c4\7\4\2\2\u01c4\u01c5\5D#\2\u01c5"+
		"\u01c6\7\5\2\2\u01c6\u01c7\7\b\2\2\u01c7\u01c8\5@!\2\u01c8\u01c9\b,\1"+
		"\2\u01c9W\3\2\2\2\u01ca\u01cb\5V,\2\u01cb\u01cc\b-\1\2\u01cc\u01d2\3\2"+
		"\2\2\u01cd\u01ce\5V,\2\u01ce\u01cf\5X-\2\u01cf\u01d0\b-\1\2\u01d0\u01d2"+
		"\3\2\2\2\u01d1\u01ca\3\2\2\2\u01d1\u01cd\3\2\2\2\u01d2Y\3\2\2\2\u01d3"+
		"\u01d4\7\20\2\2\u01d4\u01d5\5@!\2\u01d5\u01d6\b.\1\2\u01d6[\3\2\2\2\u01d7"+
		"\u01d8\5^\60\2\u01d8\u01d9\b/\1\2\u01d9\u01e0\3\2\2\2\u01da\u01db\5F$"+
		"\2\u01db\u01dc\7(\2\2\u01dc\u01dd\5F$\2\u01dd\u01de\b/\1\2\u01de\u01e0"+
		"\3\2\2\2\u01df\u01d7\3\2\2\2\u01df\u01da\3\2\2\2\u01e0]\3\2\2\2\u01e1"+
		"\u01e2\5`\61\2\u01e2\u01e3\b\60\1\2\u01e3\u01ea\3\2\2\2\u01e4\u01e5\5"+
		"F$\2\u01e5\u01e6\7!\2\2\u01e6\u01e7\5F$\2\u01e7\u01e8\b\60\1\2\u01e8\u01ea"+
		"\3\2\2\2\u01e9\u01e1\3\2\2\2\u01e9\u01e4\3\2\2\2\u01ea_\3\2\2\2\u01eb"+
		"\u01ec\5b\62\2\u01ec\u01ed\b\61\1\2\u01ed\u01f3\3\2\2\2\u01ee\u01ef\7"+
		"\'\2\2\u01ef\u01f0\5F$\2\u01f0\u01f1\b\61\1\2\u01f1\u01f3\3\2\2\2\u01f2"+
		"\u01eb\3\2\2\2\u01f2\u01ee\3\2\2\2\u01f3a\3\2\2\2\u01f4\u01f5\5d\63\2"+
		"\u01f5\u01f6\b\62\1\2\u01f6\u0216\3\2\2\2\u01f7\u01f8\5F$\2\u01f8\u01f9"+
		"\7\25\2\2\u01f9\u01fa\5F$\2\u01fa\u01fb\b\62\1\2\u01fb\u0216\3\2\2\2\u01fc"+
		"\u01fd\5F$\2\u01fd\u01fe\7\26\2\2\u01fe\u01ff\5F$\2\u01ff\u0200\b\62\1"+
		"\2\u0200\u0216\3\2\2\2\u0201\u0202\5F$\2\u0202\u0203\7\27\2\2\u0203\u0204"+
		"\5F$\2\u0204\u0205\b\62\1\2\u0205\u0216\3\2\2\2\u0206\u0207\5F$\2\u0207"+
		"\u0208\7\30\2\2\u0208\u0209\5F$\2\u0209\u020a\b\62\1\2\u020a\u0216\3\2"+
		"\2\2\u020b\u020c\5F$\2\u020c\u020d\7\31\2\2\u020d\u020e\5F$\2\u020e\u020f"+
		"\b\62\1\2\u020f\u0216\3\2\2\2\u0210\u0211\5F$\2\u0211\u0212\7\32\2\2\u0212"+
		"\u0213\5F$\2\u0213\u0214\b\62\1\2\u0214\u0216\3\2\2\2\u0215\u01f4\3\2"+
		"\2\2\u0215\u01f7\3\2\2\2\u0215\u01fc\3\2\2\2\u0215\u0201\3\2\2\2\u0215"+
		"\u0206\3\2\2\2\u0215\u020b\3\2\2\2\u0215\u0210\3\2\2\2\u0216c\3\2\2\2"+
		"\u0217\u0218\5f\64\2\u0218\u0219\b\63\1\2\u0219\u0225\3\2\2\2\u021a\u021b"+
		"\5F$\2\u021b\u021c\7\21\2\2\u021c\u021d\5F$\2\u021d\u021e\b\63\1\2\u021e"+
		"\u0225\3\2\2\2\u021f\u0220\5F$\2\u0220\u0221\7\22\2\2\u0221\u0222\5F$"+
		"\2\u0222\u0223\b\63\1\2\u0223\u0225\3\2\2\2\u0224\u0217\3\2\2\2\u0224"+
		"\u021a\3\2\2\2\u0224\u021f\3\2\2\2\u0225e\3\2\2\2\u0226\u0227\5h\65\2"+
		"\u0227\u0228\b\64\1\2\u0228\u0234\3\2\2\2\u0229\u022a\5F$\2\u022a\u022b"+
		"\7\23\2\2\u022b\u022c\5F$\2\u022c\u022d\b\64\1\2\u022d\u0234\3\2\2\2\u022e"+
		"\u022f\5F$\2\u022f\u0230\7\24\2\2\u0230\u0231\5F$\2\u0231\u0232\b\64\1"+
		"\2\u0232\u0234\3\2\2\2\u0233\u0226\3\2\2\2\u0233\u0229\3\2\2\2\u0233\u022e"+
		"\3\2\2\2\u0234g\3\2\2\2\u0235\u0236\7\4\2\2\u0236\u0237\5\\/\2\u0237\u0238"+
		"\7\5\2\2\u0238\u0239\b\65\1\2\u0239\u0243\3\2\2\2\u023a\u023b\7\21\2\2"+
		"\u023b\u023c\5F$\2\u023c\u023d\b\65\1\2\u023d\u0243\3\2\2\2\u023e\u023f"+
		"\7\22\2\2\u023f\u0240\5F$\2\u0240\u0241\b\65\1\2\u0241\u0243\3\2\2\2\u0242"+
		"\u0235\3\2\2\2\u0242\u023a\3\2\2\2\u0242\u023e\3\2\2\2\u0243i\3\2\2\2"+
		"\u0244\u0245\7/\2\2\u0245\u0246\7\7\2\2\u0246\u0247\5F$\2\u0247\u0248"+
		"\b\66\1\2\u0248k\3\2\2\2\u0249\u0253\b\67\1\2\u024a\u024b\5j\66\2\u024b"+
		"\u024c\b\67\1\2\u024c\u0253\3\2\2\2\u024d\u024e\5j\66\2\u024e\u024f\7"+
		"\16\2\2\u024f\u0250\5l\67\2\u0250\u0251\b\67\1\2\u0251\u0253\3\2\2\2\u0252"+
		"\u0249\3\2\2\2\u0252\u024a\3\2\2\2\u0252\u024d\3\2\2\2\u0253m\3\2\2\2"+
		"\u0254\u0255\5p9\2\u0255\u0256\b8\1\2\u0256o\3\2\2\2\u0257\u0258\b9\1"+
		"\2\u0258\u0259\5r:\2\u0259\u025a\b9\1\2\u025a\u0262\3\2\2\2\u025b\u025c"+
		"\f\3\2\2\u025c\u025d\7\f\2\2\u025d\u025e\5r:\2\u025e\u025f\b9\1\2\u025f"+
		"\u0261\3\2\2\2\u0260\u025b\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2"+
		"\2\2\u0262\u0263\3\2\2\2\u0263q\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0266"+
		"\5t;\2\u0266\u0267\b:\1\2\u0267\u027c\3\2\2\2\u0268\u0269\7/\2\2\u0269"+
		"\u027c\b:\1\2\u026a\u026b\7\35\2\2\u026b\u027c\b:\1\2\u026c\u026d\7\36"+
		"\2\2\u026d\u027c\b:\1\2\u026e\u026f\7\34\2\2\u026f\u027c\b:\1\2\u0270"+
		"\u0271\7\37\2\2\u0271\u027c\b:\1\2\u0272\u0273\7 \2\2\u0273\u027c\b:\1"+
		"\2\u0274\u0275\7\33\2\2\u0275\u027c\b:\1\2\u0276\u0277\7\n\2\2\u0277\u0278"+
		"\5x=\2\u0278\u0279\7\13\2\2\u0279\u027a\b:\1\2\u027a\u027c\3\2\2\2\u027b"+
		"\u0265\3\2\2\2\u027b\u0268\3\2\2\2\u027b\u026a\3\2\2\2\u027b\u026c\3\2"+
		"\2\2\u027b\u026e\3\2\2\2\u027b\u0270\3\2\2\2\u027b\u0272\3\2\2\2\u027b"+
		"\u0274\3\2\2\2\u027b\u0276\3\2\2\2\u027cs\3\2\2\2\u027d\u027e\7\4\2\2"+
		"\u027e\u027f\5n8\2\u027f\u0280\7\5\2\2\u0280\u0281\b;\1\2\u0281u\3\2\2"+
		"\2\u0282\u0283\7/\2\2\u0283\u0284\7\b\2\2\u0284\u0285\5n8\2\u0285\u0286"+
		"\b<\1\2\u0286w\3\2\2\2\u0287\u0291\b=\1\2\u0288\u0289\5v<\2\u0289\u028a"+
		"\b=\1\2\u028a\u0291\3\2\2\2\u028b\u028c\5v<\2\u028c\u028d\7\16\2\2\u028d"+
		"\u028e\5x=\2\u028e\u028f\b=\1\2\u028f\u0291\3\2\2\2\u0290\u0287\3\2\2"+
		"\2\u0290\u0288\3\2\2\2\u0290\u028b\3\2\2\2\u0291y\3\2\2\2\31\u00fb\u0136"+
		"\u0142\u015d\u0177\u0184\u018c\u0199\u01a2\u01b0\u01c0\u01d1\u01df\u01e9"+
		"\u01f2\u0215\u0224\u0233\u0242\u0252\u0262\u027b\u0290";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}