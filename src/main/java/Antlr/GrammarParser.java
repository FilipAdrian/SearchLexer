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
		SPECIAL_SYMBOL=1, FORMAT=2, CHANGE=3, CHANGE_BY_NUMBER_FORMAT=4, CHANGE_BY_DATE_FORMAT=5, 
		START=6, PREFIX=7, SUFFIX=8, FRAGMENT=9, END=10, PATH=11, FIND=12, FINDL=13, 
		REPLACE=14, COUNT=15, LOOK_FOR=16, LPAREN=17, COMMA=18, RPAREN=19, SEMICOLON=20, 
		DOUBLECOUNT=21, EQUAL=22, WS=23, White=24, DIGIT=25, LETTER=26, SYMBOLS=27;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_var_decl = 2, RULE_func_call = 3, 
		RULE_find = 4, RULE_expr = 5, RULE_lookFor = 6, RULE_change = 7, RULE_alpha = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "var_decl", "func_call", "find", "expr", "lookFor", 
			"change", "alpha"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'.format'", "'change'", "'.numberFormat'", "'.dateFormat'", 
			"'Start'", "'.byPrefix'", "'.bySuffix'", "'.byFragment'", "'End'", "'path'", 
			"'find'", "'findLine'", "'replace'", "'count'", "'lookFor'", "'('", "','", 
			"')'", "';'", "'\"'", "'='", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPECIAL_SYMBOL", "FORMAT", "CHANGE", "CHANGE_BY_NUMBER_FORMAT", 
			"CHANGE_BY_DATE_FORMAT", "START", "PREFIX", "SUFFIX", "FRAGMENT", "END", 
			"PATH", "FIND", "FINDL", "REPLACE", "COUNT", "LOOK_FOR", "LPAREN", "COMMA", 
			"RPAREN", "SEMICOLON", "DOUBLECOUNT", "EQUAL", "WS", "White", "DIGIT", 
			"LETTER", "SYMBOLS"
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
			setState(18);
			match(START);
			setState(19);
			statement();
			setState(20);
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
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				var_decl();
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHANGE) | (1L << FIND) | (1L << FINDL) | (1L << REPLACE) | (1L << COUNT) | (1L << LOOK_FOR))) != 0)) {
					{
					{
					setState(23);
					func_call();
					}
					}
					setState(28);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(31); 
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
		public AlphaContext alpha() {
			return getRuleContext(AlphaContext.class,0);
		}
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
			setState(33);
			match(PATH);
			setState(34);
			match(EQUAL);
			setState(35);
			match(DOUBLECOUNT);
			setState(36);
			alpha();
			setState(37);
			match(DOUBLECOUNT);
			setState(38);
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
		public LookForContext lookFor() {
			return getRuleContext(LookForContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		public FindContext find() {
			return getRuleContext(FindContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public AlphaContext alpha() {
			return getRuleContext(AlphaContext.class,0);
		}
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
	public static class ChangeFormatContext extends Func_callContext {
		public ChangeContext change() {
			return getRuleContext(ChangeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> White() { return getTokens(GrammarParser.White); }
		public TerminalNode White(int i) {
			return getToken(GrammarParser.White, i);
		}
		public ChangeFormatContext(Func_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterChangeFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitChangeFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitChangeFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReplaceFunctionContext extends Func_callContext {
		public TerminalNode REPLACE() { return getToken(GrammarParser.REPLACE, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public List<AlphaContext> alpha() {
			return getRuleContexts(AlphaContext.class);
		}
		public AlphaContext alpha(int i) {
			return getRuleContext(AlphaContext.class,i);
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
		public AlphaContext alpha() {
			return getRuleContext(AlphaContext.class,0);
		}
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
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIND:
				_localctx = new FindFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				find();
				setState(41);
				match(LPAREN);
				setState(42);
				alpha();
				setState(43);
				match(RPAREN);
				setState(44);
				match(SEMICOLON);
				}
				break;
			case REPLACE:
				_localctx = new ReplaceFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(REPLACE);
				setState(47);
				match(LPAREN);
				setState(48);
				alpha();
				setState(49);
				match(COMMA);
				setState(50);
				alpha();
				setState(51);
				match(RPAREN);
				setState(52);
				match(SEMICOLON);
				}
				break;
			case LOOK_FOR:
				_localctx = new LookFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				lookFor();
				setState(55);
				match(LPAREN);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPECIAL_SYMBOL) | (1L << DIGIT) | (1L << LETTER) | (1L << SYMBOLS))) != 0)) {
					{
					{
					setState(56);
					expr();
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				match(RPAREN);
				setState(63);
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
				alpha();
				setState(72);
				match(RPAREN);
				setState(73);
				match(SEMICOLON);
				}
				break;
			case CHANGE:
				_localctx = new ChangeFormatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				change();
				setState(76);
				match(LPAREN);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPECIAL_SYMBOL) | (1L << DIGIT) | (1L << LETTER) | (1L << SYMBOLS))) != 0)) {
					{
					{
					setState(77);
					expr();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(COMMA);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPECIAL_SYMBOL) | (1L << White) | (1L << DIGIT) | (1L << LETTER) | (1L << SYMBOLS))) != 0)) {
					{
					setState(86);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SPECIAL_SYMBOL:
					case DIGIT:
					case LETTER:
					case SYMBOLS:
						{
						setState(84);
						expr();
						}
						break;
					case White:
						{
						setState(85);
						match(White);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				match(RPAREN);
				setState(92);
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

	public static class FindContext extends ParserRuleContext {
		public FindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_find; }
	 
		public FindContext() { }
		public void copyFrom(FindContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FindWholeFunctionContext extends FindContext {
		public TerminalNode FIND() { return getToken(GrammarParser.FIND, 0); }
		public FindWholeFunctionContext(FindContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFindWholeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFindWholeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFindWholeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FindByPrefixContext extends FindContext {
		public TerminalNode FIND() { return getToken(GrammarParser.FIND, 0); }
		public TerminalNode PREFIX() { return getToken(GrammarParser.PREFIX, 0); }
		public FindByPrefixContext(FindContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFindByPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFindByPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFindByPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FindByFragmentContext extends FindContext {
		public TerminalNode FIND() { return getToken(GrammarParser.FIND, 0); }
		public TerminalNode FRAGMENT() { return getToken(GrammarParser.FRAGMENT, 0); }
		public FindByFragmentContext(FindContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFindByFragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFindByFragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFindByFragment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FindBySyffixContext extends FindContext {
		public TerminalNode FIND() { return getToken(GrammarParser.FIND, 0); }
		public TerminalNode SUFFIX() { return getToken(GrammarParser.SUFFIX, 0); }
		public FindBySyffixContext(FindContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFindBySyffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFindBySyffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFindBySyffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FindContext find() throws RecognitionException {
		FindContext _localctx = new FindContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_find);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new FindWholeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(FIND);
				}
				break;
			case 2:
				_localctx = new FindByPrefixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(FIND);
				setState(98);
				match(PREFIX);
				}
				break;
			case 3:
				_localctx = new FindBySyffixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(FIND);
				setState(100);
				match(SUFFIX);
				}
				break;
			case 4:
				_localctx = new FindByFragmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(FIND);
				setState(102);
				match(FRAGMENT);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode SPECIAL_SYMBOL() { return getToken(GrammarParser.SPECIAL_SYMBOL, 0); }
		public AlphaContext alpha() {
			return getRuleContext(AlphaContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPECIAL_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(SPECIAL_SYMBOL);
				}
				break;
			case DIGIT:
			case LETTER:
			case SYMBOLS:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				alpha();
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

	public static class LookForContext extends ParserRuleContext {
		public TerminalNode LOOK_FOR() { return getToken(GrammarParser.LOOK_FOR, 0); }
		public TerminalNode FORMAT() { return getToken(GrammarParser.FORMAT, 0); }
		public LookForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lookFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLookFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLookFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLookFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LookForContext lookFor() throws RecognitionException {
		LookForContext _localctx = new LookForContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lookFor);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(LOOK_FOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(LOOK_FOR);
				setState(111);
				match(FORMAT);
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

	public static class ChangeContext extends ParserRuleContext {
		public TerminalNode CHANGE() { return getToken(GrammarParser.CHANGE, 0); }
		public TerminalNode CHANGE_BY_NUMBER_FORMAT() { return getToken(GrammarParser.CHANGE_BY_NUMBER_FORMAT, 0); }
		public TerminalNode CHANGE_BY_DATE_FORMAT() { return getToken(GrammarParser.CHANGE_BY_DATE_FORMAT, 0); }
		public ChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterChange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitChange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChangeContext change() throws RecognitionException {
		ChangeContext _localctx = new ChangeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_change);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(CHANGE);
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==CHANGE_BY_NUMBER_FORMAT || _la==CHANGE_BY_DATE_FORMAT) ) {
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

	public static class AlphaContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(GrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GrammarParser.DIGIT, i);
		}
		public List<TerminalNode> LETTER() { return getTokens(GrammarParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(GrammarParser.LETTER, i);
		}
		public List<TerminalNode> SYMBOLS() { return getTokens(GrammarParser.SYMBOLS); }
		public TerminalNode SYMBOLS(int i) {
			return getToken(GrammarParser.SYMBOLS, i);
		}
		public AlphaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAlpha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAlpha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAlpha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphaContext alpha() throws RecognitionException {
		AlphaContext _localctx = new AlphaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_alpha);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(117);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << LETTER) | (1L << SYMBOLS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(120); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\6\3 \n\3\r\3\16\3!\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5Q\n\5\f\5\16\5T\13\5\3\5\3\5\3\5"+
		"\7\5Y\n\5\f\5\16\5\\\13\5\3\5\3\5\3\5\5\5a\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6j\n\6\3\7\3\7\5\7n\n\7\3\b\3\b\3\b\5\bs\n\b\3\t\3\t\3\t\3\n\6"+
		"\ny\n\n\r\n\16\nz\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\4\3\2\6\7\3\2\33\35"+
		"\2\u0084\2\24\3\2\2\2\4\37\3\2\2\2\6#\3\2\2\2\b`\3\2\2\2\ni\3\2\2\2\f"+
		"m\3\2\2\2\16r\3\2\2\2\20t\3\2\2\2\22x\3\2\2\2\24\25\7\b\2\2\25\26\5\4"+
		"\3\2\26\27\7\f\2\2\27\3\3\2\2\2\30\34\5\6\4\2\31\33\5\b\5\2\32\31\3\2"+
		"\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35 \3\2\2\2\36\34\3\2\2"+
		"\2\37\30\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\5\3\2\2\2#$\7\r\2"+
		"\2$%\7\30\2\2%&\7\27\2\2&\'\5\22\n\2\'(\7\27\2\2()\7\26\2\2)\7\3\2\2\2"+
		"*+\5\n\6\2+,\7\23\2\2,-\5\22\n\2-.\7\25\2\2./\7\26\2\2/a\3\2\2\2\60\61"+
		"\7\20\2\2\61\62\7\23\2\2\62\63\5\22\n\2\63\64\7\24\2\2\64\65\5\22\n\2"+
		"\65\66\7\25\2\2\66\67\7\26\2\2\67a\3\2\2\289\5\16\b\29=\7\23\2\2:<\5\f"+
		"\7\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\25"+
		"\2\2AB\7\26\2\2Ba\3\2\2\2CD\7\21\2\2DE\7\23\2\2EF\7\25\2\2Fa\7\26\2\2"+
		"GH\7\17\2\2HI\7\23\2\2IJ\5\22\n\2JK\7\25\2\2KL\7\26\2\2La\3\2\2\2MN\5"+
		"\20\t\2NR\7\23\2\2OQ\5\f\7\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S"+
		"U\3\2\2\2TR\3\2\2\2UZ\7\24\2\2VY\5\f\7\2WY\7\32\2\2XV\3\2\2\2XW\3\2\2"+
		"\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\25\2\2^_\7"+
		"\26\2\2_a\3\2\2\2`*\3\2\2\2`\60\3\2\2\2`8\3\2\2\2`C\3\2\2\2`G\3\2\2\2"+
		"`M\3\2\2\2a\t\3\2\2\2bj\7\16\2\2cd\7\16\2\2dj\7\t\2\2ef\7\16\2\2fj\7\n"+
		"\2\2gh\7\16\2\2hj\7\13\2\2ib\3\2\2\2ic\3\2\2\2ie\3\2\2\2ig\3\2\2\2j\13"+
		"\3\2\2\2kn\7\3\2\2ln\5\22\n\2mk\3\2\2\2ml\3\2\2\2n\r\3\2\2\2os\7\22\2"+
		"\2pq\7\22\2\2qs\7\4\2\2ro\3\2\2\2rp\3\2\2\2s\17\3\2\2\2tu\7\5\2\2uv\t"+
		"\2\2\2v\21\3\2\2\2wy\t\3\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{"+
		"\23\3\2\2\2\r\34!=RXZ`imrz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}