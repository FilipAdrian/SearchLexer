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
	 * Visit a parse tree produced by {@link GrammarParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(GrammarParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code standardFunction}
	 * labeled alternative in {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardFunction(GrammarParser.StandardFunctionContext ctx);
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
	 * Visit a parse tree produced by {@link GrammarParser#standard_func_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_func_name(GrammarParser.Standard_func_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#special_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_symbol(GrammarParser.Special_symbolContext ctx);
}