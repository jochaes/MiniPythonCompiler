package jochaes.minipythoncompiler

import jochaes.minipythoncompiler.generated.*
import jochaes.minipythoncompiler.BytecodeStorage;
class GeneradorBytecode( var bytecodeStorage: BytecodeStorage): MiniPythonBaseVisitor<Unit>() {


//    Para Guardar el Bytecode:
//    bytecodeStorage.addBytecode("Bytecode")

    override fun visitProgram_AST(ctx: MiniPythonParser.Program_ASTContext?) {

        super.visitProgram_AST(ctx)

    }

    override fun visitDef_MS_AST(ctx: MiniPythonParser.Def_MS_ASTContext?) {
        super.visitDef_MS_AST(ctx)
    }

    override fun visitAssign_MS_AST(ctx: MiniPythonParser.Assign_MS_ASTContext?) {
        super.visitAssign_MS_AST(ctx)
    }

    override fun visitFunctionCall_MS_AST(ctx: MiniPythonParser.FunctionCall_MS_ASTContext?) {
        super.visitFunctionCall_MS_AST(ctx)
    }

    override fun visitPrint_MS_AST(ctx: MiniPythonParser.Print_MS_ASTContext?) {
        super.visitPrint_MS_AST(ctx)
    }

    override fun visitIf_ST_AST(ctx: MiniPythonParser.If_ST_ASTContext?) {
        super.visitIf_ST_AST(ctx)
    }

    override fun visitReturn_ST_AST(ctx: MiniPythonParser.Return_ST_ASTContext?) {
        super.visitReturn_ST_AST(ctx)
    }

    override fun visitPrint_ST_AST(ctx: MiniPythonParser.Print_ST_ASTContext?) {
        super.visitPrint_ST_AST(ctx)
    }

    override fun visitWhile_ST_AST(ctx: MiniPythonParser.While_ST_ASTContext?) {
        super.visitWhile_ST_AST(ctx)
    }

    override fun visitFor_ST_AST(ctx: MiniPythonParser.For_ST_ASTContext?) {
        super.visitFor_ST_AST(ctx)
    }

    override fun visitAssign_ST_AST(ctx: MiniPythonParser.Assign_ST_ASTContext?) {
        super.visitAssign_ST_AST(ctx)
    }

    override fun visitFunctionCall_ST_AST(ctx: MiniPythonParser.FunctionCall_ST_ASTContext?) {
        super.visitFunctionCall_ST_AST(ctx)
    }

    override fun visitDefStatement_AST(ctx: MiniPythonParser.DefStatement_ASTContext?) {
        super.visitDefStatement_AST(ctx)
    }

    override fun visitArgList_AST(ctx: MiniPythonParser.ArgList_ASTContext?) {
        super.visitArgList_AST(ctx)
    }

    override fun visitIfStatement_AST(ctx: MiniPythonParser.IfStatement_ASTContext?) {
        super.visitIfStatement_AST(ctx)
    }

    override fun visitWhileStatement_AST(ctx: MiniPythonParser.WhileStatement_ASTContext?) {
        super.visitWhileStatement_AST(ctx)
    }

    override fun visitForStatement_AST(ctx: MiniPythonParser.ForStatement_ASTContext?) {
        super.visitForStatement_AST(ctx)
    }

    override fun visitReturnStatement_AST(ctx: MiniPythonParser.ReturnStatement_ASTContext?) {
        super.visitReturnStatement_AST(ctx)
    }

    override fun visitPrintStatement_AST(ctx: MiniPythonParser.PrintStatement_ASTContext?) {
        super.visitPrintStatement_AST(ctx)
    }

    override fun visitAssignStatement_AST(ctx: MiniPythonParser.AssignStatement_ASTContext?) {
        super.visitAssignStatement_AST(ctx)
    }

    override fun visitFunctionCallStatement_AST(ctx: MiniPythonParser.FunctionCallStatement_ASTContext?) {
        super.visitFunctionCallStatement_AST(ctx)
    }

    override fun visitSequence_AST(ctx: MiniPythonParser.Sequence_ASTContext?) {
        super.visitSequence_AST(ctx)
    }

    override fun visitExpression_AST(ctx: MiniPythonParser.Expression_ASTContext?) {
        super.visitExpression_AST(ctx)
    }

    override fun visitAddition_EO_AST(ctx: MiniPythonParser.Addition_EO_ASTContext?) {
        super.visitAddition_EO_AST(ctx)
    }

    override fun visitSubstraction_EO_AST(ctx: MiniPythonParser.Substraction_EO_ASTContext?) {
        super.visitSubstraction_EO_AST(ctx)
    }

    override fun visitMultiplication_EO_AST(ctx: MiniPythonParser.Multiplication_EO_ASTContext?) {
        super.visitMultiplication_EO_AST(ctx)
    }

    override fun visitDivision_EO_AST(ctx: MiniPythonParser.Division_EO_ASTContext?) {
        super.visitDivision_EO_AST(ctx)
    }

    override fun visitComparison_AST(ctx: MiniPythonParser.Comparison_ASTContext?) {
        super.visitComparison_AST(ctx)
    }

    override fun visitLessThan_CO_AST(ctx: MiniPythonParser.LessThan_CO_ASTContext?) {
        super.visitLessThan_CO_AST(ctx)
    }

    override fun visitGreaterThan_CO_AST(ctx: MiniPythonParser.GreaterThan_CO_ASTContext?) {
        super.visitGreaterThan_CO_AST(ctx)
    }

    override fun visitLessThanEqual_CO_AST(ctx: MiniPythonParser.LessThanEqual_CO_ASTContext?) {
        super.visitLessThanEqual_CO_AST(ctx)
    }

    override fun visitGreaterThanEqual_CO_AST(ctx: MiniPythonParser.GreaterThanEqual_CO_ASTContext?) {
        super.visitGreaterThanEqual_CO_AST(ctx)
    }

    override fun visitComparison_CO_AST(ctx: MiniPythonParser.Comparison_CO_ASTContext?) {
        super.visitComparison_CO_AST(ctx)
    }

    override fun visitNotEqual_CO_AST(ctx: MiniPythonParser.NotEqual_CO_ASTContext?) {
        super.visitNotEqual_CO_AST(ctx)
    }

    override fun visitExpressionList_AST(ctx: MiniPythonParser.ExpressionList_ASTContext?) {
        super.visitExpressionList_AST(ctx)
    }

    override fun visitInteger_PE_AST(ctx: MiniPythonParser.Integer_PE_ASTContext?) {
        super.visitInteger_PE_AST(ctx)
    }

    override fun visitFloat_PE_AST(ctx: MiniPythonParser.Float_PE_ASTContext?) {
        super.visitFloat_PE_AST(ctx)
    }

    override fun visitIdentifier_PE_AST(ctx: MiniPythonParser.Identifier_PE_ASTContext?) {
        super.visitIdentifier_PE_AST(ctx)
    }

    override fun visitChar_PE_AST(ctx: MiniPythonParser.Char_PE_ASTContext?) {
        super.visitChar_PE_AST(ctx)
    }

    override fun visitString_PE_AST(ctx: MiniPythonParser.String_PE_ASTContext?) {
        super.visitString_PE_AST(ctx)
    }

    override fun visitFunctionCall_PE_AST(ctx: MiniPythonParser.FunctionCall_PE_ASTContext?) {
        super.visitFunctionCall_PE_AST(ctx)
    }

    override fun visitExpressioParen_PE_AST(ctx: MiniPythonParser.ExpressioParen_PE_ASTContext?) {
        super.visitExpressioParen_PE_AST(ctx)
    }

    override fun visitListExpression_PE_AST(ctx: MiniPythonParser.ListExpression_PE_ASTContext?) {
        super.visitListExpression_PE_AST(ctx)
    }

    override fun visitLen_PE_AST(ctx: MiniPythonParser.Len_PE_ASTContext?) {
        super.visitLen_PE_AST(ctx)
    }

    override fun visitElementAccess_PE_AST(ctx: MiniPythonParser.ElementAccess_PE_ASTContext?) {
        super.visitElementAccess_PE_AST(ctx)
    }

    override fun visitListExpression_AST(ctx: MiniPythonParser.ListExpression_ASTContext?) {
        super.visitListExpression_AST(ctx)
    }
}