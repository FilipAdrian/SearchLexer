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
	 * Enter a parse tree produced by the {@code standardFunction}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterStandardFunction(GrammarParser.StandardFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code standardFunction}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitStandardFunction(GrammarParser.StandardFunctionContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#standard_func_name}.
	 * @param ctx the parse tree
	 */
	void enterStandard_func_name(GrammarParser.Standard_func_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#standard_func_name}.
	 * @param ctx the parse tree
	 */
	void exitStandard_func_name(GrammarParser.Standard_func_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#special_symbol}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_symbol(GrammarParser.Special_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#special_symbol}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_symbol(GrammarParser.Special_symbolContext ctx);
}