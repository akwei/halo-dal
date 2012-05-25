package halo.dal.analysis.antlr.v3;

// $ANTLR 3.4 /Users/akwei/antlrpro/sql/AntlrV3SQL.g 2012-05-23 12:03:34
import halo.dal.analysis.antlr.AntlrParserDelegate;

import org.antlr.runtime.BitSet;
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

    @Override
    public void reportError(RecognitionException e) {
    }

    public static final String[] tokenNames = new String[] { "<invalid>",
            "<EOR>", "<DOWN>", "<UP>", "AND", "AND_", "AS", "AS_", "CROSS",
            "CROSS_", "DELETE", "DELETE_", "FROM", "FROM_", "FULL", "FULL_",
            "IN", "INNER", "INNER_", "INSERT", "INSERT_", "INTO", "INTO_",
            "IN_", "JOIN", "JOIN_", "LEFT", "LEFT_", "LEFT_CLOSE", "NOT",
            "NOT_", "ON", "ON_", "OR", "OR_", "PRE_SET", "RIGHT", "RIGHT_",
            "RIGHT_CLOSE", "SELECT", "SELECT_", "SET", "SET_", "UPDATE",
            "UPDATE_", "VALUES", "VALUES_", "WHERE", "WHERE_", "WORD", "WS",
            "'!='", "'*'", "','", "'<'", "'<='", "'<>'", "'='", "'>'", "'>='",
            "'GROUP'", "'HAVING'", "'ORDER'", "'group'", "'having'", "'order'" };

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

    // $ANTLR start "proc"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:68:1: proc : ( insertSQL |
    // selectSQL | deleteSQL | updateSQL );
    public final void proc() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:68:6: ( insertSQL |
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
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:69:2: insertSQL
                {
                    pushFollow(FOLLOW_insertSQL_in_proc301);
                    insertSQL();
                    state._fsp--;
                }
                    break;
                case 2:
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:69:12: selectSQL
                {
                    pushFollow(FOLLOW_selectSQL_in_proc303);
                    selectSQL();
                    state._fsp--;
                }
                    break;
                case 3:
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:69:22: deleteSQL
                {
                    pushFollow(FOLLOW_deleteSQL_in_proc305);
                    deleteSQL();
                    state._fsp--;
                }
                    break;
                case 4:
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:69:32: updateSQL
                {
                    pushFollow(FOLLOW_updateSQL_in_proc307);
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:71:1: insertSQL : ( INSERT |
    // INSERT_ ) ( INTO | INTO_ ) table LEFT_CLOSE insertColumn ( ','
    // insertColumn )* RIGHT_CLOSE ( VALUES | VALUES_ ) LEFT_CLOSE ( PRE_SET | (
    // ',' PRE_SET ) )* RIGHT_CLOSE ;
    public final void insertSQL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:72:2: ( ( INSERT | INSERT_
            // ) ( INTO | INTO_ ) table LEFT_CLOSE insertColumn ( ','
            // insertColumn )* RIGHT_CLOSE ( VALUES | VALUES_ ) LEFT_CLOSE (
            // PRE_SET | ( ',' PRE_SET ) )* RIGHT_CLOSE )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:73:2: ( INSERT | INSERT_ )
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
                pushFollow(FOLLOW_table_in_insertSQL329);
                table();
                state._fsp--;
                match(input, LEFT_CLOSE, FOLLOW_LEFT_CLOSE_in_insertSQL331);
                pushFollow(FOLLOW_insertColumn_in_insertSQL333);
                insertColumn();
                state._fsp--;
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:73:62: ( ','
                // insertColumn )*
                loop2: do {
                    int alt2 = 2;
                    int LA2_0 = input.LA(1);
                    if ((LA2_0 == 53)) {
                        alt2 = 1;
                    }
                    switch (alt2) {
                        case 1:
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:73:63: ','
                        // insertColumn
                        {
                            match(input, 53, FOLLOW_53_in_insertSQL336);
                            pushFollow(FOLLOW_insertColumn_in_insertSQL338);
                            insertColumn();
                            state._fsp--;
                        }
                            break;
                        default:
                            break loop2;
                    }
                }
                while (true);
                match(input, RIGHT_CLOSE, FOLLOW_RIGHT_CLOSE_in_insertSQL342);
                if ((input.LA(1) >= VALUES && input.LA(1) <= VALUES_)) {
                    input.consume();
                    state.errorRecovery = false;
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    throw mse;
                }
                match(input, LEFT_CLOSE, FOLLOW_LEFT_CLOSE_in_insertSQL350);
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:73:122: ( PRE_SET | (
                // ',' PRE_SET ) )*
                loop3: do {
                    int alt3 = 3;
                    int LA3_0 = input.LA(1);
                    if ((LA3_0 == PRE_SET)) {
                        alt3 = 1;
                    }
                    else if ((LA3_0 == 53)) {
                        alt3 = 2;
                    }
                    switch (alt3) {
                        case 1:
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:73:123:
                        // PRE_SET
                        {
                            match(input, PRE_SET,
                                    FOLLOW_PRE_SET_in_insertSQL353);
                        }
                            break;
                        case 2:
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:73:131: ( ','
                        // PRE_SET )
                        {
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:73:131: (
                            // ',' PRE_SET )
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:73:132:
                            // ',' PRE_SET
                            {
                                match(input, 53, FOLLOW_53_in_insertSQL356);
                                match(input, PRE_SET,
                                        FOLLOW_PRE_SET_in_insertSQL358);
                            }
                        }
                            break;
                        default:
                            break loop3;
                    }
                }
                while (true);
                match(input, RIGHT_CLOSE, FOLLOW_RIGHT_CLOSE_in_insertSQL363);
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:75:1: insertColumn : WORD ;
    public final void insertColumn() throws RecognitionException {
        Token WORD1 = null;
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:76:2: ( WORD )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:77:2: WORD
            {
                WORD1 = (Token) match(input, WORD,
                        FOLLOW_WORD_in_insertColumn376);
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:85:1: deleteSQL : ( DELETE |
    // DELETE_ ) ( FROM | FROM_ ) table whereSQL ;
    public final void deleteSQL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:86:2: ( ( DELETE | DELETE_
            // ) ( FROM | FROM_ ) table whereSQL )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:87:2: ( DELETE | DELETE_ )
            // ( FROM | FROM_ ) table whereSQL
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
                pushFollow(FOLLOW_table_in_deleteSQL402);
                table();
                state._fsp--;
                pushFollow(FOLLOW_whereSQL_in_deleteSQL404);
                whereSQL();
                state._fsp--;
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:89:1: selectSQL : ( SELECT |
    // SELECT_ ) selectColums ( FROM | FROM_ ) tables ( ( FULL | FULL_ | CROSS |
    // CROSS_ | INNER | INNER_ | LEFT | LEFT_ | RIGHT | RIGHT_ ) ( JOIN | JOIN_
    // ) table ( ON | ON_ ) WORD '=' WORD )? whereSQL ;
    public final void selectSQL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:90:2: ( ( SELECT | SELECT_
            // ) selectColums ( FROM | FROM_ ) tables ( ( FULL | FULL_ | CROSS |
            // CROSS_ | INNER | INNER_ | LEFT | LEFT_ | RIGHT | RIGHT_ ) ( JOIN
            // | JOIN_ ) table ( ON | ON_ ) WORD '=' WORD )? whereSQL )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:91:2: ( SELECT | SELECT_ )
            // selectColums ( FROM | FROM_ ) tables ( ( FULL | FULL_ | CROSS |
            // CROSS_ | INNER | INNER_ | LEFT | LEFT_ | RIGHT | RIGHT_ ) ( JOIN
            // | JOIN_ ) table ( ON | ON_ ) WORD '=' WORD )? whereSQL
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
                pushFollow(FOLLOW_selectColums_in_selectSQL422);
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
                pushFollow(FOLLOW_tables_in_selectSQL430);
                tables();
                state._fsp--;
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:91:52: ( ( FULL |
                // FULL_ | CROSS | CROSS_ | INNER | INNER_ | LEFT | LEFT_ |
                // RIGHT | RIGHT_ ) ( JOIN | JOIN_ ) table ( ON | ON_ ) WORD '='
                // WORD )?
                int alt4 = 2;
                int LA4_0 = input.LA(1);
                if (((LA4_0 >= CROSS && LA4_0 <= CROSS_)
                        || (LA4_0 >= FULL && LA4_0 <= FULL_)
                        || (LA4_0 >= INNER && LA4_0 <= INNER_)
                        || (LA4_0 >= LEFT && LA4_0 <= LEFT_) || (LA4_0 >= RIGHT && LA4_0 <= RIGHT_))) {
                    alt4 = 1;
                }
                switch (alt4) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:91:53: ( FULL |
                    // FULL_ | CROSS | CROSS_ | INNER | INNER_ | LEFT | LEFT_ |
                    // RIGHT | RIGHT_ ) ( JOIN | JOIN_ ) table ( ON | ON_ ) WORD
                    // '=' WORD
                    {
                        if ((input.LA(1) >= CROSS && input.LA(1) <= CROSS_)
                                || (input.LA(1) >= FULL && input.LA(1) <= FULL_)
                                || (input.LA(1) >= INNER && input.LA(1) <= INNER_)
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
                        pushFollow(FOLLOW_table_in_selectSQL461);
                        table();
                        state._fsp--;
                        if ((input.LA(1) >= ON && input.LA(1) <= ON_)) {
                            input.consume();
                            state.errorRecovery = false;
                        }
                        else {
                            MismatchedSetException mse = new MismatchedSetException(
                                    null, input);
                            throw mse;
                        }
                        match(input, WORD, FOLLOW_WORD_in_selectSQL469);
                        match(input, 57, FOLLOW_57_in_selectSQL471);
                        match(input, WORD, FOLLOW_WORD_in_selectSQL473);
                    }
                        break;
                }
                pushFollow(FOLLOW_whereSQL_in_selectSQL478);
                whereSQL();
                state._fsp--;
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
    // $ANTLR start "updateSQL"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:93:1: updateSQL : ( UPDATE |
    // UPDATE_ ) table ( SET | SET_ ) ( k_v ( ',' k_v )* ) whereSQL ;
    public final void updateSQL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:94:2: ( ( UPDATE | UPDATE_
            // ) table ( SET | SET_ ) ( k_v ( ',' k_v )* ) whereSQL )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:95:2: ( UPDATE | UPDATE_ )
            // table ( SET | SET_ ) ( k_v ( ',' k_v )* ) whereSQL
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
                pushFollow(FOLLOW_table_in_updateSQL495);
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
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:95:36: ( k_v ( ',' k_v
                // )* )
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:95:37: k_v ( ',' k_v
                // )*
                {
                    pushFollow(FOLLOW_k_v_in_updateSQL504);
                    k_v();
                    state._fsp--;
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:95:41: ( ',' k_v
                    // )*
                    loop5: do {
                        int alt5 = 2;
                        int LA5_0 = input.LA(1);
                        if ((LA5_0 == 53)) {
                            alt5 = 1;
                        }
                        switch (alt5) {
                            case 1:
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:95:42: ','
                            // k_v
                            {
                                match(input, 53, FOLLOW_53_in_updateSQL507);
                                pushFollow(FOLLOW_k_v_in_updateSQL509);
                                k_v();
                                state._fsp--;
                            }
                                break;
                            default:
                                break loop5;
                        }
                    }
                    while (true);
                }
                pushFollow(FOLLOW_whereSQL_in_updateSQL514);
                whereSQL();
                state._fsp--;
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:98:1: table : name ( ( AS | AS_ )?
    // alias )? ;
    public final void table() throws RecognitionException {
        AntlrV3SQLParser.name_return name2 = null;
        AntlrV3SQLParser.alias_return alias3 = null;
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:98:7: ( name ( ( AS | AS_
            // )? alias )? )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:99:2: name ( ( AS | AS_ )?
            // alias )?
            {
                pushFollow(FOLLOW_name_in_table525);
                name2 = name();
                state._fsp--;
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:99:7: ( ( AS | AS_ )?
                // alias )?
                int alt7 = 2;
                int LA7_0 = input.LA(1);
                if (((LA7_0 >= AS && LA7_0 <= AS_) || LA7_0 == WORD)) {
                    alt7 = 1;
                }
                switch (alt7) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:99:8: ( AS | AS_
                    // )? alias
                    {
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:99:8: ( AS |
                        // AS_ )?
                        int alt6 = 2;
                        int LA6_0 = input.LA(1);
                        if (((LA6_0 >= AS && LA6_0 <= AS_))) {
                            alt6 = 1;
                        }
                        switch (alt6) {
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
                        pushFollow(FOLLOW_alias_in_table535);
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:110:1: tables : ( table ( ','
    // table )* ) ;
    public final void tables() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:110:8: ( ( table ( ','
            // table )* ) )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:111:2: ( table ( ',' table
            // )* )
            {
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:111:2: ( table ( ','
                // table )* )
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:111:3: table ( ','
                // table )*
                {
                    pushFollow(FOLLOW_table_in_tables550);
                    table();
                    state._fsp--;
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:111:9: ( ',' table
                    // )*
                    loop8: do {
                        int alt8 = 2;
                        int LA8_0 = input.LA(1);
                        if ((LA8_0 == 53)) {
                            alt8 = 1;
                        }
                        switch (alt8) {
                            case 1:
                            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:111:10:
                            // ',' table
                            {
                                match(input, 53, FOLLOW_53_in_tables553);
                                pushFollow(FOLLOW_table_in_tables555);
                                table();
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:113:1: k_v : WORD op PRE_SET ;
    public final void k_v() throws RecognitionException {
        Token WORD4 = null;
        AntlrV3SQLParser.op_return op5 = null;
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:113:5: ( WORD op PRE_SET )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:114:2: WORD op PRE_SET
            {
                WORD4 = (Token) match(input, WORD, FOLLOW_WORD_in_k_v568);
                pushFollow(FOLLOW_op_in_k_v570);
                op5 = op();
                state._fsp--;
                match(input, PRE_SET, FOLLOW_PRE_SET_in_k_v572);
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:124:1: column : name ( ( AS | AS_
    // )? alias )? ;
    public final void column() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:124:8: ( name ( ( AS | AS_
            // )? alias )? )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:125:2: name ( ( AS | AS_
            // )? alias )?
            {
                pushFollow(FOLLOW_name_in_column584);
                name();
                state._fsp--;
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:125:7: ( ( AS | AS_ )?
                // alias )?
                int alt10 = 2;
                int LA10_0 = input.LA(1);
                if (((LA10_0 >= AS && LA10_0 <= AS_) || LA10_0 == WORD)) {
                    alt10 = 1;
                }
                switch (alt10) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:125:8: ( AS | AS_
                    // )? alias
                    {
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:125:8: ( AS |
                        // AS_ )?
                        int alt9 = 2;
                        int LA9_0 = input.LA(1);
                        if (((LA9_0 >= AS && LA9_0 <= AS_))) {
                            alt9 = 1;
                        }
                        switch (alt9) {
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
                        pushFollow(FOLLOW_alias_in_column594);
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
    // $ANTLR start "selectColums"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:127:1: selectColums : ( '*' |
    // column ( ',' column )* ) ;
    public final void selectColums() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:128:2: ( ( '*' | column (
            // ',' column )* ) )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:129:2: ( '*' | column (
            // ',' column )* )
            {
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:129:2: ( '*' | column
                // ( ',' column )* )
                int alt12 = 2;
                int LA12_0 = input.LA(1);
                if ((LA12_0 == 52)) {
                    alt12 = 1;
                }
                else if ((LA12_0 == WORD)) {
                    alt12 = 2;
                }
                else {
                    NoViableAltException nvae = new NoViableAltException("",
                            12, 0, input);
                    throw nvae;
                }
                switch (alt12) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:129:3: '*'
                    {
                        match(input, 52, FOLLOW_52_in_selectColums607);
                    }
                        break;
                    case 2:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:129:7: column (
                    // ',' column )*
                    {
                        pushFollow(FOLLOW_column_in_selectColums609);
                        column();
                        state._fsp--;
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:129:14: ( ','
                        // column )*
                        loop11: do {
                            int alt11 = 2;
                            int LA11_0 = input.LA(1);
                            if ((LA11_0 == 53)) {
                                alt11 = 1;
                            }
                            switch (alt11) {
                                case 1:
                                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:129:15:
                                // ',' column
                                {
                                    match(input, 53,
                                            FOLLOW_53_in_selectColums612);
                                    pushFollow(FOLLOW_column_in_selectColums614);
                                    column();
                                    state._fsp--;
                                }
                                    break;
                                default:
                                    break loop11;
                            }
                        }
                        while (true);
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

    // $ANTLR end "selectColums"
    // $ANTLR start "whereSQL"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:131:1: whereSQL : ( ( WHERE |
    // WHERE_ ) ( k_v ) ( and_or k_v )* )? other ;
    public final void whereSQL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:131:9: ( ( ( WHERE |
            // WHERE_ ) ( k_v ) ( and_or k_v )* )? other )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:132:2: ( ( WHERE | WHERE_
            // ) ( k_v ) ( and_or k_v )* )? other
            {
                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:132:2: ( ( WHERE |
                // WHERE_ ) ( k_v ) ( and_or k_v )* )?
                int alt14 = 2;
                int LA14_0 = input.LA(1);
                if (((LA14_0 >= WHERE && LA14_0 <= WHERE_))) {
                    alt14 = 1;
                }
                switch (alt14) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:132:3: ( WHERE |
                    // WHERE_ ) ( k_v ) ( and_or k_v )*
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
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:132:18: ( k_v
                        // )
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:132:19: k_v
                        {
                            pushFollow(FOLLOW_k_v_in_whereSQL636);
                            k_v();
                            state._fsp--;
                        }
                        // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:132:24: (
                        // and_or k_v )*
                        loop13: do {
                            int alt13 = 2;
                            int LA13_0 = input.LA(1);
                            if (((LA13_0 >= AND && LA13_0 <= AND_) || (LA13_0 >= OR && LA13_0 <= OR_))) {
                                alt13 = 1;
                            }
                            switch (alt13) {
                                case 1:
                                // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:132:25:
                                // and_or k_v
                                {
                                    pushFollow(FOLLOW_and_or_in_whereSQL640);
                                    and_or();
                                    state._fsp--;
                                    pushFollow(FOLLOW_k_v_in_whereSQL642);
                                    k_v();
                                    state._fsp--;
                                }
                                    break;
                                default:
                                    break loop13;
                            }
                        }
                        while (true);
                    }
                        break;
                }
                pushFollow(FOLLOW_other_in_whereSQL648);
                other();
                state._fsp--;
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:134:1: and_or : ( AND | AND_ | OR
    // | OR_ ) ;
    public final void and_or() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:134:8: ( ( AND | AND_ | OR
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:137:1: op : ( '=' | '>' | '>=' |
    // '<' | '<=' | '!=' | '<>' ) ;
    public final AntlrV3SQLParser.op_return op() throws RecognitionException {
        AntlrV3SQLParser.op_return retval = new AntlrV3SQLParser.op_return();
        retval.start = input.LT(1);
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:138:2: ( ( '=' | '>' |
            // '>=' | '<' | '<=' | '!=' | '<>' ) )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:
            {
                if (input.LA(1) == 51
                        || (input.LA(1) >= 54 && input.LA(1) <= 59)) {
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:141:1: other : ( 'group' | 'GROUP'
    // | 'order' | 'ORDER' | 'having' | 'HAVING' );
    public final void other() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:141:7: ( 'group' | 'GROUP'
            // | 'order' | 'ORDER' | 'having' | 'HAVING' )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:
            {
                if ((input.LA(1) >= 60 && input.LA(1) <= 65)) {
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
    public static class name_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "name"
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:144:1: name : WORD ;
    public final AntlrV3SQLParser.name_return name()
            throws RecognitionException {
        AntlrV3SQLParser.name_return retval = new AntlrV3SQLParser.name_return();
        retval.start = input.LT(1);
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:144:6: ( WORD )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:145:2: WORD
            {
                match(input, WORD, FOLLOW_WORD_in_name724);
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
    // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:147:1: alias : WORD ;
    public final AntlrV3SQLParser.alias_return alias()
            throws RecognitionException {
        AntlrV3SQLParser.alias_return retval = new AntlrV3SQLParser.alias_return();
        retval.start = input.LT(1);
        try {
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:147:7: ( WORD )
            // /Users/akwei/antlrpro/sql/AntlrV3SQL.g:148:2: WORD
            {
                match(input, WORD, FOLLOW_WORD_in_alias734);
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
    public static final BitSet FOLLOW_insertSQL_in_proc301 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_selectSQL_in_proc303 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_deleteSQL_in_proc305 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_updateSQL_in_proc307 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_set_in_insertSQL317 = new BitSet(
            new long[] { 0x0000000000600000L });

    public static final BitSet FOLLOW_set_in_insertSQL323 = new BitSet(
            new long[] { 0x0002000000000000L });

    public static final BitSet FOLLOW_table_in_insertSQL329 = new BitSet(
            new long[] { 0x0000000010000000L });

    public static final BitSet FOLLOW_LEFT_CLOSE_in_insertSQL331 = new BitSet(
            new long[] { 0x0002000000000000L });

    public static final BitSet FOLLOW_insertColumn_in_insertSQL333 = new BitSet(
            new long[] { 0x0020004000000000L });

    public static final BitSet FOLLOW_53_in_insertSQL336 = new BitSet(
            new long[] { 0x0002000000000000L });

    public static final BitSet FOLLOW_insertColumn_in_insertSQL338 = new BitSet(
            new long[] { 0x0020004000000000L });

    public static final BitSet FOLLOW_RIGHT_CLOSE_in_insertSQL342 = new BitSet(
            new long[] { 0x0000600000000000L });

    public static final BitSet FOLLOW_set_in_insertSQL344 = new BitSet(
            new long[] { 0x0000000010000000L });

    public static final BitSet FOLLOW_LEFT_CLOSE_in_insertSQL350 = new BitSet(
            new long[] { 0x0020004800000000L });

    public static final BitSet FOLLOW_PRE_SET_in_insertSQL353 = new BitSet(
            new long[] { 0x0020004800000000L });

    public static final BitSet FOLLOW_53_in_insertSQL356 = new BitSet(
            new long[] { 0x0000000800000000L });

    public static final BitSet FOLLOW_PRE_SET_in_insertSQL358 = new BitSet(
            new long[] { 0x0020004800000000L });

    public static final BitSet FOLLOW_RIGHT_CLOSE_in_insertSQL363 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_WORD_in_insertColumn376 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_set_in_deleteSQL390 = new BitSet(
            new long[] { 0x0000000000003000L });

    public static final BitSet FOLLOW_set_in_deleteSQL396 = new BitSet(
            new long[] { 0x0002000000000000L });

    public static final BitSet FOLLOW_table_in_deleteSQL402 = new BitSet(
            new long[] { 0xF001800000000000L, 0x0000000000000003L });

    public static final BitSet FOLLOW_whereSQL_in_deleteSQL404 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_set_in_selectSQL416 = new BitSet(
            new long[] { 0x0012000000000000L });

    public static final BitSet FOLLOW_selectColums_in_selectSQL422 = new BitSet(
            new long[] { 0x0000000000003000L });

    public static final BitSet FOLLOW_set_in_selectSQL424 = new BitSet(
            new long[] { 0x0002000000000000L });

    public static final BitSet FOLLOW_tables_in_selectSQL430 = new BitSet(
            new long[] { 0xF00180300C06C300L, 0x0000000000000003L });

    public static final BitSet FOLLOW_set_in_selectSQL433 = new BitSet(
            new long[] { 0x0000000003000000L });

    public static final BitSet FOLLOW_set_in_selectSQL455 = new BitSet(
            new long[] { 0x0002000000000000L });

    public static final BitSet FOLLOW_table_in_selectSQL461 = new BitSet(
            new long[] { 0x0000000180000000L });

    public static final BitSet FOLLOW_set_in_selectSQL463 = new BitSet(
            new long[] { 0x0002000000000000L });

    public static final BitSet FOLLOW_WORD_in_selectSQL469 = new BitSet(
            new long[] { 0x0200000000000000L });

    public static final BitSet FOLLOW_57_in_selectSQL471 = new BitSet(
            new long[] { 0x0002000000000000L });

    public static final BitSet FOLLOW_WORD_in_selectSQL473 = new BitSet(
            new long[] { 0xF001800000000000L, 0x0000000000000003L });

    public static final BitSet FOLLOW_whereSQL_in_selectSQL478 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_set_in_updateSQL489 = new BitSet(
            new long[] { 0x0002000000000000L });

    public static final BitSet FOLLOW_table_in_updateSQL495 = new BitSet(
            new long[] { 0x0000060000000000L });

    public static final BitSet FOLLOW_set_in_updateSQL497 = new BitSet(
            new long[] { 0x0002000000000000L });

    public static final BitSet FOLLOW_k_v_in_updateSQL504 = new BitSet(
            new long[] { 0xF021800000000000L, 0x0000000000000003L });

    public static final BitSet FOLLOW_53_in_updateSQL507 = new BitSet(
            new long[] { 0x0002000000000000L });

    public static final BitSet FOLLOW_k_v_in_updateSQL509 = new BitSet(
            new long[] { 0xF021800000000000L, 0x0000000000000003L });

    public static final BitSet FOLLOW_whereSQL_in_updateSQL514 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_name_in_table525 = new BitSet(
            new long[] { 0x00020000000000C2L });

    public static final BitSet FOLLOW_alias_in_table535 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_table_in_tables550 = new BitSet(
            new long[] { 0x0020000000000002L });

    public static final BitSet FOLLOW_53_in_tables553 = new BitSet(
            new long[] { 0x0002000000000000L });

    public static final BitSet FOLLOW_table_in_tables555 = new BitSet(
            new long[] { 0x0020000000000002L });

    public static final BitSet FOLLOW_WORD_in_k_v568 = new BitSet(
            new long[] { 0x0FC8000000000000L });

    public static final BitSet FOLLOW_op_in_k_v570 = new BitSet(
            new long[] { 0x0000000800000000L });

    public static final BitSet FOLLOW_PRE_SET_in_k_v572 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_name_in_column584 = new BitSet(
            new long[] { 0x00020000000000C2L });

    public static final BitSet FOLLOW_alias_in_column594 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_52_in_selectColums607 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_column_in_selectColums609 = new BitSet(
            new long[] { 0x0020000000000002L });

    public static final BitSet FOLLOW_53_in_selectColums612 = new BitSet(
            new long[] { 0x0002000000000000L });

    public static final BitSet FOLLOW_column_in_selectColums614 = new BitSet(
            new long[] { 0x0020000000000002L });

    public static final BitSet FOLLOW_set_in_whereSQL629 = new BitSet(
            new long[] { 0x0002000000000000L });

    public static final BitSet FOLLOW_k_v_in_whereSQL636 = new BitSet(
            new long[] { 0xF000000600000030L, 0x0000000000000003L });

    public static final BitSet FOLLOW_and_or_in_whereSQL640 = new BitSet(
            new long[] { 0x0002000000000000L });

    public static final BitSet FOLLOW_k_v_in_whereSQL642 = new BitSet(
            new long[] { 0xF000000600000030L, 0x0000000000000003L });

    public static final BitSet FOLLOW_other_in_whereSQL648 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_WORD_in_name724 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_WORD_in_alias734 = new BitSet(
            new long[] { 0x0000000000000002L });
}