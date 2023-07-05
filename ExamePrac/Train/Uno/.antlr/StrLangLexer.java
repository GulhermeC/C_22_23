// Generated from /home/gjscraveiro/Desktop/Uni/C/C_22_23/ExamePrac/Train/Uno/StrLang.g4 by ANTLR 4.9.2
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
			null, "'print'", "':'", "'+'", "'-'", "'trim'", "'input('", "')'", "'('", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20j\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\6\13?\n\13\r\13\16\13@\3\13\7\13D\n\13\f\13"+
		"\16\13G\13\13\3\f\3\f\7\fK\n\f\f\f\16\fN\13\f\3\f\3\f\3\r\6\rS\n\r\r\r"+
		"\16\rT\3\r\3\r\3\16\5\16Z\n\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17b\n\17"+
		"\f\17\16\17e\13\17\3\17\3\17\3\17\3\17\3c\2\20\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\6\4\2C\\c|\3\2\62;"+
		"\6\2\f\f\17\17$$^^\4\2\13\13\"\"\2o\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\3\37\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r\60\3"+
		"\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25>\3\2\2\2\27H\3\2\2\2\31"+
		"R\3\2\2\2\33Y\3\2\2\2\35]\3\2\2\2\37 \7r\2\2 !\7t\2\2!\"\7k\2\2\"#\7p"+
		"\2\2#$\7v\2\2$\4\3\2\2\2%&\7<\2\2&\6\3\2\2\2\'(\7-\2\2(\b\3\2\2\2)*\7"+
		"/\2\2*\n\3\2\2\2+,\7v\2\2,-\7t\2\2-.\7k\2\2./\7o\2\2/\f\3\2\2\2\60\61"+
		"\7k\2\2\61\62\7p\2\2\62\63\7r\2\2\63\64\7w\2\2\64\65\7v\2\2\65\66\7*\2"+
		"\2\66\16\3\2\2\2\678\7+\2\28\20\3\2\2\29:\7*\2\2:\22\3\2\2\2;<\7\61\2"+
		"\2<\24\3\2\2\2=?\t\2\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AE\3\2"+
		"\2\2BD\t\3\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\26\3\2\2\2GE\3"+
		"\2\2\2HL\7$\2\2IK\n\4\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3"+
		"\2\2\2NL\3\2\2\2OP\7$\2\2P\30\3\2\2\2QS\t\5\2\2RQ\3\2\2\2ST\3\2\2\2TR"+
		"\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\b\r\2\2W\32\3\2\2\2XZ\7\17\2\2YX\3\2\2"+
		"\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\f\2\2\\\34\3\2\2\2]^\7\61\2\2^_\7\61\2\2_"+
		"c\3\2\2\2`b\13\2\2\2a`\3\2\2\2be\3\2\2\2cd\3\2\2\2ca\3\2\2\2df\3\2\2\2"+
		"ec\3\2\2\2fg\7\f\2\2gh\3\2\2\2hi\b\17\2\2i\36\3\2\2\2\t\2@ELTYc\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}