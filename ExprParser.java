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
	            case DIV :
	                if (right == 0){
	                    error("ERROR: DIVIDE BY ZERO");
	                } 
	                return left / right;
	            case ADD : return left + right;
	            case SUB : return left - right;
	        }
	        error();
	        return 0;
	    }
	    
	    String eval(String left, int op, String right) {
	        switch (op) {
	            case ADD : return left + right;
	        }
	        error();
	        return "";
	    }
	    
	    String eval(String left, int op, int right) {
	        switch (op) {
	            case MUL :
	                if ( right >= 0 ){
	                    StringBuilder sb = new StringBuilder();
	                    for (int i = 0; i < right; i++) {
	                        sb.append(left);
	                    }
	                    return sb.toString();
	                }
	                error("ERROR: NEGATIVE STRING MULTIPLIER");
	                return "";
	            case ADD :
	                if ( right > 0 ) {
	                    if ( right < left.length() ){
	                        return left.substring(right);
	                    } else {
	                        return "";
	                    }
	                } else {
	                    if ( (right * -1) < left.length() ){
	                        return left.substring(0, left.length() + right);
	                    } else {
	                        return "";
	                    }
	                }
	            case SUB :
	                if ( right > 0) {
	                    if ( right < left.length() ){
	                        return left.substring(0, left.length() - right);
	                    } else {
	                        return "";
	                    }
	                } else {
	                    if ( (right * -1) < left.length() ){
	                        return left.substring(right * -1);
	                    } else {
	                        return "";
	                    }
	                }
	        }
	        error();
	        return "";
	    }
	    
	    void error() {
	        error("SYNTAX ERROR");
	    }
	    
	    void error(String msg){
	        System.err.println(msg);
	        System.exit(0);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINT) | (1L << ID))) != 0) );
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
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(PRINT);
				setState(16);
				((StatContext)_localctx).e = e(0);
				setState(21);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(17);
					match(T__0);
					setState(18);
					match(NEWLINE);
					}
					break;
				case 2:
					{
					setState(19);
					match(NEWLINE);
					}
					break;
				case 3:
					{
					setState(20);
					match(T__0);
					}
					break;
				}
				System.out.println(((StatContext)_localctx).e.v);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				((StatContext)_localctx).ID = match(ID);
				setState(26);
				match(T__1);
				setState(27);
				((StatContext)_localctx).e = e(0);
				setState(32);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(28);
					match(T__0);
					setState(29);
					match(NEWLINE);
					}
					break;
				case 2:
					{
					setState(30);
					match(NEWLINE);
					}
					break;
				case 3:
					{
					setState(31);
					match(T__0);
					}
					break;
				}

				            if(memory.containsKey((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null))){ //If the variable to be declared already exists
				                error();
				            } else {
				                memory.put((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null), ((StatContext)_localctx).e.v);
				            }
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				((StatContext)_localctx).ID = match(ID);
				setState(37);
				match(T__2);
				setState(38);
				((StatContext)_localctx).e = e(0);
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(39);
					match(T__0);
					setState(40);
					match(NEWLINE);
					}
					break;
				case 2:
					{
					setState(41);
					match(NEWLINE);
					}
					break;
				case 3:
					{
					setState(42);
					match(T__0);
					}
					break;
				}

				            if(memory.containsKey((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null))){
				                if ((memory.get((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null)) instanceof String && ((StatContext)_localctx).e.v instanceof String) ||
				                    (memory.get((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null)) instanceof Integer && ((StatContext)_localctx).e.v instanceof Integer)){ //If the types match
				                    memory.put((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null), ((StatContext)_localctx).e.v);
				                } else {
				                    error();
				                }
				            } else {
				                error();
				            }
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(VAR);
				setState(48);
				((StatContext)_localctx).a = idList();
				setState(49);
				match(STRING);
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(50);
					match(T__0);
					setState(51);
					match(NEWLINE);
					}
					break;
				case 2:
					{
					setState(52);
					match(NEWLINE);
					}
					break;
				case 3:
					{
					setState(53);
					match(T__0);
					}
					break;
				}

				            for (String id : ((StatContext)_localctx).a.list){
				                memory.put(id, "");
				            }
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				match(VAR);
				setState(59);
				((StatContext)_localctx).a = idList();
				setState(60);
				match(INTEGER);
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(61);
					match(T__0);
					setState(62);
					match(NEWLINE);
					}
					break;
				case 2:
					{
					setState(63);
					match(NEWLINE);
					}
					break;
				case 3:
					{
					setState(64);
					match(T__0);
					}
					break;
				}

				            for (String id : ((StatContext)_localctx).a.list){
				                memory.put(id, 0);
				            }
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				match(VAR);
				setState(70);
				((StatContext)_localctx).a = idList();
				setState(71);
				match(STRING);
				setState(72);
				match(T__2);
				setState(73);
				((StatContext)_localctx).b = eList();
				setState(78);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(74);
					match(T__0);
					setState(75);
					match(NEWLINE);
					}
					break;
				case 2:
					{
					setState(76);
					match(NEWLINE);
					}
					break;
				case 3:
					{
					setState(77);
					match(T__0);
					}
					break;
				}

				            List<String> ids = ((StatContext)_localctx).a.list;
				            List<Object> exprs = ((StatContext)_localctx).b.list;
				            if(ids.size() == exprs.size()){
				                for (int i = 0; i < ids.size(); i++){
				                    if(exprs.get(i) instanceof String){
				                        memory.put(ids.get(i), (String)exprs.get(i));
				                    } else {
				                        error();
				                    }
				                }
				            } else {
				                error();
				            }
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				match(VAR);
				setState(83);
				((StatContext)_localctx).a = idList();
				setState(84);
				match(INTEGER);
				setState(85);
				match(T__2);
				setState(86);
				((StatContext)_localctx).b = eList();
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(87);
					match(T__0);
					setState(88);
					match(NEWLINE);
					}
					break;
				case 2:
					{
					setState(89);
					match(NEWLINE);
					}
					break;
				case 3:
					{
					setState(90);
					match(T__0);
					}
					break;
				}

				            List<String> ids = ((StatContext)_localctx).a.list;
				            List<Object> exprs = ((StatContext)_localctx).b.list;
				            if(ids.size() == exprs.size()){
				                for (int i = 0; i < ids.size(); i++){
				                    if(exprs.get(i) instanceof Integer){
				                        memory.put(ids.get(i), (Integer)exprs.get(i));
				                    } else {
				                        error();
				                    }
				                }
				            } else {
				                error();
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

	public static class EContext extends ParserRuleContext {
		public Object v;
		public EContext a;
		public Token INT;
		public Token STR;
		public Token ID;
		public Token op;
		public EContext b;
		public TerminalNode SUB() { return getToken(ExprParser.SUB, 0); }
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode STR() { return getToken(ExprParser.STR, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
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
			setState(113);
			switch (_input.LA(1)) {
			case SUB:
				{
				setState(98);
				match(SUB);
				setState(99);
				((EContext)_localctx).a = e(5);

				            if(((EContext)_localctx).a.v instanceof Integer){
				                ((EContext)_localctx).v =  -1 * (Integer)((EContext)_localctx).a.v;
				            } else {
				                error();
				            }
				        
				}
				break;
			case INT:
				{
				setState(102);
				((EContext)_localctx).INT = match(INT);
				((EContext)_localctx).v =  (((EContext)_localctx).INT!=null?Integer.valueOf(((EContext)_localctx).INT.getText()):0);
				}
				break;
			case STR:
				{
				setState(104);
				((EContext)_localctx).STR = match(STR);
				((EContext)_localctx).v =  (((EContext)_localctx).STR!=null?((EContext)_localctx).STR.getText():null).replaceAll("\"", "");
				}
				break;
			case ID:
				{
				setState(106);
				((EContext)_localctx).ID = match(ID);

				        String id = (((EContext)_localctx).ID!=null?((EContext)_localctx).ID.getText():null);
				        if (memory.containsKey(id)){
				            ((EContext)_localctx).v =  memory.get(id);
				        } else {
				            error();
				        }
				      
				}
				break;
			case T__3:
				{
				setState(108);
				match(T__3);
				setState(109);
				((EContext)_localctx).a = e(0);
				setState(110);
				match(T__4);
				((EContext)_localctx).v =  ((EContext)_localctx).a.v;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(115);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(116);
						((EContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((EContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(117);
						((EContext)_localctx).b = e(8);
						   
						                      if (((EContext)_localctx).a.v instanceof Integer && ((EContext)_localctx).b.v instanceof Integer){
						                          ((EContext)_localctx).v =  eval((Integer)((EContext)_localctx).a.v, (((EContext)_localctx).op!=null?((EContext)_localctx).op.getType():0), (Integer)((EContext)_localctx).b.v);
						                      } else if (((EContext)_localctx).a.v instanceof String && ((EContext)_localctx).b.v instanceof Integer){
						                          ((EContext)_localctx).v =  eval((String)((EContext)_localctx).a.v, (((EContext)_localctx).op!=null?((EContext)_localctx).op.getType():0), (Integer)((EContext)_localctx).b.v);
						                      } else if (((EContext)_localctx).a.v instanceof Integer && ((EContext)_localctx).b.v instanceof String){
						                          ((EContext)_localctx).v =  eval((String)((EContext)_localctx).b.v, (((EContext)_localctx).op!=null?((EContext)_localctx).op.getType():0), (Integer)((EContext)_localctx).a.v);
						                      } else {
						                          error();
						                      }
						                  
						}
						break;
					case 2:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(120);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(121);
						((EContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((EContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(122);
						((EContext)_localctx).b = e(7);

						                      if (((EContext)_localctx).a.v instanceof Integer && ((EContext)_localctx).b.v instanceof Integer){
						                          ((EContext)_localctx).v =  eval((Integer)((EContext)_localctx).a.v, (((EContext)_localctx).op!=null?((EContext)_localctx).op.getType():0), (Integer)((EContext)_localctx).b.v);
						                      } else if (((EContext)_localctx).a.v instanceof String && ((EContext)_localctx).b.v instanceof String){
						                          ((EContext)_localctx).v =  eval((String)((EContext)_localctx).a.v, (((EContext)_localctx).op!=null?((EContext)_localctx).op.getType():0), (String)((EContext)_localctx).b.v);
						                      } else if (((EContext)_localctx).a.v instanceof String && ((EContext)_localctx).b.v instanceof Integer){
						                          ((EContext)_localctx).v =  eval((String)((EContext)_localctx).a.v, (((EContext)_localctx).op!=null?((EContext)_localctx).op.getType():0), (Integer)((EContext)_localctx).b.v);
						                      } else if (((EContext)_localctx).a.v instanceof Integer && ((EContext)_localctx).b.v instanceof String){
						                          ((EContext)_localctx).v =  eval((String)((EContext)_localctx).b.v, (((EContext)_localctx).op!=null?((EContext)_localctx).op.getType():0), (Integer)((EContext)_localctx).a.v);
						                      } else {
						                          error();
						                      }
						                  
						}
						break;
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
			setState(130);
			((IdListContext)_localctx).ID = match(ID);
			_localctx.ids.add((((IdListContext)_localctx).ID!=null?((IdListContext)_localctx).ID.getText():null));
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(132);
				match(T__5);
				setState(133);
				((IdListContext)_localctx).ID = match(ID);
				_localctx.ids.add((((IdListContext)_localctx).ID!=null?((IdListContext)_localctx).ID.getText():null));
				}
				}
				setState(139);
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
			setState(142);
			((EListContext)_localctx).a = e(0);
			_localctx.exprs.add(((EListContext)_localctx).a.v);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(144);
				match(T__5);
				setState(145);
				((EListContext)_localctx).b = e(0);
				_localctx.exprs.add(((EListContext)_localctx).b.v);
				}
				}
				setState(152);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u009e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3\30\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\39\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3D\n\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Q\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3^\n\3\3\3\3\3\5\3b\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4t\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0080\n\4\f\4\16\4\u0083\13\4\3\5\3\5\3\5"+
		"\3\5\3\5\7\5\u008a\n\5\f\5\16\5\u008d\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6\u0097\n\6\f\6\16\6\u009a\13\6\3\6\3\6\3\6\2\3\6\7\2\4\6\b\n\2"+
		"\4\3\2\t\n\3\2\13\f\u00b5\2\r\3\2\2\2\4a\3\2\2\2\6s\3\2\2\2\b\u0084\3"+
		"\2\2\2\n\u0090\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2"+
		"\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\7\16\2\2\22\27\5\6\4\2\23\24\7\3"+
		"\2\2\24\30\7\24\2\2\25\30\7\24\2\2\26\30\7\3\2\2\27\23\3\2\2\2\27\25\3"+
		"\2\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\32\b\3\1\2\32b\3\2\2\2\33\34\7\23"+
		"\2\2\34\35\7\4\2\2\35\"\5\6\4\2\36\37\7\3\2\2\37#\7\24\2\2 #\7\24\2\2"+
		"!#\7\3\2\2\"\36\3\2\2\2\" \3\2\2\2\"!\3\2\2\2#$\3\2\2\2$%\b\3\1\2%b\3"+
		"\2\2\2&\'\7\23\2\2\'(\7\5\2\2(-\5\6\4\2)*\7\3\2\2*.\7\24\2\2+.\7\24\2"+
		"\2,.\7\3\2\2-)\3\2\2\2-+\3\2\2\2-,\3\2\2\2./\3\2\2\2/\60\b\3\1\2\60b\3"+
		"\2\2\2\61\62\7\r\2\2\62\63\5\b\5\2\638\7\17\2\2\64\65\7\3\2\2\659\7\24"+
		"\2\2\669\7\24\2\2\679\7\3\2\28\64\3\2\2\28\66\3\2\2\28\67\3\2\2\29:\3"+
		"\2\2\2:;\b\3\1\2;b\3\2\2\2<=\7\r\2\2=>\5\b\5\2>C\7\20\2\2?@\7\3\2\2@D"+
		"\7\24\2\2AD\7\24\2\2BD\7\3\2\2C?\3\2\2\2CA\3\2\2\2CB\3\2\2\2DE\3\2\2\2"+
		"EF\b\3\1\2Fb\3\2\2\2GH\7\r\2\2HI\5\b\5\2IJ\7\17\2\2JK\7\5\2\2KP\5\n\6"+
		"\2LM\7\3\2\2MQ\7\24\2\2NQ\7\24\2\2OQ\7\3\2\2PL\3\2\2\2PN\3\2\2\2PO\3\2"+
		"\2\2QR\3\2\2\2RS\b\3\1\2Sb\3\2\2\2TU\7\r\2\2UV\5\b\5\2VW\7\20\2\2WX\7"+
		"\5\2\2X]\5\n\6\2YZ\7\3\2\2Z^\7\24\2\2[^\7\24\2\2\\^\7\3\2\2]Y\3\2\2\2"+
		"][\3\2\2\2]\\\3\2\2\2^_\3\2\2\2_`\b\3\1\2`b\3\2\2\2a\21\3\2\2\2a\33\3"+
		"\2\2\2a&\3\2\2\2a\61\3\2\2\2a<\3\2\2\2aG\3\2\2\2aT\3\2\2\2b\5\3\2\2\2"+
		"cd\b\4\1\2de\7\f\2\2ef\5\6\4\7fg\b\4\1\2gt\3\2\2\2hi\7\21\2\2it\b\4\1"+
		"\2jk\7\22\2\2kt\b\4\1\2lm\7\23\2\2mt\b\4\1\2no\7\6\2\2op\5\6\4\2pq\7\7"+
		"\2\2qr\b\4\1\2rt\3\2\2\2sc\3\2\2\2sh\3\2\2\2sj\3\2\2\2sl\3\2\2\2sn\3\2"+
		"\2\2t\u0081\3\2\2\2uv\f\t\2\2vw\t\2\2\2wx\5\6\4\nxy\b\4\1\2y\u0080\3\2"+
		"\2\2z{\f\b\2\2{|\t\3\2\2|}\5\6\4\t}~\b\4\1\2~\u0080\3\2\2\2\177u\3\2\2"+
		"\2\177z\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\7\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\23\2\2\u0085\u008b"+
		"\b\5\1\2\u0086\u0087\7\b\2\2\u0087\u0088\7\23\2\2\u0088\u008a\b\5\1\2"+
		"\u0089\u0086\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\b\5\1\2\u008f"+
		"\t\3\2\2\2\u0090\u0091\5\6\4\2\u0091\u0098\b\6\1\2\u0092\u0093\7\b\2\2"+
		"\u0093\u0094\5\6\4\2\u0094\u0095\b\6\1\2\u0095\u0097\3\2\2\2\u0096\u0092"+
		"\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\b\6\1\2\u009c\13\3\2\2"+
		"\2\20\17\27\"-8CP]as\177\u0081\u008b\u0098";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}