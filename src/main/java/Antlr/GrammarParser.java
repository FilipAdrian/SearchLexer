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
		END=10, PATH=11, FIND=12, FINDL=13, FINDR=14, REPLACE=15, COUNT=16, LOOK_FOR=17, 
		LPAREN=18, COMMA=19, RPAREN=20, SEMICOLON=21, DOUBLECOUNT=22, EQUAL=23, 
		WS=24, WHITE_SPACE=25, DIGIT=26, ALPHA=27, FILEPATH=28, ANY=29;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_var_decl = 2, RULE_func_call = 3, 
		RULE_standard_func_name = 4, RULE_special_symbol = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "var_decl", "func_call", "standard_func_name", 
			"special_symbol"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'^'", "'?'", "'<'", "'>'", "'|'", "'*'", "'['", "']'", "'Start'", 
			"'End'", "'path'", "'find'", "'findL'", "'findR'", "'replace'", "'count'", 
			"'lookFor'", "'('", "','", "')'", "';'", "'\"'", "'='", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "START", "END", 
			"PATH", "FIND", "FINDL", "FINDR", "REPLACE", "COUNT", "LOOK_FOR", "LPAREN", 
			"COMMA", "RPAREN", "SEMICOLON", "DOUBLECOUNT", "EQUAL", "WS", "WHITE_SPACE", 
			"DIGIT", "ALPHA", "FILEPATH", "ANY"
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
			setState(12);
			match(START);
			setState(13);
			statement();
			setState(14);
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
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				var_decl();
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIND) | (1L << FINDL) | (1L << FINDR) | (1L << REPLACE) | (1L << COUNT) | (1L << LOOK_FOR))) != 0)) {
					{
					{
					setState(17);
					func_call();
					}
					}
					setState(22);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(25); 
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
		public TerminalNode PATH() { return getToken(GrammarParser.PATH, 0); }
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public List<TerminalNode> DOUBLECOUNT() { return getTokens(GrammarParser.DOUBLECOUNT); }
		public TerminalNode DOUBLECOUNT(int i) {
			return getToken(GrammarParser.DOUBLECOUNT, i);
		}
		public TerminalNode FILEPATH() { return getToken(GrammarParser.FILEPATH, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(PATH);
			setState(28);
			match(EQUAL);
			setState(29);
			match(DOUBLECOUNT);
			setState(30);
			match(FILEPATH);
			setState(31);
			match(DOUBLECOUNT);
			setState(32);
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
		public List<TerminalNode> WHITE_SPACE() { return getTokens(GrammarParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(GrammarParser.WHITE_SPACE, i);
		}
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
	public static class StandardFunctionContext extends Func_callContext {
		public Standard_func_nameContext standard_func_name() {
			return getRuleContext(Standard_func_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode ALPHA() { return getToken(GrammarParser.ALPHA, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public StandardFunctionContext(Func_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStandardFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStandardFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStandardFunction(this);
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
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIND:
			case FINDR:
				_localctx = new StandardFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				standard_func_name();
				setState(35);
				match(LPAREN);
				setState(36);
				match(ALPHA);
				setState(37);
				match(RPAREN);
				setState(38);
				match(SEMICOLON);
				}
				break;
			case REPLACE:
				_localctx = new ReplaceFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(REPLACE);
				setState(41);
				match(LPAREN);
				setState(42);
				match(ALPHA);
				setState(43);
				match(COMMA);
				setState(44);
				match(ALPHA);
				setState(45);
				match(RPAREN);
				setState(46);
				match(SEMICOLON);
				}
				break;
			case LOOK_FOR:
				_localctx = new LookFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(LOOK_FOR);
				setState(48);
				match(LPAREN);
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
						{
						{
						setState(49);
						special_symbol();
						}
						}
						setState(54);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(55);
					match(ALPHA);
					setState(59);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(56);
							special_symbol();
							}
							} 
						}
						setState(61);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					}
					}
					}
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << ALPHA))) != 0) );
				setState(66);
				match(RPAREN);
				setState(67);
				match(SEMICOLON);
				}
				break;
			case COUNT:
				_localctx = new CountFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(COUNT);
				setState(69);
				match(LPAREN);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(70);
					match(WHITE_SPACE);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(76);
				match(RPAREN);
				setState(77);
				match(SEMICOLON);
				}
				break;
			case FINDL:
				_localctx = new FindLineFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				match(FINDL);
				setState(79);
				match(LPAREN);
				setState(80);
				match(DIGIT);
				setState(81);
				match(RPAREN);
				setState(82);
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

	public static class Standard_func_nameContext extends ParserRuleContext {
		public TerminalNode FIND() { return getToken(GrammarParser.FIND, 0); }
		public TerminalNode FINDR() { return getToken(GrammarParser.FINDR, 0); }
		public Standard_func_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standard_func_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStandard_func_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStandard_func_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStandard_func_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Standard_func_nameContext standard_func_name() throws RecognitionException {
		Standard_func_nameContext _localctx = new Standard_func_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_standard_func_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==FIND || _la==FINDR) ) {
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
		enterRule(_localctx, 10, RULE_special_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\\\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\3\3\3\7\3\25\n"+
		"\3\f\3\16\3\30\13\3\6\3\32\n\3\r\3\16\3\33\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\65"+
		"\n\5\f\5\16\58\13\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\6\5A\n\5\r\5\16\5"+
		"B\3\5\3\5\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5V\n\5\3\6\3\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\4\4\2\16\16\20\20"+
		"\3\2\3\n\2_\2\16\3\2\2\2\4\31\3\2\2\2\6\35\3\2\2\2\bU\3\2\2\2\nW\3\2\2"+
		"\2\fY\3\2\2\2\16\17\7\13\2\2\17\20\5\4\3\2\20\21\7\f\2\2\21\3\3\2\2\2"+
		"\22\26\5\6\4\2\23\25\5\b\5\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2"+
		"\26\27\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\31\22\3\2\2\2\32\33\3\2\2\2"+
		"\33\31\3\2\2\2\33\34\3\2\2\2\34\5\3\2\2\2\35\36\7\r\2\2\36\37\7\31\2\2"+
		"\37 \7\30\2\2 !\7\36\2\2!\"\7\30\2\2\"#\7\27\2\2#\7\3\2\2\2$%\5\n\6\2"+
		"%&\7\24\2\2&\'\7\35\2\2\'(\7\26\2\2()\7\27\2\2)V\3\2\2\2*+\7\21\2\2+,"+
		"\7\24\2\2,-\7\35\2\2-.\7\25\2\2./\7\35\2\2/\60\7\26\2\2\60V\7\27\2\2\61"+
		"\62\7\23\2\2\62@\7\24\2\2\63\65\5\f\7\2\64\63\3\2\2\2\658\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29=\7\35\2\2:<\5\f\7\2;:"+
		"\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>A\3\2\2\2?=\3\2\2\2@\66\3\2\2\2"+
		"AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\26\2\2EV\7\27\2\2FG\7\22"+
		"\2\2GK\7\24\2\2HJ\7\33\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3"+
		"\2\2\2MK\3\2\2\2NO\7\26\2\2OV\7\27\2\2PQ\7\17\2\2QR\7\24\2\2RS\7\34\2"+
		"\2ST\7\26\2\2TV\7\27\2\2U$\3\2\2\2U*\3\2\2\2U\61\3\2\2\2UF\3\2\2\2UP\3"+
		"\2\2\2V\t\3\2\2\2WX\t\2\2\2X\13\3\2\2\2YZ\t\3\2\2Z\r\3\2\2\2\t\26\33\66"+
		"=BKU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}