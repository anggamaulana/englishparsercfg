// Generated from EnglishRules.g by ANTLR 4.1
package englishparser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EnglishRulesParser}.
 */
public interface EnglishRulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EnglishRulesParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(@NotNull EnglishRulesParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishRulesParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(@NotNull EnglishRulesParser.SContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnglishRulesParser#np}.
	 * @param ctx the parse tree
	 */
	void enterNp(@NotNull EnglishRulesParser.NpContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishRulesParser#np}.
	 * @param ctx the parse tree
	 */
	void exitNp(@NotNull EnglishRulesParser.NpContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnglishRulesParser#c}.
	 * @param ctx the parse tree
	 */
	void enterC(@NotNull EnglishRulesParser.CContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishRulesParser#c}.
	 * @param ctx the parse tree
	 */
	void exitC(@NotNull EnglishRulesParser.CContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnglishRulesParser#pp}.
	 * @param ctx the parse tree
	 */
	void enterPp(@NotNull EnglishRulesParser.PpContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishRulesParser#pp}.
	 * @param ctx the parse tree
	 */
	void exitPp(@NotNull EnglishRulesParser.PpContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnglishRulesParser#vp}.
	 * @param ctx the parse tree
	 */
	void enterVp(@NotNull EnglishRulesParser.VpContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishRulesParser#vp}.
	 * @param ctx the parse tree
	 */
	void exitVp(@NotNull EnglishRulesParser.VpContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnglishRulesParser#nominal}.
	 * @param ctx the parse tree
	 */
	void enterNominal(@NotNull EnglishRulesParser.NominalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishRulesParser#nominal}.
	 * @param ctx the parse tree
	 */
	void exitNominal(@NotNull EnglishRulesParser.NominalContext ctx);
}