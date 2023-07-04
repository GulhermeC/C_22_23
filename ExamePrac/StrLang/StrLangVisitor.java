// Generated from StrLang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StrLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StrLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StrLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(StrLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStat}
	 * labeled alternative in {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStat(StrLangParser.PrintStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssigStat}
	 * labeled alternative in {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigStat(StrLangParser.AssigStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintEx}
	 * labeled alternative in {@link StrLangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintEx(StrLangParser.PrintExContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignEx}
	 * labeled alternative in {@link StrLangParser#assig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignEx(StrLangParser.AssignExContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printVar}
	 * labeled alternative in {@link StrLangParser#pexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintVar(StrLangParser.PrintVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printReplace}
	 * labeled alternative in {@link StrLangParser#pexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintReplace(StrLangParser.PrintReplaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStr}
	 * labeled alternative in {@link StrLangParser#pexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStr(StrLangParser.PrintStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printAdd}
	 * labeled alternative in {@link StrLangParser#pexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintAdd(StrLangParser.PrintAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assigStr}
	 * labeled alternative in {@link StrLangParser#asexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigStr(StrLangParser.AssigStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assigPar}
	 * labeled alternative in {@link StrLangParser#asexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigPar(StrLangParser.AssigParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assigAdd}
	 * labeled alternative in {@link StrLangParser#asexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigAdd(StrLangParser.AssigAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assigInput}
	 * labeled alternative in {@link StrLangParser#asexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigInput(StrLangParser.AssigInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assigVar}
	 * labeled alternative in {@link StrLangParser#asexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigVar(StrLangParser.AssigVarContext ctx);
}