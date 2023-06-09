// Generated from /home/gjscraveiro/Desktop/Uni/C/C_22_23/guiao02/ex09v2/CalLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, Integer=2, NEWLINE=3, WS=4, COMMENT=5, PLUS=6, MINUS=7, DIV=8, REST=9, 
		MULT=10, REDUCE=11, PARSOPEN=12, PARSCLOSE=13, EQUAL=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID", "Integer", "NEWLINE", "WS", "COMMENT", "PLUS", "MINUS", "DIV", 
			"REST", "MULT", "REDUCE", "PARSOPEN", "PARSCLOSE", "EQUAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'+'", "'-'", "'/'", "'%'", "'*'", 
			"'reduce'", "'('", "')'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "Integer", "NEWLINE", "WS", "COMMENT", "PLUS", "MINUS", "DIV", 
			"REST", "MULT", "REDUCE", "PARSOPEN", "PARSCLOSE", "EQUAL"
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


	public CalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20W\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2!\n\2\r\2\16\2\"\3\3\6"+
		"\3&\n\3\r\3\16\3\'\3\4\5\4+\n\4\3\4\3\4\3\5\6\5\60\n\5\r\5\16\5\61\3\5"+
		"\3\5\3\6\3\6\7\68\n\6\f\6\16\6;\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\39\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\3\2\5\4\2C\\c|\3\2\62;\4\2\13\13\"\"\2[\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\3 \3\2\2\2\5%\3\2\2\2\7*\3\2\2\2\t/\3\2\2\2"+
		"\13\65\3\2\2\2\r@\3\2\2\2\17B\3\2\2\2\21D\3\2\2\2\23F\3\2\2\2\25H\3\2"+
		"\2\2\27J\3\2\2\2\31Q\3\2\2\2\33S\3\2\2\2\35U\3\2\2\2\37!\t\2\2\2 \37\3"+
		"\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\4\3\2\2\2$&\t\3\2\2%$\3\2\2\2"+
		"&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\6\3\2\2\2)+\7\17\2\2*)\3\2\2\2*+\3"+
		"\2\2\2+,\3\2\2\2,-\7\f\2\2-\b\3\2\2\2.\60\t\4\2\2/.\3\2\2\2\60\61\3\2"+
		"\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\b\5\2\2\64\n\3\2\2"+
		"\2\659\7%\2\2\668\13\2\2\2\67\66\3\2\2\28;\3\2\2\29:\3\2\2\29\67\3\2\2"+
		"\2:<\3\2\2\2;9\3\2\2\2<=\7\f\2\2=>\3\2\2\2>?\b\6\2\2?\f\3\2\2\2@A\7-\2"+
		"\2A\16\3\2\2\2BC\7/\2\2C\20\3\2\2\2DE\7\61\2\2E\22\3\2\2\2FG\7\'\2\2G"+
		"\24\3\2\2\2HI\7,\2\2I\26\3\2\2\2JK\7t\2\2KL\7g\2\2LM\7f\2\2MN\7w\2\2N"+
		"O\7e\2\2OP\7g\2\2P\30\3\2\2\2QR\7*\2\2R\32\3\2\2\2ST\7+\2\2T\34\3\2\2"+
		"\2UV\7?\2\2V\36\3\2\2\2\b\2\"\'*\619\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}