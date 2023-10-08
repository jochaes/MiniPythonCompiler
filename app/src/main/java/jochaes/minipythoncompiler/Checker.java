package jochaes.minipythoncompiler;

import jochaes.minipythoncompiler.CustomExeptions.*;
import jochaes.minipythoncompiler.generated.MiniPythonBaseVisitor;
import jochaes.minipythoncompiler.generated.MiniPythonParser;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class Checker extends MiniPythonBaseVisitor<Object> {

    private SymbolTable VarTable;
    private SymbolTable FunctionTable;

    private MyErrorListener errorListener;

    public Checker(MyErrorListener errorListener){

        //La tabla para las Variables
        this.VarTable = new SymbolTable();

        //La Tabla para las Funciones
        this.FunctionTable = new SymbolTable();

        this.errorListener = errorListener;
    }

    public SymbolTable getVarTable() {
        return VarTable;
    }

    public SymbolTable getFunctionTable() {
        return FunctionTable;
    }

    /************************************************************
     PROGRAM
     *************************************************************/
    @Override
    public Object visitProgram_AST(MiniPythonParser.Program_ASTContext ctx) {
        return super.visitProgram_AST(ctx);
    }

    /************************************************************
     MAIN STATEMENT Linea 30
     *************************************************************/


    /**
     * Visit a parse tree produced by {@link MiniPythonParser #mainStatement_AST}.
     * @param ctx the parse tree
     * @return
     */
    @Override
    public Object visitDef_MS_AST(MiniPythonParser.Def_MS_ASTContext ctx) {
        //Solo Visita el Def normal, acá no hace nada

        return super.visitDef_MS_AST(ctx);
    }

    @Override
    public Object visitAssign_MS_AST(MiniPythonParser.Assign_MS_ASTContext ctx) {
        //Solo Visita el Assign normal, acá no hace nada
        return super.visitAssign_MS_AST(ctx);
    }

    @Override
    public Object visitFunctionCall_MS_AST(MiniPythonParser.FunctionCall_MS_ASTContext ctx) {
        //Solo Visita el FunctionCall normal, acá no hace nada
        return super.visitFunctionCall_MS_AST(ctx);
    }

    @Override
    public Object visitPrint_MS_AST(MiniPythonParser.Print_MS_ASTContext ctx) {
        return super.visitPrint_MS_AST(ctx);
    }

    /************************************************************
     STATEMENT Linea 36
     *************************************************************/
    @Override
    public Object visitIf_ST_AST(MiniPythonParser.If_ST_ASTContext ctx) {
        return super.visitIf_ST_AST(ctx);
    }

    @Override
    public Object visitReturn_ST_AST(MiniPythonParser.Return_ST_ASTContext ctx) {

        //Visita el return statement y retorna el tipo del return:
        // 0 = integer
        // 1 = string
        // 2 = char
        // 3 = list
        // 4 = float
        // 5 = bool xq puede ser un comparison
        return (Integer) visit(ctx.returnStatement());

    }

    @Override
    public Object visitPrint_ST_AST(MiniPythonParser.Print_ST_ASTContext ctx) {
        return super.visitPrint_ST_AST(ctx);
    }

    @Override
    public Object visitWhile_ST_AST(MiniPythonParser.While_ST_ASTContext ctx) {
        return super.visitWhile_ST_AST(ctx);
    }

    @Override
    public Object visitFor_ST_AST(MiniPythonParser.For_ST_ASTContext ctx) {
        return super.visitFor_ST_AST(ctx);
    }

    /*
    Assign ST
    Notas:
        Se asigna el tipo la primera vez que se encuentra una variable
        El tipo no se puede cambiar
     */
    @Override
    public Object visitAssign_ST_AST(MiniPythonParser.Assign_ST_ASTContext ctx) {
        //Solo visita al assign normal, acá no hace nada
        return super.visitAssign_ST_AST(ctx);
    }

    /*
    Function Call ST
    Notas:
        Hay que buscar la funcion en la tabla
        Hay que revizar la cantidad de parametros e inferir los tipos
            ( Yo creo que esta inferencia es xq en tiempo de ejecucion si los tipos de adentro
            de la funcion son diferentes entonces se cae, nada hacemos con inferir los tipos de los argumentos en la definicion de la funcion)
        Los parametros son locales para la funcion
     */

    @Override
    public Object visitFunctionCall_ST_AST(MiniPythonParser.FunctionCall_ST_ASTContext ctx) {
        //Solo visita al FunctionCall normal, acá no hace nada
        return super.visitFunctionCall_ST_AST(ctx);
    }

    /************************************************************
     DEF STATEMENT Linea 46

     Notas:
     El tipo de la funcion lo da el return, si no es void (No se puede usar en un expresion)
     *************************************************************/
    @Override
    public Object visitDefStatement_AST(MiniPythonParser.DefStatement_ASTContext ctx) {

        /// TODO:   Revizar que no exista el nombre de la funcion en la tabla de funciones *
        // Todo:   Revizar que no exista el nombre de la funcion en la tabla de variables  *
        // TODO:  Revizar que los argumentos no existan en la tabla de variables           *
        // TODO: Agregar la funcion a la tabla de funciones

        //imprimimos la tabla de funciones
        //this.FunctionTable.print();

        //Abrimos un nuevo scope, para que los argumentos sean locales a la funcion
        this.VarTable.openScope();


        try{

            //Revizar que no exista el nombre de la funcion en la tabla de funciones
            if (this.FunctionTable.find(ctx.IDENTIFIER().getText()) != null){
                throw new FuncionYaExisteExeption((MiniPythonParser.DefStatement_ASTContext) ctx);
            }

            //Revizar que no exista el nombre de la funcion en la tabla de variables
            if (this.VarTable.find(ctx.IDENTIFIER().getText()) != null){
                throw new VariableYaExisteException((MiniPythonParser.DefStatement_ASTContext) ctx);
            }

            //Revizar que los argumentos no existan en la tabla de variables
            // Visitamos el ArgList, que es una lista de argumentos y agregamos cada uno a la tabla de variables como tipo indefinido
            List<TerminalNode> params = (List<TerminalNode>) visit(ctx.argList());

            //Visitamos la secuencia de statements
            //Si este sequence tiene un return, entonces el tipo de la funcion es el tipo del return
            int funType = (int) visit(ctx.sequence());


            //Agregar la funcion a la tabla de funciones
            this.FunctionTable.insert(ctx.IDENTIFIER().getSymbol(), funType, params, ctx);

        }
        catch (FuncionYaExisteExeption | VariableYaExisteException e){
            this.errorListener.addContextualError(e.toString());
            System.err.println(e.toString());
        }

        //Cerramos el scope
        this.VarTable.closeScope();

        //imprimimos la tabla de funciones
        //this.FunctionTable.print();

        return null;
    }

    /************************************************************
     ArgList Linea 48
     -Agregamos los argumentos a la tabla de variables
     -Retorna la cantidad de argumentos
     *************************************************************/
    @Override
    public Object visitArgList_AST(MiniPythonParser.ArgList_ASTContext ctx) {


        //Por defecto los argumentos son de tipo indefinido
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++){

            try {
                //Revizar que no exista el nombre de la variable en la tabla de variables
                if (this.VarTable.find(ctx.IDENTIFIER(i).getText()) != null){
                    throw new VariableYaExisteException( ctx.IDENTIFIER(i) );
                }

            }catch (VariableYaExisteException e){
                System.err.println(e.toString());
                this.errorListener.addContextualError(e.toString());
                break;
            }

            this.VarTable.insert(ctx.IDENTIFIER(i).getSymbol(), -1, ctx);  //Se agregan a la lista de variables
        }

        return ctx.IDENTIFIER();
    }

    /************************************************************
     if Statement Linea 50
     *************************************************************/
    @Override
    public Object visitIfStatement_AST(MiniPythonParser.IfStatement_ASTContext ctx) {
        return super.visitIfStatement_AST(ctx);
    }

    /************************************************************
     While Statement Linea 52
     *************************************************************/
    @Override
    public Object visitWhileStatement_AST(MiniPythonParser.WhileStatement_ASTContext ctx) {
        return super.visitWhileStatement_AST(ctx);
    }

    /************************************************************
     for in Statement Linea 54
     *************************************************************/
    @Override
    public Object visitForStatement_AST(MiniPythonParser.ForStatement_ASTContext ctx) {
        return super.visitForStatement_AST(ctx);
    }

    /************************************************************
     return Statement Linea 56
     *************************************************************/
    @Override
    public Object visitReturnStatement_AST(MiniPythonParser.ReturnStatement_ASTContext ctx) {

        int returnType = -1; //Retorna el tipo del return, si no tiene return, retorna -1

        if (ctx.expression() != null){
            returnType = (int) visit(ctx.expression());
        }

        if (ctx.comparison() != null){
            returnType = (int) visit(ctx.comparison());
        }

        return (Integer) returnType;
    }

    /************************************************************
     print Statement Linea 58
     *************************************************************/
    @Override
    public Object visitPrintStatement_AST(MiniPythonParser.PrintStatement_ASTContext ctx) {
        return super.visitPrintStatement_AST(ctx);
    }

    /************************************************************
     AssignStatement Linea 60
     *************************************************************/
    @Override
    public Object visitAssignStatement_AST(MiniPythonParser.AssignStatement_ASTContext ctx) {
        //TODO: Ver bien lo de los scopes

        //this.VarTable.print();

        try{
            //Revizar que la variable no exista en la tabla de funciones
            if (this.FunctionTable.find(ctx.IDENTIFIER().getText()) != null){
                throw new FuncionYaExisteExeption(ctx);
            }

            //Revizar que la variable exista en el la tabla de variables
            SymbolTable.VarIdent var = (SymbolTable.VarIdent) this.VarTable.find(ctx.IDENTIFIER().getText());
            //Si la variable no existe, entonces se agrega a la tabla de variables con su tipo
            if (var == null){
                int tipo = (int) visit(ctx.expression());
                this.VarTable.insert(ctx.IDENTIFIER().getSymbol(), tipo, ctx);
            }else{

                int tipo = (int) visit(ctx.expression());
                //Si la variable Existe,  y su tipo es indefinido, se define acá
                if (var.type == -1){
                    this.VarTable.updateType(ctx.IDENTIFIER().getSymbol(), tipo);
                }
                //Si la variable existe, entonces se reviza que el tipo de la variable sea igual al tipo de la expresion
                else if (var.type != tipo){
                    throw new AsignacionException(var.type, tipo, ctx.ASSIGNMENT().getSymbol());
                }
            }

        }catch (FuncionYaExisteExeption | AsignacionException | NullPointerException e){
            this.errorListener.addContextualError(e.toString());
            System.err.println(e.toString());
        }

        //this.VarTable.print();

        return null;
    }

    /************************************************************
     Function Call Linea 64
     *************************************************************/
    @Override
    public Object visitFunctionCallStatement_AST(MiniPythonParser.FunctionCallStatement_ASTContext ctx) {
        //todo: Recorrer la lista de parametros y visitar cada uno

        try {
            //Revizar que no exista el nombre de la funcion en la tabla de variables
            if (this.VarTable.find(ctx.IDENTIFIER().getText()) != null){
                throw new VariableYaExisteException(ctx);
            }

            //Buscamos la funcion en la tabla de funciones
            SymbolTable.MethodIdent temp = (SymbolTable.MethodIdent) this.FunctionTable.find(ctx.IDENTIFIER().getText());


            if (temp == null) {
                //Si no existe la funcion en la tabla de funciones, entonces tirar error
                throw new FuncionNoExisteException(ctx);
            }

            //Si existe la funcion, entonces hay que validar que tengan la misma cantidad de argumentos
            //Si no tienen la misma cantidad de argumentos, entonces tirar error
            //En expresionList se visitan todas las expresiones de la lista
            List<MiniPythonParser.ExpressionContext> parametrosMetodo = (List<MiniPythonParser.ExpressionContext>) visit(ctx.expressionList());

            //Visitar todas las expresiones de la lista
            for (int i = 0; i < parametrosMetodo.size(); i++){
                visit(parametrosMetodo.get(i));
            }

            //Todo: Aca se debe hacer la inferencia de los tipos, pero diay, no se como hacerlo XD
            if ( parametrosMetodo.size() != temp.numParams ){
                throw new DiferenteCantidadParamsException(ctx);
            }

        }catch (FuncionNoExisteException | DiferenteCantidadParamsException |VariableYaExisteException e){
            this.errorListener.addContextualError(e.toString());
            System.err.println(e.toString());
        }

        return null;
    }

    /************************************************************
     Sequence Linea 66
     *************************************************************/
    @Override
    public Object visitSequence_AST(MiniPythonParser.Sequence_ASTContext ctx) {
        int typeReturn = -1;  //Retorna el tipo de la secuencia, si no tiene return, retorna -1

        //Visitamos cada statement de la secuencia
        for (int i = 0; i < ctx.statement().size(); i++){


            if (ctx.statement(i).getText().contains("return")){
                typeReturn = (int) visit(ctx.statement(i));
            }

            visit(ctx.statement(i));

        }

        return (Integer) typeReturn;
    }

    /************************************************************
     expression Linea 68
     Notas:
     DEL DOC DEL PROYECTO:
     ..., además de que con argumentos de tipo entero, al evaluar cada operación con los 4 anteriores
     operadores, esta sea inferida como de tipo entero...
     A lo que entendí, si la expresión tiene un entero, se evalua toda a entero

     Se pueden hacer sumas de strings
     *************************************************************/
    @Override
    public Object visitExpression_AST(MiniPythonParser.Expression_ASTContext ctx) {

        int tipoRetorno = -1;

        try {
            tipoRetorno = (int) visit(ctx.primitiveExpression(0));

            int tipoTemp = -1;
            Token operador = null;

            for (int i = 1; i < ctx.primitiveExpression().size(); i++) {

                tipoTemp = (int) visit(ctx.primitiveExpression(i));

                operador = (Token) visit(ctx.expressionOperator(i - 1));

                //********* SUMAS *********
                if (operador.getType() == MiniPythonParser.PLUSSIGN) {

                    //Si es un string, entonces la suma es un string
                    if (tipoRetorno == 1 || tipoTemp == 1){
                        tipoRetorno = 1;
                    }
                    //Si es un char, entonces la suma es un string
                    else if (tipoRetorno == 2 || tipoTemp == 2){
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                    //Si es un float, entonces la suma es un float
                    else if (tipoRetorno == 4 || tipoTemp == 4){
                        tipoRetorno = 4;
                    }
                    //Si es un int, entonces la suma es un int
                    else if (tipoRetorno == 0 || tipoTemp == 0){
                        tipoRetorno = 0;
                    }
                    //Si es un bool, entonces la suma es un bool
                    else if (tipoRetorno == 5 || tipoTemp == 5){
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                    //Si es una lista, entonces la suma es una lista
                    else if (tipoRetorno == 3 || tipoTemp == 3){
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                    //Si es indefinido, entonces la suma es indefinida
                    else if (tipoRetorno == -1 || tipoTemp == -1){
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                    //Si es cualquier otra cosa, entonces la suma es indefinida
                    else {
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }

                }
                //********* RESTAS *********
                else if (operador.getType() == MiniPythonParser.MINUSSIGN) {
                    //Si es un string, entonces la suma es un string
                    if (tipoRetorno == 1 || tipoTemp == 1){
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                    //Si es un char, entonces la suma es un string
                    else if (tipoRetorno == 2 || tipoTemp == 2){
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                    //Si es un float, entonces la suma es un float
                    else if (tipoRetorno == 4 || tipoTemp == 4){
                        tipoRetorno = 4;
                    }
                    //Si es un int, entonces la suma es un int
                    else if (tipoRetorno == 0 || tipoTemp == 0){
                        tipoRetorno = 0;
                    }
                    //Si es un bool, entonces la suma es un bool
                    else if (tipoRetorno == 5 || tipoTemp == 5){
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                    //Si es una lista, entonces la suma es una lista
                    else if (tipoRetorno == 3 || tipoTemp == 3){
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                    //Si es indefinido, entonces la suma es indefinida
                    else if (tipoRetorno == -1 || tipoTemp == -1){
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                    //Si es cualquier otra cosa, entonces la suma es indefinida
                    else {
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                }
                //********* MULTIPLICACIONES *********
                else if (operador.getType() == MiniPythonParser.ASTERISK) {
                    //Si es un string, entonces la suma es un string
                    if (tipoRetorno == 1 || tipoTemp == 1){
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                    //Si es un char, entonces la suma es un string
                    else if (tipoRetorno == 2 || tipoTemp == 2){
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                    //Si es un float, entonces la suma es un float
                    else if (tipoRetorno == 4 || tipoTemp == 4){
                        tipoRetorno = 4;
                    }
                    //Si es un int, entonces la suma es un int
                    else if (tipoRetorno == 0 || tipoTemp == 0){
                        tipoRetorno = 0;
                    }
                    //Si es un bool, entonces la suma es un bool
                    else if (tipoRetorno == 5 || tipoTemp == 5){
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                    //Si es una lista, entonces la suma es una lista
                    else if (tipoRetorno == 3 || tipoTemp == 3){
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                    //Si es indefinido, entonces la suma es indefinida
                    else if (tipoRetorno == -1 || tipoTemp == -1){
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                    //Si es cualquier otra cosa, entonces la suma es indefinida
                    else {
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                }
                //********* DIVISIONES *********
                else if (operador.getType() == MiniPythonParser.SLASH) {
                    //Si es un string, entonces la suma es un string
                    if (tipoRetorno == 1 || tipoTemp == 1){
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                    //Si es un char, entonces la suma es un string
                    else if (tipoRetorno == 2 || tipoTemp == 2){
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                    //Si es un float, entonces la suma es un float
                    else if (tipoRetorno == 4 || tipoTemp == 4){
                        tipoRetorno = 4;
                    }
                    //Si es un int, entonces la suma es un int
                    else if (tipoRetorno == 0 || tipoTemp == 0){
                        tipoRetorno = 0;
                    }
                    //Si es un bool, entonces la suma es un bool
                    else if (tipoRetorno == 5 || tipoTemp == 5){
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                    //Si es una lista, entonces la suma es una lista
                    else if (tipoRetorno == 3 || tipoTemp == 3){
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                    //Si es indefinido, entonces la suma es indefinida
                    else if (tipoRetorno == -1 || tipoTemp == -1){
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                    //Si es cualquier otra cosa, entonces la suma es indefinida
                    else {
                        throw new TiposException(tipoRetorno, tipoTemp, operador);
                    }
                } else {
                    throw new OperadorNoExisteException(operador);

                }

            }
        }catch (OperadorNoExisteException | TiposException e){
            this.errorListener.addContextualError(e.toString());
            System.err.println(e.toString());
        }



        return (Integer) tipoRetorno;

    }

    /************************************************************
     Expression Operator Linea 70
     *************************************************************/
    @Override
    public Object visitAddition_EO_AST(MiniPythonParser.Addition_EO_ASTContext ctx) {
        return ctx.PLUSSIGN().getSymbol();

    }

    @Override
    public Object visitSubstraction_EO_AST(MiniPythonParser.Substraction_EO_ASTContext ctx) {

        return  ctx.MINUSSIGN().getSymbol();
    }

    @Override
    public Object visitMultiplication_EO_AST(MiniPythonParser.Multiplication_EO_ASTContext ctx) {
        return ctx.ASTERISK().getSymbol();
    }

    @Override
    public Object visitDivision_EO_AST(MiniPythonParser.Division_EO_ASTContext ctx) {
        return ctx.SLASH().getSymbol();
    }

    /************************************************************
     Comparison Linea 76
     Notas:
     Los tipos de los operandos debe ser igual (Osea hay que tirar error si son diferentes)
     Los tipos permitidos son integer y char (Si es de otro tipo tira otro tipo de error)

     *************************************************************/
    @Override
    public Object visitComparison_AST(MiniPythonParser.Comparison_ASTContext ctx) {


        int tipoRetorno = -1;

        try {
            tipoRetorno = (int) visit(ctx.expression(0));

            int tipoTemp = (int) visit(ctx.expression(1));
            Token operador = (Token) visit(ctx.comparisonOperator());



            //********* < *********
            if (operador.getType() == MiniPythonParser.LESSTHAN) {
                //Los Dos son Enteros
                if (tipoRetorno == 0 && tipoTemp == 0){
                    tipoRetorno = 5;
                }
                //Los dos son char
                else if (tipoRetorno == 2 && tipoTemp == 2){
                    tipoRetorno = 5;
                }
                //Si es cualquier otra cosa, entonces se lanza error
                else {
                    throw new TiposException(tipoRetorno, tipoTemp, operador);
                }
            }

            //********* > *********
            else if (operador.getType() == MiniPythonParser.GREATERTHAN) {
                //Los Dos son Enteros
                if (tipoRetorno == 0 && tipoTemp == 0){
                    tipoRetorno = 5;
                }
                //Los dos son char
                else if (tipoRetorno == 2 && tipoTemp == 2){
                    tipoRetorno = 5;
                }
                //Si es cualquier otra cosa, entonces se lanza error
                else {
                    throw new TiposException(tipoRetorno, tipoTemp, operador);
                }
            }

            //********* <= *********
            else if (operador.getType() == MiniPythonParser.LESSTHANEQUAL) {
                //Los Dos son Enteros
                if (tipoRetorno == 0 && tipoTemp == 0){
                    tipoRetorno = 5;
                }
                //Los dos son char
                else if (tipoRetorno == 2 && tipoTemp == 2){
                    tipoRetorno = 5;
                }
                //Si es cualquier otra cosa, entonces se lanza error
                else {
                    throw new TiposException(tipoRetorno, tipoTemp, operador);
                }
            }

            //********* >= *********
            else if (operador.getType() == MiniPythonParser.GREATERTHANEQUAL) {
                //Los Dos son Enteros
                if (tipoRetorno == 0 && tipoTemp == 0){
                    tipoRetorno = 5;
                }
                //Los dos son char
                else if (tipoRetorno == 2 && tipoTemp == 2){
                    tipoRetorno = 5;
                }
                //Si es cualquier otra cosa, entonces se lanza error
                else {
                    throw new TiposException(tipoRetorno, tipoTemp, operador);
                }
            }

            //********* == *********
            else if (operador.getType() == MiniPythonParser.COMPARISON) {
                //Los Dos son Enteros
                if (tipoRetorno == 0 && tipoTemp == 0){
                    tipoRetorno = 5;
                }
                //Los dos son char
                else if (tipoRetorno == 2 && tipoTemp == 2){
                    tipoRetorno = 5;
                }
                //Si es cualquier otra cosa, entonces se lanza error
                else {
                    throw new TiposException(tipoRetorno, tipoTemp, operador);
                }

            }

            //********* != *********
            else if (operador.getType() == MiniPythonParser.NOTEQUAL) {
                //Los Dos son Enteros
                if (tipoRetorno == 0 && tipoTemp == 0){
                    tipoRetorno = 5;
                }
                //Los dos son char
                else if (tipoRetorno == 2 && tipoTemp == 2){
                    tipoRetorno = 5;
                }
                //Si es cualquier otra cosa, entonces se lanza error
                else {
                    throw new TiposException(tipoRetorno, tipoTemp, operador);
                }

            }
            else {
                throw new OperadorNoExisteException(operador);
            }


        }catch (OperadorNoExisteException | TiposException e){
            this.errorListener.addContextualError(e.toString());
            System.err.println(e.toString());
        }

        return (Integer) tipoRetorno;
    }

    /************************************************************
     Comparison Operator Linea 78
     *************************************************************/
    @Override
    public Object visitLessThan_CO_AST(MiniPythonParser.LessThan_CO_ASTContext ctx) {
        return ctx.LESSTHAN().getSymbol();

    }

    @Override
    public Object visitGreaterThan_CO_AST(MiniPythonParser.GreaterThan_CO_ASTContext ctx) {
        return ctx.GREATERTHAN().getSymbol();
    }

    @Override
    public Object visitLessThanEqual_CO_AST(MiniPythonParser.LessThanEqual_CO_ASTContext ctx) {
        return ctx.LESSTHANEQUAL().getSymbol();
    }

    @Override
    public Object visitGreaterThanEqual_CO_AST(MiniPythonParser.GreaterThanEqual_CO_ASTContext ctx) {
        return ctx.GREATERTHANEQUAL().getSymbol();
    }

    @Override
    public Object visitComparison_CO_AST(MiniPythonParser.Comparison_CO_ASTContext ctx) {
        return ctx.COMPARISON().getSymbol();
    }

    @Override
    public Object visitNotEqual_CO_AST(MiniPythonParser.NotEqual_CO_ASTContext ctx) {
        return ctx.NOTEQUAL().getSymbol();
    }

    /************************************************************
     Expression List Linea 86
     Se retorna la lista de expresiones si todo sale bien
     el que lo llame tiene que visitar los nodos de la lista

     *************************************************************/
    @Override
    public Object visitExpressionList_AST(MiniPythonParser.ExpressionList_ASTContext ctx) {

        return ctx.expression();

    }

    /************************************************************
     Primitive Expression  Linea 88
     *************************************************************/
    @Override
    public Object visitInteger_PE_AST(MiniPythonParser.Integer_PE_ASTContext ctx) {
        return 0;
    }

    @Override
    public Object visitFloat_PE_AST(MiniPythonParser.Float_PE_ASTContext ctx) {
        return 4;
    }

    @Override
    public Object visitIdentifier_PE_AST(MiniPythonParser.Identifier_PE_ASTContext ctx) {
        //Acá es una variable, entonces hay que buscarla en la tabla de variables
        //Si no existe, entonces tirar error
        //Si existe, entonces retornar el tipo de la variable

        //Solo para validar que el identificador no sea una funcion
        try{
            if (this.FunctionTable.find(ctx.IDENTIFIER().getText()) != null){
                throw new FuncionYaExisteExeption(ctx);
            }
        }catch (FuncionYaExisteExeption e){
            this.errorListener.addContextualError(e.toString());
            System.err.println(e.toString());
        }

        //Buscamos la variable en la tabla de variables
        SymbolTable.Ident temp = this.VarTable.find(ctx.IDENTIFIER().getText());

        //Si no existe la variable en la tabla de variables
        //se considera como indefinida
        //TODO: Es una pregunta, si no existe entonces se debe agregar a la tabla variables o chao?
        //TODO: Si temp es null deberia dar error de variable no existe

        if (temp == null){
            return -1;
        }else {
            return temp.type;
        }

    }

    @Override
    public Object visitChar_PE_AST(MiniPythonParser.Char_PE_ASTContext ctx) {
        return 2;
    }

    @Override
    public Object visitString_PE_AST(MiniPythonParser.String_PE_ASTContext ctx) {
        return 1;
    }

    @Override
    public Object visitFunctionCall_PE_AST(MiniPythonParser.FunctionCall_PE_ASTContext ctx) {
        int functionType = -1; //Retorna el tipo de la funcion, si no tiene return, retorna -1


        try {
            //Revizar que no exista el nombre de la funcion en la tabla de variables
            if (this.VarTable.find(ctx.IDENTIFIER().getText()) != null){
                throw new VariableYaExisteException(ctx);
            }

            //Buscamos la funcion en la tabla de funciones
            SymbolTable.MethodIdent temp = (SymbolTable.MethodIdent) this.FunctionTable.find(ctx.IDENTIFIER().getText());


            if (temp == null) {
                //Si no existe la funcion en la tabla de funciones, entonces tirar error
                throw new FuncionNoExisteException(ctx);
            }

            //Si existe la funcion, entonces hay que validar que tengan la misma cantidad de argumentos
            //Si no tienen la misma cantidad de argumentos, entonces tirar error
            //En expresionList se visitan todas las expresiones de la lista
            List<MiniPythonParser.ExpressionContext> parametrosMetodo = (List<MiniPythonParser.ExpressionContext>) visit(ctx.expressionList());

            //Visitar todas las expresiones de la lista
            for (int i = 0; i < parametrosMetodo.size(); i++){
                visit(parametrosMetodo.get(i));
            }

            //Todo: Aca se debe hacer la inferencia de los tipos, pero diay, no se como hacerlo XD
            if ( parametrosMetodo.size() != temp.numParams ){
                throw new DiferenteCantidadParamsException(ctx);
            }

            //retorna el tipo de la funcion
            functionType = temp.type;

        }catch (FuncionNoExisteException | DiferenteCantidadParamsException |VariableYaExisteException e){
            this.errorListener.addContextualError(e.toString());
            System.err.println(e.toString());
        }
        return functionType;
    }

    @Override
    public Object visitExpressioParen_PE_AST(MiniPythonParser.ExpressioParen_PE_ASTContext ctx) {
        //Retorna el Valor de la expresion
        return visit(ctx.expression());
    }

    @Override
    public Object visitListExpression_PE_AST(MiniPythonParser.ListExpression_PE_ASTContext ctx) {

        //Visita el list expression y retorna el tipo de la lista
        int tipo = (int) visit(ctx.listExpression());
        return tipo;

    }

    @Override
    public Object visitLen_PE_AST(MiniPythonParser.Len_PE_ASTContext ctx) {
        //TODO: DEBE recibir listas o strings, o identificadores que sean listas o strings
        //Por el momento no verifica eso solo retorna el tipo de la funcion que es entero
        //HAY QUE MODIFICAR EL G4 PARA QUE SEA (IDENTIFICADOR| STRING | LISTEXPRESSION)
        visit(ctx.expression());
        return 0;

    }

    @Override
    public Object visitElementAccess_PE_AST(MiniPythonParser.ElementAccess_PE_ASTContext ctx) {
        //TODO: Deberia retornar el tipo del elemento de la lista, pero retorna indefinido por defecto


        try{
            //Validar que el identificador no exista en la tabla de funciones
            if (this.FunctionTable.find(ctx.IDENTIFIER().getText()) != null){
                throw new FuncionYaExisteExeption(ctx);
            }

            //Validar que el identificador exista en la tabla de variables
            SymbolTable.Ident temp = this.VarTable.find(ctx.IDENTIFIER().getText());

            if (temp == null){
                throw new VariableNoExisteException(ctx);
            }

            //Revizar que el tipo de la variable sea lista
            if (temp.type != 3){
                throw new TiposException(ctx);
            }

            //Visitar las expresiones que se encuentra dentro del corchete
            for (int i = 0; i < ctx.expression().size(); i++){
                visit(ctx.expression(i));
            }

        }catch (FuncionYaExisteExeption | VariableNoExisteException | TiposException e){
            this.errorListener.addContextualError(e.toString());
            System.err.println(e.toString());
        }


        return -1;
    }

    /************************************************************
     List Expression Linea 100
     *************************************************************/
    @Override
    public Object visitListExpression_AST(MiniPythonParser.ListExpression_ASTContext ctx) {

        int listType = 3;
        try {
            //Por defecto el tipo de la lista es lista (3)


            //Validar que todos los elementos de la lista sean del mismo tipo
            //Si no son del mismo tipo, entonces tirar error
            //Si todos son del mismo tipo, entonces retornar el tipo de la lista
            List<MiniPythonParser.ExpressionContext> parametrosMetodo = (List<MiniPythonParser.ExpressionContext>) visit(ctx.expressionList());

            int tipoInicial = (int) visit(parametrosMetodo.get(0));

            //Visitar todas las expresiones de la lista
            for (int i = 1; i < parametrosMetodo.size(); i++) {
                //Aca lo visita y retorna el tipo
                if (tipoInicial != (int) visit(parametrosMetodo.get(i))){
                    throw new TiposException(ctx);
                }
            }


        }catch (TiposException e){
            this.errorListener.addContextualError(e.toString());
            System.err.println(e.toString());
        }

        return (Integer) listType;

    }
}
