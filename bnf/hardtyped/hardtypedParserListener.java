// Generated from hardtypedParser.g4 by ANTLR 4.7.1
package hardtyped;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link hardtypedParser}.
 */
public interface hardtypedParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#start_Program}.
	 * @param ctx the parse tree
	 */
	void enterStart_Program(hardtypedParser.Start_ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#start_Program}.
	 * @param ctx the parse tree
	 */
	void exitStart_Program(hardtypedParser.Start_ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#start_ListExpr}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListExpr(hardtypedParser.Start_ListExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#start_ListExpr}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListExpr(hardtypedParser.Start_ListExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#start_Expr}.
	 * @param ctx the parse tree
	 */
	void enterStart_Expr(hardtypedParser.Start_ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#start_Expr}.
	 * @param ctx the parse tree
	 */
	void exitStart_Expr(hardtypedParser.Start_ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(hardtypedParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(hardtypedParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#listExpr}.
	 * @param ctx the parse tree
	 */
	void enterListExpr(hardtypedParser.ListExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#listExpr}.
	 * @param ctx the parse tree
	 */
	void exitListExpr(hardtypedParser.ListExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(hardtypedParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(hardtypedParser.ExprContext ctx);
}