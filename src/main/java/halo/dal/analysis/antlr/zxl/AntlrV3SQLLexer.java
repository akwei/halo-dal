package halo.dal.analysis.antlr.zxl;// $ANTLR 3.4 AntlrV3SQL.g 2015-10-22 18:48:42

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AntlrV3SQLLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int A=4;
    public static final int AND=5;
    public static final int AS=6;
    public static final int ASC=7;
    public static final int B=8;
    public static final int BASIC_NAME=9;
    public static final int BETWEEN=10;
    public static final int BY=11;
    public static final int C=12;
    public static final int CROSS=13;
    public static final int D=14;
    public static final int DELETE=15;
    public static final int DESC=16;
    public static final int E=17;
    public static final int EXISTS=18;
    public static final int F=19;
    public static final int FROM=20;
    public static final int FULL=21;
    public static final int G=22;
    public static final int GROUP=23;
    public static final int H=24;
    public static final int HAVING=25;
    public static final int I=26;
    public static final int IN=27;
    public static final int INNER=28;
    public static final int INSERT=29;
    public static final int INTO=30;
    public static final int J=31;
    public static final int JOIN=32;
    public static final int K=33;
    public static final int L=34;
    public static final int LEFT=35;
    public static final int M=36;
    public static final int N=37;
    public static final int O=38;
    public static final int ON=39;
    public static final int OR=40;
    public static final int ORDER=41;
    public static final int OVER=42;
    public static final int P=43;
    public static final int PRE_SET=44;
    public static final int Q=45;
    public static final int R=46;
    public static final int RIGHT=47;
    public static final int ROWNUMBER=48;
    public static final int S=49;
    public static final int SELECT=50;
    public static final int SET=51;
    public static final int T=52;
    public static final int TEXT_STRING=53;
    public static final int U=54;
    public static final int UPDATE=55;
    public static final int V=56;
    public static final int VALUES=57;
    public static final int W=58;
    public static final int WHERE=59;
    public static final int WS=60;
    public static final int X=61;
    public static final int Y=62;
    public static final int Z=63;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AntlrV3SQLLexer() {} 
    public AntlrV3SQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AntlrV3SQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "AntlrV3SQL.g"; }

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AntlrV3SQL.g:2:7: ( '!=' )
            // AntlrV3SQL.g:2:9: '!='
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AntlrV3SQL.g:3:7: ( '*' )
            // AntlrV3SQL.g:3:9: '*'
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AntlrV3SQL.g:4:7: ( ',' )
            // AntlrV3SQL.g:4:9: ','
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AntlrV3SQL.g:5:7: ( '.' )
            // AntlrV3SQL.g:5:9: '.'
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AntlrV3SQL.g:6:7: ( '<' )
            // AntlrV3SQL.g:6:9: '<'
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AntlrV3SQL.g:7:7: ( '<=' )
            // AntlrV3SQL.g:7:9: '<='
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AntlrV3SQL.g:8:7: ( '<>' )
            // AntlrV3SQL.g:8:9: '<>'
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AntlrV3SQL.g:9:7: ( '=' )
            // AntlrV3SQL.g:9:9: '='
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AntlrV3SQL.g:10:7: ( '>' )
            // AntlrV3SQL.g:10:9: '>'
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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AntlrV3SQL.g:11:7: ( '>=' )
            // AntlrV3SQL.g:11:9: '>='
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AntlrV3SQL.g:12:7: ( '\\(' )
            // AntlrV3SQL.g:12:9: '\\('
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
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AntlrV3SQL.g:13:7: ( '\\)' )
            // AntlrV3SQL.g:13:9: '\\)'
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
    // $ANTLR end "T__75"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AntlrV3SQL.g:198:8: ( S E L E C T )
            // AntlrV3SQL.g:198:9: S E L E C T
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
            // AntlrV3SQL.g:199:9: ( I N S E R T )
            // AntlrV3SQL.g:199:10: I N S E R T
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
            // AntlrV3SQL.g:200:8: ( U P D A T E )
            // AntlrV3SQL.g:200:9: U P D A T E
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
            // AntlrV3SQL.g:201:8: ( D E L E T E )
            // AntlrV3SQL.g:201:9: D E L E T E
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

    // $ANTLR start "ROWNUMBER"
    public final void mROWNUMBER() throws RecognitionException {
        try {
            int _type = ROWNUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AntlrV3SQL.g:203:2: ( R O W N U M B E R )
            // AntlrV3SQL.g:203:3: R O W N U M B E R
            {
            mR(); 


            mO(); 


            mW(); 


            mN(); 


            mU(); 


            mM(); 


            mB(); 


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
    // $ANTLR end "ROWNUMBER"

    // $ANTLR start "OVER"
    public final void mOVER() throws RecognitionException {
        try {
            int _type = OVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AntlrV3SQL.g:204:6: ( O V E R )
            // AntlrV3SQL.g:204:7: O V E R
            {
            mO(); 


            mV(); 


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
    // $ANTLR end "OVER"

    // $ANTLR start "BETWEEN"
    public final void mBETWEEN() throws RecognitionException {
        try {
            int _type = BETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AntlrV3SQL.g:205:9: ( B E T W E E N )
            // AntlrV3SQL.g:205:10: B E T W E E N
            {
            mB(); 


            mE(); 


            mT(); 


            mW(); 


            mE(); 


            mE(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BETWEEN"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AntlrV3SQL.g:206:5: ( A N D )
            // AntlrV3SQL.g:206:6: A N D
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
            // AntlrV3SQL.g:207:4: ( O R )
            // AntlrV3SQL.g:207:5: O R
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
            // AntlrV3SQL.g:208:7: ( W H E R E )
            // AntlrV3SQL.g:208:8: W H E R E
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
            // AntlrV3SQL.g:209:7: ( G R O U P )
            // AntlrV3SQL.g:209:8: G R O U P
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
            // AntlrV3SQL.g:210:8: ( H A V I N G )
            // AntlrV3SQL.g:210:9: H A V I N G
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
            // AntlrV3SQL.g:211:4: ( B Y )
            // AntlrV3SQL.g:211:5: B Y
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
            // AntlrV3SQL.g:212:7: ( O R D E R )
            // AntlrV3SQL.g:212:8: O R D E R
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
            // AntlrV3SQL.g:213:6: ( D E S C )
            // AntlrV3SQL.g:213:7: D E S C
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
            // AntlrV3SQL.g:214:5: ( A S C )
            // AntlrV3SQL.g:214:6: A S C
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
            // AntlrV3SQL.g:215:5: ( S E T )
            // AntlrV3SQL.g:215:6: S E T
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
            // AntlrV3SQL.g:216:4: ( O N )
            // AntlrV3SQL.g:216:5: O N
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
            // AntlrV3SQL.g:217:6: ( F U L L )
            // AntlrV3SQL.g:217:7: F U L L
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
            // AntlrV3SQL.g:218:7: ( I N N E R )
            // AntlrV3SQL.g:218:8: I N N E R
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
            // AntlrV3SQL.g:219:4: ( A S )
            // AntlrV3SQL.g:219:5: A S
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
            // AntlrV3SQL.g:220:6: ( F R O M )
            // AntlrV3SQL.g:220:7: F R O M
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
            // AntlrV3SQL.g:221:6: ( L E F T )
            // AntlrV3SQL.g:221:7: L E F T
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
            // AntlrV3SQL.g:222:7: ( R I G H T )
            // AntlrV3SQL.g:222:8: R I G H T
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
            // AntlrV3SQL.g:223:7: ( C R O S S )
            // AntlrV3SQL.g:223:8: C R O S S
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
            // AntlrV3SQL.g:224:6: ( J O I N )
            // AntlrV3SQL.g:224:7: J O I N
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
            // AntlrV3SQL.g:225:8: ( V A L U E S )
            // AntlrV3SQL.g:225:9: V A L U E S
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
            // AntlrV3SQL.g:226:6: ( I N T O )
            // AntlrV3SQL.g:226:7: I N T O
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
            // AntlrV3SQL.g:227:4: ( I N )
            // AntlrV3SQL.g:227:5: I N
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
            // AntlrV3SQL.g:228:8: ( E X I S T S )
            // AntlrV3SQL.g:228:9: E X I S T S
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
            // AntlrV3SQL.g:229:9: ( '?' )
            // AntlrV3SQL.g:229:10: '?'
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
            // AntlrV3SQL.g:232:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+ )
            // AntlrV3SQL.g:233:2: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
            {
            // AntlrV3SQL.g:233:2: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // AntlrV3SQL.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
            // AntlrV3SQL.g:235:12: ( ( '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' )* '\\'' ) )
            // AntlrV3SQL.g:236:4: ( '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' )* '\\'' )
            {
            // AntlrV3SQL.g:236:4: ( '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' )* '\\'' )
            // AntlrV3SQL.g:236:5: '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' )* '\\''
            {
            match('\''); 

            // AntlrV3SQL.g:237:5: ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\'') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='\'') ) {
                        alt2=2;
                    }


                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '&')||(LA2_0 >= '(' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // AntlrV3SQL.g:238:31: ~ ( '\\'' | '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // AntlrV3SQL.g:238:56: '\\'' '\\''
            	    {
            	    match('\''); 

            	    match('\''); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
            // AntlrV3SQL.g:244:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // AntlrV3SQL.g:244:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

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
            // AntlrV3SQL.g:252:11: ( ( 'a' | 'A' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:253:11: ( ( 'b' | 'B' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:254:11: ( ( 'c' | 'C' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:255:11: ( ( 'd' | 'D' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:256:11: ( ( 'e' | 'E' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:257:11: ( ( 'f' | 'F' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:258:11: ( ( 'g' | 'G' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:259:11: ( ( 'h' | 'H' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:260:11: ( ( 'i' | 'I' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:261:11: ( ( 'j' | 'J' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:262:11: ( ( 'k' | 'K' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:263:11: ( ( 'l' | 'L' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:264:11: ( ( 'm' | 'M' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:265:11: ( ( 'n' | 'N' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:266:11: ( ( 'o' | 'O' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:267:11: ( ( 'p' | 'P' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:268:11: ( ( 'q' | 'Q' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:269:11: ( ( 'r' | 'R' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:270:11: ( ( 's' | 'S' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:271:11: ( ( 't' | 'T' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:272:11: ( ( 'u' | 'U' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:273:11: ( ( 'v' | 'V' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:274:11: ( ( 'w' | 'W' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:275:11: ( ( 'x' | 'X' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:276:11: ( ( 'y' | 'Y' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
            // AntlrV3SQL.g:277:11: ( ( 'z' | 'Z' ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        // AntlrV3SQL.g:1:8: ( T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | SELECT | INSERT | UPDATE | DELETE | ROWNUMBER | OVER | BETWEEN | AND | OR | WHERE | GROUP | HAVING | BY | ORDER | DESC | ASC | SET | ON | FULL | INNER | AS | FROM | LEFT | RIGHT | CROSS | JOIN | VALUES | INTO | IN | EXISTS | PRE_SET | BASIC_NAME | TEXT_STRING | WS )
        int alt3=46;
        alt3 = dfa3.predict(input);
        switch (alt3) {
            case 1 :
                // AntlrV3SQL.g:1:10: T__64
                {
                mT__64(); 


                }
                break;
            case 2 :
                // AntlrV3SQL.g:1:16: T__65
                {
                mT__65(); 


                }
                break;
            case 3 :
                // AntlrV3SQL.g:1:22: T__66
                {
                mT__66(); 


                }
                break;
            case 4 :
                // AntlrV3SQL.g:1:28: T__67
                {
                mT__67(); 


                }
                break;
            case 5 :
                // AntlrV3SQL.g:1:34: T__68
                {
                mT__68(); 


                }
                break;
            case 6 :
                // AntlrV3SQL.g:1:40: T__69
                {
                mT__69(); 


                }
                break;
            case 7 :
                // AntlrV3SQL.g:1:46: T__70
                {
                mT__70(); 


                }
                break;
            case 8 :
                // AntlrV3SQL.g:1:52: T__71
                {
                mT__71(); 


                }
                break;
            case 9 :
                // AntlrV3SQL.g:1:58: T__72
                {
                mT__72(); 


                }
                break;
            case 10 :
                // AntlrV3SQL.g:1:64: T__73
                {
                mT__73(); 


                }
                break;
            case 11 :
                // AntlrV3SQL.g:1:70: T__74
                {
                mT__74(); 


                }
                break;
            case 12 :
                // AntlrV3SQL.g:1:76: T__75
                {
                mT__75(); 


                }
                break;
            case 13 :
                // AntlrV3SQL.g:1:82: SELECT
                {
                mSELECT(); 


                }
                break;
            case 14 :
                // AntlrV3SQL.g:1:89: INSERT
                {
                mINSERT(); 


                }
                break;
            case 15 :
                // AntlrV3SQL.g:1:96: UPDATE
                {
                mUPDATE(); 


                }
                break;
            case 16 :
                // AntlrV3SQL.g:1:103: DELETE
                {
                mDELETE(); 


                }
                break;
            case 17 :
                // AntlrV3SQL.g:1:110: ROWNUMBER
                {
                mROWNUMBER(); 


                }
                break;
            case 18 :
                // AntlrV3SQL.g:1:120: OVER
                {
                mOVER(); 


                }
                break;
            case 19 :
                // AntlrV3SQL.g:1:125: BETWEEN
                {
                mBETWEEN(); 


                }
                break;
            case 20 :
                // AntlrV3SQL.g:1:133: AND
                {
                mAND(); 


                }
                break;
            case 21 :
                // AntlrV3SQL.g:1:137: OR
                {
                mOR(); 


                }
                break;
            case 22 :
                // AntlrV3SQL.g:1:140: WHERE
                {
                mWHERE(); 


                }
                break;
            case 23 :
                // AntlrV3SQL.g:1:146: GROUP
                {
                mGROUP(); 


                }
                break;
            case 24 :
                // AntlrV3SQL.g:1:152: HAVING
                {
                mHAVING(); 


                }
                break;
            case 25 :
                // AntlrV3SQL.g:1:159: BY
                {
                mBY(); 


                }
                break;
            case 26 :
                // AntlrV3SQL.g:1:162: ORDER
                {
                mORDER(); 


                }
                break;
            case 27 :
                // AntlrV3SQL.g:1:168: DESC
                {
                mDESC(); 


                }
                break;
            case 28 :
                // AntlrV3SQL.g:1:173: ASC
                {
                mASC(); 


                }
                break;
            case 29 :
                // AntlrV3SQL.g:1:177: SET
                {
                mSET(); 


                }
                break;
            case 30 :
                // AntlrV3SQL.g:1:181: ON
                {
                mON(); 


                }
                break;
            case 31 :
                // AntlrV3SQL.g:1:184: FULL
                {
                mFULL(); 


                }
                break;
            case 32 :
                // AntlrV3SQL.g:1:189: INNER
                {
                mINNER(); 


                }
                break;
            case 33 :
                // AntlrV3SQL.g:1:195: AS
                {
                mAS(); 


                }
                break;
            case 34 :
                // AntlrV3SQL.g:1:198: FROM
                {
                mFROM(); 


                }
                break;
            case 35 :
                // AntlrV3SQL.g:1:203: LEFT
                {
                mLEFT(); 


                }
                break;
            case 36 :
                // AntlrV3SQL.g:1:208: RIGHT
                {
                mRIGHT(); 


                }
                break;
            case 37 :
                // AntlrV3SQL.g:1:214: CROSS
                {
                mCROSS(); 


                }
                break;
            case 38 :
                // AntlrV3SQL.g:1:220: JOIN
                {
                mJOIN(); 


                }
                break;
            case 39 :
                // AntlrV3SQL.g:1:225: VALUES
                {
                mVALUES(); 


                }
                break;
            case 40 :
                // AntlrV3SQL.g:1:232: INTO
                {
                mINTO(); 


                }
                break;
            case 41 :
                // AntlrV3SQL.g:1:237: IN
                {
                mIN(); 


                }
                break;
            case 42 :
                // AntlrV3SQL.g:1:240: EXISTS
                {
                mEXISTS(); 


                }
                break;
            case 43 :
                // AntlrV3SQL.g:1:247: PRE_SET
                {
                mPRE_SET(); 


                }
                break;
            case 44 :
                // AntlrV3SQL.g:1:255: BASIC_NAME
                {
                mBASIC_NAME(); 


                }
                break;
            case 45 :
                // AntlrV3SQL.g:1:266: TEXT_STRING
                {
                mTEXT_STRING(); 


                }
                break;
            case 46 :
                // AntlrV3SQL.g:1:278: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\5\uffff\1\41\1\uffff\1\43\2\uffff\21\34\11\uffff\1\34\1\75\5\34"+
        "\1\107\1\111\1\34\1\113\1\34\1\115\13\34\1\132\1\uffff\11\34\1\uffff"+
        "\1\34\1\uffff\1\34\1\uffff\1\146\1\uffff\1\147\13\34\1\uffff\2\34"+
        "\1\165\2\34\1\170\2\34\1\173\2\34\2\uffff\3\34\1\u0081\1\u0082\1"+
        "\u0083\1\34\1\u0085\4\34\1\u008a\1\uffff\2\34\1\uffff\1\34\1\u008e"+
        "\1\uffff\1\u008f\1\34\1\u0091\1\u0092\1\34\3\uffff\1\u0094\1\uffff"+
        "\2\34\1\u0097\1\u0098\1\uffff\1\u0099\1\u009a\1\34\2\uffff\1\34"+
        "\2\uffff\1\u009d\1\uffff\1\u009e\1\u009f\4\uffff\1\34\1\u00a1\3"+
        "\uffff\1\34\1\uffff\1\u00a3\1\uffff";
    static final String DFA3_eofS =
        "\u00a4\uffff";
    static final String DFA3_minS =
        "\1\11\4\uffff\1\75\1\uffff\1\75\2\uffff\1\105\1\116\1\120\1\105"+
        "\1\111\1\116\1\105\1\116\1\110\1\122\1\101\1\122\1\105\1\122\1\117"+
        "\1\101\1\130\11\uffff\1\114\1\60\1\104\1\114\1\127\1\107\1\105\2"+
        "\60\1\124\1\60\1\104\1\60\1\105\1\117\1\126\1\114\1\117\1\106\1"+
        "\117\1\111\1\114\1\111\1\105\1\60\1\uffff\2\105\1\117\1\101\1\105"+
        "\1\103\1\116\1\110\1\122\1\uffff\1\105\1\uffff\1\127\1\uffff\1\60"+
        "\1\uffff\1\60\1\122\1\125\1\111\1\114\1\115\1\124\1\123\1\116\1"+
        "\125\1\123\1\103\1\uffff\2\122\1\60\2\124\1\60\1\125\1\124\1\60"+
        "\1\122\1\105\2\uffff\1\105\1\120\1\116\3\60\1\123\1\60\1\105\3\124"+
        "\1\60\1\uffff\2\105\1\uffff\1\115\1\60\1\uffff\1\60\1\105\2\60\1"+
        "\107\3\uffff\1\60\1\uffff\2\123\2\60\1\uffff\2\60\1\102\2\uffff"+
        "\1\116\2\uffff\1\60\1\uffff\2\60\4\uffff\1\105\1\60\3\uffff\1\122"+
        "\1\uffff\1\60\1\uffff";
    static final String DFA3_maxS =
        "\1\172\4\uffff\1\76\1\uffff\1\75\2\uffff\1\145\1\156\1\160\1\145"+
        "\1\157\1\166\1\171\1\163\1\150\1\162\1\141\1\165\1\145\1\162\1\157"+
        "\1\141\1\170\11\uffff\1\164\1\172\1\144\1\163\1\167\1\147\1\145"+
        "\2\172\1\164\1\172\1\144\1\172\1\145\1\157\1\166\1\154\1\157\1\146"+
        "\1\157\1\151\1\154\1\151\1\145\1\172\1\uffff\2\145\1\157\1\141\1"+
        "\145\1\143\1\156\1\150\1\162\1\uffff\1\145\1\uffff\1\167\1\uffff"+
        "\1\172\1\uffff\1\172\1\162\1\165\1\151\1\154\1\155\1\164\1\163\1"+
        "\156\1\165\1\163\1\143\1\uffff\2\162\1\172\2\164\1\172\1\165\1\164"+
        "\1\172\1\162\1\145\2\uffff\1\145\1\160\1\156\3\172\1\163\1\172\1"+
        "\145\3\164\1\172\1\uffff\2\145\1\uffff\1\155\1\172\1\uffff\1\172"+
        "\1\145\2\172\1\147\3\uffff\1\172\1\uffff\2\163\2\172\1\uffff\2\172"+
        "\1\142\2\uffff\1\156\2\uffff\1\172\1\uffff\2\172\4\uffff\1\145\1"+
        "\172\3\uffff\1\162\1\uffff\1\172\1\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\10\1\uffff\1\13\1\14\21\uffff"+
        "\1\53\1\54\1\55\1\56\1\6\1\7\1\5\1\12\1\11\31\uffff\1\51\11\uffff"+
        "\1\25\1\uffff\1\36\1\uffff\1\31\1\uffff\1\41\14\uffff\1\35\13\uffff"+
        "\1\24\1\34\15\uffff\1\50\2\uffff\1\33\2\uffff\1\22\5\uffff\1\37"+
        "\1\42\1\43\1\uffff\1\46\4\uffff\1\40\3\uffff\1\44\1\32\1\uffff\1"+
        "\26\1\27\1\uffff\1\45\2\uffff\1\15\1\16\1\17\1\20\2\uffff\1\30\1"+
        "\47\1\52\1\uffff\1\23\1\uffff\1\21";
    static final String DFA3_specialS =
        "\u00a4\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\36\2\uffff\1\36\22\uffff\1\36\1\1\5\uffff\1\35\1\10\1\11"+
            "\1\2\1\uffff\1\3\1\uffff\1\4\1\uffff\12\34\2\uffff\1\5\1\6\1"+
            "\7\1\33\1\uffff\1\21\1\20\1\27\1\15\1\32\1\25\1\23\1\24\1\13"+
            "\1\30\1\34\1\26\2\34\1\17\2\34\1\16\1\12\1\34\1\14\1\31\1\22"+
            "\3\34\4\uffff\1\34\1\uffff\1\21\1\20\1\27\1\15\1\32\1\25\1\23"+
            "\1\24\1\13\1\30\1\34\1\26\2\34\1\17\2\34\1\16\1\12\1\34\1\14"+
            "\1\31\1\22\3\34",
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
            "\1\51\5\uffff\1\50\31\uffff\1\51\5\uffff\1\50",
            "\1\54\3\uffff\1\53\3\uffff\1\52\27\uffff\1\54\3\uffff\1\53"+
            "\3\uffff\1\52",
            "\1\55\23\uffff\1\56\13\uffff\1\55\23\uffff\1\56",
            "\1\57\4\uffff\1\60\32\uffff\1\57\4\uffff\1\60",
            "\1\61\37\uffff\1\61",
            "\1\62\37\uffff\1\62",
            "\1\63\37\uffff\1\63",
            "\1\65\2\uffff\1\64\34\uffff\1\65\2\uffff\1\64",
            "\1\66\37\uffff\1\66",
            "\1\67\37\uffff\1\67",
            "\1\70\37\uffff\1\70",
            "\1\71\37\uffff\1\71",
            "\1\72\37\uffff\1\72",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\73\7\uffff\1\74\27\uffff\1\73\7\uffff\1\74",
            "\12\34\7\uffff\15\34\1\77\4\34\1\76\1\100\6\34\4\uffff\1\34"+
            "\1\uffff\15\34\1\77\4\34\1\76\1\100\6\34",
            "\1\101\37\uffff\1\101",
            "\1\102\6\uffff\1\103\30\uffff\1\102\6\uffff\1\103",
            "\1\104\37\uffff\1\104",
            "\1\105\37\uffff\1\105",
            "\1\106\37\uffff\1\106",
            "\12\34\7\uffff\3\34\1\110\26\34\4\uffff\1\34\1\uffff\3\34\1"+
            "\110\26\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\112\37\uffff\1\112",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\114\37\uffff\1\114",
            "\12\34\7\uffff\2\34\1\116\27\34\4\uffff\1\34\1\uffff\2\34\1"+
            "\116\27\34",
            "\1\117\37\uffff\1\117",
            "\1\120\37\uffff\1\120",
            "\1\121\37\uffff\1\121",
            "\1\122\37\uffff\1\122",
            "\1\123\37\uffff\1\123",
            "\1\124\37\uffff\1\124",
            "\1\125\37\uffff\1\125",
            "\1\126\37\uffff\1\126",
            "\1\127\37\uffff\1\127",
            "\1\130\37\uffff\1\130",
            "\1\131\37\uffff\1\131",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\133\37\uffff\1\133",
            "\1\134\37\uffff\1\134",
            "\1\135\37\uffff\1\135",
            "\1\136\37\uffff\1\136",
            "\1\137\37\uffff\1\137",
            "\1\140\37\uffff\1\140",
            "\1\141\37\uffff\1\141",
            "\1\142\37\uffff\1\142",
            "\1\143\37\uffff\1\143",
            "",
            "\1\144\37\uffff\1\144",
            "",
            "\1\145\37\uffff\1\145",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\150\37\uffff\1\150",
            "\1\151\37\uffff\1\151",
            "\1\152\37\uffff\1\152",
            "\1\153\37\uffff\1\153",
            "\1\154\37\uffff\1\154",
            "\1\155\37\uffff\1\155",
            "\1\156\37\uffff\1\156",
            "\1\157\37\uffff\1\157",
            "\1\160\37\uffff\1\160",
            "\1\161\37\uffff\1\161",
            "\1\162\37\uffff\1\162",
            "",
            "\1\163\37\uffff\1\163",
            "\1\164\37\uffff\1\164",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\166\37\uffff\1\166",
            "\1\167\37\uffff\1\167",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\171\37\uffff\1\171",
            "\1\172\37\uffff\1\172",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\174\37\uffff\1\174",
            "\1\175\37\uffff\1\175",
            "",
            "",
            "\1\176\37\uffff\1\176",
            "\1\177\37\uffff\1\177",
            "\1\u0080\37\uffff\1\u0080",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0084\37\uffff\1\u0084",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0086\37\uffff\1\u0086",
            "\1\u0087\37\uffff\1\u0087",
            "\1\u0088\37\uffff\1\u0088",
            "\1\u0089\37\uffff\1\u0089",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u008b\37\uffff\1\u008b",
            "\1\u008c\37\uffff\1\u008c",
            "",
            "\1\u008d\37\uffff\1\u008d",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0090\37\uffff\1\u0090",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0093\37\uffff\1\u0093",
            "",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u0095\37\uffff\1\u0095",
            "\1\u0096\37\uffff\1\u0096",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u009b\37\uffff\1\u009b",
            "",
            "",
            "\1\u009c\37\uffff\1\u009c",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "",
            "",
            "\1\u00a0\37\uffff\1\u00a0",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "",
            "\1\u00a2\37\uffff\1\u00a2",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
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
            return "1:1: Tokens : ( T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | SELECT | INSERT | UPDATE | DELETE | ROWNUMBER | OVER | BETWEEN | AND | OR | WHERE | GROUP | HAVING | BY | ORDER | DESC | ASC | SET | ON | FULL | INNER | AS | FROM | LEFT | RIGHT | CROSS | JOIN | VALUES | INTO | IN | EXISTS | PRE_SET | BASIC_NAME | TEXT_STRING | WS );";
        }
    }
 

}