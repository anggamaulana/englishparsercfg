// Generated from EnglishRules.g by ANTLR 4.1
package englishparser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EnglishRulesLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, DETERMINAN=2, VERB=3, NOUN=4, PREPOSITION=5, PRONOUN=6, NOUNPHRASE=7, 
		ADVERB=8, ADJECTIVE=9, INTERJECTION=10, AUX=11, CONJUNCTION=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WS", "'D'", "VERB", "'N'", "'P'", "PRONOUN", "'h'", "'v'", "'A'", "'!'", 
		"AUX", "CONJUNCTION"
	};
	public static final String[] ruleNames = {
		"WS", "DETERMINAN", "VERB", "NOUN", "PREPOSITION", "PRONOUN", "NOUNPHRASE", 
		"ADVERB", "ADJECTIVE", "INTERJECTION", "AUX", "CONJUNCTION"
	};


	public EnglishRulesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EnglishRules.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\16\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7M\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fq\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u008f\n\r\2\16\3\3\2\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t"+
		"\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\3\2\4\5\2\13\f\17\17\"\"\4\2X"+
		"Xvv\u00aa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\3\34\3\2\2\2\5\"\3\2\2\2\7$\3\2\2\2\t&\3\2\2\2\13"+
		"(\3\2\2\2\rL\3\2\2\2\17N\3\2\2\2\21P\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27"+
		"p\3\2\2\2\31\u008e\3\2\2\2\33\35\t\2\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36"+
		"\34\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\b\2\2\2!\4\3\2\2\2\"#\7F\2\2#"+
		"\6\3\2\2\2$%\t\3\2\2%\b\3\2\2\2&\'\7P\2\2\'\n\3\2\2\2()\7R\2\2)\f\3\2"+
		"\2\2*M\7t\2\2+,\7j\2\2,-\7k\2\2-M\7u\2\2./\7j\2\2/\60\7g\2\2\60M\7t\2"+
		"\2\61\62\7v\2\2\62\63\7j\2\2\63\64\7g\2\2\64\65\7k\2\2\65M\7t\2\2\66\67"+
		"\7o\2\2\67M\7{\2\289\7{\2\29:\7q\2\2:;\7w\2\2;M\7t\2\2<=\7k\2\2=>\7v\2"+
		"\2>M\7u\2\2?@\7j\2\2@M\7g\2\2AB\7u\2\2BC\7j\2\2CM\7g\2\2DE\7k\2\2EM\7"+
		"v\2\2FM\7k\2\2GH\7{\2\2HI\7q\2\2IM\7w\2\2JK\7o\2\2KM\7g\2\2L*\3\2\2\2"+
		"L+\3\2\2\2L.\3\2\2\2L\61\3\2\2\2L\66\3\2\2\2L8\3\2\2\2L<\3\2\2\2L?\3\2"+
		"\2\2LA\3\2\2\2LD\3\2\2\2LF\3\2\2\2LG\3\2\2\2LJ\3\2\2\2M\16\3\2\2\2NO\7"+
		"j\2\2O\20\3\2\2\2PQ\7x\2\2Q\22\3\2\2\2RS\7C\2\2S\24\3\2\2\2TU\7#\2\2U"+
		"\26\3\2\2\2VW\7c\2\2Wq\7o\2\2XY\7c\2\2YZ\7t\2\2Zq\7g\2\2[\\\7k\2\2\\q"+
		"\7u\2\2]^\7y\2\2^_\7c\2\2_q\7u\2\2`a\7y\2\2ab\7g\2\2bc\7t\2\2cq\7g\2\2"+
		"de\7y\2\2ef\7k\2\2fg\7n\2\2gq\7n\2\2hi\7u\2\2ij\7j\2\2jk\7c\2\2kl\7n\2"+
		"\2lq\7n\2\2mn\7o\2\2no\7c\2\2oq\7{\2\2pV\3\2\2\2pX\3\2\2\2p[\3\2\2\2p"+
		"]\3\2\2\2p`\3\2\2\2pd\3\2\2\2ph\3\2\2\2pm\3\2\2\2q\30\3\2\2\2r\u008f\7"+
		"E\2\2st\7c\2\2tu\7p\2\2u\u008f\7f\2\2vw\7q\2\2w\u008f\7t\2\2xy\7d\2\2"+
		"yz\7w\2\2z\u008f\7v\2\2{|\7v\2\2|}\7j\2\2}~\7g\2\2~\u008f\7p\2\2\177\u0080"+
		"\7w\2\2\u0080\u0081\7p\2\2\u0081\u0082\7n\2\2\u0082\u0083\7g\2\2\u0083"+
		"\u0084\7u\2\2\u0084\u008f\7u\2\2\u0085\u0086\7y\2\2\u0086\u0087\7j\2\2"+
		"\u0087\u0088\7g\2\2\u0088\u008f\7p\2\2\u0089\u008a\7y\2\2\u008a\u008b"+
		"\7j\2\2\u008b\u008c\7k\2\2\u008c\u008d\7n\2\2\u008d\u008f\7g\2\2\u008e"+
		"r\3\2\2\2\u008es\3\2\2\2\u008ev\3\2\2\2\u008ex\3\2\2\2\u008e{\3\2\2\2"+
		"\u008e\177\3\2\2\2\u008e\u0085\3\2\2\2\u008e\u0089\3\2\2\2\u008f\32\3"+
		"\2\2\2\7\2\36Lp\u008e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}