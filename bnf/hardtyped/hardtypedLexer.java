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
		Surrogate_id_SYMB_35=36, Surrogate_id_SYMB_36=37, COMMENT_antlr_builtin=38, 
		MULTICOMMENT_antlr_builtin=39, Bool=40, Unit=41, Print=42, ReadReal=43, 
		ReadInt=44, ReadString=45, ReadBool=46, PackageExtension=47, DOUBLE=48, 
		INTEGER=49, IDENT=50, WS=51, ErrorToken=52, STRING=53, STRINGESC=54;
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
		"COMMENT_antlr_builtin", "MULTICOMMENT_antlr_builtin", "Bool", "Unit", 
		"Print", "ReadReal", "ReadInt", "ReadString", "ReadBool", "PackageExtension", 
		"STRING", "DOUBLE", "INTEGER", "IDENTIFIER_FIRST", "IDENT", "WS", "Escapable", 
		"ErrorToken", "STRESCAPED", "STRINGESC", "STRINGEND", "STRINGTEXT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'-|'", "'.'", "'/'", "'='", "':'", "'/\\'", 
		"'{'", "'}'", "'->'", "','", "'|'", "'|:'", "'+'", "'-'", "'*'", "'>'", 
		"'>='", "'=='", "'!='", "'<='", "'<'", "'Any'", "'Bool'", "'Int'", "'Real'", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u01ac\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\3\2\3\2\5\2\u0086\n\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*"+
		"\3+\3+\3+\3+\7+\u0109\n+\f+\16+\u010c\13+\3+\5+\u010f\n+\3+\3+\5+\u0113"+
		"\n+\3+\3+\3,\3,\3,\3,\7,\u011b\n,\f,\16,\u011e\13,\3,\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\5-\u012e\n-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\65\3\65\3\66\6\66\u0169\n\66\r\66\16\66\u016a\3\66\3\66\6\66\u016f"+
		"\n\66\r\66\16\66\u0170\3\66\3\66\5\66\u0175\n\66\3\66\6\66\u0178\n\66"+
		"\r\66\16\66\u0179\5\66\u017c\n\66\3\67\6\67\u017f\n\67\r\67\16\67\u0180"+
		"\38\38\58\u0185\n8\39\39\39\79\u018a\n9\f9\169\u018d\139\3:\6:\u0190\n"+
		":\r:\16:\u0191\3:\3:\3;\3;\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3"+
		"?\3?\3?\3@\3@\3@\3@\3\u011c\2A\5\2\7\2\t\2\13\2\r\3\17\4\21\5\23\6\25"+
		"\7\27\b\31\t\33\n\35\13\37\f!\r#\16%\17\'\20)\21+\22-\23/\24\61\25\63"+
		"\26\65\27\67\309\31;\32=\33?\34A\35C\36E\37G I!K\"M#O$Q%S&U\'W(Y)[*]+"+
		"_,a-c.e/g\60i\61k\67m\62o\63q\2s\64u\65w\2y\66{\2}8\177\2\u0081\2\5\2"+
		"\3\4\t\5\2C\\\u00c2\u00d8\u00da\u00e0\5\2c|\u00e1\u00f8\u00fa\u0101\3"+
		"\2\62;\4\2\f\f\17\17\5\2\13\f\16\17\"\"\b\2$$^^hhppttvv\4\2$$^^\2\u01b3"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\4}"+
		"\3\2\2\2\4\177\3\2\2\2\4\u0081\3\2\2\2\5\u0085\3\2\2\2\7\u0087\3\2\2\2"+
		"\t\u0089\3\2\2\2\13\u008b\3\2\2\2\r\u008d\3\2\2\2\17\u008f\3\2\2\2\21"+
		"\u0091\3\2\2\2\23\u0093\3\2\2\2\25\u0096\3\2\2\2\27\u0098\3\2\2\2\31\u009a"+
		"\3\2\2\2\33\u009c\3\2\2\2\35\u009e\3\2\2\2\37\u00a1\3\2\2\2!\u00a3\3\2"+
		"\2\2#\u00a5\3\2\2\2%\u00a8\3\2\2\2\'\u00aa\3\2\2\2)\u00ac\3\2\2\2+\u00af"+
		"\3\2\2\2-\u00b1\3\2\2\2/\u00b3\3\2\2\2\61\u00b5\3\2\2\2\63\u00b7\3\2\2"+
		"\2\65\u00ba\3\2\2\2\67\u00bd\3\2\2\29\u00c0\3\2\2\2;\u00c3\3\2\2\2=\u00c5"+
		"\3\2\2\2?\u00c9\3\2\2\2A\u00ce\3\2\2\2C\u00d2\3\2\2\2E\u00d7\3\2\2\2G"+
		"\u00de\3\2\2\2I\u00e3\3\2\2\2K\u00e7\3\2\2\2M\u00ea\3\2\2\2O\u00ee\3\2"+
		"\2\2Q\u00f5\3\2\2\2S\u00fd\3\2\2\2U\u0101\3\2\2\2W\u0104\3\2\2\2Y\u0116"+
		"\3\2\2\2[\u012d\3\2\2\2]\u012f\3\2\2\2_\u0134\3\2\2\2a\u013a\3\2\2\2c"+
		"\u0143\3\2\2\2e\u014b\3\2\2\2g\u0156\3\2\2\2i\u015f\3\2\2\2k\u0162\3\2"+
		"\2\2m\u0168\3\2\2\2o\u017e\3\2\2\2q\u0184\3\2\2\2s\u0186\3\2\2\2u\u018f"+
		"\3\2\2\2w\u0195\3\2\2\2y\u0197\3\2\2\2{\u0199\3\2\2\2}\u019e\3\2\2\2\177"+
		"\u01a3\3\2\2\2\u0081\u01a8\3\2\2\2\u0083\u0086\5\7\3\2\u0084\u0086\5\t"+
		"\4\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\6\3\2\2\2\u0087\u0088"+
		"\t\2\2\2\u0088\b\3\2\2\2\u0089\u008a\t\3\2\2\u008a\n\3\2\2\2\u008b\u008c"+
		"\t\4\2\2\u008c\f\3\2\2\2\u008d\u008e\7=\2\2\u008e\16\3\2\2\2\u008f\u0090"+
		"\7*\2\2\u0090\20\3\2\2\2\u0091\u0092\7+\2\2\u0092\22\3\2\2\2\u0093\u0094"+
		"\7/\2\2\u0094\u0095\7~\2\2\u0095\24\3\2\2\2\u0096\u0097\7\60\2\2\u0097"+
		"\26\3\2\2\2\u0098\u0099\7\61\2\2\u0099\30\3\2\2\2\u009a\u009b\7?\2\2\u009b"+
		"\32\3\2\2\2\u009c\u009d\7<\2\2\u009d\34\3\2\2\2\u009e\u009f\7\61\2\2\u009f"+
		"\u00a0\7^\2\2\u00a0\36\3\2\2\2\u00a1\u00a2\7}\2\2\u00a2 \3\2\2\2\u00a3"+
		"\u00a4\7\177\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\7/\2\2\u00a6\u00a7\7@\2\2"+
		"\u00a7$\3\2\2\2\u00a8\u00a9\7.\2\2\u00a9&\3\2\2\2\u00aa\u00ab\7~\2\2\u00ab"+
		"(\3\2\2\2\u00ac\u00ad\7~\2\2\u00ad\u00ae\7<\2\2\u00ae*\3\2\2\2\u00af\u00b0"+
		"\7-\2\2\u00b0,\3\2\2\2\u00b1\u00b2\7/\2\2\u00b2.\3\2\2\2\u00b3\u00b4\7"+
		",\2\2\u00b4\60\3\2\2\2\u00b5\u00b6\7@\2\2\u00b6\62\3\2\2\2\u00b7\u00b8"+
		"\7@\2\2\u00b8\u00b9\7?\2\2\u00b9\64\3\2\2\2\u00ba\u00bb\7?\2\2\u00bb\u00bc"+
		"\7?\2\2\u00bc\66\3\2\2\2\u00bd\u00be\7#\2\2\u00be\u00bf\7?\2\2\u00bf8"+
		"\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1\u00c2\7?\2\2\u00c2:\3\2\2\2\u00c3\u00c4"+
		"\7>\2\2\u00c4<\3\2\2\2\u00c5\u00c6\7C\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8"+
		"\7{\2\2\u00c8>\3\2\2\2\u00c9\u00ca\7D\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc"+
		"\7q\2\2\u00cc\u00cd\7n\2\2\u00cd@\3\2\2\2\u00ce\u00cf\7K\2\2\u00cf\u00d0"+
		"\7p\2\2\u00d0\u00d1\7v\2\2\u00d1B\3\2\2\2\u00d2\u00d3\7T\2\2\u00d3\u00d4"+
		"\7g\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7n\2\2\u00d6D\3\2\2\2\u00d7\u00d8"+
		"\7U\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7k\2\2\u00db"+
		"\u00dc\7p\2\2\u00dc\u00dd\7i\2\2\u00ddF\3\2\2\2\u00de\u00df\7W\2\2\u00df"+
		"\u00e0\7p\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7v\2\2\u00e2H\3\2\2\2\u00e3"+
		"\u00e4\7c\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7f\2\2\u00e6J\3\2\2\2\u00e7"+
		"\u00e8\7k\2\2\u00e8\u00e9\7p\2\2\u00e9L\3\2\2\2\u00ea\u00eb\7n\2\2\u00eb"+
		"\u00ec\7g\2\2\u00ec\u00ed\7v\2\2\u00edN\3\2\2\2\u00ee\u00ef\7n\2\2\u00ef"+
		"\u00f0\7g\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7g\2\2"+
		"\u00f3\u00f4\7e\2\2\u00f4P\3\2\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7g\2"+
		"\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7{\2\2\u00fa\u00fb"+
		"\7r\2\2\u00fb\u00fc\7g\2\2\u00fcR\3\2\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff"+
		"\7q\2\2\u00ff\u0100\7v\2\2\u0100T\3\2\2\2\u0101\u0102\7q\2\2\u0102\u0103"+
		"\7t\2\2\u0103V\3\2\2\2\u0104\u0105\7\61\2\2\u0105\u0106\7\61\2\2\u0106"+
		"\u010a\3\2\2\2\u0107\u0109\n\5\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0112\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010d\u010f\7\17\2\2\u010e\u010d\3\2\2\2\u010e\u010f\3"+
		"\2\2\2\u010f\u0110\3\2\2\2\u0110\u0113\7\f\2\2\u0111\u0113\7\2\2\3\u0112"+
		"\u010e\3\2\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\b+"+
		"\2\2\u0115X\3\2\2\2\u0116\u0117\7\61\2\2\u0117\u0118\7,\2\2\u0118\u011c"+
		"\3\2\2\2\u0119\u011b\13\2\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c"+
		"\3\2\2\2\u011f\u0120\7,\2\2\u0120\u0121\7\61\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0123\b,\2\2\u0123Z\3\2\2\2\u0124\u0125\7v\2\2\u0125\u0126\7t\2\2\u0126"+
		"\u0127\7w\2\2\u0127\u012e\7g\2\2\u0128\u0129\7h\2\2\u0129\u012a\7c\2\2"+
		"\u012a\u012b\7n\2\2\u012b\u012c\7u\2\2\u012c\u012e\7g\2\2\u012d\u0124"+
		"\3\2\2\2\u012d\u0128\3\2\2\2\u012e\\\3\2\2\2\u012f\u0130\7w\2\2\u0130"+
		"\u0131\7p\2\2\u0131\u0132\7k\2\2\u0132\u0133\7v\2\2\u0133^\3\2\2\2\u0134"+
		"\u0135\7r\2\2\u0135\u0136\7t\2\2\u0136\u0137\7k\2\2\u0137\u0138\7p\2\2"+
		"\u0138\u0139\7v\2\2\u0139`\3\2\2\2\u013a\u013b\7t\2\2\u013b\u013c\7g\2"+
		"\2\u013c\u013d\7c\2\2\u013d\u013e\7f\2\2\u013e\u013f\7T\2\2\u013f\u0140"+
		"\7g\2\2\u0140\u0141\7c\2\2\u0141\u0142\7n\2\2\u0142b\3\2\2\2\u0143\u0144"+
		"\7t\2\2\u0144\u0145\7g\2\2\u0145\u0146\7c\2\2\u0146\u0147\7f\2\2\u0147"+
		"\u0148\7K\2\2\u0148\u0149\7p\2\2\u0149\u014a\7v\2\2\u014ad\3\2\2\2\u014b"+
		"\u014c\7t\2\2\u014c\u014d\7g\2\2\u014d\u014e\7c\2\2\u014e\u014f\7f\2\2"+
		"\u014f\u0150\7U\2\2\u0150\u0151\7v\2\2\u0151\u0152\7t\2\2\u0152\u0153"+
		"\7k\2\2\u0153\u0154\7p\2\2\u0154\u0155\7i\2\2\u0155f\3\2\2\2\u0156\u0157"+
		"\7t\2\2\u0157\u0158\7g\2\2\u0158\u0159\7c\2\2\u0159\u015a\7f\2\2\u015a"+
		"\u015b\7D\2\2\u015b\u015c\7q\2\2\u015c\u015d\7q\2\2\u015d\u015e\7n\2\2"+
		"\u015eh\3\2\2\2\u015f\u0160\7p\2\2\u0160\u0161\7m\2\2\u0161j\3\2\2\2\u0162"+
		"\u0163\7$\2\2\u0163\u0164\3\2\2\2\u0164\u0165\b\65\3\2\u0165\u0166\b\65"+
		"\4\2\u0166l\3\2\2\2\u0167\u0169\5\13\5\2\u0168\u0167\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016e\7\60\2\2\u016d\u016f\5\13\5\2\u016e\u016d\3\2\2\2\u016f\u0170\3"+
		"\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u017b\3\2\2\2\u0172"+
		"\u0174\7g\2\2\u0173\u0175\7/\2\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2"+
		"\2\u0175\u0177\3\2\2\2\u0176\u0178\5\13\5\2\u0177\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2"+
		"\2\2\u017b\u0172\3\2\2\2\u017b\u017c\3\2\2\2\u017cn\3\2\2\2\u017d\u017f"+
		"\5\13\5\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2"+
		"\u0180\u0181\3\2\2\2\u0181p\3\2\2\2\u0182\u0185\5\5\2\2\u0183\u0185\7"+
		"a\2\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185r\3\2\2\2\u0186\u018b"+
		"\5q8\2\u0187\u018a\5q8\2\u0188\u018a\5\13\5\2\u0189\u0187\3\2\2\2\u0189"+
		"\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018ct\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0190\t\6\2\2\u018f\u018e"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0194\b:\2\2\u0194v\3\2\2\2\u0195\u0196\t\7\2\2\u0196"+
		"x\3\2\2\2\u0197\u0198\13\2\2\2\u0198z\3\2\2\2\u0199\u019a\5w;\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019c\b=\3\2\u019c\u019d\b=\5\2\u019d|\3\2\2\2\u019e"+
		"\u019f\7^\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\b>\3\2\u01a1\u01a2\b>\6"+
		"\2\u01a2~\3\2\2\2\u01a3\u01a4\7$\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\b"+
		"?\7\2\u01a6\u01a7\b?\b\2\u01a7\u0080\3\2\2\2\u01a8\u01a9\n\b\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ab\b@\3\2\u01ab\u0082\3\2\2\2\25\2\3\4\u0085\u010a"+
		"\u010e\u0112\u011c\u012d\u016a\u0170\u0174\u0179\u017b\u0180\u0184\u0189"+
		"\u018b\u0191\t\b\2\2\5\2\2\4\4\2\6\2\2\7\3\2\t\67\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}