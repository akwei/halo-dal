package halo.dal.analysis.antlr.v3;

// $ANTLR 3.4 /Users/akwei/antlrpro/sql/AntlrV3SQL.g 2012-06-13 14:10:02
import halo.dal.analysis.antlr.AntlrParserDelegate;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class AntlrV3SQLParser extends Parser {

    public static final String[] tokenNames = new String[] { "<invalid>",
            "<EOR>", "<DOWN>", "<UP>", "AND", "AND_", "AS", "AS_", "CROSS",
            "CROSS_", "DELETE", "DELETE_", "FROM", "FROM_", "FULL", "FULL_",
            "INNER", "INNER_", "INSERT", "INSERT_", "INTO", "INTO_", "JOIN",
            "JOIN_", "LEFT", "LEFT_", "LEFT_CLOSE", "ON", "ON_", "OR", "OR_",
            "PRE_SET", "RIGHT", "RIGHT_", "RIGHT_CLOSE", "SELECT", "SELECT_",
            "SET", "SET_", "UPDATE", "UPDATE_", "VALUES", "VALUES_", "WHERE",
            "WHERE_", "WORD", "WS", "'!='", "','", "'<'", "'<='", "'<>'",
            "'='", "'>'", "'>='", "'ASC'", "'BY'", "'DESC'", "'EXISTS'",
            "'GROUP'", "'HAVING'", "'IN'", "'ORDER'", "'asc'", "'by'",
            "'desc'", "'exists'", "'group'", "'having'", "'in'", "'order'" };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators
    public AntlrV3SQLParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }

    public AntlrV3SQLParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() {
        return AntlrV3SQLParser.tokenNames;
    }

    public String getGrammarFileName() {
        return "/Users/akwei/antlrpro/sql/AntlrV3SQL.g";
    }

    // List<String[]> tables = new ArrayList<String[]>();
    //
    // List<String[]> colExprs = new ArrayList<String[]>();
    private AntlrParserDelegate antlrParserDelegate;

    public void setAntlrParserDelegate(AntlrParserDelegate antlrParserDelegate) {
        this.antlrParserDelegate = antlrParserDelegate;
    }

    public void reportError(RecognitionException e) {
    }

    // $ANTLR start "proc"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:67:1: proc : ( insertSQL |
    // selectSQL | deleteSQL | updateSQL );
    public final void proc() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:67:6: ( insertSQL |
            // selectSQL | deleteSQL | updateSQL )
            int alt1 = 4;
            switch (input.LA(1)) {
                case INSERT:
                case INSERT_: {
                    alt1 = 1;
                }
                    break;
                case SELECT:
                case SELECT_: {
                    alt1 = 2;
                }
                    break;
                case DELETE:
                case DELETE_: {
                    alt1 = 3;
                }
                    break;
                case UPDATE:
                case UPDATE_: {
                    alt1 = 4;
                }
                    break;
                default:
                    NoViableAltException nvae = new NoViableAltException("", 1,
                            0, input);
                    throw nvae;
            }
            switch (alt1) {
                case 1:
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:68:2: insertSQL
                {
                    pushFollow(FOLLOW_insertSQL_in_proc275);
                    insertSQL();
                    state._fsp--;
                }
                    break;
                case 2:
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:68:12: selectSQL
                {
                    pushFollow(FOLLOW_selectSQL_in_proc277);
                    selectSQL();
                    state._fsp--;
                }
                    break;
                case 3:
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:68:22: deleteSQL
                {
                    pushFollow(FOLLOW_deleteSQL_in_proc279);
                    deleteSQL();
                    state._fsp--;
                }
                    break;
                case 4:
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:68:32: updateSQL
                {
                    pushFollow(FOLLOW_updateSQL_in_proc281);
                    updateSQL();
                    state._fsp--;
                }
                    break;
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "proc"
    // $ANTLR start "insertSQL"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:70:1: insertSQL : ( INSERT |
    // INSERT_ ) ( INTO | INTO_ ) table LEFT_CLOSE insertColumn ( ','
    // insertColumn )* RIGHT_CLOSE ( VALUES | VALUES_ ) LEFT_CLOSE ( PRE_SET | (
    // ',' PRE_SET ) )* RIGHT_CLOSE ;
    public final void insertSQL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:71:2: ( ( INSERT | INSERT_
            // ) ( INTO | INTO_ ) table LEFT_CLOSE insertColumn ( ','
            // insertColumn )* RIGHT_CLOSE ( VALUES | VALUES_ ) LEFT_CLOSE (
            // PRE_SET | ( ',' PRE_SET ) )* RIGHT_CLOSE )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:72:2: ( INSERT | INSERT_ )
            // ( INTO | INTO_ ) table LEFT_CLOSE insertColumn ( ',' insertColumn
            // )* RIGHT_CLOSE ( VALUES | VALUES_ ) LEFT_CLOSE ( PRE_SET | ( ','
            // PRE_SET ) )* RIGHT_CLOSE
            {
                if ((input.LA(1) >= INSERT && input.LA(1) <= INSERT_)) {
                    input.consume();
                    state.errorRecovery = false;
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    throw mse;
                }
                if ((input.LA(1) >= INTO && input.LA(1) <= INTO_)) {
                    input.consume();
                    state.errorRecovery = false;
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    throw mse;
                }
                pushFollow(FOLLOW_table_in_insertSQL303);
                table();
                state._fsp--;
                match(input, LEFT_CLOSE, FOLLOW_LEFT_CLOSE_in_insertSQL305);
                pushFollow(FOLLOW_insertColumn_in_insertSQL307);
                insertColumn();
                state._fsp--;
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:72:62: ( ','
                // insertColumn )*
                loop2: do {
                    int alt2 = 2;
                    int LA2_0 = input.LA(1);
                    if ((LA2_0 == 48)) {
                        alt2 = 1;
                    }
                    switch (alt2) {
                        case 1:
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:72:63: ','
                        // insertColumn
                        {
                            match(input, 48, FOLLOW_48_in_insertSQL310);
                            pushFollow(FOLLOW_insertColumn_in_insertSQL312);
                            insertColumn();
                            state._fsp--;
                        }
                            break;
                        default:
                            break loop2;
                    }
                }
                while (true);
                match(input, RIGHT_CLOSE, FOLLOW_RIGHT_CLOSE_in_insertSQL316);
                if ((input.LA(1) >= VALUES && input.LA(1) <= VALUES_)) {
                    input.consume();
                    state.errorRecovery = false;
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    throw mse;
                }
                match(input, LEFT_CLOSE, FOLLOW_LEFT_CLOSE_in_insertSQL324);
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:72:122: ( PRE_SET | (
                // ',' PRE_SET ) )*
                loop3: do {
                    int alt3 = 3;
                    int LA3_0 = input.LA(1);
                    if ((LA3_0 == PRE_SET)) {
                        alt3 = 1;
                    }
                    else if ((LA3_0 == 48)) {
                        alt3 = 2;
                    }
                    switch (alt3) {
                        case 1:
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:72:123:
                        // PRE_SET
                        {
                            match(input, PRE_SET,
                                    FOLLOW_PRE_SET_in_insertSQL327);
                        }
                            break;
                        case 2:
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:72:131: ( ','
                        // PRE_SET )
                        {
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:72:131: (
                            // ',' PRE_SET )
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:72:132:
                            // ',' PRE_SET
                            {
                                match(input, 48, FOLLOW_48_in_insertSQL330);
                                match(input, PRE_SET,
                                        FOLLOW_PRE_SET_in_insertSQL332);
                            }
                        }
                            break;
                        default:
                            break loop3;
                    }
                }
                while (true);
                match(input, RIGHT_CLOSE, FOLLOW_RIGHT_CLOSE_in_insertSQL337);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "insertSQL"
    // $ANTLR start "insertColumn"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:74:1: insertColumn : WORD ;
    public final void insertColumn() throws RecognitionException {
        Token WORD1 = null;
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:75:2: ( WORD )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:76:2: WORD
            {
                WORD1 = (Token) match(input, WORD,
                        FOLLOW_WORD_in_insertColumn350);
                // colExprs.add(new String[] {
                // (WORD1 != null ? WORD1.getText() : null), "=" });
                if (this.antlrParserDelegate != null) {
                    this.antlrParserDelegate.onFindColExper(
                            (WORD1 != null ? WORD1.getText() : null), "=");
                }
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "insertColumn"
    // $ANTLR start "deleteSQL"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:84:1: deleteSQL : ( DELETE |
    // DELETE_ ) ( FROM | FROM_ ) table ( whereSQL )? ;
    public final void deleteSQL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:85:2: ( ( DELETE | DELETE_
            // ) ( FROM | FROM_ ) table ( whereSQL )? )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:86:2: ( DELETE | DELETE_ )
            // ( FROM | FROM_ ) table ( whereSQL )?
            {
                if ((input.LA(1) >= DELETE && input.LA(1) <= DELETE_)) {
                    input.consume();
                    state.errorRecovery = false;
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    throw mse;
                }
                if ((input.LA(1) >= FROM && input.LA(1) <= FROM_)) {
                    input.consume();
                    state.errorRecovery = false;
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    throw mse;
                }
                pushFollow(FOLLOW_table_in_deleteSQL376);
                table();
                state._fsp--;
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:86:38: ( whereSQL )?
                int alt4 = 2;
                int LA4_0 = input.LA(1);
                if (((LA4_0 >= WHERE && LA4_0 <= WHERE_))) {
                    alt4 = 1;
                }
                switch (alt4) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:86:38: whereSQL
                    {
                        pushFollow(FOLLOW_whereSQL_in_deleteSQL378);
                        whereSQL();
                        state._fsp--;
                    }
                        break;
                }
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "deleteSQL"
    // $ANTLR start "selectSQL"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:88:1: selectSQL : ( SELECT |
    // SELECT_ ) selectColums ( FROM | FROM_ ) tables ( ( FULL | FULL_ | CROSS |
    // CROSS_ | INNER | INNER_ | LEFT | LEFT_ | RIGHT | RIGHT_ ) ( JOIN | JOIN_
    // ) table ( ( ON | ON_ ) WORD '=' WORD )? )? ( selectWhereSQL )? ( other )*
    // ;
    public final void selectSQL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:89:2: ( ( SELECT | SELECT_
            // ) selectColums ( FROM | FROM_ ) tables ( ( FULL | FULL_ | CROSS |
            // CROSS_ | INNER | INNER_ | LEFT | LEFT_ | RIGHT | RIGHT_ ) ( JOIN
            // | JOIN_ ) table ( ( ON | ON_ ) WORD '=' WORD )? )? (
            // selectWhereSQL )? ( other )* )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:90:2: ( SELECT | SELECT_ )
            // selectColums ( FROM | FROM_ ) tables ( ( FULL | FULL_ | CROSS |
            // CROSS_ | INNER | INNER_ | LEFT | LEFT_ | RIGHT | RIGHT_ ) ( JOIN
            // | JOIN_ ) table ( ( ON | ON_ ) WORD '=' WORD )? )? (
            // selectWhereSQL )? ( other )*
            {
                if ((input.LA(1) >= SELECT && input.LA(1) <= SELECT_)) {
                    input.consume();
                    state.errorRecovery = false;
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    throw mse;
                }
                pushFollow(FOLLOW_selectColums_in_selectSQL397);
                selectColums();
                state._fsp--;
                if ((input.LA(1) >= FROM && input.LA(1) <= FROM_)) {
                    input.consume();
                    state.errorRecovery = false;
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    throw mse;
                }
                pushFollow(FOLLOW_tables_in_selectSQL405);
                tables();
                state._fsp--;
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:90:52: ( ( FULL |
                // FULL_ | CROSS | CROSS_ | INNER | INNER_ | LEFT | LEFT_ |
                // RIGHT | RIGHT_ ) ( JOIN | JOIN_ ) table ( ( ON | ON_ ) WORD
                // '=' WORD )? )?
                int alt6 = 2;
                int LA6_0 = input.LA(1);
                if (((LA6_0 >= CROSS && LA6_0 <= CROSS_)
                        || (LA6_0 >= FULL && LA6_0 <= INNER_)
                        || (LA6_0 >= LEFT && LA6_0 <= LEFT_) || (LA6_0 >= RIGHT && LA6_0 <= RIGHT_))) {
                    alt6 = 1;
                }
                switch (alt6) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:90:53: ( FULL |
                    // FULL_ | CROSS | CROSS_ | INNER | INNER_ | LEFT | LEFT_ |
                    // RIGHT | RIGHT_ ) ( JOIN | JOIN_ ) table ( ( ON | ON_ )
                    // WORD '=' WORD )?
                    {
                        if ((input.LA(1) >= CROSS && input.LA(1) <= CROSS_)
                                || (input.LA(1) >= FULL && input.LA(1) <= INNER_)
                                || (input.LA(1) >= LEFT && input.LA(1) <= LEFT_)
                                || (input.LA(1) >= RIGHT && input.LA(1) <= RIGHT_)) {
                            input.consume();
                            state.errorRecovery = false;
                        }
                        else {
                            MismatchedSetException mse = new MismatchedSetException(
                                    null, input);
                            throw mse;
                        }
                        if ((input.LA(1) >= JOIN && input.LA(1) <= JOIN_)) {
                            input.consume();
                            state.errorRecovery = false;
                        }
                        else {
                            MismatchedSetException mse = new MismatchedSetException(
                                    null, input);
                            throw mse;
                        }
                        pushFollow(FOLLOW_table_in_selectSQL436);
                        table();
                        state._fsp--;
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:90:135: ( ( ON
                        // | ON_ ) WORD '=' WORD )?
                        int alt5 = 2;
                        int LA5_0 = input.LA(1);
                        if (((LA5_0 >= ON && LA5_0 <= ON_))) {
                            alt5 = 1;
                        }
                        switch (alt5) {
                            case 1:
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:90:136: (
                            // ON | ON_ ) WORD '=' WORD
                            {
                                if ((input.LA(1) >= ON && input.LA(1) <= ON_)) {
                                    input.consume();
                                    state.errorRecovery = false;
                                }
                                else {
                                    MismatchedSetException mse = new MismatchedSetException(
                                            null, input);
                                    throw mse;
                                }
                                match(input, WORD, FOLLOW_WORD_in_selectSQL445);
                                match(input, 52, FOLLOW_52_in_selectSQL447);
                                match(input, WORD, FOLLOW_WORD_in_selectSQL449);
                            }
                                break;
                        }
                    }
                        break;
                }
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:90:163: (
                // selectWhereSQL )?
                int alt7 = 2;
                int LA7_0 = input.LA(1);
                if (((LA7_0 >= WHERE && LA7_0 <= WHERE_))) {
                    alt7 = 1;
                }
                switch (alt7) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:90:163:
                    // selectWhereSQL
                    {
                        pushFollow(FOLLOW_selectWhereSQL_in_selectSQL455);
                        selectWhereSQL();
                        state._fsp--;
                    }
                        break;
                }
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:90:179: ( other )*
                loop8: do {
                    int alt8 = 2;
                    int LA8_0 = input.LA(1);
                    if ((LA8_0 == 56 || (LA8_0 >= 59 && LA8_0 <= 60)
                            || LA8_0 == 62 || LA8_0 == 64
                            || (LA8_0 >= 67 && LA8_0 <= 68) || LA8_0 == 70)) {
                        alt8 = 1;
                    }
                    switch (alt8) {
                        case 1:
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:90:179: other
                        {
                            pushFollow(FOLLOW_other_in_selectSQL458);
                            other();
                            state._fsp--;
                        }
                            break;
                        default:
                            break loop8;
                    }
                }
                while (true);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "selectSQL"
    // $ANTLR start "selectWhereSQL"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:92:1: selectWhereSQL : ( WHERE |
    // WHERE_ ) ( k_v | k_v2 ) ( and_or ( k_v | k_v2 ) | and_or WORD op '('
    // selectSQL ')' )* ;
    public final void selectWhereSQL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:93:2: ( ( WHERE | WHERE_ )
            // ( k_v | k_v2 ) ( and_or ( k_v | k_v2 ) | and_or WORD op '('
            // selectSQL ')' )* )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:94:2: ( WHERE | WHERE_ ) (
            // k_v | k_v2 ) ( and_or ( k_v | k_v2 ) | and_or WORD op '('
            // selectSQL ')' )*
            {
                if ((input.LA(1) >= WHERE && input.LA(1) <= WHERE_)) {
                    input.consume();
                    state.errorRecovery = false;
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    throw mse;
                }
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:94:17: ( k_v | k_v2 )
                int alt9 = 2;
                int LA9_0 = input.LA(1);
                if ((LA9_0 == WORD)) {
                    int LA9_1 = input.LA(2);
                    if ((LA9_1 == 47 || (LA9_1 >= 49 && LA9_1 <= 54)
                            || LA9_1 == 58 || LA9_1 == 61 || LA9_1 == 66 || LA9_1 == 69)) {
                        int LA9_2 = input.LA(3);
                        if ((LA9_2 == PRE_SET)) {
                            alt9 = 1;
                        }
                        else if ((LA9_2 == WORD)) {
                            alt9 = 2;
                        }
                        else {
                            NoViableAltException nvae = new NoViableAltException(
                                    "", 9, 2, input);
                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae = new NoViableAltException(
                                "", 9, 1, input);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae = new NoViableAltException("", 9,
                            0, input);
                    throw nvae;
                }
                switch (alt9) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:94:18: k_v
                    {
                        pushFollow(FOLLOW_k_v_in_selectWhereSQL478);
                        k_v();
                        state._fsp--;
                    }
                        break;
                    case 2:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:94:22: k_v2
                    {
                        pushFollow(FOLLOW_k_v2_in_selectWhereSQL480);
                        k_v2();
                        state._fsp--;
                    }
                        break;
                }
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:94:28: ( and_or ( k_v
                // | k_v2 ) | and_or WORD op '(' selectSQL ')' )*
                loop11: do {
                    int alt11 = 3;
                    int LA11_0 = input.LA(1);
                    if (((LA11_0 >= AND && LA11_0 <= AND_) || (LA11_0 >= OR && LA11_0 <= OR_))) {
                        int LA11_2 = input.LA(2);
                        if ((LA11_2 == WORD)) {
                            int LA11_3 = input.LA(3);
                            if ((LA11_3 == 47 || (LA11_3 >= 49 && LA11_3 <= 54)
                                    || LA11_3 == 58 || LA11_3 == 61
                                    || LA11_3 == 66 || LA11_3 == 69)) {
                                int LA11_4 = input.LA(4);
                                if ((LA11_4 == PRE_SET || LA11_4 == WORD)) {
                                    alt11 = 1;
                                }
                                else if ((LA11_4 == LEFT_CLOSE)) {
                                    alt11 = 2;
                                }
                            }
                        }
                    }
                    switch (alt11) {
                        case 1:
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:94:31: and_or
                        // ( k_v | k_v2 )
                        {
                            pushFollow(FOLLOW_and_or_in_selectWhereSQL486);
                            and_or();
                            state._fsp--;
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:94:38: (
                            // k_v | k_v2 )
                            int alt10 = 2;
                            int LA10_0 = input.LA(1);
                            if ((LA10_0 == WORD)) {
                                int LA10_1 = input.LA(2);
                                if ((LA10_1 == 47
                                        || (LA10_1 >= 49 && LA10_1 <= 54)
                                        || LA10_1 == 58 || LA10_1 == 61
                                        || LA10_1 == 66 || LA10_1 == 69)) {
                                    int LA10_2 = input.LA(3);
                                    if ((LA10_2 == PRE_SET)) {
                                        alt10 = 1;
                                    }
                                    else if ((LA10_2 == WORD)) {
                                        alt10 = 2;
                                    }
                                    else {
                                        NoViableAltException nvae = new NoViableAltException(
                                                "", 10, 2, input);
                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae = new NoViableAltException(
                                            "", 10, 1, input);
                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae = new NoViableAltException(
                                        "", 10, 0, input);
                                throw nvae;
                            }
                            switch (alt10) {
                                case 1:
                                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:94:39:
                                // k_v
                                {
                                    pushFollow(FOLLOW_k_v_in_selectWhereSQL489);
                                    k_v();
                                    state._fsp--;
                                }
                                    break;
                                case 2:
                                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:94:43:
                                // k_v2
                                {
                                    pushFollow(FOLLOW_k_v2_in_selectWhereSQL491);
                                    k_v2();
                                    state._fsp--;
                                }
                                    break;
                            }
                        }
                            break;
                        case 2:
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:94:51: and_or
                        // WORD op '(' selectSQL ')'
                        {
                            pushFollow(FOLLOW_and_or_in_selectWhereSQL496);
                            and_or();
                            state._fsp--;
                            match(input, WORD, FOLLOW_WORD_in_selectWhereSQL498);
                            pushFollow(FOLLOW_op_in_selectWhereSQL500);
                            op();
                            state._fsp--;
                            match(input, LEFT_CLOSE,
                                    FOLLOW_LEFT_CLOSE_in_selectWhereSQL502);
                            pushFollow(FOLLOW_selectSQL_in_selectWhereSQL504);
                            selectSQL();
                            state._fsp--;
                            match(input, RIGHT_CLOSE,
                                    FOLLOW_RIGHT_CLOSE_in_selectWhereSQL506);
                        }
                            break;
                        default:
                            break loop11;
                    }
                }
                while (true);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "selectWhereSQL"
    // $ANTLR start "updateSQL"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:96:1: updateSQL : ( UPDATE |
    // UPDATE_ ) table ( SET | SET_ ) ( k_v ( ',' k_v )* ) ( whereSQL )? ;
    public final void updateSQL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:97:2: ( ( UPDATE | UPDATE_
            // ) table ( SET | SET_ ) ( k_v ( ',' k_v )* ) ( whereSQL )? )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:98:2: ( UPDATE | UPDATE_ )
            // table ( SET | SET_ ) ( k_v ( ',' k_v )* ) ( whereSQL )?
            {
                if ((input.LA(1) >= UPDATE && input.LA(1) <= UPDATE_)) {
                    input.consume();
                    state.errorRecovery = false;
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    throw mse;
                }
                pushFollow(FOLLOW_table_in_updateSQL527);
                table();
                state._fsp--;
                if ((input.LA(1) >= SET && input.LA(1) <= SET_)) {
                    input.consume();
                    state.errorRecovery = false;
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    throw mse;
                }
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:98:36: ( k_v ( ',' k_v
                // )* )
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:98:37: k_v ( ',' k_v
                // )*
                {
                    pushFollow(FOLLOW_k_v_in_updateSQL536);
                    k_v();
                    state._fsp--;
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:98:41: ( ',' k_v
                    // )*
                    loop12: do {
                        int alt12 = 2;
                        int LA12_0 = input.LA(1);
                        if ((LA12_0 == 48)) {
                            alt12 = 1;
                        }
                        switch (alt12) {
                            case 1:
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:98:42: ','
                            // k_v
                            {
                                match(input, 48, FOLLOW_48_in_updateSQL539);
                                pushFollow(FOLLOW_k_v_in_updateSQL541);
                                k_v();
                                state._fsp--;
                            }
                                break;
                            default:
                                break loop12;
                        }
                    }
                    while (true);
                }
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:98:53: ( whereSQL )?
                int alt13 = 2;
                int LA13_0 = input.LA(1);
                if (((LA13_0 >= WHERE && LA13_0 <= WHERE_))) {
                    alt13 = 1;
                }
                switch (alt13) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:98:53: whereSQL
                    {
                        pushFollow(FOLLOW_whereSQL_in_updateSQL546);
                        whereSQL();
                        state._fsp--;
                    }
                        break;
                }
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "updateSQL"
    // $ANTLR start "table"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:101:1: table : name ( ( AS | AS_
    // )? alias )? ;
    public final void table() throws RecognitionException {
        AntlrV3SQLParser.name_return name2 = null;
        AntlrV3SQLParser.alias_return alias3 = null;
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:101:7: ( name ( ( AS | AS_
            // )? alias )? )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:102:2: name ( ( AS | AS_
            // )? alias )?
            {
                pushFollow(FOLLOW_name_in_table558);
                name2 = name();
                state._fsp--;
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:102:7: ( ( AS | AS_ )?
                // alias )?
                int alt15 = 2;
                int LA15_0 = input.LA(1);
                if (((LA15_0 >= AS && LA15_0 <= AS_) || LA15_0 == WORD)) {
                    alt15 = 1;
                }
                switch (alt15) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:102:8: ( AS | AS_
                    // )? alias
                    {
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:102:8: ( AS |
                        // AS_ )?
                        int alt14 = 2;
                        int LA14_0 = input.LA(1);
                        if (((LA14_0 >= AS && LA14_0 <= AS_))) {
                            alt14 = 1;
                        }
                        switch (alt14) {
                            case 1:
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:
                            {
                                if ((input.LA(1) >= AS && input.LA(1) <= AS_)) {
                                    input.consume();
                                    state.errorRecovery = false;
                                }
                                else {
                                    MismatchedSetException mse = new MismatchedSetException(
                                            null, input);
                                    throw mse;
                                }
                            }
                                break;
                        }
                        pushFollow(FOLLOW_alias_in_table568);
                        alias3 = alias();
                        state._fsp--;
                    }
                        break;
                }
                // tables.add(new String[] {
                // (name2 != null ? input
                // .toString(name2.start, name2.stop) : null),
                // (alias3 != null ? input.toString(alias3.start,
                // alias3.stop) : null) });
                if (this.antlrParserDelegate != null) {
                    this.antlrParserDelegate.onFindTable(
                            (name2 != null ? input.toString(name2.start,
                                    name2.stop) : null),
                            (alias3 != null ? input.toString(alias3.start,
                                    alias3.stop) : null));
                }
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "table"
    // $ANTLR start "tables"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:113:1: tables : ( table ( ','
    // table )* ) ;
    public final void tables() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:113:8: ( ( table ( ','
            // table )* ) )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:114:2: ( table ( ',' table
            // )* )
            {
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:114:2: ( table ( ','
                // table )* )
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:114:3: table ( ','
                // table )*
                {
                    pushFollow(FOLLOW_table_in_tables583);
                    table();
                    state._fsp--;
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:114:9: ( ',' table
                    // )*
                    loop16: do {
                        int alt16 = 2;
                        int LA16_0 = input.LA(1);
                        if ((LA16_0 == 48)) {
                            alt16 = 1;
                        }
                        switch (alt16) {
                            case 1:
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:114:10:
                            // ',' table
                            {
                                match(input, 48, FOLLOW_48_in_tables586);
                                pushFollow(FOLLOW_table_in_tables588);
                                table();
                                state._fsp--;
                            }
                                break;
                            default:
                                break loop16;
                        }
                    }
                    while (true);
                }
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "tables"
    // $ANTLR start "k_v2"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:116:1: k_v2 : WORD op WORD ;
    public final void k_v2() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:116:6: ( WORD op WORD )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:117:2: WORD op WORD
            {
                match(input, WORD, FOLLOW_WORD_in_k_v2601);
                pushFollow(FOLLOW_op_in_k_v2603);
                op();
                state._fsp--;
                match(input, WORD, FOLLOW_WORD_in_k_v2605);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "k_v2"
    // $ANTLR start "k_v"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:119:1: k_v : WORD op PRE_SET ;
    public final void k_v() throws RecognitionException {
        Token WORD4 = null;
        AntlrV3SQLParser.op_return op5 = null;
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:119:5: ( WORD op PRE_SET )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:120:2: WORD op PRE_SET
            {
                WORD4 = (Token) match(input, WORD, FOLLOW_WORD_in_k_v615);
                pushFollow(FOLLOW_op_in_k_v617);
                op5 = op();
                state._fsp--;
                match(input, PRE_SET, FOLLOW_PRE_SET_in_k_v619);
                // colExprs.add(new String[] {
                // (WORD4 != null ? WORD4.getText() : null),
                // (op5 != null ? input.toString(op5.start, op5.stop)
                // : null) });
                if (this.antlrParserDelegate != null) {
                    this.antlrParserDelegate.onFindColExper(
                            (WORD4 != null ? WORD4.getText() : null),
                            (op5 != null ? input.toString(op5.start, op5.stop)
                                    : null));
                }
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "k_v"
    // $ANTLR start "column"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:130:1: column : name ( ( AS | AS_
    // )? alias )? ;
    public final void column() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:130:8: ( name ( ( AS | AS_
            // )? alias )? )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:131:2: name ( ( AS | AS_
            // )? alias )?
            {
                pushFollow(FOLLOW_name_in_column631);
                name();
                state._fsp--;
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:131:7: ( ( AS | AS_ )?
                // alias )?
                int alt18 = 2;
                int LA18_0 = input.LA(1);
                if (((LA18_0 >= AS && LA18_0 <= AS_) || LA18_0 == WORD)) {
                    alt18 = 1;
                }
                switch (alt18) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:131:8: ( AS | AS_
                    // )? alias
                    {
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:131:8: ( AS |
                        // AS_ )?
                        int alt17 = 2;
                        int LA17_0 = input.LA(1);
                        if (((LA17_0 >= AS && LA17_0 <= AS_))) {
                            alt17 = 1;
                        }
                        switch (alt17) {
                            case 1:
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:
                            {
                                if ((input.LA(1) >= AS && input.LA(1) <= AS_)) {
                                    input.consume();
                                    state.errorRecovery = false;
                                }
                                else {
                                    MismatchedSetException mse = new MismatchedSetException(
                                            null, input);
                                    throw mse;
                                }
                            }
                                break;
                        }
                        pushFollow(FOLLOW_alias_in_column641);
                        alias();
                        state._fsp--;
                    }
                        break;
                }
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "column"
    // $ANTLR start "sel_column"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:133:1: sel_column : sel_name ( (
    // AS | AS_ )? sel_alias )? ;
    public final void sel_column() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:133:12: ( sel_name ( ( AS
            // | AS_ )? sel_alias )? )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:134:2: sel_name ( ( AS |
            // AS_ )? sel_alias )?
            {
                pushFollow(FOLLOW_sel_name_in_sel_column654);
                sel_name();
                state._fsp--;
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:134:11: ( ( AS | AS_
                // )? sel_alias )?
                int alt20 = 2;
                int LA20_0 = input.LA(1);
                if (((LA20_0 >= AS && LA20_0 <= AS_) || LA20_0 == WORD)) {
                    alt20 = 1;
                }
                switch (alt20) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:134:12: ( AS | AS_
                    // )? sel_alias
                    {
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:134:12: ( AS |
                        // AS_ )?
                        int alt19 = 2;
                        int LA19_0 = input.LA(1);
                        if (((LA19_0 >= AS && LA19_0 <= AS_))) {
                            alt19 = 1;
                        }
                        switch (alt19) {
                            case 1:
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:
                            {
                                if ((input.LA(1) >= AS && input.LA(1) <= AS_)) {
                                    input.consume();
                                    state.errorRecovery = false;
                                }
                                else {
                                    MismatchedSetException mse = new MismatchedSetException(
                                            null, input);
                                    throw mse;
                                }
                            }
                                break;
                        }
                        pushFollow(FOLLOW_sel_alias_in_sel_column664);
                        sel_alias();
                        state._fsp--;
                    }
                        break;
                }
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "sel_column"
    // $ANTLR start "selectColums"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:136:1: selectColums : ( sel_column
    // ( ',' sel_column )* ) ;
    public final void selectColums() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:137:2: ( ( sel_column (
            // ',' sel_column )* ) )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:138:2: ( sel_column ( ','
            // sel_column )* )
            {
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:138:2: ( sel_column (
                // ',' sel_column )* )
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:138:3: sel_column (
                // ',' sel_column )*
                {
                    pushFollow(FOLLOW_sel_column_in_selectColums677);
                    sel_column();
                    state._fsp--;
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:138:14: ( ','
                    // sel_column )*
                    loop21: do {
                        int alt21 = 2;
                        int LA21_0 = input.LA(1);
                        if ((LA21_0 == 48)) {
                            alt21 = 1;
                        }
                        switch (alt21) {
                            case 1:
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:138:15:
                            // ',' sel_column
                            {
                                match(input, 48, FOLLOW_48_in_selectColums680);
                                pushFollow(FOLLOW_sel_column_in_selectColums682);
                                sel_column();
                                state._fsp--;
                            }
                                break;
                            default:
                                break loop21;
                        }
                    }
                    while (true);
                }
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "selectColums"
    // $ANTLR start "whereSQL"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:140:1: whereSQL : ( WHERE | WHERE_
    // ) ( k_v | k_v2 ) ( and_or ( k_v | k_v2 ) )* ;
    public final void whereSQL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:140:9: ( ( WHERE | WHERE_
            // ) ( k_v | k_v2 ) ( and_or ( k_v | k_v2 ) )* )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:141:2: ( WHERE | WHERE_ )
            // ( k_v | k_v2 ) ( and_or ( k_v | k_v2 ) )*
            {
                if ((input.LA(1) >= WHERE && input.LA(1) <= WHERE_)) {
                    input.consume();
                    state.errorRecovery = false;
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    throw mse;
                }
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:141:17: ( k_v | k_v2 )
                int alt22 = 2;
                int LA22_0 = input.LA(1);
                if ((LA22_0 == WORD)) {
                    int LA22_1 = input.LA(2);
                    if ((LA22_1 == 47 || (LA22_1 >= 49 && LA22_1 <= 54)
                            || LA22_1 == 58 || LA22_1 == 61 || LA22_1 == 66 || LA22_1 == 69)) {
                        int LA22_2 = input.LA(3);
                        if ((LA22_2 == PRE_SET)) {
                            alt22 = 1;
                        }
                        else if ((LA22_2 == WORD)) {
                            alt22 = 2;
                        }
                        else {
                            NoViableAltException nvae = new NoViableAltException(
                                    "", 22, 2, input);
                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae = new NoViableAltException(
                                "", 22, 1, input);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae = new NoViableAltException("",
                            22, 0, input);
                    throw nvae;
                }
                switch (alt22) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:141:18: k_v
                    {
                        pushFollow(FOLLOW_k_v_in_whereSQL703);
                        k_v();
                        state._fsp--;
                    }
                        break;
                    case 2:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:141:22: k_v2
                    {
                        pushFollow(FOLLOW_k_v2_in_whereSQL705);
                        k_v2();
                        state._fsp--;
                    }
                        break;
                }
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:141:28: ( and_or ( k_v
                // | k_v2 ) )*
                loop24: do {
                    int alt24 = 2;
                    int LA24_0 = input.LA(1);
                    if (((LA24_0 >= AND && LA24_0 <= AND_) || (LA24_0 >= OR && LA24_0 <= OR_))) {
                        alt24 = 1;
                    }
                    switch (alt24) {
                        case 1:
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:141:29: and_or
                        // ( k_v | k_v2 )
                        {
                            pushFollow(FOLLOW_and_or_in_whereSQL709);
                            and_or();
                            state._fsp--;
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:141:36: (
                            // k_v | k_v2 )
                            int alt23 = 2;
                            int LA23_0 = input.LA(1);
                            if ((LA23_0 == WORD)) {
                                int LA23_1 = input.LA(2);
                                if ((LA23_1 == 47
                                        || (LA23_1 >= 49 && LA23_1 <= 54)
                                        || LA23_1 == 58 || LA23_1 == 61
                                        || LA23_1 == 66 || LA23_1 == 69)) {
                                    int LA23_2 = input.LA(3);
                                    if ((LA23_2 == PRE_SET)) {
                                        alt23 = 1;
                                    }
                                    else if ((LA23_2 == WORD)) {
                                        alt23 = 2;
                                    }
                                    else {
                                        NoViableAltException nvae = new NoViableAltException(
                                                "", 23, 2, input);
                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae = new NoViableAltException(
                                            "", 23, 1, input);
                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae = new NoViableAltException(
                                        "", 23, 0, input);
                                throw nvae;
                            }
                            switch (alt23) {
                                case 1:
                                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:141:37:
                                // k_v
                                {
                                    pushFollow(FOLLOW_k_v_in_whereSQL712);
                                    k_v();
                                    state._fsp--;
                                }
                                    break;
                                case 2:
                                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:141:41:
                                // k_v2
                                {
                                    pushFollow(FOLLOW_k_v2_in_whereSQL714);
                                    k_v2();
                                    state._fsp--;
                                }
                                    break;
                            }
                        }
                            break;
                        default:
                            break loop24;
                    }
                }
                while (true);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "whereSQL"
    // $ANTLR start "and_or"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:143:1: and_or : ( AND | AND_ | OR
    // | OR_ ) ;
    public final void and_or() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:143:8: ( ( AND | AND_ | OR
            // | OR_ ) )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:
            {
                if ((input.LA(1) >= AND && input.LA(1) <= AND_)
                        || (input.LA(1) >= OR && input.LA(1) <= OR_)) {
                    input.consume();
                    state.errorRecovery = false;
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    throw mse;
                }
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "and_or"
    public static class op_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "op"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:146:1: op : ( '=' | '>' | '>=' |
    // '<' | '<=' | '!=' | '<>' | 'in' | 'IN' | 'exists' | 'EXISTS' ) ;
    public final AntlrV3SQLParser.op_return op() throws RecognitionException {
        AntlrV3SQLParser.op_return retval = new AntlrV3SQLParser.op_return();
        retval.start = input.LT(1);
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:147:2: ( ( '=' | '>' |
            // '>=' | '<' | '<=' | '!=' | '<>' | 'in' | 'IN' | 'exists' |
            // 'EXISTS' ) )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:
            {
                if (input.LA(1) == 47
                        || (input.LA(1) >= 49 && input.LA(1) <= 54)
                        || input.LA(1) == 58 || input.LA(1) == 61
                        || input.LA(1) == 66 || input.LA(1) == 69) {
                    input.consume();
                    state.errorRecovery = false;
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    throw mse;
                }
            }
            retval.stop = input.LT(-1);
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "op"
    // $ANTLR start "other"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:150:1: other : ( 'group' | 'GROUP'
    // | 'order' | 'ORDER' | 'having' | 'HAVING' | 'by' | 'BY' )+ WORD ( 'desc'
    // | 'DESC' | 'asc' | 'ASC' ) ;
    public final void other() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:150:7: ( ( 'group' |
            // 'GROUP' | 'order' | 'ORDER' | 'having' | 'HAVING' | 'by' | 'BY'
            // )+ WORD ( 'desc' | 'DESC' | 'asc' | 'ASC' ) )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:151:2: ( 'group' | 'GROUP'
            // | 'order' | 'ORDER' | 'having' | 'HAVING' | 'by' | 'BY' )+ WORD (
            // 'desc' | 'DESC' | 'asc' | 'ASC' )
            {
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:151:2: ( 'group' |
                // 'GROUP' | 'order' | 'ORDER' | 'having' | 'HAVING' | 'by' |
                // 'BY' )+
                int cnt25 = 0;
                loop25: do {
                    int alt25 = 2;
                    int LA25_0 = input.LA(1);
                    if ((LA25_0 == 56 || (LA25_0 >= 59 && LA25_0 <= 60)
                            || LA25_0 == 62 || LA25_0 == 64
                            || (LA25_0 >= 67 && LA25_0 <= 68) || LA25_0 == 70)) {
                        alt25 = 1;
                    }
                    switch (alt25) {
                        case 1:
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:
                        {
                            if (input.LA(1) == 56
                                    || (input.LA(1) >= 59 && input.LA(1) <= 60)
                                    || input.LA(1) == 62 || input.LA(1) == 64
                                    || (input.LA(1) >= 67 && input.LA(1) <= 68)
                                    || input.LA(1) == 70) {
                                input.consume();
                                state.errorRecovery = false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(
                                        null, input);
                                throw mse;
                            }
                        }
                            break;
                        default:
                            if (cnt25 >= 1)
                                break loop25;
                            EarlyExitException eee = new EarlyExitException(25,
                                    input);
                            throw eee;
                    }
                    cnt25++;
                }
                while (true);
                match(input, WORD, FOLLOW_WORD_in_other800);
                if (input.LA(1) == 55 || input.LA(1) == 57 || input.LA(1) == 63
                        || input.LA(1) == 65) {
                    input.consume();
                    state.errorRecovery = false;
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    throw mse;
                }
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "other"
    // $ANTLR start "sel_name"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:153:1: sel_name : WORD (
    // LEFT_CLOSE WORD RIGHT_CLOSE )* ;
    public final void sel_name() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:153:9: ( WORD ( LEFT_CLOSE
            // WORD RIGHT_CLOSE )* )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:154:2: WORD ( LEFT_CLOSE
            // WORD RIGHT_CLOSE )*
            {
                match(input, WORD, FOLLOW_WORD_in_sel_name819);
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:154:7: ( LEFT_CLOSE
                // WORD RIGHT_CLOSE )*
                loop26: do {
                    int alt26 = 2;
                    int LA26_0 = input.LA(1);
                    if ((LA26_0 == LEFT_CLOSE)) {
                        alt26 = 1;
                    }
                    switch (alt26) {
                        case 1:
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:154:8:
                        // LEFT_CLOSE WORD RIGHT_CLOSE
                        {
                            match(input, LEFT_CLOSE,
                                    FOLLOW_LEFT_CLOSE_in_sel_name822);
                            match(input, WORD, FOLLOW_WORD_in_sel_name824);
                            match(input, RIGHT_CLOSE,
                                    FOLLOW_RIGHT_CLOSE_in_sel_name826);
                        }
                            break;
                        default:
                            break loop26;
                    }
                }
                while (true);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "sel_name"
    // $ANTLR start "sel_alias"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:156:1: sel_alias : WORD (
    // LEFT_CLOSE WORD RIGHT_CLOSE )* ;
    public final void sel_alias() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:156:10: ( WORD (
            // LEFT_CLOSE WORD RIGHT_CLOSE )* )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:157:2: WORD ( LEFT_CLOSE
            // WORD RIGHT_CLOSE )*
            {
                match(input, WORD, FOLLOW_WORD_in_sel_alias838);
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:157:7: ( LEFT_CLOSE
                // WORD RIGHT_CLOSE )*
                loop27: do {
                    int alt27 = 2;
                    int LA27_0 = input.LA(1);
                    if ((LA27_0 == LEFT_CLOSE)) {
                        alt27 = 1;
                    }
                    switch (alt27) {
                        case 1:
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:157:8:
                        // LEFT_CLOSE WORD RIGHT_CLOSE
                        {
                            match(input, LEFT_CLOSE,
                                    FOLLOW_LEFT_CLOSE_in_sel_alias841);
                            match(input, WORD, FOLLOW_WORD_in_sel_alias843);
                            match(input, RIGHT_CLOSE,
                                    FOLLOW_RIGHT_CLOSE_in_sel_alias845);
                        }
                            break;
                        default:
                            break loop27;
                    }
                }
                while (true);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "sel_alias"
    public static class name_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "name"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:159:1: name : WORD ;
    public final AntlrV3SQLParser.name_return name()
            throws RecognitionException {
        AntlrV3SQLParser.name_return retval = new AntlrV3SQLParser.name_return();
        retval.start = input.LT(1);
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:159:6: ( WORD )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:160:2: WORD
            {
                match(input, WORD, FOLLOW_WORD_in_name857);
            }
            retval.stop = input.LT(-1);
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "name"
    public static class alias_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "alias"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:162:1: alias : WORD ;
    public final AntlrV3SQLParser.alias_return alias()
            throws RecognitionException {
        AntlrV3SQLParser.alias_return retval = new AntlrV3SQLParser.alias_return();
        retval.start = input.LT(1);
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:162:7: ( WORD )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:163:2: WORD
            {
                match(input, WORD, FOLLOW_WORD_in_alias867);
            }
            retval.stop = input.LT(-1);
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "alias"
    // Delegated rules
    public static final BitSet FOLLOW_insertSQL_in_proc275 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_selectSQL_in_proc277 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_deleteSQL_in_proc279 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_updateSQL_in_proc281 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_set_in_insertSQL291 = new BitSet(
            new long[] { 0x0000000000300000L });

    public static final BitSet FOLLOW_set_in_insertSQL297 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_table_in_insertSQL303 = new BitSet(
            new long[] { 0x0000000004000000L });

    public static final BitSet FOLLOW_LEFT_CLOSE_in_insertSQL305 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_insertColumn_in_insertSQL307 = new BitSet(
            new long[] { 0x0001000400000000L });

    public static final BitSet FOLLOW_48_in_insertSQL310 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_insertColumn_in_insertSQL312 = new BitSet(
            new long[] { 0x0001000400000000L });

    public static final BitSet FOLLOW_RIGHT_CLOSE_in_insertSQL316 = new BitSet(
            new long[] { 0x0000060000000000L });

    public static final BitSet FOLLOW_set_in_insertSQL318 = new BitSet(
            new long[] { 0x0000000004000000L });

    public static final BitSet FOLLOW_LEFT_CLOSE_in_insertSQL324 = new BitSet(
            new long[] { 0x0001000480000000L });

    public static final BitSet FOLLOW_PRE_SET_in_insertSQL327 = new BitSet(
            new long[] { 0x0001000480000000L });

    public static final BitSet FOLLOW_48_in_insertSQL330 = new BitSet(
            new long[] { 0x0000000080000000L });

    public static final BitSet FOLLOW_PRE_SET_in_insertSQL332 = new BitSet(
            new long[] { 0x0001000480000000L });

    public static final BitSet FOLLOW_RIGHT_CLOSE_in_insertSQL337 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_WORD_in_insertColumn350 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_set_in_deleteSQL364 = new BitSet(
            new long[] { 0x0000000000003000L });

    public static final BitSet FOLLOW_set_in_deleteSQL370 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_table_in_deleteSQL376 = new BitSet(
            new long[] { 0x0000180000000002L });

    public static final BitSet FOLLOW_whereSQL_in_deleteSQL378 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_set_in_selectSQL391 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_selectColums_in_selectSQL397 = new BitSet(
            new long[] { 0x0000000000003000L });

    public static final BitSet FOLLOW_set_in_selectSQL399 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_tables_in_selectSQL405 = new BitSet(
            new long[] { 0x590018030303C302L, 0x0000000000000059L });

    public static final BitSet FOLLOW_set_in_selectSQL408 = new BitSet(
            new long[] { 0x0000000000C00000L });

    public static final BitSet FOLLOW_set_in_selectSQL430 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_table_in_selectSQL436 = new BitSet(
            new long[] { 0x5900180018000002L, 0x0000000000000059L });

    public static final BitSet FOLLOW_set_in_selectSQL439 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_WORD_in_selectSQL445 = new BitSet(
            new long[] { 0x0010000000000000L });

    public static final BitSet FOLLOW_52_in_selectSQL447 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_WORD_in_selectSQL449 = new BitSet(
            new long[] { 0x5900180000000002L, 0x0000000000000059L });

    public static final BitSet FOLLOW_selectWhereSQL_in_selectSQL455 = new BitSet(
            new long[] { 0x5900000000000002L, 0x0000000000000059L });

    public static final BitSet FOLLOW_other_in_selectSQL458 = new BitSet(
            new long[] { 0x5900000000000002L, 0x0000000000000059L });

    public static final BitSet FOLLOW_set_in_selectWhereSQL471 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_k_v_in_selectWhereSQL478 = new BitSet(
            new long[] { 0x0000000060000032L });

    public static final BitSet FOLLOW_k_v2_in_selectWhereSQL480 = new BitSet(
            new long[] { 0x0000000060000032L });

    public static final BitSet FOLLOW_and_or_in_selectWhereSQL486 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_k_v_in_selectWhereSQL489 = new BitSet(
            new long[] { 0x0000000060000032L });

    public static final BitSet FOLLOW_k_v2_in_selectWhereSQL491 = new BitSet(
            new long[] { 0x0000000060000032L });

    public static final BitSet FOLLOW_and_or_in_selectWhereSQL496 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_WORD_in_selectWhereSQL498 = new BitSet(
            new long[] { 0x247E800000000000L, 0x0000000000000024L });

    public static final BitSet FOLLOW_op_in_selectWhereSQL500 = new BitSet(
            new long[] { 0x0000000004000000L });

    public static final BitSet FOLLOW_LEFT_CLOSE_in_selectWhereSQL502 = new BitSet(
            new long[] { 0x0000001800000000L });

    public static final BitSet FOLLOW_selectSQL_in_selectWhereSQL504 = new BitSet(
            new long[] { 0x0000000400000000L });

    public static final BitSet FOLLOW_RIGHT_CLOSE_in_selectWhereSQL506 = new BitSet(
            new long[] { 0x0000000060000032L });

    public static final BitSet FOLLOW_set_in_updateSQL521 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_table_in_updateSQL527 = new BitSet(
            new long[] { 0x0000006000000000L });

    public static final BitSet FOLLOW_set_in_updateSQL529 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_k_v_in_updateSQL536 = new BitSet(
            new long[] { 0x0001180000000002L });

    public static final BitSet FOLLOW_48_in_updateSQL539 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_k_v_in_updateSQL541 = new BitSet(
            new long[] { 0x0001180000000002L });

    public static final BitSet FOLLOW_whereSQL_in_updateSQL546 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_name_in_table558 = new BitSet(
            new long[] { 0x00002000000000C2L });

    public static final BitSet FOLLOW_alias_in_table568 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_table_in_tables583 = new BitSet(
            new long[] { 0x0001000000000002L });

    public static final BitSet FOLLOW_48_in_tables586 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_table_in_tables588 = new BitSet(
            new long[] { 0x0001000000000002L });

    public static final BitSet FOLLOW_WORD_in_k_v2601 = new BitSet(new long[] {
            0x247E800000000000L, 0x0000000000000024L });

    public static final BitSet FOLLOW_op_in_k_v2603 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_WORD_in_k_v2605 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_WORD_in_k_v615 = new BitSet(new long[] {
            0x247E800000000000L, 0x0000000000000024L });

    public static final BitSet FOLLOW_op_in_k_v617 = new BitSet(
            new long[] { 0x0000000080000000L });

    public static final BitSet FOLLOW_PRE_SET_in_k_v619 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_name_in_column631 = new BitSet(
            new long[] { 0x00002000000000C2L });

    public static final BitSet FOLLOW_alias_in_column641 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_sel_name_in_sel_column654 = new BitSet(
            new long[] { 0x00002000000000C2L });

    public static final BitSet FOLLOW_sel_alias_in_sel_column664 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_sel_column_in_selectColums677 = new BitSet(
            new long[] { 0x0001000000000002L });

    public static final BitSet FOLLOW_48_in_selectColums680 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_sel_column_in_selectColums682 = new BitSet(
            new long[] { 0x0001000000000002L });

    public static final BitSet FOLLOW_set_in_whereSQL696 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_k_v_in_whereSQL703 = new BitSet(
            new long[] { 0x0000000060000032L });

    public static final BitSet FOLLOW_k_v2_in_whereSQL705 = new BitSet(
            new long[] { 0x0000000060000032L });

    public static final BitSet FOLLOW_and_or_in_whereSQL709 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_k_v_in_whereSQL712 = new BitSet(
            new long[] { 0x0000000060000032L });

    public static final BitSet FOLLOW_k_v2_in_whereSQL714 = new BitSet(
            new long[] { 0x0000000060000032L });

    public static final BitSet FOLLOW_WORD_in_other800 = new BitSet(new long[] {
            0x8280000000000000L, 0x0000000000000002L });

    public static final BitSet FOLLOW_set_in_other802 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_WORD_in_sel_name819 = new BitSet(
            new long[] { 0x0000000004000002L });

    public static final BitSet FOLLOW_LEFT_CLOSE_in_sel_name822 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_WORD_in_sel_name824 = new BitSet(
            new long[] { 0x0000000400000000L });

    public static final BitSet FOLLOW_RIGHT_CLOSE_in_sel_name826 = new BitSet(
            new long[] { 0x0000000004000002L });

    public static final BitSet FOLLOW_WORD_in_sel_alias838 = new BitSet(
            new long[] { 0x0000000004000002L });

    public static final BitSet FOLLOW_LEFT_CLOSE_in_sel_alias841 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_WORD_in_sel_alias843 = new BitSet(
            new long[] { 0x0000000400000000L });

    public static final BitSet FOLLOW_RIGHT_CLOSE_in_sel_alias845 = new BitSet(
            new long[] { 0x0000000004000002L });

    public static final BitSet FOLLOW_WORD_in_name857 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_WORD_in_alias867 = new BitSet(
            new long[] { 0x0000000000000002L });
}