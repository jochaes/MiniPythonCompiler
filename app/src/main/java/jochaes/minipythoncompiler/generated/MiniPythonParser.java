// Generated from /Users/gilda/Desktop/Repositorios/MiniPythonCompiler/app/MiniPython.g4 by ANTLR 4.13.1
package jochaes.minipythoncompiler.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniPythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, COLON=2, OPENPARENTHESIS=3, CLOSEPARENTHESIS=4, OPENCURLYBRACE=5, 
		CLOSECURLYBRACE=6, OPENSQRBRACKET=7, CLOSESQRBRACKET=8, DOUBLEQUOTES=9, 
		SINGLEQUOTE=10, PLUSSIGN=11, MINUSSIGN=12, ASTERISK=13, SLASH=14, ASSIGNMENT=15, 
		SUBSTRACTIONASSIGNMENTOP=16, ADDITIONASSIGNMENTOP=17, LESSTHAN=18, GREATERTHAN=19, 
		LESSTHANEQUAL=20, GREATERTHANEQUAL=21, COMPARISON=22, NOTEQUAL=23, IN=24, 
		DEF=25, IF=26, WHILE=27, FOR=28, ELSE=29, NEWLINE=30, DO=31, CONST=32, 
		VAR=33, RETURN=34, PRINT=35, LEN=36, IDENTIFIER=37, INTEGER=38, FLOAT=39, 
		CHARCONST=40, STRING=41, WS=42, LINECOMMENT=43, COMMENT=44, INDENT=45, 
		DEDENT=46;
	public static final int
		RULE_program = 0, RULE_mainStatement = 1, RULE_statement = 2, RULE_defStatement = 3, 
		RULE_argList = 4, RULE_ifStatement = 5, RULE_whileStatement = 6, RULE_forStatement = 7, 
		RULE_returnStatement = 8, RULE_printStatement = 9, RULE_assignStatement = 10, 
		RULE_functionCallStatement = 11, RULE_sequence = 12, RULE_expression = 13, 
		RULE_expressionOperator = 14, RULE_comparison = 15, RULE_comparisonOperator = 16, 
		RULE_expressionList = 17, RULE_primitiveExpression = 18, RULE_listExpression = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainStatement", "statement", "defStatement", "argList", "ifStatement", 
			"whileStatement", "forStatement", "returnStatement", "printStatement", 
			"assignStatement", "functionCallStatement", "sequence", "expression", 
			"expressionOperator", "comparison", "comparisonOperator", "expressionList", 
			"primitiveExpression", "listExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "':'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'\"'", 
			"'''", "'+'", "'-'", "'*'", "'/'", "'='", "'-='", "'+='", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'in'", "'def'", "'if'", "'while'", "'for'", 
			"'else'", null, "'do'", "'const'", "'var'", "'return'", "'print'", "'len'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMA", "COLON", "OPENPARENTHESIS", "CLOSEPARENTHESIS", "OPENCURLYBRACE", 
			"CLOSECURLYBRACE", "OPENSQRBRACKET", "CLOSESQRBRACKET", "DOUBLEQUOTES", 
			"SINGLEQUOTE", "PLUSSIGN", "MINUSSIGN", "ASTERISK", "SLASH", "ASSIGNMENT", 
			"SUBSTRACTIONASSIGNMENTOP", "ADDITIONASSIGNMENTOP", "LESSTHAN", "GREATERTHAN", 
			"LESSTHANEQUAL", "GREATERTHANEQUAL", "COMPARISON", "NOTEQUAL", "IN", 
			"DEF", "IF", "WHILE", "FOR", "ELSE", "NEWLINE", "DO", "CONST", "VAR", 
			"RETURN", "PRINT", "LEN", "IDENTIFIER", "INTEGER", "FLOAT", "CHARCONST", 
			"STRING", "WS", "LINECOMMENT", "COMMENT", "INDENT", "DEDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiniPython.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniPythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Program_ASTContext extends ProgramContext {
		public List<MainStatementContext> mainStatement() {
			return getRuleContexts(MainStatementContext.class);
		}
		public MainStatementContext mainStatement(int i) {
			return getRuleContext(MainStatementContext.class,i);
		}
		public TerminalNode EOF() { return getToken(MiniPythonParser.EOF, 0); }
		public Program_ASTContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterProgram_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitProgram_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitProgram_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new Program_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
			case PRINT:
			case IDENTIFIER:
				{
				setState(40);
				mainStatement();
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 171832246272L) != 0)) {
					{
					{
					setState(41);
					mainStatement();
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EOF:
				{
				setState(47);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainStatementContext extends ParserRuleContext {
		public MainStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStatement; }
	 
		public MainStatementContext() { }
		public void copyFrom(MainStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Assign_MS_ASTContext extends MainStatementContext {
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public Assign_MS_ASTContext(MainStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterAssign_MS_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitAssign_MS_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitAssign_MS_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Def_MS_ASTContext extends MainStatementContext {
		public DefStatementContext defStatement() {
			return getRuleContext(DefStatementContext.class,0);
		}
		public Def_MS_ASTContext(MainStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterDef_MS_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitDef_MS_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitDef_MS_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Print_MS_ASTContext extends MainStatementContext {
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public Print_MS_ASTContext(MainStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterPrint_MS_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitPrint_MS_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitPrint_MS_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCall_MS_ASTContext extends MainStatementContext {
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public FunctionCall_MS_ASTContext(MainStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterFunctionCall_MS_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitFunctionCall_MS_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitFunctionCall_MS_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainStatementContext mainStatement() throws RecognitionException {
		MainStatementContext _localctx = new MainStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainStatement);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new Def_MS_ASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				defStatement();
				}
				break;
			case 2:
				_localctx = new Assign_MS_ASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				assignStatement();
				}
				break;
			case 3:
				_localctx = new FunctionCall_MS_ASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				functionCallStatement();
				}
				break;
			case 4:
				_localctx = new Print_MS_ASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				printStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class If_ST_ASTContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public If_ST_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterIf_ST_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitIf_ST_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitIf_ST_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Assign_ST_ASTContext extends StatementContext {
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public Assign_ST_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterAssign_ST_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitAssign_ST_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitAssign_ST_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCall_ST_ASTContext extends StatementContext {
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public FunctionCall_ST_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterFunctionCall_ST_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitFunctionCall_ST_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitFunctionCall_ST_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class For_ST_ASTContext extends StatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public For_ST_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterFor_ST_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitFor_ST_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitFor_ST_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Return_ST_ASTContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public Return_ST_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterReturn_ST_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitReturn_ST_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitReturn_ST_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Print_ST_ASTContext extends StatementContext {
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public Print_ST_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterPrint_ST_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitPrint_ST_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitPrint_ST_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class While_ST_ASTContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public While_ST_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterWhile_ST_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitWhile_ST_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitWhile_ST_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new If_ST_ASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				ifStatement();
				}
				break;
			case 2:
				_localctx = new Return_ST_ASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				returnStatement();
				}
				break;
			case 3:
				_localctx = new Print_ST_ASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				printStatement();
				}
				break;
			case 4:
				_localctx = new While_ST_ASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				whileStatement();
				}
				break;
			case 5:
				_localctx = new For_ST_ASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				forStatement();
				}
				break;
			case 6:
				_localctx = new Assign_ST_ASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				assignStatement();
				}
				break;
			case 7:
				_localctx = new FunctionCall_ST_ASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(62);
				functionCallStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefStatementContext extends ParserRuleContext {
		public DefStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStatement; }
	 
		public DefStatementContext() { }
		public void copyFrom(DefStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefStatement_ASTContext extends DefStatementContext {
		public TerminalNode DEF() { return getToken(MiniPythonParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniPythonParser.IDENTIFIER, 0); }
		public TerminalNode OPENPARENTHESIS() { return getToken(MiniPythonParser.OPENPARENTHESIS, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode CLOSEPARENTHESIS() { return getToken(MiniPythonParser.CLOSEPARENTHESIS, 0); }
		public TerminalNode COLON() { return getToken(MiniPythonParser.COLON, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public DefStatement_ASTContext(DefStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterDefStatement_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitDefStatement_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitDefStatement_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefStatementContext defStatement() throws RecognitionException {
		DefStatementContext _localctx = new DefStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defStatement);
		try {
			_localctx = new DefStatement_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(DEF);
			setState(66);
			match(IDENTIFIER);
			setState(67);
			match(OPENPARENTHESIS);
			setState(68);
			argList();
			setState(69);
			match(CLOSEPARENTHESIS);
			setState(70);
			match(COLON);
			setState(71);
			sequence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgListContext extends ParserRuleContext {
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
	 
		public ArgListContext() { }
		public void copyFrom(ArgListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgList_ASTContext extends ArgListContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MiniPythonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MiniPythonParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPythonParser.COMMA, i);
		}
		public ArgList_ASTContext(ArgListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterArgList_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitArgList_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitArgList_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argList);
		int _la;
		try {
			_localctx = new ArgList_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(73);
				match(IDENTIFIER);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(74);
					match(COMMA);
					setState(75);
					match(IDENTIFIER);
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatement_ASTContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(MiniPythonParser.IF, 0); }
		public List<TerminalNode> COLON() { return getTokens(MiniPythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MiniPythonParser.COLON, i);
		}
		public List<SequenceContext> sequence() {
			return getRuleContexts(SequenceContext.class);
		}
		public SequenceContext sequence(int i) {
			return getRuleContext(SequenceContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniPythonParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public IfStatement_ASTContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterIfStatement_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitIfStatement_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitIfStatement_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		try {
			_localctx = new IfStatement_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(IF);
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(84);
				expression();
				}
				break;
			case 2:
				{
				setState(85);
				comparison();
				}
				break;
			}
			setState(88);
			match(COLON);
			setState(89);
			sequence();
			setState(90);
			match(ELSE);
			setState(91);
			match(COLON);
			setState(92);
			sequence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	 
		public WhileStatementContext() { }
		public void copyFrom(WhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatement_ASTContext extends WhileStatementContext {
		public TerminalNode WHILE() { return getToken(MiniPythonParser.WHILE, 0); }
		public TerminalNode COLON() { return getToken(MiniPythonParser.COLON, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public WhileStatement_ASTContext(WhileStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterWhileStatement_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitWhileStatement_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitWhileStatement_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStatement);
		try {
			_localctx = new WhileStatement_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(WHILE);
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(95);
				expression();
				}
				break;
			case 2:
				{
				setState(96);
				comparison();
				}
				break;
			}
			setState(99);
			match(COLON);
			setState(100);
			sequence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	 
		public ForStatementContext() { }
		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatement_ASTContext extends ForStatementContext {
		public TerminalNode FOR() { return getToken(MiniPythonParser.FOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MiniPythonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MiniPythonParser.IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(MiniPythonParser.IN, 0); }
		public TerminalNode COLON() { return getToken(MiniPythonParser.COLON, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public ListExpressionContext listExpression() {
			return getRuleContext(ListExpressionContext.class,0);
		}
		public ForStatement_ASTContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterForStatement_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitForStatement_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitForStatement_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forStatement);
		try {
			_localctx = new ForStatement_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(FOR);
			setState(103);
			match(IDENTIFIER);
			setState(104);
			match(IN);
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENSQRBRACKET:
				{
				setState(105);
				listExpression();
				}
				break;
			case IDENTIFIER:
				{
				setState(106);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(109);
			match(COLON);
			setState(110);
			sequence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatement_ASTContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(MiniPythonParser.RETURN, 0); }
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ReturnStatement_ASTContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterReturnStatement_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitReturnStatement_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitReturnStatement_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStatement);
		try {
			_localctx = new ReturnStatement_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(RETURN);
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(113);
				expression();
				}
				break;
			case 2:
				{
				setState(114);
				comparison();
				}
				break;
			}
			setState(117);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	 
		public PrintStatementContext() { }
		public void copyFrom(PrintStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatement_ASTContext extends PrintStatementContext {
		public TerminalNode PRINT() { return getToken(MiniPythonParser.PRINT, 0); }
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public PrintStatement_ASTContext(PrintStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterPrintStatement_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitPrintStatement_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitPrintStatement_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printStatement);
		try {
			_localctx = new PrintStatement_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(PRINT);
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(120);
				expression();
				}
				break;
			case 2:
				{
				setState(121);
				comparison();
				}
				break;
			}
			setState(124);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatementContext extends ParserRuleContext {
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
	 
		public AssignStatementContext() { }
		public void copyFrom(AssignStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatement_ASTContext extends AssignStatementContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPythonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(MiniPythonParser.ASSIGNMENT, 0); }
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public AssignStatement_ASTContext(AssignStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterAssignStatement_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitAssignStatement_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitAssignStatement_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignStatement);
		try {
			_localctx = new AssignStatement_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(IDENTIFIER);
			setState(127);
			match(ASSIGNMENT);
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(128);
				expression();
				}
				break;
			case 2:
				{
				setState(129);
				comparison();
				}
				break;
			}
			setState(132);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallStatementContext extends ParserRuleContext {
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
	 
		public FunctionCallStatementContext() { }
		public void copyFrom(FunctionCallStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallStatement_ASTContext extends FunctionCallStatementContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPythonParser.IDENTIFIER, 0); }
		public TerminalNode OPENPARENTHESIS() { return getToken(MiniPythonParser.OPENPARENTHESIS, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode CLOSEPARENTHESIS() { return getToken(MiniPythonParser.CLOSEPARENTHESIS, 0); }
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public FunctionCallStatement_ASTContext(FunctionCallStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterFunctionCallStatement_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitFunctionCallStatement_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitFunctionCallStatement_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionCallStatement);
		try {
			_localctx = new FunctionCallStatement_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(IDENTIFIER);
			setState(135);
			match(OPENPARENTHESIS);
			setState(136);
			expressionList();
			setState(137);
			match(CLOSEPARENTHESIS);
			setState(138);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SequenceContext extends ParserRuleContext {
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
	 
		public SequenceContext() { }
		public void copyFrom(SequenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Sequence_ASTContext extends SequenceContext {
		public TerminalNode INDENT() { return getToken(MiniPythonParser.INDENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode DEDENT() { return getToken(MiniPythonParser.DEDENT, 0); }
		public Sequence_ASTContext(SequenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterSequence_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitSequence_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitSequence_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sequence);
		int _la;
		try {
			_localctx = new Sequence_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(INDENT);
			setState(141);
			statement();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 189448323072L) != 0)) {
				{
				{
				setState(142);
				statement();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_ASTContext extends ExpressionContext {
		public List<PrimitiveExpressionContext> primitiveExpression() {
			return getRuleContexts(PrimitiveExpressionContext.class);
		}
		public PrimitiveExpressionContext primitiveExpression(int i) {
			return getRuleContext(PrimitiveExpressionContext.class,i);
		}
		public List<ExpressionOperatorContext> expressionOperator() {
			return getRuleContexts(ExpressionOperatorContext.class);
		}
		public ExpressionOperatorContext expressionOperator(int i) {
			return getRuleContext(ExpressionOperatorContext.class,i);
		}
		public Expression_ASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterExpression_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitExpression_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitExpression_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		int _la;
		try {
			_localctx = new Expression_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			primitiveExpression();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) {
				{
				{
				setState(151);
				expressionOperator();
				setState(152);
				primitiveExpression();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionOperatorContext extends ParserRuleContext {
		public ExpressionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOperator; }
	 
		public ExpressionOperatorContext() { }
		public void copyFrom(ExpressionOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Addition_EO_ASTContext extends ExpressionOperatorContext {
		public TerminalNode PLUSSIGN() { return getToken(MiniPythonParser.PLUSSIGN, 0); }
		public Addition_EO_ASTContext(ExpressionOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterAddition_EO_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitAddition_EO_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitAddition_EO_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Multiplication_EO_ASTContext extends ExpressionOperatorContext {
		public TerminalNode ASTERISK() { return getToken(MiniPythonParser.ASTERISK, 0); }
		public Multiplication_EO_ASTContext(ExpressionOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterMultiplication_EO_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitMultiplication_EO_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitMultiplication_EO_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Division_EO_ASTContext extends ExpressionOperatorContext {
		public TerminalNode SLASH() { return getToken(MiniPythonParser.SLASH, 0); }
		public Division_EO_ASTContext(ExpressionOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterDivision_EO_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitDivision_EO_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitDivision_EO_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Substraction_EO_ASTContext extends ExpressionOperatorContext {
		public TerminalNode MINUSSIGN() { return getToken(MiniPythonParser.MINUSSIGN, 0); }
		public Substraction_EO_ASTContext(ExpressionOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterSubstraction_EO_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitSubstraction_EO_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitSubstraction_EO_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOperatorContext expressionOperator() throws RecognitionException {
		ExpressionOperatorContext _localctx = new ExpressionOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressionOperator);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUSSIGN:
				_localctx = new Addition_EO_ASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(PLUSSIGN);
				}
				break;
			case MINUSSIGN:
				_localctx = new Substraction_EO_ASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(MINUSSIGN);
				}
				break;
			case ASTERISK:
				_localctx = new Multiplication_EO_ASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(ASTERISK);
				}
				break;
			case SLASH:
				_localctx = new Division_EO_ASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(SLASH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	 
		public ComparisonContext() { }
		public void copyFrom(ComparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Comparison_ASTContext extends ComparisonContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public TerminalNode OPENPARENTHESIS() { return getToken(MiniPythonParser.OPENPARENTHESIS, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(MiniPythonParser.CLOSEPARENTHESIS, 0); }
		public Comparison_ASTContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterComparison_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitComparison_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitComparison_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparison);
		try {
			_localctx = new Comparison_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(165);
				expression();
				setState(166);
				comparisonOperator();
				setState(167);
				expression();
				}
				break;
			case 2:
				{
				setState(169);
				match(OPENPARENTHESIS);
				setState(170);
				expression();
				setState(171);
				comparisonOperator();
				setState(172);
				expression();
				setState(173);
				match(CLOSEPARENTHESIS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	 
		public ComparisonOperatorContext() { }
		public void copyFrom(ComparisonOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThan_CO_ASTContext extends ComparisonOperatorContext {
		public TerminalNode LESSTHAN() { return getToken(MiniPythonParser.LESSTHAN, 0); }
		public LessThan_CO_ASTContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterLessThan_CO_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitLessThan_CO_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitLessThan_CO_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqual_CO_ASTContext extends ComparisonOperatorContext {
		public TerminalNode NOTEQUAL() { return getToken(MiniPythonParser.NOTEQUAL, 0); }
		public NotEqual_CO_ASTContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterNotEqual_CO_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitNotEqual_CO_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitNotEqual_CO_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanEqual_CO_ASTContext extends ComparisonOperatorContext {
		public TerminalNode GREATERTHANEQUAL() { return getToken(MiniPythonParser.GREATERTHANEQUAL, 0); }
		public GreaterThanEqual_CO_ASTContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterGreaterThanEqual_CO_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitGreaterThanEqual_CO_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitGreaterThanEqual_CO_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanEqual_CO_ASTContext extends ComparisonOperatorContext {
		public TerminalNode LESSTHANEQUAL() { return getToken(MiniPythonParser.LESSTHANEQUAL, 0); }
		public LessThanEqual_CO_ASTContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterLessThanEqual_CO_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitLessThanEqual_CO_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitLessThanEqual_CO_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Comparison_CO_ASTContext extends ComparisonOperatorContext {
		public TerminalNode COMPARISON() { return getToken(MiniPythonParser.COMPARISON, 0); }
		public Comparison_CO_ASTContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterComparison_CO_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitComparison_CO_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitComparison_CO_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThan_CO_ASTContext extends ComparisonOperatorContext {
		public TerminalNode GREATERTHAN() { return getToken(MiniPythonParser.GREATERTHAN, 0); }
		public GreaterThan_CO_ASTContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterGreaterThan_CO_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitGreaterThan_CO_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitGreaterThan_CO_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comparisonOperator);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESSTHAN:
				_localctx = new LessThan_CO_ASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(LESSTHAN);
				}
				break;
			case GREATERTHAN:
				_localctx = new GreaterThan_CO_ASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(GREATERTHAN);
				}
				break;
			case LESSTHANEQUAL:
				_localctx = new LessThanEqual_CO_ASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(LESSTHANEQUAL);
				}
				break;
			case GREATERTHANEQUAL:
				_localctx = new GreaterThanEqual_CO_ASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				match(GREATERTHANEQUAL);
				}
				break;
			case COMPARISON:
				_localctx = new Comparison_CO_ASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				match(COMPARISON);
				}
				break;
			case NOTEQUAL:
				_localctx = new NotEqual_CO_ASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				match(NOTEQUAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	 
		public ExpressionListContext() { }
		public void copyFrom(ExpressionListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionList_ASTContext extends ExpressionListContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPythonParser.COMMA, i);
		}
		public ExpressionList_ASTContext(ExpressionListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterExpressionList_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitExpressionList_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitExpressionList_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressionList);
		int _la;
		try {
			_localctx = new ExpressionList_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4329327038600L) != 0)) {
				{
				setState(185);
				expression();
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(186);
					match(COMMA);
					setState(187);
					expression();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveExpressionContext extends ParserRuleContext {
		public PrimitiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveExpression; }
	 
		public PrimitiveExpressionContext() { }
		public void copyFrom(PrimitiveExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressioParen_PE_ASTContext extends PrimitiveExpressionContext {
		public TerminalNode OPENPARENTHESIS() { return getToken(MiniPythonParser.OPENPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEPARENTHESIS() { return getToken(MiniPythonParser.CLOSEPARENTHESIS, 0); }
		public ExpressioParen_PE_ASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterExpressioParen_PE_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitExpressioParen_PE_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitExpressioParen_PE_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementAccess_PE_ASTContext extends PrimitiveExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPythonParser.IDENTIFIER, 0); }
		public List<TerminalNode> OPENSQRBRACKET() { return getTokens(MiniPythonParser.OPENSQRBRACKET); }
		public TerminalNode OPENSQRBRACKET(int i) {
			return getToken(MiniPythonParser.OPENSQRBRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CLOSESQRBRACKET() { return getTokens(MiniPythonParser.CLOSESQRBRACKET); }
		public TerminalNode CLOSESQRBRACKET(int i) {
			return getToken(MiniPythonParser.CLOSESQRBRACKET, i);
		}
		public ElementAccess_PE_ASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterElementAccess_PE_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitElementAccess_PE_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitElementAccess_PE_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Integer_PE_ASTContext extends PrimitiveExpressionContext {
		public TerminalNode INTEGER() { return getToken(MiniPythonParser.INTEGER, 0); }
		public TerminalNode MINUSSIGN() { return getToken(MiniPythonParser.MINUSSIGN, 0); }
		public Integer_PE_ASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterInteger_PE_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitInteger_PE_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitInteger_PE_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Float_PE_ASTContext extends PrimitiveExpressionContext {
		public TerminalNode FLOAT() { return getToken(MiniPythonParser.FLOAT, 0); }
		public TerminalNode MINUSSIGN() { return getToken(MiniPythonParser.MINUSSIGN, 0); }
		public Float_PE_ASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterFloat_PE_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitFloat_PE_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitFloat_PE_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Char_PE_ASTContext extends PrimitiveExpressionContext {
		public TerminalNode CHARCONST() { return getToken(MiniPythonParser.CHARCONST, 0); }
		public Char_PE_ASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterChar_PE_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitChar_PE_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitChar_PE_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCall_PE_ASTContext extends PrimitiveExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPythonParser.IDENTIFIER, 0); }
		public TerminalNode OPENPARENTHESIS() { return getToken(MiniPythonParser.OPENPARENTHESIS, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode CLOSEPARENTHESIS() { return getToken(MiniPythonParser.CLOSEPARENTHESIS, 0); }
		public FunctionCall_PE_ASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterFunctionCall_PE_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitFunctionCall_PE_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitFunctionCall_PE_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class String_PE_ASTContext extends PrimitiveExpressionContext {
		public TerminalNode STRING() { return getToken(MiniPythonParser.STRING, 0); }
		public String_PE_ASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterString_PE_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitString_PE_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitString_PE_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Len_PE_ASTContext extends PrimitiveExpressionContext {
		public TerminalNode LEN() { return getToken(MiniPythonParser.LEN, 0); }
		public TerminalNode OPENPARENTHESIS() { return getToken(MiniPythonParser.OPENPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEPARENTHESIS() { return getToken(MiniPythonParser.CLOSEPARENTHESIS, 0); }
		public Len_PE_ASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterLen_PE_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitLen_PE_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitLen_PE_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListExpression_PE_ASTContext extends PrimitiveExpressionContext {
		public ListExpressionContext listExpression() {
			return getRuleContext(ListExpressionContext.class,0);
		}
		public ListExpression_PE_ASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterListExpression_PE_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitListExpression_PE_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitListExpression_PE_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Identifier_PE_ASTContext extends PrimitiveExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPythonParser.IDENTIFIER, 0); }
		public TerminalNode MINUSSIGN() { return getToken(MiniPythonParser.MINUSSIGN, 0); }
		public Identifier_PE_ASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterIdentifier_PE_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitIdentifier_PE_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitIdentifier_PE_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveExpressionContext primitiveExpression() throws RecognitionException {
		PrimitiveExpressionContext _localctx = new PrimitiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primitiveExpression);
		int _la;
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new Integer_PE_ASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUSSIGN) {
					{
					setState(195);
					match(MINUSSIGN);
					}
				}

				setState(198);
				match(INTEGER);
				}
				break;
			case 2:
				_localctx = new Float_PE_ASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUSSIGN) {
					{
					setState(199);
					match(MINUSSIGN);
					}
				}

				setState(202);
				match(FLOAT);
				}
				break;
			case 3:
				_localctx = new Identifier_PE_ASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUSSIGN) {
					{
					setState(203);
					match(MINUSSIGN);
					}
				}

				setState(206);
				match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new Char_PE_ASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				match(CHARCONST);
				}
				break;
			case 5:
				_localctx = new String_PE_ASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				match(STRING);
				}
				break;
			case 6:
				_localctx = new FunctionCall_PE_ASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(209);
				match(IDENTIFIER);
				{
				setState(210);
				match(OPENPARENTHESIS);
				setState(211);
				expressionList();
				setState(212);
				match(CLOSEPARENTHESIS);
				}
				}
				break;
			case 7:
				_localctx = new ExpressioParen_PE_ASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(214);
				match(OPENPARENTHESIS);
				setState(215);
				expression();
				setState(216);
				match(CLOSEPARENTHESIS);
				}
				break;
			case 8:
				_localctx = new ListExpression_PE_ASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(218);
				listExpression();
				}
				break;
			case 9:
				_localctx = new Len_PE_ASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(219);
				match(LEN);
				setState(220);
				match(OPENPARENTHESIS);
				setState(221);
				expression();
				setState(222);
				match(CLOSEPARENTHESIS);
				}
				break;
			case 10:
				_localctx = new ElementAccess_PE_ASTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(224);
				match(IDENTIFIER);
				{
				setState(225);
				match(OPENSQRBRACKET);
				setState(226);
				expression();
				setState(227);
				match(CLOSESQRBRACKET);
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPENSQRBRACKET) {
					{
					{
					setState(229);
					match(OPENSQRBRACKET);
					setState(230);
					expression();
					setState(231);
					match(CLOSESQRBRACKET);
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListExpressionContext extends ParserRuleContext {
		public ListExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpression; }
	 
		public ListExpressionContext() { }
		public void copyFrom(ListExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListExpression_ASTContext extends ListExpressionContext {
		public TerminalNode OPENSQRBRACKET() { return getToken(MiniPythonParser.OPENSQRBRACKET, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode CLOSESQRBRACKET() { return getToken(MiniPythonParser.CLOSESQRBRACKET, 0); }
		public ListExpression_ASTContext(ListExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).enterListExpression_AST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPythonListener ) ((MiniPythonListener)listener).exitListExpression_AST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPythonVisitor ) return ((MiniPythonVisitor<? extends T>)visitor).visitListExpression_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListExpressionContext listExpression() throws RecognitionException {
		ListExpressionContext _localctx = new ListExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_listExpression);
		try {
			_localctx = new ListExpression_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(OPENSQRBRACKET);
			setState(241);
			expressionList();
			setState(242);
			match(CLOSESQRBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u00f5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0005\u0000+\b\u0000"+
		"\n\u0000\f\u0000.\t\u0000\u0001\u0000\u0003\u00001\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002@\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004M\b\u0004\n\u0004\f\u0004P\t\u0004\u0003\u0004"+
		"R\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005W\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006b\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007l\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0003\bt\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0003\t{\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0083\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0090\b"+
		"\f\n\f\f\f\u0093\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u009b\b\r\n\r\f\r\u009e\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00a4\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00b0\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b8\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u00bd\b\u0011\n\u0011\f\u0011\u00c0\t\u0011"+
		"\u0003\u0011\u00c2\b\u0011\u0001\u0012\u0003\u0012\u00c5\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00c9\b\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00cd\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00ea"+
		"\b\u0012\n\u0012\f\u0012\u00ed\t\u0012\u0003\u0012\u00ef\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0000\u0014"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&\u0000\u0000\u010d\u00000\u0001\u0000\u0000\u0000\u0002"+
		"6\u0001\u0000\u0000\u0000\u0004?\u0001\u0000\u0000\u0000\u0006A\u0001"+
		"\u0000\u0000\u0000\bQ\u0001\u0000\u0000\u0000\nS\u0001\u0000\u0000\u0000"+
		"\f^\u0001\u0000\u0000\u0000\u000ef\u0001\u0000\u0000\u0000\u0010p\u0001"+
		"\u0000\u0000\u0000\u0012w\u0001\u0000\u0000\u0000\u0014~\u0001\u0000\u0000"+
		"\u0000\u0016\u0086\u0001\u0000\u0000\u0000\u0018\u008c\u0001\u0000\u0000"+
		"\u0000\u001a\u0096\u0001\u0000\u0000\u0000\u001c\u00a3\u0001\u0000\u0000"+
		"\u0000\u001e\u00af\u0001\u0000\u0000\u0000 \u00b7\u0001\u0000\u0000\u0000"+
		"\"\u00c1\u0001\u0000\u0000\u0000$\u00ee\u0001\u0000\u0000\u0000&\u00f0"+
		"\u0001\u0000\u0000\u0000(,\u0003\u0002\u0001\u0000)+\u0003\u0002\u0001"+
		"\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-1\u0001\u0000\u0000\u0000.,\u0001"+
		"\u0000\u0000\u0000/1\u0005\u0000\u0000\u00010(\u0001\u0000\u0000\u0000"+
		"0/\u0001\u0000\u0000\u00001\u0001\u0001\u0000\u0000\u000027\u0003\u0006"+
		"\u0003\u000037\u0003\u0014\n\u000047\u0003\u0016\u000b\u000057\u0003\u0012"+
		"\t\u000062\u0001\u0000\u0000\u000063\u0001\u0000\u0000\u000064\u0001\u0000"+
		"\u0000\u000065\u0001\u0000\u0000\u00007\u0003\u0001\u0000\u0000\u0000"+
		"8@\u0003\n\u0005\u00009@\u0003\u0010\b\u0000:@\u0003\u0012\t\u0000;@\u0003"+
		"\f\u0006\u0000<@\u0003\u000e\u0007\u0000=@\u0003\u0014\n\u0000>@\u0003"+
		"\u0016\u000b\u0000?8\u0001\u0000\u0000\u0000?9\u0001\u0000\u0000\u0000"+
		"?:\u0001\u0000\u0000\u0000?;\u0001\u0000\u0000\u0000?<\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@\u0005\u0001"+
		"\u0000\u0000\u0000AB\u0005\u0019\u0000\u0000BC\u0005%\u0000\u0000CD\u0005"+
		"\u0003\u0000\u0000DE\u0003\b\u0004\u0000EF\u0005\u0004\u0000\u0000FG\u0005"+
		"\u0002\u0000\u0000GH\u0003\u0018\f\u0000H\u0007\u0001\u0000\u0000\u0000"+
		"IN\u0005%\u0000\u0000JK\u0005\u0001\u0000\u0000KM\u0005%\u0000\u0000L"+
		"J\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000"+
		"\u0000\u0000QI\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R\t\u0001"+
		"\u0000\u0000\u0000SV\u0005\u001a\u0000\u0000TW\u0003\u001a\r\u0000UW\u0003"+
		"\u001e\u000f\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000XY\u0005\u0002\u0000\u0000YZ\u0003\u0018\f\u0000"+
		"Z[\u0005\u001d\u0000\u0000[\\\u0005\u0002\u0000\u0000\\]\u0003\u0018\f"+
		"\u0000]\u000b\u0001\u0000\u0000\u0000^a\u0005\u001b\u0000\u0000_b\u0003"+
		"\u001a\r\u0000`b\u0003\u001e\u000f\u0000a_\u0001\u0000\u0000\u0000a`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0005\u0002\u0000\u0000"+
		"de\u0003\u0018\f\u0000e\r\u0001\u0000\u0000\u0000fg\u0005\u001c\u0000"+
		"\u0000gh\u0005%\u0000\u0000hk\u0005\u0018\u0000\u0000il\u0003&\u0013\u0000"+
		"jl\u0005%\u0000\u0000ki\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000mn\u0005\u0002\u0000\u0000no\u0003\u0018\f\u0000"+
		"o\u000f\u0001\u0000\u0000\u0000ps\u0005\"\u0000\u0000qt\u0003\u001a\r"+
		"\u0000rt\u0003\u001e\u000f\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005\u001e\u0000\u0000v\u0011"+
		"\u0001\u0000\u0000\u0000wz\u0005#\u0000\u0000x{\u0003\u001a\r\u0000y{"+
		"\u0003\u001e\u000f\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|}\u0005\u001e\u0000\u0000}\u0013\u0001"+
		"\u0000\u0000\u0000~\u007f\u0005%\u0000\u0000\u007f\u0082\u0005\u000f\u0000"+
		"\u0000\u0080\u0083\u0003\u001a\r\u0000\u0081\u0083\u0003\u001e\u000f\u0000"+
		"\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u001e\u0000\u0000"+
		"\u0085\u0015\u0001\u0000\u0000\u0000\u0086\u0087\u0005%\u0000\u0000\u0087"+
		"\u0088\u0005\u0003\u0000\u0000\u0088\u0089\u0003\"\u0011\u0000\u0089\u008a"+
		"\u0005\u0004\u0000\u0000\u008a\u008b\u0005\u001e\u0000\u0000\u008b\u0017"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0005-\u0000\u0000\u008d\u0091\u0003"+
		"\u0004\u0002\u0000\u008e\u0090\u0003\u0004\u0002\u0000\u008f\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001"+
		"\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		".\u0000\u0000\u0095\u0019\u0001\u0000\u0000\u0000\u0096\u009c\u0003$\u0012"+
		"\u0000\u0097\u0098\u0003\u001c\u000e\u0000\u0098\u0099\u0003$\u0012\u0000"+
		"\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0097\u0001\u0000\u0000\u0000"+
		"\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u001b\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a4\u0005\u000b\u0000\u0000"+
		"\u00a0\u00a4\u0005\f\u0000\u0000\u00a1\u00a4\u0005\r\u0000\u0000\u00a2"+
		"\u00a4\u0005\u000e\u0000\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u001d\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0003\u001a\r\u0000\u00a6\u00a7\u0003 \u0010\u0000\u00a7\u00a8"+
		"\u0003\u001a\r\u0000\u00a8\u00b0\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"\u0003\u0000\u0000\u00aa\u00ab\u0003\u001a\r\u0000\u00ab\u00ac\u0003 "+
		"\u0010\u0000\u00ac\u00ad\u0003\u001a\r\u0000\u00ad\u00ae\u0005\u0004\u0000"+
		"\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00a5\u0001\u0000\u0000"+
		"\u0000\u00af\u00a9\u0001\u0000\u0000\u0000\u00b0\u001f\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b8\u0005\u0012\u0000\u0000\u00b2\u00b8\u0005\u0013\u0000"+
		"\u0000\u00b3\u00b8\u0005\u0014\u0000\u0000\u00b4\u00b8\u0005\u0015\u0000"+
		"\u0000\u00b5\u00b8\u0005\u0016\u0000\u0000\u00b6\u00b8\u0005\u0017\u0000"+
		"\u0000\u00b7\u00b1\u0001\u0000\u0000\u0000\u00b7\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b3\u0001\u0000\u0000\u0000\u00b7\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b8!\u0001\u0000\u0000\u0000\u00b9\u00be\u0003\u001a\r\u0000"+
		"\u00ba\u00bb\u0005\u0001\u0000\u0000\u00bb\u00bd\u0003\u001a\r\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1"+
		"\u00b9\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2"+
		"#\u0001\u0000\u0000\u0000\u00c3\u00c5\u0005\f\u0000\u0000\u00c4\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\u00ef\u0005&\u0000\u0000\u00c7\u00c9\u0005"+
		"\f\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00ef\u0005\'\u0000"+
		"\u0000\u00cb\u00cd\u0005\f\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u00ef\u0005%\u0000\u0000\u00cf\u00ef\u0005(\u0000\u0000\u00d0\u00ef"+
		"\u0005)\u0000\u0000\u00d1\u00d2\u0005%\u0000\u0000\u00d2\u00d3\u0005\u0003"+
		"\u0000\u0000\u00d3\u00d4\u0003\"\u0011\u0000\u00d4\u00d5\u0005\u0004\u0000"+
		"\u0000\u00d5\u00ef\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0003\u0000"+
		"\u0000\u00d7\u00d8\u0003\u001a\r\u0000\u00d8\u00d9\u0005\u0004\u0000\u0000"+
		"\u00d9\u00ef\u0001\u0000\u0000\u0000\u00da\u00ef\u0003&\u0013\u0000\u00db"+
		"\u00dc\u0005$\u0000\u0000\u00dc\u00dd\u0005\u0003\u0000\u0000\u00dd\u00de"+
		"\u0003\u001a\r\u0000\u00de\u00df\u0005\u0004\u0000\u0000\u00df\u00ef\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0005%\u0000\u0000\u00e1\u00e2\u0005\u0007"+
		"\u0000\u0000\u00e2\u00e3\u0003\u001a\r\u0000\u00e3\u00e4\u0005\b\u0000"+
		"\u0000\u00e4\u00eb\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u0007\u0000"+
		"\u0000\u00e6\u00e7\u0003\u001a\r\u0000\u00e7\u00e8\u0005\b\u0000\u0000"+
		"\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e5\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00c4\u0001\u0000\u0000\u0000"+
		"\u00ee\u00c8\u0001\u0000\u0000\u0000\u00ee\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ee\u00cf\u0001\u0000\u0000\u0000\u00ee\u00d0\u0001\u0000\u0000\u0000"+
		"\u00ee\u00d1\u0001\u0000\u0000\u0000\u00ee\u00d6\u0001\u0000\u0000\u0000"+
		"\u00ee\u00da\u0001\u0000\u0000\u0000\u00ee\u00db\u0001\u0000\u0000\u0000"+
		"\u00ee\u00e0\u0001\u0000\u0000\u0000\u00ef%\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0005\u0007\u0000\u0000\u00f1\u00f2\u0003\"\u0011\u0000\u00f2\u00f3"+
		"\u0005\b\u0000\u0000\u00f3\'\u0001\u0000\u0000\u0000\u0018,06?NQVaksz"+
		"\u0082\u0091\u009c\u00a3\u00af\u00b7\u00be\u00c1\u00c4\u00c8\u00cc\u00eb"+
		"\u00ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}