package halo.dal.analysis.antlr.v3;

// $ANTLR 3.4 /Users/akwei/antlrpro/sql/SQL.g 2012-05-16 21:09:03
import halo.dal.analysis.antlr.AntlrParserDelegate;

import java.util.ArrayList;
import java.util.List;

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
public class Antlrv34SQLParser extends Parser {

    public static final String[] tokenNames = new String[] { "<invalid>",
            "<EOR>", "<DOWN>", "<UP>", "AND", "AS", "CROSS", "DELETE", "FROM",
            "FULL", "IN", "INNER", "INSERT", "INTO", "JOIN", "LEFT",
            "LEFT_CLOSE", "NOT", "ON", "OR", "PRE_SET", "RIGHT", "RIGHT_CLOSE",
            "SELECT", "SET", "UPDATE", "VALUES", "WHERE", "WORD", "WS", "'!='",
            "'*'", "','", "'<'", "'<='", "'<>'", "'='", "'>'", "'>='" };

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

    private AntlrParserDelegate antlrParserDelegate;

    public void setAntlrParserDelegate(AntlrParserDelegate antlrParserDelegate) {
        this.antlrParserDelegate = antlrParserDelegate;
    }

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators
    public Antlrv34SQLParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }

    public Antlrv34SQLParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    @Override
    public void displayRecognitionError(String[] tokenNames,
            RecognitionException e) {
        // super.displayRecognitionError(tokenNames, e);
        // display nothing
    }

    public String[] getTokenNames() {
        return Antlrv34SQLParser.tokenNames;
    }

    public String getGrammarFileName() {
        return "/Users/akwei/antlrpro/sql/SQL.g";
    }

    // $ANTLR start "proc"
    // /Users/akwei/antlrpro/sql/SQL.g:40:1: proc : ( insertSQL | selectSQL |
    // deleteSQL | updateSQL );
    public final void proc() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/SQL.g:40:6: ( insertSQL | selectSQL |
            // deleteSQL | updateSQL )
            int alt1 = 4;
            switch (input.LA(1)) {
                case INSERT: {
                    alt1 = 1;
                }
                    break;
                case SELECT: {
                    alt1 = 2;
                }
                    break;
                case DELETE: {
                    alt1 = 3;
                }
                    break;
                case UPDATE: {
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
                // /Users/akwei/antlrpro/sql/SQL.g:41:2: insertSQL
                {
                    pushFollow(FOLLOW_insertSQL_in_proc173);
                    insertSQL();
                    state._fsp--;
                }
                    break;
                case 2:
                // /Users/akwei/antlrpro/sql/SQL.g:41:12: selectSQL
                {
                    pushFollow(FOLLOW_selectSQL_in_proc175);
                    selectSQL();
                    state._fsp--;
                }
                    break;
                case 3:
                // /Users/akwei/antlrpro/sql/SQL.g:41:22: deleteSQL
                {
                    pushFollow(FOLLOW_deleteSQL_in_proc177);
                    deleteSQL();
                    state._fsp--;
                }
                    break;
                case 4:
                // /Users/akwei/antlrpro/sql/SQL.g:41:32: updateSQL
                {
                    pushFollow(FOLLOW_updateSQL_in_proc179);
                    updateSQL();
                    state._fsp--;
                }
                    break;
            }
        }
        catch (RecognitionException re) {
            // reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "proc"
    // $ANTLR start "insertSQL"
    // /Users/akwei/antlrpro/sql/SQL.g:43:1: insertSQL : INSERT INTO table
    // LEFT_CLOSE multColums RIGHT_CLOSE insertValues ;
    public final void insertSQL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/SQL.g:44:2: ( INSERT INTO table
            // LEFT_CLOSE multColums RIGHT_CLOSE insertValues )
            // /Users/akwei/antlrpro/sql/SQL.g:45:2: INSERT INTO table
            // LEFT_CLOSE multColums RIGHT_CLOSE insertValues
            {
                match(input, INSERT, FOLLOW_INSERT_in_insertSQL189);
                match(input, INTO, FOLLOW_INTO_in_insertSQL191);
                pushFollow(FOLLOW_table_in_insertSQL193);
                table();
                state._fsp--;
                match(input, LEFT_CLOSE, FOLLOW_LEFT_CLOSE_in_insertSQL195);
                pushFollow(FOLLOW_multColums_in_insertSQL197);
                multColums();
                state._fsp--;
                match(input, RIGHT_CLOSE, FOLLOW_RIGHT_CLOSE_in_insertSQL199);
                pushFollow(FOLLOW_insertValues_in_insertSQL201);
                insertValues();
                state._fsp--;
            }
        }
        catch (RecognitionException re) {
            // reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "insertSQL"
    // $ANTLR start "insertValues"
    // /Users/akwei/antlrpro/sql/SQL.g:47:1: insertValues : VALUES LEFT_CLOSE (
    // PRE_SET | ( ',' PRE_SET ) )* RIGHT_CLOSE ;
    public final void insertValues() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/SQL.g:48:2: ( VALUES LEFT_CLOSE (
            // PRE_SET | ( ',' PRE_SET ) )* RIGHT_CLOSE )
            // /Users/akwei/antlrpro/sql/SQL.g:49:2: VALUES LEFT_CLOSE ( PRE_SET
            // | ( ',' PRE_SET ) )* RIGHT_CLOSE
            {
                match(input, VALUES, FOLLOW_VALUES_in_insertValues213);
                match(input, LEFT_CLOSE, FOLLOW_LEFT_CLOSE_in_insertValues215);
                // /Users/akwei/antlrpro/sql/SQL.g:49:20: ( PRE_SET | ( ','
                // PRE_SET ) )*
                loop2: do {
                    int alt2 = 3;
                    int LA2_0 = input.LA(1);
                    if ((LA2_0 == PRE_SET)) {
                        alt2 = 1;
                    }
                    else if ((LA2_0 == 32)) {
                        alt2 = 2;
                    }
                    switch (alt2) {
                        case 1:
                        // /Users/akwei/antlrpro/sql/SQL.g:49:21: PRE_SET
                        {
                            match(input, PRE_SET,
                                    FOLLOW_PRE_SET_in_insertValues218);
                        }
                            break;
                        case 2:
                        // /Users/akwei/antlrpro/sql/SQL.g:49:29: ( ',' PRE_SET
                        // )
                        {
                            // /Users/akwei/antlrpro/sql/SQL.g:49:29: ( ','
                            // PRE_SET )
                            // /Users/akwei/antlrpro/sql/SQL.g:49:30: ','
                            // PRE_SET
                            {
                                match(input, 32, FOLLOW_32_in_insertValues221);
                                match(input, PRE_SET,
                                        FOLLOW_PRE_SET_in_insertValues223);
                            }
                        }
                            break;
                        default:
                            break loop2;
                    }
                }
                while (true);
                match(input, RIGHT_CLOSE, FOLLOW_RIGHT_CLOSE_in_insertValues228);
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

    // $ANTLR end "insertValues"
    // $ANTLR start "deleteSQL"
    // /Users/akwei/antlrpro/sql/SQL.g:51:1: deleteSQL : DELETE FROM table
    // whereSQL ;
    public final void deleteSQL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/SQL.g:52:2: ( DELETE FROM table
            // whereSQL )
            // /Users/akwei/antlrpro/sql/SQL.g:53:2: DELETE FROM table whereSQL
            {
                match(input, DELETE, FOLLOW_DELETE_in_deleteSQL240);
                match(input, FROM, FOLLOW_FROM_in_deleteSQL242);
                pushFollow(FOLLOW_table_in_deleteSQL244);
                table();
                state._fsp--;
                pushFollow(FOLLOW_whereSQL_in_deleteSQL246);
                whereSQL();
                state._fsp--;
            }
        }
        catch (RecognitionException re) {
            // reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "deleteSQL"
    // $ANTLR start "selectSQL"
    // /Users/akwei/antlrpro/sql/SQL.g:55:1: selectSQL : SELECT multColums FROM
    // tables joinSQL whereSQL ;
    public final void selectSQL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/SQL.g:56:2: ( SELECT multColums FROM
            // tables joinSQL whereSQL )
            // /Users/akwei/antlrpro/sql/SQL.g:57:2: SELECT multColums FROM
            // tables joinSQL whereSQL
            {
                match(input, SELECT, FOLLOW_SELECT_in_selectSQL258);
                pushFollow(FOLLOW_multColums_in_selectSQL260);
                multColums();
                state._fsp--;
                match(input, FROM, FOLLOW_FROM_in_selectSQL262);
                pushFollow(FOLLOW_tables_in_selectSQL264);
                tables();
                state._fsp--;
                pushFollow(FOLLOW_joinSQL_in_selectSQL266);
                joinSQL();
                state._fsp--;
                pushFollow(FOLLOW_whereSQL_in_selectSQL268);
                whereSQL();
                state._fsp--;
            }
        }
        catch (RecognitionException re) {
            // reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "selectSQL"
    // $ANTLR start "joinSQL"
    // /Users/akwei/antlrpro/sql/SQL.g:59:1: joinSQL : ( ( FULL | CROSS | INNER
    // | LEFT | RIGHT ) JOIN table ON WORD '=' WORD )? ;
    public final void joinSQL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/SQL.g:59:9: ( ( ( FULL | CROSS | INNER
            // | LEFT | RIGHT ) JOIN table ON WORD '=' WORD )? )
            // /Users/akwei/antlrpro/sql/SQL.g:60:2: ( ( FULL | CROSS | INNER |
            // LEFT | RIGHT ) JOIN table ON WORD '=' WORD )?
            {
                // /Users/akwei/antlrpro/sql/SQL.g:60:2: ( ( FULL | CROSS |
                // INNER | LEFT | RIGHT ) JOIN table ON WORD '=' WORD )?
                int alt3 = 2;
                int LA3_0 = input.LA(1);
                if ((LA3_0 == CROSS || LA3_0 == FULL || LA3_0 == INNER
                        || LA3_0 == LEFT || LA3_0 == RIGHT)) {
                    alt3 = 1;
                }
                switch (alt3) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/SQL.g:60:4: ( FULL | CROSS |
                    // INNER | LEFT | RIGHT ) JOIN table ON WORD '=' WORD
                    {
                        if (input.LA(1) == CROSS || input.LA(1) == FULL
                                || input.LA(1) == INNER || input.LA(1) == LEFT
                                || input.LA(1) == RIGHT) {
                            input.consume();
                            state.errorRecovery = false;
                        }
                        else {
                            MismatchedSetException mse = new MismatchedSetException(
                                    null, input);
                            throw mse;
                        }
                        match(input, JOIN, FOLLOW_JOIN_in_joinSQL292);
                        pushFollow(FOLLOW_table_in_joinSQL294);
                        table();
                        state._fsp--;
                        match(input, ON, FOLLOW_ON_in_joinSQL296);
                        match(input, WORD, FOLLOW_WORD_in_joinSQL298);
                        match(input, 36, FOLLOW_36_in_joinSQL300);
                        match(input, WORD, FOLLOW_WORD_in_joinSQL302);
                    }
                        break;
                }
            }
        }
        catch (RecognitionException re) {
            // reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "joinSQL"
    // $ANTLR start "updateSQL"
    // /Users/akwei/antlrpro/sql/SQL.g:62:1: updateSQL : UPDATE table set
    // whereSQL ;
    public final void updateSQL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/SQL.g:63:2: ( UPDATE table set whereSQL
            // )
            // /Users/akwei/antlrpro/sql/SQL.g:64:2: UPDATE table set whereSQL
            {
                match(input, UPDATE, FOLLOW_UPDATE_in_updateSQL317);
                pushFollow(FOLLOW_table_in_updateSQL319);
                table();
                state._fsp--;
                pushFollow(FOLLOW_set_in_updateSQL321);
                set();
                state._fsp--;
                pushFollow(FOLLOW_whereSQL_in_updateSQL323);
                whereSQL();
                state._fsp--;
            }
        }
        catch (RecognitionException re) {
            // reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "updateSQL"
    // $ANTLR start "table"
    // /Users/akwei/antlrpro/sql/SQL.g:66:1: table : name ( ( AS )? alias ) ;
    public final void table() throws RecognitionException {
        Antlrv34SQLParser.name_return name1 = null;
        Antlrv34SQLParser.alias_return alias2 = null;
        try {
            // /Users/akwei/antlrpro/sql/SQL.g:66:7: ( name ( ( AS )? alias ) )
            // /Users/akwei/antlrpro/sql/SQL.g:67:2: name ( ( AS )? alias )
            {
                pushFollow(FOLLOW_name_in_table333);
                name1 = name();
                state._fsp--;
                // /Users/akwei/antlrpro/sql/SQL.g:67:7: ( ( AS )? alias )
                // /Users/akwei/antlrpro/sql/SQL.g:67:8: ( AS )? alias
                {
                    // /Users/akwei/antlrpro/sql/SQL.g:67:8: ( AS )?
                    int alt4 = 2;
                    int LA4_0 = input.LA(1);
                    if ((LA4_0 == AS)) {
                        alt4 = 1;
                    }
                    switch (alt4) {
                        case 1:
                        // /Users/akwei/antlrpro/sql/SQL.g:67:8: AS
                        {
                            match(input, AS, FOLLOW_AS_in_table336);
                        }
                            break;
                    }
                    pushFollow(FOLLOW_alias_in_table339);
                    alias2 = alias();
                    state._fsp--;
                }
                if (this.antlrParserDelegate != null) {
                    this.antlrParserDelegate.onFindTable(
                            (name1 != null ? input.toString(name1.start,
                                    name1.stop) : null),
                            (alias2 != null ? input.toString(alias2.start,
                                    alias2.stop) : null));
                }
            }
        }
        catch (RecognitionException re) {
            // reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "table"
    // $ANTLR start "tables"
    // /Users/akwei/antlrpro/sql/SQL.g:69:1: tables : ( table ( ',' table )* ) ;
    public final void tables() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/SQL.g:69:8: ( ( table ( ',' table )* )
            // )
            // /Users/akwei/antlrpro/sql/SQL.g:70:2: ( table ( ',' table )* )
            {
                // /Users/akwei/antlrpro/sql/SQL.g:70:2: ( table ( ',' table )*
                // )
                // /Users/akwei/antlrpro/sql/SQL.g:70:3: table ( ',' table )*
                {
                    pushFollow(FOLLOW_table_in_tables353);
                    table();
                    state._fsp--;
                    // /Users/akwei/antlrpro/sql/SQL.g:70:9: ( ',' table )*
                    loop5: do {
                        int alt5 = 2;
                        int LA5_0 = input.LA(1);
                        if ((LA5_0 == 32)) {
                            alt5 = 1;
                        }
                        switch (alt5) {
                            case 1:
                            // /Users/akwei/antlrpro/sql/SQL.g:70:10: ',' table
                            {
                                match(input, 32, FOLLOW_32_in_tables356);
                                pushFollow(FOLLOW_table_in_tables358);
                                table();
                                state._fsp--;
                            }
                                break;
                            default:
                                break loop5;
                        }
                    }
                    while (true);
                }
            }
        }
        catch (RecognitionException re) {
            // reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "tables"
    // $ANTLR start "set"
    // /Users/akwei/antlrpro/sql/SQL.g:72:1: set : SET ( k_v ( ',' k_v )* ) ;
    public final void set() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/SQL.g:72:5: ( SET ( k_v ( ',' k_v )* )
            // )
            // /Users/akwei/antlrpro/sql/SQL.g:73:2: SET ( k_v ( ',' k_v )* )
            {
                match(input, SET, FOLLOW_SET_in_set373);
                // /Users/akwei/antlrpro/sql/SQL.g:73:6: ( k_v ( ',' k_v )* )
                // /Users/akwei/antlrpro/sql/SQL.g:73:7: k_v ( ',' k_v )*
                {
                    pushFollow(FOLLOW_k_v_in_set376);
                    k_v();
                    state._fsp--;
                    // /Users/akwei/antlrpro/sql/SQL.g:73:11: ( ',' k_v )*
                    loop6: do {
                        int alt6 = 2;
                        int LA6_0 = input.LA(1);
                        if ((LA6_0 == 32)) {
                            alt6 = 1;
                        }
                        switch (alt6) {
                            case 1:
                            // /Users/akwei/antlrpro/sql/SQL.g:73:12: ',' k_v
                            {
                                match(input, 32, FOLLOW_32_in_set379);
                                pushFollow(FOLLOW_k_v_in_set381);
                                k_v();
                                state._fsp--;
                            }
                                break;
                            default:
                                break loop6;
                        }
                    }
                    while (true);
                }
            }
        }
        catch (RecognitionException re) {
            // reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "set"
    // $ANTLR start "k_v"
    // /Users/akwei/antlrpro/sql/SQL.g:75:1: k_v : WORD op PRE_SET ;
    public final void k_v() throws RecognitionException {
        Token WORD3 = null;
        Antlrv34SQLParser.op_return op4 = null;
        try {
            // /Users/akwei/antlrpro/sql/SQL.g:75:5: ( WORD op PRE_SET )
            // /Users/akwei/antlrpro/sql/SQL.g:76:2: WORD op PRE_SET
            {
                WORD3 = (Token) match(input, WORD, FOLLOW_WORD_in_k_v394);
                pushFollow(FOLLOW_op_in_k_v396);
                op4 = op();
                state._fsp--;
                match(input, PRE_SET, FOLLOW_PRE_SET_in_k_v398);
                if (this.antlrParserDelegate != null) {
                    this.antlrParserDelegate.onFindColExper(
                            (WORD3 != null ? WORD3.getText() : null),
                            (op4 != null ? input.toString(op4.start, op4.stop)
                                    : null));
                }
            }
        }
        catch (RecognitionException re) {
            // reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "k_v"
    // $ANTLR start "column"
    // /Users/akwei/antlrpro/sql/SQL.g:78:1: column : name ( ( AS )? alias )? ;
    public final void column() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/SQL.g:78:8: ( name ( ( AS )? alias )? )
            // /Users/akwei/antlrpro/sql/SQL.g:79:2: name ( ( AS )? alias )?
            {
                pushFollow(FOLLOW_name_in_column410);
                name();
                state._fsp--;
                // /Users/akwei/antlrpro/sql/SQL.g:79:7: ( ( AS )? alias )?
                int alt8 = 2;
                int LA8_0 = input.LA(1);
                if ((LA8_0 == AS || LA8_0 == WORD)) {
                    alt8 = 1;
                }
                switch (alt8) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/SQL.g:79:8: ( AS )? alias
                    {
                        // /Users/akwei/antlrpro/sql/SQL.g:79:8: ( AS )?
                        int alt7 = 2;
                        int LA7_0 = input.LA(1);
                        if ((LA7_0 == AS)) {
                            alt7 = 1;
                        }
                        switch (alt7) {
                            case 1:
                            // /Users/akwei/antlrpro/sql/SQL.g:79:8: AS
                            {
                                match(input, AS, FOLLOW_AS_in_column413);
                            }
                                break;
                        }
                        pushFollow(FOLLOW_alias_in_column416);
                        alias();
                        state._fsp--;
                    }
                        break;
                }
            }
        }
        catch (RecognitionException re) {
            // reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "column"
    // $ANTLR start "multColums"
    // /Users/akwei/antlrpro/sql/SQL.g:81:1: multColums : ( '*' | column ( ','
    // column )* ) ;
    public final void multColums() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/SQL.g:82:2: ( ( '*' | column ( ','
            // column )* ) )
            // /Users/akwei/antlrpro/sql/SQL.g:83:2: ( '*' | column ( ',' column
            // )* )
            {
                // /Users/akwei/antlrpro/sql/SQL.g:83:2: ( '*' | column ( ','
                // column )* )
                int alt10 = 2;
                int LA10_0 = input.LA(1);
                if ((LA10_0 == 31)) {
                    alt10 = 1;
                }
                else if ((LA10_0 == WORD)) {
                    alt10 = 2;
                }
                else {
                    NoViableAltException nvae = new NoViableAltException("",
                            10, 0, input);
                    throw nvae;
                }
                switch (alt10) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/SQL.g:83:3: '*'
                    {
                        match(input, 31, FOLLOW_31_in_multColums429);
                    }
                        break;
                    case 2:
                    // /Users/akwei/antlrpro/sql/SQL.g:83:7: column ( ',' column
                    // )*
                    {
                        pushFollow(FOLLOW_column_in_multColums431);
                        column();
                        state._fsp--;
                        // /Users/akwei/antlrpro/sql/SQL.g:83:14: ( ',' column
                        // )*
                        loop9: do {
                            int alt9 = 2;
                            int LA9_0 = input.LA(1);
                            if ((LA9_0 == 32)) {
                                alt9 = 1;
                            }
                            switch (alt9) {
                                case 1:
                                // /Users/akwei/antlrpro/sql/SQL.g:83:15: ','
                                // column
                                {
                                    match(input, 32, FOLLOW_32_in_multColums434);
                                    pushFollow(FOLLOW_column_in_multColums436);
                                    column();
                                    state._fsp--;
                                }
                                    break;
                                default:
                                    break loop9;
                            }
                        }
                        while (true);
                    }
                        break;
                }
            }
        }
        catch (RecognitionException re) {
            // reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "multColums"
    // $ANTLR start "whereSQL"
    // /Users/akwei/antlrpro/sql/SQL.g:85:1: whereSQL : ( WHERE ( k_v ) ( and_or
    // k_v )* )? ;
    public final void whereSQL() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/SQL.g:85:9: ( ( WHERE ( k_v ) ( and_or
            // k_v )* )? )
            // /Users/akwei/antlrpro/sql/SQL.g:86:2: ( WHERE ( k_v ) ( and_or
            // k_v )* )?
            {
                // /Users/akwei/antlrpro/sql/SQL.g:86:2: ( WHERE ( k_v ) (
                // and_or k_v )* )?
                int alt12 = 2;
                int LA12_0 = input.LA(1);
                if ((LA12_0 == WHERE)) {
                    alt12 = 1;
                }
                switch (alt12) {
                    case 1:
                    // /Users/akwei/antlrpro/sql/SQL.g:86:3: WHERE ( k_v ) (
                    // and_or k_v )*
                    {
                        match(input, WHERE, FOLLOW_WHERE_in_whereSQL450);
                        // /Users/akwei/antlrpro/sql/SQL.g:86:9: ( k_v )
                        // /Users/akwei/antlrpro/sql/SQL.g:86:10: k_v
                        {
                            pushFollow(FOLLOW_k_v_in_whereSQL453);
                            k_v();
                            state._fsp--;
                        }
                        // /Users/akwei/antlrpro/sql/SQL.g:86:15: ( and_or k_v
                        // )*
                        loop11: do {
                            int alt11 = 2;
                            int LA11_0 = input.LA(1);
                            if ((LA11_0 == AND || LA11_0 == OR)) {
                                alt11 = 1;
                            }
                            switch (alt11) {
                                case 1:
                                // /Users/akwei/antlrpro/sql/SQL.g:86:16: and_or
                                // k_v
                                {
                                    pushFollow(FOLLOW_and_or_in_whereSQL457);
                                    and_or();
                                    state._fsp--;
                                    pushFollow(FOLLOW_k_v_in_whereSQL459);
                                    k_v();
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
            // reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "whereSQL"
    // $ANTLR start "and_or"
    // /Users/akwei/antlrpro/sql/SQL.g:88:1: and_or : ( AND | OR ) ;
    public final void and_or() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql/SQL.g:88:8: ( ( AND | OR ) )
            // /Users/akwei/antlrpro/sql/SQL.g:
            {
                if (input.LA(1) == AND || input.LA(1) == OR) {
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
            // reportError(re);
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
    // /Users/akwei/antlrpro/sql/SQL.g:91:1: op : ( '=' | '>' | '>=' | '<' |
    // '<=' | '!=' | '<>' ) ;
    public final Antlrv34SQLParser.op_return op() throws RecognitionException {
        Antlrv34SQLParser.op_return retval = new Antlrv34SQLParser.op_return();
        retval.start = input.LT(1);
        try {
            // /Users/akwei/antlrpro/sql/SQL.g:92:2: ( ( '=' | '>' | '>=' | '<'
            // | '<=' | '!=' | '<>' ) )
            // /Users/akwei/antlrpro/sql/SQL.g:
            {
                if (input.LA(1) == 30
                        || (input.LA(1) >= 33 && input.LA(1) <= 38)) {
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
            // reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "op"
    public static class name_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "name"
    // /Users/akwei/antlrpro/sql/SQL.g:96:1: name : WORD ;
    public final Antlrv34SQLParser.name_return name()
            throws RecognitionException {
        Antlrv34SQLParser.name_return retval = new Antlrv34SQLParser.name_return();
        retval.start = input.LT(1);
        try {
            // /Users/akwei/antlrpro/sql/SQL.g:96:6: ( WORD )
            // /Users/akwei/antlrpro/sql/SQL.g:97:2: WORD
            {
                match(input, WORD, FOLLOW_WORD_in_name515);
            }
            retval.stop = input.LT(-1);
        }
        catch (RecognitionException re) {
            // reportError(re);
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
    // /Users/akwei/antlrpro/sql/SQL.g:99:1: alias : WORD ;
    public final Antlrv34SQLParser.alias_return alias()
            throws RecognitionException {
        Antlrv34SQLParser.alias_return retval = new Antlrv34SQLParser.alias_return();
        retval.start = input.LT(1);
        try {
            // /Users/akwei/antlrpro/sql/SQL.g:99:7: ( WORD )
            // /Users/akwei/antlrpro/sql/SQL.g:100:2: WORD
            {
                match(input, WORD, FOLLOW_WORD_in_alias525);
            }
            retval.stop = input.LT(-1);
        }
        catch (RecognitionException re) {
            // reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "alias"
    // Delegated rules
    public static final BitSet FOLLOW_insertSQL_in_proc173 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_selectSQL_in_proc175 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_deleteSQL_in_proc177 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_updateSQL_in_proc179 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_INSERT_in_insertSQL189 = new BitSet(
            new long[] { 0x0000000000002000L });

    public static final BitSet FOLLOW_INTO_in_insertSQL191 = new BitSet(
            new long[] { 0x0000000010000000L });

    public static final BitSet FOLLOW_table_in_insertSQL193 = new BitSet(
            new long[] { 0x0000000000010000L });

    public static final BitSet FOLLOW_LEFT_CLOSE_in_insertSQL195 = new BitSet(
            new long[] { 0x0000000090000000L });

    public static final BitSet FOLLOW_multColums_in_insertSQL197 = new BitSet(
            new long[] { 0x0000000000400000L });

    public static final BitSet FOLLOW_RIGHT_CLOSE_in_insertSQL199 = new BitSet(
            new long[] { 0x0000000004000000L });

    public static final BitSet FOLLOW_insertValues_in_insertSQL201 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_VALUES_in_insertValues213 = new BitSet(
            new long[] { 0x0000000000010000L });

    public static final BitSet FOLLOW_LEFT_CLOSE_in_insertValues215 = new BitSet(
            new long[] { 0x0000000100500000L });

    public static final BitSet FOLLOW_PRE_SET_in_insertValues218 = new BitSet(
            new long[] { 0x0000000100500000L });

    public static final BitSet FOLLOW_32_in_insertValues221 = new BitSet(
            new long[] { 0x0000000000100000L });

    public static final BitSet FOLLOW_PRE_SET_in_insertValues223 = new BitSet(
            new long[] { 0x0000000100500000L });

    public static final BitSet FOLLOW_RIGHT_CLOSE_in_insertValues228 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_DELETE_in_deleteSQL240 = new BitSet(
            new long[] { 0x0000000000000100L });

    public static final BitSet FOLLOW_FROM_in_deleteSQL242 = new BitSet(
            new long[] { 0x0000000010000000L });

    public static final BitSet FOLLOW_table_in_deleteSQL244 = new BitSet(
            new long[] { 0x0000000008000000L });

    public static final BitSet FOLLOW_whereSQL_in_deleteSQL246 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_SELECT_in_selectSQL258 = new BitSet(
            new long[] { 0x0000000090000000L });

    public static final BitSet FOLLOW_multColums_in_selectSQL260 = new BitSet(
            new long[] { 0x0000000000000100L });

    public static final BitSet FOLLOW_FROM_in_selectSQL262 = new BitSet(
            new long[] { 0x0000000010000000L });

    public static final BitSet FOLLOW_tables_in_selectSQL264 = new BitSet(
            new long[] { 0x0000000008208A40L });

    public static final BitSet FOLLOW_joinSQL_in_selectSQL266 = new BitSet(
            new long[] { 0x0000000008000000L });

    public static final BitSet FOLLOW_whereSQL_in_selectSQL268 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_set_in_joinSQL280 = new BitSet(
            new long[] { 0x0000000000004000L });

    public static final BitSet FOLLOW_JOIN_in_joinSQL292 = new BitSet(
            new long[] { 0x0000000010000000L });

    public static final BitSet FOLLOW_table_in_joinSQL294 = new BitSet(
            new long[] { 0x0000000000040000L });

    public static final BitSet FOLLOW_ON_in_joinSQL296 = new BitSet(
            new long[] { 0x0000000010000000L });

    public static final BitSet FOLLOW_WORD_in_joinSQL298 = new BitSet(
            new long[] { 0x0000001000000000L });

    public static final BitSet FOLLOW_36_in_joinSQL300 = new BitSet(
            new long[] { 0x0000000010000000L });

    public static final BitSet FOLLOW_WORD_in_joinSQL302 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_UPDATE_in_updateSQL317 = new BitSet(
            new long[] { 0x0000000010000000L });

    public static final BitSet FOLLOW_table_in_updateSQL319 = new BitSet(
            new long[] { 0x0000000001000000L });

    public static final BitSet FOLLOW_set_in_updateSQL321 = new BitSet(
            new long[] { 0x0000000008000000L });

    public static final BitSet FOLLOW_whereSQL_in_updateSQL323 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_name_in_table333 = new BitSet(
            new long[] { 0x0000000010000020L });

    public static final BitSet FOLLOW_AS_in_table336 = new BitSet(
            new long[] { 0x0000000010000000L });

    public static final BitSet FOLLOW_alias_in_table339 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_table_in_tables353 = new BitSet(
            new long[] { 0x0000000100000002L });

    public static final BitSet FOLLOW_32_in_tables356 = new BitSet(
            new long[] { 0x0000000010000000L });

    public static final BitSet FOLLOW_table_in_tables358 = new BitSet(
            new long[] { 0x0000000100000002L });

    public static final BitSet FOLLOW_SET_in_set373 = new BitSet(
            new long[] { 0x0000000010000000L });

    public static final BitSet FOLLOW_k_v_in_set376 = new BitSet(
            new long[] { 0x0000000100000002L });

    public static final BitSet FOLLOW_32_in_set379 = new BitSet(
            new long[] { 0x0000000010000000L });

    public static final BitSet FOLLOW_k_v_in_set381 = new BitSet(
            new long[] { 0x0000000100000002L });

    public static final BitSet FOLLOW_WORD_in_k_v394 = new BitSet(
            new long[] { 0x0000007E40000000L });

    public static final BitSet FOLLOW_op_in_k_v396 = new BitSet(
            new long[] { 0x0000000000100000L });

    public static final BitSet FOLLOW_PRE_SET_in_k_v398 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_name_in_column410 = new BitSet(
            new long[] { 0x0000000010000022L });

    public static final BitSet FOLLOW_AS_in_column413 = new BitSet(
            new long[] { 0x0000000010000000L });

    public static final BitSet FOLLOW_alias_in_column416 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_31_in_multColums429 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_column_in_multColums431 = new BitSet(
            new long[] { 0x0000000100000002L });

    public static final BitSet FOLLOW_32_in_multColums434 = new BitSet(
            new long[] { 0x0000000010000000L });

    public static final BitSet FOLLOW_column_in_multColums436 = new BitSet(
            new long[] { 0x0000000100000002L });

    public static final BitSet FOLLOW_WHERE_in_whereSQL450 = new BitSet(
            new long[] { 0x0000000010000000L });

    public static final BitSet FOLLOW_k_v_in_whereSQL453 = new BitSet(
            new long[] { 0x0000000000080012L });

    public static final BitSet FOLLOW_and_or_in_whereSQL457 = new BitSet(
            new long[] { 0x0000000010000000L });

    public static final BitSet FOLLOW_k_v_in_whereSQL459 = new BitSet(
            new long[] { 0x0000000000080012L });

    public static final BitSet FOLLOW_WORD_in_name515 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_WORD_in_alias525 = new BitSet(
            new long[] { 0x0000000000000002L });
}