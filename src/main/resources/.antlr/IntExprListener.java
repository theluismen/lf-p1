// Generated from c:/Users/trujillo/Documents/Work/Teaching/2025/Formal-Languages/code/task1-calculator/src/main/resources/IntExpr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IntExprParser}.
 */
public interface IntExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IntExprParser#ini}.
	 * @param ctx the parse tree
	 */
	void enterIni(IntExprParser.IniContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntExprParser#ini}.
	 * @param ctx the parse tree
	 */
	void exitIni(IntExprParser.IniContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link IntExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(IntExprParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link IntExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(IntExprParser.DivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParExpr}
	 * labeled alternative in {@link IntExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(IntExprParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParExpr}
	 * labeled alternative in {@link IntExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(IntExprParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link IntExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(IntExprParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link IntExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(IntExprParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultExpr}
	 * labeled alternative in {@link IntExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(IntExprParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultExpr}
	 * labeled alternative in {@link IntExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(IntExprParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link IntExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(IntExprParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link IntExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(IntExprParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link IntExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(IntExprParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link IntExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(IntExprParser.IntExprContext ctx);
}