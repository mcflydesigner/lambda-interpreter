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
		MULTICOMMENT_antlr_builtin=39, Bool=40, Unit=41, Print=42, Read=43, DOUBLE=44, 
		INTEGER=45, IDENT=46, WS=47, ErrorToken=48, STRING=49, STRINGESC=50;
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
		"Print", "Read", "STRING", "DOUBLE", "INTEGER", "IDENTIFIER_FIRST", "IDENT", 
		"WS", "Escapable", "ErrorToken", "STRESCAPED", "STRINGESC", "STRINGEND", 
		"STRINGTEXT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0188\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t"+
		"\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4"+
		"*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\3\2\3\2\5\2~\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!"+
		"\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3*\3*\3*\3+\3+\3+\3+\7+\u0108\n+\f+\16+\u010b\13+\3+\5+\u010e\n+\3+"+
		"\3+\5+\u0112\n+\3+\3+\3,\3,\3,\3,\7,\u011a\n,\f,\16,\u011d\13,\3,\3,\3"+
		",\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u012d\n-\3.\3.\3.\3.\3.\3/\3/\3"+
		"/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\6\62"+
		"\u0145\n\62\r\62\16\62\u0146\3\62\3\62\6\62\u014b\n\62\r\62\16\62\u014c"+
		"\3\62\3\62\5\62\u0151\n\62\3\62\6\62\u0154\n\62\r\62\16\62\u0155\5\62"+
		"\u0158\n\62\3\63\6\63\u015b\n\63\r\63\16\63\u015c\3\64\3\64\5\64\u0161"+
		"\n\64\3\65\3\65\3\65\7\65\u0166\n\65\f\65\16\65\u0169\13\65\3\66\6\66"+
		"\u016c\n\66\r\66\16\66\u016d\3\66\3\66\3\67\3\67\38\38\39\39\39\39\39"+
		"\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3\u011b\2=\5\2\7\2\t\2\13\2"+
		"\r\3\17\4\21\5\23\6\25\7\27\b\31\t\33\n\35\13\37\f!\r#\16%\17\'\20)\21"+
		"+\22-\23/\24\61\25\63\26\65\27\67\309\31;\32=\33?\34A\35C\36E\37G I!K"+
		"\"M#O$Q%S&U\'W(Y)[*]+_,a-c\63e.g/i\2k\60m\61o\2q\62s\2u\64w\2y\2\5\2\3"+
		"\4\t\5\2C\\\u00c2\u00d8\u00da\u00e0\5\2c|\u00e1\u00f8\u00fa\u0101\3\2"+
		"\62;\4\2\f\f\17\17\5\2\13\f\16\17\"\"\b\2$$^^hhppttvv\4\2$$^^\2\u018f"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2q\3\2\2\2\3s\3\2\2\2\4u\3\2\2\2\4w\3\2\2\2\4y\3\2\2\2\5}\3\2\2\2\7\177"+
		"\3\2\2\2\t\u0081\3\2\2\2\13\u0083\3\2\2\2\r\u0085\3\2\2\2\17\u0087\3\2"+
		"\2\2\21\u008a\3\2\2\2\23\u008d\3\2\2\2\25\u008f\3\2\2\2\27\u0091\3\2\2"+
		"\2\31\u0093\3\2\2\2\33\u0095\3\2\2\2\35\u0097\3\2\2\2\37\u0099\3\2\2\2"+
		"!\u009b\3\2\2\2#\u009e\3\2\2\2%\u00a0\3\2\2\2\'\u00a2\3\2\2\2)\u00a4\3"+
		"\2\2\2+\u00a6\3\2\2\2-\u00a8\3\2\2\2/\u00ab\3\2\2\2\61\u00ae\3\2\2\2\63"+
		"\u00b1\3\2\2\2\65\u00b3\3\2\2\2\67\u00b5\3\2\2\29\u00b7\3\2\2\2;\u00ba"+
		"\3\2\2\2=\u00be\3\2\2\2?\u00c6\3\2\2\2A\u00ce\3\2\2\2C\u00d3\3\2\2\2E"+
		"\u00da\3\2\2\2G\u00df\3\2\2\2I\u00e3\3\2\2\2K\u00e6\3\2\2\2M\u00e9\3\2"+
		"\2\2O\u00ed\3\2\2\2Q\u00f4\3\2\2\2S\u00fc\3\2\2\2U\u0100\3\2\2\2W\u0103"+
		"\3\2\2\2Y\u0115\3\2\2\2[\u012c\3\2\2\2]\u012e\3\2\2\2_\u0133\3\2\2\2a"+
		"\u0139\3\2\2\2c\u013e\3\2\2\2e\u0144\3\2\2\2g\u015a\3\2\2\2i\u0160\3\2"+
		"\2\2k\u0162\3\2\2\2m\u016b\3\2\2\2o\u0171\3\2\2\2q\u0173\3\2\2\2s\u0175"+
		"\3\2\2\2u\u017a\3\2\2\2w\u017f\3\2\2\2y\u0184\3\2\2\2{~\5\7\3\2|~\5\t"+
		"\4\2}{\3\2\2\2}|\3\2\2\2~\6\3\2\2\2\177\u0080\t\2\2\2\u0080\b\3\2\2\2"+
		"\u0081\u0082\t\3\2\2\u0082\n\3\2\2\2\u0083\u0084\t\4\2\2\u0084\f\3\2\2"+
		"\2\u0085\u0086\7=\2\2\u0086\16\3\2\2\2\u0087\u0088\7/\2\2\u0088\u0089"+
		"\7~\2\2\u0089\20\3\2\2\2\u008a\u008b\7\61\2\2\u008b\u008c\7^\2\2\u008c"+
		"\22\3\2\2\2\u008d\u008e\7}\2\2\u008e\24\3\2\2\2\u008f\u0090\7\177\2\2"+
		"\u0090\26\3\2\2\2\u0091\u0092\7*\2\2\u0092\30\3\2\2\2\u0093\u0094\7+\2"+
		"\2\u0094\32\3\2\2\2\u0095\u0096\7.\2\2\u0096\34\3\2\2\2\u0097\u0098\7"+
		"~\2\2\u0098\36\3\2\2\2\u0099\u009a\7<\2\2\u009a \3\2\2\2\u009b\u009c\7"+
		"~\2\2\u009c\u009d\7<\2\2\u009d\"\3\2\2\2\u009e\u009f\7-\2\2\u009f$\3\2"+
		"\2\2\u00a0\u00a1\7/\2\2\u00a1&\3\2\2\2\u00a2\u00a3\7,\2\2\u00a3(\3\2\2"+
		"\2\u00a4\u00a5\7\61\2\2\u00a5*\3\2\2\2\u00a6\u00a7\7@\2\2\u00a7,\3\2\2"+
		"\2\u00a8\u00a9\7@\2\2\u00a9\u00aa\7?\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7"+
		"?\2\2\u00ac\u00ad\7?\2\2\u00ad\60\3\2\2\2\u00ae\u00af\7>\2\2\u00af\u00b0"+
		"\7?\2\2\u00b0\62\3\2\2\2\u00b1\u00b2\7>\2\2\u00b2\64\3\2\2\2\u00b3\u00b4"+
		"\7?\2\2\u00b4\66\3\2\2\2\u00b5\u00b6\7\60\2\2\u00b68\3\2\2\2\u00b7\u00b8"+
		"\7/\2\2\u00b8\u00b9\7@\2\2\u00b9:\3\2\2\2\u00ba\u00bb\7C\2\2\u00bb\u00bc"+
		"\7p\2\2\u00bc\u00bd\7{\2\2\u00bd<\3\2\2\2\u00be\u00bf\7D\2\2\u00bf\u00c0"+
		"\7q\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7g\2\2\u00c3"+
		"\u00c4\7c\2\2\u00c4\u00c5\7p\2\2\u00c5>\3\2\2\2\u00c6\u00c7\7K\2\2\u00c7"+
		"\u00c8\7p\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7i\2\2"+
		"\u00cb\u00cc\7g\2\2\u00cc\u00cd\7t\2\2\u00cd@\3\2\2\2\u00ce\u00cf\7T\2"+
		"\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7n\2\2\u00d2B\3\2"+
		"\2\2\u00d3\u00d4\7U\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7"+
		"\7k\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7i\2\2\u00d9D\3\2\2\2\u00da\u00db"+
		"\7W\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7v\2\2\u00de"+
		"F\3\2\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7f\2\2\u00e2"+
		"H\3\2\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7u\2\2\u00e5J\3\2\2\2\u00e6\u00e7"+
		"\7k\2\2\u00e7\u00e8\7p\2\2\u00e8L\3\2\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb"+
		"\7g\2\2\u00eb\u00ec\7v\2\2\u00ecN\3\2\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef"+
		"\7g\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7g\2\2\u00f2"+
		"\u00f3\7e\2\2\u00f3P\3\2\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7g\2\2\u00f6"+
		"\u00f7\7v\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7{\2\2\u00f9\u00fa\7r\2\2"+
		"\u00fa\u00fb\7g\2\2\u00fbR\3\2\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7q\2"+
		"\2\u00fe\u00ff\7v\2\2\u00ffT\3\2\2\2\u0100\u0101\7q\2\2\u0101\u0102\7"+
		"t\2\2\u0102V\3\2\2\2\u0103\u0104\7\61\2\2\u0104\u0105\7\61\2\2\u0105\u0109"+
		"\3\2\2\2\u0106\u0108\n\5\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0111\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c\u010e\7\17\2\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0112\7\f\2\2\u0110\u0112\7\2\2\3\u0111\u010d\3\2"+
		"\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\b+\2\2\u0114"+
		"X\3\2\2\2\u0115\u0116\7\61\2\2\u0116\u0117\7,\2\2\u0117\u011b\3\2\2\2"+
		"\u0118\u011a\13\2\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u011f\7,\2\2\u011f\u0120\7\61\2\2\u0120\u0121\3\2\2\2\u0121\u0122\b,"+
		"\2\2\u0122Z\3\2\2\2\u0123\u0124\7v\2\2\u0124\u0125\7t\2\2\u0125\u0126"+
		"\7w\2\2\u0126\u012d\7g\2\2\u0127\u0128\7h\2\2\u0128\u0129\7c\2\2\u0129"+
		"\u012a\7n\2\2\u012a\u012b\7u\2\2\u012b\u012d\7g\2\2\u012c\u0123\3\2\2"+
		"\2\u012c\u0127\3\2\2\2\u012d\\\3\2\2\2\u012e\u012f\7w\2\2\u012f\u0130"+
		"\7p\2\2\u0130\u0131\7k\2\2\u0131\u0132\7v\2\2\u0132^\3\2\2\2\u0133\u0134"+
		"\7r\2\2\u0134\u0135\7t\2\2\u0135\u0136\7k\2\2\u0136\u0137\7p\2\2\u0137"+
		"\u0138\7v\2\2\u0138`\3\2\2\2\u0139\u013a\7t\2\2\u013a\u013b\7g\2\2\u013b"+
		"\u013c\7c\2\2\u013c\u013d\7f\2\2\u013db\3\2\2\2\u013e\u013f\7$\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0141\b\61\3\2\u0141\u0142\b\61\4\2\u0142d\3\2\2"+
		"\2\u0143\u0145\5\13\5\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\7\60"+
		"\2\2\u0149\u014b\5\13\5\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0157\3\2\2\2\u014e\u0150\7g"+
		"\2\2\u014f\u0151\7/\2\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0153\3\2\2\2\u0152\u0154\5\13\5\2\u0153\u0152\3\2\2\2\u0154\u0155\3"+
		"\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157"+
		"\u014e\3\2\2\2\u0157\u0158\3\2\2\2\u0158f\3\2\2\2\u0159\u015b\5\13\5\2"+
		"\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015dh\3\2\2\2\u015e\u0161\5\5\2\2\u015f\u0161\7a\2\2\u0160\u015e"+
		"\3\2\2\2\u0160\u015f\3\2\2\2\u0161j\3\2\2\2\u0162\u0167\5i\64\2\u0163"+
		"\u0166\5i\64\2\u0164\u0166\5\13\5\2\u0165\u0163\3\2\2\2\u0165\u0164\3"+
		"\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"l\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016c\t\6\2\2\u016b\u016a\3\2\2\2"+
		"\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u0170\b\66\2\2\u0170n\3\2\2\2\u0171\u0172\t\7\2\2\u0172"+
		"p\3\2\2\2\u0173\u0174\13\2\2\2\u0174r\3\2\2\2\u0175\u0176\5o\67\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0178\b9\3\2\u0178\u0179\b9\5\2\u0179t\3\2\2\2\u017a"+
		"\u017b\7^\2\2\u017b\u017c\3\2\2\2\u017c\u017d\b:\3\2\u017d\u017e\b:\6"+
		"\2\u017ev\3\2\2\2\u017f\u0180\7$\2\2\u0180\u0181\3\2\2\2\u0181\u0182\b"+
		";\7\2\u0182\u0183\b;\b\2\u0183x\3\2\2\2\u0184\u0185\n\b\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u0187\b<\3\2\u0187z\3\2\2\2\25\2\3\4}\u0109\u010d\u0111"+
		"\u011b\u012c\u0146\u014c\u0150\u0155\u0157\u015c\u0160\u0165\u0167\u016d"+
		"\t\b\2\2\5\2\2\4\4\2\6\2\2\7\3\2\t\63\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}