package halo.dal.analysis.antlr.v3;

// $ANTLR 3.4 /Users/akwei/antlrpro/sql/AntlrV3SQL.g 2012-06-13 14:10:02
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class AntlrV3SQLLexer extends Lexer {

    public static final int EOF = -1;

    public static final int T__47 = 47;

    public static final int T__48 = 48;

    public static final int T__49 = 49;

    public static final int T__50 = 50;

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

    public static final int T__66 = 66;

    public static final int T__67 = 67;

    public static final int T__68 = 68;

    public static final int T__69 = 69;

    public static final int T__70 = 70;

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

    public static final int INNER = 16;

    public static final int INNER_ = 17;

    public static final int INSERT = 18;

    public static final int INSERT_ = 19;

    public static final int INTO = 20;

    public static final int INTO_ = 21;

    public static final int JOIN = 22;

    public static final int JOIN_ = 23;

    public static final int LEFT = 24;

    public static final int LEFT_ = 25;

    public static final int LEFT_CLOSE = 26;

    public static final int ON = 27;

    public static final int ON_ = 28;

    public static final int OR = 29;

    public static final int OR_ = 30;

    public static final int PRE_SET = 31;

    public static final int RIGHT = 32;

    public static final int RIGHT_ = 33;

    public static final int RIGHT_CLOSE = 34;

    public static final int SELECT = 35;

    public static final int SELECT_ = 36;

    public static final int SET = 37;

    public static final int SET_ = 38;

    public static final int UPDATE = 39;

    public static final int UPDATE_ = 40;

    public static final int VALUES = 41;

    public static final int VALUES_ = 42;

    public static final int WHERE = 43;

    public static final int WHERE_ = 44;

    public static final int WORD = 45;

    public static final int WS = 46;

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
    // $ANTLR start "INNER"
    public final void mINNER() throws RecognitionException {
        try {
            int _type = INNER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:14:7: ( 'inner' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:14:9: 'inner'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:15:8: ( 'INNER' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:15:10: 'INNER'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:16:8: ( 'insert' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:16:10: 'insert'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:17:9: ( 'INSERT' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:17:11: 'INSERT'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:18:6: ( 'into' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:18:8: 'into'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:19:7: ( 'INTO' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:19:9: 'INTO'
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
    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:20:6: ( 'join' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:20:8: 'join'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:21:7: ( 'JOIN' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:21:9: 'JOIN'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:22:6: ( 'left' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:22:8: 'left'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:23:7: ( 'LEFT' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:23:9: 'LEFT'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:24:12: ( '(' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:24:14: '('
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
    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:25:4: ( 'on' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:25:6: 'on'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:26:5: ( 'ON' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:26:7: 'ON'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:27:4: ( 'or' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:27:6: 'or'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:28:5: ( 'OR' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:28:7: 'OR'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:29:9: ( '?' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:29:11: '?'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:30:7: ( 'right' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:30:9: 'right'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:31:8: ( 'RIGHT' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:31:10: 'RIGHT'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:32:13: ( ')' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:32:15: ')'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:33:8: ( 'select' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:33:10: 'select'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:34:9: ( 'SELECT' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:34:11: 'SELECT'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:35:5: ( 'set' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:35:7: 'set'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:36:6: ( 'SET' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:36:8: 'SET'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:37:8: ( 'update' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:37:10: 'update'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:38:9: ( 'UPDATE' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:38:11: 'UPDATE'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:39:8: ( 'values' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:39:10: 'values'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:40:9: ( 'VALUES' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:40:11: 'VALUES'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:41:7: ( 'where' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:41:9: 'where'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:42:8: ( 'WHERE' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:42:10: 'WHERE'
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
    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:43:7: ( '!=' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:43:9: '!='
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

    // $ANTLR end "T__47"
    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:44:7: ( ',' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:44:9: ','
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

    // $ANTLR end "T__48"
    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:45:7: ( '<' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:45:9: '<'
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

    // $ANTLR end "T__49"
    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:46:7: ( '<=' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:46:9: '<='
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

    // $ANTLR end "T__50"
    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:47:7: ( '<>' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:47:9: '<>'
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

    // $ANTLR end "T__51"
    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:48:7: ( '=' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:48:9: '='
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

    // $ANTLR end "T__52"
    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:49:7: ( '>' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:49:9: '>'
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

    // $ANTLR end "T__53"
    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:50:7: ( '>=' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:50:9: '>='
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

    // $ANTLR end "T__54"
    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:51:7: ( 'ASC' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:51:9: 'ASC'
            {
                match("ASC");
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:52:7: ( 'BY' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:52:9: 'BY'
            {
                match("BY");
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:53:7: ( 'DESC' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:53:9: 'DESC'
            {
                match("DESC");
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:54:7: ( 'EXISTS' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:54:9: 'EXISTS'
            {
                match("EXISTS");
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:55:7: ( 'GROUP' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:55:9: 'GROUP'
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

    // $ANTLR end "T__59"
    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:56:7: ( 'HAVING' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:56:9: 'HAVING'
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

    // $ANTLR end "T__60"
    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:57:7: ( 'IN' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:57:9: 'IN'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:59:7: ( 'asc' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:59:9: 'asc'
            {
                match("asc");
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:60:7: ( 'by' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:60:9: 'by'
            {
                match("by");
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:61:7: ( 'desc' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:61:9: 'desc'
            {
                match("desc");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__65"
    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:62:7: ( 'exists' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:62:9: 'exists'
            {
                match("exists");
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__66"
    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:63:7: ( 'group' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:63:9: 'group'
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

    // $ANTLR end "T__67"
    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:64:7: ( 'having' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:64:9: 'having'
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

    // $ANTLR end "T__68"
    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:65:7: ( 'in' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:65:9: 'in'
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

    // $ANTLR end "T__69"
    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:66:7: ( 'order' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:66:9: 'order'
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

    // $ANTLR end "T__70"
    // $ANTLR start "WORD"
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:165:6: ( ( 'a' .. 'z' |
            // 'A' .. 'Z' | '0' .. '9' | '_' | '.' | '*' )+ )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:166:2: ( 'a' .. 'z' | 'A'
            // .. 'Z' | '0' .. '9' | '_' | '.' | '*' )+
            {
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:166:2: ( 'a' .. 'z' |
                // 'A' .. 'Z' | '0' .. '9' | '_' | '.' | '*' )+
                int cnt1 = 0;
                loop1: do {
                    int alt1 = 2;
                    int LA1_0 = input.LA(1);
                    if ((LA1_0 == '*' || LA1_0 == '.'
                            || (LA1_0 >= '0' && LA1_0 <= '9')
                            || (LA1_0 >= 'A' && LA1_0 <= 'Z') || LA1_0 == '_' || (LA1_0 >= 'a' && LA1_0 <= 'z'))) {
                        alt1 = 1;
                    }
                    switch (alt1) {
                        case 1:
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:
                        {
                            if (input.LA(1) == '*'
                                    || input.LA(1) == '.'
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:168:5: ( ( ' ' | '\\t' |
            // '\\r' | '\\n' ) )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:168:9: ( ' ' | '\\t' |
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
        // CROSS | CROSS_ | DELETE | DELETE_ | FROM | FROM_ | FULL | FULL_ |
        // INNER | INNER_ | INSERT | INSERT_ | INTO | INTO_ | JOIN | JOIN_ |
        // LEFT | LEFT_ | LEFT_CLOSE | ON | ON_ | OR | OR_ | PRE_SET | RIGHT |
        // RIGHT_ | RIGHT_CLOSE | SELECT | SELECT_ | SET | SET_ | UPDATE |
        // UPDATE_ | VALUES | VALUES_ | WHERE | WHERE_ | T__47 | T__48 | T__49 |
        // T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58
        // | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 |
        // T__67 | T__68 | T__69 | T__70 | WORD | WS )
        int alt2 = 67;
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
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:76: INNER
            {
                mINNER();
            }
                break;
            case 14:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:82: INNER_
            {
                mINNER_();
            }
                break;
            case 15:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:89: INSERT
            {
                mINSERT();
            }
                break;
            case 16:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:96: INSERT_
            {
                mINSERT_();
            }
                break;
            case 17:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:104: INTO
            {
                mINTO();
            }
                break;
            case 18:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:109: INTO_
            {
                mINTO_();
            }
                break;
            case 19:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:115: JOIN
            {
                mJOIN();
            }
                break;
            case 20:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:120: JOIN_
            {
                mJOIN_();
            }
                break;
            case 21:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:126: LEFT
            {
                mLEFT();
            }
                break;
            case 22:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:131: LEFT_
            {
                mLEFT_();
            }
                break;
            case 23:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:137: LEFT_CLOSE
            {
                mLEFT_CLOSE();
            }
                break;
            case 24:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:148: ON
            {
                mON();
            }
                break;
            case 25:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:151: ON_
            {
                mON_();
            }
                break;
            case 26:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:155: OR
            {
                mOR();
            }
                break;
            case 27:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:158: OR_
            {
                mOR_();
            }
                break;
            case 28:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:162: PRE_SET
            {
                mPRE_SET();
            }
                break;
            case 29:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:170: RIGHT
            {
                mRIGHT();
            }
                break;
            case 30:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:176: RIGHT_
            {
                mRIGHT_();
            }
                break;
            case 31:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:183: RIGHT_CLOSE
            {
                mRIGHT_CLOSE();
            }
                break;
            case 32:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:195: SELECT
            {
                mSELECT();
            }
                break;
            case 33:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:202: SELECT_
            {
                mSELECT_();
            }
                break;
            case 34:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:210: SET
            {
                mSET();
            }
                break;
            case 35:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:214: SET_
            {
                mSET_();
            }
                break;
            case 36:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:219: UPDATE
            {
                mUPDATE();
            }
                break;
            case 37:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:226: UPDATE_
            {
                mUPDATE_();
            }
                break;
            case 38:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:234: VALUES
            {
                mVALUES();
            }
                break;
            case 39:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:241: VALUES_
            {
                mVALUES_();
            }
                break;
            case 40:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:249: WHERE
            {
                mWHERE();
            }
                break;
            case 41:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:255: WHERE_
            {
                mWHERE_();
            }
                break;
            case 42:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:262: T__47
            {
                mT__47();
            }
                break;
            case 43:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:268: T__48
            {
                mT__48();
            }
                break;
            case 44:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:274: T__49
            {
                mT__49();
            }
                break;
            case 45:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:280: T__50
            {
                mT__50();
            }
                break;
            case 46:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:286: T__51
            {
                mT__51();
            }
                break;
            case 47:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:292: T__52
            {
                mT__52();
            }
                break;
            case 48:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:298: T__53
            {
                mT__53();
            }
                break;
            case 49:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:304: T__54
            {
                mT__54();
            }
                break;
            case 50:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:310: T__55
            {
                mT__55();
            }
                break;
            case 51:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:316: T__56
            {
                mT__56();
            }
                break;
            case 52:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:322: T__57
            {
                mT__57();
            }
                break;
            case 53:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:328: T__58
            {
                mT__58();
            }
                break;
            case 54:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:334: T__59
            {
                mT__59();
            }
                break;
            case 55:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:340: T__60
            {
                mT__60();
            }
                break;
            case 56:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:346: T__61
            {
                mT__61();
            }
                break;
            case 57:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:352: T__62
            {
                mT__62();
            }
                break;
            case 58:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:358: T__63
            {
                mT__63();
            }
                break;
            case 59:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:364: T__64
            {
                mT__64();
            }
                break;
            case 60:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:370: T__65
            {
                mT__65();
            }
                break;
            case 61:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:376: T__66
            {
                mT__66();
            }
                break;
            case 62:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:382: T__67
            {
                mT__67();
            }
                break;
            case 63:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:388: T__68
            {
                mT__68();
            }
                break;
            case 64:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:394: T__69
            {
                mT__69();
            }
                break;
            case 65:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:400: T__70
            {
                mT__70();
            }
                break;
            case 66:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:406: WORD
            {
                mWORD();
            }
                break;
            case 67:
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:1:411: WS
            {
                mWS();
            }
                break;
        }
    }

    protected DFA2 dfa2 = new DFA2(this);

    static final String DFA2_eotS = "\1\uffff\16\53\1\uffff\2\53\1\uffff\2\53\1\uffff\10\53\2\uffff\1"
            + "\117\1\uffff\1\121\10\53\2\uffff\1\53\1\134\1\53\1\137\10\53\1\155"
            + "\1\161\4\53\1\166\1\170\1\171\1\173\12\53\5\uffff\1\u0088\3\53\1"
            + "\u008c\3\53\1\u0090\1\u0091\1\uffff\1\u0092\1\u0093\1\uffff\15\53"
            + "\1\uffff\3\53\1\uffff\4\53\1\uffff\1\53\2\uffff\1\53\1\uffff\3\53"
            + "\1\u00ad\1\53\1\u00af\6\53\1\uffff\3\53\1\uffff\3\53\4\uffff\3\53"
            + "\1\u00bf\1\53\1\u00c1\1\u00c2\1\u00c3\1\u00c4\1\u00c5\2\53\1\u00c8"
            + "\2\53\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\5\53\1\uffff\1\53"
            + "\1\uffff\14\53\1\u00e2\1\u00e3\1\53\1\uffff\1\53\5\uffff\1\u00e6"
            + "\1\53\1\uffff\1\u00e8\1\53\5\uffff\1\u00ea\1\u00eb\1\u00ec\1\u00ed"
            + "\6\53\1\u00f4\1\u00f5\1\53\1\u00f7\2\53\1\u00fa\1\53\2\uffff\1\u00fc"
            + "\1\u00fd\1\uffff\1\u00fe\1\uffff\1\u00ff\4\uffff\1\u0100\1\u0101"
            + "\1\u0102\1\u0103\1\u0104\1\u0105\2\uffff\1\u0106\1\uffff\1\u0107"
            + "\1\u0108\1\uffff\1\u0109\16\uffff";

    static final String DFA2_eofS = "\u010a\uffff";

    static final String DFA2_minS = "\1\11\1\156\1\116\1\162\1\122\1\145\1\105\1\162\1\122\1\156\1\116"
            + "\1\157\1\117\1\145\1\105\1\uffff\1\156\1\116\1\uffff\1\151\1\111"
            + "\1\uffff\1\145\1\105\1\160\1\120\1\141\1\101\1\150\1\110\2\uffff"
            + "\1\75\1\uffff\1\75\1\131\1\130\1\122\1\101\1\171\1\170\1\162\1\141"
            + "\2\uffff\1\144\1\52\1\104\1\52\1\157\1\117\1\154\1\114\1\157\1\154"
            + "\1\117\1\114\2\52\1\151\1\111\1\146\1\106\4\52\1\147\1\107\1\154"
            + "\1\114\1\144\1\104\1\154\1\114\1\145\1\105\5\uffff\1\52\1\111\1"
            + "\117\1\126\1\52\1\151\1\157\1\166\2\52\1\uffff\2\52\1\uffff\1\163"
            + "\1\123\1\145\1\143\1\105\1\103\1\155\1\154\1\115\1\114\2\145\1\157"
            + "\1\uffff\2\105\1\117\1\uffff\1\156\1\116\1\164\1\124\1\uffff\1\145"
            + "\2\uffff\1\105\1\uffff\1\150\1\110\1\145\1\52\1\105\1\52\1\141\1"
            + "\101\1\165\1\125\1\162\1\122\1\uffff\1\123\1\125\1\111\1\uffff\1"
            + "\163\1\165\1\151\4\uffff\1\163\1\123\1\164\1\52\1\124\5\52\2\162"
            + "\1\52\2\122\5\52\1\162\1\122\1\164\1\124\1\143\1\uffff\1\103\1\uffff"
            + "\1\164\1\124\1\145\1\105\1\145\1\105\1\124\1\120\1\116\1\164\1\160"
            + "\1\156\2\52\1\145\1\uffff\1\105\5\uffff\1\52\1\164\1\uffff\1\52"
            + "\1\124\5\uffff\4\52\1\164\1\124\1\145\1\105\1\163\1\123\2\52\1\123"
            + "\1\52\1\107\1\163\1\52\1\147\2\uffff\2\52\1\uffff\1\52\1\uffff\1"
            + "\52\4\uffff\6\52\2\uffff\1\52\1\uffff\2\52\1\uffff\1\52\16\uffff";

    static final String DFA2_maxS = "\1\172\1\163\1\123\1\162\1\122\1\145\1\105\1\165\1\125\1\156\1\116"
            + "\1\157\1\117\1\145\1\105\1\uffff\1\162\1\122\1\uffff\1\151\1\111"
            + "\1\uffff\1\145\1\105\1\160\1\120\1\141\1\101\1\150\1\110\2\uffff"
            + "\1\76\1\uffff\1\75\1\131\1\130\1\122\1\101\1\171\1\170\1\162\1\141"
            + "\2\uffff\1\144\1\172\1\104\1\172\1\157\1\117\1\163\1\123\1\157\1"
            + "\154\1\117\1\114\2\172\1\151\1\111\1\146\1\106\4\172\1\147\1\107"
            + "\1\164\1\124\1\144\1\104\1\154\1\114\1\145\1\105\5\uffff\1\172\1"
            + "\111\1\117\1\126\1\172\1\151\1\157\1\166\2\172\1\uffff\2\172\1\uffff"
            + "\1\163\1\123\1\145\1\143\1\105\1\103\1\155\1\154\1\115\1\114\2\145"
            + "\1\157\1\uffff\2\105\1\117\1\uffff\1\156\1\116\1\164\1\124\1\uffff"
            + "\1\145\2\uffff\1\105\1\uffff\1\150\1\110\1\145\1\172\1\105\1\172"
            + "\1\141\1\101\1\165\1\125\1\162\1\122\1\uffff\1\123\1\125\1\111\1"
            + "\uffff\1\163\1\165\1\151\4\uffff\1\163\1\123\1\164\1\172\1\124\5"
            + "\172\2\162\1\172\2\122\5\172\1\162\1\122\1\164\1\124\1\143\1\uffff"
            + "\1\103\1\uffff\1\164\1\124\1\145\1\105\1\145\1\105\1\124\1\120\1"
            + "\116\1\164\1\160\1\156\2\172\1\145\1\uffff\1\105\5\uffff\1\172\1"
            + "\164\1\uffff\1\172\1\124\5\uffff\4\172\1\164\1\124\1\145\1\105\1"
            + "\163\1\123\2\172\1\123\1\172\1\107\1\163\1\172\1\147\2\uffff\2\172"
            + "\1\uffff\1\172\1\uffff\1\172\4\uffff\6\172\2\uffff\1\172\1\uffff"
            + "\2\172\1\uffff\1\172\16\uffff";

    static final String DFA2_acceptS = "\17\uffff\1\27\2\uffff\1\34\2\uffff\1\37\10\uffff\1\52\1\53\1\uffff"
            + "\1\57\11\uffff\1\102\1\103\40\uffff\1\55\1\56\1\54\1\61\1\60\12"
            + "\uffff\1\3\2\uffff\1\4\15\uffff\1\100\3\uffff\1\70\4\uffff\1\30"
            + "\1\uffff\1\32\1\31\1\uffff\1\33\14\uffff\1\63\3\uffff\1\73\3\uffff"
            + "\1\1\1\72\1\2\1\62\31\uffff\1\42\1\uffff\1\43\17\uffff\1\74\1\uffff"
            + "\1\64\1\11\1\13\1\12\1\14\2\uffff\1\21\2\uffff\1\22\1\23\1\24\1"
            + "\25\1\26\22\uffff\1\5\1\6\2\uffff\1\15\1\uffff\1\16\1\uffff\1\101"
            + "\1\71\1\35\1\36\6\uffff\1\50\1\51\1\uffff\1\66\2\uffff\1\76\1\uffff"
            + "\1\7\1\10\1\17\1\20\1\40\1\41\1\44\1\45\1\46\1\47\1\65\1\67\1\75"
            + "\1\77";

    static final String DFA2_specialS = "\u010a\uffff}>";

    static final String[] DFA2_transitionS = {
            "\2\54\2\uffff\1\54\22\uffff\1\54\1\36\6\uffff\1\17\1\25\1\53"
                    + "\1\uffff\1\37\1\uffff\1\53\1\uffff\12\53\2\uffff\1\40\1\41\1"
                    + "\42\1\22\1\uffff\1\2\1\43\1\4\1\6\1\44\1\10\1\45\1\46\1\12\1"
                    + "\14\1\53\1\16\2\53\1\21\2\53\1\24\1\27\1\53\1\31\1\33\1\35\3"
                    + "\53\4\uffff\1\53\1\uffff\1\1\1\47\1\3\1\5\1\50\1\7\1\51\1\52"
                    + "\1\11\1\13\1\53\1\15\2\53\1\20\2\53\1\23\1\26\1\53\1\30\1\32"
                    + "\1\34\3\53",
            "\1\55\4\uffff\1\56",
            "\1\57\4\uffff\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65\2\uffff\1\66",
            "\1\67\2\uffff\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "\1\77\3\uffff\1\100",
            "\1\101\3\uffff\1\102",
            "",
            "\1\103",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "",
            "\1\115\1\116",
            "",
            "\1\120",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "\1\132",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\2\53\1\133\27\53",
            "\1\135",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\2\53\1\136\27\53\4"
                    + "\uffff\1\53\1\uffff\32\53",
            "\1\140",
            "\1\141",
            "\1\142\6\uffff\1\143",
            "\1\144\6\uffff\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\15\53\1\152\4\53\1\153\1\154\6\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\15\53\1\156\4\53\1"
                    + "\157\1\160\6\53\4\uffff\1\53\1\uffff\32\53",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\3\53\1\167\26\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\3\53\1\172\26\53\4"
                    + "\uffff\1\53\1\uffff\32\53",
            "\1\174",
            "\1\175",
            "\1\176\7\uffff\1\177",
            "\1\u0080\7\uffff\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "",
            "",
            "",
            "",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "",
            "",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\u00ae",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "",
            "",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\u00c0",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\u00c6",
            "\1\u00c7",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\u00c9",
            "\1\u00ca",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "",
            "",
            "",
            "",
            "",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\u00e7",
            "",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\u00e9",
            "",
            "",
            "",
            "",
            "",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\u00f6",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\u00f8",
            "\1\u00f9",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\u00fb",
            "",
            "",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "",
            "",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53",
            "",
            "\1\53\3\uffff\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53"
                    + "\1\uffff\32\53", "", "", "", "", "", "", "", "", "", "",
            "", "", "", "" };

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
            return "1:1: Tokens : ( AND | AND_ | AS | AS_ | CROSS | CROSS_ | DELETE | DELETE_ | FROM | FROM_ | FULL | FULL_ | INNER | INNER_ | INSERT | INSERT_ | INTO | INTO_ | JOIN | JOIN_ | LEFT | LEFT_ | LEFT_CLOSE | ON | ON_ | OR | OR_ | PRE_SET | RIGHT | RIGHT_ | RIGHT_CLOSE | SELECT | SELECT_ | SET | SET_ | UPDATE | UPDATE_ | VALUES | VALUES_ | WHERE | WHERE_ | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | WORD | WS );";
        }
    }
}