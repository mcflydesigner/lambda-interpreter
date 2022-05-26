// Generated from hardtypedLexer.g4 by ANTLR 4.7.1
package hardtyped;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class hardtypedLexer extends Lexer {
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
		ReadReal=43, ReadInt=44, ReadString=45, ReadBool=46, DOUBLE=47, INTEGER=48, 
		IDENT=49, WS=50, ErrorToken=51, STRING=52, STRINGESC=53;
	public static final int
		STRESCAPE=1, STRINGMODE=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "STRESCAPE", "STRINGMODE"
	};

	public static final String[] ruleNames = {
		"LETTER", "CAPITAL", "SMALL", "DIGIT", "Surrogate_id_SYMB_0", "Surrogate_id_SYMB_1", 
		"Surrogate_id_SYMB_2", "Surrogate_id_SYMB_3", "Surrogate_id_SYMB_4", "Surrogate_id_SYMB_5", 
		"Surrogate_id_SYMB_6", "Surrogate_id_SYMB_7", "Surrogate_id_SYMB_8", "Surrogate_id_SYMB_9", 
		"Surrogate_id_SYMB_10", "Surrogate_id_SYMB_11", "Surrogate_id_SYMB_12", 
		"Surrogate_id_SYMB_13", "Surrogate_id_SYMB_14", "Surrogate_id_SYMB_15", 
		"Surrogate_id_SYMB_16", "Surrogate_id_SYMB_17", "Surrogate_id_SYMB_18", 
		"Surrogate_id_SYMB_19", "Surrogate_id_SYMB_20", "Surrogate_id_SYMB_21", 
		"Surrogate_id_SYMB_22", "Surrogate_id_SYMB_23", "Surrogate_id_SYMB_24", 
		"Surrogate_id_SYMB_25", "Surrogate_id_SYMB_26", "Surrogate_id_SYMB_27", 
		"Surrogate_id_SYMB_28", "Surrogate_id_SYMB_29", "Surrogate_id_SYMB_30", 
		"Surrogate_id_SYMB_31", "Surrogate_id_SYMB_32", "Surrogate_id_SYMB_33", 
		"Surrogate_id_SYMB_34", "Surrogate_id_SYMB_35", "Surrogate_id_SYMB_36", 
		"Surrogate_id_SYMB_37", "COMMENT_antlr_builtin", "MULTICOMMENT_antlr_builtin", 
		"Bool", "Unit", "ReadReal", "ReadInt", "ReadString", "ReadBool", "STRING", 
		"DOUBLE", "INTEGER", "IDENTIFIER_FIRST", "IDENT", "WS", "Escapable", "ErrorToken", 
		"STRESCAPED", "STRINGESC", "STRINGEND", "STRINGTEXT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'-|'", "'='", "':'", "'/\\'", "'{'", "'}'", 
		"'->'", "'.'", "','", "'|'", "'|:'", "'+'", "'-'", "'*'", "'/'", "'>'", 
		"'>='", "'=='", "'!='", "'<='", "'<'", "'Any'", "'Bool'", "'Int'", "'Real'", 
		"'String'", "'Unit'", "'and'", "'as'", "'in'", "'let'", "'letrec'", "'lettype'", 
		"'not'", "'or'", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'\"'", "'\\'"
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
		"ReadReal", "ReadInt", "ReadString", "ReadBool", "DOUBLE", "INTEGER", 
		"IDENT", "WS", "ErrorToken", "STRING", "STRINGESC"
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


	public hardtypedLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "hardtypedLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u01a4\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t"+
		"\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4"+
		"*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\3\2\3\2\5\2\u0084\n\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3"+
		"+\3+\3,\3,\3,\3,\7,\u010a\n,\f,\16,\u010d\13,\3,\5,\u0110\n,\3,\3,\5,"+
		"\u0114\n,\3,\3,\3-\3-\3-\3-\7-\u011c\n-\f-\16-\u011f\13-\3-\3-\3-\3-\3"+
		"-\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u012f\n.\3/\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\6\65\u0161"+
		"\n\65\r\65\16\65\u0162\3\65\3\65\6\65\u0167\n\65\r\65\16\65\u0168\3\65"+
		"\3\65\5\65\u016d\n\65\3\65\6\65\u0170\n\65\r\65\16\65\u0171\5\65\u0174"+
		"\n\65\3\66\6\66\u0177\n\66\r\66\16\66\u0178\3\67\3\67\5\67\u017d\n\67"+
		"\38\38\38\78\u0182\n8\f8\168\u0185\138\39\69\u0188\n9\r9\169\u0189\39"+
		"\39\3:\3:\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?"+
		"\3?\3\u011d\2@\5\2\7\2\t\2\13\2\r\3\17\4\21\5\23\6\25\7\27\b\31\t\33\n"+
		"\35\13\37\f!\r#\16%\17\'\20)\21+\22-\23/\24\61\25\63\26\65\27\67\309\31"+
		";\32=\33?\34A\35C\36E\37G I!K\"M#O$Q%S&U\'W(Y)[*]+_,a-c.e/g\60i\66k\61"+
		"m\62o\2q\63s\64u\2w\65y\2{\67}\2\177\2\5\2\3\4\t\5\2C\\\u00c2\u00d8\u00da"+
		"\u00e0\5\2c|\u00e1\u00f8\u00fa\u0101\3\2\62;\4\2\f\f\17\17\5\2\13\f\16"+
		"\17\"\"\b\2$$^^hhppttvv\4\2$$^^\2\u01ab\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2w\3\2\2\2\3y\3\2\2\2\4{\3\2\2\2\4}\3\2\2\2\4\177\3\2\2\2\5\u0083\3"+
		"\2\2\2\7\u0085\3\2\2\2\t\u0087\3\2\2\2\13\u0089\3\2\2\2\r\u008b\3\2\2"+
		"\2\17\u008d\3\2\2\2\21\u008f\3\2\2\2\23\u0091\3\2\2\2\25\u0094\3\2\2\2"+
		"\27\u0096\3\2\2\2\31\u0098\3\2\2\2\33\u009b\3\2\2\2\35\u009d\3\2\2\2\37"+
		"\u009f\3\2\2\2!\u00a2\3\2\2\2#\u00a4\3\2\2\2%\u00a6\3\2\2\2\'\u00a8\3"+
		"\2\2\2)\u00ab\3\2\2\2+\u00ad\3\2\2\2-\u00af\3\2\2\2/\u00b1\3\2\2\2\61"+
		"\u00b3\3\2\2\2\63\u00b5\3\2\2\2\65\u00b8\3\2\2\2\67\u00bb\3\2\2\29\u00be"+
		"\3\2\2\2;\u00c1\3\2\2\2=\u00c3\3\2\2\2?\u00c7\3\2\2\2A\u00cc\3\2\2\2C"+
		"\u00d0\3\2\2\2E\u00d5\3\2\2\2G\u00dc\3\2\2\2I\u00e1\3\2\2\2K\u00e5\3\2"+
		"\2\2M\u00e8\3\2\2\2O\u00eb\3\2\2\2Q\u00ef\3\2\2\2S\u00f6\3\2\2\2U\u00fe"+
		"\3\2\2\2W\u0102\3\2\2\2Y\u0105\3\2\2\2[\u0117\3\2\2\2]\u012e\3\2\2\2_"+
		"\u0130\3\2\2\2a\u0135\3\2\2\2c\u013e\3\2\2\2e\u0146\3\2\2\2g\u0151\3\2"+
		"\2\2i\u015a\3\2\2\2k\u0160\3\2\2\2m\u0176\3\2\2\2o\u017c\3\2\2\2q\u017e"+
		"\3\2\2\2s\u0187\3\2\2\2u\u018d\3\2\2\2w\u018f\3\2\2\2y\u0191\3\2\2\2{"+
		"\u0196\3\2\2\2}\u019b\3\2\2\2\177\u01a0\3\2\2\2\u0081\u0084\5\7\3\2\u0082"+
		"\u0084\5\t\4\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\6\3\2\2\2"+
		"\u0085\u0086\t\2\2\2\u0086\b\3\2\2\2\u0087\u0088\t\3\2\2\u0088\n\3\2\2"+
		"\2\u0089\u008a\t\4\2\2\u008a\f\3\2\2\2\u008b\u008c\7=\2\2\u008c\16\3\2"+
		"\2\2\u008d\u008e\7*\2\2\u008e\20\3\2\2\2\u008f\u0090\7+\2\2\u0090\22\3"+
		"\2\2\2\u0091\u0092\7/\2\2\u0092\u0093\7~\2\2\u0093\24\3\2\2\2\u0094\u0095"+
		"\7?\2\2\u0095\26\3\2\2\2\u0096\u0097\7<\2\2\u0097\30\3\2\2\2\u0098\u0099"+
		"\7\61\2\2\u0099\u009a\7^\2\2\u009a\32\3\2\2\2\u009b\u009c\7}\2\2\u009c"+
		"\34\3\2\2\2\u009d\u009e\7\177\2\2\u009e\36\3\2\2\2\u009f\u00a0\7/\2\2"+
		"\u00a0\u00a1\7@\2\2\u00a1 \3\2\2\2\u00a2\u00a3\7\60\2\2\u00a3\"\3\2\2"+
		"\2\u00a4\u00a5\7.\2\2\u00a5$\3\2\2\2\u00a6\u00a7\7~\2\2\u00a7&\3\2\2\2"+
		"\u00a8\u00a9\7~\2\2\u00a9\u00aa\7<\2\2\u00aa(\3\2\2\2\u00ab\u00ac\7-\2"+
		"\2\u00ac*\3\2\2\2\u00ad\u00ae\7/\2\2\u00ae,\3\2\2\2\u00af\u00b0\7,\2\2"+
		"\u00b0.\3\2\2\2\u00b1\u00b2\7\61\2\2\u00b2\60\3\2\2\2\u00b3\u00b4\7@\2"+
		"\2\u00b4\62\3\2\2\2\u00b5\u00b6\7@\2\2\u00b6\u00b7\7?\2\2\u00b7\64\3\2"+
		"\2\2\u00b8\u00b9\7?\2\2\u00b9\u00ba\7?\2\2\u00ba\66\3\2\2\2\u00bb\u00bc"+
		"\7#\2\2\u00bc\u00bd\7?\2\2\u00bd8\3\2\2\2\u00be\u00bf\7>\2\2\u00bf\u00c0"+
		"\7?\2\2\u00c0:\3\2\2\2\u00c1\u00c2\7>\2\2\u00c2<\3\2\2\2\u00c3\u00c4\7"+
		"C\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7{\2\2\u00c6>\3\2\2\2\u00c7\u00c8"+
		"\7D\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7n\2\2\u00cb"+
		"@\3\2\2\2\u00cc\u00cd\7K\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7v\2\2\u00cf"+
		"B\3\2\2\2\u00d0\u00d1\7T\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7c\2\2\u00d3"+
		"\u00d4\7n\2\2\u00d4D\3\2\2\2\u00d5\u00d6\7U\2\2\u00d6\u00d7\7v\2\2\u00d7"+
		"\u00d8\7t\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7i\2\2"+
		"\u00dbF\3\2\2\2\u00dc\u00dd\7W\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7k\2"+
		"\2\u00df\u00e0\7v\2\2\u00e0H\3\2\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7"+
		"p\2\2\u00e3\u00e4\7f\2\2\u00e4J\3\2\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7"+
		"\7u\2\2\u00e7L\3\2\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7p\2\2\u00eaN\3"+
		"\2\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7v\2\2\u00ee"+
		"P\3\2\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7v\2\2\u00f2"+
		"\u00f3\7t\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7e\2\2\u00f5R\3\2\2\2\u00f6"+
		"\u00f7\7n\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7v\2\2"+
		"\u00fa\u00fb\7{\2\2\u00fb\u00fc\7r\2\2\u00fc\u00fd\7g\2\2\u00fdT\3\2\2"+
		"\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7q\2\2\u0100\u0101\7v\2\2\u0101V\3\2"+
		"\2\2\u0102\u0103\7q\2\2\u0103\u0104\7t\2\2\u0104X\3\2\2\2\u0105\u0106"+
		"\7\61\2\2\u0106\u0107\7\61\2\2\u0107\u010b\3\2\2\2\u0108\u010a\n\5\2\2"+
		"\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u0113\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0110\7\17\2\2"+
		"\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0114"+
		"\7\f\2\2\u0112\u0114\7\2\2\3\u0113\u010f\3\2\2\2\u0113\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0116\b,\2\2\u0116Z\3\2\2\2\u0117\u0118\7\61\2\2"+
		"\u0118\u0119\7,\2\2\u0119\u011d\3\2\2\2\u011a\u011c\13\2\2\2\u011b\u011a"+
		"\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7,\2\2\u0121\u0122\7\61"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u0124\b-\2\2\u0124\\\3\2\2\2\u0125\u0126"+
		"\7v\2\2\u0126\u0127\7t\2\2\u0127\u0128\7w\2\2\u0128\u012f\7g\2\2\u0129"+
		"\u012a\7h\2\2\u012a\u012b\7c\2\2\u012b\u012c\7n\2\2\u012c\u012d\7u\2\2"+
		"\u012d\u012f\7g\2\2\u012e\u0125\3\2\2\2\u012e\u0129\3\2\2\2\u012f^\3\2"+
		"\2\2\u0130\u0131\7w\2\2\u0131\u0132\7p\2\2\u0132\u0133\7k\2\2\u0133\u0134"+
		"\7v\2\2\u0134`\3\2\2\2\u0135\u0136\7t\2\2\u0136\u0137\7g\2\2\u0137\u0138"+
		"\7c\2\2\u0138\u0139\7f\2\2\u0139\u013a\7T\2\2\u013a\u013b\7g\2\2\u013b"+
		"\u013c\7c\2\2\u013c\u013d\7n\2\2\u013db\3\2\2\2\u013e\u013f\7t\2\2\u013f"+
		"\u0140\7g\2\2\u0140\u0141\7c\2\2\u0141\u0142\7f\2\2\u0142\u0143\7K\2\2"+
		"\u0143\u0144\7p\2\2\u0144\u0145\7v\2\2\u0145d\3\2\2\2\u0146\u0147\7t\2"+
		"\2\u0147\u0148\7g\2\2\u0148\u0149\7c\2\2\u0149\u014a\7f\2\2\u014a\u014b"+
		"\7U\2\2\u014b\u014c\7v\2\2\u014c\u014d\7t\2\2\u014d\u014e\7k\2\2\u014e"+
		"\u014f\7p\2\2\u014f\u0150\7i\2\2\u0150f\3\2\2\2\u0151\u0152\7t\2\2\u0152"+
		"\u0153\7g\2\2\u0153\u0154\7c\2\2\u0154\u0155\7f\2\2\u0155\u0156\7D\2\2"+
		"\u0156\u0157\7q\2\2\u0157\u0158\7q\2\2\u0158\u0159\7n\2\2\u0159h\3\2\2"+
		"\2\u015a\u015b\7$\2\2\u015b\u015c\3\2\2\2\u015c\u015d\b\64\3\2\u015d\u015e"+
		"\b\64\4\2\u015ej\3\2\2\2\u015f\u0161\5\13\5\2\u0160\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0164\u0166\7\60\2\2\u0165\u0167\5\13\5\2\u0166\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0173\3\2"+
		"\2\2\u016a\u016c\7g\2\2\u016b\u016d\7/\2\2\u016c\u016b\3\2\2\2\u016c\u016d"+
		"\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u0170\5\13\5\2\u016f\u016e\3\2\2\2"+
		"\u0170\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174"+
		"\3\2\2\2\u0173\u016a\3\2\2\2\u0173\u0174\3\2\2\2\u0174l\3\2\2\2\u0175"+
		"\u0177\5\13\5\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0176\3"+
		"\2\2\2\u0178\u0179\3\2\2\2\u0179n\3\2\2\2\u017a\u017d\5\5\2\2\u017b\u017d"+
		"\7a\2\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017dp\3\2\2\2\u017e\u0183"+
		"\5o\67\2\u017f\u0182\5o\67\2\u0180\u0182\5\13\5\2\u0181\u017f\3\2\2\2"+
		"\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184r\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0188\t\6\2\2\u0187"+
		"\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018a\u018b\3\2\2\2\u018b\u018c\b9\2\2\u018ct\3\2\2\2\u018d\u018e"+
		"\t\7\2\2\u018ev\3\2\2\2\u018f\u0190\13\2\2\2\u0190x\3\2\2\2\u0191\u0192"+
		"\5u:\2\u0192\u0193\3\2\2\2\u0193\u0194\b<\3\2\u0194\u0195\b<\5\2\u0195"+
		"z\3\2\2\2\u0196\u0197\7^\2\2\u0197\u0198\3\2\2\2\u0198\u0199\b=\3\2\u0199"+
		"\u019a\b=\6\2\u019a|\3\2\2\2\u019b\u019c\7$\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019e\b>\7\2\u019e\u019f\b>\b\2\u019f~\3\2\2\2\u01a0\u01a1\n\b\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a3\b?\3\2\u01a3\u0080\3\2\2\2\25\2\3\4\u0083\u010b"+
		"\u010f\u0113\u011d\u012e\u0162\u0168\u016c\u0171\u0173\u0178\u017c\u0181"+
		"\u0183\u0189\t\b\2\2\5\2\2\4\4\2\6\2\2\7\3\2\t\66\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}