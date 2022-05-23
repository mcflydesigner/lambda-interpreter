// Generated from hardtypedParser.g4 by ANTLR 4.7.1
package hardtyped;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link hardtypedParser}.
 */
public interface hardtypedParserListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link hardtypedParser#start_Let}.
	 * @param ctx the parse tree
	 */
	void enterStart_Let(hardtypedParser.Start_LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#start_Let}.
	 * @param ctx the parse tree
	 */
	void exitStart_Let(hardtypedParser.Start_LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#start_Value}.
	 * @param ctx the parse tree
	 */
	void enterStart_Value(hardtypedParser.Start_ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#start_Value}.
	 * @param ctx the parse tree
	 */
	void exitStart_Value(hardtypedParser.Start_ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#start_Record}.
	 * @param ctx the parse tree
	 */
	void enterStart_Record(hardtypedParser.Start_RecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#start_Record}.
	 * @param ctx the parse tree
	 */
	void exitStart_Record(hardtypedParser.Start_RecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#start_InExpr}.
	 * @param ctx the parse tree
	 */
	void enterStart_InExpr(hardtypedParser.Start_InExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#start_InExpr}.
	 * @param ctx the parse tree
	 */
	void exitStart_InExpr(hardtypedParser.Start_InExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#start_InnerExpr}.
	 * @param ctx the parse tree
	 */
	void enterStart_InnerExpr(hardtypedParser.Start_InnerExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#start_InnerExpr}.
	 * @param ctx the parse tree
	 */
	void exitStart_InnerExpr(hardtypedParser.Start_InnerExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#start_FuncArg}.
	 * @param ctx the parse tree
	 */
	void enterStart_FuncArg(hardtypedParser.Start_FuncArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#start_FuncArg}.
	 * @param ctx the parse tree
	 */
	void exitStart_FuncArg(hardtypedParser.Start_FuncArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#start_VarDec}.
	 * @param ctx the parse tree
	 */
	void enterStart_VarDec(hardtypedParser.Start_VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#start_VarDec}.
	 * @param ctx the parse tree
	 */
	void exitStart_VarDec(hardtypedParser.Start_VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#start_Type}.
	 * @param ctx the parse tree
	 */
	void enterStart_Type(hardtypedParser.Start_TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#start_Type}.
	 * @param ctx the parse tree
	 */
	void exitStart_Type(hardtypedParser.Start_TypeContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(hardtypedParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(hardtypedParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(hardtypedParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(hardtypedParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#record}.
	 * @param ctx the parse tree
	 */
	void enterRecord(hardtypedParser.RecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#record}.
	 * @param ctx the parse tree
	 */
	void exitRecord(hardtypedParser.RecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#inExpr}.
	 * @param ctx the parse tree
	 */
	void enterInExpr(hardtypedParser.InExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#inExpr}.
	 * @param ctx the parse tree
	 */
	void exitInExpr(hardtypedParser.InExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#innerExpr}.
	 * @param ctx the parse tree
	 */
	void enterInnerExpr(hardtypedParser.InnerExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#innerExpr}.
	 * @param ctx the parse tree
	 */
	void exitInnerExpr(hardtypedParser.InnerExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void enterFuncArg(hardtypedParser.FuncArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#funcArg}.
	 * @param ctx the parse tree
	 */
	void exitFuncArg(hardtypedParser.FuncArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(hardtypedParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(hardtypedParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardtypedParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(hardtypedParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardtypedParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(hardtypedParser.TypeContext ctx);
}