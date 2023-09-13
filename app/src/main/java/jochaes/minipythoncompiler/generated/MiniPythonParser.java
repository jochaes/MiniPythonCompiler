// Generated from /Users/gilda/Desktop/Repositorios/MiniPythonCompiler/app/MiniPython.g4 by ANTLR 4.12.0
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
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, COLON=2, OPENPARENTHESIS=3, CLOSEPARENTHESIS=4, OPENCURLYBRACE=5, 
		CLOSECURLYBRACE=6, OPENSQRBRACKET=7, CLOSESQRBRACKET=8, DOUBLEQUOTES=9, 
		SINGLEQUOTE=10, PLUSSIGN=11, MINUSSIGN=12, ASTERISK=13, SLASH=14, ASSIGNMENT=15, 
		SUBSTRACTIONASSIGNMENTOP=16, ADDITIONASSIGNMENTOP=17, LESSTHAN=18, GREATERTHAN=19, 
		LESSTHANEQUAL=20, GREATERTHANEQUAL=21, COMPARISON=22, IN=23, DEF=24, IF=25, 
		WHILE=26, FOR=27, ELSE=28, NEWLINE=29, DO=30, CONST=31, VAR=32, RETURN=33, 
		PRINT=34, LEN=35, IDENTIFIER=36, INTEGER=37, FLOAT=38, CHARCONST=39, STRING=40, 
		WS=41, LINECOMMENT=42, COMMENT=43, INDENT=44, DEDENT=45;
	public static final int
		RULE_program = 0, RULE_mainStatement = 1, RULE_statement = 2, RULE_defStatement = 3, 
		RULE_argList = 4, RULE_ifStatement = 5, RULE_whileStatement = 6, RULE_forStatement = 7, 
		RULE_returnStatement = 8, RULE_printStatement = 9, RULE_assignStatement = 10, 
		RULE_assignStatementOperator = 11, RULE_functionCallStatement = 12, RULE_expressionStatement = 13, 
		RULE_sequence = 14, RULE_expression = 15, RULE_comparison = 16, RULE_comparisonOperator = 17, 
		RULE_additionExpression = 18, RULE_additionFactor = 19, RULE_multiplicationExpression = 20, 
		RULE_multiplicationFactor = 21, RULE_elementExpression = 22, RULE_elementAccess = 23, 
		RULE_expressionList = 24, RULE_primitiveExpression = 25, RULE_listExpression = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainStatement", "statement", "defStatement", "argList", "ifStatement", 
			"whileStatement", "forStatement", "returnStatement", "printStatement", 
			"assignStatement", "assignStatementOperator", "functionCallStatement", 
			"expressionStatement", "sequence", "expression", "comparison", "comparisonOperator", 
			"additionExpression", "additionFactor", "multiplicationExpression", "multiplicationFactor", 
			"elementExpression", "elementAccess", "expressionList", "primitiveExpression", 
			"listExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "':'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'\"'", 
			"'''", "'+'", "'-'", "'*'", "'/'", "'='", "'-='", "'+='", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'in'", "'def'", "'if'", "'while'", "'for'", 
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
			"LESSTHANEQUAL", "GREATERTHANEQUAL", "COMPARISON", "IN", "DEF", "IF", 
			"WHILE", "FOR", "ELSE", "NEWLINE", "DO", "CONST", "VAR", "RETURN", "PRINT", 
			"LEN", "IDENTIFIER", "INTEGER", "FLOAT", "CHARCONST", "STRING", "WS", 
			"LINECOMMENT", "COMMENT", "INDENT", "DEDENT"
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
		public List<MainStatementContext> mainStatement() {
			return getRuleContexts(MainStatementContext.class);
		}
		public MainStatementContext mainStatement(int i) {
			return getRuleContext(MainStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			mainStatement();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF || _la==IDENTIFIER) {
				{
				{
				setState(55);
				mainStatement();
				}
				}
				setState(60);
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
	public static class MainStatementContext extends ParserRuleContext {
		public DefStatementContext defStatement() {
			return getRuleContext(DefStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public MainStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStatement; }
	}

	public final MainStatementContext mainStatement() throws RecognitionException {
		MainStatementContext _localctx = new MainStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainStatement);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				defStatement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				assignStatement();
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
	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AssignStatementOperatorContext assignStatementOperator() {
			return getRuleContext(AssignStatementOperatorContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				returnStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				printStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				assignStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(71);
				functionCallStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				expressionStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(73);
				assignStatementOperator();
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
		public DefStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStatement; }
	}

	public final DefStatementContext defStatement() throws RecognitionException {
		DefStatementContext _localctx = new DefStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(DEF);
			setState(77);
			match(IDENTIFIER);
			setState(78);
			match(OPENPARENTHESIS);
			setState(79);
			argList();
			setState(80);
			match(CLOSEPARENTHESIS);
			setState(81);
			match(COLON);
			setState(82);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(MiniPythonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MiniPythonParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPythonParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(84);
				match(IDENTIFIER);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(85);
					match(COMMA);
					setState(86);
					match(IDENTIFIER);
					}
					}
					setState(91);
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
		public TerminalNode IF() { return getToken(MiniPythonParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(IF);
			setState(95);
			expression();
			setState(96);
			match(COLON);
			setState(97);
			sequence();
			setState(98);
			match(ELSE);
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MiniPythonParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MiniPythonParser.COLON, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(WHILE);
			setState(103);
			expression();
			setState(104);
			match(COLON);
			setState(105);
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
		public TerminalNode FOR() { return getToken(MiniPythonParser.FOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IN() { return getToken(MiniPythonParser.IN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MiniPythonParser.COLON, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(FOR);
			setState(108);
			expression();
			setState(109);
			match(IN);
			setState(110);
			expressionList();
			setState(111);
			match(COLON);
			setState(112);
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
		public TerminalNode RETURN() { return getToken(MiniPythonParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(RETURN);
			setState(115);
			expression();
			setState(116);
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
		public TerminalNode PRINT() { return getToken(MiniPythonParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(PRINT);
			setState(119);
			expression();
			setState(120);
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
		public TerminalNode IDENTIFIER() { return getToken(MiniPythonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(MiniPythonParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IDENTIFIER);
			setState(123);
			match(ASSIGNMENT);
			setState(124);
			expression();
			setState(125);
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
	public static class AssignStatementOperatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPythonParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public TerminalNode SUBSTRACTIONASSIGNMENTOP() { return getToken(MiniPythonParser.SUBSTRACTIONASSIGNMENTOP, 0); }
		public TerminalNode ADDITIONASSIGNMENTOP() { return getToken(MiniPythonParser.ADDITIONASSIGNMENTOP, 0); }
		public AssignStatementOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatementOperator; }
	}

	public final AssignStatementOperatorContext assignStatementOperator() throws RecognitionException {
		AssignStatementOperatorContext _localctx = new AssignStatementOperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignStatementOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(IDENTIFIER);
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==SUBSTRACTIONASSIGNMENTOP || _la==ADDITIONASSIGNMENTOP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(129);
			expression();
			setState(130);
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
		public TerminalNode IDENTIFIER() { return getToken(MiniPythonParser.IDENTIFIER, 0); }
		public TerminalNode OPENPARENTHESIS() { return getToken(MiniPythonParser.OPENPARENTHESIS, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(IDENTIFIER);
			setState(133);
			match(OPENPARENTHESIS);
			setState(134);
			expressionList();
			setState(135);
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MiniPythonParser.NEWLINE, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			expressionList();
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
		public TerminalNode INDENT() { return getToken(MiniPythonParser.INDENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode DEDENT() { return getToken(MiniPythonParser.DEDENT, 0); }
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(INDENT);
			setState(141);
			statement();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2191205077128L) != 0)) {
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
		public AdditionExpressionContext additionExpression() {
			return getRuleContext(AdditionExpressionContext.class,0);
		}
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			additionExpression();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8126464L) != 0)) {
				{
				{
				setState(151);
				comparison();
				}
				}
				setState(156);
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
	public static class ComparisonContext extends ParserRuleContext {
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public AdditionExpressionContext additionExpression() {
			return getRuleContext(AdditionExpressionContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			comparisonOperator();
			setState(158);
			additionExpression();
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
		public TerminalNode LESSTHAN() { return getToken(MiniPythonParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(MiniPythonParser.GREATERTHAN, 0); }
		public TerminalNode LESSTHANEQUAL() { return getToken(MiniPythonParser.LESSTHANEQUAL, 0); }
		public TerminalNode GREATERTHANEQUAL() { return getToken(MiniPythonParser.GREATERTHANEQUAL, 0); }
		public TerminalNode COMPARISON() { return getToken(MiniPythonParser.COMPARISON, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8126464L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class AdditionExpressionContext extends ParserRuleContext {
		public MultiplicationExpressionContext multiplicationExpression() {
			return getRuleContext(MultiplicationExpressionContext.class,0);
		}
		public List<AdditionFactorContext> additionFactor() {
			return getRuleContexts(AdditionFactorContext.class);
		}
		public AdditionFactorContext additionFactor(int i) {
			return getRuleContext(AdditionFactorContext.class,i);
		}
		public AdditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExpression; }
	}

	public final AdditionExpressionContext additionExpression() throws RecognitionException {
		AdditionExpressionContext _localctx = new AdditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_additionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			multiplicationExpression();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUSSIGN || _la==MINUSSIGN) {
				{
				{
				setState(163);
				additionFactor();
				}
				}
				setState(168);
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
	public static class AdditionFactorContext extends ParserRuleContext {
		public MultiplicationExpressionContext multiplicationExpression() {
			return getRuleContext(MultiplicationExpressionContext.class,0);
		}
		public TerminalNode PLUSSIGN() { return getToken(MiniPythonParser.PLUSSIGN, 0); }
		public TerminalNode MINUSSIGN() { return getToken(MiniPythonParser.MINUSSIGN, 0); }
		public AdditionFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionFactor; }
	}

	public final AdditionFactorContext additionFactor() throws RecognitionException {
		AdditionFactorContext _localctx = new AdditionFactorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_additionFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==PLUSSIGN || _la==MINUSSIGN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(170);
			multiplicationExpression();
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
	public static class MultiplicationExpressionContext extends ParserRuleContext {
		public ElementExpressionContext elementExpression() {
			return getRuleContext(ElementExpressionContext.class,0);
		}
		public List<MultiplicationFactorContext> multiplicationFactor() {
			return getRuleContexts(MultiplicationFactorContext.class);
		}
		public MultiplicationFactorContext multiplicationFactor(int i) {
			return getRuleContext(MultiplicationFactorContext.class,i);
		}
		public MultiplicationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationExpression; }
	}

	public final MultiplicationExpressionContext multiplicationExpression() throws RecognitionException {
		MultiplicationExpressionContext _localctx = new MultiplicationExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multiplicationExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			elementExpression();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASTERISK || _la==SLASH) {
				{
				{
				setState(173);
				multiplicationFactor();
				}
				}
				setState(178);
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
	public static class MultiplicationFactorContext extends ParserRuleContext {
		public ElementExpressionContext elementExpression() {
			return getRuleContext(ElementExpressionContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(MiniPythonParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(MiniPythonParser.SLASH, 0); }
		public MultiplicationFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationFactor; }
	}

	public final MultiplicationFactorContext multiplicationFactor() throws RecognitionException {
		MultiplicationFactorContext _localctx = new MultiplicationFactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multiplicationFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !(_la==ASTERISK || _la==SLASH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(180);
			elementExpression();
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
	public static class ElementExpressionContext extends ParserRuleContext {
		public PrimitiveExpressionContext primitiveExpression() {
			return getRuleContext(PrimitiveExpressionContext.class,0);
		}
		public List<ElementAccessContext> elementAccess() {
			return getRuleContexts(ElementAccessContext.class);
		}
		public ElementAccessContext elementAccess(int i) {
			return getRuleContext(ElementAccessContext.class,i);
		}
		public ElementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementExpression; }
	}

	public final ElementExpressionContext elementExpression() throws RecognitionException {
		ElementExpressionContext _localctx = new ElementExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elementExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			primitiveExpression();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENSQRBRACKET) {
				{
				{
				setState(183);
				elementAccess();
				}
				}
				setState(188);
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
	public static class ElementAccessContext extends ParserRuleContext {
		public TerminalNode OPENSQRBRACKET() { return getToken(MiniPythonParser.OPENSQRBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSESQRBRACKET() { return getToken(MiniPythonParser.CLOSESQRBRACKET, 0); }
		public ElementAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAccess; }
	}

	public final ElementAccessContext elementAccess() throws RecognitionException {
		ElementAccessContext _localctx = new ElementAccessContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elementAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(OPENSQRBRACKET);
			setState(190);
			expression();
			setState(191);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
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
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2164663521416L) != 0)) {
				{
				setState(193);
				expression();
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(194);
					match(COMMA);
					setState(195);
					expression();
					}
					}
					setState(200);
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
		public TerminalNode INTEGER() { return getToken(MiniPythonParser.INTEGER, 0); }
		public TerminalNode MINUSSIGN() { return getToken(MiniPythonParser.MINUSSIGN, 0); }
		public TerminalNode FLOAT() { return getToken(MiniPythonParser.FLOAT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniPythonParser.IDENTIFIER, 0); }
		public TerminalNode CHARCONST() { return getToken(MiniPythonParser.CHARCONST, 0); }
		public TerminalNode STRING() { return getToken(MiniPythonParser.STRING, 0); }
		public TerminalNode OPENPARENTHESIS() { return getToken(MiniPythonParser.OPENPARENTHESIS, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode CLOSEPARENTHESIS() { return getToken(MiniPythonParser.CLOSEPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListExpressionContext listExpression() {
			return getRuleContext(ListExpressionContext.class,0);
		}
		public TerminalNode LEN() { return getToken(MiniPythonParser.LEN, 0); }
		public PrimitiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveExpression; }
	}

	public final PrimitiveExpressionContext primitiveExpression() throws RecognitionException {
		PrimitiveExpressionContext _localctx = new PrimitiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primitiveExpression);
		int _la;
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
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
				match(INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUSSIGN) {
					{
					setState(207);
					match(MINUSSIGN);
					}
				}

				setState(210);
				match(FLOAT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUSSIGN) {
					{
					setState(211);
					match(MINUSSIGN);
					}
				}

				setState(214);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(CHARCONST);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				match(IDENTIFIER);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPENPARENTHESIS) {
					{
					setState(218);
					match(OPENPARENTHESIS);
					setState(219);
					expressionList();
					setState(220);
					match(CLOSEPARENTHESIS);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(224);
				match(OPENPARENTHESIS);
				setState(225);
				expression();
				setState(226);
				match(CLOSEPARENTHESIS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(228);
				listExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(229);
				match(LEN);
				setState(230);
				match(OPENPARENTHESIS);
				setState(231);
				expression();
				setState(232);
				match(CLOSEPARENTHESIS);
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
		public TerminalNode OPENSQRBRACKET() { return getToken(MiniPythonParser.OPENSQRBRACKET, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode CLOSESQRBRACKET() { return getToken(MiniPythonParser.CLOSESQRBRACKET, 0); }
		public ListExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpression; }
	}

	public final ListExpressionContext listExpression() throws RecognitionException {
		ListExpressionContext _localctx = new ListExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(OPENSQRBRACKET);
			setState(237);
			expressionList();
			setState(238);
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
		"\u0004\u0001-\u00f1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0005\u00009\b\u0000\n\u0000\f\u0000<\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001@\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"K\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004X\b\u0004\n\u0004\f\u0004[\t\u0004\u0003\u0004]\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0090\b\u000e\n\u000e\f\u000e\u0093\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0099\b\u000f\n\u000f\f\u000f\u009c\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u00a5\b\u0012\n\u0012\f\u0012\u00a8\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u00af"+
		"\b\u0014\n\u0014\f\u0014\u00b2\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u00b9\b\u0016\n\u0016\f\u0016\u00bc"+
		"\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u00c5\b\u0018\n\u0018\f\u0018\u00c8\t\u0018"+
		"\u0003\u0018\u00ca\b\u0018\u0001\u0019\u0003\u0019\u00cd\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u00d1\b\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u00d5\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00df\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00eb\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0000\u0000\u001b"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.024\u0000\u0004\u0001\u0000\u0010\u0011\u0001\u0000"+
		"\u0012\u0016\u0001\u0000\u000b\f\u0001\u0000\r\u000e\u00f4\u00006\u0001"+
		"\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000\u0004J\u0001\u0000\u0000"+
		"\u0000\u0006L\u0001\u0000\u0000\u0000\b\\\u0001\u0000\u0000\u0000\n^\u0001"+
		"\u0000\u0000\u0000\ff\u0001\u0000\u0000\u0000\u000ek\u0001\u0000\u0000"+
		"\u0000\u0010r\u0001\u0000\u0000\u0000\u0012v\u0001\u0000\u0000\u0000\u0014"+
		"z\u0001\u0000\u0000\u0000\u0016\u007f\u0001\u0000\u0000\u0000\u0018\u0084"+
		"\u0001\u0000\u0000\u0000\u001a\u0089\u0001\u0000\u0000\u0000\u001c\u008c"+
		"\u0001\u0000\u0000\u0000\u001e\u0096\u0001\u0000\u0000\u0000 \u009d\u0001"+
		"\u0000\u0000\u0000\"\u00a0\u0001\u0000\u0000\u0000$\u00a2\u0001\u0000"+
		"\u0000\u0000&\u00a9\u0001\u0000\u0000\u0000(\u00ac\u0001\u0000\u0000\u0000"+
		"*\u00b3\u0001\u0000\u0000\u0000,\u00b6\u0001\u0000\u0000\u0000.\u00bd"+
		"\u0001\u0000\u0000\u00000\u00c9\u0001\u0000\u0000\u00002\u00ea\u0001\u0000"+
		"\u0000\u00004\u00ec\u0001\u0000\u0000\u00006:\u0003\u0002\u0001\u0000"+
		"79\u0003\u0002\u0001\u000087\u0001\u0000\u0000\u00009<\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;\u0001\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=@\u0003\u0006\u0003\u0000"+
		">@\u0003\u0014\n\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000"+
		"@\u0003\u0001\u0000\u0000\u0000AK\u0003\n\u0005\u0000BK\u0003\u0010\b"+
		"\u0000CK\u0003\u0012\t\u0000DK\u0003\f\u0006\u0000EK\u0003\u000e\u0007"+
		"\u0000FK\u0003\u0014\n\u0000GK\u0003\u0018\f\u0000HK\u0003\u001a\r\u0000"+
		"IK\u0003\u0016\u000b\u0000JA\u0001\u0000\u0000\u0000JB\u0001\u0000\u0000"+
		"\u0000JC\u0001\u0000\u0000\u0000JD\u0001\u0000\u0000\u0000JE\u0001\u0000"+
		"\u0000\u0000JF\u0001\u0000\u0000\u0000JG\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000K\u0005\u0001\u0000\u0000"+
		"\u0000LM\u0005\u0018\u0000\u0000MN\u0005$\u0000\u0000NO\u0005\u0003\u0000"+
		"\u0000OP\u0003\b\u0004\u0000PQ\u0005\u0004\u0000\u0000QR\u0005\u0002\u0000"+
		"\u0000RS\u0003\u001c\u000e\u0000S\u0007\u0001\u0000\u0000\u0000TY\u0005"+
		"$\u0000\u0000UV\u0005\u0001\u0000\u0000VX\u0005$\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"\\T\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\t\u0001\u0000"+
		"\u0000\u0000^_\u0005\u0019\u0000\u0000_`\u0003\u001e\u000f\u0000`a\u0005"+
		"\u0002\u0000\u0000ab\u0003\u001c\u000e\u0000bc\u0005\u001c\u0000\u0000"+
		"cd\u0005\u0002\u0000\u0000de\u0003\u001c\u000e\u0000e\u000b\u0001\u0000"+
		"\u0000\u0000fg\u0005\u001a\u0000\u0000gh\u0003\u001e\u000f\u0000hi\u0005"+
		"\u0002\u0000\u0000ij\u0003\u001c\u000e\u0000j\r\u0001\u0000\u0000\u0000"+
		"kl\u0005\u001b\u0000\u0000lm\u0003\u001e\u000f\u0000mn\u0005\u0017\u0000"+
		"\u0000no\u00030\u0018\u0000op\u0005\u0002\u0000\u0000pq\u0003\u001c\u000e"+
		"\u0000q\u000f\u0001\u0000\u0000\u0000rs\u0005!\u0000\u0000st\u0003\u001e"+
		"\u000f\u0000tu\u0005\u001d\u0000\u0000u\u0011\u0001\u0000\u0000\u0000"+
		"vw\u0005\"\u0000\u0000wx\u0003\u001e\u000f\u0000xy\u0005\u001d\u0000\u0000"+
		"y\u0013\u0001\u0000\u0000\u0000z{\u0005$\u0000\u0000{|\u0005\u000f\u0000"+
		"\u0000|}\u0003\u001e\u000f\u0000}~\u0005\u001d\u0000\u0000~\u0015\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005$\u0000\u0000\u0080\u0081\u0007\u0000"+
		"\u0000\u0000\u0081\u0082\u0003\u001e\u000f\u0000\u0082\u0083\u0005\u001d"+
		"\u0000\u0000\u0083\u0017\u0001\u0000\u0000\u0000\u0084\u0085\u0005$\u0000"+
		"\u0000\u0085\u0086\u0005\u0003\u0000\u0000\u0086\u0087\u00030\u0018\u0000"+
		"\u0087\u0088\u0005\u001d\u0000\u0000\u0088\u0019\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u00030\u0018\u0000\u008a\u008b\u0005\u001d\u0000\u0000\u008b"+
		"\u001b\u0001\u0000\u0000\u0000\u008c\u008d\u0005,\u0000\u0000\u008d\u0091"+
		"\u0003\u0004\u0002\u0000\u008e\u0090\u0003\u0004\u0002\u0000\u008f\u008e"+
		"\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094"+
		"\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005-\u0000\u0000\u0095\u001d\u0001\u0000\u0000\u0000\u0096\u009a\u0003"+
		"$\u0012\u0000\u0097\u0099\u0003 \u0010\u0000\u0098\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u001f\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0003\"\u0011\u0000"+
		"\u009e\u009f\u0003$\u0012\u0000\u009f!\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0007\u0001\u0000\u0000\u00a1#\u0001\u0000\u0000\u0000\u00a2\u00a6\u0003"+
		"(\u0014\u0000\u00a3\u00a5\u0003&\u0013\u0000\u00a4\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7%\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa\u0007\u0002\u0000\u0000"+
		"\u00aa\u00ab\u0003(\u0014\u0000\u00ab\'\u0001\u0000\u0000\u0000\u00ac"+
		"\u00b0\u0003,\u0016\u0000\u00ad\u00af\u0003*\u0015\u0000\u00ae\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1)\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b4\u0007\u0003"+
		"\u0000\u0000\u00b4\u00b5\u0003,\u0016\u0000\u00b5+\u0001\u0000\u0000\u0000"+
		"\u00b6\u00ba\u00032\u0019\u0000\u00b7\u00b9\u0003.\u0017\u0000\u00b8\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb-\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0005"+
		"\u0007\u0000\u0000\u00be\u00bf\u0003\u001e\u000f\u0000\u00bf\u00c0\u0005"+
		"\b\u0000\u0000\u00c0/\u0001\u0000\u0000\u0000\u00c1\u00c6\u0003\u001e"+
		"\u000f\u0000\u00c2\u00c3\u0005\u0001\u0000\u0000\u00c3\u00c5\u0003\u001e"+
		"\u000f\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c1\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca1\u0001\u0000\u0000\u0000\u00cb\u00cd\u0005\f\u0000"+
		"\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00eb\u0005%\u0000\u0000"+
		"\u00cf\u00d1\u0005\f\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2"+
		"\u00eb\u0005&\u0000\u0000\u00d3\u00d5\u0005\f\u0000\u0000\u00d4\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u00eb\u0005$\u0000\u0000\u00d7\u00eb\u0005"+
		"\'\u0000\u0000\u00d8\u00eb\u0005(\u0000\u0000\u00d9\u00de\u0005$\u0000"+
		"\u0000\u00da\u00db\u0005\u0003\u0000\u0000\u00db\u00dc\u00030\u0018\u0000"+
		"\u00dc\u00dd\u0005\u0004\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000"+
		"\u00de\u00da\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df\u00eb\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0003\u0000\u0000"+
		"\u00e1\u00e2\u0003\u001e\u000f\u0000\u00e2\u00e3\u0005\u0004\u0000\u0000"+
		"\u00e3\u00eb\u0001\u0000\u0000\u0000\u00e4\u00eb\u00034\u001a\u0000\u00e5"+
		"\u00e6\u0005#\u0000\u0000\u00e6\u00e7\u0005\u0003\u0000\u0000\u00e7\u00e8"+
		"\u0003\u001e\u000f\u0000\u00e8\u00e9\u0005\u0004\u0000\u0000\u00e9\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ea\u00cc\u0001\u0000\u0000\u0000\u00ea\u00d0"+
		"\u0001\u0000\u0000\u0000\u00ea\u00d4\u0001\u0000\u0000\u0000\u00ea\u00d7"+
		"\u0001\u0000\u0000\u0000\u00ea\u00d8\u0001\u0000\u0000\u0000\u00ea\u00d9"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e0\u0001\u0000\u0000\u0000\u00ea\u00e4"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e5\u0001\u0000\u0000\u0000\u00eb3\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0005\u0007\u0000\u0000\u00ed\u00ee\u0003"+
		"0\u0018\u0000\u00ee\u00ef\u0005\b\u0000\u0000\u00ef5\u0001\u0000\u0000"+
		"\u0000\u0011:?JY\\\u0091\u009a\u00a6\u00b0\u00ba\u00c6\u00c9\u00cc\u00d0"+
		"\u00d4\u00de\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}