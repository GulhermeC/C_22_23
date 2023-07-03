// Generated from /home/gjscraveiro/Desktop/Uni/C/C_22_23/ExamePrac/StrLangExemplo/StrLang.g4 by ANTLR 4.9.2
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
		RULE_program = 0, RULE_stat = 1, RULE_print = 2, RULE_assig = 3, RULE_noop = 4, 
		RULE_expr = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "print", "assig", "noop", "expr"
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
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
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
	public static class StatPrintContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(StrLangParser.NEWLINE, 0); }
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatPrintContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class StatAssigContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(StrLangParser.NEWLINE, 0); }
		public AssigContext assig() {
			return getRuleContext(AssigContext.class,0);
		}
		public StatAssigContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new StatPrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(20);
					print();
					}
				}

				setState(23);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new StatAssigContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(24);
					assig();
					}
				}

				setState(27);
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
	public static class PrintReduceContext extends PrintContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PrintReduceContext(PrintContext ctx) { copyFrom(ctx); }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		int _la;
		try {
			_localctx = new PrintReduceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				expr(0);
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << ID) | (1L << STR))) != 0) );
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
	public static class AssigReduceContext extends AssigContext {
		public TerminalNode ID() { return getToken(StrLangParser.ID, 0); }
		public NoopContext noop() {
			return getRuleContext(NoopContext.class,0);
		}
		public AssigReduceContext(AssigContext ctx) { copyFrom(ctx); }
	}

	public final AssigContext assig() throws RecognitionException {
		AssigContext _localctx = new AssigContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assig);
		int _la;
		try {
			_localctx = new AssigReduceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(ID);
			setState(37);
			match(T__1);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(38);
				match(T__2);
				}
			}

			setState(41);
			noop(0);
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

	public static class NoopContext extends ParserRuleContext {
		public NoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noop; }
	 
		public NoopContext() { }
		public void copyFrom(NoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NoopParentContext extends NoopContext {
		public NoopContext noop() {
			return getRuleContext(NoopContext.class,0);
		}
		public NoopParentContext(NoopContext ctx) { copyFrom(ctx); }
	}
	public static class NoopIdContext extends NoopContext {
		public TerminalNode ID() { return getToken(StrLangParser.ID, 0); }
		public NoopIdContext(NoopContext ctx) { copyFrom(ctx); }
	}
	public static class NoopUnaryContext extends NoopContext {
		public Token op;
		public NoopContext noop() {
			return getRuleContext(NoopContext.class,0);
		}
		public NoopUnaryContext(NoopContext ctx) { copyFrom(ctx); }
	}
	public static class NoopInputContext extends NoopContext {
		public NoopContext noop() {
			return getRuleContext(NoopContext.class,0);
		}
		public NoopInputContext(NoopContext ctx) { copyFrom(ctx); }
	}
	public static class NoopStrContext extends NoopContext {
		public TerminalNode STR() { return getToken(StrLangParser.STR, 0); }
		public NoopStrContext(NoopContext ctx) { copyFrom(ctx); }
	}

	public final NoopContext noop() throws RecognitionException {
		return noop(0);
	}

	private NoopContext noop(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoopContext _localctx = new NoopContext(_ctx, _parentState);
		NoopContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_noop, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				_localctx = new NoopInputContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(44);
				match(T__3);
				setState(45);
				noop(0);
				setState(46);
				match(T__4);
				}
				break;
			case ID:
				{
				_localctx = new NoopIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(ID);
				}
				break;
			case STR:
				{
				_localctx = new NoopStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(STR);
				}
				break;
			case T__7:
				{
				_localctx = new NoopParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(T__7);
				setState(51);
				noop(0);
				setState(52);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoopUnaryContext(new NoopContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_noop);
					setState(56);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(57);
					((NoopUnaryContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__5 || _la==T__6) ) {
						((NoopUnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(62);
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
	public static class ExprReplaceContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprReplaceContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprUnaryContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprUnaryContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(StrLangParser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprSTRContext extends ExprContext {
		public TerminalNode STR() { return getToken(StrLangParser.STR, 0); }
		public ExprSTRContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				_localctx = new ExprReplaceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(64);
				match(T__7);
				setState(65);
				expr(0);
				setState(66);
				match(T__8);
				setState(67);
				expr(0);
				setState(68);
				match(T__8);
				setState(69);
				expr(0);
				setState(70);
				match(T__4);
				}
				break;
			case ID:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(ID);
				}
				break;
			case STR:
				{
				_localctx = new ExprSTRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(STR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprUnaryContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(76);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(77);
					((ExprUnaryContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__5 || _la==T__6) ) {
						((ExprUnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(78);
					expr(5);
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
			return noop_sempred((NoopContext)_localctx, predIndex);
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean noop_sempred(NoopContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20W\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\3\2\3\3\5\3\30\n\3\3\3\3\3\5\3\34\n\3\3\3\5\3\37\n\3\3\4\3\4\6\4#\n\4"+
		"\r\4\16\4$\3\5\3\5\3\5\5\5*\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\69\n\6\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7M\n\7\3\7\3\7\3\7\7\7R\n\7\f\7\16\7"+
		"U\13\7\3\7\2\4\n\f\b\2\4\6\b\n\f\2\3\3\2\b\t\2]\2\21\3\2\2\2\4\36\3\2"+
		"\2\2\6 \3\2\2\2\b&\3\2\2\2\n8\3\2\2\2\fL\3\2\2\2\16\20\5\4\3\2\17\16\3"+
		"\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\21\3"+
		"\2\2\2\24\25\7\2\2\3\25\3\3\2\2\2\26\30\5\6\4\2\27\26\3\2\2\2\27\30\3"+
		"\2\2\2\30\31\3\2\2\2\31\37\7\17\2\2\32\34\5\b\5\2\33\32\3\2\2\2\33\34"+
		"\3\2\2\2\34\35\3\2\2\2\35\37\7\17\2\2\36\27\3\2\2\2\36\33\3\2\2\2\37\5"+
		"\3\2\2\2 \"\7\3\2\2!#\5\f\7\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2"+
		"\2%\7\3\2\2\2&\'\7\f\2\2\')\7\4\2\2(*\7\5\2\2)(\3\2\2\2)*\3\2\2\2*+\3"+
		"\2\2\2+,\5\n\6\2,\t\3\2\2\2-.\b\6\1\2./\7\6\2\2/\60\5\n\6\2\60\61\7\7"+
		"\2\2\619\3\2\2\2\629\7\f\2\2\639\7\r\2\2\64\65\7\n\2\2\65\66\5\n\6\2\66"+
		"\67\7\7\2\2\679\3\2\2\28-\3\2\2\28\62\3\2\2\28\63\3\2\2\28\64\3\2\2\2"+
		"9>\3\2\2\2:;\f\6\2\2;=\t\2\2\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2"+
		"?\13\3\2\2\2@>\3\2\2\2AB\b\7\1\2BC\7\n\2\2CD\5\f\7\2DE\7\13\2\2EF\5\f"+
		"\7\2FG\7\13\2\2GH\5\f\7\2HI\7\7\2\2IM\3\2\2\2JM\7\f\2\2KM\7\r\2\2LA\3"+
		"\2\2\2LJ\3\2\2\2LK\3\2\2\2MS\3\2\2\2NO\f\6\2\2OP\t\2\2\2PR\5\f\7\7QN\3"+
		"\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\r\3\2\2\2US\3\2\2\2\f\21\27\33\36"+
		"$)8>LS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}