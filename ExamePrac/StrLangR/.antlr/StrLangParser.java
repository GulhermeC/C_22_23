// Generated from /home/gjscraveiro/Desktop/Uni/C/C_22_23/ExamePrac/StrLangR/StrLang.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, STR=11, WS=12, NEWLINE=13, COMMENT=14;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_np = 2, RULE_expr = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "np", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "':'", "'trim'", "'input('", "')'", "'+'", "'-'", "'('", 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ID", "STR", 
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
		public TerminalNode NEWLINE() { return getToken(StrLangParser.NEWLINE, 0); }
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
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				stat();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==ID );
			setState(13);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
	public static class PrintContext extends StatContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PrintContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class AssingContext extends StatContext {
		public TerminalNode ID() { return getToken(StrLangParser.ID, 0); }
		public NpContext np() {
			return getRuleContext(NpContext.class,0);
		}
		public AssingContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			int _alt;
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(T__0);
				setState(17); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(16);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(19); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case ID:
				_localctx = new AssingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(ID);
				setState(22);
				match(T__1);
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(23);
					match(T__2);
					}
				}

				setState(26);
				np(0);
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

	public static class NpContext extends ParserRuleContext {
		public NpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_np; }
	 
		public NpContext() { }
		public void copyFrom(NpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InputContext extends NpContext {
		public NpContext np() {
			return getRuleContext(NpContext.class,0);
		}
		public InputContext(NpContext ctx) { copyFrom(ctx); }
	}
	public static class NpSTRContext extends NpContext {
		public TerminalNode STR() { return getToken(StrLangParser.STR, 0); }
		public NpSTRContext(NpContext ctx) { copyFrom(ctx); }
	}
	public static class NpAddContext extends NpContext {
		public Token op;
		public List<NpContext> np() {
			return getRuleContexts(NpContext.class);
		}
		public NpContext np(int i) {
			return getRuleContext(NpContext.class,i);
		}
		public NpAddContext(NpContext ctx) { copyFrom(ctx); }
	}
	public static class NpIDContext extends NpContext {
		public TerminalNode ID() { return getToken(StrLangParser.ID, 0); }
		public NpIDContext(NpContext ctx) { copyFrom(ctx); }
	}
	public static class RemoveNPContext extends NpContext {
		public NpContext np() {
			return getRuleContext(NpContext.class,0);
		}
		public RemoveNPContext(NpContext ctx) { copyFrom(ctx); }
	}

	public final NpContext np() throws RecognitionException {
		return np(0);
	}

	private NpContext np(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NpContext _localctx = new NpContext(_ctx, _parentState);
		NpContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_np, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new NpIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(30);
				match(ID);
				}
				break;
			case STR:
				{
				_localctx = new NpSTRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				match(STR);
				}
				break;
			case T__3:
				{
				_localctx = new InputContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				match(T__3);
				setState(33);
				np(0);
				setState(34);
				match(T__4);
				}
				break;
			case T__7:
				{
				_localctx = new RemoveNPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(T__7);
				setState(37);
				np(0);
				setState(38);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NpAddContext(new NpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_np);
					setState(42);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(43);
					((NpAddContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__5 || _la==T__6) ) {
						((NpAddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(44);
					np(3);
					}
					} 
				}
				setState(49);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReplaceContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ReplaceContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprSTRContext extends ExprContext {
		public TerminalNode STR() { return getToken(StrLangParser.STR, 0); }
		public ExprSTRContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprAddContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAddContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(StrLangParser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51);
				match(ID);
				}
				break;
			case STR:
				{
				_localctx = new ExprSTRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(STR);
				}
				break;
			case T__7:
				{
				_localctx = new ReplaceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(T__7);
				setState(54);
				expr(0);
				setState(55);
				match(T__8);
				setState(56);
				expr(0);
				setState(57);
				match(T__8);
				setState(58);
				expr(0);
				setState(59);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprAddContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(63);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(64);
					((ExprAddContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__5 || _la==T__6) ) {
						((ExprAddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(65);
					expr(3);
					}
					} 
				}
				setState(70);
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
		case 2:
			return np_sempred((NpContext)_localctx, predIndex);
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean np_sempred(NpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20J\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\2\3\2\3\3\3\3\6\3\24\n\3"+
		"\r\3\16\3\25\3\3\3\3\3\3\5\3\33\n\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4+\n\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\5\3\5\3\5\7"+
		"\5E\n\5\f\5\16\5H\13\5\3\5\2\4\6\b\6\2\4\6\b\2\4\3\3\17\17\3\2\b\t\2P"+
		"\2\13\3\2\2\2\4\35\3\2\2\2\6*\3\2\2\2\b?\3\2\2\2\n\f\5\4\3\2\13\n\3\2"+
		"\2\2\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\17\3\2\2\2\17\20\t\2\2\2"+
		"\20\3\3\2\2\2\21\23\7\3\2\2\22\24\5\b\5\2\23\22\3\2\2\2\24\25\3\2\2\2"+
		"\25\23\3\2\2\2\25\26\3\2\2\2\26\36\3\2\2\2\27\30\7\f\2\2\30\32\7\4\2\2"+
		"\31\33\7\5\2\2\32\31\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\36\5\6\4\2"+
		"\35\21\3\2\2\2\35\27\3\2\2\2\36\5\3\2\2\2\37 \b\4\1\2 +\7\f\2\2!+\7\r"+
		"\2\2\"#\7\6\2\2#$\5\6\4\2$%\7\7\2\2%+\3\2\2\2&\'\7\n\2\2\'(\5\6\4\2()"+
		"\7\7\2\2)+\3\2\2\2*\37\3\2\2\2*!\3\2\2\2*\"\3\2\2\2*&\3\2\2\2+\61\3\2"+
		"\2\2,-\f\4\2\2-.\t\3\2\2.\60\5\6\4\5/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2"+
		"\2\61\62\3\2\2\2\62\7\3\2\2\2\63\61\3\2\2\2\64\65\b\5\1\2\65@\7\f\2\2"+
		"\66@\7\r\2\2\678\7\n\2\289\5\b\5\29:\7\13\2\2:;\5\b\5\2;<\7\13\2\2<=\5"+
		"\b\5\2=>\7\7\2\2>@\3\2\2\2?\64\3\2\2\2?\66\3\2\2\2?\67\3\2\2\2@F\3\2\2"+
		"\2AB\f\4\2\2BC\t\3\2\2CE\5\b\5\5DA\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2"+
		"\2G\t\3\2\2\2HF\3\2\2\2\n\r\25\32\35*\61?F";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}