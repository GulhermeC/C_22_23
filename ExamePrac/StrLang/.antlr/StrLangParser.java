// Generated from /home/gjscraveiro/Desktop/Uni/C/C_22_23/ExamePrac/StrLang/StrLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StrLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, VAR=9, 
		STR=10, WS=11, NEWLINE=12, COMMENT=13;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_print = 2, RULE_assig = 3, RULE_pexpr = 4, 
		RULE_asexpr = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "print", "assig", "pexpr", "asexpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "':'", "'+'", "'-'", "'('", "'/'", "')'", "'input'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "VAR", "STR", "WS", 
			"NEWLINE", "COMMENT"
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

	@Override
	public String getGrammarFileName() { return "StrLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StrLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(StrLangParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << VAR) | (1L << NEWLINE))) != 0) );
			setState(17);
			match(EOF);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssigStatContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(StrLangParser.NEWLINE, 0); }
		public AssigContext assig() {
			return getRuleContext(AssigContext.class,0);
		}
		public AssigStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class PrintStatContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(StrLangParser.NEWLINE, 0); }
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PrintStatContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new PrintStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(19);
					print();
					}
				}

				setState(22);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new AssigStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(23);
					assig();
					}
				}

				setState(26);
				match(NEWLINE);
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

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintExContext extends PrintContext {
		public PexprContext pexpr() {
			return getRuleContext(PexprContext.class,0);
		}
		public PrintExContext(PrintContext ctx) { copyFrom(ctx); }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			_localctx = new PrintExContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__0);
			setState(30);
			pexpr(0);
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

	public static class AssigContext extends ParserRuleContext {
		public AssigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assig; }
	 
		public AssigContext() { }
		public void copyFrom(AssigContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignExContext extends AssigContext {
		public TerminalNode VAR() { return getToken(StrLangParser.VAR, 0); }
		public AsexprContext asexpr() {
			return getRuleContext(AsexprContext.class,0);
		}
		public AssignExContext(AssigContext ctx) { copyFrom(ctx); }
	}

	public final AssigContext assig() throws RecognitionException {
		AssigContext _localctx = new AssigContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assig);
		try {
			_localctx = new AssignExContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(VAR);
			setState(33);
			match(T__1);
			setState(34);
			asexpr(0);
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

	public static class PexprContext extends ParserRuleContext {
		public PexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pexpr; }
	 
		public PexprContext() { }
		public void copyFrom(PexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintVarContext extends PexprContext {
		public TerminalNode VAR() { return getToken(StrLangParser.VAR, 0); }
		public PrintVarContext(PexprContext ctx) { copyFrom(ctx); }
	}
	public static class PrintReplaceContext extends PexprContext {
		public List<PexprContext> pexpr() {
			return getRuleContexts(PexprContext.class);
		}
		public PexprContext pexpr(int i) {
			return getRuleContext(PexprContext.class,i);
		}
		public PrintReplaceContext(PexprContext ctx) { copyFrom(ctx); }
	}
	public static class PrintStrContext extends PexprContext {
		public TerminalNode STR() { return getToken(StrLangParser.STR, 0); }
		public PrintStrContext(PexprContext ctx) { copyFrom(ctx); }
	}
	public static class PrintAddContext extends PexprContext {
		public Token op;
		public List<PexprContext> pexpr() {
			return getRuleContexts(PexprContext.class);
		}
		public PexprContext pexpr(int i) {
			return getRuleContext(PexprContext.class,i);
		}
		public PrintAddContext(PexprContext ctx) { copyFrom(ctx); }
	}

	public final PexprContext pexpr() throws RecognitionException {
		return pexpr(0);
	}

	private PexprContext pexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PexprContext _localctx = new PexprContext(_ctx, _parentState);
		PexprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_pexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				{
				_localctx = new PrintStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(37);
				match(STR);
				}
				break;
			case VAR:
				{
				_localctx = new PrintVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(VAR);
				}
				break;
			case T__4:
				{
				_localctx = new PrintReplaceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(T__4);
				setState(40);
				pexpr(0);
				setState(41);
				match(T__5);
				setState(42);
				pexpr(0);
				setState(43);
				match(T__5);
				setState(44);
				pexpr(0);
				setState(45);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrintAddContext(new PexprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_pexpr);
					setState(49);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(50);
					((PrintAddContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==T__3) ) {
						((PrintAddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(51);
					pexpr(5);
					}
					} 
				}
				setState(56);
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

	public static class AsexprContext extends ParserRuleContext {
		public AsexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asexpr; }
	 
		public AsexprContext() { }
		public void copyFrom(AsexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssigStrContext extends AsexprContext {
		public TerminalNode STR() { return getToken(StrLangParser.STR, 0); }
		public AssigStrContext(AsexprContext ctx) { copyFrom(ctx); }
	}
	public static class AssigParContext extends AsexprContext {
		public AsexprContext asexpr() {
			return getRuleContext(AsexprContext.class,0);
		}
		public AssigParContext(AsexprContext ctx) { copyFrom(ctx); }
	}
	public static class AssigAddContext extends AsexprContext {
		public Token op;
		public List<AsexprContext> asexpr() {
			return getRuleContexts(AsexprContext.class);
		}
		public AsexprContext asexpr(int i) {
			return getRuleContext(AsexprContext.class,i);
		}
		public AssigAddContext(AsexprContext ctx) { copyFrom(ctx); }
	}
	public static class AssigInputContext extends AsexprContext {
		public AsexprContext asexpr() {
			return getRuleContext(AsexprContext.class,0);
		}
		public AssigInputContext(AsexprContext ctx) { copyFrom(ctx); }
	}
	public static class AssigVarContext extends AsexprContext {
		public TerminalNode VAR() { return getToken(StrLangParser.VAR, 0); }
		public AssigVarContext(AsexprContext ctx) { copyFrom(ctx); }
	}

	public final AsexprContext asexpr() throws RecognitionException {
		return asexpr(0);
	}

	private AsexprContext asexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AsexprContext _localctx = new AsexprContext(_ctx, _parentState);
		AsexprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_asexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				_localctx = new AssigInputContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(58);
				match(T__7);
				setState(59);
				match(T__4);
				setState(60);
				asexpr(0);
				setState(61);
				match(T__6);
				}
				break;
			case STR:
				{
				_localctx = new AssigStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				match(STR);
				}
				break;
			case VAR:
				{
				_localctx = new AssigVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(VAR);
				}
				break;
			case T__4:
				{
				_localctx = new AssigParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(T__4);
				setState(66);
				asexpr(0);
				setState(67);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AssigAddContext(new AsexprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_asexpr);
					setState(71);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(72);
					((AssigAddContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==T__3) ) {
						((AssigAddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(73);
					asexpr(6);
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return pexpr_sempred((PexprContext)_localctx, predIndex);
		case 5:
			return asexpr_sempred((AsexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean pexpr_sempred(PexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean asexpr_sempred(AsexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17R\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\2\3\2"+
		"\3\3\5\3\27\n\3\3\3\3\3\5\3\33\n\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\62\n\6\3\6\3"+
		"\6\3\6\7\6\67\n\6\f\6\16\6:\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7H\n\7\3\7\3\7\3\7\7\7M\n\7\f\7\16\7P\13\7\3\7\2\4\n\f\b"+
		"\2\4\6\b\n\f\2\3\3\2\5\6\2V\2\17\3\2\2\2\4\35\3\2\2\2\6\37\3\2\2\2\b\""+
		"\3\2\2\2\n\61\3\2\2\2\fG\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\21\3\2"+
		"\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\23\24\7\2\2\3\24\3\3\2"+
		"\2\2\25\27\5\6\4\2\26\25\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\36\7\16"+
		"\2\2\31\33\5\b\5\2\32\31\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\36\7\16"+
		"\2\2\35\26\3\2\2\2\35\32\3\2\2\2\36\5\3\2\2\2\37 \7\3\2\2 !\5\n\6\2!\7"+
		"\3\2\2\2\"#\7\13\2\2#$\7\4\2\2$%\5\f\7\2%\t\3\2\2\2&\'\b\6\1\2\'\62\7"+
		"\f\2\2(\62\7\13\2\2)*\7\7\2\2*+\5\n\6\2+,\7\b\2\2,-\5\n\6\2-.\7\b\2\2"+
		"./\5\n\6\2/\60\7\t\2\2\60\62\3\2\2\2\61&\3\2\2\2\61(\3\2\2\2\61)\3\2\2"+
		"\2\628\3\2\2\2\63\64\f\6\2\2\64\65\t\2\2\2\65\67\5\n\6\7\66\63\3\2\2\2"+
		"\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\13\3\2\2\2:8\3\2\2\2;<\b\7\1\2<=\7"+
		"\n\2\2=>\7\7\2\2>?\5\f\7\2?@\7\t\2\2@H\3\2\2\2AH\7\f\2\2BH\7\13\2\2CD"+
		"\7\7\2\2DE\5\f\7\2EF\7\t\2\2FH\3\2\2\2G;\3\2\2\2GA\3\2\2\2GB\3\2\2\2G"+
		"C\3\2\2\2HN\3\2\2\2IJ\f\7\2\2JK\t\2\2\2KM\5\f\7\bLI\3\2\2\2MP\3\2\2\2"+
		"NL\3\2\2\2NO\3\2\2\2O\r\3\2\2\2PN\3\2\2\2\n\21\26\32\35\618GN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}