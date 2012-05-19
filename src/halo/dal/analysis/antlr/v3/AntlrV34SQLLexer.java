package halo.dal.analysis.antlr.v3;

// $ANTLR 3.4 /Users/akwei/antlrpro/sql/SQL.g 2012-05-16 21:09:03
import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class AntlrV34SQLLexer extends Lexer {

    public static final int EOF = -1;

    public static final int T__30 = 30;

    public static final int T__31 = 31;

    public static final int T__32 = 32;

    public static final int T__33 = 33;

    public static final int T__34 = 34;

    public static final int T__35 = 35;

    public static final int T__36 = 36;

    public static final int T__37 = 37;

    public static final int T__38 = 38;

    public static final int AND = 4;

    public static final int AS = 5;

    public static final int CROSS = 6;

    public static final int DELETE = 7;

    public static final int FROM = 8;

    public static final int FULL = 9;

    public static final int IN = 10;

    public static final int INNER = 11;

    public static final int INSERT = 12;

    public static final int INTO = 13;

    public static final int JOIN = 14;

    public static final int LEFT = 15;

    public static final int LEFT_CLOSE = 16;

    public static final int NOT = 17;

    public static final int ON = 18;

    public static final int OR = 19;

    public static final int PRE_SET = 20;

    public static final int RIGHT = 21;

    public static final int RIGHT_CLOSE = 22;

    public static final int SELECT = 23;

    public static final int SET = 24;

    public static final int UPDATE = 25;

    public static final int VALUES = 26;

    public static final int WHERE = 27;

    public static final int WORD = 28;

    public static final int WS = 29;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AntlrV34SQLLexer() {
    }

    public AntlrV34SQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }

    public AntlrV34SQLLexer(CharStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String getGrammarFileName() {
        return "/Users/akwei/antlrpro/sql/SQL.g";
    }

    @Override
    public void displayRecognitionError(String[] tokenNames,
            RecognitionException e) {
        // super.displayRecognitionError(tokenNames, e);
        // display nothing
    }

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:2:5: ( 'and' )
            // /Users/akwei/antlrpro/sql/SQL.g:2:7: 'and'
            {
                match("and");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "AND"
    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:3:4: ( 'as' )
            // /Users/akwei/antlrpro/sql/SQL.g:3:6: 'as'
            {
                match("as");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "AS"
    // $ANTLR start "CROSS"
    public final void mCROSS() throws RecognitionException {
        try {
            int _type = CROSS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:4:7: ( 'cross' )
            // /Users/akwei/antlrpro/sql/SQL.g:4:9: 'cross'
            {
                match("cross");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "CROSS"
    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:5:8: ( 'delete' )
            // /Users/akwei/antlrpro/sql/SQL.g:5:10: 'delete'
            {
                match("delete");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "DELETE"
    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:6:6: ( 'from' )
            // /Users/akwei/antlrpro/sql/SQL.g:6:8: 'from'
            {
                match("from");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "FROM"
    // $ANTLR start "FULL"
    public final void mFULL() throws RecognitionException {
        try {
            int _type = FULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:7:6: ( 'full' )
            // /Users/akwei/antlrpro/sql/SQL.g:7:8: 'full'
            {
                match("full");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "FULL"
    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:8:4: ( 'in' )
            // /Users/akwei/antlrpro/sql/SQL.g:8:6: 'in'
            {
                match("in");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "IN"
    // $ANTLR start "INNER"
    public final void mINNER() throws RecognitionException {
        try {
            int _type = INNER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:9:7: ( 'inner' )
            // /Users/akwei/antlrpro/sql/SQL.g:9:9: 'inner'
            {
                match("inner");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "INNER"
    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:10:8: ( 'insert' )
            // /Users/akwei/antlrpro/sql/SQL.g:10:10: 'insert'
            {
                match("insert");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "INSERT"
    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:11:6: ( 'into' )
            // /Users/akwei/antlrpro/sql/SQL.g:11:8: 'into'
            {
                match("into");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "INTO"
    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:12:6: ( 'join' )
            // /Users/akwei/antlrpro/sql/SQL.g:12:8: 'join'
            {
                match("join");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "JOIN"
    // $ANTLR start "LEFT"
    public final void mLEFT() throws RecognitionException {
        try {
            int _type = LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:13:6: ( 'left' )
            // /Users/akwei/antlrpro/sql/SQL.g:13:8: 'left'
            {
                match("left");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "LEFT"
    // $ANTLR start "LEFT_CLOSE"
    public final void mLEFT_CLOSE() throws RecognitionException {
        try {
            int _type = LEFT_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:14:12: ( '(' )
            // /Users/akwei/antlrpro/sql/SQL.g:14:14: '('
            {
                match('(');
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "LEFT_CLOSE"
    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:15:5: ( 'not' )
            // /Users/akwei/antlrpro/sql/SQL.g:15:7: 'not'
            {
                match("not");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "NOT"
    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:16:4: ( 'on' )
            // /Users/akwei/antlrpro/sql/SQL.g:16:6: 'on'
            {
                match("on");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "ON"
    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:17:4: ( 'or' )
            // /Users/akwei/antlrpro/sql/SQL.g:17:6: 'or'
            {
                match("or");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "OR"
    // $ANTLR start "PRE_SET"
    public final void mPRE_SET() throws RecognitionException {
        try {
            int _type = PRE_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:18:9: ( '?' )
            // /Users/akwei/antlrpro/sql/SQL.g:18:11: '?'
            {
                match('?');
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "PRE_SET"
    // $ANTLR start "RIGHT"
    public final void mRIGHT() throws RecognitionException {
        try {
            int _type = RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:19:7: ( 'right' )
            // /Users/akwei/antlrpro/sql/SQL.g:19:9: 'right'
            {
                match("right");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "RIGHT"
    // $ANTLR start "RIGHT_CLOSE"
    public final void mRIGHT_CLOSE() throws RecognitionException {
        try {
            int _type = RIGHT_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:20:13: ( ')' )
            // /Users/akwei/antlrpro/sql/SQL.g:20:15: ')'
            {
                match(')');
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "RIGHT_CLOSE"
    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:21:8: ( 'select' )
            // /Users/akwei/antlrpro/sql/SQL.g:21:10: 'select'
            {
                match("select");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "SELECT"
    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:22:5: ( 'set' )
            // /Users/akwei/antlrpro/sql/SQL.g:22:7: 'set'
            {
                match("set");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "SET"
    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:23:8: ( 'update' )
            // /Users/akwei/antlrpro/sql/SQL.g:23:10: 'update'
            {
                match("update");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "UPDATE"
    // $ANTLR start "VALUES"
    public final void mVALUES() throws RecognitionException {
        try {
            int _type = VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:24:8: ( 'values' )
            // /Users/akwei/antlrpro/sql/SQL.g:24:10: 'values'
            {
                match("values");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "VALUES"
    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:25:7: ( 'where' )
            // /Users/akwei/antlrpro/sql/SQL.g:25:9: 'where'
            {
                match("where");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "WHERE"
    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:26:7: ( '!=' )
            // /Users/akwei/antlrpro/sql/SQL.g:26:9: '!='
            {
                match("!=");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__30"
    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:27:7: ( '*' )
            // /Users/akwei/antlrpro/sql/SQL.g:27:9: '*'
            {
                match('*');
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__31"
    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:28:7: ( ',' )
            // /Users/akwei/antlrpro/sql/SQL.g:28:9: ','
            {
                match(',');
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__32"
    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:29:7: ( '<' )
            // /Users/akwei/antlrpro/sql/SQL.g:29:9: '<'
            {
                match('<');
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__33"
    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:30:7: ( '<=' )
            // /Users/akwei/antlrpro/sql/SQL.g:30:9: '<='
            {
                match("<=");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__34"
    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:31:7: ( '<>' )
            // /Users/akwei/antlrpro/sql/SQL.g:31:9: '<>'
            {
                match("<>");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__35"
    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:32:7: ( '=' )
            // /Users/akwei/antlrpro/sql/SQL.g:32:9: '='
            {
                match('=');
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__36"
    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:33:7: ( '>' )
            // /Users/akwei/antlrpro/sql/SQL.g:33:9: '>'
            {
                match('>');
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__37"
    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:34:7: ( '>=' )
            // /Users/akwei/antlrpro/sql/SQL.g:34:9: '>='
            {
                match(">=");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__38"
    // $ANTLR start "WORD"
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:102:6: ( ( 'a' .. 'z' | 'A' ..
            // 'Z' | '0' .. '9' | '_' | '.' )+ )
            // /Users/akwei/antlrpro/sql/SQL.g:103:2: ( 'a' .. 'z' | 'A' .. 'Z'
            // | '0' .. '9' | '_' | '.' )+
            {
                // /Users/akwei/antlrpro/sql/SQL.g:103:2: ( 'a' .. 'z' | 'A' ..
                // 'Z' | '0' .. '9' | '_' | '.' )+
                int cnt1 = 0;
                loop1: do {
                    int alt1 = 2;
                    int LA1_0 = input.LA(1);
                    if ((LA1_0 == '.' || (LA1_0 >= '0' && LA1_0 <= '9')
                            || (LA1_0 >= 'A' && LA1_0 <= 'Z') || LA1_0 == '_' || (LA1_0 >= 'a' && LA1_0 <= 'z'))) {
                        alt1 = 1;
                    }
                    switch (alt1) {
                        case 1:
                        // /Users/akwei/antlrpro/sql/SQL.g:
                        {
                            if (input.LA(1) == '.'
                                    || (input.LA(1) >= '0' && input.LA(1) <= '9')
                                    || (input.LA(1) >= 'A' && input.LA(1) <= 'Z')
                                    || input.LA(1) == '_'
                                    || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(
                                        null, input);
                                recover(mse);
                                throw mse;
                            }
                        }
                            break;
                        default:
                            if (cnt1 >= 1)
                                break loop1;
                            EarlyExitException eee = new EarlyExitException(1,
                                    input);
                            throw eee;
                    }
                    cnt1++;
                }
                while (true);
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "WORD"
    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/SQL.g:106:5: ( ( ' ' | '\\t' | '\\r' |
            // '\\n' ) )
            // /Users/akwei/antlrpro/sql/SQL.g:106:9: ( ' ' | '\\t' | '\\r' |
            // '\\n' )
            {
                if ((input.LA(1) >= '\t' && input.LA(1) <= '\n')
                        || input.LA(1) == '\r' || input.LA(1) == ' ') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
                _channel = HIDDEN;
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "WS"
    public void mTokens() throws RecognitionException {
        // /Users/akwei/antlrpro/sql/SQL.g:1:8: ( AND | AS | CROSS | DELETE |
        // FROM | FULL | IN | INNER | INSERT | INTO | JOIN | LEFT | LEFT_CLOSE |
        // NOT | ON | OR | PRE_SET | RIGHT | RIGHT_CLOSE | SELECT | SET | UPDATE
        // | VALUES | WHERE | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 |
        // T__36 | T__37 | T__38 | WORD | WS )
        int alt2 = 35;
        alt2 = dfa2.predict(input);
        switch (alt2) {
            case 1:
            // /Users/akwei/antlrpro/sql/SQL.g:1:10: AND
            {
                mAND();
            }
                break;
            case 2:
            // /Users/akwei/antlrpro/sql/SQL.g:1:14: AS
            {
                mAS();
            }
                break;
            case 3:
            // /Users/akwei/antlrpro/sql/SQL.g:1:17: CROSS
            {
                mCROSS();
            }
                break;
            case 4:
            // /Users/akwei/antlrpro/sql/SQL.g:1:23: DELETE
            {
                mDELETE();
            }
                break;
            case 5:
            // /Users/akwei/antlrpro/sql/SQL.g:1:30: FROM
            {
                mFROM();
            }
                break;
            case 6:
            // /Users/akwei/antlrpro/sql/SQL.g:1:35: FULL
            {
                mFULL();
            }
                break;
            case 7:
            // /Users/akwei/antlrpro/sql/SQL.g:1:40: IN
            {
                mIN();
            }
                break;
            case 8:
            // /Users/akwei/antlrpro/sql/SQL.g:1:43: INNER
            {
                mINNER();
            }
                break;
            case 9:
            // /Users/akwei/antlrpro/sql/SQL.g:1:49: INSERT
            {
                mINSERT();
            }
                break;
            case 10:
            // /Users/akwei/antlrpro/sql/SQL.g:1:56: INTO
            {
                mINTO();
            }
                break;
            case 11:
            // /Users/akwei/antlrpro/sql/SQL.g:1:61: JOIN
            {
                mJOIN();
            }
                break;
            case 12:
            // /Users/akwei/antlrpro/sql/SQL.g:1:66: LEFT
            {
                mLEFT();
            }
                break;
            case 13:
            // /Users/akwei/antlrpro/sql/SQL.g:1:71: LEFT_CLOSE
            {
                mLEFT_CLOSE();
            }
                break;
            case 14:
            // /Users/akwei/antlrpro/sql/SQL.g:1:82: NOT
            {
                mNOT();
            }
                break;
            case 15:
            // /Users/akwei/antlrpro/sql/SQL.g:1:86: ON
            {
                mON();
            }
                break;
            case 16:
            // /Users/akwei/antlrpro/sql/SQL.g:1:89: OR
            {
                mOR();
            }
                break;
            case 17:
            // /Users/akwei/antlrpro/sql/SQL.g:1:92: PRE_SET
            {
                mPRE_SET();
            }
                break;
            case 18:
            // /Users/akwei/antlrpro/sql/SQL.g:1:100: RIGHT
            {
                mRIGHT();
            }
                break;
            case 19:
            // /Users/akwei/antlrpro/sql/SQL.g:1:106: RIGHT_CLOSE
            {
                mRIGHT_CLOSE();
            }
                break;
            case 20:
            // /Users/akwei/antlrpro/sql/SQL.g:1:118: SELECT
            {
                mSELECT();
            }
                break;
            case 21:
            // /Users/akwei/antlrpro/sql/SQL.g:1:125: SET
            {
                mSET();
            }
                break;
            case 22:
            // /Users/akwei/antlrpro/sql/SQL.g:1:129: UPDATE
            {
                mUPDATE();
            }
                break;
            case 23:
            // /Users/akwei/antlrpro/sql/SQL.g:1:136: VALUES
            {
                mVALUES();
            }
                break;
            case 24:
            // /Users/akwei/antlrpro/sql/SQL.g:1:143: WHERE
            {
                mWHERE();
            }
                break;
            case 25:
            // /Users/akwei/antlrpro/sql/SQL.g:1:149: T__30
            {
                mT__30();
            }
                break;
            case 26:
            // /Users/akwei/antlrpro/sql/SQL.g:1:155: T__31
            {
                mT__31();
            }
                break;
            case 27:
            // /Users/akwei/antlrpro/sql/SQL.g:1:161: T__32
            {
                mT__32();
            }
                break;
            case 28:
            // /Users/akwei/antlrpro/sql/SQL.g:1:167: T__33
            {
                mT__33();
            }
                break;
            case 29:
            // /Users/akwei/antlrpro/sql/SQL.g:1:173: T__34
            {
                mT__34();
            }
                break;
            case 30:
            // /Users/akwei/antlrpro/sql/SQL.g:1:179: T__35
            {
                mT__35();
            }
                break;
            case 31:
            // /Users/akwei/antlrpro/sql/SQL.g:1:185: T__36
            {
                mT__36();
            }
                break;
            case 32:
            // /Users/akwei/antlrpro/sql/SQL.g:1:191: T__37
            {
                mT__37();
            }
                break;
            case 33:
            // /Users/akwei/antlrpro/sql/SQL.g:1:197: T__38
            {
                mT__38();
            }
                break;
            case 34:
            // /Users/akwei/antlrpro/sql/SQL.g:1:203: WORD
            {
                mWORD();
            }
                break;
            case 35:
            // /Users/akwei/antlrpro/sql/SQL.g:1:208: WS
            {
                mWS();
            }
                break;
        }
    }

    protected DFA2 dfa2 = new DFA2(this);

    static final String DFA2_eotS = "\1\uffff\7\30\1\uffff\2\30\1\uffff\1\30\1\uffff\4\30\3\uffff\1\55"
            + "\1\uffff\1\57\2\uffff\1\30\1\61\4\30\1\71\3\30\1\75\1\76\5\30\5"
            + "\uffff\1\105\1\uffff\7\30\1\uffff\2\30\1\117\2\uffff\2\30\1\122"
            + "\3\30\1\uffff\2\30\1\130\1\131\2\30\1\134\1\135\1\136\1\uffff\2"
            + "\30\1\uffff\3\30\1\144\1\30\2\uffff\1\146\1\30\3\uffff\1\150\3\30"
            + "\1\154\1\uffff\1\155\1\uffff\1\156\1\uffff\1\157\1\160\1\161\6\uffff";

    static final String DFA2_eofS = "\162\uffff";

    static final String DFA2_minS = "\1\11\1\156\1\162\1\145\1\162\1\156\1\157\1\145\1\uffff\1\157\1"
            + "\156\1\uffff\1\151\1\uffff\1\145\1\160\1\141\1\150\3\uffff\1\75"
            + "\1\uffff\1\75\2\uffff\1\144\1\56\1\157\1\154\1\157\1\154\1\56\1"
            + "\151\1\146\1\164\2\56\1\147\1\154\1\144\1\154\1\145\5\uffff\1\56"
            + "\1\uffff\1\163\1\145\1\155\1\154\2\145\1\157\1\uffff\1\156\1\164"
            + "\1\56\2\uffff\1\150\1\145\1\56\1\141\1\165\1\162\1\uffff\1\163\1"
            + "\164\2\56\2\162\3\56\1\uffff\1\164\1\143\1\uffff\1\164\2\145\1\56"
            + "\1\145\2\uffff\1\56\1\164\3\uffff\1\56\1\164\1\145\1\163\1\56\1"
            + "\uffff\1\56\1\uffff\1\56\1\uffff\3\56\6\uffff";

    static final String DFA2_maxS = "\1\172\1\163\1\162\1\145\1\165\1\156\1\157\1\145\1\uffff\1\157\1"
            + "\162\1\uffff\1\151\1\uffff\1\145\1\160\1\141\1\150\3\uffff\1\76"
            + "\1\uffff\1\75\2\uffff\1\144\1\172\1\157\1\154\1\157\1\154\1\172"
            + "\1\151\1\146\1\164\2\172\1\147\1\164\1\144\1\154\1\145\5\uffff\1"
            + "\172\1\uffff\1\163\1\145\1\155\1\154\2\145\1\157\1\uffff\1\156\1"
            + "\164\1\172\2\uffff\1\150\1\145\1\172\1\141\1\165\1\162\1\uffff\1"
            + "\163\1\164\2\172\2\162\3\172\1\uffff\1\164\1\143\1\uffff\1\164\2"
            + "\145\1\172\1\145\2\uffff\1\172\1\164\3\uffff\1\172\1\164\1\145\1"
            + "\163\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\3\172\6\uffff";

    static final String DFA2_acceptS = "\10\uffff\1\15\2\uffff\1\21\1\uffff\1\23\4\uffff\1\31\1\32\1\33"
            + "\1\uffff\1\37\1\uffff\1\42\1\43\21\uffff\1\35\1\36\1\34\1\41\1\40"
            + "\1\uffff\1\2\7\uffff\1\7\3\uffff\1\17\1\20\6\uffff\1\1\11\uffff"
            + "\1\16\2\uffff\1\25\5\uffff\1\5\1\6\2\uffff\1\12\1\13\1\14\5\uffff"
            + "\1\3\1\uffff\1\10\1\uffff\1\22\3\uffff\1\30\1\4\1\11\1\24\1\26\1"
            + "\27";

    static final String DFA2_specialS = "\162\uffff}>";

    static final String[] DFA2_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\1\22\6\uffff\1\10\1\15\1\23"
                    + "\1\uffff\1\24\1\uffff\1\30\1\uffff\12\30\2\uffff\1\25\1\26\1"
                    + "\27\1\13\1\uffff\32\30\4\uffff\1\30\1\uffff\1\1\1\30\1\2\1\3"
                    + "\1\30\1\4\2\30\1\5\1\6\1\30\1\7\1\30\1\11\1\12\2\30\1\14\1\16"
                    + "\1\30\1\17\1\20\1\21\3\30",
            "\1\32\4\uffff\1\33",
            "\1\34",
            "\1\35",
            "\1\36\2\uffff\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            "\1\43",
            "\1\44\3\uffff\1\45",
            "",
            "\1\46",
            "",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "",
            "",
            "\1\53\1\54",
            "",
            "\1\56",
            "",
            "",
            "\1\60",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\15\30"
                    + "\1\66\4\30\1\67\1\70\6\30", "\1\72", "\1\73", "\1\74",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\77", "\1\100\7\uffff\1\101", "\1\102", "\1\103", "\1\104", "",
            "", "", "", "",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30", "",
            "\1\106", "\1\107", "\1\110", "\1\111", "\1\112", "\1\113",
            "\1\114", "", "\1\115", "\1\116",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30", "",
            "", "\1\120", "\1\121",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\123", "\1\124", "\1\125", "", "\1\126", "\1\127",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\132", "\1\133",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30", "",
            "\1\137", "\1\140", "", "\1\141", "\1\142", "\1\143",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\145", "", "",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\147", "", "", "",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\151", "\1\152", "\1\153",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30", "",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30", "",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30", "",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30", "",
            "", "", "", "", "" };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);

    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);

    static final char[] DFA2_min = DFA
            .unpackEncodedStringToUnsignedChars(DFA2_minS);

    static final char[] DFA2_max = DFA
            .unpackEncodedStringToUnsignedChars(DFA2_maxS);

    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);

    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);

    static final short[][] DFA2_transition;
    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }

        public String getDescription() {
            return "1:1: Tokens : ( AND | AS | CROSS | DELETE | FROM | FULL | IN | INNER | INSERT | INTO | JOIN | LEFT | LEFT_CLOSE | NOT | ON | OR | PRE_SET | RIGHT | RIGHT_CLOSE | SELECT | SET | UPDATE | VALUES | WHERE | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | WORD | WS );";
        }
    }
}