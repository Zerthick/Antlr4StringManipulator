// Generated from Expr.g4 by ANTLR 4.5.2

import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, MUL=5, DIV=6, ADD=7, SUB=8, VAR=9, PRINT=10, 
		STRING=11, INTEGER=12, INT=13, STR=14, ID=15, NEWLINE=16, WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "MUL", "DIV", "ADD", "SUB", "VAR", "PRINT", 
		"STRING", "INTEGER", "INT", "STR", "ID", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':='", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'var'", 
		"'print'", "'string'", "'int'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", "VAR", "PRINT", 
		"STRING", "INTEGER", "INT", "STR", "ID", "NEWLINE", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\6\16M\n\16\r\16\16\16N\3\17\3\17\7\17S\n\17\f"+
		"\17\16\17V\13\17\3\17\3\17\3\20\6\20[\n\20\r\20\16\20\\\3\20\7\20`\n\20"+
		"\f\20\16\20c\13\20\3\21\5\21f\n\21\3\21\3\21\3\22\6\22k\n\22\r\22\16\22"+
		"l\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23\3\2\6\3\2\62;\5\2\62;C\\c|\4\2C\\c|\4"+
		"\2\13\13\"\"u\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7*\3\2\2\2\t,\3\2\2\2\13.\3\2\2"+
		"\2\r\60\3\2\2\2\17\62\3\2\2\2\21\64\3\2\2\2\23\66\3\2\2\2\25:\3\2\2\2"+
		"\27@\3\2\2\2\31G\3\2\2\2\33L\3\2\2\2\35P\3\2\2\2\37Z\3\2\2\2!e\3\2\2\2"+
		"#j\3\2\2\2%&\7=\2\2&\4\3\2\2\2\'(\7<\2\2()\7?\2\2)\6\3\2\2\2*+\7*\2\2"+
		"+\b\3\2\2\2,-\7+\2\2-\n\3\2\2\2./\7,\2\2/\f\3\2\2\2\60\61\7\61\2\2\61"+
		"\16\3\2\2\2\62\63\7-\2\2\63\20\3\2\2\2\64\65\7/\2\2\65\22\3\2\2\2\66\67"+
		"\7x\2\2\678\7c\2\289\7t\2\29\24\3\2\2\2:;\7r\2\2;<\7t\2\2<=\7k\2\2=>\7"+
		"p\2\2>?\7v\2\2?\26\3\2\2\2@A\7u\2\2AB\7v\2\2BC\7t\2\2CD\7k\2\2DE\7p\2"+
		"\2EF\7i\2\2F\30\3\2\2\2GH\7k\2\2HI\7p\2\2IJ\7v\2\2J\32\3\2\2\2KM\t\2\2"+
		"\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\34\3\2\2\2PT\7$\2\2QS\t\3"+
		"\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7$"+
		"\2\2X\36\3\2\2\2Y[\t\4\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2"+
		"]a\3\2\2\2^`\t\2\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b \3\2\2\2"+
		"ca\3\2\2\2df\7\17\2\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\f\2\2h\"\3\2\2"+
		"\2ik\t\5\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\b\22"+
		"\2\2o$\3\2\2\2\t\2NT\\ael\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}