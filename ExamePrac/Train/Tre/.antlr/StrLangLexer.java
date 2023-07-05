// Generated from /home/gjscraveiro/Desktop/Uni/C/C_22_23/ExamePrac/Train/Tre/StrLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StrLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		VAR=10, STR=11, WS=12, NEWLINE=13, COMMENT=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"VAR", "STR", "WS", "NEWLINE", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "':'", "'+'", "'-'", "'trim'", "'input'", "'('", "')'", 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "VAR", "STR", 
			"WS", "NEWLINE", "COMMENT"
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


	public StrLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StrLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20i\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\6\13>\n\13\r\13\16\13?\3\13\7\13C\n\13\f\13\16\13"+
		"F\13\13\3\f\3\f\7\fJ\n\f\f\f\16\fM\13\f\3\f\3\f\3\r\6\rR\n\r\r\r\16\r"+
		"S\3\r\3\r\3\16\5\16Y\n\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17a\n\17\f\17"+
		"\16\17d\13\17\3\17\3\17\3\17\3\17\3b\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\6\4\2C\\c|\3\2\62;\6\2\f"+
		"\f\17\17$$^^\4\2\13\13\"\"\2n\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3"+
		"\37\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r\60\3\2\2\2"+
		"\17\66\3\2\2\2\218\3\2\2\2\23:\3\2\2\2\25=\3\2\2\2\27G\3\2\2\2\31Q\3\2"+
		"\2\2\33X\3\2\2\2\35\\\3\2\2\2\37 \7r\2\2 !\7t\2\2!\"\7k\2\2\"#\7p\2\2"+
		"#$\7v\2\2$\4\3\2\2\2%&\7<\2\2&\6\3\2\2\2\'(\7-\2\2(\b\3\2\2\2)*\7/\2\2"+
		"*\n\3\2\2\2+,\7v\2\2,-\7t\2\2-.\7k\2\2./\7o\2\2/\f\3\2\2\2\60\61\7k\2"+
		"\2\61\62\7p\2\2\62\63\7r\2\2\63\64\7w\2\2\64\65\7v\2\2\65\16\3\2\2\2\66"+
		"\67\7*\2\2\67\20\3\2\2\289\7+\2\29\22\3\2\2\2:;\7\61\2\2;\24\3\2\2\2<"+
		">\t\2\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@D\3\2\2\2AC\t\3\2\2"+
		"BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\26\3\2\2\2FD\3\2\2\2GK\7$\2"+
		"\2HJ\n\4\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2"+
		"\2NO\7$\2\2O\30\3\2\2\2PR\t\5\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2"+
		"\2\2TU\3\2\2\2UV\b\r\2\2V\32\3\2\2\2WY\7\17\2\2XW\3\2\2\2XY\3\2\2\2YZ"+
		"\3\2\2\2Z[\7\f\2\2[\34\3\2\2\2\\]\7\61\2\2]^\7\61\2\2^b\3\2\2\2_a\13\2"+
		"\2\2`_\3\2\2\2ad\3\2\2\2bc\3\2\2\2b`\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\f"+
		"\2\2fg\3\2\2\2gh\b\17\2\2h\36\3\2\2\2\t\2?DKSXb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}