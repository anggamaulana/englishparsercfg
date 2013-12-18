// Generated from EnglishRules.g by ANTLR 4.1
package englishparser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EnglishRulesParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, DETERMINAN=2, VERB=3, NOUN=4, PREPOSITION=5, PRONOUN=6, NOUNPHRASE=7, 
		ADVERB=8, ADJECTIVE=9, INTERJECTION=10, AUX=11, CONJUNCTION=12;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "'D'", "VERB", "'N'", "'P'", "PRONOUN", "'h'", "'v'", 
		"'A'", "'!'", "AUX", "CONJUNCTION"
	};
	public static final int
		RULE_s = 0, RULE_c = 1, RULE_np = 2, RULE_nominal = 3, RULE_vp = 4, RULE_pp = 5;
	public static final String[] ruleNames = {
		"s", "c", "np", "nominal", "vp", "pp"
	};

	@Override
	public String getGrammarFileName() { return "EnglishRules.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public EnglishRulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public TerminalNode ADVERB() { return getToken(EnglishRulesParser.ADVERB, 0); }
		public VpContext vp() {
			return getRuleContext(VpContext.class,0);
		}
		public TerminalNode AUX() { return getToken(EnglishRulesParser.AUX, 0); }
		public NpContext np() {
			return getRuleContext(NpContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishRulesListener ) ((EnglishRulesListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishRulesListener ) ((EnglishRulesListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(24);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12); np();
				setState(13); vp();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(15); vp();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(16); match(AUX);
				setState(17); np();
				setState(18); vp();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(20); np();
				setState(21); vp();
				setState(22); match(ADVERB);
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

	public static class CContext extends ParserRuleContext {
		public TerminalNode CONJUNCTION() { return getToken(EnglishRulesParser.CONJUNCTION, 0); }
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishRulesListener ) ((EnglishRulesListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishRulesListener ) ((EnglishRulesListener)listener).exitC(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_c);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(CONJUNCTION);
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
		public CContext c(int i) {
			return getRuleContext(CContext.class,i);
		}
		public TerminalNode NOUN(int i) {
			return getToken(EnglishRulesParser.NOUN, i);
		}
		public List<CContext> c() {
			return getRuleContexts(CContext.class);
		}
		public List<TerminalNode> ADJECTIVE() { return getTokens(EnglishRulesParser.ADJECTIVE); }
		public List<TerminalNode> NOUN() { return getTokens(EnglishRulesParser.NOUN); }
		public TerminalNode NOUNPHRASE() { return getToken(EnglishRulesParser.NOUNPHRASE, 0); }
		public TerminalNode PRONOUN() { return getToken(EnglishRulesParser.PRONOUN, 0); }
		public TerminalNode ADJECTIVE(int i) {
			return getToken(EnglishRulesParser.ADJECTIVE, i);
		}
		public NominalContext nominal() {
			return getRuleContext(NominalContext.class,0);
		}
		public TerminalNode DETERMINAN() { return getToken(EnglishRulesParser.DETERMINAN, 0); }
		public NpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_np; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishRulesListener ) ((EnglishRulesListener)listener).enterNp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishRulesListener ) ((EnglishRulesListener)listener).exitNp(this);
		}
	}

	public final NpContext np() throws RecognitionException {
		NpContext _localctx = new NpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_np);
		int _la;
		try {
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NOUN) {
					{
					{
					setState(28); match(NOUN);
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(34); match(DETERMINAN);
				setState(35); nominal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36); match(DETERMINAN);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADJECTIVE) {
					{
					{
					setState(37); match(ADJECTIVE);
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(43); match(NOUN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44); match(PRONOUN);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONJUNCTION) {
					{
					{
					setState(45); c();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51); match(PRONOUN);
				setState(52); match(NOUN);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53); match(NOUNPHRASE);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54); match(NOUN);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADJECTIVE) {
					{
					{
					setState(55); match(ADJECTIVE);
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class NominalContext extends ParserRuleContext {
		public TerminalNode NOUN(int i) {
			return getToken(EnglishRulesParser.NOUN, i);
		}
		public PpContext pp(int i) {
			return getRuleContext(PpContext.class,i);
		}
		public List<TerminalNode> NOUN() { return getTokens(EnglishRulesParser.NOUN); }
		public List<PpContext> pp() {
			return getRuleContexts(PpContext.class);
		}
		public NominalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nominal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishRulesListener ) ((EnglishRulesListener)listener).enterNominal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishRulesListener ) ((EnglishRulesListener)listener).exitNominal(this);
		}
	}

	public final NominalContext nominal() throws RecognitionException {
		NominalContext _localctx = new NominalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nominal);
		try {
			int _alt;
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(63); pp();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(66); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(68); match(NOUN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(71); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73); match(NOUN);
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

	public static class VpContext extends ParserRuleContext {
		public List<TerminalNode> VERB() { return getTokens(EnglishRulesParser.VERB); }
		public TerminalNode VERB(int i) {
			return getToken(EnglishRulesParser.VERB, i);
		}
		public TerminalNode ADVERB(int i) {
			return getToken(EnglishRulesParser.ADVERB, i);
		}
		public PpContext pp(int i) {
			return getRuleContext(PpContext.class,i);
		}
		public List<TerminalNode> ADVERB() { return getTokens(EnglishRulesParser.ADVERB); }
		public List<TerminalNode> ADJECTIVE() { return getTokens(EnglishRulesParser.ADJECTIVE); }
		public TerminalNode NOUN() { return getToken(EnglishRulesParser.NOUN, 0); }
		public TerminalNode AUX() { return getToken(EnglishRulesParser.AUX, 0); }
		public List<PpContext> pp() {
			return getRuleContexts(PpContext.class);
		}
		public TerminalNode ADJECTIVE(int i) {
			return getToken(EnglishRulesParser.ADJECTIVE, i);
		}
		public List<NpContext> np() {
			return getRuleContexts(NpContext.class);
		}
		public NpContext np(int i) {
			return getRuleContext(NpContext.class,i);
		}
		public VpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishRulesListener ) ((EnglishRulesListener)listener).enterVp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishRulesListener ) ((EnglishRulesListener)listener).exitVp(this);
		}
	}

	public final VpContext vp() throws RecognitionException {
		VpContext _localctx = new VpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vp);
		int _la;
		try {
			int _alt;
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(76); pp();
					}
					}
					setState(79); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PREPOSITION );
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81); match(VERB);
				setState(82); np();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83); match(AUX);
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(84); match(ADVERB);
						}
						} 
					}
					setState(89);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADJECTIVE) {
					{
					{
					setState(90); match(ADJECTIVE);
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DETERMINAN) | (1L << NOUN) | (1L << PRONOUN) | (1L << NOUNPHRASE))) != 0)) {
					{
					{
					setState(96); np();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102); match(AUX);
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103); match(VERB);
					}
					}
					setState(106); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VERB );
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DETERMINAN) | (1L << NOUN) | (1L << PRONOUN) | (1L << NOUNPHRASE))) != 0)) {
					{
					{
					setState(108); np();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(114); match(ADVERB);
						}
						} 
					}
					setState(119);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120); match(AUX);
				setState(121); match(NOUN);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DETERMINAN) | (1L << NOUN) | (1L << PRONOUN) | (1L << NOUNPHRASE))) != 0)) {
					{
					{
					setState(122); np();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(128); match(AUX);
				setState(129); np();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130); match(VERB);
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

	public static class PpContext extends ParserRuleContext {
		public TerminalNode PREPOSITION() { return getToken(EnglishRulesParser.PREPOSITION, 0); }
		public NpContext np() {
			return getRuleContext(NpContext.class,0);
		}
		public PpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishRulesListener ) ((EnglishRulesListener)listener).enterPp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishRulesListener ) ((EnglishRulesListener)listener).exitPp(this);
		}
	}

	public final PpContext pp() throws RecognitionException {
		PpContext _localctx = new PpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(PREPOSITION);
			setState(134); np();
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\16\u008b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\5\2\33\n\2\3\3\3\3\3\4\7\4 \n\4\f\4\16\4#\13\4\3\4"+
		"\3\4\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\4\3\4\3\4\7\4\61\n\4\f\4\16\4\64"+
		"\13\4\3\4\3\4\3\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\5\4@\n\4\3\5\6\5C\n"+
		"\5\r\5\16\5D\3\5\6\5H\n\5\r\5\16\5I\3\5\5\5M\n\5\3\6\6\6P\n\6\r\6\16\6"+
		"Q\3\6\3\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6\7\6^\n\6\f\6\16\6a\13\6"+
		"\3\6\7\6d\n\6\f\6\16\6g\13\6\3\6\3\6\6\6k\n\6\r\6\16\6l\3\6\7\6p\n\6\f"+
		"\6\16\6s\13\6\3\6\7\6v\n\6\f\6\16\6y\13\6\3\6\3\6\3\6\7\6~\n\6\f\6\16"+
		"\6\u0081\13\6\3\6\3\6\3\6\5\6\u0086\n\6\3\7\3\7\3\7\3\7\2\b\2\4\6\b\n"+
		"\f\2\2\u00a2\2\32\3\2\2\2\4\34\3\2\2\2\6?\3\2\2\2\bL\3\2\2\2\n\u0085\3"+
		"\2\2\2\f\u0087\3\2\2\2\16\17\5\6\4\2\17\20\5\n\6\2\20\33\3\2\2\2\21\33"+
		"\5\n\6\2\22\23\7\r\2\2\23\24\5\6\4\2\24\25\5\n\6\2\25\33\3\2\2\2\26\27"+
		"\5\6\4\2\27\30\5\n\6\2\30\31\7\n\2\2\31\33\3\2\2\2\32\16\3\2\2\2\32\21"+
		"\3\2\2\2\32\22\3\2\2\2\32\26\3\2\2\2\33\3\3\2\2\2\34\35\7\16\2\2\35\5"+
		"\3\2\2\2\36 \7\6\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\""+
		"$\3\2\2\2#!\3\2\2\2$%\7\4\2\2%@\5\b\5\2&*\7\4\2\2\')\7\13\2\2(\'\3\2\2"+
		"\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-@\7\6\2\2.\62\7\b"+
		"\2\2/\61\5\4\3\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2"+
		"\63@\3\2\2\2\64\62\3\2\2\2\65\66\7\b\2\2\66@\7\6\2\2\67@\7\t\2\28<\7\6"+
		"\2\29;\7\13\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=@\3\2\2\2><\3"+
		"\2\2\2?!\3\2\2\2?&\3\2\2\2?.\3\2\2\2?\65\3\2\2\2?\67\3\2\2\2?8\3\2\2\2"+
		"@\7\3\2\2\2AC\5\f\7\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EM\3\2\2"+
		"\2FH\7\6\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KM\7\6\2"+
		"\2LB\3\2\2\2LG\3\2\2\2LK\3\2\2\2M\t\3\2\2\2NP\5\f\7\2ON\3\2\2\2PQ\3\2"+
		"\2\2QO\3\2\2\2QR\3\2\2\2R\u0086\3\2\2\2ST\7\5\2\2T\u0086\5\6\4\2UY\7\r"+
		"\2\2VX\7\n\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z_\3\2\2\2[Y\3\2"+
		"\2\2\\^\7\13\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`e\3\2\2\2a_"+
		"\3\2\2\2bd\5\6\4\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\u0086\3\2"+
		"\2\2ge\3\2\2\2hj\7\r\2\2ik\7\5\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2"+
		"\2\2mq\3\2\2\2np\5\6\4\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rw\3\2"+
		"\2\2sq\3\2\2\2tv\7\n\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\u0086"+
		"\3\2\2\2yw\3\2\2\2z{\7\r\2\2{\177\7\6\2\2|~\5\6\4\2}|\3\2\2\2~\u0081\3"+
		"\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0086\3\2\2\2\u0081\177\3"+
		"\2\2\2\u0082\u0083\7\r\2\2\u0083\u0086\5\6\4\2\u0084\u0086\7\5\2\2\u0085"+
		"O\3\2\2\2\u0085S\3\2\2\2\u0085U\3\2\2\2\u0085h\3\2\2\2\u0085z\3\2\2\2"+
		"\u0085\u0082\3\2\2\2\u0085\u0084\3\2\2\2\u0086\13\3\2\2\2\u0087\u0088"+
		"\7\7\2\2\u0088\u0089\5\6\4\2\u0089\r\3\2\2\2\24\32!*\62<?DILQY_elqw\177"+
		"\u0085";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}