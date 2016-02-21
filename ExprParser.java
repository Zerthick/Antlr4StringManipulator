// Generated from Expr.g4 by ANTLR 4.5.2

import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, MUL=6, DIV=7, ADD=8, SUB=9, VAR=10, 
		PRINT=11, STRING=12, INTEGER=13, INT=14, STR=15, ID=16, NEWLINE=17, WS=18;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_e = 2, RULE_idList = 3, RULE_eList = 4;
	public static final String[] ruleNames = {
		"prog", "stat", "e", "idList", "eList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':='", "'('", "')'", "','", "'*'", "'/'", "'+'", "'-'", 
		"'var'", "'print'", "'string'", "'int'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", "VAR", 
		"PRINT", "STRING", "INTEGER", "INT", "STR", "ID", "NEWLINE", "WS"
	};
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    /** "memory" for our calculator; variable/value pairs go here */
	    Map<String, Object> memory = new HashMap<>();

	    int eval(int left, int op, int right) {
	        switch ( op ) {
	            case MUL : return left * right;
	            case DIV : return left / right;
	            case ADD : return left + right;
	            case SUB : return left - right;
	        }
	        return 0;
	    }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				stat();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINT) | (1L << ID) | (1L << NEWLINE))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public EContext e;
		public Token ID;
		public IdListContext a;
		public TerminalNode PRINT() { return getToken(ExprParser.PRINT, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode VAR() { return getToken(ExprParser.VAR, 0); }
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(33);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(PRINT);
				setState(16);
				((StatContext)_localctx).e = e(0);
				setState(17);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				System.out.println(((StatContext)_localctx).e.v);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				((StatContext)_localctx).ID = match(ID);
				setState(21);
				match(T__1);
				setState(22);
				((StatContext)_localctx).e = e(0);
				setState(23);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				memory.put((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null), ((StatContext)_localctx).e.v);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				match(VAR);
				setState(27);
				((StatContext)_localctx).a = idList();
				setState(28);
				match(STRING);
				setState(29);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				System.out.println(((StatContext)_localctx).a.list);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				match(NEWLINE);
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

	public static class EContext extends ParserRuleContext {
		public Object v;
		public EContext a;
		public Token INT;
		public Token STR;
		public Token ID;
		public EContext e;
		public Token op;
		public EContext b;
		public TerminalNode SUB() { return getToken(ExprParser.SUB, 0); }
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode STR() { return getToken(ExprParser.STR, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(ExprParser.ADD, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		return e(0);
	}

	private EContext e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EContext _localctx = new EContext(_ctx, _parentState);
		EContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_e, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			switch (_input.LA(1)) {
			case SUB:
				{
				setState(36);
				match(SUB);
				setState(37);
				((EContext)_localctx).INT = match(INT);
				((EContext)_localctx).v =  -1 * (((EContext)_localctx).INT!=null?Integer.valueOf(((EContext)_localctx).INT.getText()):0);
				}
				break;
			case INT:
				{
				setState(39);
				((EContext)_localctx).INT = match(INT);
				((EContext)_localctx).v =  (((EContext)_localctx).INT!=null?Integer.valueOf(((EContext)_localctx).INT.getText()):0);
				}
				break;
			case STR:
				{
				setState(41);
				((EContext)_localctx).STR = match(STR);
				((EContext)_localctx).v =  (((EContext)_localctx).STR!=null?((EContext)_localctx).STR.getText():null);
				}
				break;
			case ID:
				{
				setState(43);
				((EContext)_localctx).ID = match(ID);

				        String id = (((EContext)_localctx).ID!=null?((EContext)_localctx).ID.getText():null);
				        ((EContext)_localctx).v =  memory.containsKey(id) ? memory.get(id) : 0;
				      
				}
				break;
			case T__2:
				{
				setState(45);
				match(T__2);
				setState(46);
				((EContext)_localctx).e = e(0);
				setState(47);
				match(T__3);
				((EContext)_localctx).v =  _localctx.v;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(52);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(53);
						((EContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((EContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(54);
						((EContext)_localctx).b = ((EContext)_localctx).e = e(8);
						   
						                      if (((EContext)_localctx).a.v instanceof Integer && ((EContext)_localctx).b.v instanceof Integer){
						                          ((EContext)_localctx).v =  eval((Integer)((EContext)_localctx).a.v, (((EContext)_localctx).op!=null?((EContext)_localctx).op.getType():0), (Integer)((EContext)_localctx).b.v);
						                      }
						                  
						}
						break;
					case 2:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(57);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(58);
						((EContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((EContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(59);
						((EContext)_localctx).b = ((EContext)_localctx).e = e(7);

						                      if (((EContext)_localctx).a.v instanceof Integer && ((EContext)_localctx).b.v instanceof Integer){
						                          ((EContext)_localctx).v =  eval((Integer)((EContext)_localctx).a.v, (((EContext)_localctx).op!=null?((EContext)_localctx).op.getType():0), (Integer)((EContext)_localctx).b.v);
						                      }
						                  
						}
						break;
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IdListContext extends ParserRuleContext {
		public List<String> list;
		public List<String> ids =  new ArrayList<>();;
		public Token ID;
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIdList(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			((IdListContext)_localctx).ID = match(ID);
			_localctx.ids.add((((IdListContext)_localctx).ID!=null?((IdListContext)_localctx).ID.getText():null));
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(69);
				match(T__4);
				setState(70);
				((IdListContext)_localctx).ID = match(ID);
				_localctx.ids.add((((IdListContext)_localctx).ID!=null?((IdListContext)_localctx).ID.getText():null));
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((IdListContext)_localctx).list =  _localctx.ids;
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

	public static class EListContext extends ParserRuleContext {
		public List<Object> list;
		public List<Object> exprs =  new ArrayList<>();;
		public EContext a;
		public EContext b;
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public EListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterEList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitEList(this);
		}
	}

	public final EListContext eList() throws RecognitionException {
		EListContext _localctx = new EListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_eList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			((EListContext)_localctx).a = e(0);
			_localctx.exprs.add(((EListContext)_localctx).a.v);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(81);
				match(T__4);
				setState(82);
				((EListContext)_localctx).b = e(0);
				_localctx.exprs.add(((EListContext)_localctx).b.v);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((EListContext)_localctx).list =  _localctx.exprs;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return e_sempred((EContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24_\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3$\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\65\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4A\n\4\f\4\16\4D\13\4\3\5\3\5"+
		"\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6X\n\6\f\6\16\6[\13\6\3\6\3\6\3\6\2\3\6\7\2\4\6\b\n\2\5\4\2\3\3\23\23"+
		"\3\2\b\t\3\2\n\13e\2\r\3\2\2\2\4#\3\2\2\2\6\64\3\2\2\2\bE\3\2\2\2\nQ\3"+
		"\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2"+
		"\2\20\3\3\2\2\2\21\22\7\r\2\2\22\23\5\6\4\2\23\24\t\2\2\2\24\25\b\3\1"+
		"\2\25$\3\2\2\2\26\27\7\22\2\2\27\30\7\4\2\2\30\31\5\6\4\2\31\32\t\2\2"+
		"\2\32\33\b\3\1\2\33$\3\2\2\2\34\35\7\f\2\2\35\36\5\b\5\2\36\37\7\16\2"+
		"\2\37 \t\2\2\2 !\b\3\1\2!$\3\2\2\2\"$\7\23\2\2#\21\3\2\2\2#\26\3\2\2\2"+
		"#\34\3\2\2\2#\"\3\2\2\2$\5\3\2\2\2%&\b\4\1\2&\'\7\13\2\2\'(\7\20\2\2("+
		"\65\b\4\1\2)*\7\20\2\2*\65\b\4\1\2+,\7\21\2\2,\65\b\4\1\2-.\7\22\2\2."+
		"\65\b\4\1\2/\60\7\5\2\2\60\61\5\6\4\2\61\62\7\6\2\2\62\63\b\4\1\2\63\65"+
		"\3\2\2\2\64%\3\2\2\2\64)\3\2\2\2\64+\3\2\2\2\64-\3\2\2\2\64/\3\2\2\2\65"+
		"B\3\2\2\2\66\67\f\t\2\2\678\t\3\2\289\5\6\4\n9:\b\4\1\2:A\3\2\2\2;<\f"+
		"\b\2\2<=\t\4\2\2=>\5\6\4\t>?\b\4\1\2?A\3\2\2\2@\66\3\2\2\2@;\3\2\2\2A"+
		"D\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\7\3\2\2\2DB\3\2\2\2EF\7\22\2\2FL\b\5\1"+
		"\2GH\7\7\2\2HI\7\22\2\2IK\b\5\1\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2"+
		"\2\2MO\3\2\2\2NL\3\2\2\2OP\b\5\1\2P\t\3\2\2\2QR\5\6\4\2RY\b\6\1\2ST\7"+
		"\7\2\2TU\5\6\4\2UV\b\6\1\2VX\3\2\2\2WS\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3"+
		"\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\b\6\1\2]\13\3\2\2\2\t\17#\64@BLY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}