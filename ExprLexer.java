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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, MUL=6, DIV=7, ADD=8, SUB=9, VAR=10, 
		PRINT=11, STRING=12, INTEGER=13, INT=14, STR=15, ID=16, NEWLINE=17, WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "MUL", "DIV", "ADD", "SUB", "VAR", 
		"PRINT", "STRING", "INTEGER", "INT", "STR", "ID", "NEWLINE", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\6\17Q\n\17\r\17\16\17R\3\20"+
		"\3\20\7\20W\n\20\f\20\16\20Z\13\20\3\20\3\20\3\21\6\21_\n\21\r\21\16\21"+
		"`\3\21\7\21d\n\21\f\21\16\21g\13\21\3\22\5\22j\n\22\3\22\3\22\3\23\6\23"+
		"o\n\23\r\23\16\23p\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\6\3\2\62;\5\2"+
		"\62;C\\c|\4\2C\\c|\4\2\13\13\"\"y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2"+
		"\2\7,\3\2\2\2\t.\3\2\2\2\13\60\3\2\2\2\r\62\3\2\2\2\17\64\3\2\2\2\21\66"+
		"\3\2\2\2\238\3\2\2\2\25:\3\2\2\2\27>\3\2\2\2\31D\3\2\2\2\33K\3\2\2\2\35"+
		"P\3\2\2\2\37T\3\2\2\2!^\3\2\2\2#i\3\2\2\2%n\3\2\2\2\'(\7=\2\2(\4\3\2\2"+
		"\2)*\7<\2\2*+\7?\2\2+\6\3\2\2\2,-\7*\2\2-\b\3\2\2\2./\7+\2\2/\n\3\2\2"+
		"\2\60\61\7.\2\2\61\f\3\2\2\2\62\63\7,\2\2\63\16\3\2\2\2\64\65\7\61\2\2"+
		"\65\20\3\2\2\2\66\67\7-\2\2\67\22\3\2\2\289\7/\2\29\24\3\2\2\2:;\7x\2"+
		"\2;<\7c\2\2<=\7t\2\2=\26\3\2\2\2>?\7r\2\2?@\7t\2\2@A\7k\2\2AB\7p\2\2B"+
		"C\7v\2\2C\30\3\2\2\2DE\7u\2\2EF\7v\2\2FG\7t\2\2GH\7k\2\2HI\7p\2\2IJ\7"+
		"i\2\2J\32\3\2\2\2KL\7k\2\2LM\7p\2\2MN\7v\2\2N\34\3\2\2\2OQ\t\2\2\2PO\3"+
		"\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\36\3\2\2\2TX\7$\2\2UW\t\3\2\2VU"+
		"\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7$\2\2\\"+
		" \3\2\2\2]_\t\4\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ae\3\2\2\2"+
		"bd\t\2\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\"\3\2\2\2ge\3\2\2"+
		"\2hj\7\17\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\f\2\2l$\3\2\2\2mo\t\5"+
		"\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\b\23\2\2s&\3"+
		"\2\2\2\t\2RX`eip\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}