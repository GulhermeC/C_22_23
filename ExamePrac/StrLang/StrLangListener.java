// Generated from StrLang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StrLangParser}.
 */
public interface StrLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StrLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(StrLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(StrLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStat}
	 * labeled alternative in {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStat(StrLangParser.PrintStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStat}
	 * labeled alternative in {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStat(StrLangParser.PrintStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssigStat}
	 * labeled alternative in {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssigStat(StrLangParser.AssigStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssigStat}
	 * labeled alternative in {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssigStat(StrLangParser.AssigStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintEx}
	 * labeled alternative in {@link StrLangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintEx(StrLangParser.PrintExContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintEx}
	 * labeled alternative in {@link StrLangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintEx(StrLangParser.PrintExContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignEx}
	 * labeled alternative in {@link StrLangParser#assig}.
	 * @param ctx the parse tree
	 */
	void enterAssignEx(StrLangParser.AssignExContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignEx}
	 * labeled alternative in {@link StrLangParser#assig}.
	 * @param ctx the parse tree
	 */
	void exitAssignEx(StrLangParser.AssignExContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printVar}
	 * labeled alternative in {@link StrLangParser#pexpr}.
	 * @param ctx the parse tree
	 */
	void enterPrintVar(StrLangParser.PrintVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printVar}
	 * labeled alternative in {@link StrLangParser#pexpr}.
	 * @param ctx the parse tree
	 */
	void exitPrintVar(StrLangParser.PrintVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printReplace}
	 * labeled alternative in {@link StrLangParser#pexpr}.
	 * @param ctx the parse tree
	 */
	void enterPrintReplace(StrLangParser.PrintReplaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printReplace}
	 * labeled alternative in {@link StrLangParser#pexpr}.
	 * @param ctx the parse tree
	 */
	void exitPrintReplace(StrLangParser.PrintReplaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStr}
	 * labeled alternative in {@link StrLangParser#pexpr}.
	 * @param ctx the parse tree
	 */
	void enterPrintStr(StrLangParser.PrintStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStr}
	 * labeled alternative in {@link StrLangParser#pexpr}.
	 * @param ctx the parse tree
	 */
	void exitPrintStr(StrLangParser.PrintStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printAdd}
	 * labeled alternative in {@link StrLangParser#pexpr}.
	 * @param ctx the parse tree
	 */
	void enterPrintAdd(StrLangParser.PrintAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printAdd}
	 * labeled alternative in {@link StrLangParser#pexpr}.
	 * @param ctx the parse tree
	 */
	void exitPrintAdd(StrLangParser.PrintAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assigStr}
	 * labeled alternative in {@link StrLangParser#asexpr}.
	 * @param ctx the parse tree
	 */
	void enterAssigStr(StrLangParser.AssigStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assigStr}
	 * labeled alternative in {@link StrLangParser#asexpr}.
	 * @param ctx the parse tree
	 */
	void exitAssigStr(StrLangParser.AssigStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assigPar}
	 * labeled alternative in {@link StrLangParser#asexpr}.
	 * @param ctx the parse tree
	 */
	void enterAssigPar(StrLangParser.AssigParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assigPar}
	 * labeled alternative in {@link StrLangParser#asexpr}.
	 * @param ctx the parse tree
	 */
	void exitAssigPar(StrLangParser.AssigParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assigAdd}
	 * labeled alternative in {@link StrLangParser#asexpr}.
	 * @param ctx the parse tree
	 */
	void enterAssigAdd(StrLangParser.AssigAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assigAdd}
	 * labeled alternative in {@link StrLangParser#asexpr}.
	 * @param ctx the parse tree
	 */
	void exitAssigAdd(StrLangParser.AssigAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assigInput}
	 * labeled alternative in {@link StrLangParser#asexpr}.
	 * @param ctx the parse tree
	 */
	void enterAssigInput(StrLangParser.AssigInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assigInput}
	 * labeled alternative in {@link StrLangParser#asexpr}.
	 * @param ctx the parse tree
	 */
	void exitAssigInput(StrLangParser.AssigInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assigVar}
	 * labeled alternative in {@link StrLangParser#asexpr}.
	 * @param ctx the parse tree
	 */
	void enterAssigVar(StrLangParser.AssigVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assigVar}
	 * labeled alternative in {@link StrLangParser#asexpr}.
	 * @param ctx the parse tree
	 */
	void exitAssigVar(StrLangParser.AssigVarContext ctx);
}