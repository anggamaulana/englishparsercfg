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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\16\u008b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7K\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\fl\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008a\n"+
		"\r\2\16\3\3\2\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25"+
		"\f\1\27\r\1\31\16\1\3\2\4\5\2\13\f\17\17\"\"\4\2XXvv\u00a3\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\3\34\3\2\2\2\5\"\3\2\2\2\7$\3\2\2\2\t&\3\2\2\2\13(\3\2\2\2\rJ\3\2\2\2"+
		"\17L\3\2\2\2\21N\3\2\2\2\23P\3\2\2\2\25R\3\2\2\2\27k\3\2\2\2\31\u0089"+
		"\3\2\2\2\33\35\t\2\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37"+
		"\3\2\2\2\37 \3\2\2\2 !\b\2\2\2!\4\3\2\2\2\"#\7F\2\2#\6\3\2\2\2$%\t\3\2"+
		"\2%\b\3\2\2\2&\'\7P\2\2\'\n\3\2\2\2()\7R\2\2)\f\3\2\2\2*K\7t\2\2+,\7j"+
		"\2\2,-\7k\2\2-K\7u\2\2./\7j\2\2/\60\7g\2\2\60K\7t\2\2\61\62\7v\2\2\62"+
		"\63\7j\2\2\63\64\7g\2\2\64\65\7k\2\2\65K\7t\2\2\66\67\7o\2\2\67K\7{\2"+
		"\289\7{\2\29:\7q\2\2:;\7w\2\2;K\7t\2\2<=\7k\2\2=>\7v\2\2>K\7u\2\2?@\7"+
		"j\2\2@K\7g\2\2AB\7u\2\2BC\7j\2\2CK\7g\2\2DE\7k\2\2EK\7v\2\2FK\7k\2\2G"+
		"H\7{\2\2HI\7q\2\2IK\7w\2\2J*\3\2\2\2J+\3\2\2\2J.\3\2\2\2J\61\3\2\2\2J"+
		"\66\3\2\2\2J8\3\2\2\2J<\3\2\2\2J?\3\2\2\2JA\3\2\2\2JD\3\2\2\2JF\3\2\2"+
		"\2JG\3\2\2\2K\16\3\2\2\2LM\7j\2\2M\20\3\2\2\2NO\7x\2\2O\22\3\2\2\2PQ\7"+
		"C\2\2Q\24\3\2\2\2RS\7#\2\2S\26\3\2\2\2TU\7c\2\2Ul\7o\2\2VW\7k\2\2Wl\7"+
		"u\2\2XY\7y\2\2YZ\7c\2\2Zl\7u\2\2[\\\7y\2\2\\]\7g\2\2]^\7t\2\2^l\7g\2\2"+
		"_`\7y\2\2`a\7k\2\2ab\7n\2\2bl\7n\2\2cd\7u\2\2de\7j\2\2ef\7c\2\2fg\7n\2"+
		"\2gl\7n\2\2hi\7o\2\2ij\7c\2\2jl\7{\2\2kT\3\2\2\2kV\3\2\2\2kX\3\2\2\2k"+
		"[\3\2\2\2k_\3\2\2\2kc\3\2\2\2kh\3\2\2\2l\30\3\2\2\2m\u008a\7E\2\2no\7"+
		"c\2\2op\7p\2\2p\u008a\7f\2\2qr\7q\2\2r\u008a\7t\2\2st\7d\2\2tu\7w\2\2"+
		"u\u008a\7v\2\2vw\7v\2\2wx\7j\2\2xy\7g\2\2y\u008a\7p\2\2z{\7w\2\2{|\7p"+
		"\2\2|}\7n\2\2}~\7g\2\2~\177\7u\2\2\177\u008a\7u\2\2\u0080\u0081\7y\2\2"+
		"\u0081\u0082\7j\2\2\u0082\u0083\7g\2\2\u0083\u008a\7p\2\2\u0084\u0085"+
		"\7y\2\2\u0085\u0086\7j\2\2\u0086\u0087\7k\2\2\u0087\u0088\7n\2\2\u0088"+
		"\u008a\7g\2\2\u0089m\3\2\2\2\u0089n\3\2\2\2\u0089q\3\2\2\2\u0089s\3\2"+
		"\2\2\u0089v\3\2\2\2\u0089z\3\2\2\2\u0089\u0080\3\2\2\2\u0089\u0084\3\2"+
		"\2\2\u008a\32\3\2\2\2\7\2\36Jk\u0089";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}