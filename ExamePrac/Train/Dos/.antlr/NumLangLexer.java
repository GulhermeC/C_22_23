// Generated from /home/gjscraveiro/Desktop/Uni/C/C_22_23/ExamePrac/Train/Dos/NumLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NumLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, VAR=11, INT=12, FRAC=13, STR=14, WS=15, COMMENT=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "VAR", "INT", "FRAC", "STR", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'display'", "'<='", "'+'", "'-'", "'*'", "':'", "'read'", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "VAR", 
			"INT", "FRAC", "STR", "WS", "COMMENT"
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


	public NumLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NumLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\6\fC\n\f\r\f\16\fD\3\f"+
		"\7\fH\n\f\f\f\16\fK\13\f\3\r\6\rN\n\r\r\r\16\rO\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\7\17X\n\17\f\17\16\17[\13\17\3\17\3\17\3\20\6\20`\n\20\r\20\16"+
		"\20a\3\20\3\20\3\21\3\21\7\21h\n\21\f\21\16\21k\13\21\3\21\3\21\3\21\3"+
		"\21\3i\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22\3\2\6\4\2C\\c|\3\2\62;\6\2\f\f\17\17$$^^\4\2\13\f"+
		"\"\"\2u\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\3#\3\2\2\2\5%\3\2\2\2\7-\3\2\2\2\t\60\3\2\2\2\13\62\3\2\2\2\r\64\3\2"+
		"\2\2\17\66\3\2\2\2\218\3\2\2\2\23=\3\2\2\2\25?\3\2\2\2\27B\3\2\2\2\31"+
		"M\3\2\2\2\33Q\3\2\2\2\35U\3\2\2\2\37_\3\2\2\2!e\3\2\2\2#$\7=\2\2$\4\3"+
		"\2\2\2%&\7f\2\2&\'\7k\2\2\'(\7u\2\2()\7r\2\2)*\7n\2\2*+\7c\2\2+,\7{\2"+
		"\2,\6\3\2\2\2-.\7>\2\2./\7?\2\2/\b\3\2\2\2\60\61\7-\2\2\61\n\3\2\2\2\62"+
		"\63\7/\2\2\63\f\3\2\2\2\64\65\7,\2\2\65\16\3\2\2\2\66\67\7<\2\2\67\20"+
		"\3\2\2\289\7t\2\29:\7g\2\2:;\7c\2\2;<\7f\2\2<\22\3\2\2\2=>\7*\2\2>\24"+
		"\3\2\2\2?@\7+\2\2@\26\3\2\2\2AC\t\2\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2"+
		"DE\3\2\2\2EI\3\2\2\2FH\t\3\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2"+
		"J\30\3\2\2\2KI\3\2\2\2LN\t\3\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2"+
		"\2P\32\3\2\2\2QR\5\31\r\2RS\7\61\2\2ST\5\31\r\2T\34\3\2\2\2UY\7$\2\2V"+
		"X\n\4\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2"+
		"\\]\7$\2\2]\36\3\2\2\2^`\t\5\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2"+
		"\2bc\3\2\2\2cd\b\20\2\2d \3\2\2\2ei\7/\2\2fh\13\2\2\2gf\3\2\2\2hk\3\2"+
		"\2\2ij\3\2\2\2ig\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\f\2\2mn\3\2\2\2no\b\21"+
		"\2\2o\"\3\2\2\2\t\2DIOYai\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}