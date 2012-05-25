package halo.dal.analysis.antlr.v3;

// $ANTLR 3.4 /Users/akwei/antlrpro/sql/AntlrV3SQL.g 2012-05-23 12:03:35
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class AntlrV3SQLLexer extends Lexer {

    public static final int EOF = -1;

    public static final int T__51 = 51;

    public static final int T__52 = 52;

    public static final int T__53 = 53;

    public static final int T__54 = 54;

    public static final int T__55 = 55;

    public static final int T__56 = 56;

    public static final int T__57 = 57;

    public static final int T__58 = 58;

    public static final int T__59 = 59;

    public static final int T__60 = 60;

    public static final int T__61 = 61;

    public static final int T__62 = 62;

    public static final int T__63 = 63;

    public static final int T__64 = 64;

    public static final int T__65 = 65;

    public static final int AND = 4;

    public static final int AND_ = 5;

    public static final int AS = 6;

    public static final int AS_ = 7;

    public static final int CROSS = 8;

    public static final int CROSS_ = 9;

    public static final int DELETE = 10;

    public static final int DELETE_ = 11;

    public static final int FROM = 12;

    public static final int FROM_ = 13;

    public static final int FULL = 14;

    public static final int FULL_ = 15;

    public static final int IN = 16;

    public static final int INNER = 17;

    public static final int INNER_ = 18;

    public static final int INSERT = 19;

    public static final int INSERT_ = 20;

    public static final int INTO = 21;

    public static final int INTO_ = 22;

    public static final int IN_ = 23;

    public static final int JOIN = 24;

    public static final int JOIN_ = 25;

    public static final int LEFT = 26;

    public static final int LEFT_ = 27;

    public static final int LEFT_CLOSE = 28;

    public static final int NOT = 29;

    public static final int NOT_ = 30;

    public static final int ON = 31;

    public static final int ON_ = 32;

    public static final int OR = 33;

    public static final int OR_ = 34;

    public static final int PRE_SET = 35;

    public static final int RIGHT = 36;

    public static final int RIGHT_ = 37;

    public static final int RIGHT_CLOSE = 38;

    public static final int SELECT = 39;

    public static final int SELECT_ = 40;

    public static final int SET = 41;

    public static final int SET_ = 42;

    public static final int UPDATE = 43;

    public static final int UPDATE_ = 44;

    public static final int VALUES = 45;

    public static final int VALUES_ = 46;

    public static final int WHERE = 47;

    public static final int WHERE_ = 48;

    public static final int WORD = 49;

    public static final int WS = 50;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AntlrV3SQLLexer() {
    }

    public AntlrV3SQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }

    public AntlrV3SQLLexer(CharStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String getGrammarFileName() {
        return "/Users/akwei/antlrpro/sql/AntlrV3SQL.g";
    }

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:2:5: ( 'and' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:2:7: 'and'
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
    // $ANTLR start "AND_"
    public final void mAND_() throws RecognitionException {
        try {
            int _type = AND_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:3:6: ( 'AND' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:3:8: 'AND'
            {
                match("AND");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "AND_"
    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:4:4: ( 'as' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:4:6: 'as'
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
    // $ANTLR start "AS_"
    public final void mAS_() throws RecognitionException {
        try {
            int _type = AS_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:5:5: ( 'AS' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:5:7: 'AS'
            {
                match("AS");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "AS_"
    // $ANTLR start "CROSS"
    public final void mCROSS() throws RecognitionException {
        try {
            int _type = CROSS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:6:7: ( 'cross' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:6:9: 'cross'
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
    // $ANTLR start "CROSS_"
    public final void mCROSS_() throws RecognitionException {
        try {
            int _type = CROSS_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:7:8: ( 'CROSS' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:7:10: 'CROSS'
            {
                match("CROSS");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "CROSS_"
    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:8:8: ( 'delete' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:8:10: 'delete'
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
    // $ANTLR start "DELETE_"
    public final void mDELETE_() throws RecognitionException {
        try {
            int _type = DELETE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:9:9: ( 'DELETE' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:9:11: 'DELETE'
            {
                match("DELETE");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "DELETE_"
    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:10:6: ( 'from' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:10:8: 'from'
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
    // $ANTLR start "FROM_"
    public final void mFROM_() throws RecognitionException {
        try {
            int _type = FROM_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:11:7: ( 'FROM' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:11:9: 'FROM'
            {
                match("FROM");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "FROM_"
    // $ANTLR start "FULL"
    public final void mFULL() throws RecognitionException {
        try {
            int _type = FULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:12:6: ( 'full' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:12:8: 'full'
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
    // $ANTLR start "FULL_"
    public final void mFULL_() throws RecognitionException {
        try {
            int _type = FULL_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:13:7: ( 'FULL' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:13:9: 'FULL'
            {
                match("FULL");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "FULL_"
    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:14:4: ( 'in' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:14:6: 'in'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:15:7: ( 'inner' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:15:9: 'inner'
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
    // $ANTLR start "INNER_"
    public final void mINNER_() throws RecognitionException {
        try {
            int _type = INNER_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:16:8: ( 'INNER' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:16:10: 'INNER'
            {
                match("INNER");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "INNER_"
    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:17:8: ( 'insert' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:17:10: 'insert'
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
    // $ANTLR start "INSERT_"
    public final void mINSERT_() throws RecognitionException {
        try {
            int _type = INSERT_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:18:9: ( 'INSERT' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:18:11: 'INSERT'
            {
                match("INSERT");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "INSERT_"
    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:19:6: ( 'into' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:19:8: 'into'
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
    // $ANTLR start "INTO_"
    public final void mINTO_() throws RecognitionException {
        try {
            int _type = INTO_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:20:7: ( 'INTO' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:20:9: 'INTO'
            {
                match("INTO");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "INTO_"
    // $ANTLR start "IN_"
    public final void mIN_() throws RecognitionException {
        try {
            int _type = IN_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:21:5: ( 'IN' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:21:7: 'IN'
            {
                match("IN");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "IN_"
    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:22:6: ( 'join' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:22:8: 'join'
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
    // $ANTLR start "JOIN_"
    public final void mJOIN_() throws RecognitionException {
        try {
            int _type = JOIN_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:23:7: ( 'JOIN' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:23:9: 'JOIN'
            {
                match("JOIN");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "JOIN_"
    // $ANTLR start "LEFT"
    public final void mLEFT() throws RecognitionException {
        try {
            int _type = LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:24:6: ( 'left' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:24:8: 'left'
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
    // $ANTLR start "LEFT_"
    public final void mLEFT_() throws RecognitionException {
        try {
            int _type = LEFT_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:25:7: ( 'LEFT' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:25:9: 'LEFT'
            {
                match("LEFT");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "LEFT_"
    // $ANTLR start "LEFT_CLOSE"
    public final void mLEFT_CLOSE() throws RecognitionException {
        try {
            int _type = LEFT_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:26:12: ( '(' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:26:14: '('
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:27:5: ( 'not' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:27:7: 'not'
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
    // $ANTLR start "NOT_"
    public final void mNOT_() throws RecognitionException {
        try {
            int _type = NOT_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:28:6: ( 'NOT' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:28:8: 'NOT'
            {
                match("NOT");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "NOT_"
    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:29:4: ( 'on' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:29:6: 'on'
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
    // $ANTLR start "ON_"
    public final void mON_() throws RecognitionException {
        try {
            int _type = ON_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:30:5: ( 'ON' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:30:7: 'ON'
            {
                match("ON");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "ON_"
    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:31:4: ( 'or' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:31:6: 'or'
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
    // $ANTLR start "OR_"
    public final void mOR_() throws RecognitionException {
        try {
            int _type = OR_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:32:5: ( 'OR' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:32:7: 'OR'
            {
                match("OR");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "OR_"
    // $ANTLR start "PRE_SET"
    public final void mPRE_SET() throws RecognitionException {
        try {
            int _type = PRE_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:33:9: ( '?' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:33:11: '?'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:34:7: ( 'right' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:34:9: 'right'
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
    // $ANTLR start "RIGHT_"
    public final void mRIGHT_() throws RecognitionException {
        try {
            int _type = RIGHT_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:35:8: ( 'RIGHT' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:35:10: 'RIGHT'
            {
                match("RIGHT");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "RIGHT_"
    // $ANTLR start "RIGHT_CLOSE"
    public final void mRIGHT_CLOSE() throws RecognitionException {
        try {
            int _type = RIGHT_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:36:13: ( ')' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:36:15: ')'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:37:8: ( 'select' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:37:10: 'select'
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
    // $ANTLR start "SELECT_"
    public final void mSELECT_() throws RecognitionException {
        try {
            int _type = SELECT_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:38:9: ( 'SELECT' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:38:11: 'SELECT'
            {
                match("SELECT");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "SELECT_"
    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:39:5: ( 'set' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:39:7: 'set'
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
    // $ANTLR start "SET_"
    public final void mSET_() throws RecognitionException {
        try {
            int _type = SET_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:40:6: ( 'SET' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:40:8: 'SET'
            {
                match("SET");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "SET_"
    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:41:8: ( 'update' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:41:10: 'update'
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
    // $ANTLR start "UPDATE_"
    public final void mUPDATE_() throws RecognitionException {
        try {
            int _type = UPDATE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:42:9: ( 'UPDATE' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:42:11: 'UPDATE'
            {
                match("UPDATE");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "UPDATE_"
    // $ANTLR start "VALUES"
    public final void mVALUES() throws RecognitionException {
        try {
            int _type = VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:43:8: ( 'values' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:43:10: 'values'
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
    // $ANTLR start "VALUES_"
    public final void mVALUES_() throws RecognitionException {
        try {
            int _type = VALUES_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:44:9: ( 'VALUES' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:44:11: 'VALUES'
            {
                match("VALUES");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "VALUES_"
    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:45:7: ( 'where' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:45:9: 'where'
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
    // $ANTLR start "WHERE_"
    public final void mWHERE_() throws RecognitionException {
        try {
            int _type = WHERE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:46:8: ( 'WHERE' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:46:10: 'WHERE'
            {
                match("WHERE");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "WHERE_"
    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:47:7: ( '!=' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:47:9: '!='
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

    // $ANTLR end "T__51"
    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:48:7: ( '*' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:48:9: '*'
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

    // $ANTLR end "T__52"
    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:49:7: ( ',' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:49:9: ','
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

    // $ANTLR end "T__53"
    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:50:7: ( '<' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:50:9: '<'
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

    // $ANTLR end "T__54"
    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:51:7: ( '<=' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:51:9: '<='
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

    // $ANTLR end "T__55"
    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:52:7: ( '<>' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:52:9: '<>'
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

    // $ANTLR end "T__56"
    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:53:7: ( '=' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:53:9: '='
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

    // $ANTLR end "T__57"
    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:54:7: ( '>' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:54:9: '>'
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

    // $ANTLR end "T__58"
    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:55:7: ( '>=' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:55:9: '>='
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

    // $ANTLR end "T__59"
    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:56:7: ( 'GROUP' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:56:9: 'GROUP'
            {
                match("GROUP");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__60"
    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:57:7: ( 'HAVING' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:57:9: 'HAVING'
            {
                match("HAVING");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__61"
    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:58:7: ( 'ORDER' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:58:9: 'ORDER'
            {
                match("ORDER");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__62"
    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:59:7: ( 'group' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:59:9: 'group'
            {
                match("group");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__63"
    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:60:7: ( 'having' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:60:9: 'having'
            {
                match("having");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__64"
    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:61:7: ( 'order' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:61:9: 'order'
            {
                match("order");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__65"
    // $ANTLR start "WORD"
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:151:6: ( ( 'a' .. 'z' |
            // 'A' .. 'Z' | '0' .. '9' | '_' | '.' )+ )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:152:2: ( 'a' .. 'z' | 'A'
            // .. 'Z' | '0' .. '9' | '_' | '.' )+
            {
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:152:2: ( 'a' .. 'z' |
                // 'A' .. 'Z' | '0' .. '9' | '_' | '.' )+
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
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:155:5: ( ( ' ' | '\\t' |
            // '\\r' | '\\n' ) )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:155:9: ( ' ' | '\\t' |
            // '\\r' | '\\n' )
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
        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:8: ( AND | AND_ | AS | AS_ |
        // CROSS | CROSS_ | DELETE | DELETE_ | FROM | FROM_ | FULL | FULL_ | IN
        // | INNER | INNER_ | INSERT | INSERT_ | INTO | INTO_ | IN_ | JOIN |
        // JOIN_ | LEFT | LEFT_ | LEFT_CLOSE | NOT | NOT_ | ON | ON_ | OR | OR_
        // | PRE_SET | RIGHT | RIGHT_ | RIGHT_CLOSE | SELECT | SELECT_ | SET |
        // SET_ | UPDATE | UPDATE_ | VALUES | VALUES_ | WHERE | WHERE_ | T__51 |
        // T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60
        // | T__61 | T__62 | T__63 | T__64 | T__65 | WORD | WS )
        int alt2 = 62;
        alt2 = dfa2.predict(input);
        switch (alt2) {
            case 1:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:10: AND
            {
                mAND();
            }
                break;
            case 2:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:14: AND_
            {
                mAND_();
            }
                break;
            case 3:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:19: AS
            {
                mAS();
            }
                break;
            case 4:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:22: AS_
            {
                mAS_();
            }
                break;
            case 5:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:26: CROSS
            {
                mCROSS();
            }
                break;
            case 6:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:32: CROSS_
            {
                mCROSS_();
            }
                break;
            case 7:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:39: DELETE
            {
                mDELETE();
            }
                break;
            case 8:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:46: DELETE_
            {
                mDELETE_();
            }
                break;
            case 9:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:54: FROM
            {
                mFROM();
            }
                break;
            case 10:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:59: FROM_
            {
                mFROM_();
            }
                break;
            case 11:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:65: FULL
            {
                mFULL();
            }
                break;
            case 12:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:70: FULL_
            {
                mFULL_();
            }
                break;
            case 13:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:76: IN
            {
                mIN();
            }
                break;
            case 14:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:79: INNER
            {
                mINNER();
            }
                break;
            case 15:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:85: INNER_
            {
                mINNER_();
            }
                break;
            case 16:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:92: INSERT
            {
                mINSERT();
            }
                break;
            case 17:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:99: INSERT_
            {
                mINSERT_();
            }
                break;
            case 18:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:107: INTO
            {
                mINTO();
            }
                break;
            case 19:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:112: INTO_
            {
                mINTO_();
            }
                break;
            case 20:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:118: IN_
            {
                mIN_();
            }
                break;
            case 21:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:122: JOIN
            {
                mJOIN();
            }
                break;
            case 22:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:127: JOIN_
            {
                mJOIN_();
            }
                break;
            case 23:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:133: LEFT
            {
                mLEFT();
            }
                break;
            case 24:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:138: LEFT_
            {
                mLEFT_();
            }
                break;
            case 25:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:144: LEFT_CLOSE
            {
                mLEFT_CLOSE();
            }
                break;
            case 26:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:155: NOT
            {
                mNOT();
            }
                break;
            case 27:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:159: NOT_
            {
                mNOT_();
            }
                break;
            case 28:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:164: ON
            {
                mON();
            }
                break;
            case 29:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:167: ON_
            {
                mON_();
            }
                break;
            case 30:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:171: OR
            {
                mOR();
            }
                break;
            case 31:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:174: OR_
            {
                mOR_();
            }
                break;
            case 32:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:178: PRE_SET
            {
                mPRE_SET();
            }
                break;
            case 33:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:186: RIGHT
            {
                mRIGHT();
            }
                break;
            case 34:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:192: RIGHT_
            {
                mRIGHT_();
            }
                break;
            case 35:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:199: RIGHT_CLOSE
            {
                mRIGHT_CLOSE();
            }
                break;
            case 36:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:211: SELECT
            {
                mSELECT();
            }
                break;
            case 37:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:218: SELECT_
            {
                mSELECT_();
            }
                break;
            case 38:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:226: SET
            {
                mSET();
            }
                break;
            case 39:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:230: SET_
            {
                mSET_();
            }
                break;
            case 40:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:235: UPDATE
            {
                mUPDATE();
            }
                break;
            case 41:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:242: UPDATE_
            {
                mUPDATE_();
            }
                break;
            case 42:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:250: VALUES
            {
                mVALUES();
            }
                break;
            case 43:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:257: VALUES_
            {
                mVALUES_();
            }
                break;
            case 44:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:265: WHERE
            {
                mWHERE();
            }
                break;
            case 45:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:271: WHERE_
            {
                mWHERE_();
            }
                break;
            case 46:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:278: T__51
            {
                mT__51();
            }
                break;
            case 47:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:284: T__52
            {
                mT__52();
            }
                break;
            case 48:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:290: T__53
            {
                mT__53();
            }
                break;
            case 49:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:296: T__54
            {
                mT__54();
            }
                break;
            case 50:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:302: T__55
            {
                mT__55();
            }
                break;
            case 51:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:308: T__56
            {
                mT__56();
            }
                break;
            case 52:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:314: T__57
            {
                mT__57();
            }
                break;
            case 53:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:320: T__58
            {
                mT__58();
            }
                break;
            case 54:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:326: T__59
            {
                mT__59();
            }
                break;
            case 55:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:332: T__60
            {
                mT__60();
            }
                break;
            case 56:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:338: T__61
            {
                mT__61();
            }
                break;
            case 57:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:344: T__62
            {
                mT__62();
            }
                break;
            case 58:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:350: T__63
            {
                mT__63();
            }
                break;
            case 59:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:356: T__64
            {
                mT__64();
            }
                break;
            case 60:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:362: T__65
            {
                mT__65();
            }
                break;
            case 61:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:368: WORD
            {
                mWORD();
            }
                break;
            case 62:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:373: WS
            {
                mWS();
            }
                break;
        }
    }

    protected DFA2 dfa2 = new DFA2(this);

    static final String DFA2_eotS = "\1\uffff\16\52\1\uffff\4\52\1\uffff\2\52\1\uffff\10\52\3\uffff\1"
            + "\120\1\uffff\1\122\4\52\2\uffff\1\52\1\130\1\52\1\132\10\52\1\146"
            + "\1\152\6\52\1\161\1\163\1\164\1\166\12\52\5\uffff\4\52\1\u0087\1"
            + "\uffff\1\u0088\1\uffff\13\52\1\uffff\3\52\1\uffff\4\52\1\u009b\1"
            + "\u009c\1\uffff\1\52\2\uffff\1\52\1\uffff\3\52\1\u00a2\1\52\1\u00a4"
            + "\12\52\2\uffff\4\52\1\u00b3\1\u00b4\1\u00b5\1\u00b6\2\52\1\u00b9"
            + "\2\52\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\2\uffff\5\52\1\uffff"
            + "\1\52\1\uffff\12\52\1\u00d1\1\u00d2\2\52\4\uffff\1\u00d5\1\52\1"
            + "\uffff\1\u00d7\1\52\5\uffff\1\u00d9\1\u00da\1\u00db\1\u00dc\6\52"
            + "\1\u00e3\1\u00e4\1\u00e5\1\52\1\u00e7\1\52\2\uffff\1\u00e9\1\u00ea"
            + "\1\uffff\1\u00eb\1\uffff\1\u00ec\4\uffff\1\u00ed\1\u00ee\1\u00ef"
            + "\1\u00f0\1\u00f1\1\u00f2\3\uffff\1\u00f3\1\uffff\1\u00f4\14\uffff";

    static final String DFA2_eofS = "\u00f5\uffff";

    static final String DFA2_minS = "\1\11\1\156\1\116\1\162\1\122\1\145\1\105\1\162\1\122\1\156\1\116"
            + "\1\157\1\117\1\145\1\105\1\uffff\1\157\1\117\1\156\1\116\1\uffff"
            + "\1\151\1\111\1\uffff\1\145\1\105\1\160\1\120\1\141\1\101\1\150\1"
            + "\110\3\uffff\1\75\1\uffff\1\75\1\122\1\101\1\162\1\141\2\uffff\1"
            + "\144\1\56\1\104\1\56\1\157\1\117\1\154\1\114\1\157\1\154\1\117\1"
            + "\114\2\56\1\151\1\111\1\146\1\106\1\164\1\124\4\56\1\147\1\107\1"
            + "\154\1\114\1\144\1\104\1\154\1\114\1\145\1\105\5\uffff\1\117\1\126"
            + "\1\157\1\166\1\56\1\uffff\1\56\1\uffff\1\163\1\123\1\145\1\105\1"
            + "\155\1\154\1\115\1\114\2\145\1\157\1\uffff\2\105\1\117\1\uffff\1"
            + "\156\1\116\1\164\1\124\2\56\1\uffff\1\145\2\uffff\1\105\1\uffff"
            + "\1\150\1\110\1\145\1\56\1\105\1\56\1\141\1\101\1\165\1\125\1\162"
            + "\1\122\1\125\1\111\1\165\1\151\2\uffff\1\163\1\123\1\164\1\124\4"
            + "\56\2\162\1\56\2\122\5\56\2\uffff\1\162\1\122\1\164\1\124\1\143"
            + "\1\uffff\1\103\1\uffff\1\164\1\124\1\145\1\105\1\145\1\105\1\120"
            + "\1\116\1\160\1\156\2\56\1\145\1\105\4\uffff\1\56\1\164\1\uffff\1"
            + "\56\1\124\5\uffff\4\56\1\164\1\124\1\145\1\105\1\163\1\123\3\56"
            + "\1\107\1\56\1\147\2\uffff\2\56\1\uffff\1\56\1\uffff\1\56\4\uffff"
            + "\6\56\3\uffff\1\56\1\uffff\1\56\14\uffff";

    static final String DFA2_maxS = "\1\172\1\163\1\123\1\162\1\122\1\145\1\105\1\165\1\125\1\156\1\116"
            + "\1\157\1\117\1\145\1\105\1\uffff\1\157\1\117\1\162\1\122\1\uffff"
            + "\1\151\1\111\1\uffff\1\145\1\105\1\160\1\120\1\141\1\101\1\150\1"
            + "\110\3\uffff\1\76\1\uffff\1\75\1\122\1\101\1\162\1\141\2\uffff\1"
            + "\144\1\172\1\104\1\172\1\157\1\117\1\154\1\114\1\157\1\154\1\117"
            + "\1\114\2\172\1\151\1\111\1\146\1\106\1\164\1\124\4\172\1\147\1\107"
            + "\1\164\1\124\1\144\1\104\1\154\1\114\1\145\1\105\5\uffff\1\117\1"
            + "\126\1\157\1\166\1\172\1\uffff\1\172\1\uffff\1\163\1\123\1\145\1"
            + "\105\1\155\1\154\1\115\1\114\2\145\1\157\1\uffff\2\105\1\117\1\uffff"
            + "\1\156\1\116\1\164\1\124\2\172\1\uffff\1\145\2\uffff\1\105\1\uffff"
            + "\1\150\1\110\1\145\1\172\1\105\1\172\1\141\1\101\1\165\1\125\1\162"
            + "\1\122\1\125\1\111\1\165\1\151\2\uffff\1\163\1\123\1\164\1\124\4"
            + "\172\2\162\1\172\2\122\5\172\2\uffff\1\162\1\122\1\164\1\124\1\143"
            + "\1\uffff\1\103\1\uffff\1\164\1\124\1\145\1\105\1\145\1\105\1\120"
            + "\1\116\1\160\1\156\2\172\1\145\1\105\4\uffff\1\172\1\164\1\uffff"
            + "\1\172\1\124\5\uffff\4\172\1\164\1\124\1\145\1\105\1\163\1\123\3"
            + "\172\1\107\1\172\1\147\2\uffff\2\172\1\uffff\1\172\1\uffff\1\172"
            + "\4\uffff\6\172\3\uffff\1\172\1\uffff\1\172\14\uffff";

    static final String DFA2_acceptS = "\17\uffff\1\31\4\uffff\1\40\2\uffff\1\43\10\uffff\1\56\1\57\1\60"
            + "\1\uffff\1\64\5\uffff\1\75\1\76\42\uffff\1\62\1\63\1\61\1\66\1\65"
            + "\5\uffff\1\3\1\uffff\1\4\13\uffff\1\15\3\uffff\1\24\6\uffff\1\34"
            + "\1\uffff\1\36\1\35\1\uffff\1\37\20\uffff\1\1\1\2\22\uffff\1\32\1"
            + "\33\5\uffff\1\46\1\uffff\1\47\16\uffff\1\11\1\13\1\12\1\14\2\uffff"
            + "\1\22\2\uffff\1\23\1\25\1\26\1\27\1\30\20\uffff\1\5\1\6\2\uffff"
            + "\1\16\1\uffff\1\17\1\uffff\1\74\1\71\1\41\1\42\6\uffff\1\54\1\55"
            + "\1\67\1\uffff\1\72\1\uffff\1\7\1\10\1\20\1\21\1\44\1\45\1\50\1\51"
            + "\1\52\1\53\1\70\1\73";

    static final String DFA2_specialS = "\u00f5\uffff}>";

    static final String[] DFA2_transitionS = {
            "\2\53\2\uffff\1\53\22\uffff\1\53\1\40\6\uffff\1\17\1\27\1\41"
                    + "\1\uffff\1\42\1\uffff\1\52\1\uffff\12\52\2\uffff\1\43\1\44\1"
                    + "\45\1\24\1\uffff\1\2\1\52\1\4\1\6\1\52\1\10\1\46\1\47\1\12\1"
                    + "\14\1\52\1\16\1\52\1\21\1\23\2\52\1\26\1\31\1\52\1\33\1\35\1"
                    + "\37\3\52\4\uffff\1\52\1\uffff\1\1\1\52\1\3\1\5\1\52\1\7\1\50"
                    + "\1\51\1\11\1\13\1\52\1\15\1\52\1\20\1\22\2\52\1\25\1\30\1\52"
                    + "\1\32\1\34\1\36\3\52",
            "\1\54\4\uffff\1\55",
            "\1\56\4\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64\2\uffff\1\65",
            "\1\66\2\uffff\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "\1\100\3\uffff\1\101",
            "\1\102\3\uffff\1\103",
            "",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "",
            "",
            "\1\116\1\117",
            "",
            "\1\121",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "\1\127",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\131",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52"
                    + "\1\143\4\52\1\144\1\145\6\52",
            "\1\52\1\uffff\12\52\7\uffff\15\52\1\147\4\52\1\150\1\151\6"
                    + "\52\4\uffff\1\52\1\uffff\32\52",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52"
                    + "\1\162\26\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\3\52\1\165\26\52\4\uffff\1\52\1"
                    + "\uffff\32\52", "\1\167", "\1\170",
            "\1\171\7\uffff\1\172", "\1\173\7\uffff\1\174", "\1\175", "\1\176",
            "\1\177", "\1\u0080", "\1\u0081", "\1\u0082", "", "", "", "", "",
            "\1\u0083", "\1\u0084", "\1\u0085", "\1\u0086",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "",
            "\1\u0089", "\1\u008a", "\1\u008b", "\1\u008c", "\1\u008d",
            "\1\u008e", "\1\u008f", "\1\u0090", "\1\u0091", "\1\u0092",
            "\1\u0093", "", "\1\u0094", "\1\u0095", "\1\u0096", "", "\1\u0097",
            "\1\u0098", "\1\u0099", "\1\u009a",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "",
            "\1\u009d", "", "", "\1\u009e", "", "\1\u009f", "\1\u00a0",
            "\1\u00a1",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a3",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a5", "\1\u00a6", "\1\u00a7", "\1\u00a8", "\1\u00a9",
            "\1\u00aa", "\1\u00ab", "\1\u00ac", "\1\u00ad", "\1\u00ae", "", "",
            "\1\u00af", "\1\u00b0", "\1\u00b1", "\1\u00b2",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00b7", "\1\u00b8",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ba", "\1\u00bb",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "",
            "", "\1\u00c1", "\1\u00c2", "\1\u00c3", "\1\u00c4", "\1\u00c5", "",
            "\1\u00c6", "", "\1\u00c7", "\1\u00c8", "\1\u00c9", "\1\u00ca",
            "\1\u00cb", "\1\u00cc", "\1\u00cd", "\1\u00ce", "\1\u00cf",
            "\1\u00d0",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d3", "\1\u00d4", "", "", "", "",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d6", "",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d8", "", "", "", "", "",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00dd", "\1\u00de", "\1\u00df", "\1\u00e0", "\1\u00e1",
            "\1\u00e2",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e6",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e8", "", "",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "",
            "", "", "",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "",
            "", "",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "",
            "\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "",
            "", "", "", "", "", "", "", "", "", "", "" };

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
            return "1:1: Tokens : ( AND | AND_ | AS | AS_ | CROSS | CROSS_ | DELETE | DELETE_ | FROM | FROM_ | FULL | FULL_ | IN | INNER | INNER_ | INSERT | INSERT_ | INTO | INTO_ | IN_ | JOIN | JOIN_ | LEFT | LEFT_ | LEFT_CLOSE | NOT | NOT_ | ON | ON_ | OR | OR_ | PRE_SET | RIGHT | RIGHT_ | RIGHT_CLOSE | SELECT | SELECT_ | SET | SET_ | UPDATE | UPDATE_ | VALUES | VALUES_ | WHERE | WHERE_ | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | WORD | WS );";
        }
    }
}