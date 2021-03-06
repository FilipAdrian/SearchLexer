// Generated from C:/Users/Adrian/IdeaProjects/SearchLexer/src/main/java/Antlr\Grammar.g4 by ANTLR 4.7.2
package Antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPECIAL_SYMBOL=1, FORMAT=2, CHANGE=3, CHANGE_BY_NUMBER_FORMAT=4, CHANGE_BY_DATE_FORMAT=5, 
		START=6, PREFIX=7, SUFFIX=8, FRAGMENT=9, END=10, PATH=11, FIND=12, FINDL=13, 
		REPLACE=14, COUNT=15, LOOK_FOR=16, LPAREN=17, COMMA=18, RPAREN=19, SEMICOLON=20, 
		DOUBLECOUNT=21, EQUAL=22, WS=23, White=24, DIGIT=25, LETTER=26, SYMBOLS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SPECIAL_SYMBOL", "FORMAT", "CHANGE", "CHANGE_BY_NUMBER_FORMAT", "CHANGE_BY_DATE_FORMAT", 
			"START", "PREFIX", "SUFFIX", "FRAGMENT", "END", "PATH", "FIND", "FINDL", 
			"REPLACE", "COUNT", "LOOK_FOR", "LPAREN", "COMMA", "RPAREN", "SEMICOLON", 
			"DOUBLECOUNT", "EQUAL", "WS", "White", "DIGIT", "LETTER", "SYMBOLS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'.format'", "'change'", "'.numberFormat'", "'.dateFormat'", 
			"'Start'", "'.byPrefix'", "'.bySuffix'", "'.byFragment'", "'End'", "'path'", 
			"'find'", "'findLine'", "'replace'", "'count'", "'lookFor'", "'('", "','", 
			"')'", "';'", "'\"'", "'='", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPECIAL_SYMBOL", "FORMAT", "CHANGE", "CHANGE_BY_NUMBER_FORMAT", 
			"CHANGE_BY_DATE_FORMAT", "START", "PREFIX", "SUFFIX", "FRAGMENT", "END", 
			"PATH", "FIND", "FINDL", "REPLACE", "COUNT", "LOOK_FOR", "LPAREN", "COMMA", 
			"RPAREN", "SEMICOLON", "DOUBLECOUNT", "EQUAL", "WS", "White", "DIGIT", 
			"LETTER", "SYMBOLS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00db\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\6\30\u00c5\n\30\r\30\16\30\u00c6\3\30\3\30\3\31\3\31\3\32\6"+
		"\32\u00ce\n\32\r\32\16\32\u00cf\3\33\6\33\u00d3\n\33\r\33\16\33\u00d4"+
		"\3\34\6\34\u00d8\n\34\r\34\16\34\u00d9\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\7\6\2%%,-\61\61~~\5\2\13\f\17"+
		"\17\"\"\3\2\62;\4\2C\\c|\6\2/\61<<^^aa\2\u00de\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7C\3\2\2\2\tJ\3\2"+
		"\2\2\13X\3\2\2\2\rd\3\2\2\2\17j\3\2\2\2\21t\3\2\2\2\23~\3\2\2\2\25\u008a"+
		"\3\2\2\2\27\u008e\3\2\2\2\31\u0093\3\2\2\2\33\u0098\3\2\2\2\35\u00a1\3"+
		"\2\2\2\37\u00a9\3\2\2\2!\u00af\3\2\2\2#\u00b7\3\2\2\2%\u00b9\3\2\2\2\'"+
		"\u00bb\3\2\2\2)\u00bd\3\2\2\2+\u00bf\3\2\2\2-\u00c1\3\2\2\2/\u00c4\3\2"+
		"\2\2\61\u00ca\3\2\2\2\63\u00cd\3\2\2\2\65\u00d2\3\2\2\2\67\u00d7\3\2\2"+
		"\29:\t\2\2\2:\4\3\2\2\2;<\7\60\2\2<=\7h\2\2=>\7q\2\2>?\7t\2\2?@\7o\2\2"+
		"@A\7c\2\2AB\7v\2\2B\6\3\2\2\2CD\7e\2\2DE\7j\2\2EF\7c\2\2FG\7p\2\2GH\7"+
		"i\2\2HI\7g\2\2I\b\3\2\2\2JK\7\60\2\2KL\7p\2\2LM\7w\2\2MN\7o\2\2NO\7d\2"+
		"\2OP\7g\2\2PQ\7t\2\2QR\7H\2\2RS\7q\2\2ST\7t\2\2TU\7o\2\2UV\7c\2\2VW\7"+
		"v\2\2W\n\3\2\2\2XY\7\60\2\2YZ\7f\2\2Z[\7c\2\2[\\\7v\2\2\\]\7g\2\2]^\7"+
		"H\2\2^_\7q\2\2_`\7t\2\2`a\7o\2\2ab\7c\2\2bc\7v\2\2c\f\3\2\2\2de\7U\2\2"+
		"ef\7v\2\2fg\7c\2\2gh\7t\2\2hi\7v\2\2i\16\3\2\2\2jk\7\60\2\2kl\7d\2\2l"+
		"m\7{\2\2mn\7R\2\2no\7t\2\2op\7g\2\2pq\7h\2\2qr\7k\2\2rs\7z\2\2s\20\3\2"+
		"\2\2tu\7\60\2\2uv\7d\2\2vw\7{\2\2wx\7U\2\2xy\7w\2\2yz\7h\2\2z{\7h\2\2"+
		"{|\7k\2\2|}\7z\2\2}\22\3\2\2\2~\177\7\60\2\2\177\u0080\7d\2\2\u0080\u0081"+
		"\7{\2\2\u0081\u0082\7H\2\2\u0082\u0083\7t\2\2\u0083\u0084\7c\2\2\u0084"+
		"\u0085\7i\2\2\u0085\u0086\7o\2\2\u0086\u0087\7g\2\2\u0087\u0088\7p\2\2"+
		"\u0088\u0089\7v\2\2\u0089\24\3\2\2\2\u008a\u008b\7G\2\2\u008b\u008c\7"+
		"p\2\2\u008c\u008d\7f\2\2\u008d\26\3\2\2\2\u008e\u008f\7r\2\2\u008f\u0090"+
		"\7c\2\2\u0090\u0091\7v\2\2\u0091\u0092\7j\2\2\u0092\30\3\2\2\2\u0093\u0094"+
		"\7h\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2\u0096\u0097\7f\2\2\u0097"+
		"\32\3\2\2\2\u0098\u0099\7h\2\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b"+
		"\u009c\7f\2\2\u009c\u009d\7N\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2"+
		"\u009f\u00a0\7g\2\2\u00a0\34\3\2\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7"+
		"g\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7"+
		"\7e\2\2\u00a7\u00a8\7g\2\2\u00a8\36\3\2\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab"+
		"\7q\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7v\2\2\u00ae"+
		" \3\2\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7q\2\2\u00b2"+
		"\u00b3\7m\2\2\u00b3\u00b4\7H\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7t\2\2"+
		"\u00b6\"\3\2\2\2\u00b7\u00b8\7*\2\2\u00b8$\3\2\2\2\u00b9\u00ba\7.\2\2"+
		"\u00ba&\3\2\2\2\u00bb\u00bc\7+\2\2\u00bc(\3\2\2\2\u00bd\u00be\7=\2\2\u00be"+
		"*\3\2\2\2\u00bf\u00c0\7$\2\2\u00c0,\3\2\2\2\u00c1\u00c2\7?\2\2\u00c2."+
		"\3\2\2\2\u00c3\u00c5\t\3\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\b\30"+
		"\2\2\u00c9\60\3\2\2\2\u00ca\u00cb\7\"\2\2\u00cb\62\3\2\2\2\u00cc\u00ce"+
		"\t\4\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\64\3\2\2\2\u00d1\u00d3\t\5\2\2\u00d2\u00d1\3\2\2"+
		"\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\66"+
		"\3\2\2\2\u00d6\u00d8\t\6\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da8\3\2\2\2\b\2\u00c6\u00cf\u00d2"+
		"\u00d4\u00d9\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}