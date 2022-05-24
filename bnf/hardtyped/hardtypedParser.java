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
		MULTICOMMENT_antlr_builtin=39, Bool=40, Unit=41, Print=42, ReadReal=43, 
		ReadInt=44, ReadString=45, ReadBool=46, PackageExtension=47, DOUBLE=48, 
		INTEGER=49, IDENT=50, WS=51, ErrorToken=52, STRING=53, STRINGESC=54;
	public static final int
		RULE_start_ListExpr = 0, RULE_start_Expr = 1, RULE_start_Expr1 = 2, RULE_start_Expr2 = 3, 
		RULE_start_Expr3 = 4, RULE_start_Expr4 = 5, RULE_start_ModuleIdentifier = 6, 
		RULE_start_ImportFileName = 7, RULE_start_Path = 8, RULE_start_ListPath = 9, 
		RULE_start_Let = 10, RULE_start_VarDec = 11, RULE_start_VarName = 12, 
		RULE_start_VarPath = 13, RULE_start_ListVarPath = 14, RULE_start_ExprSequence = 15, 
		RULE_start_ListExprSequence = 16, RULE_start_FuncArg = 17, RULE_start_ListFuncArg = 18, 
		RULE_start_IfExpr = 19, RULE_start_ListIfExpr = 20, RULE_start_ElseExpr = 21, 
		RULE_start_Op = 22, RULE_start_Op1 = 23, RULE_start_Op2 = 24, RULE_start_Op3 = 25, 
		RULE_start_Type = 26, RULE_start_Type1 = 27, RULE_start_Type2 = 28, RULE_start_Record = 29, 
		RULE_start_ListRecord = 30, RULE_listExpr = 31, RULE_expr = 32, RULE_expr1 = 33, 
		RULE_expr2 = 34, RULE_expr3 = 35, RULE_expr4 = 36, RULE_moduleIdentifier = 37, 
		RULE_importFileName = 38, RULE_path = 39, RULE_listPath = 40, RULE_let = 41, 
		RULE_varDec = 42, RULE_varName = 43, RULE_varPath = 44, RULE_listVarPath = 45, 
		RULE_exprSequence = 46, RULE_listExprSequence = 47, RULE_funcArg = 48, 
		RULE_listFuncArg = 49, RULE_ifExpr = 50, RULE_listIfExpr = 51, RULE_elseExpr = 52, 
		RULE_op = 53, RULE_op1 = 54, RULE_op2 = 55, RULE_op3 = 56, RULE_type = 57, 
		RULE_type1 = 58, RULE_type2 = 59, RULE_record = 60, RULE_listRecord = 61;
	public static final String[] ruleNames = {
		"start_ListExpr", "start_Expr", "start_Expr1", "start_Expr2", "start_Expr3", 
		"start_Expr4", "start_ModuleIdentifier", "start_ImportFileName", "start_Path", 
		"start_ListPath", "start_Let", "start_VarDec", "start_VarName", "start_VarPath", 
		"start_ListVarPath", "start_ExprSequence", "start_ListExprSequence", "start_FuncArg", 
		"start_ListFuncArg", "start_IfExpr", "start_ListIfExpr", "start_ElseExpr", 
		"start_Op", "start_Op1", "start_Op2", "start_Op3", "start_Type", "start_Type1", 
		"start_Type2", "start_Record", "start_ListRecord", "listExpr", "expr", 
		"expr1", "expr2", "expr3", "expr4", "moduleIdentifier", "importFileName", 
		"path", "listPath", "let", "varDec", "varName", "varPath", "listVarPath", 
		"exprSequence", "listExprSequence", "funcArg", "listFuncArg", "ifExpr", 
		"listIfExpr", "elseExpr", "op", "op1", "op2", "op3", "type", "type1", 
		"type2", "record", "listRecord"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'-|'", "'.'", "'/'", "'='", "':'", "'/\\'", 
		"'{'", "'}'", "','", "'|'", "'|:'", "'+'", "'-'", "'*'", "'>'", "'>='", 
		"'=='", "'!='", "'<='", "'<'", "'->'", "'Any'", "'Bool'", "'Int'", "'Real'", 
		"'String'", "'Unit'", "'and'", "'in'", "'let'", "'letrec'", "'lettype'", 
		"'not'", "'or'", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'\"'", "'\\'"
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
		"MULTICOMMENT_antlr_builtin", "Bool", "Unit", "Print", "ReadReal", "ReadInt", 
		"ReadString", "ReadBool", "PackageExtension", "DOUBLE", "INTEGER", "IDENT", 
		"WS", "ErrorToken", "STRING", "STRINGESC"
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
			setState(124);
			((Start_ListExprContext)_localctx).x = listExpr();
			setState(125);
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
			setState(128);
			((Start_ExprContext)_localctx).x = expr();
			setState(129);
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
			setState(132);
			((Start_Expr1Context)_localctx).x = expr1();
			setState(133);
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
			setState(136);
			((Start_Expr2Context)_localctx).x = expr2();
			setState(137);
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
			setState(140);
			((Start_Expr3Context)_localctx).x = expr3();
			setState(141);
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
			setState(144);
			((Start_Expr4Context)_localctx).x = expr4();
			setState(145);
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

	public static class Start_ModuleIdentifierContext extends ParserRuleContext {
		public hardtyped.Absyn.ModuleIdentifier result;
		public ModuleIdentifierContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public ModuleIdentifierContext moduleIdentifier() {
			return getRuleContext(ModuleIdentifierContext.class,0);
		}
		public Start_ModuleIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ModuleIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_ModuleIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_ModuleIdentifier(this);
		}
	}

	public final Start_ModuleIdentifierContext start_ModuleIdentifier() throws RecognitionException {
		Start_ModuleIdentifierContext _localctx = new Start_ModuleIdentifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_start_ModuleIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((Start_ModuleIdentifierContext)_localctx).x = moduleIdentifier();
			setState(149);
			match(EOF);
			 ((Start_ModuleIdentifierContext)_localctx).result =  ((Start_ModuleIdentifierContext)_localctx).x.result; 
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

	public static class Start_ImportFileNameContext extends ParserRuleContext {
		public hardtyped.Absyn.ImportFileName result;
		public ImportFileNameContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public ImportFileNameContext importFileName() {
			return getRuleContext(ImportFileNameContext.class,0);
		}
		public Start_ImportFileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ImportFileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_ImportFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_ImportFileName(this);
		}
	}

	public final Start_ImportFileNameContext start_ImportFileName() throws RecognitionException {
		Start_ImportFileNameContext _localctx = new Start_ImportFileNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_start_ImportFileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			((Start_ImportFileNameContext)_localctx).x = importFileName();
			setState(153);
			match(EOF);
			 ((Start_ImportFileNameContext)_localctx).result =  ((Start_ImportFileNameContext)_localctx).x.result; 
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

	public static class Start_PathContext extends ParserRuleContext {
		public hardtyped.Absyn.Path result;
		public PathContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public Start_PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_Path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_Path(this);
		}
	}

	public final Start_PathContext start_Path() throws RecognitionException {
		Start_PathContext _localctx = new Start_PathContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_start_Path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			((Start_PathContext)_localctx).x = path();
			setState(157);
			match(EOF);
			 ((Start_PathContext)_localctx).result =  ((Start_PathContext)_localctx).x.result; 
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

	public static class Start_ListPathContext extends ParserRuleContext {
		public hardtyped.Absyn.ListPath result;
		public ListPathContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public ListPathContext listPath() {
			return getRuleContext(ListPathContext.class,0);
		}
		public Start_ListPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_ListPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_ListPath(this);
		}
	}

	public final Start_ListPathContext start_ListPath() throws RecognitionException {
		Start_ListPathContext _localctx = new Start_ListPathContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_start_ListPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			((Start_ListPathContext)_localctx).x = listPath(0);
			setState(161);
			match(EOF);
			 ((Start_ListPathContext)_localctx).result =  ((Start_ListPathContext)_localctx).x.result; 
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
		enterRule(_localctx, 20, RULE_start_Let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((Start_LetContext)_localctx).x = let();
			setState(165);
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
		enterRule(_localctx, 22, RULE_start_VarDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			((Start_VarDecContext)_localctx).x = varDec();
			setState(169);
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

	public static class Start_VarNameContext extends ParserRuleContext {
		public hardtyped.Absyn.VarName result;
		public VarNameContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public Start_VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_VarName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_VarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_VarName(this);
		}
	}

	public final Start_VarNameContext start_VarName() throws RecognitionException {
		Start_VarNameContext _localctx = new Start_VarNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_start_VarName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((Start_VarNameContext)_localctx).x = varName();
			setState(173);
			match(EOF);
			 ((Start_VarNameContext)_localctx).result =  ((Start_VarNameContext)_localctx).x.result; 
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

	public static class Start_VarPathContext extends ParserRuleContext {
		public hardtyped.Absyn.VarPath result;
		public VarPathContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public VarPathContext varPath() {
			return getRuleContext(VarPathContext.class,0);
		}
		public Start_VarPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_VarPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_VarPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_VarPath(this);
		}
	}

	public final Start_VarPathContext start_VarPath() throws RecognitionException {
		Start_VarPathContext _localctx = new Start_VarPathContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_start_VarPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			((Start_VarPathContext)_localctx).x = varPath();
			setState(177);
			match(EOF);
			 ((Start_VarPathContext)_localctx).result =  ((Start_VarPathContext)_localctx).x.result; 
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

	public static class Start_ListVarPathContext extends ParserRuleContext {
		public hardtyped.Absyn.ListVarPath result;
		public ListVarPathContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public ListVarPathContext listVarPath() {
			return getRuleContext(ListVarPathContext.class,0);
		}
		public Start_ListVarPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListVarPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_ListVarPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_ListVarPath(this);
		}
	}

	public final Start_ListVarPathContext start_ListVarPath() throws RecognitionException {
		Start_ListVarPathContext _localctx = new Start_ListVarPathContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_start_ListVarPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			((Start_ListVarPathContext)_localctx).x = listVarPath(0);
			setState(181);
			match(EOF);
			 ((Start_ListVarPathContext)_localctx).result =  ((Start_ListVarPathContext)_localctx).x.result; 
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
		enterRule(_localctx, 30, RULE_start_ExprSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			((Start_ExprSequenceContext)_localctx).x = exprSequence();
			setState(185);
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
		enterRule(_localctx, 32, RULE_start_ListExprSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			((Start_ListExprSequenceContext)_localctx).x = listExprSequence();
			setState(189);
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
		enterRule(_localctx, 34, RULE_start_FuncArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((Start_FuncArgContext)_localctx).x = funcArg();
			setState(193);
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
		enterRule(_localctx, 36, RULE_start_ListFuncArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			((Start_ListFuncArgContext)_localctx).x = listFuncArg(0);
			setState(197);
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
		enterRule(_localctx, 38, RULE_start_IfExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			((Start_IfExprContext)_localctx).x = ifExpr();
			setState(201);
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
		enterRule(_localctx, 40, RULE_start_ListIfExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			((Start_ListIfExprContext)_localctx).x = listIfExpr(0);
			setState(205);
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
		enterRule(_localctx, 42, RULE_start_ElseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			((Start_ElseExprContext)_localctx).x = elseExpr();
			setState(209);
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
		enterRule(_localctx, 44, RULE_start_Op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			((Start_OpContext)_localctx).x = op();
			setState(213);
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
		enterRule(_localctx, 46, RULE_start_Op1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			((Start_Op1Context)_localctx).x = op1();
			setState(217);
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
		enterRule(_localctx, 48, RULE_start_Op2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			((Start_Op2Context)_localctx).x = op2();
			setState(221);
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
		enterRule(_localctx, 50, RULE_start_Op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			((Start_Op3Context)_localctx).x = op3();
			setState(225);
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
		enterRule(_localctx, 52, RULE_start_Type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			((Start_TypeContext)_localctx).x = type(0);
			setState(229);
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
		enterRule(_localctx, 54, RULE_start_Type1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			((Start_Type1Context)_localctx).x = type1();
			setState(233);
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
		enterRule(_localctx, 56, RULE_start_Type2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			((Start_Type2Context)_localctx).x = type2();
			setState(237);
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
		enterRule(_localctx, 58, RULE_start_Record);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			((Start_RecordContext)_localctx).x = record();
			setState(241);
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

	public static class Start_ListRecordContext extends ParserRuleContext {
		public hardtyped.Absyn.ListRecord result;
		public ListRecordContext x;
		public TerminalNode EOF() { return getToken(hardtypedParser.EOF, 0); }
		public ListRecordContext listRecord() {
			return getRuleContext(ListRecordContext.class,0);
		}
		public Start_ListRecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ListRecord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterStart_ListRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitStart_ListRecord(this);
		}
	}

	public final Start_ListRecordContext start_ListRecord() throws RecognitionException {
		Start_ListRecordContext _localctx = new Start_ListRecordContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_start_ListRecord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			((Start_ListRecordContext)_localctx).x = listRecord();
			setState(245);
			match(EOF);
			 ((Start_ListRecordContext)_localctx).result =  ((Start_ListRecordContext)_localctx).x.result; 
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
		enterRule(_localctx, 62, RULE_listExpr);
		try {
			setState(257);
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
				setState(249);
				((ListExprContext)_localctx).p_2_1 = expr();
				 ((ListExprContext)_localctx).result =  new hardtyped.Absyn.ListExpr(); _localctx.result.addLast(((ListExprContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				((ListExprContext)_localctx).p_3_1 = expr();
				setState(253);
				match(Surrogate_id_SYMB_0);
				setState(254);
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
		public Expr1Context p_1_1;
		public ModuleIdentifierContext p_2_2;
		public LetContext p_3_1;
		public ListIfExprContext p_4_1;
		public ElseExprContext p_4_2;
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_3() { return getToken(hardtypedParser.Surrogate_id_SYMB_3, 0); }
		public ModuleIdentifierContext moduleIdentifier() {
			return getRuleContext(ModuleIdentifierContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
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
		enterRule(_localctx, 64, RULE_expr);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				((ExprContext)_localctx).p_1_1 = expr1();
				 ((ExprContext)_localctx).result =  ((ExprContext)_localctx).p_1_1.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(Surrogate_id_SYMB_3);
				setState(263);
				((ExprContext)_localctx).p_2_2 = moduleIdentifier();
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.Import(((ExprContext)_localctx).p_2_2.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				((ExprContext)_localctx).p_3_1 = let();
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.BaseLet(((ExprContext)_localctx).p_3_1.result); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				((ExprContext)_localctx).p_4_1 = listIfExpr(0);
				setState(270);
				((ExprContext)_localctx).p_4_2 = elseExpr();
				 ((ExprContext)_localctx).result =  new hardtyped.Absyn.IfStmt(((ExprContext)_localctx).p_4_1.result,((ExprContext)_localctx).p_4_2.result); 
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
		public VarNameContext p_3_1;
		public ListExprSequenceContext p_3_3;
		public Token p_4_1;
		public ExprContext p_4_3;
		public Token p_5_1;
		public ListExprSequenceContext p_5_3;
		public Token p_6_1;
		public ListExprSequenceContext p_6_3;
		public Token p_7_1;
		public ListExprSequenceContext p_7_3;
		public Token p_8_1;
		public ListExprSequenceContext p_8_3;
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_8() { return getToken(hardtypedParser.Surrogate_id_SYMB_8, 0); }
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(hardtypedParser.Surrogate_id_SYMB_9, 0); }
		public TerminalNode Surrogate_id_SYMB_10() { return getToken(hardtypedParser.Surrogate_id_SYMB_10, 0); }
		public ListFuncArgContext listFuncArg() {
			return getRuleContext(ListFuncArgContext.class,0);
		}
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(hardtypedParser.Surrogate_id_SYMB_1, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(hardtypedParser.Surrogate_id_SYMB_2, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ListExprSequenceContext listExprSequence() {
			return getRuleContext(ListExprSequenceContext.class,0);
		}
		public TerminalNode Print() { return getToken(hardtypedParser.Print, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ReadReal() { return getToken(hardtypedParser.ReadReal, 0); }
		public TerminalNode ReadInt() { return getToken(hardtypedParser.ReadInt, 0); }
		public TerminalNode ReadString() { return getToken(hardtypedParser.ReadString, 0); }
		public TerminalNode ReadBool() { return getToken(hardtypedParser.ReadBool, 0); }
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
		enterRule(_localctx, 66, RULE_expr1);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				((Expr1Context)_localctx).p_1_1 = expr2();
				 ((Expr1Context)_localctx).result =  ((Expr1Context)_localctx).p_1_1.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(Surrogate_id_SYMB_8);
				setState(279);
				((Expr1Context)_localctx).p_2_2 = listFuncArg(0);
				setState(280);
				match(Surrogate_id_SYMB_9);
				setState(281);
				((Expr1Context)_localctx).p_2_4 = listExpr();
				setState(282);
				match(Surrogate_id_SYMB_10);
				 ((Expr1Context)_localctx).result =  new hardtyped.Absyn.Function(((Expr1Context)_localctx).p_2_2.result,((Expr1Context)_localctx).p_2_4.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				((Expr1Context)_localctx).p_3_1 = varName();
				setState(286);
				match(Surrogate_id_SYMB_1);
				setState(287);
				((Expr1Context)_localctx).p_3_3 = listExprSequence();
				setState(288);
				match(Surrogate_id_SYMB_2);
				 ((Expr1Context)_localctx).result =  new hardtyped.Absyn.Application(((Expr1Context)_localctx).p_3_1.result,((Expr1Context)_localctx).p_3_3.result); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				((Expr1Context)_localctx).p_4_1 = match(Print);
				setState(292);
				match(Surrogate_id_SYMB_1);
				setState(293);
				((Expr1Context)_localctx).p_4_3 = expr();
				setState(294);
				match(Surrogate_id_SYMB_2);
				 ((Expr1Context)_localctx).result =  new hardtyped.Absyn.PrintFunction(((Expr1Context)_localctx).p_4_1.getText(),((Expr1Context)_localctx).p_4_3.result); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				((Expr1Context)_localctx).p_5_1 = match(ReadReal);
				setState(298);
				match(Surrogate_id_SYMB_1);
				setState(299);
				((Expr1Context)_localctx).p_5_3 = listExprSequence();
				setState(300);
				match(Surrogate_id_SYMB_2);
				 ((Expr1Context)_localctx).result =  new hardtyped.Absyn.ReadRealFunction(((Expr1Context)_localctx).p_5_1.getText(),((Expr1Context)_localctx).p_5_3.result); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(303);
				((Expr1Context)_localctx).p_6_1 = match(ReadInt);
				setState(304);
				match(Surrogate_id_SYMB_1);
				setState(305);
				((Expr1Context)_localctx).p_6_3 = listExprSequence();
				setState(306);
				match(Surrogate_id_SYMB_2);
				 ((Expr1Context)_localctx).result =  new hardtyped.Absyn.ReadIntFunction(((Expr1Context)_localctx).p_6_1.getText(),((Expr1Context)_localctx).p_6_3.result); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(309);
				((Expr1Context)_localctx).p_7_1 = match(ReadString);
				setState(310);
				match(Surrogate_id_SYMB_1);
				setState(311);
				((Expr1Context)_localctx).p_7_3 = listExprSequence();
				setState(312);
				match(Surrogate_id_SYMB_2);
				 ((Expr1Context)_localctx).result =  new hardtyped.Absyn.ReadStringFunction(((Expr1Context)_localctx).p_7_1.getText(),((Expr1Context)_localctx).p_7_3.result); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(315);
				((Expr1Context)_localctx).p_8_1 = match(ReadBool);
				setState(316);
				match(Surrogate_id_SYMB_1);
				setState(317);
				((Expr1Context)_localctx).p_8_3 = listExprSequence();
				setState(318);
				match(Surrogate_id_SYMB_2);
				 ((Expr1Context)_localctx).result =  new hardtyped.Absyn.ReadBoolFunction(((Expr1Context)_localctx).p_8_1.getText(),((Expr1Context)_localctx).p_8_3.result); 
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
		public OpContext p_2_1;
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
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
		enterRule(_localctx, 68, RULE_expr2);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				((Expr2Context)_localctx).p_1_1 = expr3();
				 ((Expr2Context)_localctx).result =  ((Expr2Context)_localctx).p_1_1.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				((Expr2Context)_localctx).p_2_1 = op();
				 ((Expr2Context)_localctx).result =  new hardtyped.Absyn.Operation(((Expr2Context)_localctx).p_2_1.result); 
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
		public Token p_2_1;
		public Token p_3_1;
		public Token p_4_1;
		public Token p_5_1;
		public Token p_6_1;
		public Token p_7_1;
		public ListRecordContext p_8_2;
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public TerminalNode IDENT() { return getToken(hardtypedParser.IDENT, 0); }
		public TerminalNode INTEGER() { return getToken(hardtypedParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(hardtypedParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(hardtypedParser.STRING, 0); }
		public TerminalNode Bool() { return getToken(hardtypedParser.Bool, 0); }
		public TerminalNode Unit() { return getToken(hardtypedParser.Unit, 0); }
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(hardtypedParser.Surrogate_id_SYMB_9, 0); }
		public TerminalNode Surrogate_id_SYMB_10() { return getToken(hardtypedParser.Surrogate_id_SYMB_10, 0); }
		public ListRecordContext listRecord() {
			return getRuleContext(ListRecordContext.class,0);
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
		enterRule(_localctx, 70, RULE_expr3);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				((Expr3Context)_localctx).p_1_1 = expr4();
				 ((Expr3Context)_localctx).result =  ((Expr3Context)_localctx).p_1_1.result; 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				((Expr3Context)_localctx).p_2_1 = match(IDENT);
				 ((Expr3Context)_localctx).result =  new hardtyped.Absyn.AtomicExpr(((Expr3Context)_localctx).p_2_1.getText()); 
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				((Expr3Context)_localctx).p_3_1 = match(INTEGER);
				 ((Expr3Context)_localctx).result =  new hardtyped.Absyn.IntValue(Integer.parseInt(((Expr3Context)_localctx).p_3_1.getText())); 
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				((Expr3Context)_localctx).p_4_1 = match(DOUBLE);
				 ((Expr3Context)_localctx).result =  new hardtyped.Absyn.RealValue(Double.parseDouble(((Expr3Context)_localctx).p_4_1.getText())); 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(340);
				((Expr3Context)_localctx).p_5_1 = match(STRING);
				 ((Expr3Context)_localctx).result =  new hardtyped.Absyn.StringValue(((Expr3Context)_localctx).p_5_1.getText().substring(1, ((Expr3Context)_localctx).p_5_1.getText().length()-1)); 
				}
				break;
			case Bool:
				enterOuterAlt(_localctx, 6);
				{
				setState(342);
				((Expr3Context)_localctx).p_6_1 = match(Bool);
				 ((Expr3Context)_localctx).result =  new hardtyped.Absyn.BoolValue(((Expr3Context)_localctx).p_6_1.getText()); 
				}
				break;
			case Unit:
				enterOuterAlt(_localctx, 7);
				{
				setState(344);
				((Expr3Context)_localctx).p_7_1 = match(Unit);
				 ((Expr3Context)_localctx).result =  new hardtyped.Absyn.UnitValue(((Expr3Context)_localctx).p_7_1.getText()); 
				}
				break;
			case Surrogate_id_SYMB_9:
				enterOuterAlt(_localctx, 8);
				{
				setState(346);
				match(Surrogate_id_SYMB_9);
				setState(347);
				((Expr3Context)_localctx).p_8_2 = listRecord();
				setState(348);
				match(Surrogate_id_SYMB_10);
				 ((Expr3Context)_localctx).result =  new hardtyped.Absyn.RecordConstr(((Expr3Context)_localctx).p_8_2.result); 
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

	public static class Expr4Context extends ParserRuleContext {
		public hardtyped.Absyn.Expr result;
		public ExprContext p_1_2;
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(hardtypedParser.Surrogate_id_SYMB_1, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(hardtypedParser.Surrogate_id_SYMB_2, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		Expr4Context _localctx = new Expr4Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_expr4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(Surrogate_id_SYMB_1);
			setState(354);
			((Expr4Context)_localctx).p_1_2 = expr();
			setState(355);
			match(Surrogate_id_SYMB_2);
			 ((Expr4Context)_localctx).result =  ((Expr4Context)_localctx).p_1_2.result; 
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

	public static class ModuleIdentifierContext extends ParserRuleContext {
		public hardtyped.Absyn.ModuleIdentifier result;
		public ListPathContext p_1_1;
		public ImportFileNameContext p_1_2;
		public ListPathContext listPath() {
			return getRuleContext(ListPathContext.class,0);
		}
		public ImportFileNameContext importFileName() {
			return getRuleContext(ImportFileNameContext.class,0);
		}
		public ModuleIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterModuleIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitModuleIdentifier(this);
		}
	}

	public final ModuleIdentifierContext moduleIdentifier() throws RecognitionException {
		ModuleIdentifierContext _localctx = new ModuleIdentifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_moduleIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			((ModuleIdentifierContext)_localctx).p_1_1 = listPath(0);
			setState(359);
			((ModuleIdentifierContext)_localctx).p_1_2 = importFileName();
			 ((ModuleIdentifierContext)_localctx).result =  new hardtyped.Absyn.ImportPath(((ModuleIdentifierContext)_localctx).p_1_1.result,((ModuleIdentifierContext)_localctx).p_1_2.result); 
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

	public static class ImportFileNameContext extends ParserRuleContext {
		public hardtyped.Absyn.ImportFileName result;
		public Token p_1_1;
		public Token p_1_3;
		public TerminalNode Surrogate_id_SYMB_4() { return getToken(hardtypedParser.Surrogate_id_SYMB_4, 0); }
		public TerminalNode IDENT() { return getToken(hardtypedParser.IDENT, 0); }
		public TerminalNode PackageExtension() { return getToken(hardtypedParser.PackageExtension, 0); }
		public ImportFileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterImportFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitImportFileName(this);
		}
	}

	public final ImportFileNameContext importFileName() throws RecognitionException {
		ImportFileNameContext _localctx = new ImportFileNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_importFileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			((ImportFileNameContext)_localctx).p_1_1 = match(IDENT);
			setState(363);
			match(Surrogate_id_SYMB_4);
			setState(364);
			((ImportFileNameContext)_localctx).p_1_3 = match(PackageExtension);
			 ((ImportFileNameContext)_localctx).result =  new hardtyped.Absyn.ImportFile(((ImportFileNameContext)_localctx).p_1_1.getText(),((ImportFileNameContext)_localctx).p_1_3.getText()); 
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

	public static class PathContext extends ParserRuleContext {
		public hardtyped.Absyn.Path result;
		public Token p_1_1;
		public TerminalNode IDENT() { return getToken(hardtypedParser.IDENT, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitPath(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			((PathContext)_localctx).p_1_1 = match(IDENT);
			 ((PathContext)_localctx).result =  new hardtyped.Absyn.BasePath(((PathContext)_localctx).p_1_1.getText()); 
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

	public static class ListPathContext extends ParserRuleContext {
		public hardtyped.Absyn.ListPath result;
		public ListPathContext p_2_1;
		public PathContext p_2_2;
		public TerminalNode Surrogate_id_SYMB_5() { return getToken(hardtypedParser.Surrogate_id_SYMB_5, 0); }
		public ListPathContext listPath() {
			return getRuleContext(ListPathContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public ListPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterListPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitListPath(this);
		}
	}

	public final ListPathContext listPath() throws RecognitionException {
		return listPath(0);
	}

	private ListPathContext listPath(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListPathContext _localctx = new ListPathContext(_ctx, _parentState);
		ListPathContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_listPath, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			 ((ListPathContext)_localctx).result =  new hardtyped.Absyn.ListPath(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListPathContext(_parentctx, _parentState);
					_localctx.p_2_1 = _prevctx;
					_localctx.p_2_1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listPath);
					setState(373);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(374);
					((ListPathContext)_localctx).p_2_2 = path();
					setState(375);
					match(Surrogate_id_SYMB_5);
					 ((ListPathContext)_localctx).result =  ((ListPathContext)_localctx).p_2_1.result; _localctx.result.addLast(((ListPathContext)_localctx).p_2_2.result); 
					}
					} 
				}
				setState(382);
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

	public static class LetContext extends ParserRuleContext {
		public hardtyped.Absyn.Let result;
		public VarDecContext p_1_2;
		public Expr1Context p_1_4;
		public VarDecContext p_2_2;
		public Expr1Context p_2_4;
		public Expr1Context p_2_6;
		public VarDecContext p_3_2;
		public Expr1Context p_3_4;
		public ListExprContext p_3_7;
		public VarDecContext p_4_2;
		public Expr1Context p_4_4;
		public VarDecContext p_5_2;
		public TypeContext p_5_4;
		public TerminalNode Surrogate_id_SYMB_32() { return getToken(hardtypedParser.Surrogate_id_SYMB_32, 0); }
		public TerminalNode Surrogate_id_SYMB_6() { return getToken(hardtypedParser.Surrogate_id_SYMB_6, 0); }
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode Surrogate_id_SYMB_31() { return getToken(hardtypedParser.Surrogate_id_SYMB_31, 0); }
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(hardtypedParser.Surrogate_id_SYMB_1, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(hardtypedParser.Surrogate_id_SYMB_2, 0); }
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_33() { return getToken(hardtypedParser.Surrogate_id_SYMB_33, 0); }
		public TerminalNode Surrogate_id_SYMB_34() { return getToken(hardtypedParser.Surrogate_id_SYMB_34, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
		enterRule(_localctx, 82, RULE_let);
		try {
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(Surrogate_id_SYMB_32);
				setState(384);
				((LetContext)_localctx).p_1_2 = varDec();
				setState(385);
				match(Surrogate_id_SYMB_6);
				setState(386);
				((LetContext)_localctx).p_1_4 = expr1();
				 ((LetContext)_localctx).result =  new hardtyped.Absyn.LetVariable(((LetContext)_localctx).p_1_2.result,((LetContext)_localctx).p_1_4.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(Surrogate_id_SYMB_32);
				setState(390);
				((LetContext)_localctx).p_2_2 = varDec();
				setState(391);
				match(Surrogate_id_SYMB_6);
				setState(392);
				((LetContext)_localctx).p_2_4 = expr1();
				setState(393);
				match(Surrogate_id_SYMB_31);
				setState(394);
				((LetContext)_localctx).p_2_6 = expr1();
				 ((LetContext)_localctx).result =  new hardtyped.Absyn.LetInference(((LetContext)_localctx).p_2_2.result,((LetContext)_localctx).p_2_4.result,((LetContext)_localctx).p_2_6.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				match(Surrogate_id_SYMB_32);
				setState(398);
				((LetContext)_localctx).p_3_2 = varDec();
				setState(399);
				match(Surrogate_id_SYMB_6);
				setState(400);
				((LetContext)_localctx).p_3_4 = expr1();
				setState(401);
				match(Surrogate_id_SYMB_31);
				setState(402);
				match(Surrogate_id_SYMB_1);
				setState(403);
				((LetContext)_localctx).p_3_7 = listExpr();
				setState(404);
				match(Surrogate_id_SYMB_2);
				 ((LetContext)_localctx).result =  new hardtyped.Absyn.LetInferenceMany(((LetContext)_localctx).p_3_2.result,((LetContext)_localctx).p_3_4.result,((LetContext)_localctx).p_3_7.result); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(407);
				match(Surrogate_id_SYMB_33);
				setState(408);
				((LetContext)_localctx).p_4_2 = varDec();
				setState(409);
				match(Surrogate_id_SYMB_6);
				setState(410);
				((LetContext)_localctx).p_4_4 = expr1();
				 ((LetContext)_localctx).result =  new hardtyped.Absyn.LetRec(((LetContext)_localctx).p_4_2.result,((LetContext)_localctx).p_4_4.result); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(413);
				match(Surrogate_id_SYMB_34);
				setState(414);
				((LetContext)_localctx).p_5_2 = varDec();
				setState(415);
				match(Surrogate_id_SYMB_6);
				setState(416);
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

	public static class VarDecContext extends ParserRuleContext {
		public hardtyped.Absyn.VarDec result;
		public Token p_1_1;
		public TypeContext p_1_3;
		public Token p_2_1;
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(hardtypedParser.Surrogate_id_SYMB_7, 0); }
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
		enterRule(_localctx, 84, RULE_varDec);
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				((VarDecContext)_localctx).p_1_1 = match(IDENT);
				setState(422);
				match(Surrogate_id_SYMB_7);
				setState(423);
				((VarDecContext)_localctx).p_1_3 = type(0);
				 ((VarDecContext)_localctx).result =  new hardtyped.Absyn.TypedVar(((VarDecContext)_localctx).p_1_1.getText(),((VarDecContext)_localctx).p_1_3.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
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

	public static class VarNameContext extends ParserRuleContext {
		public hardtyped.Absyn.VarName result;
		public ListVarPathContext p_1_1;
		public Token p_1_2;
		public ListVarPathContext listVarPath() {
			return getRuleContext(ListVarPathContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(hardtypedParser.IDENT, 0); }
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitVarName(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			((VarNameContext)_localctx).p_1_1 = listVarPath(0);
			setState(431);
			((VarNameContext)_localctx).p_1_2 = match(IDENT);
			 ((VarNameContext)_localctx).result =  new hardtyped.Absyn.Func(((VarNameContext)_localctx).p_1_1.result,((VarNameContext)_localctx).p_1_2.getText()); 
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

	public static class VarPathContext extends ParserRuleContext {
		public hardtyped.Absyn.VarPath result;
		public Token p_1_1;
		public TerminalNode IDENT() { return getToken(hardtypedParser.IDENT, 0); }
		public VarPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterVarPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitVarPath(this);
		}
	}

	public final VarPathContext varPath() throws RecognitionException {
		VarPathContext _localctx = new VarPathContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_varPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			((VarPathContext)_localctx).p_1_1 = match(IDENT);
			 ((VarPathContext)_localctx).result =  new hardtyped.Absyn.Lib(((VarPathContext)_localctx).p_1_1.getText()); 
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

	public static class ListVarPathContext extends ParserRuleContext {
		public hardtyped.Absyn.ListVarPath result;
		public ListVarPathContext p_2_1;
		public VarPathContext p_2_2;
		public TerminalNode Surrogate_id_SYMB_4() { return getToken(hardtypedParser.Surrogate_id_SYMB_4, 0); }
		public ListVarPathContext listVarPath() {
			return getRuleContext(ListVarPathContext.class,0);
		}
		public VarPathContext varPath() {
			return getRuleContext(VarPathContext.class,0);
		}
		public ListVarPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listVarPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterListVarPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitListVarPath(this);
		}
	}

	public final ListVarPathContext listVarPath() throws RecognitionException {
		return listVarPath(0);
	}

	private ListVarPathContext listVarPath(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListVarPathContext _localctx = new ListVarPathContext(_ctx, _parentState);
		ListVarPathContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_listVarPath, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			 ((ListVarPathContext)_localctx).result =  new hardtyped.Absyn.ListVarPath(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListVarPathContext(_parentctx, _parentState);
					_localctx.p_2_1 = _prevctx;
					_localctx.p_2_1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listVarPath);
					setState(440);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(441);
					((ListVarPathContext)_localctx).p_2_2 = varPath();
					setState(442);
					match(Surrogate_id_SYMB_4);
					 ((ListVarPathContext)_localctx).result =  ((ListVarPathContext)_localctx).p_2_1.result; _localctx.result.addLast(((ListVarPathContext)_localctx).p_2_2.result); 
					}
					} 
				}
				setState(449);
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
		enterRule(_localctx, 92, RULE_exprSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
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
		enterRule(_localctx, 94, RULE_listExprSequence);
		try {
			setState(462);
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
				setState(454);
				((ListExprSequenceContext)_localctx).p_2_1 = exprSequence();
				 ((ListExprSequenceContext)_localctx).result =  new hardtyped.Absyn.ListExprSequence(); _localctx.result.addLast(((ListExprSequenceContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
				((ListExprSequenceContext)_localctx).p_3_1 = exprSequence();
				setState(458);
				match(Surrogate_id_SYMB_11);
				setState(459);
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
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(hardtypedParser.Surrogate_id_SYMB_7, 0); }
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
		enterRule(_localctx, 96, RULE_funcArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			((FuncArgContext)_localctx).p_1_1 = match(IDENT);
			setState(465);
			match(Surrogate_id_SYMB_7);
			setState(466);
			((FuncArgContext)_localctx).p_1_3 = type(0);
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
		public ListFuncArgContext p_2_1;
		public FuncArgContext p_2_2;
		public TerminalNode Surrogate_id_SYMB_4() { return getToken(hardtypedParser.Surrogate_id_SYMB_4, 0); }
		public ListFuncArgContext listFuncArg() {
			return getRuleContext(ListFuncArgContext.class,0);
		}
		public FuncArgContext funcArg() {
			return getRuleContext(FuncArgContext.class,0);
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
		return listFuncArg(0);
	}

	private ListFuncArgContext listFuncArg(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListFuncArgContext _localctx = new ListFuncArgContext(_ctx, _parentState);
		ListFuncArgContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_listFuncArg, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			 ((ListFuncArgContext)_localctx).result =  new hardtyped.Absyn.ListFuncArg(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListFuncArgContext(_parentctx, _parentState);
					_localctx.p_2_1 = _prevctx;
					_localctx.p_2_1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listFuncArg);
					setState(472);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(473);
					((ListFuncArgContext)_localctx).p_2_2 = funcArg();
					setState(474);
					match(Surrogate_id_SYMB_4);
					 ((ListFuncArgContext)_localctx).result =  ((ListFuncArgContext)_localctx).p_2_1.result; _localctx.result.addLast(((ListFuncArgContext)_localctx).p_2_2.result); 
					}
					} 
				}
				setState(481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class IfExprContext extends ParserRuleContext {
		public hardtyped.Absyn.IfExpr result;
		public Expr2Context p_1_3;
		public ExprContext p_1_6;
		public Expr2Context p_2_3;
		public ListExprContext p_2_7;
		public TerminalNode Surrogate_id_SYMB_12() { return getToken(hardtypedParser.Surrogate_id_SYMB_12, 0); }
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(hardtypedParser.Surrogate_id_SYMB_1, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(hardtypedParser.Surrogate_id_SYMB_2, 0); }
		public TerminalNode Surrogate_id_SYMB_7() { return getToken(hardtypedParser.Surrogate_id_SYMB_7, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(hardtypedParser.Surrogate_id_SYMB_9, 0); }
		public TerminalNode Surrogate_id_SYMB_10() { return getToken(hardtypedParser.Surrogate_id_SYMB_10, 0); }
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
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
		enterRule(_localctx, 100, RULE_ifExpr);
		try {
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				match(Surrogate_id_SYMB_12);
				setState(483);
				match(Surrogate_id_SYMB_1);
				setState(484);
				((IfExprContext)_localctx).p_1_3 = expr2();
				setState(485);
				match(Surrogate_id_SYMB_2);
				setState(486);
				match(Surrogate_id_SYMB_7);
				setState(487);
				((IfExprContext)_localctx).p_1_6 = expr();
				 ((IfExprContext)_localctx).result =  new hardtyped.Absyn.If(((IfExprContext)_localctx).p_1_3.result,((IfExprContext)_localctx).p_1_6.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(Surrogate_id_SYMB_12);
				setState(491);
				match(Surrogate_id_SYMB_1);
				setState(492);
				((IfExprContext)_localctx).p_2_3 = expr2();
				setState(493);
				match(Surrogate_id_SYMB_2);
				setState(494);
				match(Surrogate_id_SYMB_7);
				setState(495);
				match(Surrogate_id_SYMB_9);
				setState(496);
				((IfExprContext)_localctx).p_2_7 = listExpr();
				setState(497);
				match(Surrogate_id_SYMB_10);
				 ((IfExprContext)_localctx).result =  new hardtyped.Absyn.IfMultiple(((IfExprContext)_localctx).p_2_3.result,((IfExprContext)_localctx).p_2_7.result); 
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

	public static class ListIfExprContext extends ParserRuleContext {
		public hardtyped.Absyn.ListIfExpr result;
		public ListIfExprContext p_2_1;
		public IfExprContext p_2_2;
		public ListIfExprContext listIfExpr() {
			return getRuleContext(ListIfExprContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
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
		return listIfExpr(0);
	}

	private ListIfExprContext listIfExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListIfExprContext _localctx = new ListIfExprContext(_ctx, _parentState);
		ListIfExprContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_listIfExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			 ((ListIfExprContext)_localctx).result =  new hardtyped.Absyn.ListIfExpr(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListIfExprContext(_parentctx, _parentState);
					_localctx.p_2_1 = _prevctx;
					_localctx.p_2_1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listIfExpr);
					setState(505);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(506);
					((ListIfExprContext)_localctx).p_2_2 = ifExpr();
					 ((ListIfExprContext)_localctx).result =  ((ListIfExprContext)_localctx).p_2_1.result; _localctx.result.addLast(((ListIfExprContext)_localctx).p_2_2.result); 
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ElseExprContext extends ParserRuleContext {
		public hardtyped.Absyn.ElseExpr result;
		public ExprContext p_1_2;
		public ListExprContext p_2_3;
		public TerminalNode Surrogate_id_SYMB_13() { return getToken(hardtypedParser.Surrogate_id_SYMB_13, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(hardtypedParser.Surrogate_id_SYMB_9, 0); }
		public TerminalNode Surrogate_id_SYMB_10() { return getToken(hardtypedParser.Surrogate_id_SYMB_10, 0); }
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
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
		enterRule(_localctx, 104, RULE_elseExpr);
		try {
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				match(Surrogate_id_SYMB_13);
				setState(515);
				((ElseExprContext)_localctx).p_1_2 = expr();
				 ((ElseExprContext)_localctx).result =  new hardtyped.Absyn.Else(((ElseExprContext)_localctx).p_1_2.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				match(Surrogate_id_SYMB_13);
				setState(519);
				match(Surrogate_id_SYMB_9);
				setState(520);
				((ElseExprContext)_localctx).p_2_3 = listExpr();
				setState(521);
				match(Surrogate_id_SYMB_10);
				 ((ElseExprContext)_localctx).result =  new hardtyped.Absyn.ElseMultiple(((ElseExprContext)_localctx).p_2_3.result); 
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

	public static class OpContext extends ParserRuleContext {
		public hardtyped.Absyn.Op result;
		public Op1Context p_1_1;
		public Expr3Context p_2_2;
		public Expr3Context p_3_2;
		public Expr3Context p_4_2;
		public Op1Context op1() {
			return getRuleContext(Op1Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_35() { return getToken(hardtypedParser.Surrogate_id_SYMB_35, 0); }
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_14() { return getToken(hardtypedParser.Surrogate_id_SYMB_14, 0); }
		public TerminalNode Surrogate_id_SYMB_15() { return getToken(hardtypedParser.Surrogate_id_SYMB_15, 0); }
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
		enterRule(_localctx, 106, RULE_op);
		try {
			setState(541);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_1:
			case Surrogate_id_SYMB_9:
			case Bool:
			case Unit:
			case DOUBLE:
			case INTEGER:
			case IDENT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				((OpContext)_localctx).p_1_1 = op1();
				 ((OpContext)_localctx).result =  ((OpContext)_localctx).p_1_1.result; 
				}
				break;
			case Surrogate_id_SYMB_35:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				match(Surrogate_id_SYMB_35);
				setState(530);
				((OpContext)_localctx).p_2_2 = expr3();
				 ((OpContext)_localctx).result =  new hardtyped.Absyn.Not(((OpContext)_localctx).p_2_2.result); 
				}
				break;
			case Surrogate_id_SYMB_14:
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				match(Surrogate_id_SYMB_14);
				setState(534);
				((OpContext)_localctx).p_3_2 = expr3();
				 ((OpContext)_localctx).result =  new hardtyped.Absyn.UnaryPlus(((OpContext)_localctx).p_3_2.result); 
				}
				break;
			case Surrogate_id_SYMB_15:
				enterOuterAlt(_localctx, 4);
				{
				setState(537);
				match(Surrogate_id_SYMB_15);
				setState(538);
				((OpContext)_localctx).p_4_2 = expr3();
				 ((OpContext)_localctx).result =  new hardtyped.Absyn.UnaryMinus(((OpContext)_localctx).p_4_2.result); 
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

	public static class Op1Context extends ParserRuleContext {
		public hardtyped.Absyn.Op result;
		public Op2Context p_1_1;
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
		public Expr3Context p_8_1;
		public Expr3Context p_8_3;
		public Expr3Context p_9_1;
		public Expr3Context p_9_3;
		public Op2Context op2() {
			return getRuleContext(Op2Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_16() { return getToken(hardtypedParser.Surrogate_id_SYMB_16, 0); }
		public List<Expr3Context> expr3() {
			return getRuleContexts(Expr3Context.class);
		}
		public Expr3Context expr3(int i) {
			return getRuleContext(Expr3Context.class,i);
		}
		public TerminalNode Surrogate_id_SYMB_5() { return getToken(hardtypedParser.Surrogate_id_SYMB_5, 0); }
		public TerminalNode Surrogate_id_SYMB_17() { return getToken(hardtypedParser.Surrogate_id_SYMB_17, 0); }
		public TerminalNode Surrogate_id_SYMB_18() { return getToken(hardtypedParser.Surrogate_id_SYMB_18, 0); }
		public TerminalNode Surrogate_id_SYMB_19() { return getToken(hardtypedParser.Surrogate_id_SYMB_19, 0); }
		public TerminalNode Surrogate_id_SYMB_20() { return getToken(hardtypedParser.Surrogate_id_SYMB_20, 0); }
		public TerminalNode Surrogate_id_SYMB_21() { return getToken(hardtypedParser.Surrogate_id_SYMB_21, 0); }
		public TerminalNode Surrogate_id_SYMB_22() { return getToken(hardtypedParser.Surrogate_id_SYMB_22, 0); }
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
		enterRule(_localctx, 108, RULE_op1);
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				((Op1Context)_localctx).p_1_1 = op2();
				 ((Op1Context)_localctx).result =  ((Op1Context)_localctx).p_1_1.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				((Op1Context)_localctx).p_2_1 = expr3();
				setState(547);
				match(Surrogate_id_SYMB_16);
				setState(548);
				((Op1Context)_localctx).p_2_3 = expr3();
				 ((Op1Context)_localctx).result =  new hardtyped.Absyn.Multiply(((Op1Context)_localctx).p_2_1.result,((Op1Context)_localctx).p_2_3.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(551);
				((Op1Context)_localctx).p_3_1 = expr3();
				setState(552);
				match(Surrogate_id_SYMB_5);
				setState(553);
				((Op1Context)_localctx).p_3_3 = expr3();
				 ((Op1Context)_localctx).result =  new hardtyped.Absyn.Divide(((Op1Context)_localctx).p_3_1.result,((Op1Context)_localctx).p_3_3.result); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(556);
				((Op1Context)_localctx).p_4_1 = expr3();
				setState(557);
				match(Surrogate_id_SYMB_17);
				setState(558);
				((Op1Context)_localctx).p_4_3 = expr3();
				 ((Op1Context)_localctx).result =  new hardtyped.Absyn.More(((Op1Context)_localctx).p_4_1.result,((Op1Context)_localctx).p_4_3.result); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(561);
				((Op1Context)_localctx).p_5_1 = expr3();
				setState(562);
				match(Surrogate_id_SYMB_18);
				setState(563);
				((Op1Context)_localctx).p_5_3 = expr3();
				 ((Op1Context)_localctx).result =  new hardtyped.Absyn.MoreEql(((Op1Context)_localctx).p_5_1.result,((Op1Context)_localctx).p_5_3.result); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(566);
				((Op1Context)_localctx).p_6_1 = expr3();
				setState(567);
				match(Surrogate_id_SYMB_19);
				setState(568);
				((Op1Context)_localctx).p_6_3 = expr3();
				 ((Op1Context)_localctx).result =  new hardtyped.Absyn.Eql(((Op1Context)_localctx).p_6_1.result,((Op1Context)_localctx).p_6_3.result); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(571);
				((Op1Context)_localctx).p_7_1 = expr3();
				setState(572);
				match(Surrogate_id_SYMB_20);
				setState(573);
				((Op1Context)_localctx).p_7_3 = expr3();
				 ((Op1Context)_localctx).result =  new hardtyped.Absyn.NotEql(((Op1Context)_localctx).p_7_1.result,((Op1Context)_localctx).p_7_3.result); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(576);
				((Op1Context)_localctx).p_8_1 = expr3();
				setState(577);
				match(Surrogate_id_SYMB_21);
				setState(578);
				((Op1Context)_localctx).p_8_3 = expr3();
				 ((Op1Context)_localctx).result =  new hardtyped.Absyn.LessEql(((Op1Context)_localctx).p_8_1.result,((Op1Context)_localctx).p_8_3.result); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(581);
				((Op1Context)_localctx).p_9_1 = expr3();
				setState(582);
				match(Surrogate_id_SYMB_22);
				setState(583);
				((Op1Context)_localctx).p_9_3 = expr3();
				 ((Op1Context)_localctx).result =  new hardtyped.Absyn.Less(((Op1Context)_localctx).p_9_1.result,((Op1Context)_localctx).p_9_3.result); 
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
		public Expr3Context p_2_1;
		public Expr3Context p_2_3;
		public Expr3Context p_3_1;
		public Expr3Context p_3_3;
		public Expr3Context p_4_1;
		public Expr3Context p_4_3;
		public Expr3Context p_5_1;
		public Expr3Context p_5_3;
		public Op3Context op3() {
			return getRuleContext(Op3Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_14() { return getToken(hardtypedParser.Surrogate_id_SYMB_14, 0); }
		public List<Expr3Context> expr3() {
			return getRuleContexts(Expr3Context.class);
		}
		public Expr3Context expr3(int i) {
			return getRuleContext(Expr3Context.class,i);
		}
		public TerminalNode Surrogate_id_SYMB_15() { return getToken(hardtypedParser.Surrogate_id_SYMB_15, 0); }
		public TerminalNode Surrogate_id_SYMB_30() { return getToken(hardtypedParser.Surrogate_id_SYMB_30, 0); }
		public TerminalNode Surrogate_id_SYMB_36() { return getToken(hardtypedParser.Surrogate_id_SYMB_36, 0); }
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
		enterRule(_localctx, 110, RULE_op2);
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				((Op2Context)_localctx).p_1_1 = op3();
				 ((Op2Context)_localctx).result =  ((Op2Context)_localctx).p_1_1.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				((Op2Context)_localctx).p_2_1 = expr3();
				setState(592);
				match(Surrogate_id_SYMB_14);
				setState(593);
				((Op2Context)_localctx).p_2_3 = expr3();
				 ((Op2Context)_localctx).result =  new hardtyped.Absyn.Sum(((Op2Context)_localctx).p_2_1.result,((Op2Context)_localctx).p_2_3.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(596);
				((Op2Context)_localctx).p_3_1 = expr3();
				setState(597);
				match(Surrogate_id_SYMB_15);
				setState(598);
				((Op2Context)_localctx).p_3_3 = expr3();
				 ((Op2Context)_localctx).result =  new hardtyped.Absyn.Substract(((Op2Context)_localctx).p_3_1.result,((Op2Context)_localctx).p_3_3.result); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(601);
				((Op2Context)_localctx).p_4_1 = expr3();
				setState(602);
				match(Surrogate_id_SYMB_30);
				setState(603);
				((Op2Context)_localctx).p_4_3 = expr3();
				 ((Op2Context)_localctx).result =  new hardtyped.Absyn.And(((Op2Context)_localctx).p_4_1.result,((Op2Context)_localctx).p_4_3.result); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(606);
				((Op2Context)_localctx).p_5_1 = expr3();
				setState(607);
				match(Surrogate_id_SYMB_36);
				setState(608);
				((Op2Context)_localctx).p_5_3 = expr3();
				 ((Op2Context)_localctx).result =  new hardtyped.Absyn.Or(((Op2Context)_localctx).p_5_1.result,((Op2Context)_localctx).p_5_3.result); 
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

	public static class Op3Context extends ParserRuleContext {
		public hardtyped.Absyn.Op result;
		public OpContext p_1_2;
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(hardtypedParser.Surrogate_id_SYMB_1, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(hardtypedParser.Surrogate_id_SYMB_2, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
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
		enterRule(_localctx, 112, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(Surrogate_id_SYMB_1);
			setState(614);
			((Op3Context)_localctx).p_1_2 = op();
			setState(615);
			match(Surrogate_id_SYMB_2);
			 ((Op3Context)_localctx).result =  ((Op3Context)_localctx).p_1_2.result; 
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
		public TypeContext p_8_1;
		public Type1Context p_1_1;
		public ListRecordContext p_9_2;
		public TypeContext p_8_3;
		public Type1Context type1() {
			return getRuleContext(Type1Context.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_26() { return getToken(hardtypedParser.Surrogate_id_SYMB_26, 0); }
		public TerminalNode Surrogate_id_SYMB_27() { return getToken(hardtypedParser.Surrogate_id_SYMB_27, 0); }
		public TerminalNode Surrogate_id_SYMB_25() { return getToken(hardtypedParser.Surrogate_id_SYMB_25, 0); }
		public TerminalNode Surrogate_id_SYMB_28() { return getToken(hardtypedParser.Surrogate_id_SYMB_28, 0); }
		public TerminalNode Surrogate_id_SYMB_29() { return getToken(hardtypedParser.Surrogate_id_SYMB_29, 0); }
		public TerminalNode Surrogate_id_SYMB_24() { return getToken(hardtypedParser.Surrogate_id_SYMB_24, 0); }
		public TerminalNode Surrogate_id_SYMB_9() { return getToken(hardtypedParser.Surrogate_id_SYMB_9, 0); }
		public TerminalNode Surrogate_id_SYMB_10() { return getToken(hardtypedParser.Surrogate_id_SYMB_10, 0); }
		public ListRecordContext listRecord() {
			return getRuleContext(ListRecordContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_23() { return getToken(hardtypedParser.Surrogate_id_SYMB_23, 0); }
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_1:
				{
				setState(619);
				((TypeContext)_localctx).p_1_1 = type1();
				 ((TypeContext)_localctx).result =  ((TypeContext)_localctx).p_1_1.result; 
				}
				break;
			case Surrogate_id_SYMB_26:
				{
				setState(622);
				match(Surrogate_id_SYMB_26);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.IntType(); 
				}
				break;
			case Surrogate_id_SYMB_27:
				{
				setState(624);
				match(Surrogate_id_SYMB_27);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.RealType(); 
				}
				break;
			case Surrogate_id_SYMB_25:
				{
				setState(626);
				match(Surrogate_id_SYMB_25);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.BoolType(); 
				}
				break;
			case Surrogate_id_SYMB_28:
				{
				setState(628);
				match(Surrogate_id_SYMB_28);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.StringType(); 
				}
				break;
			case Surrogate_id_SYMB_29:
				{
				setState(630);
				match(Surrogate_id_SYMB_29);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.UnitType(); 
				}
				break;
			case Surrogate_id_SYMB_24:
				{
				setState(632);
				match(Surrogate_id_SYMB_24);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.AnyType(); 
				}
				break;
			case Surrogate_id_SYMB_9:
				{
				setState(634);
				match(Surrogate_id_SYMB_9);
				setState(635);
				((TypeContext)_localctx).p_9_2 = listRecord();
				setState(636);
				match(Surrogate_id_SYMB_10);
				 ((TypeContext)_localctx).result =  new hardtyped.Absyn.RecordType(((TypeContext)_localctx).p_9_2.result); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(648);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					_localctx.p_8_1 = _prevctx;
					_localctx.p_8_1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(641);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(642);
					match(Surrogate_id_SYMB_23);
					setState(643);
					((TypeContext)_localctx).p_8_3 = type(3);
					 ((TypeContext)_localctx).result =  new hardtyped.Absyn.FunctionType(((TypeContext)_localctx).p_8_1.result,((TypeContext)_localctx).p_8_3.result); 
					}
					} 
				}
				setState(650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class Type1Context extends ParserRuleContext {
		public hardtyped.Absyn.Type result;
		public Type2Context p_1_1;
		public Type2Context type2() {
			return getRuleContext(Type2Context.class,0);
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
		Type1Context _localctx = new Type1Context(_ctx, getState());
		enterRule(_localctx, 116, RULE_type1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			((Type1Context)_localctx).p_1_1 = type2();
			 ((Type1Context)_localctx).result =  ((Type1Context)_localctx).p_1_1.result; 
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

	public static class Type2Context extends ParserRuleContext {
		public hardtyped.Absyn.Type result;
		public TypeContext p_1_2;
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(hardtypedParser.Surrogate_id_SYMB_1, 0); }
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(hardtypedParser.Surrogate_id_SYMB_2, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 118, RULE_type2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(Surrogate_id_SYMB_1);
			setState(655);
			((Type2Context)_localctx).p_1_2 = type(0);
			setState(656);
			match(Surrogate_id_SYMB_2);
			 ((Type2Context)_localctx).result =  ((Type2Context)_localctx).p_1_2.result; 
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
		public VarDecContext p_1_1;
		public Expr3Context p_1_3;
		public VarDecContext p_2_1;
		public TerminalNode Surrogate_id_SYMB_6() { return getToken(hardtypedParser.Surrogate_id_SYMB_6, 0); }
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
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
		RecordContext _localctx = new RecordContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_record);
		try {
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				((RecordContext)_localctx).p_1_1 = varDec();
				setState(660);
				match(Surrogate_id_SYMB_6);
				setState(661);
				((RecordContext)_localctx).p_1_3 = expr3();
				 ((RecordContext)_localctx).result =  new hardtyped.Absyn.BaseRecordNameValue(((RecordContext)_localctx).p_1_1.result,((RecordContext)_localctx).p_1_3.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				((RecordContext)_localctx).p_2_1 = varDec();
				 ((RecordContext)_localctx).result =  new hardtyped.Absyn.BaseRecordName(((RecordContext)_localctx).p_2_1.result); 
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

	public static class ListRecordContext extends ParserRuleContext {
		public hardtyped.Absyn.ListRecord result;
		public RecordContext p_2_1;
		public RecordContext p_3_1;
		public ListRecordContext p_3_3;
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public TerminalNode Surrogate_id_SYMB_11() { return getToken(hardtypedParser.Surrogate_id_SYMB_11, 0); }
		public ListRecordContext listRecord() {
			return getRuleContext(ListRecordContext.class,0);
		}
		public ListRecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listRecord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).enterListRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardtypedParserListener ) ((hardtypedParserListener)listener).exitListRecord(this);
		}
	}

	public final ListRecordContext listRecord() throws RecognitionException {
		ListRecordContext _localctx = new ListRecordContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_listRecord);
		try {
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 ((ListRecordContext)_localctx).result =  new hardtyped.Absyn.ListRecord(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				((ListRecordContext)_localctx).p_2_1 = record();
				 ((ListRecordContext)_localctx).result =  new hardtyped.Absyn.ListRecord(); _localctx.result.addLast(((ListRecordContext)_localctx).p_2_1.result); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(673);
				((ListRecordContext)_localctx).p_3_1 = record();
				setState(674);
				match(Surrogate_id_SYMB_11);
				setState(675);
				((ListRecordContext)_localctx).p_3_3 = listRecord();
				 ((ListRecordContext)_localctx).result =  ((ListRecordContext)_localctx).p_3_3.result; _localctx.result.addFirst(((ListRecordContext)_localctx).p_3_1.result); 
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
		case 40:
			return listPath_sempred((ListPathContext)_localctx, predIndex);
		case 45:
			return listVarPath_sempred((ListVarPathContext)_localctx, predIndex);
		case 49:
			return listFuncArg_sempred((ListFuncArgContext)_localctx, predIndex);
		case 51:
			return listIfExpr_sempred((ListIfExprContext)_localctx, predIndex);
		case 57:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listPath_sempred(ListPathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean listVarPath_sempred(ListVarPathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean listFuncArg_sempred(ListFuncArgContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean listIfExpr_sempred(ListIfExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u02ab\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0104\n!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0114\n\"\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0144"+
		"\n#\3$\3$\3$\3$\3$\3$\5$\u014c\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0162\n%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\7*\u017d\n*\f*\16*\u0180"+
		"\13*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01a6\n+\3,\3,\3,\3,\3"+
		",\3,\3,\5,\u01af\n,\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\7/\u01c0"+
		"\n/\f/\16/\u01c3\13/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u01d1\n\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\7\63\u01e0\n\63\f\63\16\63\u01e3\13\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u01f7\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0200"+
		"\n\65\f\65\16\65\u0203\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\5\66\u020f\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0220\n\67\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\58\u024d\n8\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u0266\n9\3:\3:\3"+
		":\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\5;\u0282\n;\3;\3;\3;\3;\3;\7;\u0289\n;\f;\16;\u028c\13;\3<\3<\3<\3="+
		"\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\5>\u029e\n>\3?\3?\3?\3?\3?\3?\3?"+
		"\3?\3?\5?\u02a9\n?\3?\2\7R\\dht@\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\2\2\u02a7"+
		"\2~\3\2\2\2\4\u0082\3\2\2\2\6\u0086\3\2\2\2\b\u008a\3\2\2\2\n\u008e\3"+
		"\2\2\2\f\u0092\3\2\2\2\16\u0096\3\2\2\2\20\u009a\3\2\2\2\22\u009e\3\2"+
		"\2\2\24\u00a2\3\2\2\2\26\u00a6\3\2\2\2\30\u00aa\3\2\2\2\32\u00ae\3\2\2"+
		"\2\34\u00b2\3\2\2\2\36\u00b6\3\2\2\2 \u00ba\3\2\2\2\"\u00be\3\2\2\2$\u00c2"+
		"\3\2\2\2&\u00c6\3\2\2\2(\u00ca\3\2\2\2*\u00ce\3\2\2\2,\u00d2\3\2\2\2."+
		"\u00d6\3\2\2\2\60\u00da\3\2\2\2\62\u00de\3\2\2\2\64\u00e2\3\2\2\2\66\u00e6"+
		"\3\2\2\28\u00ea\3\2\2\2:\u00ee\3\2\2\2<\u00f2\3\2\2\2>\u00f6\3\2\2\2@"+
		"\u0103\3\2\2\2B\u0113\3\2\2\2D\u0143\3\2\2\2F\u014b\3\2\2\2H\u0161\3\2"+
		"\2\2J\u0163\3\2\2\2L\u0168\3\2\2\2N\u016c\3\2\2\2P\u0171\3\2\2\2R\u0174"+
		"\3\2\2\2T\u01a5\3\2\2\2V\u01ae\3\2\2\2X\u01b0\3\2\2\2Z\u01b4\3\2\2\2\\"+
		"\u01b7\3\2\2\2^\u01c4\3\2\2\2`\u01d0\3\2\2\2b\u01d2\3\2\2\2d\u01d7\3\2"+
		"\2\2f\u01f6\3\2\2\2h\u01f8\3\2\2\2j\u020e\3\2\2\2l\u021f\3\2\2\2n\u024c"+
		"\3\2\2\2p\u0265\3\2\2\2r\u0267\3\2\2\2t\u0281\3\2\2\2v\u028d\3\2\2\2x"+
		"\u0290\3\2\2\2z\u029d\3\2\2\2|\u02a8\3\2\2\2~\177\5@!\2\177\u0080\7\2"+
		"\2\3\u0080\u0081\b\2\1\2\u0081\3\3\2\2\2\u0082\u0083\5B\"\2\u0083\u0084"+
		"\7\2\2\3\u0084\u0085\b\3\1\2\u0085\5\3\2\2\2\u0086\u0087\5D#\2\u0087\u0088"+
		"\7\2\2\3\u0088\u0089\b\4\1\2\u0089\7\3\2\2\2\u008a\u008b\5F$\2\u008b\u008c"+
		"\7\2\2\3\u008c\u008d\b\5\1\2\u008d\t\3\2\2\2\u008e\u008f\5H%\2\u008f\u0090"+
		"\7\2\2\3\u0090\u0091\b\6\1\2\u0091\13\3\2\2\2\u0092\u0093\5J&\2\u0093"+
		"\u0094\7\2\2\3\u0094\u0095\b\7\1\2\u0095\r\3\2\2\2\u0096\u0097\5L\'\2"+
		"\u0097\u0098\7\2\2\3\u0098\u0099\b\b\1\2\u0099\17\3\2\2\2\u009a\u009b"+
		"\5N(\2\u009b\u009c\7\2\2\3\u009c\u009d\b\t\1\2\u009d\21\3\2\2\2\u009e"+
		"\u009f\5P)\2\u009f\u00a0\7\2\2\3\u00a0\u00a1\b\n\1\2\u00a1\23\3\2\2\2"+
		"\u00a2\u00a3\5R*\2\u00a3\u00a4\7\2\2\3\u00a4\u00a5\b\13\1\2\u00a5\25\3"+
		"\2\2\2\u00a6\u00a7\5T+\2\u00a7\u00a8\7\2\2\3\u00a8\u00a9\b\f\1\2\u00a9"+
		"\27\3\2\2\2\u00aa\u00ab\5V,\2\u00ab\u00ac\7\2\2\3\u00ac\u00ad\b\r\1\2"+
		"\u00ad\31\3\2\2\2\u00ae\u00af\5X-\2\u00af\u00b0\7\2\2\3\u00b0\u00b1\b"+
		"\16\1\2\u00b1\33\3\2\2\2\u00b2\u00b3\5Z.\2\u00b3\u00b4\7\2\2\3\u00b4\u00b5"+
		"\b\17\1\2\u00b5\35\3\2\2\2\u00b6\u00b7\5\\/\2\u00b7\u00b8\7\2\2\3\u00b8"+
		"\u00b9\b\20\1\2\u00b9\37\3\2\2\2\u00ba\u00bb\5^\60\2\u00bb\u00bc\7\2\2"+
		"\3\u00bc\u00bd\b\21\1\2\u00bd!\3\2\2\2\u00be\u00bf\5`\61\2\u00bf\u00c0"+
		"\7\2\2\3\u00c0\u00c1\b\22\1\2\u00c1#\3\2\2\2\u00c2\u00c3\5b\62\2\u00c3"+
		"\u00c4\7\2\2\3\u00c4\u00c5\b\23\1\2\u00c5%\3\2\2\2\u00c6\u00c7\5d\63\2"+
		"\u00c7\u00c8\7\2\2\3\u00c8\u00c9\b\24\1\2\u00c9\'\3\2\2\2\u00ca\u00cb"+
		"\5f\64\2\u00cb\u00cc\7\2\2\3\u00cc\u00cd\b\25\1\2\u00cd)\3\2\2\2\u00ce"+
		"\u00cf\5h\65\2\u00cf\u00d0\7\2\2\3\u00d0\u00d1\b\26\1\2\u00d1+\3\2\2\2"+
		"\u00d2\u00d3\5j\66\2\u00d3\u00d4\7\2\2\3\u00d4\u00d5\b\27\1\2\u00d5-\3"+
		"\2\2\2\u00d6\u00d7\5l\67\2\u00d7\u00d8\7\2\2\3\u00d8\u00d9\b\30\1\2\u00d9"+
		"/\3\2\2\2\u00da\u00db\5n8\2\u00db\u00dc\7\2\2\3\u00dc\u00dd\b\31\1\2\u00dd"+
		"\61\3\2\2\2\u00de\u00df\5p9\2\u00df\u00e0\7\2\2\3\u00e0\u00e1\b\32\1\2"+
		"\u00e1\63\3\2\2\2\u00e2\u00e3\5r:\2\u00e3\u00e4\7\2\2\3\u00e4\u00e5\b"+
		"\33\1\2\u00e5\65\3\2\2\2\u00e6\u00e7\5t;\2\u00e7\u00e8\7\2\2\3\u00e8\u00e9"+
		"\b\34\1\2\u00e9\67\3\2\2\2\u00ea\u00eb\5v<\2\u00eb\u00ec\7\2\2\3\u00ec"+
		"\u00ed\b\35\1\2\u00ed9\3\2\2\2\u00ee\u00ef\5x=\2\u00ef\u00f0\7\2\2\3\u00f0"+
		"\u00f1\b\36\1\2\u00f1;\3\2\2\2\u00f2\u00f3\5z>\2\u00f3\u00f4\7\2\2\3\u00f4"+
		"\u00f5\b\37\1\2\u00f5=\3\2\2\2\u00f6\u00f7\5|?\2\u00f7\u00f8\7\2\2\3\u00f8"+
		"\u00f9\b \1\2\u00f9?\3\2\2\2\u00fa\u0104\b!\1\2\u00fb\u00fc\5B\"\2\u00fc"+
		"\u00fd\b!\1\2\u00fd\u0104\3\2\2\2\u00fe\u00ff\5B\"\2\u00ff\u0100\7\3\2"+
		"\2\u0100\u0101\5@!\2\u0101\u0102\b!\1\2\u0102\u0104\3\2\2\2\u0103\u00fa"+
		"\3\2\2\2\u0103\u00fb\3\2\2\2\u0103\u00fe\3\2\2\2\u0104A\3\2\2\2\u0105"+
		"\u0106\5D#\2\u0106\u0107\b\"\1\2\u0107\u0114\3\2\2\2\u0108\u0109\7\6\2"+
		"\2\u0109\u010a\5L\'\2\u010a\u010b\b\"\1\2\u010b\u0114\3\2\2\2\u010c\u010d"+
		"\5T+\2\u010d\u010e\b\"\1\2\u010e\u0114\3\2\2\2\u010f\u0110\5h\65\2\u0110"+
		"\u0111\5j\66\2\u0111\u0112\b\"\1\2\u0112\u0114\3\2\2\2\u0113\u0105\3\2"+
		"\2\2\u0113\u0108\3\2\2\2\u0113\u010c\3\2\2\2\u0113\u010f\3\2\2\2\u0114"+
		"C\3\2\2\2\u0115\u0116\5F$\2\u0116\u0117\b#\1\2\u0117\u0144\3\2\2\2\u0118"+
		"\u0119\7\13\2\2\u0119\u011a\5d\63\2\u011a\u011b\7\f\2\2\u011b\u011c\5"+
		"@!\2\u011c\u011d\7\r\2\2\u011d\u011e\b#\1\2\u011e\u0144\3\2\2\2\u011f"+
		"\u0120\5X-\2\u0120\u0121\7\4\2\2\u0121\u0122\5`\61\2\u0122\u0123\7\5\2"+
		"\2\u0123\u0124\b#\1\2\u0124\u0144\3\2\2\2\u0125\u0126\7,\2\2\u0126\u0127"+
		"\7\4\2\2\u0127\u0128\5B\"\2\u0128\u0129\7\5\2\2\u0129\u012a\b#\1\2\u012a"+
		"\u0144\3\2\2\2\u012b\u012c\7-\2\2\u012c\u012d\7\4\2\2\u012d\u012e\5`\61"+
		"\2\u012e\u012f\7\5\2\2\u012f\u0130\b#\1\2\u0130\u0144\3\2\2\2\u0131\u0132"+
		"\7.\2\2\u0132\u0133\7\4\2\2\u0133\u0134\5`\61\2\u0134\u0135\7\5\2\2\u0135"+
		"\u0136\b#\1\2\u0136\u0144\3\2\2\2\u0137\u0138\7/\2\2\u0138\u0139\7\4\2"+
		"\2\u0139\u013a\5`\61\2\u013a\u013b\7\5\2\2\u013b\u013c\b#\1\2\u013c\u0144"+
		"\3\2\2\2\u013d\u013e\7\60\2\2\u013e\u013f\7\4\2\2\u013f\u0140\5`\61\2"+
		"\u0140\u0141\7\5\2\2\u0141\u0142\b#\1\2\u0142\u0144\3\2\2\2\u0143\u0115"+
		"\3\2\2\2\u0143\u0118\3\2\2\2\u0143\u011f\3\2\2\2\u0143\u0125\3\2\2\2\u0143"+
		"\u012b\3\2\2\2\u0143\u0131\3\2\2\2\u0143\u0137\3\2\2\2\u0143\u013d\3\2"+
		"\2\2\u0144E\3\2\2\2\u0145\u0146\5H%\2\u0146\u0147\b$\1\2\u0147\u014c\3"+
		"\2\2\2\u0148\u0149\5l\67\2\u0149\u014a\b$\1\2\u014a\u014c\3\2\2\2\u014b"+
		"\u0145\3\2\2\2\u014b\u0148\3\2\2\2\u014cG\3\2\2\2\u014d\u014e\5J&\2\u014e"+
		"\u014f\b%\1\2\u014f\u0162\3\2\2\2\u0150\u0151\7\64\2\2\u0151\u0162\b%"+
		"\1\2\u0152\u0153\7\63\2\2\u0153\u0162\b%\1\2\u0154\u0155\7\62\2\2\u0155"+
		"\u0162\b%\1\2\u0156\u0157\7\67\2\2\u0157\u0162\b%\1\2\u0158\u0159\7*\2"+
		"\2\u0159\u0162\b%\1\2\u015a\u015b\7+\2\2\u015b\u0162\b%\1\2\u015c\u015d"+
		"\7\f\2\2\u015d\u015e\5|?\2\u015e\u015f\7\r\2\2\u015f\u0160\b%\1\2\u0160"+
		"\u0162\3\2\2\2\u0161\u014d\3\2\2\2\u0161\u0150\3\2\2\2\u0161\u0152\3\2"+
		"\2\2\u0161\u0154\3\2\2\2\u0161\u0156\3\2\2\2\u0161\u0158\3\2\2\2\u0161"+
		"\u015a\3\2\2\2\u0161\u015c\3\2\2\2\u0162I\3\2\2\2\u0163\u0164\7\4\2\2"+
		"\u0164\u0165\5B\"\2\u0165\u0166\7\5\2\2\u0166\u0167\b&\1\2\u0167K\3\2"+
		"\2\2\u0168\u0169\5R*\2\u0169\u016a\5N(\2\u016a\u016b\b\'\1\2\u016bM\3"+
		"\2\2\2\u016c\u016d\7\64\2\2\u016d\u016e\7\7\2\2\u016e\u016f\7\61\2\2\u016f"+
		"\u0170\b(\1\2\u0170O\3\2\2\2\u0171\u0172\7\64\2\2\u0172\u0173\b)\1\2\u0173"+
		"Q\3\2\2\2\u0174\u0175\b*\1\2\u0175\u0176\b*\1\2\u0176\u017e\3\2\2\2\u0177"+
		"\u0178\f\3\2\2\u0178\u0179\5P)\2\u0179\u017a\7\b\2\2\u017a\u017b\b*\1"+
		"\2\u017b\u017d\3\2\2\2\u017c\u0177\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017fS\3\2\2\2\u0180\u017e\3\2\2\2\u0181"+
		"\u0182\7#\2\2\u0182\u0183\5V,\2\u0183\u0184\7\t\2\2\u0184\u0185\5D#\2"+
		"\u0185\u0186\b+\1\2\u0186\u01a6\3\2\2\2\u0187\u0188\7#\2\2\u0188\u0189"+
		"\5V,\2\u0189\u018a\7\t\2\2\u018a\u018b\5D#\2\u018b\u018c\7\"\2\2\u018c"+
		"\u018d\5D#\2\u018d\u018e\b+\1\2\u018e\u01a6\3\2\2\2\u018f\u0190\7#\2\2"+
		"\u0190\u0191\5V,\2\u0191\u0192\7\t\2\2\u0192\u0193\5D#\2\u0193\u0194\7"+
		"\"\2\2\u0194\u0195\7\4\2\2\u0195\u0196\5@!\2\u0196\u0197\7\5\2\2\u0197"+
		"\u0198\b+\1\2\u0198\u01a6\3\2\2\2\u0199\u019a\7$\2\2\u019a\u019b\5V,\2"+
		"\u019b\u019c\7\t\2\2\u019c\u019d\5D#\2\u019d\u019e\b+\1\2\u019e\u01a6"+
		"\3\2\2\2\u019f\u01a0\7%\2\2\u01a0\u01a1\5V,\2\u01a1\u01a2\7\t\2\2\u01a2"+
		"\u01a3\5t;\2\u01a3\u01a4\b+\1\2\u01a4\u01a6\3\2\2\2\u01a5\u0181\3\2\2"+
		"\2\u01a5\u0187\3\2\2\2\u01a5\u018f\3\2\2\2\u01a5\u0199\3\2\2\2\u01a5\u019f"+
		"\3\2\2\2\u01a6U\3\2\2\2\u01a7\u01a8\7\64\2\2\u01a8\u01a9\7\n\2\2\u01a9"+
		"\u01aa\5t;\2\u01aa\u01ab\b,\1\2\u01ab\u01af\3\2\2\2\u01ac\u01ad\7\64\2"+
		"\2\u01ad\u01af\b,\1\2\u01ae\u01a7\3\2\2\2\u01ae\u01ac\3\2\2\2\u01afW\3"+
		"\2\2\2\u01b0\u01b1\5\\/\2\u01b1\u01b2\7\64\2\2\u01b2\u01b3\b-\1\2\u01b3"+
		"Y\3\2\2\2\u01b4\u01b5\7\64\2\2\u01b5\u01b6\b.\1\2\u01b6[\3\2\2\2\u01b7"+
		"\u01b8\b/\1\2\u01b8\u01b9\b/\1\2\u01b9\u01c1\3\2\2\2\u01ba\u01bb\f\3\2"+
		"\2\u01bb\u01bc\5Z.\2\u01bc\u01bd\7\7\2\2\u01bd\u01be\b/\1\2\u01be\u01c0"+
		"\3\2\2\2\u01bf\u01ba\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2]\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5\5B\"\2\u01c5"+
		"\u01c6\b\60\1\2\u01c6_\3\2\2\2\u01c7\u01d1\b\61\1\2\u01c8\u01c9\5^\60"+
		"\2\u01c9\u01ca\b\61\1\2\u01ca\u01d1\3\2\2\2\u01cb\u01cc\5^\60\2\u01cc"+
		"\u01cd\7\16\2\2\u01cd\u01ce\5`\61\2\u01ce\u01cf\b\61\1\2\u01cf\u01d1\3"+
		"\2\2\2\u01d0\u01c7\3\2\2\2\u01d0\u01c8\3\2\2\2\u01d0\u01cb\3\2\2\2\u01d1"+
		"a\3\2\2\2\u01d2\u01d3\7\64\2\2\u01d3\u01d4\7\n\2\2\u01d4\u01d5\5t;\2\u01d5"+
		"\u01d6\b\62\1\2\u01d6c\3\2\2\2\u01d7\u01d8\b\63\1\2\u01d8\u01d9\b\63\1"+
		"\2\u01d9\u01e1\3\2\2\2\u01da\u01db\f\3\2\2\u01db\u01dc\5b\62\2\u01dc\u01dd"+
		"\7\7\2\2\u01dd\u01de\b\63\1\2\u01de\u01e0\3\2\2\2\u01df\u01da\3\2\2\2"+
		"\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2e\3"+
		"\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\7\17\2\2\u01e5\u01e6\7\4\2\2\u01e6"+
		"\u01e7\5F$\2\u01e7\u01e8\7\5\2\2\u01e8\u01e9\7\n\2\2\u01e9\u01ea\5B\""+
		"\2\u01ea\u01eb\b\64\1\2\u01eb\u01f7\3\2\2\2\u01ec\u01ed\7\17\2\2\u01ed"+
		"\u01ee\7\4\2\2\u01ee\u01ef\5F$\2\u01ef\u01f0\7\5\2\2\u01f0\u01f1\7\n\2"+
		"\2\u01f1\u01f2\7\f\2\2\u01f2\u01f3\5@!\2\u01f3\u01f4\7\r\2\2\u01f4\u01f5"+
		"\b\64\1\2\u01f5\u01f7\3\2\2\2\u01f6\u01e4\3\2\2\2\u01f6\u01ec\3\2\2\2"+
		"\u01f7g\3\2\2\2\u01f8\u01f9\b\65\1\2\u01f9\u01fa\b\65\1\2\u01fa\u0201"+
		"\3\2\2\2\u01fb\u01fc\f\3\2\2\u01fc\u01fd\5f\64\2\u01fd\u01fe\b\65\1\2"+
		"\u01fe\u0200\3\2\2\2\u01ff\u01fb\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff"+
		"\3\2\2\2\u0201\u0202\3\2\2\2\u0202i\3\2\2\2\u0203\u0201\3\2\2\2\u0204"+
		"\u0205\7\20\2\2\u0205\u0206\5B\"\2\u0206\u0207\b\66\1\2\u0207\u020f\3"+
		"\2\2\2\u0208\u0209\7\20\2\2\u0209\u020a\7\f\2\2\u020a\u020b\5@!\2\u020b"+
		"\u020c\7\r\2\2\u020c\u020d\b\66\1\2\u020d\u020f\3\2\2\2\u020e\u0204\3"+
		"\2\2\2\u020e\u0208\3\2\2\2\u020fk\3\2\2\2\u0210\u0211\5n8\2\u0211\u0212"+
		"\b\67\1\2\u0212\u0220\3\2\2\2\u0213\u0214\7&\2\2\u0214\u0215\5H%\2\u0215"+
		"\u0216\b\67\1\2\u0216\u0220\3\2\2\2\u0217\u0218\7\21\2\2\u0218\u0219\5"+
		"H%\2\u0219\u021a\b\67\1\2\u021a\u0220\3\2\2\2\u021b\u021c\7\22\2\2\u021c"+
		"\u021d\5H%\2\u021d\u021e\b\67\1\2\u021e\u0220\3\2\2\2\u021f\u0210\3\2"+
		"\2\2\u021f\u0213\3\2\2\2\u021f\u0217\3\2\2\2\u021f\u021b\3\2\2\2\u0220"+
		"m\3\2\2\2\u0221\u0222\5p9\2\u0222\u0223\b8\1\2\u0223\u024d\3\2\2\2\u0224"+
		"\u0225\5H%\2\u0225\u0226\7\23\2\2\u0226\u0227\5H%\2\u0227\u0228\b8\1\2"+
		"\u0228\u024d\3\2\2\2\u0229\u022a\5H%\2\u022a\u022b\7\b\2\2\u022b\u022c"+
		"\5H%\2\u022c\u022d\b8\1\2\u022d\u024d\3\2\2\2\u022e\u022f\5H%\2\u022f"+
		"\u0230\7\24\2\2\u0230\u0231\5H%\2\u0231\u0232\b8\1\2\u0232\u024d\3\2\2"+
		"\2\u0233\u0234\5H%\2\u0234\u0235\7\25\2\2\u0235\u0236\5H%\2\u0236\u0237"+
		"\b8\1\2\u0237\u024d\3\2\2\2\u0238\u0239\5H%\2\u0239\u023a\7\26\2\2\u023a"+
		"\u023b\5H%\2\u023b\u023c\b8\1\2\u023c\u024d\3\2\2\2\u023d\u023e\5H%\2"+
		"\u023e\u023f\7\27\2\2\u023f\u0240\5H%\2\u0240\u0241\b8\1\2\u0241\u024d"+
		"\3\2\2\2\u0242\u0243\5H%\2\u0243\u0244\7\30\2\2\u0244\u0245\5H%\2\u0245"+
		"\u0246\b8\1\2\u0246\u024d\3\2\2\2\u0247\u0248\5H%\2\u0248\u0249\7\31\2"+
		"\2\u0249\u024a\5H%\2\u024a\u024b\b8\1\2\u024b\u024d\3\2\2\2\u024c\u0221"+
		"\3\2\2\2\u024c\u0224\3\2\2\2\u024c\u0229\3\2\2\2\u024c\u022e\3\2\2\2\u024c"+
		"\u0233\3\2\2\2\u024c\u0238\3\2\2\2\u024c\u023d\3\2\2\2\u024c\u0242\3\2"+
		"\2\2\u024c\u0247\3\2\2\2\u024do\3\2\2\2\u024e\u024f\5r:\2\u024f\u0250"+
		"\b9\1\2\u0250\u0266\3\2\2\2\u0251\u0252\5H%\2\u0252\u0253\7\21\2\2\u0253"+
		"\u0254\5H%\2\u0254\u0255\b9\1\2\u0255\u0266\3\2\2\2\u0256\u0257\5H%\2"+
		"\u0257\u0258\7\22\2\2\u0258\u0259\5H%\2\u0259\u025a\b9\1\2\u025a\u0266"+
		"\3\2\2\2\u025b\u025c\5H%\2\u025c\u025d\7!\2\2\u025d\u025e\5H%\2\u025e"+
		"\u025f\b9\1\2\u025f\u0266\3\2\2\2\u0260\u0261\5H%\2\u0261\u0262\7\'\2"+
		"\2\u0262\u0263\5H%\2\u0263\u0264\b9\1\2\u0264\u0266\3\2\2\2\u0265\u024e"+
		"\3\2\2\2\u0265\u0251\3\2\2\2\u0265\u0256\3\2\2\2\u0265\u025b\3\2\2\2\u0265"+
		"\u0260\3\2\2\2\u0266q\3\2\2\2\u0267\u0268\7\4\2\2\u0268\u0269\5l\67\2"+
		"\u0269\u026a\7\5\2\2\u026a\u026b\b:\1\2\u026bs\3\2\2\2\u026c\u026d\b;"+
		"\1\2\u026d\u026e\5v<\2\u026e\u026f\b;\1\2\u026f\u0282\3\2\2\2\u0270\u0271"+
		"\7\35\2\2\u0271\u0282\b;\1\2\u0272\u0273\7\36\2\2\u0273\u0282\b;\1\2\u0274"+
		"\u0275\7\34\2\2\u0275\u0282\b;\1\2\u0276\u0277\7\37\2\2\u0277\u0282\b"+
		";\1\2\u0278\u0279\7 \2\2\u0279\u0282\b;\1\2\u027a\u027b\7\33\2\2\u027b"+
		"\u0282\b;\1\2\u027c\u027d\7\f\2\2\u027d\u027e\5|?\2\u027e\u027f\7\r\2"+
		"\2\u027f\u0280\b;\1\2\u0280\u0282\3\2\2\2\u0281\u026c\3\2\2\2\u0281\u0270"+
		"\3\2\2\2\u0281\u0272\3\2\2\2\u0281\u0274\3\2\2\2\u0281\u0276\3\2\2\2\u0281"+
		"\u0278\3\2\2\2\u0281\u027a\3\2\2\2\u0281\u027c\3\2\2\2\u0282\u028a\3\2"+
		"\2\2\u0283\u0284\f\4\2\2\u0284\u0285\7\32\2\2\u0285\u0286\5t;\5\u0286"+
		"\u0287\b;\1\2\u0287\u0289\3\2\2\2\u0288\u0283\3\2\2\2\u0289\u028c\3\2"+
		"\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028bu\3\2\2\2\u028c\u028a"+
		"\3\2\2\2\u028d\u028e\5x=\2\u028e\u028f\b<\1\2\u028fw\3\2\2\2\u0290\u0291"+
		"\7\4\2\2\u0291\u0292\5t;\2\u0292\u0293\7\5\2\2\u0293\u0294\b=\1\2\u0294"+
		"y\3\2\2\2\u0295\u0296\5V,\2\u0296\u0297\7\t\2\2\u0297\u0298\5H%\2\u0298"+
		"\u0299\b>\1\2\u0299\u029e\3\2\2\2\u029a\u029b\5V,\2\u029b\u029c\b>\1\2"+
		"\u029c\u029e\3\2\2\2\u029d\u0295\3\2\2\2\u029d\u029a\3\2\2\2\u029e{\3"+
		"\2\2\2\u029f\u02a9\b?\1\2\u02a0\u02a1\5z>\2\u02a1\u02a2\b?\1\2\u02a2\u02a9"+
		"\3\2\2\2\u02a3\u02a4\5z>\2\u02a4\u02a5\7\16\2\2\u02a5\u02a6\5|?\2\u02a6"+
		"\u02a7\b?\1\2\u02a7\u02a9\3\2\2\2\u02a8\u029f\3\2\2\2\u02a8\u02a0\3\2"+
		"\2\2\u02a8\u02a3\3\2\2\2\u02a9}\3\2\2\2\27\u0103\u0113\u0143\u014b\u0161"+
		"\u017e\u01a5\u01ae\u01c1\u01d0\u01e1\u01f6\u0201\u020e\u021f\u024c\u0265"+
		"\u0281\u028a\u029d\u02a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}