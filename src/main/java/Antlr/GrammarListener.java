// Generated from C:/Users/Adrian/IdeaProjects/SearchLexer/src/main/java/Antlr\Grammar.g4 by ANTLR 4.7.2
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filePathDeclaration}
	 * labeled alternative in {@link GrammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterFilePathDeclaration(GrammarParser.FilePathDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filePathDeclaration}
	 * labeled alternative in {@link GrammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitFilePathDeclaration(GrammarParser.FilePathDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code findFunction}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFindFunction(GrammarParser.FindFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code findFunction}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFindFunction(GrammarParser.FindFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code replaceFunction}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterReplaceFunction(GrammarParser.ReplaceFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code replaceFunction}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitReplaceFunction(GrammarParser.ReplaceFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lookFunction}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterLookFunction(GrammarParser.LookFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lookFunction}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitLookFunction(GrammarParser.LookFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code countFunction}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterCountFunction(GrammarParser.CountFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code countFunction}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitCountFunction(GrammarParser.CountFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code findLineFunction}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFindLineFunction(GrammarParser.FindLineFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code findLineFunction}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFindLineFunction(GrammarParser.FindLineFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code changeFormat}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterChangeFormat(GrammarParser.ChangeFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code changeFormat}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitChangeFormat(GrammarParser.ChangeFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code findWholeFunction}
	 * labeled alternative in {@link GrammarParser#find}.
	 * @param ctx the parse tree
	 */
	void enterFindWholeFunction(GrammarParser.FindWholeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code findWholeFunction}
	 * labeled alternative in {@link GrammarParser#find}.
	 * @param ctx the parse tree
	 */
	void exitFindWholeFunction(GrammarParser.FindWholeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code findByPrefix}
	 * labeled alternative in {@link GrammarParser#find}.
	 * @param ctx the parse tree
	 */
	void enterFindByPrefix(GrammarParser.FindByPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code findByPrefix}
	 * labeled alternative in {@link GrammarParser#find}.
	 * @param ctx the parse tree
	 */
	void exitFindByPrefix(GrammarParser.FindByPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code findBySyffix}
	 * labeled alternative in {@link GrammarParser#find}.
	 * @param ctx the parse tree
	 */
	void enterFindBySyffix(GrammarParser.FindBySyffixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code findBySyffix}
	 * labeled alternative in {@link GrammarParser#find}.
	 * @param ctx the parse tree
	 */
	void exitFindBySyffix(GrammarParser.FindBySyffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code findByFragment}
	 * labeled alternative in {@link GrammarParser#find}.
	 * @param ctx the parse tree
	 */
	void enterFindByFragment(GrammarParser.FindByFragmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code findByFragment}
	 * labeled alternative in {@link GrammarParser#find}.
	 * @param ctx the parse tree
	 */
	void exitFindByFragment(GrammarParser.FindByFragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lookFor}.
	 * @param ctx the parse tree
	 */
	void enterLookFor(GrammarParser.LookForContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lookFor}.
	 * @param ctx the parse tree
	 */
	void exitLookFor(GrammarParser.LookForContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#change}.
	 * @param ctx the parse tree
	 */
	void enterChange(GrammarParser.ChangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#change}.
	 * @param ctx the parse tree
	 */
	void exitChange(GrammarParser.ChangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#alpha}.
	 * @param ctx the parse tree
	 */
	void enterAlpha(GrammarParser.AlphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#alpha}.
	 * @param ctx the parse tree
	 */
	void exitAlpha(GrammarParser.AlphaContext ctx);
}