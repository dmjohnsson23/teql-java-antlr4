// Generated from /home/dominick/OneDrive/Linux/teql-java-gradle/app/src/main/antlr/TeqlParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TeqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_AFTER=1, KW_AND=2, KW_ANY=3, KW_AT=4, KW_BEFORE=5, KW_BEGIN=6, KW_BETWEEN=7, 
		KW_CHANGE=8, KW_COMMIT=9, KW_DELETE=10, KW_END=11, KW_EVERYTHING=12, KW_FILE=13, 
		KW_FIND=14, KW_FIRST=15, KW_FROM=16, KW_IN=17, KW_INDENT=18, KW_INSERT=19, 
		KW_LAST=20, KW_LENGTH=21, KW_LINE=22, KW_NEXT=23, KW_OF=24, KW_OFFSET=25, 
		KW_OR=26, KW_REPEAT=27, KW_REPLACE=28, KW_SEEK=29, KW_SET=30, KW_SHOW=31, 
		KW_START=32, KW_SUBSTRING=33, KW_TO=34, KW_USE=35, KW_WITH=36, INT=37, 
		COMMENT=38, STR_OPEN=39, PATH=40, REGEX_OPEN=41, VAR=42, NAME=43, HYPHEN=44, 
		COLON=45, COMMA=46, DOT=47, L_PAREN=48, R_PAREN=49, SEMICOLON=50, SPACES=51, 
		STR_ESCAPE=52, STR_HEX_BYTE_2=53, STR_HEX_BYTE_1=54, STR_UNICODE_4=55, 
		STR_UNICODE_FLEX=56, STR_CLOSE=57, STR_INTERPOLATE_OPEN=58, STR_BODY=59, 
		SPACES_2=60, STR_INTERPOLATE_CLOSE=61, REGEX_ESCAPE=62, REGEX_HEX_BYTE_2=63, 
		REGEX_HEX_BYTE_1=64, REGEX_UNICODE_4=65, REGEX_UNICODE_FLEX=66, REGEX_INV_CHAR_CLASS_OPEN=67, 
		REGEX_CHAR_CLASS_OPEN=68, REGEX_NONCAP_GROUP_OPEN=69, REGEX_NAMED_CAP_GROUP_OPEN=70, 
		REGEX_CAP_GROUP_OPEN=71, REGEX_GROUP_CLOSE=72, REGEX_DOT=73, REGEX_REPEAT_STAR=74, 
		REGEX_REPEAT_PLUS=75, REGEX_OPTION=76, REGEX_REPEAT_FIXED=77, REGEX_REPEAT_MIN=78, 
		REGEX_REPEAT_MAX=79, REGEX_REPEAT_RANGE=80, REGEX_ANCHOR_START=81, REGEX_ANCHOR_END=82, 
		REGEX_OR=83, REGEX_CLOSE=84, REGEX_LITERAL=85, REGEX_CHAR_CLASS_RANGE=86, 
		REGEX_CHAR_CLASS_CLOSE=87;
	public static final int
		RULE_selector = 0, RULE_parantheticalSelector = 1, RULE_startSelector = 2, 
		RULE_endSelector = 3, RULE_seekSelector = 4, RULE_offsetSelector = 5, 
		RULE_findSelector = 6, RULE_lineSelector = 7, RULE_beforeSelector = 8, 
		RULE_afterSelector = 9, RULE_betweenSelector = 10, RULE_blockSelector = 11, 
		RULE_qualifiedSelector = 12, RULE_nestedSelector = 13, RULE_stringLiteral = 14, 
		RULE_stringLiteralInterpolation = 15, RULE_regexLiteral = 16, RULE_regexLiteralQualifier = 17, 
		RULE_regexLiteralQualifiedUnit = 18, RULE_regexLiteralUnit = 19, RULE_regexLiteralLiteral = 20, 
		RULE_regexLiteralCharRange = 21, RULE_regexLiteralCharClass = 22, RULE_regexLiteral_group = 23, 
		RULE_rangeLiteral = 24, RULE_rangeLiteralUnit = 25, RULE_rangeLiteralRelrange = 26, 
		RULE_rangeLiteralRange = 27, RULE_rangeLiteralLiteral = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"selector", "parantheticalSelector", "startSelector", "endSelector", 
			"seekSelector", "offsetSelector", "findSelector", "lineSelector", "beforeSelector", 
			"afterSelector", "betweenSelector", "blockSelector", "qualifiedSelector", 
			"nestedSelector", "stringLiteral", "stringLiteralInterpolation", "regexLiteral", 
			"regexLiteralQualifier", "regexLiteralQualifiedUnit", "regexLiteralUnit", 
			"regexLiteralLiteral", "regexLiteralCharRange", "regexLiteralCharClass", 
			"regexLiteral_group", "rangeLiteral", "rangeLiteralUnit", "rangeLiteralRelrange", 
			"rangeLiteralRange", "rangeLiteralLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'/'", null, null, null, "':'", "','", 
			null, null, null, "';'", null, null, null, null, null, null, null, "'{'", 
			null, null, "'}'", null, null, null, null, null, "'[^'", "'['", "'(?:'", 
			null, null, null, null, null, null, null, null, null, null, null, "'^'", 
			"'$'", "'|'", null, null, null, "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KW_AFTER", "KW_AND", "KW_ANY", "KW_AT", "KW_BEFORE", "KW_BEGIN", 
			"KW_BETWEEN", "KW_CHANGE", "KW_COMMIT", "KW_DELETE", "KW_END", "KW_EVERYTHING", 
			"KW_FILE", "KW_FIND", "KW_FIRST", "KW_FROM", "KW_IN", "KW_INDENT", "KW_INSERT", 
			"KW_LAST", "KW_LENGTH", "KW_LINE", "KW_NEXT", "KW_OF", "KW_OFFSET", "KW_OR", 
			"KW_REPEAT", "KW_REPLACE", "KW_SEEK", "KW_SET", "KW_SHOW", "KW_START", 
			"KW_SUBSTRING", "KW_TO", "KW_USE", "KW_WITH", "INT", "COMMENT", "STR_OPEN", 
			"PATH", "REGEX_OPEN", "VAR", "NAME", "HYPHEN", "COLON", "COMMA", "DOT", 
			"L_PAREN", "R_PAREN", "SEMICOLON", "SPACES", "STR_ESCAPE", "STR_HEX_BYTE_2", 
			"STR_HEX_BYTE_1", "STR_UNICODE_4", "STR_UNICODE_FLEX", "STR_CLOSE", "STR_INTERPOLATE_OPEN", 
			"STR_BODY", "SPACES_2", "STR_INTERPOLATE_CLOSE", "REGEX_ESCAPE", "REGEX_HEX_BYTE_2", 
			"REGEX_HEX_BYTE_1", "REGEX_UNICODE_4", "REGEX_UNICODE_FLEX", "REGEX_INV_CHAR_CLASS_OPEN", 
			"REGEX_CHAR_CLASS_OPEN", "REGEX_NONCAP_GROUP_OPEN", "REGEX_NAMED_CAP_GROUP_OPEN", 
			"REGEX_CAP_GROUP_OPEN", "REGEX_GROUP_CLOSE", "REGEX_DOT", "REGEX_REPEAT_STAR", 
			"REGEX_REPEAT_PLUS", "REGEX_OPTION", "REGEX_REPEAT_FIXED", "REGEX_REPEAT_MIN", 
			"REGEX_REPEAT_MAX", "REGEX_REPEAT_RANGE", "REGEX_ANCHOR_START", "REGEX_ANCHOR_END", 
			"REGEX_OR", "REGEX_CLOSE", "REGEX_LITERAL", "REGEX_CHAR_CLASS_RANGE", 
			"REGEX_CHAR_CLASS_CLOSE"
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
	public String getGrammarFileName() { return "TeqlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TeqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public ParantheticalSelectorContext parantheticalSelector() {
			return getRuleContext(ParantheticalSelectorContext.class,0);
		}
		public StartSelectorContext startSelector() {
			return getRuleContext(StartSelectorContext.class,0);
		}
		public EndSelectorContext endSelector() {
			return getRuleContext(EndSelectorContext.class,0);
		}
		public SeekSelectorContext seekSelector() {
			return getRuleContext(SeekSelectorContext.class,0);
		}
		public OffsetSelectorContext offsetSelector() {
			return getRuleContext(OffsetSelectorContext.class,0);
		}
		public FindSelectorContext findSelector() {
			return getRuleContext(FindSelectorContext.class,0);
		}
		public LineSelectorContext lineSelector() {
			return getRuleContext(LineSelectorContext.class,0);
		}
		public BeforeSelectorContext beforeSelector() {
			return getRuleContext(BeforeSelectorContext.class,0);
		}
		public AfterSelectorContext afterSelector() {
			return getRuleContext(AfterSelectorContext.class,0);
		}
		public BetweenSelectorContext betweenSelector() {
			return getRuleContext(BetweenSelectorContext.class,0);
		}
		public BlockSelectorContext blockSelector() {
			return getRuleContext(BlockSelectorContext.class,0);
		}
		public QualifiedSelectorContext qualifiedSelector() {
			return getRuleContext(QualifiedSelectorContext.class,0);
		}
		public NestedSelectorContext nestedSelector() {
			return getRuleContext(NestedSelectorContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_selector);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				parantheticalSelector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				startSelector();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				endSelector();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				seekSelector();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				offsetSelector();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				findSelector();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(64);
				lineSelector();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(65);
				beforeSelector();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(66);
				afterSelector();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(67);
				betweenSelector();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(68);
				blockSelector();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(69);
				qualifiedSelector();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(70);
				nestedSelector();
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
	public static class ParantheticalSelectorContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(TeqlParser.L_PAREN, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(TeqlParser.R_PAREN, 0); }
		public ParantheticalSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parantheticalSelector; }
	}

	public final ParantheticalSelectorContext parantheticalSelector() throws RecognitionException {
		ParantheticalSelectorContext _localctx = new ParantheticalSelectorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parantheticalSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(L_PAREN);
			setState(74);
			selector();
			setState(75);
			match(R_PAREN);
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
	public static class StartSelectorContext extends ParserRuleContext {
		public TerminalNode KW_START() { return getToken(TeqlParser.KW_START, 0); }
		public StartSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startSelector; }
	}

	public final StartSelectorContext startSelector() throws RecognitionException {
		StartSelectorContext _localctx = new StartSelectorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_startSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(KW_START);
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
	public static class EndSelectorContext extends ParserRuleContext {
		public TerminalNode KW_END() { return getToken(TeqlParser.KW_END, 0); }
		public EndSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endSelector; }
	}

	public final EndSelectorContext endSelector() throws RecognitionException {
		EndSelectorContext _localctx = new EndSelectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_endSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(KW_END);
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
	public static class SeekSelectorContext extends ParserRuleContext {
		public TerminalNode KW_SEEK() { return getToken(TeqlParser.KW_SEEK, 0); }
		public TerminalNode INT() { return getToken(TeqlParser.INT, 0); }
		public SeekSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seekSelector; }
	}

	public final SeekSelectorContext seekSelector() throws RecognitionException {
		SeekSelectorContext _localctx = new SeekSelectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_seekSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(KW_SEEK);
			setState(82);
			match(INT);
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
	public static class OffsetSelectorContext extends ParserRuleContext {
		public TerminalNode KW_OFFSET() { return getToken(TeqlParser.KW_OFFSET, 0); }
		public TerminalNode INT() { return getToken(TeqlParser.INT, 0); }
		public OffsetSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetSelector; }
	}

	public final OffsetSelectorContext offsetSelector() throws RecognitionException {
		OffsetSelectorContext _localctx = new OffsetSelectorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_offsetSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(KW_OFFSET);
			setState(85);
			match(INT);
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
	public static class FindSelectorContext extends ParserRuleContext {
		public TerminalNode KW_FIND() { return getToken(TeqlParser.KW_FIND, 0); }
		public RegexLiteralContext regexLiteral() {
			return getRuleContext(RegexLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public FindSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_findSelector; }
	}

	public final FindSelectorContext findSelector() throws RecognitionException {
		FindSelectorContext _localctx = new FindSelectorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_findSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(KW_FIND);
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGEX_OPEN:
				{
				setState(88);
				regexLiteral();
				}
				break;
			case STR_OPEN:
				{
				setState(89);
				stringLiteral();
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
	public static class LineSelectorContext extends ParserRuleContext {
		public TerminalNode KW_LINE() { return getToken(TeqlParser.KW_LINE, 0); }
		public RangeLiteralContext rangeLiteral() {
			return getRuleContext(RangeLiteralContext.class,0);
		}
		public LineSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineSelector; }
	}

	public final LineSelectorContext lineSelector() throws RecognitionException {
		LineSelectorContext _localctx = new LineSelectorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lineSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(KW_LINE);
			setState(93);
			rangeLiteral();
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
	public static class BeforeSelectorContext extends ParserRuleContext {
		public TerminalNode KW_BEFORE() { return getToken(TeqlParser.KW_BEFORE, 0); }
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public TerminalNode KW_ANY() { return getToken(TeqlParser.KW_ANY, 0); }
		public TerminalNode INT() { return getToken(TeqlParser.INT, 0); }
		public TerminalNode KW_EVERYTHING() { return getToken(TeqlParser.KW_EVERYTHING, 0); }
		public BeforeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beforeSelector; }
	}

	public final BeforeSelectorContext beforeSelector() throws RecognitionException {
		BeforeSelectorContext _localctx = new BeforeSelectorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_beforeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ANY:
				{
				setState(95);
				match(KW_ANY);
				setState(96);
				selector();
				}
				break;
			case INT:
				{
				setState(97);
				match(INT);
				}
				break;
			case KW_EVERYTHING:
				{
				setState(98);
				match(KW_EVERYTHING);
				}
				break;
			case KW_BEFORE:
				break;
			default:
				break;
			}
			setState(101);
			match(KW_BEFORE);
			setState(102);
			selector();
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
	public static class AfterSelectorContext extends ParserRuleContext {
		public TerminalNode KW_AFTER() { return getToken(TeqlParser.KW_AFTER, 0); }
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public TerminalNode KW_ANY() { return getToken(TeqlParser.KW_ANY, 0); }
		public TerminalNode INT() { return getToken(TeqlParser.INT, 0); }
		public TerminalNode KW_EVERYTHING() { return getToken(TeqlParser.KW_EVERYTHING, 0); }
		public AfterSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_afterSelector; }
	}

	public final AfterSelectorContext afterSelector() throws RecognitionException {
		AfterSelectorContext _localctx = new AfterSelectorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_afterSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ANY:
				{
				setState(104);
				match(KW_ANY);
				setState(105);
				selector();
				}
				break;
			case INT:
				{
				setState(106);
				match(INT);
				}
				break;
			case KW_EVERYTHING:
				{
				setState(107);
				match(KW_EVERYTHING);
				}
				break;
			case KW_AFTER:
				break;
			default:
				break;
			}
			setState(110);
			match(KW_AFTER);
			setState(111);
			selector();
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
	public static class BetweenSelectorContext extends ParserRuleContext {
		public TerminalNode KW_ANY() { return getToken(TeqlParser.KW_ANY, 0); }
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public TerminalNode KW_BETWEEN() { return getToken(TeqlParser.KW_BETWEEN, 0); }
		public TerminalNode KW_AND() { return getToken(TeqlParser.KW_AND, 0); }
		public BetweenSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_betweenSelector; }
	}

	public final BetweenSelectorContext betweenSelector() throws RecognitionException {
		BetweenSelectorContext _localctx = new BetweenSelectorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_betweenSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(KW_ANY);
			setState(114);
			selector();
			setState(115);
			match(KW_BETWEEN);
			setState(116);
			selector();
			setState(117);
			match(KW_AND);
			setState(118);
			selector();
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
	public static class BlockSelectorContext extends ParserRuleContext {
		public TerminalNode KW_FROM() { return getToken(TeqlParser.KW_FROM, 0); }
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public TerminalNode KW_TO() { return getToken(TeqlParser.KW_TO, 0); }
		public TerminalNode KW_LENGTH() { return getToken(TeqlParser.KW_LENGTH, 0); }
		public TerminalNode INT() { return getToken(TeqlParser.INT, 0); }
		public BlockSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockSelector; }
	}

	public final BlockSelectorContext blockSelector() throws RecognitionException {
		BlockSelectorContext _localctx = new BlockSelectorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(KW_FROM);
			setState(121);
			selector();
			setState(122);
			match(KW_TO);
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_AFTER:
			case KW_ANY:
			case KW_BEFORE:
			case KW_END:
			case KW_EVERYTHING:
			case KW_FIND:
			case KW_FIRST:
			case KW_FROM:
			case KW_LAST:
			case KW_LINE:
			case KW_NEXT:
			case KW_OFFSET:
			case KW_SEEK:
			case KW_START:
			case INT:
			case L_PAREN:
				{
				setState(123);
				selector();
				}
				break;
			case KW_LENGTH:
				{
				setState(124);
				match(KW_LENGTH);
				setState(125);
				match(INT);
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
	public static class QualifiedSelectorContext extends ParserRuleContext {
		public RangeLiteralContext rangeLiteral() {
			return getRuleContext(RangeLiteralContext.class,0);
		}
		public TerminalNode KW_OF() { return getToken(TeqlParser.KW_OF, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public QualifiedSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedSelector; }
	}

	public final QualifiedSelectorContext qualifiedSelector() throws RecognitionException {
		QualifiedSelectorContext _localctx = new QualifiedSelectorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_qualifiedSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			rangeLiteral();
			setState(129);
			match(KW_OF);
			setState(130);
			selector();
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
	public static class NestedSelectorContext extends ParserRuleContext {
		public TerminalNode KW_ANY() { return getToken(TeqlParser.KW_ANY, 0); }
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public TerminalNode KW_IN() { return getToken(TeqlParser.KW_IN, 0); }
		public NestedSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedSelector; }
	}

	public final NestedSelectorContext nestedSelector() throws RecognitionException {
		NestedSelectorContext _localctx = new NestedSelectorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nestedSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(KW_ANY);
			setState(133);
			selector();
			setState(134);
			match(KW_IN);
			setState(135);
			selector();
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
	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode STR_OPEN() { return getToken(TeqlParser.STR_OPEN, 0); }
		public TerminalNode STR_CLOSE() { return getToken(TeqlParser.STR_CLOSE, 0); }
		public List<TerminalNode> STR_BODY() { return getTokens(TeqlParser.STR_BODY); }
		public TerminalNode STR_BODY(int i) {
			return getToken(TeqlParser.STR_BODY, i);
		}
		public List<TerminalNode> STR_ESCAPE() { return getTokens(TeqlParser.STR_ESCAPE); }
		public TerminalNode STR_ESCAPE(int i) {
			return getToken(TeqlParser.STR_ESCAPE, i);
		}
		public List<TerminalNode> STR_HEX_BYTE_2() { return getTokens(TeqlParser.STR_HEX_BYTE_2); }
		public TerminalNode STR_HEX_BYTE_2(int i) {
			return getToken(TeqlParser.STR_HEX_BYTE_2, i);
		}
		public List<TerminalNode> STR_HEX_BYTE_1() { return getTokens(TeqlParser.STR_HEX_BYTE_1); }
		public TerminalNode STR_HEX_BYTE_1(int i) {
			return getToken(TeqlParser.STR_HEX_BYTE_1, i);
		}
		public List<TerminalNode> STR_UNICODE_4() { return getTokens(TeqlParser.STR_UNICODE_4); }
		public TerminalNode STR_UNICODE_4(int i) {
			return getToken(TeqlParser.STR_UNICODE_4, i);
		}
		public List<TerminalNode> STR_UNICODE_FLEX() { return getTokens(TeqlParser.STR_UNICODE_FLEX); }
		public TerminalNode STR_UNICODE_FLEX(int i) {
			return getToken(TeqlParser.STR_UNICODE_FLEX, i);
		}
		public List<TerminalNode> VAR() { return getTokens(TeqlParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(TeqlParser.VAR, i);
		}
		public List<StringLiteralInterpolationContext> stringLiteralInterpolation() {
			return getRuleContexts(StringLiteralInterpolationContext.class);
		}
		public StringLiteralInterpolationContext stringLiteralInterpolation(int i) {
			return getRuleContext(StringLiteralInterpolationContext.class,i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(STR_OPEN);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1004307114950131712L) != 0)) {
				{
				setState(146);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STR_BODY:
					{
					setState(138);
					match(STR_BODY);
					}
					break;
				case STR_ESCAPE:
					{
					setState(139);
					match(STR_ESCAPE);
					}
					break;
				case STR_HEX_BYTE_2:
					{
					setState(140);
					match(STR_HEX_BYTE_2);
					}
					break;
				case STR_HEX_BYTE_1:
					{
					setState(141);
					match(STR_HEX_BYTE_1);
					}
					break;
				case STR_UNICODE_4:
					{
					setState(142);
					match(STR_UNICODE_4);
					}
					break;
				case STR_UNICODE_FLEX:
					{
					setState(143);
					match(STR_UNICODE_FLEX);
					}
					break;
				case VAR:
					{
					setState(144);
					match(VAR);
					}
					break;
				case STR_INTERPOLATE_OPEN:
					{
					setState(145);
					stringLiteralInterpolation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(STR_CLOSE);
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
	public static class StringLiteralInterpolationContext extends ParserRuleContext {
		public TerminalNode STR_INTERPOLATE_OPEN() { return getToken(TeqlParser.STR_INTERPOLATE_OPEN, 0); }
		public TerminalNode VAR() { return getToken(TeqlParser.VAR, 0); }
		public TerminalNode STR_INTERPOLATE_CLOSE() { return getToken(TeqlParser.STR_INTERPOLATE_CLOSE, 0); }
		public StringLiteralInterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteralInterpolation; }
	}

	public final StringLiteralInterpolationContext stringLiteralInterpolation() throws RecognitionException {
		StringLiteralInterpolationContext _localctx = new StringLiteralInterpolationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stringLiteralInterpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(STR_INTERPOLATE_OPEN);
			setState(154);
			match(VAR);
			setState(155);
			match(STR_INTERPOLATE_CLOSE);
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
	public static class RegexLiteralContext extends ParserRuleContext {
		public TerminalNode REGEX_OPEN() { return getToken(TeqlParser.REGEX_OPEN, 0); }
		public TerminalNode REGEX_CLOSE() { return getToken(TeqlParser.REGEX_CLOSE, 0); }
		public List<RegexLiteralQualifiedUnitContext> regexLiteralQualifiedUnit() {
			return getRuleContexts(RegexLiteralQualifiedUnitContext.class);
		}
		public RegexLiteralQualifiedUnitContext regexLiteralQualifiedUnit(int i) {
			return getRuleContext(RegexLiteralQualifiedUnitContext.class,i);
		}
		public RegexLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexLiteral; }
	}

	public final RegexLiteralContext regexLiteral() throws RecognitionException {
		RegexLiteralContext _localctx = new RegexLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_regexLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(REGEX_OPEN);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 41944063L) != 0)) {
				{
				{
				setState(158);
				regexLiteralQualifiedUnit();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(REGEX_CLOSE);
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
	public static class RegexLiteralQualifierContext extends ParserRuleContext {
		public TerminalNode REGEX_OPTION() { return getToken(TeqlParser.REGEX_OPTION, 0); }
		public TerminalNode REGEX_REPEAT_FIXED() { return getToken(TeqlParser.REGEX_REPEAT_FIXED, 0); }
		public TerminalNode REGEX_REPEAT_MAX() { return getToken(TeqlParser.REGEX_REPEAT_MAX, 0); }
		public TerminalNode REGEX_REPEAT_MIN() { return getToken(TeqlParser.REGEX_REPEAT_MIN, 0); }
		public TerminalNode REGEX_REPEAT_PLUS() { return getToken(TeqlParser.REGEX_REPEAT_PLUS, 0); }
		public TerminalNode REGEX_REPEAT_RANGE() { return getToken(TeqlParser.REGEX_REPEAT_RANGE, 0); }
		public TerminalNode REGEX_REPEAT_STAR() { return getToken(TeqlParser.REGEX_REPEAT_STAR, 0); }
		public RegexLiteralQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexLiteralQualifier; }
	}

	public final RegexLiteralQualifierContext regexLiteralQualifier() throws RecognitionException {
		RegexLiteralQualifierContext _localctx = new RegexLiteralQualifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_regexLiteralQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 127L) != 0)) ) {
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
	public static class RegexLiteralQualifiedUnitContext extends ParserRuleContext {
		public RegexLiteralUnitContext regexLiteralUnit() {
			return getRuleContext(RegexLiteralUnitContext.class,0);
		}
		public RegexLiteralQualifierContext regexLiteralQualifier() {
			return getRuleContext(RegexLiteralQualifierContext.class,0);
		}
		public RegexLiteralQualifiedUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexLiteralQualifiedUnit; }
	}

	public final RegexLiteralQualifiedUnitContext regexLiteralQualifiedUnit() throws RecognitionException {
		RegexLiteralQualifiedUnitContext _localctx = new RegexLiteralQualifiedUnitContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_regexLiteralQualifiedUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			regexLiteralUnit();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 127L) != 0)) {
				{
				setState(169);
				regexLiteralQualifier();
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
	public static class RegexLiteralUnitContext extends ParserRuleContext {
		public RegexLiteral_groupContext regexLiteral_group() {
			return getRuleContext(RegexLiteral_groupContext.class,0);
		}
		public RegexLiteralCharClassContext regexLiteralCharClass() {
			return getRuleContext(RegexLiteralCharClassContext.class,0);
		}
		public RegexLiteralLiteralContext regexLiteralLiteral() {
			return getRuleContext(RegexLiteralLiteralContext.class,0);
		}
		public RegexLiteralUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexLiteralUnit; }
	}

	public final RegexLiteralUnitContext regexLiteralUnit() throws RecognitionException {
		RegexLiteralUnitContext _localctx = new RegexLiteralUnitContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_regexLiteralUnit);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGEX_NONCAP_GROUP_OPEN:
			case REGEX_NAMED_CAP_GROUP_OPEN:
			case REGEX_CAP_GROUP_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				regexLiteral_group();
				}
				break;
			case REGEX_INV_CHAR_CLASS_OPEN:
			case REGEX_CHAR_CLASS_OPEN:
			case REGEX_CHAR_CLASS_CLOSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				regexLiteralCharClass();
				}
				break;
			case REGEX_ESCAPE:
			case REGEX_HEX_BYTE_2:
			case REGEX_HEX_BYTE_1:
			case REGEX_UNICODE_4:
			case REGEX_UNICODE_FLEX:
			case REGEX_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				regexLiteralLiteral();
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
	public static class RegexLiteralLiteralContext extends ParserRuleContext {
		public TerminalNode REGEX_LITERAL() { return getToken(TeqlParser.REGEX_LITERAL, 0); }
		public TerminalNode REGEX_ESCAPE() { return getToken(TeqlParser.REGEX_ESCAPE, 0); }
		public TerminalNode REGEX_HEX_BYTE_2() { return getToken(TeqlParser.REGEX_HEX_BYTE_2, 0); }
		public TerminalNode REGEX_HEX_BYTE_1() { return getToken(TeqlParser.REGEX_HEX_BYTE_1, 0); }
		public TerminalNode REGEX_UNICODE_4() { return getToken(TeqlParser.REGEX_UNICODE_4, 0); }
		public TerminalNode REGEX_UNICODE_FLEX() { return getToken(TeqlParser.REGEX_UNICODE_FLEX, 0); }
		public RegexLiteralLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexLiteralLiteral; }
	}

	public final RegexLiteralLiteralContext regexLiteralLiteral() throws RecognitionException {
		RegexLiteralLiteralContext _localctx = new RegexLiteralLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_regexLiteralLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 8388639L) != 0)) ) {
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
	public static class RegexLiteralCharRangeContext extends ParserRuleContext {
		public List<RegexLiteralLiteralContext> regexLiteralLiteral() {
			return getRuleContexts(RegexLiteralLiteralContext.class);
		}
		public RegexLiteralLiteralContext regexLiteralLiteral(int i) {
			return getRuleContext(RegexLiteralLiteralContext.class,i);
		}
		public TerminalNode REGEX_CHAR_CLASS_RANGE() { return getToken(TeqlParser.REGEX_CHAR_CLASS_RANGE, 0); }
		public RegexLiteralCharRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexLiteralCharRange; }
	}

	public final RegexLiteralCharRangeContext regexLiteralCharRange() throws RecognitionException {
		RegexLiteralCharRangeContext _localctx = new RegexLiteralCharRangeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_regexLiteralCharRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			regexLiteralLiteral();
			setState(180);
			match(REGEX_CHAR_CLASS_RANGE);
			setState(181);
			regexLiteralLiteral();
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
	public static class RegexLiteralCharClassContext extends ParserRuleContext {
		public TerminalNode REGEX_CHAR_CLASS_OPEN() { return getToken(TeqlParser.REGEX_CHAR_CLASS_OPEN, 0); }
		public TerminalNode REGEX_INV_CHAR_CLASS_OPEN() { return getToken(TeqlParser.REGEX_INV_CHAR_CLASS_OPEN, 0); }
		public List<RegexLiteralCharRangeContext> regexLiteralCharRange() {
			return getRuleContexts(RegexLiteralCharRangeContext.class);
		}
		public RegexLiteralCharRangeContext regexLiteralCharRange(int i) {
			return getRuleContext(RegexLiteralCharRangeContext.class,i);
		}
		public List<RegexLiteralLiteralContext> regexLiteralLiteral() {
			return getRuleContexts(RegexLiteralLiteralContext.class);
		}
		public RegexLiteralLiteralContext regexLiteralLiteral(int i) {
			return getRuleContext(RegexLiteralLiteralContext.class,i);
		}
		public TerminalNode REGEX_CHAR_CLASS_CLOSE() { return getToken(TeqlParser.REGEX_CHAR_CLASS_CLOSE, 0); }
		public RegexLiteralCharClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexLiteralCharClass; }
	}

	public final RegexLiteralCharClassContext regexLiteralCharClass() throws RecognitionException {
		RegexLiteralCharClassContext _localctx = new RegexLiteralCharClassContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_regexLiteralCharClass);
		int _la;
		try {
			int _alt;
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGEX_INV_CHAR_CLASS_OPEN:
			case REGEX_CHAR_CLASS_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				_la = _input.LA(1);
				if ( !(_la==REGEX_INV_CHAR_CLASS_OPEN || _la==REGEX_CHAR_CLASS_OPEN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(186); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(186);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
						case 1:
							{
							setState(184);
							regexLiteralCharRange();
							}
							break;
						case 2:
							{
							setState(185);
							regexLiteralLiteral();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(188); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case REGEX_CHAR_CLASS_CLOSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(REGEX_CHAR_CLASS_CLOSE);
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
	public static class RegexLiteral_groupContext extends ParserRuleContext {
		public TerminalNode REGEX_GROUP_CLOSE() { return getToken(TeqlParser.REGEX_GROUP_CLOSE, 0); }
		public TerminalNode REGEX_NONCAP_GROUP_OPEN() { return getToken(TeqlParser.REGEX_NONCAP_GROUP_OPEN, 0); }
		public TerminalNode REGEX_NAMED_CAP_GROUP_OPEN() { return getToken(TeqlParser.REGEX_NAMED_CAP_GROUP_OPEN, 0); }
		public TerminalNode REGEX_CAP_GROUP_OPEN() { return getToken(TeqlParser.REGEX_CAP_GROUP_OPEN, 0); }
		public List<RegexLiteralQualifiedUnitContext> regexLiteralQualifiedUnit() {
			return getRuleContexts(RegexLiteralQualifiedUnitContext.class);
		}
		public RegexLiteralQualifiedUnitContext regexLiteralQualifiedUnit(int i) {
			return getRuleContext(RegexLiteralQualifiedUnitContext.class,i);
		}
		public RegexLiteral_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexLiteral_group; }
	}

	public final RegexLiteral_groupContext regexLiteral_group() throws RecognitionException {
		RegexLiteral_groupContext _localctx = new RegexLiteral_groupContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_regexLiteral_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				regexLiteralQualifiedUnit();
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 41944063L) != 0) );
			setState(199);
			match(REGEX_GROUP_CLOSE);
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
	public static class RangeLiteralContext extends ParserRuleContext {
		public List<RangeLiteralUnitContext> rangeLiteralUnit() {
			return getRuleContexts(RangeLiteralUnitContext.class);
		}
		public RangeLiteralUnitContext rangeLiteralUnit(int i) {
			return getRuleContext(RangeLiteralUnitContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TeqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TeqlParser.COMMA, i);
		}
		public RangeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeLiteral; }
	}

	public final RangeLiteralContext rangeLiteral() throws RecognitionException {
		RangeLiteralContext _localctx = new RangeLiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			rangeLiteralUnit();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(202);
				match(COMMA);
				setState(203);
				rangeLiteralUnit();
				}
				}
				setState(208);
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
	public static class RangeLiteralUnitContext extends ParserRuleContext {
		public RangeLiteralRelrangeContext rangeLiteralRelrange() {
			return getRuleContext(RangeLiteralRelrangeContext.class,0);
		}
		public RangeLiteralRangeContext rangeLiteralRange() {
			return getRuleContext(RangeLiteralRangeContext.class,0);
		}
		public RangeLiteralLiteralContext rangeLiteralLiteral() {
			return getRuleContext(RangeLiteralLiteralContext.class,0);
		}
		public RangeLiteralUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeLiteralUnit; }
	}

	public final RangeLiteralUnitContext rangeLiteralUnit() throws RecognitionException {
		RangeLiteralUnitContext _localctx = new RangeLiteralUnitContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_rangeLiteralUnit);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				rangeLiteralRelrange();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				rangeLiteralRange();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				rangeLiteralLiteral();
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
	public static class RangeLiteralRelrangeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TeqlParser.INT, 0); }
		public TerminalNode KW_FIRST() { return getToken(TeqlParser.KW_FIRST, 0); }
		public TerminalNode KW_NEXT() { return getToken(TeqlParser.KW_NEXT, 0); }
		public TerminalNode KW_LAST() { return getToken(TeqlParser.KW_LAST, 0); }
		public RangeLiteralRelrangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeLiteralRelrange; }
	}

	public final RangeLiteralRelrangeContext rangeLiteralRelrange() throws RecognitionException {
		RangeLiteralRelrangeContext _localctx = new RangeLiteralRelrangeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_rangeLiteralRelrange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9469952L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(215);
			match(INT);
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
	public static class RangeLiteralRangeContext extends ParserRuleContext {
		public List<RangeLiteralLiteralContext> rangeLiteralLiteral() {
			return getRuleContexts(RangeLiteralLiteralContext.class);
		}
		public RangeLiteralLiteralContext rangeLiteralLiteral(int i) {
			return getRuleContext(RangeLiteralLiteralContext.class,i);
		}
		public TerminalNode HYPHEN() { return getToken(TeqlParser.HYPHEN, 0); }
		public TerminalNode COLON() { return getToken(TeqlParser.COLON, 0); }
		public List<TerminalNode> DOT() { return getTokens(TeqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TeqlParser.DOT, i);
		}
		public RangeLiteralRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeLiteralRange; }
	}

	public final RangeLiteralRangeContext rangeLiteralRange() throws RecognitionException {
		RangeLiteralRangeContext _localctx = new RangeLiteralRangeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rangeLiteralRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			rangeLiteralLiteral();
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HYPHEN:
				{
				setState(218);
				match(HYPHEN);
				}
				break;
			case COLON:
				{
				setState(219);
				match(COLON);
				}
				break;
			case DOT:
				{
				setState(220);
				match(DOT);
				setState(221);
				match(DOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(224);
			rangeLiteralLiteral();
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
	public static class RangeLiteralLiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TeqlParser.INT, 0); }
		public TerminalNode KW_FIRST() { return getToken(TeqlParser.KW_FIRST, 0); }
		public TerminalNode KW_NEXT() { return getToken(TeqlParser.KW_NEXT, 0); }
		public TerminalNode KW_LAST() { return getToken(TeqlParser.KW_LAST, 0); }
		public RangeLiteralLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeLiteralLiteral; }
	}

	public final RangeLiteralLiteralContext rangeLiteralLiteral() throws RecognitionException {
		RangeLiteralLiteralContext _localctx = new RangeLiteralLiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_rangeLiteralLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 137448423424L) != 0)) ) {
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
		"\u0004\u0001W\u00e5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000H\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006[\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bd\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tm\b\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u007f\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0093\b\u000e\n\u000e\f\u000e\u0096\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00a0\b\u0010\n\u0010\f\u0010\u00a3\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00ab\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00b0"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0004\u0016\u00bb\b\u0016\u000b"+
		"\u0016\f\u0016\u00bc\u0001\u0016\u0003\u0016\u00c0\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0004\u0017\u00c4\b\u0017\u000b\u0017\f\u0017\u00c5\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u00cd"+
		"\b\u0018\n\u0018\f\u0018\u00d0\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u00d5\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u00df\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0000\u0000"+
		"\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468\u0000\u0006\u0001\u0000JP\u0002\u0000"+
		">BUU\u0001\u0000CD\u0001\u0000EG\u0003\u0000\u000f\u000f\u0014\u0014\u0017"+
		"\u0017\u0004\u0000\u000f\u000f\u0014\u0014\u0017\u0017%%\u00f0\u0000G"+
		"\u0001\u0000\u0000\u0000\u0002I\u0001\u0000\u0000\u0000\u0004M\u0001\u0000"+
		"\u0000\u0000\u0006O\u0001\u0000\u0000\u0000\bQ\u0001\u0000\u0000\u0000"+
		"\nT\u0001\u0000\u0000\u0000\fW\u0001\u0000\u0000\u0000\u000e\\\u0001\u0000"+
		"\u0000\u0000\u0010c\u0001\u0000\u0000\u0000\u0012l\u0001\u0000\u0000\u0000"+
		"\u0014q\u0001\u0000\u0000\u0000\u0016x\u0001\u0000\u0000\u0000\u0018\u0080"+
		"\u0001\u0000\u0000\u0000\u001a\u0084\u0001\u0000\u0000\u0000\u001c\u0089"+
		"\u0001\u0000\u0000\u0000\u001e\u0099\u0001\u0000\u0000\u0000 \u009d\u0001"+
		"\u0000\u0000\u0000\"\u00a6\u0001\u0000\u0000\u0000$\u00a8\u0001\u0000"+
		"\u0000\u0000&\u00af\u0001\u0000\u0000\u0000(\u00b1\u0001\u0000\u0000\u0000"+
		"*\u00b3\u0001\u0000\u0000\u0000,\u00bf\u0001\u0000\u0000\u0000.\u00c1"+
		"\u0001\u0000\u0000\u00000\u00c9\u0001\u0000\u0000\u00002\u00d4\u0001\u0000"+
		"\u0000\u00004\u00d6\u0001\u0000\u0000\u00006\u00d9\u0001\u0000\u0000\u0000"+
		"8\u00e2\u0001\u0000\u0000\u0000:H\u0003\u0002\u0001\u0000;H\u0003\u0004"+
		"\u0002\u0000<H\u0003\u0006\u0003\u0000=H\u0003\b\u0004\u0000>H\u0003\n"+
		"\u0005\u0000?H\u0003\f\u0006\u0000@H\u0003\u000e\u0007\u0000AH\u0003\u0010"+
		"\b\u0000BH\u0003\u0012\t\u0000CH\u0003\u0014\n\u0000DH\u0003\u0016\u000b"+
		"\u0000EH\u0003\u0018\f\u0000FH\u0003\u001a\r\u0000G:\u0001\u0000\u0000"+
		"\u0000G;\u0001\u0000\u0000\u0000G<\u0001\u0000\u0000\u0000G=\u0001\u0000"+
		"\u0000\u0000G>\u0001\u0000\u0000\u0000G?\u0001\u0000\u0000\u0000G@\u0001"+
		"\u0000\u0000\u0000GA\u0001\u0000\u0000\u0000GB\u0001\u0000\u0000\u0000"+
		"GC\u0001\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GF\u0001\u0000\u0000\u0000H\u0001\u0001\u0000\u0000\u0000IJ\u0005"+
		"0\u0000\u0000JK\u0003\u0000\u0000\u0000KL\u00051\u0000\u0000L\u0003\u0001"+
		"\u0000\u0000\u0000MN\u0005 \u0000\u0000N\u0005\u0001\u0000\u0000\u0000"+
		"OP\u0005\u000b\u0000\u0000P\u0007\u0001\u0000\u0000\u0000QR\u0005\u001d"+
		"\u0000\u0000RS\u0005%\u0000\u0000S\t\u0001\u0000\u0000\u0000TU\u0005\u0019"+
		"\u0000\u0000UV\u0005%\u0000\u0000V\u000b\u0001\u0000\u0000\u0000WZ\u0005"+
		"\u000e\u0000\u0000X[\u0003 \u0010\u0000Y[\u0003\u001c\u000e\u0000ZX\u0001"+
		"\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[\r\u0001\u0000\u0000\u0000"+
		"\\]\u0005\u0016\u0000\u0000]^\u00030\u0018\u0000^\u000f\u0001\u0000\u0000"+
		"\u0000_`\u0005\u0003\u0000\u0000`d\u0003\u0000\u0000\u0000ad\u0005%\u0000"+
		"\u0000bd\u0005\f\u0000\u0000c_\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cb\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000ef\u0005\u0005\u0000\u0000fg\u0003\u0000\u0000\u0000g\u0011"+
		"\u0001\u0000\u0000\u0000hi\u0005\u0003\u0000\u0000im\u0003\u0000\u0000"+
		"\u0000jm\u0005%\u0000\u0000km\u0005\f\u0000\u0000lh\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0005\u0001\u0000\u0000op\u0003"+
		"\u0000\u0000\u0000p\u0013\u0001\u0000\u0000\u0000qr\u0005\u0003\u0000"+
		"\u0000rs\u0003\u0000\u0000\u0000st\u0005\u0007\u0000\u0000tu\u0003\u0000"+
		"\u0000\u0000uv\u0005\u0002\u0000\u0000vw\u0003\u0000\u0000\u0000w\u0015"+
		"\u0001\u0000\u0000\u0000xy\u0005\u0010\u0000\u0000yz\u0003\u0000\u0000"+
		"\u0000z~\u0005\"\u0000\u0000{\u007f\u0003\u0000\u0000\u0000|}\u0005\u0015"+
		"\u0000\u0000}\u007f\u0005%\u0000\u0000~{\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000\u007f\u0017\u0001\u0000\u0000\u0000\u0080\u0081\u0003"+
		"0\u0018\u0000\u0081\u0082\u0005\u0018\u0000\u0000\u0082\u0083\u0003\u0000"+
		"\u0000\u0000\u0083\u0019\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0003"+
		"\u0000\u0000\u0085\u0086\u0003\u0000\u0000\u0000\u0086\u0087\u0005\u0011"+
		"\u0000\u0000\u0087\u0088\u0003\u0000\u0000\u0000\u0088\u001b\u0001\u0000"+
		"\u0000\u0000\u0089\u0094\u0005\'\u0000\u0000\u008a\u0093\u0005;\u0000"+
		"\u0000\u008b\u0093\u00054\u0000\u0000\u008c\u0093\u00055\u0000\u0000\u008d"+
		"\u0093\u00056\u0000\u0000\u008e\u0093\u00057\u0000\u0000\u008f\u0093\u0005"+
		"8\u0000\u0000\u0090\u0093\u0005*\u0000\u0000\u0091\u0093\u0003\u001e\u000f"+
		"\u0000\u0092\u008a\u0001\u0000\u0000\u0000\u0092\u008b\u0001\u0000\u0000"+
		"\u0000\u0092\u008c\u0001\u0000\u0000\u0000\u0092\u008d\u0001\u0000\u0000"+
		"\u0000\u0092\u008e\u0001\u0000\u0000\u0000\u0092\u008f\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000"+
		"\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u00059\u0000\u0000"+
		"\u0098\u001d\u0001\u0000\u0000\u0000\u0099\u009a\u0005:\u0000\u0000\u009a"+
		"\u009b\u0005*\u0000\u0000\u009b\u009c\u0005=\u0000\u0000\u009c\u001f\u0001"+
		"\u0000\u0000\u0000\u009d\u00a1\u0005)\u0000\u0000\u009e\u00a0\u0003$\u0012"+
		"\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0005T\u0000\u0000\u00a5!\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0007\u0000\u0000\u0000\u00a7#\u0001\u0000\u0000\u0000\u00a8\u00aa"+
		"\u0003&\u0013\u0000\u00a9\u00ab\u0003\"\u0011\u0000\u00aa\u00a9\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab%\u0001\u0000"+
		"\u0000\u0000\u00ac\u00b0\u0003.\u0017\u0000\u00ad\u00b0\u0003,\u0016\u0000"+
		"\u00ae\u00b0\u0003(\u0014\u0000\u00af\u00ac\u0001\u0000\u0000\u0000\u00af"+
		"\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0"+
		"\'\u0001\u0000\u0000\u0000\u00b1\u00b2\u0007\u0001\u0000\u0000\u00b2)"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003(\u0014\u0000\u00b4\u00b5\u0005"+
		"V\u0000\u0000\u00b5\u00b6\u0003(\u0014\u0000\u00b6+\u0001\u0000\u0000"+
		"\u0000\u00b7\u00ba\u0007\u0002\u0000\u0000\u00b8\u00bb\u0003*\u0015\u0000"+
		"\u00b9\u00bb\u0003(\u0014\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c0\u0001\u0000\u0000\u0000\u00be\u00c0\u0005W\u0000\u0000\u00bf\u00b7"+
		"\u0001\u0000\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0-\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c3\u0007\u0003\u0000\u0000\u00c2\u00c4\u0003"+
		"$\u0012\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005H\u0000"+
		"\u0000\u00c8/\u0001\u0000\u0000\u0000\u00c9\u00ce\u00032\u0019\u0000\u00ca"+
		"\u00cb\u0005.\u0000\u0000\u00cb\u00cd\u00032\u0019\u0000\u00cc\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf1\u0001\u0000"+
		"\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d5\u00034\u001a"+
		"\u0000\u00d2\u00d5\u00036\u001b\u0000\u00d3\u00d5\u00038\u001c\u0000\u00d4"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d53\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0007\u0004\u0000\u0000\u00d7\u00d8\u0005%\u0000\u0000\u00d85\u0001\u0000"+
		"\u0000\u0000\u00d9\u00de\u00038\u001c\u0000\u00da\u00df\u0005,\u0000\u0000"+
		"\u00db\u00df\u0005-\u0000\u0000\u00dc\u00dd\u0005/\u0000\u0000\u00dd\u00df"+
		"\u0005/\u0000\u0000\u00de\u00da\u0001\u0000\u0000\u0000\u00de\u00db\u0001"+
		"\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u00038\u001c\u0000\u00e17\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0007\u0005\u0000\u0000\u00e39\u0001\u0000\u0000\u0000"+
		"\u0011GZcl~\u0092\u0094\u00a1\u00aa\u00af\u00ba\u00bc\u00bf\u00c5\u00ce"+
		"\u00d4\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}