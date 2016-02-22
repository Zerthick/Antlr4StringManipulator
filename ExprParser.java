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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, MUL=7, DIV=8, ADD=9, SUB=10, 
		VAR=11, PRINT=12, STRING=13, INTEGER=14, INT=15, STR=16, ID=17, NEWLINE=18, 
		WS=19;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_e = 2, RULE_idList = 3, RULE_eList = 4;
	public static final String[] ruleNames = {
		"prog", "stat", "e", "idList", "eList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':='", "'='", "'('", "')'", "','", "'*'", "'/'", "'+'", 
		"'-'", "'var'", "'print'", "'string'", "'int'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", 
		"VAR", "PRINT", "STRING", "INTEGER", "INT", "STR", "ID", "NEWLINE", "WS"
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
		public EListContext b;
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
		public TerminalNode INTEGER() { return getToken(ExprParser.INTEGER, 0); }
		public EListContext eList() {
			return getRuleContext(EListContext.class,0);
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
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
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
			case 2:
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				((StatContext)_localctx).ID = match(ID);
				setState(27);
				match(T__2);
				setState(28);
				((StatContext)_localctx).e = e(0);
				setState(29);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}

				            if(memory.containsKey((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null))){
				                memory.put((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null), ((StatContext)_localctx).e.v);
				            }
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				match(VAR);
				setState(33);
				((StatContext)_localctx).a = idList();
				setState(34);
				match(STRING);
				setState(35);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}

				            for (String id : ((StatContext)_localctx).a.list){
				                memory.put(id, "");
				            }
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				match(VAR);
				setState(39);
				((StatContext)_localctx).a = idList();
				setState(40);
				match(INTEGER);
				setState(41);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}

				            for (String id : ((StatContext)_localctx).a.list){
				                memory.put(id, 0);
				            }
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(44);
				match(VAR);
				setState(45);
				((StatContext)_localctx).a = idList();
				setState(46);
				match(STRING);
				setState(47);
				((StatContext)_localctx).b = eList();
				setState(48);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}

				            List<String> ids = ((StatContext)_localctx).a.list;
				            List<Object> exprs = ((StatContext)_localctx).b.list;
				            if(ids.size() == exprs.size()){
				                for (int i = 0; i < ids.size(); i++){
				                    if(exprs.get(i) instanceof String){
				                        memory.put(ids.get(i), (String)exprs.get(i));
				                    }
				                }
				            }
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
				match(VAR);
				setState(52);
				((StatContext)_localctx).a = idList();
				setState(53);
				match(INTEGER);
				setState(54);
				((StatContext)_localctx).b = eList();
				setState(55);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}

				            List<String> ids = ((StatContext)_localctx).a.list;
				            List<Object> exprs = ((StatContext)_localctx).b.list;
				            if(ids.size() == exprs.size()){
				                for (int i = 0; i < ids.size(); i++){
				                    if(exprs.get(i) instanceof Integer){
				                        memory.put(ids.get(i), (Integer)exprs.get(i));
				                    }
				                }
				            }
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(58);
				match(NEWLINE);
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
			setState(76);
			switch (_input.LA(1)) {
			case SUB:
				{
				setState(62);
				match(SUB);
				setState(63);
				((EContext)_localctx).INT = match(INT);
				((EContext)_localctx).v =  -1 * (((EContext)_localctx).INT!=null?Integer.valueOf(((EContext)_localctx).INT.getText()):0);
				}
				break;
			case INT:
				{
				setState(65);
				((EContext)_localctx).INT = match(INT);
				((EContext)_localctx).v =  (((EContext)_localctx).INT!=null?Integer.valueOf(((EContext)_localctx).INT.getText()):0);
				}
				break;
			case STR:
				{
				setState(67);
				((EContext)_localctx).STR = match(STR);
				((EContext)_localctx).v =  (((EContext)_localctx).STR!=null?((EContext)_localctx).STR.getText():null);
				}
				break;
			case ID:
				{
				setState(69);
				((EContext)_localctx).ID = match(ID);

				        String id = (((EContext)_localctx).ID!=null?((EContext)_localctx).ID.getText():null);
				        ((EContext)_localctx).v =  memory.containsKey(id) ? memory.get(id) : 0;
				      
				}
				break;
			case T__3:
				{
				setState(71);
				match(T__3);
				setState(72);
				((EContext)_localctx).e = e(0);
				setState(73);
				match(T__4);
				((EContext)_localctx).v =  _localctx.v;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(88);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(78);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(79);
						((EContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((EContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(80);
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
						setState(83);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(84);
						((EContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((EContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(85);
						((EContext)_localctx).b = ((EContext)_localctx).e = e(7);

						                      if (((EContext)_localctx).a.v instanceof Integer && ((EContext)_localctx).b.v instanceof Integer){
						                          ((EContext)_localctx).v =  eval((Integer)((EContext)_localctx).a.v, (((EContext)_localctx).op!=null?((EContext)_localctx).op.getType():0), (Integer)((EContext)_localctx).b.v);
						                      }
						                  
						}
						break;
					}
					} 
				}
				setState(92);
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
			setState(93);
			((IdListContext)_localctx).ID = match(ID);
			_localctx.ids.add((((IdListContext)_localctx).ID!=null?((IdListContext)_localctx).ID.getText():null));
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(95);
				match(T__5);
				setState(96);
				((IdListContext)_localctx).ID = match(ID);
				_localctx.ids.add((((IdListContext)_localctx).ID!=null?((IdListContext)_localctx).ID.getText():null));
				}
				}
				setState(102);
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
			setState(105);
			((EListContext)_localctx).a = e(0);
			_localctx.exprs.add(((EListContext)_localctx).a.v);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(107);
				match(T__5);
				setState(108);
				((EListContext)_localctx).b = e(0);
				_localctx.exprs.add(((EListContext)_localctx).b.v);
				}
				}
				setState(115);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4O\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4[\n\4\f\4\16\4^\13\4\3\5\3\5\3\5\3\5\3\5\7\5e\n\5\f\5\16\5h\13\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6r\n\6\f\6\16\6u\13\6\3\6\3\6\3\6\2\3"+
		"\6\7\2\4\6\b\n\2\5\4\2\3\3\24\24\3\2\t\n\3\2\13\f\u0083\2\r\3\2\2\2\4"+
		"=\3\2\2\2\6N\3\2\2\2\b_\3\2\2\2\nk\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16"+
		"\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\7\16\2\2\22"+
		"\23\5\6\4\2\23\24\t\2\2\2\24\25\b\3\1\2\25>\3\2\2\2\26\27\7\23\2\2\27"+
		"\30\7\4\2\2\30\31\5\6\4\2\31\32\t\2\2\2\32\33\b\3\1\2\33>\3\2\2\2\34\35"+
		"\7\23\2\2\35\36\7\5\2\2\36\37\5\6\4\2\37 \t\2\2\2 !\b\3\1\2!>\3\2\2\2"+
		"\"#\7\r\2\2#$\5\b\5\2$%\7\17\2\2%&\t\2\2\2&\'\b\3\1\2\'>\3\2\2\2()\7\r"+
		"\2\2)*\5\b\5\2*+\7\20\2\2+,\t\2\2\2,-\b\3\1\2->\3\2\2\2./\7\r\2\2/\60"+
		"\5\b\5\2\60\61\7\17\2\2\61\62\5\n\6\2\62\63\t\2\2\2\63\64\b\3\1\2\64>"+
		"\3\2\2\2\65\66\7\r\2\2\66\67\5\b\5\2\678\7\20\2\289\5\n\6\29:\t\2\2\2"+
		":;\b\3\1\2;>\3\2\2\2<>\7\24\2\2=\21\3\2\2\2=\26\3\2\2\2=\34\3\2\2\2=\""+
		"\3\2\2\2=(\3\2\2\2=.\3\2\2\2=\65\3\2\2\2=<\3\2\2\2>\5\3\2\2\2?@\b\4\1"+
		"\2@A\7\f\2\2AB\7\21\2\2BO\b\4\1\2CD\7\21\2\2DO\b\4\1\2EF\7\22\2\2FO\b"+
		"\4\1\2GH\7\23\2\2HO\b\4\1\2IJ\7\6\2\2JK\5\6\4\2KL\7\7\2\2LM\b\4\1\2MO"+
		"\3\2\2\2N?\3\2\2\2NC\3\2\2\2NE\3\2\2\2NG\3\2\2\2NI\3\2\2\2O\\\3\2\2\2"+
		"PQ\f\t\2\2QR\t\3\2\2RS\5\6\4\nST\b\4\1\2T[\3\2\2\2UV\f\b\2\2VW\t\4\2\2"+
		"WX\5\6\4\tXY\b\4\1\2Y[\3\2\2\2ZP\3\2\2\2ZU\3\2\2\2[^\3\2\2\2\\Z\3\2\2"+
		"\2\\]\3\2\2\2]\7\3\2\2\2^\\\3\2\2\2_`\7\23\2\2`f\b\5\1\2ab\7\b\2\2bc\7"+
		"\23\2\2ce\b\5\1\2da\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf"+
		"\3\2\2\2ij\b\5\1\2j\t\3\2\2\2kl\5\6\4\2ls\b\6\1\2mn\7\b\2\2no\5\6\4\2"+
		"op\b\6\1\2pr\3\2\2\2qm\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2"+
		"us\3\2\2\2vw\b\6\1\2w\13\3\2\2\2\t\17=NZ\\fs";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}