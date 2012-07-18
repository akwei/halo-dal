package halo.dal.analysis.antlr.v3;

// $ANTLR 3.4 /Users/akwei/antlrpro/sql2/AntlrV3SQL.g 2012-07-18 01:04:24
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class AntlrV3SQLLexer extends Lexer {

    public static final int EOF = -1;

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

    public static final int T__71 = 71;

    public static final int T__72 = 72;

    public static final int A = 4;

    public static final int AND = 5;

    public static final int AS = 6;

    public static final int ASC = 7;

    public static final int B = 8;

    public static final int BASIC_NAME = 9;

    public static final int BY = 10;

    public static final int C = 11;

    public static final int CROSS = 12;

    public static final int D = 13;

    public static final int DELETE = 14;

    public static final int DESC = 15;

    public static final int E = 16;

    public static final int EXISTS = 17;

    public static final int F = 18;

    public static final int FROM = 19;

    public static final int FULL = 20;

    public static final int G = 21;

    public static final int GROUP = 22;

    public static final int H = 23;

    public static final int HAVING = 24;

    public static final int I = 25;

    public static final int IN = 26;

    public static final int INNER = 27;

    public static final int INSERT = 28;

    public static final int INTO = 29;

    public static final int J = 30;

    public static final int JOIN = 31;

    public static final int K = 32;

    public static final int L = 33;

    public static final int LEFT = 34;

    public static final int M = 35;

    public static final int N = 36;

    public static final int O = 37;

    public static final int ON = 38;

    public static final int OR = 39;

    public static final int ORDER = 40;

    public static final int P = 41;

    public static final int PRE_SET = 42;

    public static final int Q = 43;

    public static final int R = 44;

    public static final int RIGHT = 45;

    public static final int S = 46;

    public static final int SELECT = 47;

    public static final int SET = 48;

    public static final int T = 49;

    public static final int TEXT_STRING = 50;

    public static final int U = 51;

    public static final int UPDATE = 52;

    public static final int V = 53;

    public static final int VALUES = 54;

    public static final int W = 55;

    public static final int WHERE = 56;

    public static final int WS = 57;

    public static final int X = 58;

    public static final int Y = 59;

    public static final int Z = 60;

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
        return "/Users/akwei/antlrpro/sql2/AntlrV3SQL.g";
    }

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:2:7: ( '!=' )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:2:9: '!='
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

    // $ANTLR end "T__61"
    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:3:7: ( '*' )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:3:9: '*'
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

    // $ANTLR end "T__62"
    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:4:7: ( ',' )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:4:9: ','
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

    // $ANTLR end "T__63"
    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:5:7: ( '.' )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:5:9: '.'
            {
                match('.');
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
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:6:7: ( '<' )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:6:9: '<'
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

    // $ANTLR end "T__65"
    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:7:7: ( '<=' )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:7:9: '<='
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

    // $ANTLR end "T__66"
    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:8:7: ( '<>' )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:8:9: '<>'
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

    // $ANTLR end "T__67"
    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:9:7: ( '=' )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:9:9: '='
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

    // $ANTLR end "T__68"
    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:10:7: ( '>' )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:10:9: '>'
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

    // $ANTLR end "T__69"
    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:11:7: ( '>=' )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:11:9: '>='
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

    // $ANTLR end "T__70"
    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:12:7: ( '\\(' )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:12:9: '\\('
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

    // $ANTLR end "T__71"
    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:13:7: ( '\\)' )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:13:9: '\\)'
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

    // $ANTLR end "T__72"
    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:169:8: ( S E L E C T )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:169:9: S E L E C T
            {
                mS();
                mE();
                mL();
                mE();
                mC();
                mT();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "SELECT"
    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:170:9: ( I N S E R T )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:170:10: I N S E R T
            {
                mI();
                mN();
                mS();
                mE();
                mR();
                mT();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "INSERT"
    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:171:8: ( U P D A T E )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:171:9: U P D A T E
            {
                mU();
                mP();
                mD();
                mA();
                mT();
                mE();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "UPDATE"
    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:172:8: ( D E L E T E )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:172:9: D E L E T E
            {
                mD();
                mE();
                mL();
                mE();
                mT();
                mE();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "DELETE"
    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:173:5: ( A N D )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:173:6: A N D
            {
                mA();
                mN();
                mD();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "AND"
    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:174:4: ( O R )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:174:5: O R
            {
                mO();
                mR();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "OR"
    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:175:7: ( W H E R E )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:175:8: W H E R E
            {
                mW();
                mH();
                mE();
                mR();
                mE();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "WHERE"
    // $ANTLR start "GROUP"
    public final void mGROUP() throws RecognitionException {
        try {
            int _type = GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:176:7: ( G R O U P )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:176:8: G R O U P
            {
                mG();
                mR();
                mO();
                mU();
                mP();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "GROUP"
    // $ANTLR start "HAVING"
    public final void mHAVING() throws RecognitionException {
        try {
            int _type = HAVING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:177:8: ( H A V I N G )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:177:9: H A V I N G
            {
                mH();
                mA();
                mV();
                mI();
                mN();
                mG();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "HAVING"
    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:178:4: ( B Y )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:178:5: B Y
            {
                mB();
                mY();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "BY"
    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:179:7: ( O R D E R )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:179:8: O R D E R
            {
                mO();
                mR();
                mD();
                mE();
                mR();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "ORDER"
    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:180:6: ( D E S C )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:180:7: D E S C
            {
                mD();
                mE();
                mS();
                mC();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "DESC"
    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:181:5: ( A S C )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:181:6: A S C
            {
                mA();
                mS();
                mC();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "ASC"
    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:182:5: ( S E T )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:182:6: S E T
            {
                mS();
                mE();
                mT();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "SET"
    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:183:4: ( O N )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:183:5: O N
            {
                mO();
                mN();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "ON"
    // $ANTLR start "FULL"
    public final void mFULL() throws RecognitionException {
        try {
            int _type = FULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:184:6: ( F U L L )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:184:7: F U L L
            {
                mF();
                mU();
                mL();
                mL();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "FULL"
    // $ANTLR start "INNER"
    public final void mINNER() throws RecognitionException {
        try {
            int _type = INNER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:185:7: ( I N N E R )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:185:8: I N N E R
            {
                mI();
                mN();
                mN();
                mE();
                mR();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "INNER"
    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:186:4: ( A S )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:186:5: A S
            {
                mA();
                mS();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "AS"
    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:187:6: ( F R O M )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:187:7: F R O M
            {
                mF();
                mR();
                mO();
                mM();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "FROM"
    // $ANTLR start "LEFT"
    public final void mLEFT() throws RecognitionException {
        try {
            int _type = LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:188:6: ( L E F T )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:188:7: L E F T
            {
                mL();
                mE();
                mF();
                mT();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "LEFT"
    // $ANTLR start "RIGHT"
    public final void mRIGHT() throws RecognitionException {
        try {
            int _type = RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:189:7: ( R I G H T )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:189:8: R I G H T
            {
                mR();
                mI();
                mG();
                mH();
                mT();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "RIGHT"
    // $ANTLR start "CROSS"
    public final void mCROSS() throws RecognitionException {
        try {
            int _type = CROSS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:190:7: ( C R O S S )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:190:8: C R O S S
            {
                mC();
                mR();
                mO();
                mS();
                mS();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "CROSS"
    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:191:6: ( J O I N )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:191:7: J O I N
            {
                mJ();
                mO();
                mI();
                mN();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "JOIN"
    // $ANTLR start "VALUES"
    public final void mVALUES() throws RecognitionException {
        try {
            int _type = VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:192:8: ( V A L U E S )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:192:9: V A L U E S
            {
                mV();
                mA();
                mL();
                mU();
                mE();
                mS();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "VALUES"
    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:193:6: ( I N T O )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:193:7: I N T O
            {
                mI();
                mN();
                mT();
                mO();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "INTO"
    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:194:4: ( I N )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:194:5: I N
            {
                mI();
                mN();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "IN"
    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:195:8: ( E X I S T S )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:195:9: E X I S T S
            {
                mE();
                mX();
                mI();
                mS();
                mT();
                mS();
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "EXISTS"
    // $ANTLR start "PRE_SET"
    public final void mPRE_SET() throws RecognitionException {
        try {
            int _type = PRE_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:196:9: ( '?' )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:196:10: '?'
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
    // $ANTLR start "BASIC_NAME"
    public final void mBASIC_NAME() throws RecognitionException {
        try {
            int _type = BASIC_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:199:2: ( ( 'a' .. 'z' |
            // 'A' .. 'Z' | '0' .. '9' | '_' )+ )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:200:2: ( 'a' .. 'z' | 'A'
            // .. 'Z' | '0' .. '9' | '_' )+
            {
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:200:2: ( 'a' .. 'z' |
                // 'A' .. 'Z' | '0' .. '9' | '_' )+
                int cnt1 = 0;
                loop1: do {
                    int alt1 = 2;
                    int LA1_0 = input.LA(1);
                    if (((LA1_0 >= '0' && LA1_0 <= '9')
                            || (LA1_0 >= 'A' && LA1_0 <= 'Z') || LA1_0 == '_' || (LA1_0 >= 'a' && LA1_0 <= 'z'))) {
                        alt1 = 1;
                    }
                    switch (alt1) {
                        case 1:
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
                        {
                            if ((input.LA(1) >= '0' && input.LA(1) <= '9')
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

    // $ANTLR end "BASIC_NAME"
    // $ANTLR start "TEXT_STRING"
    public final void mTEXT_STRING() throws RecognitionException {
        try {
            int _type = TEXT_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:202:12: ( ( '\\'' (
            // options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) |
            // '\\'' '\\'' )* '\\'' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:203:4: ( '\\'' ( options
            // {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' )*
            // '\\'' )
            {
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:203:4: ( '\\'' (
                // options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) |
                // '\\'' '\\'' )* '\\'' )
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:203:5: '\\'' (
                // options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) |
                // '\\'' '\\'' )* '\\''
                {
                    match('\'');
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:204:5: ( options
                    // {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) |
                    // '\\'' '\\'' )*
                    loop2: do {
                        int alt2 = 3;
                        int LA2_0 = input.LA(1);
                        if ((LA2_0 == '\'')) {
                            int LA2_1 = input.LA(2);
                            if ((LA2_1 == '\'')) {
                                alt2 = 2;
                            }
                        }
                        else if (((LA2_0 >= '\u0000' && LA2_0 <= '\t')
                                || (LA2_0 >= '\u000B' && LA2_0 <= '\f')
                                || (LA2_0 >= '\u000E' && LA2_0 <= '&') || (LA2_0 >= '(' && LA2_0 <= '\uFFFF'))) {
                            alt2 = 1;
                        }
                        switch (alt2) {
                            case 1:
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:205:31: ~
                            // ( '\\'' | '\\r' | '\\n' )
                            {
                                if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
                                        || (input.LA(1) >= '\u000B' && input
                                                .LA(1) <= '\f')
                                        || (input.LA(1) >= '\u000E' && input
                                                .LA(1) <= '&')
                                        || (input.LA(1) >= '(' && input.LA(1) <= '\uFFFF')) {
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
                            case 2:
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:205:56:
                            // '\\'' '\\''
                            {
                                match('\'');
                                match('\'');
                            }
                                break;
                            default:
                                break loop2;
                        }
                    }
                    while (true);
                    match('\'');
                }
            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "TEXT_STRING"
    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:211:5: ( ( ' ' | '\\t' |
            // '\\r' | '\\n' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:211:9: ( ' ' | '\\t' |
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
    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:219:11: ( ( 'a' | 'A' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'A' || input.LA(1) == 'a') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "A"
    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:220:11: ( ( 'b' | 'B' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'B' || input.LA(1) == 'b') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "B"
    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:221:11: ( ( 'c' | 'C' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'C' || input.LA(1) == 'c') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "C"
    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:222:11: ( ( 'd' | 'D' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'D' || input.LA(1) == 'd') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "D"
    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:223:11: ( ( 'e' | 'E' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'E' || input.LA(1) == 'e') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "E"
    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:224:11: ( ( 'f' | 'F' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'F' || input.LA(1) == 'f') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "F"
    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:225:11: ( ( 'g' | 'G' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'G' || input.LA(1) == 'g') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "G"
    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:226:11: ( ( 'h' | 'H' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'H' || input.LA(1) == 'h') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "H"
    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:227:11: ( ( 'i' | 'I' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'I' || input.LA(1) == 'i') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "I"
    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:228:11: ( ( 'j' | 'J' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'J' || input.LA(1) == 'j') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "J"
    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:229:11: ( ( 'k' | 'K' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'K' || input.LA(1) == 'k') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "K"
    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:230:11: ( ( 'l' | 'L' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'L' || input.LA(1) == 'l') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "L"
    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:231:11: ( ( 'm' | 'M' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'M' || input.LA(1) == 'm') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "M"
    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:232:11: ( ( 'n' | 'N' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'N' || input.LA(1) == 'n') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "N"
    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:233:11: ( ( 'o' | 'O' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'O' || input.LA(1) == 'o') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "O"
    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:234:11: ( ( 'p' | 'P' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'P' || input.LA(1) == 'p') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "P"
    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:235:11: ( ( 'q' | 'Q' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'Q' || input.LA(1) == 'q') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "Q"
    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:236:11: ( ( 'r' | 'R' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'R' || input.LA(1) == 'r') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "R"
    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:237:11: ( ( 's' | 'S' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'S' || input.LA(1) == 's') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "S"
    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:238:11: ( ( 't' | 'T' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'T' || input.LA(1) == 't') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T"
    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:239:11: ( ( 'u' | 'U' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'U' || input.LA(1) == 'u') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "U"
    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:240:11: ( ( 'v' | 'V' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'V' || input.LA(1) == 'v') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "V"
    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:241:11: ( ( 'w' | 'W' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'W' || input.LA(1) == 'w') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "W"
    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:242:11: ( ( 'x' | 'X' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'X' || input.LA(1) == 'x') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "X"
    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:243:11: ( ( 'y' | 'Y' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'Y' || input.LA(1) == 'y') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "Y"
    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:244:11: ( ( 'z' | 'Z' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == 'Z' || input.LA(1) == 'z') {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }
        }
        finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "Z"
    public void mTokens() throws RecognitionException {
        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:8: ( T__61 | T__62 | T__63
        // | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 |
        // T__72 | SELECT | INSERT | UPDATE | DELETE | AND | OR | WHERE | GROUP
        // | HAVING | BY | ORDER | DESC | ASC | SET | ON | FULL | INNER | AS |
        // FROM | LEFT | RIGHT | CROSS | JOIN | VALUES | INTO | IN | EXISTS |
        // PRE_SET | BASIC_NAME | TEXT_STRING | WS )
        int alt3 = 43;
        alt3 = dfa3.predict(input);
        switch (alt3) {
            case 1:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:10: T__61
            {
                mT__61();
            }
                break;
            case 2:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:16: T__62
            {
                mT__62();
            }
                break;
            case 3:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:22: T__63
            {
                mT__63();
            }
                break;
            case 4:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:28: T__64
            {
                mT__64();
            }
                break;
            case 5:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:34: T__65
            {
                mT__65();
            }
                break;
            case 6:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:40: T__66
            {
                mT__66();
            }
                break;
            case 7:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:46: T__67
            {
                mT__67();
            }
                break;
            case 8:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:52: T__68
            {
                mT__68();
            }
                break;
            case 9:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:58: T__69
            {
                mT__69();
            }
                break;
            case 10:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:64: T__70
            {
                mT__70();
            }
                break;
            case 11:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:70: T__71
            {
                mT__71();
            }
                break;
            case 12:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:76: T__72
            {
                mT__72();
            }
                break;
            case 13:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:82: SELECT
            {
                mSELECT();
            }
                break;
            case 14:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:89: INSERT
            {
                mINSERT();
            }
                break;
            case 15:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:96: UPDATE
            {
                mUPDATE();
            }
                break;
            case 16:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:103: DELETE
            {
                mDELETE();
            }
                break;
            case 17:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:110: AND
            {
                mAND();
            }
                break;
            case 18:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:114: OR
            {
                mOR();
            }
                break;
            case 19:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:117: WHERE
            {
                mWHERE();
            }
                break;
            case 20:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:123: GROUP
            {
                mGROUP();
            }
                break;
            case 21:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:129: HAVING
            {
                mHAVING();
            }
                break;
            case 22:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:136: BY
            {
                mBY();
            }
                break;
            case 23:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:139: ORDER
            {
                mORDER();
            }
                break;
            case 24:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:145: DESC
            {
                mDESC();
            }
                break;
            case 25:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:150: ASC
            {
                mASC();
            }
                break;
            case 26:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:154: SET
            {
                mSET();
            }
                break;
            case 27:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:158: ON
            {
                mON();
            }
                break;
            case 28:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:161: FULL
            {
                mFULL();
            }
                break;
            case 29:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:166: INNER
            {
                mINNER();
            }
                break;
            case 30:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:172: AS
            {
                mAS();
            }
                break;
            case 31:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:175: FROM
            {
                mFROM();
            }
                break;
            case 32:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:180: LEFT
            {
                mLEFT();
            }
                break;
            case 33:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:185: RIGHT
            {
                mRIGHT();
            }
                break;
            case 34:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:191: CROSS
            {
                mCROSS();
            }
                break;
            case 35:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:197: JOIN
            {
                mJOIN();
            }
                break;
            case 36:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:202: VALUES
            {
                mVALUES();
            }
                break;
            case 37:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:209: INTO
            {
                mINTO();
            }
                break;
            case 38:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:214: IN
            {
                mIN();
            }
                break;
            case 39:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:217: EXISTS
            {
                mEXISTS();
            }
                break;
            case 40:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:224: PRE_SET
            {
                mPRE_SET();
            }
                break;
            case 41:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:232: BASIC_NAME
            {
                mBASIC_NAME();
            }
                break;
            case 42:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:243: TEXT_STRING
            {
                mTEXT_STRING();
            }
                break;
            case 43:
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:1:255: WS
            {
                mWS();
            }
                break;
        }
    }

    protected DFA3 dfa3 = new DFA3(this);

    static final String DFA3_eotS = "\5\uffff\1\41\1\uffff\1\43\2\uffff\21\34\11\uffff\1\34\1\72\3\34"
            + "\1\102\1\104\1\106\3\34\1\112\11\34\1\124\1\uffff\6\34\1\133\1\uffff"
            + "\1\134\1\uffff\1\34\1\uffff\3\34\1\uffff\11\34\1\uffff\2\34\1\154"
            + "\2\34\1\157\2\uffff\4\34\1\164\1\165\1\166\2\34\1\171\4\34\1\176"
            + "\1\uffff\2\34\1\uffff\1\u0081\1\u0082\1\u0083\1\34\3\uffff\1\u0085"
            + "\1\u0086\1\uffff\2\34\1\u0089\1\u008a\1\uffff\1\u008b\1\u008c\3"
            + "\uffff\1\u008d\2\uffff\1\u008e\1\u008f\7\uffff";

    static final String DFA3_eofS = "\u0090\uffff";

    static final String DFA3_minS = "\1\11\4\uffff\1\75\1\uffff\1\75\2\uffff\1\105\1\116\1\120\1\105"
            + "\2\116\1\110\1\122\1\101\1\131\1\122\1\105\1\111\1\122\1\117\1\101"
            + "\1\130\11\uffff\1\114\1\60\1\104\1\114\1\104\3\60\1\105\1\117\1"
            + "\126\1\60\1\114\1\117\1\106\1\107\1\117\1\111\1\114\1\111\1\105"
            + "\1\60\1\uffff\2\105\1\117\1\101\1\105\1\103\1\60\1\uffff\1\60\1"
            + "\uffff\1\105\1\uffff\1\122\1\125\1\111\1\uffff\1\114\1\115\1\124"
            + "\1\110\1\123\1\116\1\125\1\123\1\103\1\uffff\2\122\1\60\2\124\1"
            + "\60\2\uffff\1\122\1\105\1\120\1\116\3\60\1\124\1\123\1\60\1\105"
            + "\3\124\1\60\1\uffff\2\105\1\uffff\3\60\1\107\3\uffff\2\60\1\uffff"
            + "\2\123\2\60\1\uffff\2\60\3\uffff\1\60\2\uffff\2\60\7\uffff";

    static final String DFA3_maxS = "\1\172\4\uffff\1\76\1\uffff\1\75\2\uffff\1\145\1\156\1\160\1\145"
            + "\1\163\1\162\1\150\1\162\1\141\1\171\1\165\1\145\1\151\1\162\1\157"
            + "\1\141\1\170\11\uffff\1\164\1\172\1\144\1\163\1\144\3\172\1\145"
            + "\1\157\1\166\1\172\1\154\1\157\1\146\1\147\1\157\1\151\1\154\1\151"
            + "\1\145\1\172\1\uffff\2\145\1\157\1\141\1\145\1\143\1\172\1\uffff"
            + "\1\172\1\uffff\1\145\1\uffff\1\162\1\165\1\151\1\uffff\1\154\1\155"
            + "\1\164\1\150\1\163\1\156\1\165\1\163\1\143\1\uffff\2\162\1\172\2"
            + "\164\1\172\2\uffff\1\162\1\145\1\160\1\156\3\172\1\164\1\163\1\172"
            + "\1\145\3\164\1\172\1\uffff\2\145\1\uffff\3\172\1\147\3\uffff\2\172"
            + "\1\uffff\2\163\2\172\1\uffff\2\172\3\uffff\1\172\2\uffff\2\172\7"
            + "\uffff";

    static final String DFA3_acceptS = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\10\1\uffff\1\13\1\14\21\uffff"
            + "\1\50\1\51\1\52\1\53\1\6\1\7\1\5\1\12\1\11\26\uffff\1\46\7\uffff"
            + "\1\36\1\uffff\1\22\1\uffff\1\33\3\uffff\1\26\11\uffff\1\32\6\uffff"
            + "\1\21\1\31\17\uffff\1\45\2\uffff\1\30\4\uffff\1\34\1\37\1\40\2\uffff"
            + "\1\43\4\uffff\1\35\2\uffff\1\27\1\23\1\24\1\uffff\1\41\1\42\2\uffff"
            + "\1\15\1\16\1\17\1\20\1\25\1\44\1\47";

    static final String DFA3_specialS = "\u0090\uffff}>";

    static final String[] DFA3_transitionS = {
            "\2\36\2\uffff\1\36\22\uffff\1\36\1\1\5\uffff\1\35\1\10\1\11"
                    + "\1\2\1\uffff\1\3\1\uffff\1\4\1\uffff\12\34\2\uffff\1\5\1\6\1"
                    + "\7\1\33\1\uffff\1\16\1\23\1\27\1\15\1\32\1\24\1\21\1\22\1\13"
                    + "\1\30\1\34\1\25\2\34\1\17\2\34\1\26\1\12\1\34\1\14\1\31\1\20"
                    + "\3\34\4\uffff\1\34\1\uffff\1\16\1\23\1\27\1\15\1\32\1\24\1\21"
                    + "\1\22\1\13\1\30\1\34\1\25\2\34\1\17\2\34\1\26\1\12\1\34\1\14"
                    + "\1\31\1\20\3\34",
            "",
            "",
            "",
            "",
            "\1\37\1\40",
            "",
            "\1\42",
            "",
            "",
            "\1\44\37\uffff\1\44",
            "\1\45\37\uffff\1\45",
            "\1\46\37\uffff\1\46",
            "\1\47\37\uffff\1\47",
            "\1\50\4\uffff\1\51\32\uffff\1\50\4\uffff\1\51",
            "\1\53\3\uffff\1\52\33\uffff\1\53\3\uffff\1\52",
            "\1\54\37\uffff\1\54",
            "\1\55\37\uffff\1\55",
            "\1\56\37\uffff\1\56",
            "\1\57\37\uffff\1\57",
            "\1\61\2\uffff\1\60\34\uffff\1\61\2\uffff\1\60",
            "\1\62\37\uffff\1\62",
            "\1\63\37\uffff\1\63",
            "\1\64\37\uffff\1\64",
            "\1\65\37\uffff\1\65",
            "\1\66\37\uffff\1\66",
            "\1\67\37\uffff\1\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\70\7\uffff\1\71\27\uffff\1\70\7\uffff\1\71",
            "\12\34\7\uffff\15\34\1\74\4\34\1\73\1\75\6\34\4\uffff\1\34"
                    + "\1\uffff\15\34\1\74\4\34\1\73\1\75\6\34",
            "\1\76\37\uffff\1\76",
            "\1\77\6\uffff\1\100\30\uffff\1\77\6\uffff\1\100",
            "\1\101\37\uffff\1\101",
            "\12\34\7\uffff\2\34\1\103\27\34\4\uffff\1\34\1\uffff\2\34\1"
                    + "\103\27\34",
            "\12\34\7\uffff\3\34\1\105\26\34\4\uffff\1\34\1\uffff\3\34\1"
                    + "\105\26\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\107\37\uffff\1\107", "\1\110\37\uffff\1\110",
            "\1\111\37\uffff\1\111",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\113\37\uffff\1\113", "\1\114\37\uffff\1\114",
            "\1\115\37\uffff\1\115", "\1\116\37\uffff\1\116",
            "\1\117\37\uffff\1\117", "\1\120\37\uffff\1\120",
            "\1\121\37\uffff\1\121", "\1\122\37\uffff\1\122",
            "\1\123\37\uffff\1\123",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34", "",
            "\1\125\37\uffff\1\125", "\1\126\37\uffff\1\126",
            "\1\127\37\uffff\1\127", "\1\130\37\uffff\1\130",
            "\1\131\37\uffff\1\131", "\1\132\37\uffff\1\132",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34", "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34", "",
            "\1\135\37\uffff\1\135", "", "\1\136\37\uffff\1\136",
            "\1\137\37\uffff\1\137", "\1\140\37\uffff\1\140", "",
            "\1\141\37\uffff\1\141", "\1\142\37\uffff\1\142",
            "\1\143\37\uffff\1\143", "\1\144\37\uffff\1\144",
            "\1\145\37\uffff\1\145", "\1\146\37\uffff\1\146",
            "\1\147\37\uffff\1\147", "\1\150\37\uffff\1\150",
            "\1\151\37\uffff\1\151", "", "\1\152\37\uffff\1\152",
            "\1\153\37\uffff\1\153",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\155\37\uffff\1\155", "\1\156\37\uffff\1\156",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34", "", "",
            "\1\160\37\uffff\1\160", "\1\161\37\uffff\1\161",
            "\1\162\37\uffff\1\162", "\1\163\37\uffff\1\163",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\167\37\uffff\1\167", "\1\170\37\uffff\1\170",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\172\37\uffff\1\172", "\1\173\37\uffff\1\173",
            "\1\174\37\uffff\1\174", "\1\175\37\uffff\1\175",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34", "",
            "\1\177\37\uffff\1\177", "\1\u0080\37\uffff\1\u0080", "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0084\37\uffff\1\u0084", "", "", "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34", "",
            "\1\u0087\37\uffff\1\u0087", "\1\u0088\37\uffff\1\u0088",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34", "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34", "", "", "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34", "", "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34", "", "", "", "",
            "", "", "" };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);

    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);

    static final char[] DFA3_min = DFA
            .unpackEncodedStringToUnsignedChars(DFA3_minS);

    static final char[] DFA3_max = DFA
            .unpackEncodedStringToUnsignedChars(DFA3_maxS);

    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);

    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);

    static final short[][] DFA3_transition;
    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }

        public String getDescription() {
            return "1:1: Tokens : ( T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | SELECT | INSERT | UPDATE | DELETE | AND | OR | WHERE | GROUP | HAVING | BY | ORDER | DESC | ASC | SET | ON | FULL | INNER | AS | FROM | LEFT | RIGHT | CROSS | JOIN | VALUES | INTO | IN | EXISTS | PRE_SET | BASIC_NAME | TEXT_STRING | WS );";
        }
    }
}