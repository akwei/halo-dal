package halo.dal.analysis.antlr.v3;

// $ANTLR 3.4 /Users/akwei/antlrpro/sql/AntlrV3SQL.g 2012-07-15 15:47:36
import halo.dal.analysis.antlr.AntlrParserDelegate;

import java.util.ArrayList;
import java.util.List;

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

    @Override
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
    // WHERE_ ) ( k_v ) ( and_or ( k_v ) | and_or WORD op '(' selectSQL ')' )* ;
    public final void selectWhereSQL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:93:2: ( ( WHERE | WHERE_ )
            // ( k_v ) ( and_or ( k_v ) | and_or WORD op '(' selectSQL ')' )* )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:94:2: ( WHERE | WHERE_ ) (
            // k_v ) ( and_or ( k_v ) | and_or WORD op '(' selectSQL ')' )*
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
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:94:17: ( k_v )
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:94:18: k_v
                {
                    pushFollow(FOLLOW_k_v_in_selectWhereSQL478);
                    k_v();
                    state._fsp--;
                }
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:94:23: ( and_or ( k_v
                // ) | and_or WORD op '(' selectSQL ')' )*
                loop9: do {
                    int alt9 = 3;
                    int LA9_0 = input.LA(1);
                    if (((LA9_0 >= AND && LA9_0 <= AND_) || (LA9_0 >= OR && LA9_0 <= OR_))) {
                        int LA9_2 = input.LA(2);
                        if ((LA9_2 == WORD)) {
                            int LA9_3 = input.LA(3);
                            if ((LA9_3 == 47 || (LA9_3 >= 49 && LA9_3 <= 54)
                                    || LA9_3 == 58 || LA9_3 == 61
                                    || LA9_3 == 66 || LA9_3 == 69)) {
                                int LA9_4 = input.LA(4);
                                if ((LA9_4 == PRE_SET)) {
                                    alt9 = 1;
                                }
                                else if ((LA9_4 == LEFT_CLOSE)) {
                                    alt9 = 2;
                                }
                            }
                        }
                    }
                    switch (alt9) {
                        case 1:
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:94:26: and_or
                        // ( k_v )
                        {
                            pushFollow(FOLLOW_and_or_in_selectWhereSQL484);
                            and_or();
                            state._fsp--;
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:94:33: (
                            // k_v )
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:94:34: k_v
                            {
                                pushFollow(FOLLOW_k_v_in_selectWhereSQL487);
                                k_v();
                                state._fsp--;
                            }
                        }
                            break;
                        case 2:
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:94:41: and_or
                        // WORD op '(' selectSQL ')'
                        {
                            pushFollow(FOLLOW_and_or_in_selectWhereSQL492);
                            and_or();
                            state._fsp--;
                            match(input, WORD, FOLLOW_WORD_in_selectWhereSQL494);
                            pushFollow(FOLLOW_op_in_selectWhereSQL496);
                            op();
                            state._fsp--;
                            match(input, LEFT_CLOSE,
                                    FOLLOW_LEFT_CLOSE_in_selectWhereSQL498);
                            pushFollow(FOLLOW_selectSQL_in_selectWhereSQL500);
                            selectSQL();
                            state._fsp--;
                            match(input, RIGHT_CLOSE,
                                    FOLLOW_RIGHT_CLOSE_in_selectWhereSQL502);
                        }
                            break;
                        default:
                            break loop9;
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
                pushFollow(FOLLOW_table_in_updateSQL523);
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
                    pushFollow(FOLLOW_k_v_in_updateSQL532);
                    k_v();
                    state._fsp--;
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:98:41: ( ',' k_v
                    // )*
                    loop10: do {
                        int alt10 = 2;
                        int LA10_0 = input.LA(1);
                        if ((LA10_0 == 48)) {
                            alt10 = 1;
                        }
                        switch (alt10) {
                            case 1:
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:98:42: ','
                            // k_v
                            {
                                match(input, 48, FOLLOW_48_in_updateSQL535);
                                pushFollow(FOLLOW_k_v_in_updateSQL537);
                                k_v();
                                state._fsp--;
                            }
                                break;
                            default:
                                break loop10;
                        }
                    }
                    while (true);
                }
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:98:53: ( whereSQL )?
                int alt11 = 2;
                int LA11_0 = input.LA(1);
                if (((LA11_0 >= WHERE && LA11_0 <= WHERE_))) {
                    alt11 = 1;
                }
                switch (alt11) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:98:53: whereSQL
                    {
                        pushFollow(FOLLOW_whereSQL_in_updateSQL542);
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
                pushFollow(FOLLOW_name_in_table554);
                name2 = name();
                state._fsp--;
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:102:7: ( ( AS | AS_ )?
                // alias )?
                int alt13 = 2;
                int LA13_0 = input.LA(1);
                if (((LA13_0 >= AS && LA13_0 <= AS_) || LA13_0 == WORD)) {
                    alt13 = 1;
                }
                switch (alt13) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:102:8: ( AS | AS_
                    // )? alias
                    {
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:102:8: ( AS |
                        // AS_ )?
                        int alt12 = 2;
                        int LA12_0 = input.LA(1);
                        if (((LA12_0 >= AS && LA12_0 <= AS_))) {
                            alt12 = 1;
                        }
                        switch (alt12) {
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
                        pushFollow(FOLLOW_alias_in_table564);
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
                    pushFollow(FOLLOW_table_in_tables579);
                    table();
                    state._fsp--;
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:114:9: ( ',' table
                    // )*
                    loop14: do {
                        int alt14 = 2;
                        int LA14_0 = input.LA(1);
                        if ((LA14_0 == 48)) {
                            alt14 = 1;
                        }
                        switch (alt14) {
                            case 1:
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:114:10:
                            // ',' table
                            {
                                match(input, 48, FOLLOW_48_in_tables582);
                                pushFollow(FOLLOW_table_in_tables584);
                                table();
                                state._fsp--;
                            }
                                break;
                            default:
                                break loop14;
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
    // $ANTLR start "k_v"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:117:1: k_v : WORD op PRE_SET ;
    public final void k_v() throws RecognitionException {
        Token WORD4 = null;
        AntlrV3SQLParser.op_return op5 = null;
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:117:5: ( WORD op PRE_SET )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:118:2: WORD op PRE_SET
            {
                WORD4 = (Token) match(input, WORD, FOLLOW_WORD_in_k_v598);
                pushFollow(FOLLOW_op_in_k_v600);
                op5 = op();
                state._fsp--;
                match(input, PRE_SET, FOLLOW_PRE_SET_in_k_v602);
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:128:1: column : name ( ( AS | AS_
    // )? alias )? ;
    public final void column() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:128:8: ( name ( ( AS | AS_
            // )? alias )? )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:129:2: name ( ( AS | AS_
            // )? alias )?
            {
                pushFollow(FOLLOW_name_in_column614);
                name();
                state._fsp--;
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:129:7: ( ( AS | AS_ )?
                // alias )?
                int alt16 = 2;
                int LA16_0 = input.LA(1);
                if (((LA16_0 >= AS && LA16_0 <= AS_) || LA16_0 == WORD)) {
                    alt16 = 1;
                }
                switch (alt16) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:129:8: ( AS | AS_
                    // )? alias
                    {
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:129:8: ( AS |
                        // AS_ )?
                        int alt15 = 2;
                        int LA15_0 = input.LA(1);
                        if (((LA15_0 >= AS && LA15_0 <= AS_))) {
                            alt15 = 1;
                        }
                        switch (alt15) {
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
                        pushFollow(FOLLOW_alias_in_column624);
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:131:1: sel_column : sel_name ( (
    // AS | AS_ )? sel_alias )? ;
    public final void sel_column() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:131:12: ( sel_name ( ( AS
            // | AS_ )? sel_alias )? )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:132:2: sel_name ( ( AS |
            // AS_ )? sel_alias )?
            {
                pushFollow(FOLLOW_sel_name_in_sel_column637);
                sel_name();
                state._fsp--;
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:132:11: ( ( AS | AS_
                // )? sel_alias )?
                int alt18 = 2;
                int LA18_0 = input.LA(1);
                if (((LA18_0 >= AS && LA18_0 <= AS_) || LA18_0 == WORD)) {
                    alt18 = 1;
                }
                switch (alt18) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:132:12: ( AS | AS_
                    // )? sel_alias
                    {
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:132:12: ( AS |
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
                        pushFollow(FOLLOW_sel_alias_in_sel_column647);
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:134:1: selectColums : ( sel_column
    // ( ',' sel_column )* ) ;
    public final void selectColums() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:135:2: ( ( sel_column (
            // ',' sel_column )* ) )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:136:2: ( sel_column ( ','
            // sel_column )* )
            {
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:136:2: ( sel_column (
                // ',' sel_column )* )
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:136:3: sel_column (
                // ',' sel_column )*
                {
                    pushFollow(FOLLOW_sel_column_in_selectColums660);
                    sel_column();
                    state._fsp--;
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:136:14: ( ','
                    // sel_column )*
                    loop19: do {
                        int alt19 = 2;
                        int LA19_0 = input.LA(1);
                        if ((LA19_0 == 48)) {
                            alt19 = 1;
                        }
                        switch (alt19) {
                            case 1:
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:136:15:
                            // ',' sel_column
                            {
                                match(input, 48, FOLLOW_48_in_selectColums663);
                                pushFollow(FOLLOW_sel_column_in_selectColums665);
                                sel_column();
                                state._fsp--;
                            }
                                break;
                            default:
                                break loop19;
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:138:1: whereSQL : ( WHERE | WHERE_
    // ) ( k_v ) ( and_or ( k_v ) )* ;
    public final void whereSQL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:138:9: ( ( WHERE | WHERE_
            // ) ( k_v ) ( and_or ( k_v ) )* )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:139:2: ( WHERE | WHERE_ )
            // ( k_v ) ( and_or ( k_v ) )*
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
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:139:17: ( k_v )
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:139:18: k_v
                {
                    pushFollow(FOLLOW_k_v_in_whereSQL686);
                    k_v();
                    state._fsp--;
                }
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:139:23: ( and_or ( k_v
                // ) )*
                loop20: do {
                    int alt20 = 2;
                    int LA20_0 = input.LA(1);
                    if (((LA20_0 >= AND && LA20_0 <= AND_) || (LA20_0 >= OR && LA20_0 <= OR_))) {
                        alt20 = 1;
                    }
                    switch (alt20) {
                        case 1:
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:139:24: and_or
                        // ( k_v )
                        {
                            pushFollow(FOLLOW_and_or_in_whereSQL690);
                            and_or();
                            state._fsp--;
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:139:31: (
                            // k_v )
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:139:32:
                            // k_v
                            {
                                pushFollow(FOLLOW_k_v_in_whereSQL693);
                                k_v();
                                state._fsp--;
                            }
                        }
                            break;
                        default:
                            break loop20;
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:141:1: and_or : ( AND | AND_ | OR
    // | OR_ ) ;
    public final void and_or() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:141:8: ( ( AND | AND_ | OR
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:144:1: op : ( '=' | '>' | '>=' |
    // '<' | '<=' | '!=' | '<>' | 'in' | 'IN' | 'exists' | 'EXISTS' ) ;
    public final AntlrV3SQLParser.op_return op() throws RecognitionException {
        AntlrV3SQLParser.op_return retval = new AntlrV3SQLParser.op_return();
        retval.start = input.LT(1);
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:145:2: ( ( '=' | '>' |
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:148:1: other : ( 'group' | 'GROUP'
    // | 'order' | 'ORDER' | 'having' | 'HAVING' | 'by' | 'BY' )+ WORD ( 'desc'
    // | 'DESC' | 'asc' | 'ASC' ) ;
    public final void other() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:148:7: ( ( 'group' |
            // 'GROUP' | 'order' | 'ORDER' | 'having' | 'HAVING' | 'by' | 'BY'
            // )+ WORD ( 'desc' | 'DESC' | 'asc' | 'ASC' ) )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:149:2: ( 'group' | 'GROUP'
            // | 'order' | 'ORDER' | 'having' | 'HAVING' | 'by' | 'BY' )+ WORD (
            // 'desc' | 'DESC' | 'asc' | 'ASC' )
            {
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:149:2: ( 'group' |
                // 'GROUP' | 'order' | 'ORDER' | 'having' | 'HAVING' | 'by' |
                // 'BY' )+
                int cnt21 = 0;
                loop21: do {
                    int alt21 = 2;
                    int LA21_0 = input.LA(1);
                    if ((LA21_0 == 56 || (LA21_0 >= 59 && LA21_0 <= 60)
                            || LA21_0 == 62 || LA21_0 == 64
                            || (LA21_0 >= 67 && LA21_0 <= 68) || LA21_0 == 70)) {
                        alt21 = 1;
                    }
                    switch (alt21) {
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
                            if (cnt21 >= 1)
                                break loop21;
                            EarlyExitException eee = new EarlyExitException(21,
                                    input);
                            throw eee;
                    }
                    cnt21++;
                }
                while (true);
                match(input, WORD, FOLLOW_WORD_in_other779);
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:151:1: sel_name : WORD (
    // LEFT_CLOSE WORD RIGHT_CLOSE )* ;
    public final void sel_name() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:151:9: ( WORD ( LEFT_CLOSE
            // WORD RIGHT_CLOSE )* )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:152:2: WORD ( LEFT_CLOSE
            // WORD RIGHT_CLOSE )*
            {
                match(input, WORD, FOLLOW_WORD_in_sel_name798);
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:152:7: ( LEFT_CLOSE
                // WORD RIGHT_CLOSE )*
                loop22: do {
                    int alt22 = 2;
                    int LA22_0 = input.LA(1);
                    if ((LA22_0 == LEFT_CLOSE)) {
                        alt22 = 1;
                    }
                    switch (alt22) {
                        case 1:
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:152:8:
                        // LEFT_CLOSE WORD RIGHT_CLOSE
                        {
                            match(input, LEFT_CLOSE,
                                    FOLLOW_LEFT_CLOSE_in_sel_name801);
                            match(input, WORD, FOLLOW_WORD_in_sel_name803);
                            match(input, RIGHT_CLOSE,
                                    FOLLOW_RIGHT_CLOSE_in_sel_name805);
                        }
                            break;
                        default:
                            break loop22;
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:154:1: sel_alias : WORD (
    // LEFT_CLOSE WORD RIGHT_CLOSE )* ;
    public final void sel_alias() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:154:10: ( WORD (
            // LEFT_CLOSE WORD RIGHT_CLOSE )* )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:155:2: WORD ( LEFT_CLOSE
            // WORD RIGHT_CLOSE )*
            {
                match(input, WORD, FOLLOW_WORD_in_sel_alias817);
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:155:7: ( LEFT_CLOSE
                // WORD RIGHT_CLOSE )*
                loop23: do {
                    int alt23 = 2;
                    int LA23_0 = input.LA(1);
                    if ((LA23_0 == LEFT_CLOSE)) {
                        alt23 = 1;
                    }
                    switch (alt23) {
                        case 1:
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:155:8:
                        // LEFT_CLOSE WORD RIGHT_CLOSE
                        {
                            match(input, LEFT_CLOSE,
                                    FOLLOW_LEFT_CLOSE_in_sel_alias820);
                            match(input, WORD, FOLLOW_WORD_in_sel_alias822);
                            match(input, RIGHT_CLOSE,
                                    FOLLOW_RIGHT_CLOSE_in_sel_alias824);
                        }
                            break;
                        default:
                            break loop23;
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:157:1: name : WORD ;
    public final AntlrV3SQLParser.name_return name()
            throws RecognitionException {
        AntlrV3SQLParser.name_return retval = new AntlrV3SQLParser.name_return();
        retval.start = input.LT(1);
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:157:6: ( WORD )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:158:2: WORD
            {
                match(input, WORD, FOLLOW_WORD_in_name836);
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:160:1: alias : WORD ;
    public final AntlrV3SQLParser.alias_return alias()
            throws RecognitionException {
        AntlrV3SQLParser.alias_return retval = new AntlrV3SQLParser.alias_return();
        retval.start = input.LT(1);
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:160:7: ( WORD )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:161:2: WORD
            {
                match(input, WORD, FOLLOW_WORD_in_alias846);
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

    public static final BitSet FOLLOW_and_or_in_selectWhereSQL484 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_k_v_in_selectWhereSQL487 = new BitSet(
            new long[] { 0x0000000060000032L });

    public static final BitSet FOLLOW_and_or_in_selectWhereSQL492 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_WORD_in_selectWhereSQL494 = new BitSet(
            new long[] { 0x247E800000000000L, 0x0000000000000024L });

    public static final BitSet FOLLOW_op_in_selectWhereSQL496 = new BitSet(
            new long[] { 0x0000000004000000L });

    public static final BitSet FOLLOW_LEFT_CLOSE_in_selectWhereSQL498 = new BitSet(
            new long[] { 0x0000001800000000L });

    public static final BitSet FOLLOW_selectSQL_in_selectWhereSQL500 = new BitSet(
            new long[] { 0x0000000400000000L });

    public static final BitSet FOLLOW_RIGHT_CLOSE_in_selectWhereSQL502 = new BitSet(
            new long[] { 0x0000000060000032L });

    public static final BitSet FOLLOW_set_in_updateSQL517 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_table_in_updateSQL523 = new BitSet(
            new long[] { 0x0000006000000000L });

    public static final BitSet FOLLOW_set_in_updateSQL525 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_k_v_in_updateSQL532 = new BitSet(
            new long[] { 0x0001180000000002L });

    public static final BitSet FOLLOW_48_in_updateSQL535 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_k_v_in_updateSQL537 = new BitSet(
            new long[] { 0x0001180000000002L });

    public static final BitSet FOLLOW_whereSQL_in_updateSQL542 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_name_in_table554 = new BitSet(
            new long[] { 0x00002000000000C2L });

    public static final BitSet FOLLOW_alias_in_table564 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_table_in_tables579 = new BitSet(
            new long[] { 0x0001000000000002L });

    public static final BitSet FOLLOW_48_in_tables582 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_table_in_tables584 = new BitSet(
            new long[] { 0x0001000000000002L });

    public static final BitSet FOLLOW_WORD_in_k_v598 = new BitSet(new long[] {
            0x247E800000000000L, 0x0000000000000024L });

    public static final BitSet FOLLOW_op_in_k_v600 = new BitSet(
            new long[] { 0x0000000080000000L });

    public static final BitSet FOLLOW_PRE_SET_in_k_v602 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_name_in_column614 = new BitSet(
            new long[] { 0x00002000000000C2L });

    public static final BitSet FOLLOW_alias_in_column624 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_sel_name_in_sel_column637 = new BitSet(
            new long[] { 0x00002000000000C2L });

    public static final BitSet FOLLOW_sel_alias_in_sel_column647 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_sel_column_in_selectColums660 = new BitSet(
            new long[] { 0x0001000000000002L });

    public static final BitSet FOLLOW_48_in_selectColums663 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_sel_column_in_selectColums665 = new BitSet(
            new long[] { 0x0001000000000002L });

    public static final BitSet FOLLOW_set_in_whereSQL679 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_k_v_in_whereSQL686 = new BitSet(
            new long[] { 0x0000000060000032L });

    public static final BitSet FOLLOW_and_or_in_whereSQL690 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_k_v_in_whereSQL693 = new BitSet(
            new long[] { 0x0000000060000032L });

    public static final BitSet FOLLOW_WORD_in_other779 = new BitSet(new long[] {
            0x8280000000000000L, 0x0000000000000002L });

    public static final BitSet FOLLOW_set_in_other781 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_WORD_in_sel_name798 = new BitSet(
            new long[] { 0x0000000004000002L });

    public static final BitSet FOLLOW_LEFT_CLOSE_in_sel_name801 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_WORD_in_sel_name803 = new BitSet(
            new long[] { 0x0000000400000000L });

    public static final BitSet FOLLOW_RIGHT_CLOSE_in_sel_name805 = new BitSet(
            new long[] { 0x0000000004000002L });

    public static final BitSet FOLLOW_WORD_in_sel_alias817 = new BitSet(
            new long[] { 0x0000000004000002L });

    public static final BitSet FOLLOW_LEFT_CLOSE_in_sel_alias820 = new BitSet(
            new long[] { 0x0000200000000000L });

    public static final BitSet FOLLOW_WORD_in_sel_alias822 = new BitSet(
            new long[] { 0x0000000400000000L });

    public static final BitSet FOLLOW_RIGHT_CLOSE_in_sel_alias824 = new BitSet(
            new long[] { 0x0000000004000002L });

    public static final BitSet FOLLOW_WORD_in_name836 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_WORD_in_alias846 = new BitSet(
            new long[] { 0x0000000000000002L });
}