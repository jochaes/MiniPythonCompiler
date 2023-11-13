package jochaes.minipythoncompiler

import jochaes.minipythoncompiler.generated.*
import jochaes.minipythoncompiler.BytecodeStorage;
class GeneradorBytecode( var bytecodeStorage: BytecodeStorage): MiniPythonBaseVisitor<Unit>() {


    //    Para Guardar el Bytecode:
    //    bytecodeStorage.addBytecode("Bytecode")

    var esLocal = false
    var tieneRetorno = false

    var variablesLocales = mutableListOf<String>()
    var variablesGlobales = mutableListOf<String>()

    override fun visitProgram_AST(ctx: MiniPythonParser.Program_ASTContext?) {
        super.visitProgram_AST(ctx)
        bytecodeStorage.addBytecode("END")
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

        //Solo es local cuando esta dentro de una funcion
        esLocal = true
        bytecodeStorage.addBytecode("DEF " + ctx?.IDENTIFIER().toString())
        //Visitar arglist

        //visitar sequence
        super.visitDefStatement_AST(ctx)

        if(!tieneRetorno && !ctx?.IDENTIFIER().toString().equals("Main")){
            bytecodeStorage.addBytecode("RETURN")
        }

        tieneRetorno = false
        esLocal = false
        variablesLocales.clear() //Limpiar las variables locales
    }

    override fun visitArgList_AST(ctx: MiniPythonParser.ArgList_ASTContext?) {


        super.visitArgList_AST(ctx)
    }

    override fun visitIfStatement_AST(ctx: MiniPythonParser.IfStatement_ASTContext?) {

        if (ctx?.expression() != null) {
            visit(ctx.expression())
        } else {
            visit(ctx!!.comparison())
        }

        bytecodeStorage.addBytecode("JUMP_IF_FALSE " + 0); //0 es una dirección fantasma que luego debe cambiarse
        var numLine = bytecodeStorage.getSize()-1

        visit(ctx.sequence(0));
        // ifStatement: IF (expression|comparison) COLON sequence ELSE COLON sequence

        if(ctx.sequence(1) != null){
            bytecodeStorage.addBytecode("JUMP_ABSOLUTE " + 0);
            //devuelvase a cambiar la dirección que ya conoce
            bytecodeStorage.set(numLine, "JUMP_IF_FALSE " + bytecodeStorage.getSize());
            numLine = bytecodeStorage.getSize()-1;
            visit(ctx.sequence(1));
            bytecodeStorage.set(numLine, "JUMP_ABSOLUTE " + bytecodeStorage.getSize());
        } else {
            bytecodeStorage.set(numLine, "JUMP_IF_FALSE " + bytecodeStorage.getSize());
        }

        //super.visitIfStatement_AST(ctx)
    }

    override fun visitWhileStatement_AST(ctx: MiniPythonParser.WhileStatement_ASTContext?) {
// Etiqueta para el inicio del bucle
        var antesDelBucle = bytecodeStorage.getSize()

        // Visita y evalúa la condición
        // Cuerpo del bucle
        if (ctx?.expression() != null) {
            visit(ctx.expression())
        } else {
            visit(ctx!!.comparison())
        }

        var numLine = bytecodeStorage.getSize()

        bytecodeStorage.addBytecode("JUMP_IF_FALSE " + 0);

        visit(ctx?.sequence())

        // Salto de regreso al inicio del bucle
        bytecodeStorage.addBytecode("JUMP_ABSOLUTE " + antesDelBucle);

        bytecodeStorage.set(numLine,"JUMP_IF_FALSE " + bytecodeStorage.getSize() );

//        return null;

//        super.visitWhileStatement_AST(ctx)
    }

    override fun visitForStatement_AST(ctx: MiniPythonParser.ForStatement_ASTContext?) {
        super.visitForStatement_AST(ctx)
    }

    override fun visitReturnStatement_AST(ctx: MiniPythonParser.ReturnStatement_ASTContext?) {


        if (ctx?.expression() != null ) {
            visit(ctx.expression())
            bytecodeStorage.addBytecode("RETURN_VALUE")

        } else if (ctx?.comparison() != null){
            visit(ctx!!.comparison())
            bytecodeStorage.addBytecode("RETURN_VALUE")
        } else {
            bytecodeStorage.addBytecode("RETURN ")
        }

        tieneRetorno = true

        //super.visitReturnStatement_AST(ctx)
    }

    override fun visitPrintStatement_AST(ctx: MiniPythonParser.PrintStatement_ASTContext?) {
        visit(ctx!!.expression())
        bytecodeStorage.addBytecode("LOAD_GLOBAL print" )
        bytecodeStorage.addBytecode("CALL_FUNCTION 1")
        null
    }

    override fun visitAssignStatement_AST(ctx: MiniPythonParser.AssignStatement_ASTContext?) {
// assignStatement: IDENTIFIER ASSIGNMENT (expression|comparison) NEWLINE                  #assignStatement_AST;

        //Primero verificar si esta dentro de una funcion


        if (ctx?.elementAccess() != null){


            visit(ctx.elementAccess()); //Esto saca el idex y el array

            if (ctx?.expression() != null) { //Esto saca el value
                visit(ctx.expression())
            } else {
                visit(ctx!!.comparison())
            }

            bytecodeStorage.addBytecode("STORE_SUBSCR" )


        }else{

            if(esLocal && !variablesLocales.contains(ctx?.IDENTIFIER().toString())){

                bytecodeStorage.addBytecode("PUSH_LOCAL " + ctx?.IDENTIFIER().toString())
                variablesLocales.add(ctx?.IDENTIFIER().toString())
            }

            if (!esLocal && !variablesGlobales.contains(ctx?.IDENTIFIER().toString())) {
                bytecodeStorage.addBytecode("PUSH_GLOBAL " + ctx?.IDENTIFIER().toString())
                variablesGlobales.add(ctx?.IDENTIFIER().toString())
            }


            if (ctx?.expression() != null) {
                visit(ctx.expression())
            } else {
                visit(ctx!!.comparison())
            }

            bytecodeStorage.addBytecode("STORE_FAST " + ctx.IDENTIFIER().toString())

        }

    }

    override fun visitFunctionCallStatement_AST(ctx: MiniPythonParser.FunctionCallStatement_ASTContext?) {

        //Visitar todos los argumentos (LOAD_CONST)
        //Visitar la funcion (LOAD_GLOBAL)
        //Llamar a la funcion (CALL
        var numParams = 0
        if( ctx?.expressionList() != null){
            numParams = (Int) visit(ctx.expressionList())
            visit(ctx.expressionList())
        }

        bytecodeStorage.addBytecode("LOAD_GLOBAL " + ctx?.IDENTIFIER())
        bytecodeStorage.addBytecode("CALL_FUNCTION " + numParams)

    }

    override fun visitSequence_AST(ctx: MiniPythonParser.Sequence_ASTContext?) {
        super.visitSequence_AST(ctx)
    }

    override fun visitExpression_AST(ctx: MiniPythonParser.Expression_ASTContext?) {
        //expression: primitiveExpression (expressionOperator primitiveExpression)*  #expression_AST;

        visit(ctx!!.primitiveExpression(0))


        for (i in 0 until ctx.expressionOperator().size) {
            visit(ctx.primitiveExpression(i + 1))
            visit(ctx.expressionOperator(i))
        }


        //super.visitExpression_AST(ctx)
    }

    override fun visitAddition_EO_AST(ctx: MiniPythonParser.Addition_EO_ASTContext?) {
        bytecodeStorage.addBytecode("BINARY_ADD")
        super.visitAddition_EO_AST(ctx)
    }

    override fun visitSubstraction_EO_AST(ctx: MiniPythonParser.Substraction_EO_ASTContext?) {
        bytecodeStorage.addBytecode("BINARY_SUBSTRACT")
        super.visitSubstraction_EO_AST(ctx)
    }

    override fun visitMultiplication_EO_AST(ctx: MiniPythonParser.Multiplication_EO_ASTContext?) {
        bytecodeStorage.addBytecode("BINARY_MULTIPLY")
        super.visitMultiplication_EO_AST(ctx)
    }

    override fun visitDivision_EO_AST(ctx: MiniPythonParser.Division_EO_ASTContext?) {
        bytecodeStorage.addBytecode("BINARY_DIVIDE")
        super.visitDivision_EO_AST(ctx)
    }

    override fun visitComparison_AST(ctx: MiniPythonParser.Comparison_ASTContext?) {

        //comparison: (expression comparisonOperator expression | OPENPARENTHESIS expression comparisonOperator expression CLOSEPARENTHESIS ) #comparison_AST;
        //Visitar todos los expression


        for (i in 0 until ctx?.expression()?.size!!) {
            visit(ctx.expression(i))
        }

        visit(ctx.comparisonOperator())

        //super.visitComparison_AST(ctx)
    }

    override fun visitLessThan_CO_AST(ctx: MiniPythonParser.LessThan_CO_ASTContext?) {
        bytecodeStorage.addBytecode("COMPARE_OP "+ ctx?.LESSTHAN().toString())
        //super.visitLessThan_CO_AST(ctx)
    }

    override fun visitGreaterThan_CO_AST(ctx: MiniPythonParser.GreaterThan_CO_ASTContext?) {
        bytecodeStorage.addBytecode("COMPARE_OP "+ ctx?.GREATERTHAN().toString())
//        super.visitGreaterThan_CO_AST(ctx)
    }

    override fun visitLessThanEqual_CO_AST(ctx: MiniPythonParser.LessThanEqual_CO_ASTContext?) {
        bytecodeStorage.addBytecode("COMPARE_OP "+ ctx?.LESSTHANEQUAL().toString())
//        super.visitLessThanEqual_CO_AST(ctx)
    }

    override fun visitGreaterThanEqual_CO_AST(ctx: MiniPythonParser.GreaterThanEqual_CO_ASTContext?) {
        bytecodeStorage.addBytecode("COMPARE_OP "+ ctx?.GREATERTHANEQUAL().toString())
//        super.visitGreaterThanEqual_CO_AST(ctx)
    }

    override fun visitComparison_CO_AST(ctx: MiniPythonParser.Comparison_CO_ASTContext?) {
        bytecodeStorage.addBytecode("COMPARE_OP "+ ctx?.COMPARISON().toString())
//        super.visitComparison_CO_AST(ctx)
    }

    override fun visitNotEqual_CO_AST(ctx: MiniPythonParser.NotEqual_CO_ASTContext?) {
        bytecodeStorage.addBytecode("COMPARE_OP "+ ctx?.NOTEQUAL().toString())
//        super.visitNotEqual_CO_AST(ctx)
    }

    override fun visitExpressionList_AST(ctx: MiniPythonParser.ExpressionList_ASTContext?){

        for (i in 0 until ctx?.expression()?.size!!) {
            visit(ctx.expression(i))
        }

    }

    override fun visitInteger_PE_AST(ctx: MiniPythonParser.Integer_PE_ASTContext?) {
        bytecodeStorage.addBytecode("LOAD_CONST " + ctx?.INTEGER().toString())

        super.visitInteger_PE_AST(ctx)
    }

    override fun visitFloat_PE_AST(ctx: MiniPythonParser.Float_PE_ASTContext?) {
        bytecodeStorage.addBytecode("LOAD_CONST " + ctx?.FLOAT().toString())
        super.visitFloat_PE_AST(ctx)
    }

    override fun visitIdentifier_PE_AST(ctx: MiniPythonParser.Identifier_PE_ASTContext?) {
        bytecodeStorage.addBytecode("LOAD_FAST " + ctx?.IDENTIFIER().toString())
        super.visitIdentifier_PE_AST(ctx)
    }

    override fun visitChar_PE_AST(ctx: MiniPythonParser.Char_PE_ASTContext?) {
        bytecodeStorage.addBytecode("LOAD_CONST " + ctx?.CHARCONST().toString())
        super.visitChar_PE_AST(ctx)
    }

    override fun visitString_PE_AST(ctx: MiniPythonParser.String_PE_ASTContext?) {
        bytecodeStorage.addBytecode("LOAD_CONST " + ctx?.STRING().toString())
        super.visitString_PE_AST(ctx)
    }

    override fun visitFunctionCall_PE_AST(ctx: MiniPythonParser.FunctionCall_PE_ASTContext?) {


        //Visitar todos los argumentos (LOAD_CONST)
        //Visitar la funcion (LOAD_GLOBAL)
        //Llamar a la funcion (CALL
        var numParams = 0
        if( ctx?.expressionList() != null){
            numParams = (Int) visit(ctx.expressionList())
            visit(ctx.expressionList())
        }

        bytecodeStorage.addBytecode("LOAD_GLOBAL " + ctx?.IDENTIFIER())
        bytecodeStorage.addBytecode("CALL_FUNCTION " + numParams)
//        super.visitFunctionCall_PE_AST(ctx)
    }

    override fun visitExpressioParen_PE_AST(ctx: MiniPythonParser.ExpressioParen_PE_ASTContext?) {
        super.visitExpressioParen_PE_AST(ctx)
    }

    override fun visitListExpression_PE_AST(ctx: MiniPythonParser.ListExpression_PE_ASTContext?) {

        super.visitListExpression_PE_AST(ctx)
    }

    override fun visitLen_PE_AST(ctx: MiniPythonParser.Len_PE_ASTContext?) {

        visit(ctx?.expression())
        bytecodeStorage.addBytecode("LIST_LEN")

        //super.visitLen_PE_AST(ctx)
    }

    override fun visitElementAccess_PE_AST(ctx: MiniPythonParser.ElementAccess_PE_ASTContext?) {

        visit(ctx?.elementAccess())

        bytecodeStorage.addBytecode("BINARY_SUBSCR")

        //super.visitElementAccess_PE_AST(ctx)
    }

    override fun visitElementAccess_AST(ctx: MiniPythonParser.ElementAccess_ASTContext?) {

        //Saca el indeice
        visit(ctx?.expression(0))

        bytecodeStorage.addBytecode("LOAD_FAST " + ctx?.IDENTIFIER().toString())

        //Saca el arrau
        //super.visitElementAccess_AST(ctx)
    }

    override fun visitListExpression_AST(ctx: MiniPythonParser.ListExpression_ASTContext?) {

        //Visitra cada elemento de expression lists
        //Build list de len de expresionlist

        var numParams = 0
        if( ctx?.expressionList() != null){
            numParams = (Int) visit(ctx.expressionList())
            visit(ctx.expressionList())
        }

        bytecodeStorage.addBytecode("BUILD_LIST " + numParams)


        //super.visitListExpression_AST(ctx)
    }
}

private infix fun Any.visit(expressionList: MiniPythonParser.ExpressionListContext?): Int {

    var numParams = 0
    for (i in 0 until expressionList?.childCount!!) {
        if (expressionList.getChild(i).text != ",") {
            numParams++

        }
    }
    return numParams
}
