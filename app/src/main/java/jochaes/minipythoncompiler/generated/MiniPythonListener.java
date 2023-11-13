// Generated from /Users/gilda/Desktop/Repositorios/MiniPythonCompiler/app/MiniPython.g4 by ANTLR 4.13.1
package jochaes.minipythoncompiler.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniPythonParser}.
 */
public interface MiniPythonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code program_AST}
	 * labeled alternative in {@link MiniPythonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram_AST(MiniPythonParser.Program_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code program_AST}
	 * labeled alternative in {@link MiniPythonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram_AST(MiniPythonParser.Program_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code def_MS_AST}
	 * labeled alternative in {@link MiniPythonParser#mainStatement}.
	 * @param ctx the parse tree
	 */
	void enterDef_MS_AST(MiniPythonParser.Def_MS_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code def_MS_AST}
	 * labeled alternative in {@link MiniPythonParser#mainStatement}.
	 * @param ctx the parse tree
	 */
	void exitDef_MS_AST(MiniPythonParser.Def_MS_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign_MS_AST}
	 * labeled alternative in {@link MiniPythonParser#mainStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_MS_AST(MiniPythonParser.Assign_MS_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign_MS_AST}
	 * labeled alternative in {@link MiniPythonParser#mainStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_MS_AST(MiniPythonParser.Assign_MS_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall_MS_AST}
	 * labeled alternative in {@link MiniPythonParser#mainStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall_MS_AST(MiniPythonParser.FunctionCall_MS_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall_MS_AST}
	 * labeled alternative in {@link MiniPythonParser#mainStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall_MS_AST(MiniPythonParser.FunctionCall_MS_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print_MS_AST}
	 * labeled alternative in {@link MiniPythonParser#mainStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_MS_AST(MiniPythonParser.Print_MS_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print_MS_AST}
	 * labeled alternative in {@link MiniPythonParser#mainStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_MS_AST(MiniPythonParser.Print_MS_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_ST_AST(MiniPythonParser.If_ST_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_ST_AST(MiniPythonParser.If_ST_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_ST_AST(MiniPythonParser.Return_ST_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_ST_AST(MiniPythonParser.Return_ST_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_ST_AST(MiniPythonParser.Print_ST_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_ST_AST(MiniPythonParser.Print_ST_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_ST_AST(MiniPythonParser.While_ST_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_ST_AST(MiniPythonParser.While_ST_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_ST_AST(MiniPythonParser.For_ST_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_ST_AST(MiniPythonParser.For_ST_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_ST_AST(MiniPythonParser.Assign_ST_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_ST_AST(MiniPythonParser.Assign_ST_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall_ST_AST(MiniPythonParser.FunctionCall_ST_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall_ST_AST(MiniPythonParser.FunctionCall_ST_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#defStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefStatement_AST(MiniPythonParser.DefStatement_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#defStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefStatement_AST(MiniPythonParser.DefStatement_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argList_AST}
	 * labeled alternative in {@link MiniPythonParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList_AST(MiniPythonParser.ArgList_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argList_AST}
	 * labeled alternative in {@link MiniPythonParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList_AST(MiniPythonParser.ArgList_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement_AST(MiniPythonParser.IfStatement_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement_AST(MiniPythonParser.IfStatement_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement_AST(MiniPythonParser.WhileStatement_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement_AST(MiniPythonParser.WhileStatement_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement_AST(MiniPythonParser.ForStatement_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement_AST(MiniPythonParser.ForStatement_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement_AST(MiniPythonParser.ReturnStatement_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement_AST(MiniPythonParser.ReturnStatement_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement_AST(MiniPythonParser.PrintStatement_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement_AST(MiniPythonParser.PrintStatement_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement_AST(MiniPythonParser.AssignStatement_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement_AST(MiniPythonParser.AssignStatement_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement_AST(MiniPythonParser.FunctionCallStatement_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement_AST(MiniPythonParser.FunctionCallStatement_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sequence_AST}
	 * labeled alternative in {@link MiniPythonParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence_AST(MiniPythonParser.Sequence_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sequence_AST}
	 * labeled alternative in {@link MiniPythonParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence_AST(MiniPythonParser.Sequence_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_AST}
	 * labeled alternative in {@link MiniPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_AST(MiniPythonParser.Expression_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_AST}
	 * labeled alternative in {@link MiniPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_AST(MiniPythonParser.Expression_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addition_EO_AST}
	 * labeled alternative in {@link MiniPythonParser#expressionOperator}.
	 * @param ctx the parse tree
	 */
	void enterAddition_EO_AST(MiniPythonParser.Addition_EO_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addition_EO_AST}
	 * labeled alternative in {@link MiniPythonParser#expressionOperator}.
	 * @param ctx the parse tree
	 */
	void exitAddition_EO_AST(MiniPythonParser.Addition_EO_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substraction_EO_AST}
	 * labeled alternative in {@link MiniPythonParser#expressionOperator}.
	 * @param ctx the parse tree
	 */
	void enterSubstraction_EO_AST(MiniPythonParser.Substraction_EO_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substraction_EO_AST}
	 * labeled alternative in {@link MiniPythonParser#expressionOperator}.
	 * @param ctx the parse tree
	 */
	void exitSubstraction_EO_AST(MiniPythonParser.Substraction_EO_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplication_EO_AST}
	 * labeled alternative in {@link MiniPythonParser#expressionOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication_EO_AST(MiniPythonParser.Multiplication_EO_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplication_EO_AST}
	 * labeled alternative in {@link MiniPythonParser#expressionOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication_EO_AST(MiniPythonParser.Multiplication_EO_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code division_EO_AST}
	 * labeled alternative in {@link MiniPythonParser#expressionOperator}.
	 * @param ctx the parse tree
	 */
	void enterDivision_EO_AST(MiniPythonParser.Division_EO_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code division_EO_AST}
	 * labeled alternative in {@link MiniPythonParser#expressionOperator}.
	 * @param ctx the parse tree
	 */
	void exitDivision_EO_AST(MiniPythonParser.Division_EO_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison_AST}
	 * labeled alternative in {@link MiniPythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison_AST(MiniPythonParser.Comparison_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison_AST}
	 * labeled alternative in {@link MiniPythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison_AST(MiniPythonParser.Comparison_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThan_CO_AST}
	 * labeled alternative in {@link MiniPythonParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterLessThan_CO_AST(MiniPythonParser.LessThan_CO_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThan_CO_AST}
	 * labeled alternative in {@link MiniPythonParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitLessThan_CO_AST(MiniPythonParser.LessThan_CO_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThan_CO_AST}
	 * labeled alternative in {@link MiniPythonParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan_CO_AST(MiniPythonParser.GreaterThan_CO_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThan_CO_AST}
	 * labeled alternative in {@link MiniPythonParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan_CO_AST(MiniPythonParser.GreaterThan_CO_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanEqual_CO_AST}
	 * labeled alternative in {@link MiniPythonParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterLessThanEqual_CO_AST(MiniPythonParser.LessThanEqual_CO_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanEqual_CO_AST}
	 * labeled alternative in {@link MiniPythonParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitLessThanEqual_CO_AST(MiniPythonParser.LessThanEqual_CO_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanEqual_CO_AST}
	 * labeled alternative in {@link MiniPythonParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanEqual_CO_AST(MiniPythonParser.GreaterThanEqual_CO_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanEqual_CO_AST}
	 * labeled alternative in {@link MiniPythonParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanEqual_CO_AST(MiniPythonParser.GreaterThanEqual_CO_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison_CO_AST}
	 * labeled alternative in {@link MiniPythonParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_CO_AST(MiniPythonParser.Comparison_CO_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison_CO_AST}
	 * labeled alternative in {@link MiniPythonParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_CO_AST(MiniPythonParser.Comparison_CO_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqual_CO_AST}
	 * labeled alternative in {@link MiniPythonParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterNotEqual_CO_AST(MiniPythonParser.NotEqual_CO_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqual_CO_AST}
	 * labeled alternative in {@link MiniPythonParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitNotEqual_CO_AST(MiniPythonParser.NotEqual_CO_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionList_AST}
	 * labeled alternative in {@link MiniPythonParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList_AST(MiniPythonParser.ExpressionList_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionList_AST}
	 * labeled alternative in {@link MiniPythonParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList_AST(MiniPythonParser.ExpressionList_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterInteger_PE_AST(MiniPythonParser.Integer_PE_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitInteger_PE_AST(MiniPythonParser.Integer_PE_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterFloat_PE_AST(MiniPythonParser.Float_PE_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitFloat_PE_AST(MiniPythonParser.Float_PE_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_PE_AST(MiniPythonParser.Identifier_PE_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_PE_AST(MiniPythonParser.Identifier_PE_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterChar_PE_AST(MiniPythonParser.Char_PE_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitChar_PE_AST(MiniPythonParser.Char_PE_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterString_PE_AST(MiniPythonParser.String_PE_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitString_PE_AST(MiniPythonParser.String_PE_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall_PE_AST(MiniPythonParser.FunctionCall_PE_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall_PE_AST(MiniPythonParser.FunctionCall_PE_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressioParen_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterExpressioParen_PE_AST(MiniPythonParser.ExpressioParen_PE_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressioParen_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitExpressioParen_PE_AST(MiniPythonParser.ExpressioParen_PE_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listExpression_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterListExpression_PE_AST(MiniPythonParser.ListExpression_PE_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listExpression_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitListExpression_PE_AST(MiniPythonParser.ListExpression_PE_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code len_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterLen_PE_AST(MiniPythonParser.Len_PE_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code len_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitLen_PE_AST(MiniPythonParser.Len_PE_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementAccess_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterElementAccess_PE_AST(MiniPythonParser.ElementAccess_PE_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementAccess_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitElementAccess_PE_AST(MiniPythonParser.ElementAccess_PE_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementAccess_AST}
	 * labeled alternative in {@link MiniPythonParser#elementAccess}.
	 * @param ctx the parse tree
	 */
	void enterElementAccess_AST(MiniPythonParser.ElementAccess_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementAccess_AST}
	 * labeled alternative in {@link MiniPythonParser#elementAccess}.
	 * @param ctx the parse tree
	 */
	void exitElementAccess_AST(MiniPythonParser.ElementAccess_ASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listExpression_AST}
	 * labeled alternative in {@link MiniPythonParser#listExpression}.
	 * @param ctx the parse tree
	 */
	void enterListExpression_AST(MiniPythonParser.ListExpression_ASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listExpression_AST}
	 * labeled alternative in {@link MiniPythonParser#listExpression}.
	 * @param ctx the parse tree
	 */
	void exitListExpression_AST(MiniPythonParser.ListExpression_ASTContext ctx);
}