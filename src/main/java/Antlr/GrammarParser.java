// Generated from C:/Users/Adrian/IdeaProjects/SearchLexer/src/main/java/Antlr\Grammar.g4 by ANTLR 4.7.2
package Antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, START=9, 
		END=10, PATH=11, FIND=12, FINDL=13, REPLACE=14, COUNT=15, LOOK_FOR=16, 
		LPAREN=17, COMMA=18, RPAREN=19, SEMICOLON=20, DOUBLECOUNT=21, EQUAL=22, 
		WS=23, DIGIT=24, ALPHA=25, FILEPATH=26;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_var_decl = 2, RULE_func_call = 3, 
		RULE_special_symbol = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "var_decl", "func_call", "special_symbol"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'^'", "'?'", "'<'", "'>'", "'|'", "'*'", "'['", "']'", "'Start'", 
			"'End'", "'path'", "'find'", "'findLine'", "'replace'", "'count'", "'lookFor'", 
			"'('", "','", "')'", "';'", "'\"'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "START", "END", 
			"PATH", "FIND", "FINDL", "REPLACE", "COUNT", "LOOK_FOR", "LPAREN", "COMMA", 
			"RPAREN", "SEMICOLON", "DOUBLECOUNT", "EQUAL", "WS", "DIGIT", "ALPHA", 
			"FILEPATH"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(GrammarParser.START, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(START);
			setState(11);
			statement();
			setState(12);
			match(END);
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

	public static class StatementContext extends ParserRuleContext {
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<Func_callContext> func_call() {
			return getRuleContexts(Func_callContext.class);
		}
		public Func_callContext func_call(int i) {
			return getRuleContext(Func_callContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				var_decl();
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIND) | (1L << FINDL) | (1L << REPLACE) | (1L << COUNT) | (1L << LOOK_FOR))) != 0)) {
					{
					{
					setState(15);
					func_call();
					}
					}
					setState(20);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PATH );
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

	public static class Var_declContext extends ParserRuleContext {
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	 
		public Var_declContext() { }
		public void copyFrom(Var_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FilePathDeclarationContext extends Var_declContext {
		public TerminalNode PATH() { return getToken(GrammarParser.PATH, 0); }
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public List<TerminalNode> DOUBLECOUNT() { return getTokens(GrammarParser.DOUBLECOUNT); }
		public TerminalNode DOUBLECOUNT(int i) {
			return getToken(GrammarParser.DOUBLECOUNT, i);
		}
		public TerminalNode FILEPATH() { return getToken(GrammarParser.FILEPATH, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public FilePathDeclarationContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFilePathDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFilePathDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFilePathDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			_localctx = new FilePathDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(PATH);
			setState(26);
			match(EQUAL);
			setState(27);
			match(DOUBLECOUNT);
			setState(28);
			match(FILEPATH);
			setState(29);
			match(DOUBLECOUNT);
			setState(30);
			match(SEMICOLON);
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

	public static class Func_callContext extends ParserRuleContext {
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
	 
		public Func_callContext() { }
		public void copyFrom(Func_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LookFunctionContext extends Func_callContext {
		public TerminalNode LOOK_FOR() { return getToken(GrammarParser.LOOK_FOR, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public List<TerminalNode> ALPHA() { return getTokens(GrammarParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(GrammarParser.ALPHA, i);
		}
		public List<Special_symbolContext> special_symbol() {
			return getRuleContexts(Special_symbolContext.class);
		}
		public Special_symbolContext special_symbol(int i) {
			return getRuleContext(Special_symbolContext.class,i);
		}
		public LookFunctionContext(Func_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLookFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLookFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLookFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CountFunctionContext extends Func_callContext {
		public TerminalNode COUNT() { return getToken(GrammarParser.COUNT, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public CountFunctionContext(Func_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCountFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCountFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCountFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FindFunctionContext extends Func_callContext {
		public TerminalNode FIND() { return getToken(GrammarParser.FIND, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode ALPHA() { return getToken(GrammarParser.ALPHA, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public FindFunctionContext(Func_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFindFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFindFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFindFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReplaceFunctionContext extends Func_callContext {
		public TerminalNode REPLACE() { return getToken(GrammarParser.REPLACE, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public List<TerminalNode> ALPHA() { return getTokens(GrammarParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(GrammarParser.ALPHA, i);
		}
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public ReplaceFunctionContext(Func_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterReplaceFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitReplaceFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitReplaceFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FindLineFunctionContext extends Func_callContext {
		public TerminalNode FINDL() { return getToken(GrammarParser.FINDL, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode DIGIT() { return getToken(GrammarParser.DIGIT, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public FindLineFunctionContext(Func_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFindLineFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFindLineFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFindLineFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_call);
		int _la;
		try {
			int _alt;
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIND:
				_localctx = new FindFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(FIND);
				setState(33);
				match(LPAREN);
				setState(34);
				match(ALPHA);
				setState(35);
				match(RPAREN);
				setState(36);
				match(SEMICOLON);
				}
				break;
			case REPLACE:
				_localctx = new ReplaceFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(REPLACE);
				setState(38);
				match(LPAREN);
				setState(39);
				match(ALPHA);
				setState(40);
				match(COMMA);
				setState(41);
				match(ALPHA);
				setState(42);
				match(RPAREN);
				setState(43);
				match(SEMICOLON);
				}
				break;
			case LOOK_FOR:
				_localctx = new LookFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(LOOK_FOR);
				setState(45);
				match(LPAREN);
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
						{
						{
						setState(46);
						special_symbol();
						}
						}
						setState(51);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(52);
					match(ALPHA);
					setState(56);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(53);
							special_symbol();
							}
							} 
						}
						setState(58);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					}
					}
					}
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << ALPHA))) != 0) );
				setState(63);
				match(RPAREN);
				setState(64);
				match(SEMICOLON);
				}
				break;
			case COUNT:
				_localctx = new CountFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				match(COUNT);
				setState(66);
				match(LPAREN);
				setState(67);
				match(RPAREN);
				setState(68);
				match(SEMICOLON);
				}
				break;
			case FINDL:
				_localctx = new FindLineFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				match(FINDL);
				setState(70);
				match(LPAREN);
				setState(71);
				match(DIGIT);
				setState(72);
				match(RPAREN);
				setState(73);
				match(SEMICOLON);
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

	public static class Special_symbolContext extends ParserRuleContext {
		public Special_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSpecial_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSpecial_symbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSpecial_symbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Special_symbolContext special_symbol() throws RecognitionException {
		Special_symbolContext _localctx = new Special_symbolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_special_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\3\3\3\7\3\23\n\3\f\3\16\3"+
		"\26\13\3\6\3\30\n\3\r\3\16\3\31\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\62\n\5\f\5\16\5"+
		"\65\13\5\3\5\3\5\7\59\n\5\f\5\16\5<\13\5\6\5>\n\5\r\5\16\5?\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\2\2\7\2\4\6\b"+
		"\n\2\3\3\2\3\n\2T\2\f\3\2\2\2\4\27\3\2\2\2\6\33\3\2\2\2\bL\3\2\2\2\nN"+
		"\3\2\2\2\f\r\7\13\2\2\r\16\5\4\3\2\16\17\7\f\2\2\17\3\3\2\2\2\20\24\5"+
		"\6\4\2\21\23\5\b\5\2\22\21\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3"+
		"\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\27\20\3\2\2\2\30\31\3\2\2\2\31\27\3"+
		"\2\2\2\31\32\3\2\2\2\32\5\3\2\2\2\33\34\7\r\2\2\34\35\7\30\2\2\35\36\7"+
		"\27\2\2\36\37\7\34\2\2\37 \7\27\2\2 !\7\26\2\2!\7\3\2\2\2\"#\7\16\2\2"+
		"#$\7\23\2\2$%\7\33\2\2%&\7\25\2\2&M\7\26\2\2\'(\7\20\2\2()\7\23\2\2)*"+
		"\7\33\2\2*+\7\24\2\2+,\7\33\2\2,-\7\25\2\2-M\7\26\2\2./\7\22\2\2/=\7\23"+
		"\2\2\60\62\5\n\6\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2"+
		"\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66:\7\33\2\2\679\5\n\6\28\67\3\2\2\2"+
		"9<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;>\3\2\2\2<:\3\2\2\2=\63\3\2\2\2>?\3\2\2"+
		"\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\25\2\2BM\7\26\2\2CD\7\21\2\2DE\7"+
		"\23\2\2EF\7\25\2\2FM\7\26\2\2GH\7\17\2\2HI\7\23\2\2IJ\7\32\2\2JK\7\25"+
		"\2\2KM\7\26\2\2L\"\3\2\2\2L\'\3\2\2\2L.\3\2\2\2LC\3\2\2\2LG\3\2\2\2M\t"+
		"\3\2\2\2NO\t\2\2\2O\13\3\2\2\2\b\24\31\63:?L";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}