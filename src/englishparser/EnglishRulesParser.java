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
		public List<TerminalNode> ADJECTIVE() { return getTokens(EnglishRulesParser.ADJECTIVE); }
		public TerminalNode NOUN() { return getToken(EnglishRulesParser.NOUN, 0); }
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
			setState(43);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28); match(DETERMINAN);
				setState(29); nominal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30); match(DETERMINAN);
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADJECTIVE) {
					{
					{
					setState(31); match(ADJECTIVE);
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(37); match(NOUN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38); match(PRONOUN);
				setState(39); match(NOUN);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40); match(NOUNPHRASE);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(41); match(NOUN);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(42); match(PRONOUN);
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
			setState(56);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(45); pp();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(48); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(50); match(NOUN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(53); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55); match(NOUN);
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
		public TerminalNode ADJECTIVE() { return getToken(EnglishRulesParser.ADJECTIVE, 0); }
		public TerminalNode NOUN() { return getToken(EnglishRulesParser.NOUN, 0); }
		public TerminalNode AUX() { return getToken(EnglishRulesParser.AUX, 0); }
		public List<PpContext> pp() {
			return getRuleContexts(PpContext.class);
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
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(58); pp();
					}
					}
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PREPOSITION );
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63); match(VERB);
				setState(64); np();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65); match(AUX);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADVERB) {
					{
					{
					setState(66); match(ADVERB);
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72); match(ADJECTIVE);
				setState(73); np();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74); match(AUX);
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(75); match(VERB);
					}
					}
					setState(78); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VERB );
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DETERMINAN) | (1L << NOUN) | (1L << PRONOUN) | (1L << NOUNPHRASE))) != 0)) {
					{
					{
					setState(80); np();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(86); match(ADVERB);
						}
						} 
					}
					setState(91);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92); match(AUX);
				setState(93); match(NOUN);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DETERMINAN) | (1L << NOUN) | (1L << PRONOUN) | (1L << NOUNPHRASE))) != 0)) {
					{
					{
					setState(94); np();
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(100); match(AUX);
				setState(101); np();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(102); match(VERB);
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
			setState(105); match(PREPOSITION);
			setState(106); np();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\16o\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2\33\n\2\3\3\3\3\3\4\3\4\3\4\3\4\7\4#\n\4\f\4\16\4&\13"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4.\n\4\3\5\6\5\61\n\5\r\5\16\5\62\3\5\6\5"+
		"\66\n\5\r\5\16\5\67\3\5\5\5;\n\5\3\6\6\6>\n\6\r\6\16\6?\3\6\3\6\3\6\3"+
		"\6\7\6F\n\6\f\6\16\6I\13\6\3\6\3\6\3\6\3\6\6\6O\n\6\r\6\16\6P\3\6\7\6"+
		"T\n\6\f\6\16\6W\13\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\6\3\6\3\6\7\6b\n\6"+
		"\f\6\16\6e\13\6\3\6\3\6\3\6\5\6j\n\6\3\7\3\7\3\7\3\7\2\b\2\4\6\b\n\f\2"+
		"\2\u0081\2\32\3\2\2\2\4\34\3\2\2\2\6-\3\2\2\2\b:\3\2\2\2\ni\3\2\2\2\f"+
		"k\3\2\2\2\16\17\5\6\4\2\17\20\5\n\6\2\20\33\3\2\2\2\21\33\5\n\6\2\22\23"+
		"\7\r\2\2\23\24\5\6\4\2\24\25\5\n\6\2\25\33\3\2\2\2\26\27\5\6\4\2\27\30"+
		"\5\n\6\2\30\31\7\n\2\2\31\33\3\2\2\2\32\16\3\2\2\2\32\21\3\2\2\2\32\22"+
		"\3\2\2\2\32\26\3\2\2\2\33\3\3\2\2\2\34\35\7\16\2\2\35\5\3\2\2\2\36\37"+
		"\7\4\2\2\37.\5\b\5\2 $\7\4\2\2!#\7\13\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2"+
		"\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'.\7\6\2\2()\7\b\2\2).\7\6\2\2*.\7"+
		"\t\2\2+.\7\6\2\2,.\7\b\2\2-\36\3\2\2\2- \3\2\2\2-(\3\2\2\2-*\3\2\2\2-"+
		"+\3\2\2\2-,\3\2\2\2.\7\3\2\2\2/\61\5\f\7\2\60/\3\2\2\2\61\62\3\2\2\2\62"+
		"\60\3\2\2\2\62\63\3\2\2\2\63;\3\2\2\2\64\66\7\6\2\2\65\64\3\2\2\2\66\67"+
		"\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28;\3\2\2\29;\7\6\2\2:\60\3\2\2\2:\65"+
		"\3\2\2\2:9\3\2\2\2;\t\3\2\2\2<>\5\f\7\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2"+
		"?@\3\2\2\2@j\3\2\2\2AB\7\5\2\2Bj\5\6\4\2CG\7\r\2\2DF\7\n\2\2ED\3\2\2\2"+
		"FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\13\2\2Kj\5\6\4"+
		"\2LN\7\r\2\2MO\7\5\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QU\3\2\2"+
		"\2RT\5\6\4\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V[\3\2\2\2WU\3\2\2"+
		"\2XZ\7\n\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\j\3\2\2\2][\3\2"+
		"\2\2^_\7\r\2\2_c\7\6\2\2`b\5\6\4\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2"+
		"\2\2dj\3\2\2\2ec\3\2\2\2fg\7\r\2\2gj\5\6\4\2hj\7\5\2\2i=\3\2\2\2iA\3\2"+
		"\2\2iC\3\2\2\2iL\3\2\2\2i^\3\2\2\2if\3\2\2\2ih\3\2\2\2j\13\3\2\2\2kl\7"+
		"\7\2\2lm\5\6\4\2m\r\3\2\2\2\17\32$-\62\67:?GPU[ci";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}