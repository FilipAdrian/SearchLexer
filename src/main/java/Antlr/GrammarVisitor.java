// Generated from C:/Users/Adrian/IdeaProjects/SearchLexer/src/main/java/Antlr\Grammar.g4 by ANTLR 4.7.2
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filePathDeclaration}
	 * labeled alternative in {@link GrammarParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilePathDeclaration(GrammarParser.FilePathDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code findFunction}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFindFunction(GrammarParser.FindFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code replaceFunction}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceFunction(GrammarParser.ReplaceFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lookFunction}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookFunction(GrammarParser.LookFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code countFunction}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountFunction(GrammarParser.CountFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code findLineFunction}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFindLineFunction(GrammarParser.FindLineFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code findWholeFunction}
	 * labeled alternative in {@link GrammarParser#find}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFindWholeFunction(GrammarParser.FindWholeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code findByPrefix}
	 * labeled alternative in {@link GrammarParser#find}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFindByPrefix(GrammarParser.FindByPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code findBtSyffix}
	 * labeled alternative in {@link GrammarParser#find}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFindBtSyffix(GrammarParser.FindBtSyffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#special_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_symbol(GrammarParser.Special_symbolContext ctx);
}