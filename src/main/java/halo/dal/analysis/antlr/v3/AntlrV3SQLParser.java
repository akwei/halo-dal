package halo.dal.analysis.antlr.v3;

// $ANTLR 3.4 /Users/akwei/antlrpro/sql2/AntlrV3SQL.g 2012-07-18 22:36:23
import halo.dal.analysis.antlr.AntlrParserDelegate;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class AntlrV3SQLParser extends Parser {

    public static final String[] tokenNames = new String[] { "<invalid>",
            "<EOR>", "<DOWN>", "<UP>", "A", "AND", "AS", "ASC", "B",
            "BASIC_NAME", "BETWEEN", "BY", "C", "CROSS", "D", "DELETE", "DESC",
            "E", "EXISTS", "F", "FROM", "FULL", "G", "GROUP", "H", "HAVING",
            "I", "IN", "INNER", "INSERT", "INTO", "J", "JOIN", "K", "L",
            "LEFT", "M", "N", "O", "ON", "OR", "ORDER", "P", "PRE_SET", "Q",
            "R", "RIGHT", "S", "SELECT", "SET", "T", "TEXT_STRING", "U",
            "UPDATE", "V", "VALUES", "W", "WHERE", "WS", "X", "Y", "Z", "'!='",
            "'*'", "','", "'.'", "'<'", "'<='", "'<>'", "'='", "'>'", "'>='",
            "'\\('", "'\\)'" };

    public static final int EOF = -1;

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

    public static final int T__73 = 73;

    public static final int A = 4;

    public static final int AND = 5;

    public static final int AS = 6;

    public static final int ASC = 7;

    public static final int B = 8;

    public static final int BASIC_NAME = 9;

    public static final int BETWEEN = 10;

    public static final int BY = 11;

    public static final int C = 12;

    public static final int CROSS = 13;

    public static final int D = 14;

    public static final int DELETE = 15;

    public static final int DESC = 16;

    public static final int E = 17;

    public static final int EXISTS = 18;

    public static final int F = 19;

    public static final int FROM = 20;

    public static final int FULL = 21;

    public static final int G = 22;

    public static final int GROUP = 23;

    public static final int H = 24;

    public static final int HAVING = 25;

    public static final int I = 26;

    public static final int IN = 27;

    public static final int INNER = 28;

    public static final int INSERT = 29;

    public static final int INTO = 30;

    public static final int J = 31;

    public static final int JOIN = 32;

    public static final int K = 33;

    public static final int L = 34;

    public static final int LEFT = 35;

    public static final int M = 36;

    public static final int N = 37;

    public static final int O = 38;

    public static final int ON = 39;

    public static final int OR = 40;

    public static final int ORDER = 41;

    public static final int P = 42;

    public static final int PRE_SET = 43;

    public static final int Q = 44;

    public static final int R = 45;

    public static final int RIGHT = 46;

    public static final int S = 47;

    public static final int SELECT = 48;

    public static final int SET = 49;

    public static final int T = 50;

    public static final int TEXT_STRING = 51;

    public static final int U = 52;

    public static final int UPDATE = 53;

    public static final int V = 54;

    public static final int VALUES = 55;

    public static final int W = 56;

    public static final int WHERE = 57;

    public static final int WS = 58;

    public static final int X = 59;

    public static final int Y = 60;

    public static final int Z = 61;

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
        return "/Users/akwei/antlrpro/sql2/AntlrV3SQL.g";
    }

    private AntlrParserDelegate antlrParserDelegate;

    public void setAntlrParserDelegate(AntlrParserDelegate antlrParserDelegate) {
        this.antlrParserDelegate = antlrParserDelegate;
    }

    @Override
    public void reportError(RecognitionException e) {
    }

    // $ANTLR start "start"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:17:1: start : ( sql_insert |
    // sql_delete | sql_update | sql_select );
    public final void start() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:17:7: ( sql_insert |
            // sql_delete | sql_update | sql_select )
            int alt1 = 4;
            switch (input.LA(1)) {
                case INSERT: {
                    alt1 = 1;
                }
                    break;
                case DELETE: {
                    alt1 = 2;
                }
                    break;
                case UPDATE: {
                    alt1 = 3;
                }
                    break;
                case SELECT: {
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
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:18:2: sql_insert
                {
                    pushFollow(FOLLOW_sql_insert_in_start18);
                    sql_insert();
                    state._fsp--;
                }
                    break;
                case 2:
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:18:13: sql_delete
                {
                    pushFollow(FOLLOW_sql_delete_in_start20);
                    sql_delete();
                    state._fsp--;
                }
                    break;
                case 3:
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:18:24: sql_update
                {
                    pushFollow(FOLLOW_sql_update_in_start22);
                    sql_update();
                    state._fsp--;
                }
                    break;
                case 4:
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:18:35: sql_select
                {
                    pushFollow(FOLLOW_sql_select_in_start24);
                    sql_select();
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

    // $ANTLR end "start"
    // $ANTLR start "sql_insert"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:20:1: sql_insert : INSERT INTO
    // table '\\(' insertColumn ( ',' insertColumn )* '\\)' VALUES '\\(' (
    // PRE_SET | ( ',' PRE_SET ) )* '\\)' ;
    public final void sql_insert() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:21:2: ( INSERT INTO table
            // '\\(' insertColumn ( ',' insertColumn )* '\\)' VALUES '\\(' (
            // PRE_SET | ( ',' PRE_SET ) )* '\\)' )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:22:2: INSERT INTO table
            // '\\(' insertColumn ( ',' insertColumn )* '\\)' VALUES '\\(' (
            // PRE_SET | ( ',' PRE_SET ) )* '\\)'
            {
                match(input, INSERT, FOLLOW_INSERT_in_sql_insert35);
                match(input, INTO, FOLLOW_INTO_in_sql_insert37);
                pushFollow(FOLLOW_table_in_sql_insert39);
                table();
                state._fsp--;
                match(input, 72, FOLLOW_72_in_sql_insert41);
                pushFollow(FOLLOW_insertColumn_in_sql_insert43);
                insertColumn();
                state._fsp--;
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:22:38: ( ','
                // insertColumn )*
                loop2: do {
                    int alt2 = 2;
                    int LA2_0 = input.LA(1);
                    if ((LA2_0 == 64)) {
                        alt2 = 1;
                    }
                    switch (alt2) {
                        case 1:
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:22:39: ','
                        // insertColumn
                        {
                            match(input, 64, FOLLOW_64_in_sql_insert46);
                            pushFollow(FOLLOW_insertColumn_in_sql_insert48);
                            insertColumn();
                            state._fsp--;
                        }
                            break;
                        default:
                            break loop2;
                    }
                }
                while (true);
                match(input, 73, FOLLOW_73_in_sql_insert52);
                match(input, VALUES, FOLLOW_VALUES_in_sql_insert54);
                match(input, 72, FOLLOW_72_in_sql_insert56);
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:22:75: ( PRE_SET | (
                // ',' PRE_SET ) )*
                loop3: do {
                    int alt3 = 3;
                    int LA3_0 = input.LA(1);
                    if ((LA3_0 == PRE_SET)) {
                        alt3 = 1;
                    }
                    else if ((LA3_0 == 64)) {
                        alt3 = 2;
                    }
                    switch (alt3) {
                        case 1:
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:22:76:
                        // PRE_SET
                        {
                            match(input, PRE_SET,
                                    FOLLOW_PRE_SET_in_sql_insert59);
                        }
                            break;
                        case 2:
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:22:84: ( ','
                        // PRE_SET )
                        {
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:22:84: (
                            // ',' PRE_SET )
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:22:85:
                            // ',' PRE_SET
                            {
                                match(input, 64, FOLLOW_64_in_sql_insert62);
                                match(input, PRE_SET,
                                        FOLLOW_PRE_SET_in_sql_insert64);
                            }
                        }
                            break;
                        default:
                            break loop3;
                    }
                }
                while (true);
                match(input, 73, FOLLOW_73_in_sql_insert69);
                antlrParserDelegate.setSqlOp(AntlrParserDelegate.SQLOP_INSERT);
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

    // $ANTLR end "sql_insert"
    // $ANTLR start "sql_delete"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:28:1: sql_delete : DELETE FROM
    // table where ;
    public final void sql_delete() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:29:2: ( DELETE FROM table
            // where )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:30:2: DELETE FROM table
            // where
            {
                match(input, DELETE, FOLLOW_DELETE_in_sql_delete86);
                match(input, FROM, FOLLOW_FROM_in_sql_delete88);
                pushFollow(FOLLOW_table_in_sql_delete90);
                table();
                state._fsp--;
                pushFollow(FOLLOW_where_in_sql_delete92);
                where();
                state._fsp--;
                antlrParserDelegate.setSqlOp(AntlrParserDelegate.SQLOP_DELETE);
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

    // $ANTLR end "sql_delete"
    // $ANTLR start "sql_update"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:36:1: sql_update : UPDATE table
    // SET kv ( ',' kv )* where ;
    public final void sql_update() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:37:2: ( UPDATE table SET
            // kv ( ',' kv )* where )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:38:2: UPDATE table SET kv
            // ( ',' kv )* where
            {
                match(input, UPDATE, FOLLOW_UPDATE_in_sql_update109);
                pushFollow(FOLLOW_table_in_sql_update111);
                table();
                state._fsp--;
                match(input, SET, FOLLOW_SET_in_sql_update113);
                pushFollow(FOLLOW_kv_in_sql_update115);
                kv();
                state._fsp--;
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:38:22: ( ',' kv )*
                loop4: do {
                    int alt4 = 2;
                    int LA4_0 = input.LA(1);
                    if ((LA4_0 == 64)) {
                        alt4 = 1;
                    }
                    switch (alt4) {
                        case 1:
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:38:23: ',' kv
                        {
                            match(input, 64, FOLLOW_64_in_sql_update118);
                            pushFollow(FOLLOW_kv_in_sql_update120);
                            kv();
                            state._fsp--;
                        }
                            break;
                        default:
                            break loop4;
                    }
                }
                while (true);
                pushFollow(FOLLOW_where_in_sql_update124);
                where();
                state._fsp--;
                antlrParserDelegate.setSqlOp(AntlrParserDelegate.SQLOP_UPDATE);
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

    // $ANTLR end "sql_update"
    // $ANTLR start "sql_select"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:44:1: sql_select : SELECT ( func2
    // | select_columns FROM ( ( sql_select_tables where ( orderby | groupby |
    // having )* ) | ( '\\(' sql_select '\\)' ) ) ) ;
    public final void sql_select() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:45:2: ( SELECT ( func2 |
            // select_columns FROM ( ( sql_select_tables where ( orderby |
            // groupby | having )* ) | ( '\\(' sql_select '\\)' ) ) ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:46:2: SELECT ( func2 |
            // select_columns FROM ( ( sql_select_tables where ( orderby |
            // groupby | having )* ) | ( '\\(' sql_select '\\)' ) ) )
            {
                match(input, SELECT, FOLLOW_SELECT_in_sql_select141);
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:47:2: ( func2 |
                // select_columns FROM ( ( sql_select_tables where ( orderby |
                // groupby | having )* ) | ( '\\(' sql_select '\\)' ) ) )
                int alt7 = 2;
                int LA7_0 = input.LA(1);
                if ((LA7_0 == BASIC_NAME)) {
                    int LA7_1 = input.LA(2);
                    if ((LA7_1 == 72)) {
                        switch (input.LA(3)) {
                            case BASIC_NAME: {
                                int LA7_4 = input.LA(4);
                                if ((LA7_4 == 73)) {
                                    int LA7_6 = input.LA(5);
                                    if ((LA7_6 == AS || LA7_6 == BASIC_NAME
                                            || LA7_6 == FROM || LA7_6 == 64)) {
                                        alt7 = 2;
                                    }
                                    else if ((LA7_6 == EOF || LA7_6 == 73)) {
                                        alt7 = 1;
                                    }
                                    else {
                                        NoViableAltException nvae = new NoViableAltException(
                                                "", 7, 6, input);
                                        throw nvae;
                                    }
                                }
                                else if (((LA7_4 >= 64 && LA7_4 <= 65))) {
                                    alt7 = 1;
                                }
                                else {
                                    NoViableAltException nvae = new NoViableAltException(
                                            "", 7, 4, input);
                                    throw nvae;
                                }
                            }
                                break;
                            case 63: {
                                alt7 = 2;
                            }
                                break;
                            case TEXT_STRING:
                            case 73: {
                                alt7 = 1;
                            }
                                break;
                            default:
                                NoViableAltException nvae = new NoViableAltException(
                                        "", 7, 3, input);
                                throw nvae;
                        }
                    }
                    else if ((LA7_1 == AS || LA7_1 == BASIC_NAME
                            || LA7_1 == FROM || (LA7_1 >= 64 && LA7_1 <= 65))) {
                        alt7 = 2;
                    }
                    else {
                        NoViableAltException nvae = new NoViableAltException(
                                "", 7, 1, input);
                        throw nvae;
                    }
                }
                else if ((LA7_0 == 63)) {
                    alt7 = 2;
                }
                else {
                    NoViableAltException nvae = new NoViableAltException("", 7,
                            0, input);
                    throw nvae;
                }
                switch (alt7) {
                    case 1:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:48:3: func2
                    {
                        pushFollow(FOLLOW_func2_in_sql_select149);
                        func2();
                        state._fsp--;
                    }
                        break;
                    case 2:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:50:3:
                    // select_columns FROM ( ( sql_select_tables where ( orderby
                    // | groupby | having )* ) | ( '\\(' sql_select '\\)' ) )
                    {
                        pushFollow(FOLLOW_select_columns_in_sql_select157);
                        select_columns();
                        state._fsp--;
                        match(input, FROM, FOLLOW_FROM_in_sql_select159);
                        if (antlrParserDelegate != null)
                            antlrParserDelegate.setHasSelectFrom(true);
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:54:3: ( (
                        // sql_select_tables where ( orderby | groupby | having
                        // )* ) | ( '\\(' sql_select '\\)' ) )
                        int alt6 = 2;
                        int LA6_0 = input.LA(1);
                        if ((LA6_0 == BASIC_NAME)) {
                            alt6 = 1;
                        }
                        else if ((LA6_0 == 72)) {
                            alt6 = 2;
                        }
                        else {
                            NoViableAltException nvae = new NoViableAltException(
                                    "", 6, 0, input);
                            throw nvae;
                        }
                        switch (alt6) {
                            case 1:
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:55:3: (
                            // sql_select_tables where ( orderby | groupby |
                            // having )* )
                            {
                                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:55:3:
                                // ( sql_select_tables where ( orderby | groupby
                                // | having )* )
                                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:55:4:
                                // sql_select_tables where ( orderby | groupby |
                                // having )*
                                {
                                    pushFollow(FOLLOW_sql_select_tables_in_sql_select173);
                                    sql_select_tables();
                                    state._fsp--;
                                    pushFollow(FOLLOW_where_in_sql_select175);
                                    where();
                                    state._fsp--;
                                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:55:28:
                                    // ( orderby | groupby | having )*
                                    loop5: do {
                                        int alt5 = 4;
                                        switch (input.LA(1)) {
                                            case ORDER: {
                                                alt5 = 1;
                                            }
                                                break;
                                            case GROUP: {
                                                alt5 = 2;
                                            }
                                                break;
                                            case HAVING: {
                                                alt5 = 3;
                                            }
                                                break;
                                        }
                                        switch (alt5) {
                                            case 1:
                                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:55:29:
                                            // orderby
                                            {
                                                pushFollow(FOLLOW_orderby_in_sql_select178);
                                                orderby();
                                                state._fsp--;
                                            }
                                                break;
                                            case 2:
                                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:55:37:
                                            // groupby
                                            {
                                                pushFollow(FOLLOW_groupby_in_sql_select180);
                                                groupby();
                                                state._fsp--;
                                            }
                                                break;
                                            case 3:
                                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:55:45:
                                            // having
                                            {
                                                pushFollow(FOLLOW_having_in_sql_select182);
                                                having();
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
                                break;
                            case 2:
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:57:3: (
                            // '\\(' sql_select '\\)' )
                            {
                                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:57:3:
                                // ( '\\(' sql_select '\\)' )
                                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:57:4:
                                // '\\(' sql_select '\\)'
                                {
                                    match(input, 72, FOLLOW_72_in_sql_select194);
                                    pushFollow(FOLLOW_sql_select_in_sql_select196);
                                    sql_select();
                                    state._fsp--;
                                    match(input, 73, FOLLOW_73_in_sql_select198);
                                }
                            }
                                break;
                        }
                    }
                        break;
                }
                if (antlrParserDelegate != null)
                    antlrParserDelegate
                            .setSqlOp(AntlrParserDelegate.SQLOP_SELECT);
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

    // $ANTLR end "sql_select"
    // $ANTLR start "sql_select_tables"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:65:1: sql_select_tables : tables
    // ( ( FULL | CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '='
    // column_name )? )* ;
    public final void sql_select_tables() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:66:2: ( tables ( ( FULL |
            // CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '='
            // column_name )? )* )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:67:2: tables ( ( FULL |
            // CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '='
            // column_name )? )*
            {
                pushFollow(FOLLOW_tables_in_sql_select_tables222);
                tables();
                state._fsp--;
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:68:2: ( ( FULL |
                // CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name
                // '=' column_name )? )*
                loop9: do {
                    int alt9 = 2;
                    int LA9_0 = input.LA(1);
                    if ((LA9_0 == CROSS || LA9_0 == FULL || LA9_0 == INNER
                            || LA9_0 == LEFT || LA9_0 == RIGHT)) {
                        alt9 = 1;
                    }
                    switch (alt9) {
                        case 1:
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:68:3: ( FULL
                        // | CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON
                        // column_name '=' column_name )?
                        {
                            if (input.LA(1) == CROSS || input.LA(1) == FULL
                                    || input.LA(1) == INNER
                                    || input.LA(1) == LEFT
                                    || input.LA(1) == RIGHT) {
                                input.consume();
                                state.errorRecovery = false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(
                                        null, input);
                                throw mse;
                            }
                            match(input, JOIN,
                                    FOLLOW_JOIN_in_sql_select_tables239);
                            pushFollow(FOLLOW_table_in_sql_select_tables241);
                            table();
                            state._fsp--;
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:68:44: (
                            // ON column_name '=' column_name )?
                            int alt8 = 2;
                            int LA8_0 = input.LA(1);
                            if ((LA8_0 == ON)) {
                                alt8 = 1;
                            }
                            switch (alt8) {
                                case 1:
                                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:68:45:
                                // ON column_name '=' column_name
                                {
                                    match(input, ON,
                                            FOLLOW_ON_in_sql_select_tables244);
                                    pushFollow(FOLLOW_column_name_in_sql_select_tables246);
                                    column_name();
                                    state._fsp--;
                                    match(input, 69,
                                            FOLLOW_69_in_sql_select_tables248);
                                    pushFollow(FOLLOW_column_name_in_sql_select_tables250);
                                    column_name();
                                    state._fsp--;
                                }
                                    break;
                            }
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

    // $ANTLR end "sql_select_tables"
    // $ANTLR start "where"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:71:1: where : ( WHERE
    // sql_select_where_kv_all )? ;
    public final void where() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:72:2: ( ( WHERE
            // sql_select_where_kv_all )? )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:73:2: ( WHERE
            // sql_select_where_kv_all )?
            {
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:73:2: ( WHERE
                // sql_select_where_kv_all )?
                int alt10 = 2;
                int LA10_0 = input.LA(1);
                if ((LA10_0 == WHERE)) {
                    alt10 = 1;
                }
                switch (alt10) {
                    case 1:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:73:3: WHERE
                    // sql_select_where_kv_all
                    {
                        match(input, WHERE, FOLLOW_WHERE_in_where268);
                        pushFollow(FOLLOW_sql_select_where_kv_all_in_where270);
                        sql_select_where_kv_all();
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

    // $ANTLR end "where"
    // $ANTLR start "sql_select_where_kv"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:76:1: sql_select_where_kv : kv (
    // and_or ( kv | ( '\\(' kv ( and_or sql_select_where_kv ) '\\)' ) | (
    // column_name op '\\(' sql_select '\\)' ) | ( '\\(' column_name op '\\('
    // sql_select '\\)' '\\)' ) ) )* ;
    public final void sql_select_where_kv() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:77:2: ( kv ( and_or ( kv
            // | ( '\\(' kv ( and_or sql_select_where_kv ) '\\)' ) | (
            // column_name op '\\(' sql_select '\\)' ) | ( '\\(' column_name op
            // '\\(' sql_select '\\)' '\\)' ) ) )* )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:78:2: kv ( and_or ( kv |
            // ( '\\(' kv ( and_or sql_select_where_kv ) '\\)' ) | ( column_name
            // op '\\(' sql_select '\\)' ) | ( '\\(' column_name op '\\('
            // sql_select '\\)' '\\)' ) ) )*
            {
                pushFollow(FOLLOW_kv_in_sql_select_where_kv285);
                kv();
                state._fsp--;
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:79:2: ( and_or ( kv |
                // ( '\\(' kv ( and_or sql_select_where_kv ) '\\)' ) | (
                // column_name op '\\(' sql_select '\\)' ) | ( '\\(' column_name
                // op '\\(' sql_select '\\)' '\\)' ) ) )*
                loop12: do {
                    int alt12 = 2;
                    int LA12_0 = input.LA(1);
                    if ((LA12_0 == AND || LA12_0 == OR)) {
                        alt12 = 1;
                    }
                    switch (alt12) {
                        case 1:
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:80:2: and_or
                        // ( kv | ( '\\(' kv ( and_or sql_select_where_kv )
                        // '\\)' ) | ( column_name op '\\(' sql_select '\\)' ) |
                        // ( '\\(' column_name op '\\(' sql_select '\\)' '\\)' )
                        // )
                        {
                            pushFollow(FOLLOW_and_or_in_sql_select_where_kv291);
                            and_or();
                            state._fsp--;
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:81:3: (
                            // kv | ( '\\(' kv ( and_or sql_select_where_kv )
                            // '\\)' ) | ( column_name op '\\(' sql_select '\\)'
                            // ) | ( '\\(' column_name op '\\(' sql_select '\\)'
                            // '\\)' ) )
                            int alt11 = 4;
                            int LA11_0 = input.LA(1);
                            if ((LA11_0 == BASIC_NAME)) {
                                switch (input.LA(2)) {
                                    case 65: {
                                        int LA11_3 = input.LA(3);
                                        if ((LA11_3 == BASIC_NAME)) {
                                            int LA11_7 = input.LA(4);
                                            if ((LA11_7 == EXISTS
                                                    || LA11_7 == IN
                                                    || LA11_7 == 62 || (LA11_7 >= 66 && LA11_7 <= 71))) {
                                                int LA11_4 = input.LA(5);
                                                if ((LA11_4 == BASIC_NAME
                                                        || LA11_4 == PRE_SET || LA11_4 == TEXT_STRING)) {
                                                    alt11 = 1;
                                                }
                                                else if ((LA11_4 == 72)) {
                                                    int LA11_8 = input.LA(6);
                                                    if ((LA11_8 == PRE_SET || LA11_8 == TEXT_STRING)) {
                                                        alt11 = 1;
                                                    }
                                                    else if ((LA11_8 == SELECT)) {
                                                        alt11 = 3;
                                                    }
                                                    else {
                                                        NoViableAltException nvae = new NoViableAltException(
                                                                "", 11, 8,
                                                                input);
                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae = new NoViableAltException(
                                                            "", 11, 4, input);
                                                    throw nvae;
                                                }
                                            }
                                            else if ((LA11_7 == BETWEEN)) {
                                                alt11 = 1;
                                            }
                                            else {
                                                NoViableAltException nvae = new NoViableAltException(
                                                        "", 11, 7, input);
                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae = new NoViableAltException(
                                                    "", 11, 3, input);
                                            throw nvae;
                                        }
                                    }
                                        break;
                                    case EXISTS:
                                    case IN:
                                    case 62:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71: {
                                        int LA11_4 = input.LA(3);
                                        if ((LA11_4 == BASIC_NAME
                                                || LA11_4 == PRE_SET || LA11_4 == TEXT_STRING)) {
                                            alt11 = 1;
                                        }
                                        else if ((LA11_4 == 72)) {
                                            int LA11_8 = input.LA(4);
                                            if ((LA11_8 == PRE_SET || LA11_8 == TEXT_STRING)) {
                                                alt11 = 1;
                                            }
                                            else if ((LA11_8 == SELECT)) {
                                                alt11 = 3;
                                            }
                                            else {
                                                NoViableAltException nvae = new NoViableAltException(
                                                        "", 11, 8, input);
                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae = new NoViableAltException(
                                                    "", 11, 4, input);
                                            throw nvae;
                                        }
                                    }
                                        break;
                                    case BETWEEN: {
                                        alt11 = 1;
                                    }
                                        break;
                                    default:
                                        NoViableAltException nvae = new NoViableAltException(
                                                "", 11, 1, input);
                                        throw nvae;
                                }
                            }
                            else if ((LA11_0 == 72)) {
                                int LA11_2 = input.LA(2);
                                if ((LA11_2 == BASIC_NAME)) {
                                    switch (input.LA(3)) {
                                        case 65: {
                                            int LA11_9 = input.LA(4);
                                            if ((LA11_9 == BASIC_NAME)) {
                                                int LA11_13 = input.LA(5);
                                                if ((LA11_13 == EXISTS
                                                        || LA11_13 == IN
                                                        || LA11_13 == 62 || (LA11_13 >= 66 && LA11_13 <= 71))) {
                                                    int LA11_10 = input.LA(6);
                                                    if ((LA11_10 == BASIC_NAME
                                                            || LA11_10 == PRE_SET || LA11_10 == TEXT_STRING)) {
                                                        alt11 = 2;
                                                    }
                                                    else if ((LA11_10 == 72)) {
                                                        int LA11_14 = input
                                                                .LA(7);
                                                        if ((LA11_14 == PRE_SET || LA11_14 == TEXT_STRING)) {
                                                            alt11 = 2;
                                                        }
                                                        else if ((LA11_14 == SELECT)) {
                                                            alt11 = 4;
                                                        }
                                                        else {
                                                            NoViableAltException nvae = new NoViableAltException(
                                                                    "", 11, 14,
                                                                    input);
                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae = new NoViableAltException(
                                                                "", 11, 10,
                                                                input);
                                                        throw nvae;
                                                    }
                                                }
                                                else if ((LA11_13 == BETWEEN)) {
                                                    alt11 = 2;
                                                }
                                                else {
                                                    NoViableAltException nvae = new NoViableAltException(
                                                            "", 11, 13, input);
                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae = new NoViableAltException(
                                                        "", 11, 9, input);
                                                throw nvae;
                                            }
                                        }
                                            break;
                                        case EXISTS:
                                        case IN:
                                        case 62:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71: {
                                            int LA11_10 = input.LA(4);
                                            if ((LA11_10 == BASIC_NAME
                                                    || LA11_10 == PRE_SET || LA11_10 == TEXT_STRING)) {
                                                alt11 = 2;
                                            }
                                            else if ((LA11_10 == 72)) {
                                                int LA11_14 = input.LA(5);
                                                if ((LA11_14 == PRE_SET || LA11_14 == TEXT_STRING)) {
                                                    alt11 = 2;
                                                }
                                                else if ((LA11_14 == SELECT)) {
                                                    alt11 = 4;
                                                }
                                                else {
                                                    NoViableAltException nvae = new NoViableAltException(
                                                            "", 11, 14, input);
                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae = new NoViableAltException(
                                                        "", 11, 10, input);
                                                throw nvae;
                                            }
                                        }
                                            break;
                                        case BETWEEN: {
                                            alt11 = 2;
                                        }
                                            break;
                                        default:
                                            NoViableAltException nvae = new NoViableAltException(
                                                    "", 11, 6, input);
                                            throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae = new NoViableAltException(
                                            "", 11, 2, input);
                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae = new NoViableAltException(
                                        "", 11, 0, input);
                                throw nvae;
                            }
                            switch (alt11) {
                                case 1:
                                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:82:3:
                                // kv
                                {
                                    pushFollow(FOLLOW_kv_in_sql_select_where_kv300);
                                    kv();
                                    state._fsp--;
                                }
                                    break;
                                case 2:
                                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:84:3:
                                // ( '\\(' kv ( and_or sql_select_where_kv )
                                // '\\)' )
                                {
                                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:84:3:
                                    // ( '\\(' kv ( and_or sql_select_where_kv )
                                    // '\\)' )
                                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:84:4:
                                    // '\\(' kv ( and_or sql_select_where_kv )
                                    // '\\)'
                                    {
                                        match(input, 72,
                                                FOLLOW_72_in_sql_select_where_kv309);
                                        pushFollow(FOLLOW_kv_in_sql_select_where_kv311);
                                        kv();
                                        state._fsp--;
                                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:84:12:
                                        // ( and_or sql_select_where_kv )
                                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:84:13:
                                        // and_or sql_select_where_kv
                                        {
                                            pushFollow(FOLLOW_and_or_in_sql_select_where_kv314);
                                            and_or();
                                            state._fsp--;
                                            pushFollow(FOLLOW_sql_select_where_kv_in_sql_select_where_kv316);
                                            sql_select_where_kv();
                                            state._fsp--;
                                        }
                                        match(input, 73,
                                                FOLLOW_73_in_sql_select_where_kv319);
                                    }
                                }
                                    break;
                                case 3:
                                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:86:3:
                                // ( column_name op '\\(' sql_select '\\)' )
                                {
                                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:86:3:
                                    // ( column_name op '\\(' sql_select '\\)' )
                                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:86:4:
                                    // column_name op '\\(' sql_select '\\)'
                                    {
                                        pushFollow(FOLLOW_column_name_in_sql_select_where_kv330);
                                        column_name();
                                        state._fsp--;
                                        pushFollow(FOLLOW_op_in_sql_select_where_kv332);
                                        op();
                                        state._fsp--;
                                        match(input, 72,
                                                FOLLOW_72_in_sql_select_where_kv334);
                                        pushFollow(FOLLOW_sql_select_in_sql_select_where_kv336);
                                        sql_select();
                                        state._fsp--;
                                        match(input, 73,
                                                FOLLOW_73_in_sql_select_where_kv338);
                                    }
                                }
                                    break;
                                case 4:
                                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:88:3:
                                // ( '\\(' column_name op '\\(' sql_select '\\)'
                                // '\\)' )
                                {
                                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:88:3:
                                    // ( '\\(' column_name op '\\(' sql_select
                                    // '\\)' '\\)' )
                                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:88:4:
                                    // '\\(' column_name op '\\(' sql_select
                                    // '\\)' '\\)'
                                    {
                                        match(input, 72,
                                                FOLLOW_72_in_sql_select_where_kv349);
                                        pushFollow(FOLLOW_column_name_in_sql_select_where_kv351);
                                        column_name();
                                        state._fsp--;
                                        pushFollow(FOLLOW_op_in_sql_select_where_kv353);
                                        op();
                                        state._fsp--;
                                        match(input, 72,
                                                FOLLOW_72_in_sql_select_where_kv355);
                                        pushFollow(FOLLOW_sql_select_in_sql_select_where_kv357);
                                        sql_select();
                                        state._fsp--;
                                        match(input, 73,
                                                FOLLOW_73_in_sql_select_where_kv359);
                                        match(input, 73,
                                                FOLLOW_73_in_sql_select_where_kv361);
                                    }
                                }
                                    break;
                            }
                        }
                            break;
                        default:
                            break loop12;
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

    // $ANTLR end "sql_select_where_kv"
    // $ANTLR start "sql_select_where_kv_all"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:93:1: sql_select_where_kv_all : (
    // sql_select_where_kv | ( '\\(' sql_select_where_kv '\\)' ) );
    public final void sql_select_where_kv_all() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:94:2: (
            // sql_select_where_kv | ( '\\(' sql_select_where_kv '\\)' ) )
            int alt13 = 2;
            int LA13_0 = input.LA(1);
            if ((LA13_0 == BASIC_NAME)) {
                alt13 = 1;
            }
            else if ((LA13_0 == 72)) {
                alt13 = 2;
            }
            else {
                NoViableAltException nvae = new NoViableAltException("", 13, 0,
                        input);
                throw nvae;
            }
            switch (alt13) {
                case 1:
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:95:2:
                // sql_select_where_kv
                {
                    pushFollow(FOLLOW_sql_select_where_kv_in_sql_select_where_kv_all383);
                    sql_select_where_kv();
                    state._fsp--;
                }
                    break;
                case 2:
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:97:2: ( '\\('
                // sql_select_where_kv '\\)' )
                {
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:97:2: ( '\\('
                    // sql_select_where_kv '\\)' )
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:97:3: '\\('
                    // sql_select_where_kv '\\)'
                    {
                        match(input, 72,
                                FOLLOW_72_in_sql_select_where_kv_all390);
                        pushFollow(FOLLOW_sql_select_where_kv_in_sql_select_where_kv_all392);
                        sql_select_where_kv();
                        state._fsp--;
                        match(input, 73,
                                FOLLOW_73_in_sql_select_where_kv_all394);
                    }
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

    // $ANTLR end "sql_select_where_kv_all"
    // $ANTLR start "func"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:100:1: func : BASIC_NAME '\\(' (
    // BASIC_NAME | '*' ) '\\)' ;
    public final void func() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:101:2: ( BASIC_NAME '\\('
            // ( BASIC_NAME | '*' ) '\\)' )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:102:2: BASIC_NAME '\\(' (
            // BASIC_NAME | '*' ) '\\)'
            {
                match(input, BASIC_NAME, FOLLOW_BASIC_NAME_in_func407);
                match(input, 72, FOLLOW_72_in_func409);
                if (input.LA(1) == BASIC_NAME || input.LA(1) == 63) {
                    input.consume();
                    state.errorRecovery = false;
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    throw mse;
                }
                match(input, 73, FOLLOW_73_in_func417);
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

    // $ANTLR end "func"
    // $ANTLR start "func_and_alias"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:105:1: func_and_alias : func ( (
    // AS )? BASIC_NAME )? ;
    public final void func_and_alias() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:106:2: ( func ( ( AS )?
            // BASIC_NAME )? )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:107:2: func ( ( AS )?
            // BASIC_NAME )?
            {
                pushFollow(FOLLOW_func_in_func_and_alias431);
                func();
                state._fsp--;
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:107:7: ( ( AS )?
                // BASIC_NAME )?
                int alt15 = 2;
                int LA15_0 = input.LA(1);
                if ((LA15_0 == AS || LA15_0 == BASIC_NAME)) {
                    alt15 = 1;
                }
                switch (alt15) {
                    case 1:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:107:8: ( AS )?
                    // BASIC_NAME
                    {
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:107:8: ( AS
                        // )?
                        int alt14 = 2;
                        int LA14_0 = input.LA(1);
                        if ((LA14_0 == AS)) {
                            alt14 = 1;
                        }
                        switch (alt14) {
                            case 1:
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:107:8: AS
                            {
                                match(input, AS, FOLLOW_AS_in_func_and_alias434);
                            }
                                break;
                        }
                        match(input, BASIC_NAME,
                                FOLLOW_BASIC_NAME_in_func_and_alias437);
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

    // $ANTLR end "func_and_alias"
    // $ANTLR start "select_column_and_alias"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:110:1: select_column_and_alias :
    // column_name ( ( AS )? BASIC_NAME )? ;
    public final void select_column_and_alias() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:111:2: ( column_name ( (
            // AS )? BASIC_NAME )? )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:112:2: column_name ( ( AS
            // )? BASIC_NAME )?
            {
                pushFollow(FOLLOW_column_name_in_select_column_and_alias451);
                column_name();
                state._fsp--;
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:112:14: ( ( AS )?
                // BASIC_NAME )?
                int alt17 = 2;
                int LA17_0 = input.LA(1);
                if ((LA17_0 == AS || LA17_0 == BASIC_NAME)) {
                    alt17 = 1;
                }
                switch (alt17) {
                    case 1:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:112:15: ( AS )?
                    // BASIC_NAME
                    {
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:112:15: ( AS
                        // )?
                        int alt16 = 2;
                        int LA16_0 = input.LA(1);
                        if ((LA16_0 == AS)) {
                            alt16 = 1;
                        }
                        switch (alt16) {
                            case 1:
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:112:15:
                            // AS
                            {
                                match(input, AS,
                                        FOLLOW_AS_in_select_column_and_alias454);
                            }
                                break;
                        }
                        match(input, BASIC_NAME,
                                FOLLOW_BASIC_NAME_in_select_column_and_alias457);
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

    // $ANTLR end "select_column_and_alias"
    // $ANTLR start "select_column"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:115:1: select_column : (
    // select_column_and_alias | func_and_alias | '*' );
    public final void select_column() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:116:2: (
            // select_column_and_alias | func_and_alias | '*' )
            int alt18 = 3;
            int LA18_0 = input.LA(1);
            if ((LA18_0 == BASIC_NAME)) {
                int LA18_1 = input.LA(2);
                if ((LA18_1 == 72)) {
                    alt18 = 2;
                }
                else if ((LA18_1 == AS || LA18_1 == BASIC_NAME
                        || LA18_1 == FROM || (LA18_1 >= 64 && LA18_1 <= 65))) {
                    alt18 = 1;
                }
                else {
                    NoViableAltException nvae = new NoViableAltException("",
                            18, 1, input);
                    throw nvae;
                }
            }
            else if ((LA18_0 == 63)) {
                alt18 = 3;
            }
            else {
                NoViableAltException nvae = new NoViableAltException("", 18, 0,
                        input);
                throw nvae;
            }
            switch (alt18) {
                case 1:
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:117:2:
                // select_column_and_alias
                {
                    pushFollow(FOLLOW_select_column_and_alias_in_select_column471);
                    select_column_and_alias();
                    state._fsp--;
                }
                    break;
                case 2:
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:117:26:
                // func_and_alias
                {
                    pushFollow(FOLLOW_func_and_alias_in_select_column473);
                    func_and_alias();
                    state._fsp--;
                }
                    break;
                case 3:
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:117:41: '*'
                {
                    match(input, 63, FOLLOW_63_in_select_column475);
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

    // $ANTLR end "select_column"
    // $ANTLR start "select_columns"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:120:1: select_columns :
    // select_column ( ',' select_column )* ;
    public final void select_columns() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:121:2: ( select_column (
            // ',' select_column )* )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:122:2: select_column (
            // ',' select_column )*
            {
                pushFollow(FOLLOW_select_column_in_select_columns488);
                select_column();
                state._fsp--;
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:122:16: ( ','
                // select_column )*
                loop19: do {
                    int alt19 = 2;
                    int LA19_0 = input.LA(1);
                    if ((LA19_0 == 64)) {
                        alt19 = 1;
                    }
                    switch (alt19) {
                        case 1:
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:122:17: ','
                        // select_column
                        {
                            match(input, 64, FOLLOW_64_in_select_columns491);
                            pushFollow(FOLLOW_select_column_in_select_columns493);
                            select_column();
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "select_columns"
    // $ANTLR start "and_or"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:127:1: and_or : ( AND | OR );
    public final void and_or() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:127:8: ( AND | OR )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
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
            reportError(re);
            recover(input, re);
        }
        finally {
            // do for sure before leaving
        }
        return;
    }

    // $ANTLR end "and_or"
    // $ANTLR start "table"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:131:1: table : table_name ( ( AS
    // )? alias )? ;
    public final void table() throws RecognitionException {
        AntlrV3SQLParser.table_name_return table_name1 = null;
        AntlrV3SQLParser.alias_return alias2 = null;
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:131:7: ( table_name ( (
            // AS )? alias )? )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:132:2: table_name ( ( AS
            // )? alias )?
            {
                pushFollow(FOLLOW_table_name_in_table527);
                table_name1 = table_name();
                state._fsp--;
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:132:13: ( ( AS )?
                // alias )?
                int alt21 = 2;
                int LA21_0 = input.LA(1);
                if ((LA21_0 == AS || LA21_0 == BASIC_NAME)) {
                    alt21 = 1;
                }
                switch (alt21) {
                    case 1:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:132:14: ( AS )?
                    // alias
                    {
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:132:14: ( AS
                        // )?
                        int alt20 = 2;
                        int LA20_0 = input.LA(1);
                        if ((LA20_0 == AS)) {
                            alt20 = 1;
                        }
                        switch (alt20) {
                            case 1:
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:132:15:
                            // AS
                            {
                                match(input, AS, FOLLOW_AS_in_table531);
                            }
                                break;
                        }
                        pushFollow(FOLLOW_alias_in_table535);
                        alias2 = alias();
                        state._fsp--;
                    }
                        break;
                }
                if (this.antlrParserDelegate != null) {
                    this.antlrParserDelegate
                            .onFindTable(
                                    (table_name1 != null ? input
                                            .toString(table_name1.start,
                                                    table_name1.stop) : null),
                                    (alias2 != null ? input.toString(
                                            alias2.start, alias2.stop) : null));
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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:144:1: tables : ( table ( ','
    // table )* ) ;
    public final void tables() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:144:8: ( ( table ( ','
            // table )* ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:145:2: ( table ( ','
            // table )* )
            {
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:145:2: ( table ( ','
                // table )* )
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:145:3: table ( ','
                // table )*
                {
                    pushFollow(FOLLOW_table_in_tables551);
                    table();
                    state._fsp--;
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:145:9: ( ','
                    // table )*
                    loop22: do {
                        int alt22 = 2;
                        int LA22_0 = input.LA(1);
                        if ((LA22_0 == 64)) {
                            alt22 = 1;
                        }
                        switch (alt22) {
                            case 1:
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:145:10:
                            // ',' table
                            {
                                match(input, 64, FOLLOW_64_in_tables554);
                                pushFollow(FOLLOW_table_in_tables556);
                                table();
                                state._fsp--;
                            }
                                break;
                            default:
                                break loop22;
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
    public static class table_name_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "table_name"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:148:1: table_name : BASIC_NAME (
    // ( '.' ) BASIC_NAME )? ;
    public final AntlrV3SQLParser.table_name_return table_name()
            throws RecognitionException {
        AntlrV3SQLParser.table_name_return retval = new AntlrV3SQLParser.table_name_return();
        retval.start = input.LT(1);
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:149:2: ( BASIC_NAME ( (
            // '.' ) BASIC_NAME )? )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:150:2: BASIC_NAME ( ( '.'
            // ) BASIC_NAME )?
            {
                match(input, BASIC_NAME, FOLLOW_BASIC_NAME_in_table_name572);
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:150:13: ( ( '.' )
                // BASIC_NAME )?
                int alt23 = 2;
                int LA23_0 = input.LA(1);
                if ((LA23_0 == 65)) {
                    alt23 = 1;
                }
                switch (alt23) {
                    case 1:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:150:14: ( '.' )
                    // BASIC_NAME
                    {
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:150:14: ( '.'
                        // )
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:150:15: '.'
                        {
                            match(input, 65, FOLLOW_65_in_table_name576);
                        }
                        match(input, BASIC_NAME,
                                FOLLOW_BASIC_NAME_in_table_name579);
                    }
                        break;
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

    // $ANTLR end "table_name"
    public static class alias_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "alias"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:153:1: alias : BASIC_NAME ;
    public final AntlrV3SQLParser.alias_return alias()
            throws RecognitionException {
        AntlrV3SQLParser.alias_return retval = new AntlrV3SQLParser.alias_return();
        retval.start = input.LT(1);
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:153:7: ( BASIC_NAME )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:154:2: BASIC_NAME
            {
                match(input, BASIC_NAME, FOLLOW_BASIC_NAME_in_alias592);
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
    public static class column_name_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "column_name"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:157:1: column_name : BASIC_NAME (
    // ( '.' ) BASIC_NAME )? ;
    public final AntlrV3SQLParser.column_name_return column_name()
            throws RecognitionException {
        AntlrV3SQLParser.column_name_return retval = new AntlrV3SQLParser.column_name_return();
        retval.start = input.LT(1);
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:158:2: ( BASIC_NAME ( (
            // '.' ) BASIC_NAME )? )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:159:2: BASIC_NAME ( ( '.'
            // ) BASIC_NAME )?
            {
                match(input, BASIC_NAME, FOLLOW_BASIC_NAME_in_column_name604);
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:159:13: ( ( '.' )
                // BASIC_NAME )?
                int alt24 = 2;
                int LA24_0 = input.LA(1);
                if ((LA24_0 == 65)) {
                    alt24 = 1;
                }
                switch (alt24) {
                    case 1:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:159:14: ( '.' )
                    // BASIC_NAME
                    {
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:159:14: ( '.'
                        // )
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:159:15: '.'
                        {
                            match(input, 65, FOLLOW_65_in_column_name608);
                        }
                        match(input, BASIC_NAME,
                                FOLLOW_BASIC_NAME_in_column_name611);
                    }
                        break;
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

    // $ANTLR end "column_name"
    // $ANTLR start "insertColumn"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:162:1: insertColumn : column_name
    // ;
    public final void insertColumn() throws RecognitionException {
        AntlrV3SQLParser.column_name_return column_name3 = null;
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:163:2: ( column_name )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:164:2: column_name
            {
                pushFollow(FOLLOW_column_name_in_insertColumn625);
                column_name3 = column_name();
                state._fsp--;
                if (this.antlrParserDelegate != null) {
                    this.antlrParserDelegate.onFindColExper(
                            (column_name3 != null ? input.toString(
                                    column_name3.start, column_name3.stop)
                                    : null), "=");
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
    // $ANTLR start "kv"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:176:1: kv : ( ( column_name op (
    // PRE_SET | '\\(' PRE_SET '\\)' ) ) | ( column_name op ( TEXT_STRING |
    // '\\(' TEXT_STRING '\\)' ) ) | column_name op column_name | column_name op
    // func2 | ( column_name opbetween opand ) );
    public final void kv() throws RecognitionException {
        AntlrV3SQLParser.column_name_return column_name4 = null;
        AntlrV3SQLParser.op_return op5 = null;
        AntlrV3SQLParser.column_name_return column_name6 = null;
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:176:4: ( ( column_name op
            // ( PRE_SET | '\\(' PRE_SET '\\)' ) ) | ( column_name op (
            // TEXT_STRING | '\\(' TEXT_STRING '\\)' ) ) | column_name op
            // column_name | column_name op func2 | ( column_name opbetween
            // opand ) )
            int alt27 = 5;
            int LA27_0 = input.LA(1);
            if ((LA27_0 == BASIC_NAME)) {
                switch (input.LA(2)) {
                    case 65: {
                        int LA27_2 = input.LA(3);
                        if ((LA27_2 == BASIC_NAME)) {
                            int LA27_5 = input.LA(4);
                            if ((LA27_5 == EXISTS || LA27_5 == IN
                                    || LA27_5 == 62 || (LA27_5 >= 66 && LA27_5 <= 71))) {
                                switch (input.LA(5)) {
                                    case PRE_SET: {
                                        alt27 = 1;
                                    }
                                        break;
                                    case 72: {
                                        int LA27_7 = input.LA(6);
                                        if ((LA27_7 == PRE_SET)) {
                                            alt27 = 1;
                                        }
                                        else if ((LA27_7 == TEXT_STRING)) {
                                            alt27 = 2;
                                        }
                                        else {
                                            NoViableAltException nvae = new NoViableAltException(
                                                    "", 27, 7, input);
                                            throw nvae;
                                        }
                                    }
                                        break;
                                    case TEXT_STRING: {
                                        alt27 = 2;
                                    }
                                        break;
                                    case BASIC_NAME: {
                                        int LA27_9 = input.LA(6);
                                        if ((LA27_9 == 72)) {
                                            alt27 = 4;
                                        }
                                        else if ((LA27_9 == EOF
                                                || LA27_9 == AND
                                                || LA27_9 == GROUP
                                                || LA27_9 == HAVING
                                                || (LA27_9 >= OR && LA27_9 <= ORDER)
                                                || LA27_9 == WHERE
                                                || (LA27_9 >= 64 && LA27_9 <= 65) || LA27_9 == 73)) {
                                            alt27 = 3;
                                        }
                                        else {
                                            NoViableAltException nvae = new NoViableAltException(
                                                    "", 27, 9, input);
                                            throw nvae;
                                        }
                                    }
                                        break;
                                    default:
                                        NoViableAltException nvae = new NoViableAltException(
                                                "", 27, 3, input);
                                        throw nvae;
                                }
                            }
                            else if ((LA27_5 == BETWEEN)) {
                                alt27 = 5;
                            }
                            else {
                                NoViableAltException nvae = new NoViableAltException(
                                        "", 27, 5, input);
                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae = new NoViableAltException(
                                    "", 27, 2, input);
                            throw nvae;
                        }
                    }
                        break;
                    case EXISTS:
                    case IN:
                    case 62:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71: {
                        switch (input.LA(3)) {
                            case PRE_SET: {
                                alt27 = 1;
                            }
                                break;
                            case 72: {
                                int LA27_7 = input.LA(4);
                                if ((LA27_7 == PRE_SET)) {
                                    alt27 = 1;
                                }
                                else if ((LA27_7 == TEXT_STRING)) {
                                    alt27 = 2;
                                }
                                else {
                                    NoViableAltException nvae = new NoViableAltException(
                                            "", 27, 7, input);
                                    throw nvae;
                                }
                            }
                                break;
                            case TEXT_STRING: {
                                alt27 = 2;
                            }
                                break;
                            case BASIC_NAME: {
                                int LA27_9 = input.LA(4);
                                if ((LA27_9 == 72)) {
                                    alt27 = 4;
                                }
                                else if ((LA27_9 == EOF || LA27_9 == AND
                                        || LA27_9 == GROUP || LA27_9 == HAVING
                                        || (LA27_9 >= OR && LA27_9 <= ORDER)
                                        || LA27_9 == WHERE
                                        || (LA27_9 >= 64 && LA27_9 <= 65) || LA27_9 == 73)) {
                                    alt27 = 3;
                                }
                                else {
                                    NoViableAltException nvae = new NoViableAltException(
                                            "", 27, 9, input);
                                    throw nvae;
                                }
                            }
                                break;
                            default:
                                NoViableAltException nvae = new NoViableAltException(
                                        "", 27, 3, input);
                                throw nvae;
                        }
                    }
                        break;
                    case BETWEEN: {
                        alt27 = 5;
                    }
                        break;
                    default:
                        NoViableAltException nvae = new NoViableAltException(
                                "", 27, 1, input);
                        throw nvae;
                }
            }
            else {
                NoViableAltException nvae = new NoViableAltException("", 27, 0,
                        input);
                throw nvae;
            }
            switch (alt27) {
                case 1:
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:177:2: ( column_name
                // op ( PRE_SET | '\\(' PRE_SET '\\)' ) )
                {
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:177:2: (
                    // column_name op ( PRE_SET | '\\(' PRE_SET '\\)' ) )
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:177:3:
                    // column_name op ( PRE_SET | '\\(' PRE_SET '\\)' )
                    {
                        pushFollow(FOLLOW_column_name_in_kv640);
                        column_name4 = column_name();
                        state._fsp--;
                        pushFollow(FOLLOW_op_in_kv642);
                        op5 = op();
                        state._fsp--;
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:177:18: (
                        // PRE_SET | '\\(' PRE_SET '\\)' )
                        int alt25 = 2;
                        int LA25_0 = input.LA(1);
                        if ((LA25_0 == PRE_SET)) {
                            alt25 = 1;
                        }
                        else if ((LA25_0 == 72)) {
                            alt25 = 2;
                        }
                        else {
                            NoViableAltException nvae = new NoViableAltException(
                                    "", 25, 0, input);
                            throw nvae;
                        }
                        switch (alt25) {
                            case 1:
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:177:19:
                            // PRE_SET
                            {
                                match(input, PRE_SET, FOLLOW_PRE_SET_in_kv645);
                            }
                                break;
                            case 2:
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:177:27:
                            // '\\(' PRE_SET '\\)'
                            {
                                match(input, 72, FOLLOW_72_in_kv647);
                                match(input, PRE_SET, FOLLOW_PRE_SET_in_kv649);
                                match(input, 73, FOLLOW_73_in_kv651);
                            }
                                break;
                        }
                    }
                    if (this.antlrParserDelegate != null) {
                        this.antlrParserDelegate.onFindColExper(
                                (column_name4 != null ? input.toString(
                                        column_name4.start, column_name4.stop)
                                        : null),
                                (op5 != null ? input.toString(op5.start,
                                        op5.stop) : null));
                    }
                }
                    break;
                case 2:
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:187:2: ( column_name
                // op ( TEXT_STRING | '\\(' TEXT_STRING '\\)' ) )
                {
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:187:2: (
                    // column_name op ( TEXT_STRING | '\\(' TEXT_STRING '\\)' )
                    // )
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:187:3:
                    // column_name op ( TEXT_STRING | '\\(' TEXT_STRING '\\)' )
                    {
                        pushFollow(FOLLOW_column_name_in_kv663);
                        column_name();
                        state._fsp--;
                        pushFollow(FOLLOW_op_in_kv665);
                        op();
                        state._fsp--;
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:187:18: (
                        // TEXT_STRING | '\\(' TEXT_STRING '\\)' )
                        int alt26 = 2;
                        int LA26_0 = input.LA(1);
                        if ((LA26_0 == TEXT_STRING)) {
                            alt26 = 1;
                        }
                        else if ((LA26_0 == 72)) {
                            alt26 = 2;
                        }
                        else {
                            NoViableAltException nvae = new NoViableAltException(
                                    "", 26, 0, input);
                            throw nvae;
                        }
                        switch (alt26) {
                            case 1:
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:187:19:
                            // TEXT_STRING
                            {
                                match(input, TEXT_STRING,
                                        FOLLOW_TEXT_STRING_in_kv668);
                            }
                                break;
                            case 2:
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:187:31:
                            // '\\(' TEXT_STRING '\\)'
                            {
                                match(input, 72, FOLLOW_72_in_kv670);
                                match(input, TEXT_STRING,
                                        FOLLOW_TEXT_STRING_in_kv672);
                                match(input, 73, FOLLOW_73_in_kv674);
                            }
                                break;
                        }
                    }
                }
                    break;
                case 3:
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:189:2: column_name op
                // column_name
                {
                    pushFollow(FOLLOW_column_name_in_kv682);
                    column_name();
                    state._fsp--;
                    pushFollow(FOLLOW_op_in_kv684);
                    op();
                    state._fsp--;
                    pushFollow(FOLLOW_column_name_in_kv686);
                    column_name();
                    state._fsp--;
                }
                    break;
                case 4:
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:191:2: column_name op
                // func2
                {
                    pushFollow(FOLLOW_column_name_in_kv692);
                    column_name();
                    state._fsp--;
                    pushFollow(FOLLOW_op_in_kv694);
                    op();
                    state._fsp--;
                    pushFollow(FOLLOW_func2_in_kv696);
                    func2();
                    state._fsp--;
                }
                    break;
                case 5:
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:193:2: ( column_name
                // opbetween opand )
                {
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:193:2: (
                    // column_name opbetween opand )
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:194:2:
                    // column_name opbetween opand
                    {
                        pushFollow(FOLLOW_column_name_in_kv705);
                        column_name6 = column_name();
                        state._fsp--;
                        pushFollow(FOLLOW_opbetween_in_kv707);
                        opbetween();
                        state._fsp--;
                        pushFollow(FOLLOW_opand_in_kv709);
                        opand();
                        state._fsp--;
                        String s = (column_name6 != null ? input.toString(
                                column_name6.start, column_name6.stop) : null);
                        if (antlrParserDelegate != null) {
                            antlrParserDelegate.onFindColExper(s, ">=");
                            antlrParserDelegate.onFindColExper(s, "<=");
                        }
                    }
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

    // $ANTLR end "kv"
    // $ANTLR start "func2"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:203:1: func2 : BASIC_NAME '\\(' (
    // ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING ) )* )?
    // '\\)' ;
    public final void func2() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:203:7: ( BASIC_NAME '\\('
            // ( ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING
            // ) )* )? '\\)' )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:204:2: BASIC_NAME '\\(' (
            // ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING )
            // )* )? '\\)'
            {
                match(input, BASIC_NAME, FOLLOW_BASIC_NAME_in_func2726);
                match(input, 72, FOLLOW_72_in_func2730);
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:206:2: ( (
                // column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING
                // ) )* )?
                int alt31 = 2;
                int LA31_0 = input.LA(1);
                if ((LA31_0 == BASIC_NAME || LA31_0 == TEXT_STRING)) {
                    alt31 = 1;
                }
                switch (alt31) {
                    case 1:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:207:2: (
                    // column_name | TEXT_STRING ) ( ',' ( column_name |
                    // TEXT_STRING ) )*
                    {
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:207:2: (
                        // column_name | TEXT_STRING )
                        int alt28 = 2;
                        int LA28_0 = input.LA(1);
                        if ((LA28_0 == BASIC_NAME)) {
                            alt28 = 1;
                        }
                        else if ((LA28_0 == TEXT_STRING)) {
                            alt28 = 2;
                        }
                        else {
                            NoViableAltException nvae = new NoViableAltException(
                                    "", 28, 0, input);
                            throw nvae;
                        }
                        switch (alt28) {
                            case 1:
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:207:3:
                            // column_name
                            {
                                pushFollow(FOLLOW_column_name_in_func2738);
                                column_name();
                                state._fsp--;
                            }
                                break;
                            case 2:
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:207:15:
                            // TEXT_STRING
                            {
                                match(input, TEXT_STRING,
                                        FOLLOW_TEXT_STRING_in_func2740);
                            }
                                break;
                        }
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:207:28: ( ','
                        // ( column_name | TEXT_STRING ) )*
                        loop30: do {
                            int alt30 = 2;
                            int LA30_0 = input.LA(1);
                            if ((LA30_0 == 64)) {
                                alt30 = 1;
                            }
                            switch (alt30) {
                                case 1:
                                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:207:29:
                                // ',' ( column_name | TEXT_STRING )
                                {
                                    match(input, 64, FOLLOW_64_in_func2744);
                                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:207:33:
                                    // ( column_name | TEXT_STRING )
                                    int alt29 = 2;
                                    int LA29_0 = input.LA(1);
                                    if ((LA29_0 == BASIC_NAME)) {
                                        alt29 = 1;
                                    }
                                    else if ((LA29_0 == TEXT_STRING)) {
                                        alt29 = 2;
                                    }
                                    else {
                                        NoViableAltException nvae = new NoViableAltException(
                                                "", 29, 0, input);
                                        throw nvae;
                                    }
                                    switch (alt29) {
                                        case 1:
                                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:207:34:
                                        // column_name
                                        {
                                            pushFollow(FOLLOW_column_name_in_func2747);
                                            column_name();
                                            state._fsp--;
                                        }
                                            break;
                                        case 2:
                                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:207:46:
                                        // TEXT_STRING
                                        {
                                            match(input, TEXT_STRING,
                                                    FOLLOW_TEXT_STRING_in_func2749);
                                        }
                                            break;
                                    }
                                }
                                    break;
                                default:
                                    break loop30;
                            }
                        }
                        while (true);
                    }
                        break;
                }
                match(input, 73, FOLLOW_73_in_func2759);
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

    // $ANTLR end "func2"
    public static class op_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "op"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:212:1: op : ( '=' | '>' | '>=' |
    // '<' | '<=' | '!=' | '<>' | IN | EXISTS ) ;
    public final AntlrV3SQLParser.op_return op() throws RecognitionException {
        AntlrV3SQLParser.op_return retval = new AntlrV3SQLParser.op_return();
        retval.start = input.LT(1);
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:213:2: ( ( '=' | '>' |
            // '>=' | '<' | '<=' | '!=' | '<>' | IN | EXISTS ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
                if (input.LA(1) == EXISTS || input.LA(1) == IN
                        || input.LA(1) == 62
                        || (input.LA(1) >= 66 && input.LA(1) <= 71)) {
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
    // $ANTLR start "opbetween"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:217:1: opbetween : BETWEEN ;
    public final void opbetween() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:218:2: ( BETWEEN )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:218:3: BETWEEN
            {
                match(input, BETWEEN, FOLLOW_BETWEEN_in_opbetween800);
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

    // $ANTLR end "opbetween"
    // $ANTLR start "opand"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:220:1: opand : ( PRE_SET | '\\('
    // PRE_SET '\\)' ) AND ( PRE_SET | '\\(' PRE_SET '\\)' ) ;
    public final void opand() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:220:7: ( ( PRE_SET |
            // '\\(' PRE_SET '\\)' ) AND ( PRE_SET | '\\(' PRE_SET '\\)' ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:221:2: ( PRE_SET | '\\('
            // PRE_SET '\\)' ) AND ( PRE_SET | '\\(' PRE_SET '\\)' )
            {
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:221:2: ( PRE_SET |
                // '\\(' PRE_SET '\\)' )
                int alt32 = 2;
                int LA32_0 = input.LA(1);
                if ((LA32_0 == PRE_SET)) {
                    alt32 = 1;
                }
                else if ((LA32_0 == 72)) {
                    alt32 = 2;
                }
                else {
                    NoViableAltException nvae = new NoViableAltException("",
                            32, 0, input);
                    throw nvae;
                }
                switch (alt32) {
                    case 1:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:221:3: PRE_SET
                    {
                        match(input, PRE_SET, FOLLOW_PRE_SET_in_opand810);
                    }
                        break;
                    case 2:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:221:11: '\\('
                    // PRE_SET '\\)'
                    {
                        match(input, 72, FOLLOW_72_in_opand812);
                        match(input, PRE_SET, FOLLOW_PRE_SET_in_opand814);
                        match(input, 73, FOLLOW_73_in_opand816);
                    }
                        break;
                }
                match(input, AND, FOLLOW_AND_in_opand819);
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:221:34: ( PRE_SET |
                // '\\(' PRE_SET '\\)' )
                int alt33 = 2;
                int LA33_0 = input.LA(1);
                if ((LA33_0 == PRE_SET)) {
                    alt33 = 1;
                }
                else if ((LA33_0 == 72)) {
                    alt33 = 2;
                }
                else {
                    NoViableAltException nvae = new NoViableAltException("",
                            33, 0, input);
                    throw nvae;
                }
                switch (alt33) {
                    case 1:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:221:35: PRE_SET
                    {
                        match(input, PRE_SET, FOLLOW_PRE_SET_in_opand822);
                    }
                        break;
                    case 2:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:221:43: '\\('
                    // PRE_SET '\\)'
                    {
                        match(input, 72, FOLLOW_72_in_opand824);
                        match(input, PRE_SET, FOLLOW_PRE_SET_in_opand826);
                        match(input, 73, FOLLOW_73_in_opand828);
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

    // $ANTLR end "opand"
    // $ANTLR start "orderby"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:224:1: orderby : ORDER BY
    // column_name ( DESC | ASC )? ( ',' column_name ( DESC | ASC )? )* ;
    public final void orderby() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:224:9: ( ORDER BY
            // column_name ( DESC | ASC )? ( ',' column_name ( DESC | ASC )? )*
            // )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:225:2: ORDER BY
            // column_name ( DESC | ASC )? ( ',' column_name ( DESC | ASC )? )*
            {
                match(input, ORDER, FOLLOW_ORDER_in_orderby840);
                match(input, BY, FOLLOW_BY_in_orderby842);
                pushFollow(FOLLOW_column_name_in_orderby844);
                column_name();
                state._fsp--;
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:225:23: ( DESC | ASC
                // )?
                int alt34 = 2;
                int LA34_0 = input.LA(1);
                if ((LA34_0 == ASC || LA34_0 == DESC)) {
                    alt34 = 1;
                }
                switch (alt34) {
                    case 1:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
                    {
                        if (input.LA(1) == ASC || input.LA(1) == DESC) {
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
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:225:35: ( ','
                // column_name ( DESC | ASC )? )*
                loop36: do {
                    int alt36 = 2;
                    int LA36_0 = input.LA(1);
                    if ((LA36_0 == 64)) {
                        alt36 = 1;
                    }
                    switch (alt36) {
                        case 1:
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:225:36: ','
                        // column_name ( DESC | ASC )?
                        {
                            match(input, 64, FOLLOW_64_in_orderby854);
                            pushFollow(FOLLOW_column_name_in_orderby856);
                            column_name();
                            state._fsp--;
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:225:52: (
                            // DESC | ASC )?
                            int alt35 = 2;
                            int LA35_0 = input.LA(1);
                            if ((LA35_0 == ASC || LA35_0 == DESC)) {
                                alt35 = 1;
                            }
                            switch (alt35) {
                                case 1:
                                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
                                {
                                    if (input.LA(1) == ASC
                                            || input.LA(1) == DESC) {
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
                        }
                            break;
                        default:
                            break loop36;
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

    // $ANTLR end "orderby"
    // $ANTLR start "groupby"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:228:1: groupby : GROUP BY
    // column_name ( ',' column_name )* ;
    public final void groupby() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:228:9: ( GROUP BY
            // column_name ( ',' column_name )* )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:229:2: GROUP BY
            // column_name ( ',' column_name )*
            {
                match(input, GROUP, FOLLOW_GROUP_in_groupby877);
                match(input, BY, FOLLOW_BY_in_groupby879);
                pushFollow(FOLLOW_column_name_in_groupby881);
                column_name();
                state._fsp--;
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:229:23: ( ','
                // column_name )*
                loop37: do {
                    int alt37 = 2;
                    int LA37_0 = input.LA(1);
                    if ((LA37_0 == 64)) {
                        alt37 = 1;
                    }
                    switch (alt37) {
                        case 1:
                        // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:229:24: ','
                        // column_name
                        {
                            match(input, 64, FOLLOW_64_in_groupby884);
                            pushFollow(FOLLOW_column_name_in_groupby886);
                            column_name();
                            state._fsp--;
                        }
                            break;
                        default:
                            break loop37;
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

    // $ANTLR end "groupby"
    // $ANTLR start "having"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:232:1: having : HAVING (
    // column_name | func ) op ( column_name | func | TEXT_STRING | PRE_SET ) ;
    public final void having() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:232:8: ( HAVING (
            // column_name | func ) op ( column_name | func | TEXT_STRING |
            // PRE_SET ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:233:2: HAVING (
            // column_name | func ) op ( column_name | func | TEXT_STRING |
            // PRE_SET )
            {
                match(input, HAVING, FOLLOW_HAVING_in_having899);
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:233:9: ( column_name
                // | func )
                int alt38 = 2;
                int LA38_0 = input.LA(1);
                if ((LA38_0 == BASIC_NAME)) {
                    int LA38_1 = input.LA(2);
                    if ((LA38_1 == 72)) {
                        alt38 = 2;
                    }
                    else if ((LA38_1 == EXISTS || LA38_1 == IN || LA38_1 == 62 || (LA38_1 >= 65 && LA38_1 <= 71))) {
                        alt38 = 1;
                    }
                    else {
                        NoViableAltException nvae = new NoViableAltException(
                                "", 38, 1, input);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae = new NoViableAltException("",
                            38, 0, input);
                    throw nvae;
                }
                switch (alt38) {
                    case 1:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:233:10:
                    // column_name
                    {
                        pushFollow(FOLLOW_column_name_in_having902);
                        column_name();
                        state._fsp--;
                    }
                        break;
                    case 2:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:233:22: func
                    {
                        pushFollow(FOLLOW_func_in_having904);
                        func();
                        state._fsp--;
                    }
                        break;
                }
                pushFollow(FOLLOW_op_in_having907);
                op();
                state._fsp--;
                // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:233:31: ( column_name
                // | func | TEXT_STRING | PRE_SET )
                int alt39 = 4;
                switch (input.LA(1)) {
                    case BASIC_NAME: {
                        int LA39_1 = input.LA(2);
                        if ((LA39_1 == 72)) {
                            alt39 = 2;
                        }
                        else if ((LA39_1 == EOF || LA39_1 == GROUP
                                || LA39_1 == HAVING || LA39_1 == ORDER
                                || LA39_1 == 65 || LA39_1 == 73)) {
                            alt39 = 1;
                        }
                        else {
                            NoViableAltException nvae = new NoViableAltException(
                                    "", 39, 1, input);
                            throw nvae;
                        }
                    }
                        break;
                    case TEXT_STRING: {
                        alt39 = 3;
                    }
                        break;
                    case PRE_SET: {
                        alt39 = 4;
                    }
                        break;
                    default:
                        NoViableAltException nvae = new NoViableAltException(
                                "", 39, 0, input);
                        throw nvae;
                }
                switch (alt39) {
                    case 1:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:233:32:
                    // column_name
                    {
                        pushFollow(FOLLOW_column_name_in_having910);
                        column_name();
                        state._fsp--;
                    }
                        break;
                    case 2:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:233:44: func
                    {
                        pushFollow(FOLLOW_func_in_having912);
                        func();
                        state._fsp--;
                    }
                        break;
                    case 3:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:233:49:
                    // TEXT_STRING
                    {
                        match(input, TEXT_STRING,
                                FOLLOW_TEXT_STRING_in_having914);
                    }
                        break;
                    case 4:
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:233:61: PRE_SET
                    {
                        match(input, PRE_SET, FOLLOW_PRE_SET_in_having916);
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

    // $ANTLR end "having"
    // Delegated rules
    public static final BitSet FOLLOW_sql_insert_in_start18 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_sql_delete_in_start20 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_sql_update_in_start22 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_sql_select_in_start24 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_INSERT_in_sql_insert35 = new BitSet(
            new long[] { 0x0000000040000000L });

    public static final BitSet FOLLOW_INTO_in_sql_insert37 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_table_in_sql_insert39 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000100L });

    public static final BitSet FOLLOW_72_in_sql_insert41 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_insertColumn_in_sql_insert43 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000201L });

    public static final BitSet FOLLOW_64_in_sql_insert46 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_insertColumn_in_sql_insert48 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000201L });

    public static final BitSet FOLLOW_73_in_sql_insert52 = new BitSet(
            new long[] { 0x0080000000000000L });

    public static final BitSet FOLLOW_VALUES_in_sql_insert54 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000100L });

    public static final BitSet FOLLOW_72_in_sql_insert56 = new BitSet(
            new long[] { 0x0000080000000000L, 0x0000000000000201L });

    public static final BitSet FOLLOW_PRE_SET_in_sql_insert59 = new BitSet(
            new long[] { 0x0000080000000000L, 0x0000000000000201L });

    public static final BitSet FOLLOW_64_in_sql_insert62 = new BitSet(
            new long[] { 0x0000080000000000L });

    public static final BitSet FOLLOW_PRE_SET_in_sql_insert64 = new BitSet(
            new long[] { 0x0000080000000000L, 0x0000000000000201L });

    public static final BitSet FOLLOW_73_in_sql_insert69 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_DELETE_in_sql_delete86 = new BitSet(
            new long[] { 0x0000000000100000L });

    public static final BitSet FOLLOW_FROM_in_sql_delete88 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_table_in_sql_delete90 = new BitSet(
            new long[] { 0x0200000000000000L });

    public static final BitSet FOLLOW_where_in_sql_delete92 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_UPDATE_in_sql_update109 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_table_in_sql_update111 = new BitSet(
            new long[] { 0x0002000000000000L });

    public static final BitSet FOLLOW_SET_in_sql_update113 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_kv_in_sql_update115 = new BitSet(
            new long[] { 0x0200000000000000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_64_in_sql_update118 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_kv_in_sql_update120 = new BitSet(
            new long[] { 0x0200000000000000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_where_in_sql_update124 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_SELECT_in_sql_select141 = new BitSet(
            new long[] { 0x8000000000000200L });

    public static final BitSet FOLLOW_func2_in_sql_select149 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_select_columns_in_sql_select157 = new BitSet(
            new long[] { 0x0000000000100000L });

    public static final BitSet FOLLOW_FROM_in_sql_select159 = new BitSet(
            new long[] { 0x0000000000000200L, 0x0000000000000100L });

    public static final BitSet FOLLOW_sql_select_tables_in_sql_select173 = new BitSet(
            new long[] { 0x0200020002800000L });

    public static final BitSet FOLLOW_where_in_sql_select175 = new BitSet(
            new long[] { 0x0000020002800002L });

    public static final BitSet FOLLOW_orderby_in_sql_select178 = new BitSet(
            new long[] { 0x0000020002800002L });

    public static final BitSet FOLLOW_groupby_in_sql_select180 = new BitSet(
            new long[] { 0x0000020002800002L });

    public static final BitSet FOLLOW_having_in_sql_select182 = new BitSet(
            new long[] { 0x0000020002800002L });

    public static final BitSet FOLLOW_72_in_sql_select194 = new BitSet(
            new long[] { 0x0001000000000000L });

    public static final BitSet FOLLOW_sql_select_in_sql_select196 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000200L });

    public static final BitSet FOLLOW_73_in_sql_select198 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_tables_in_sql_select_tables222 = new BitSet(
            new long[] { 0x0000400810202002L });

    public static final BitSet FOLLOW_set_in_sql_select_tables227 = new BitSet(
            new long[] { 0x0000000100000000L });

    public static final BitSet FOLLOW_JOIN_in_sql_select_tables239 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_table_in_sql_select_tables241 = new BitSet(
            new long[] { 0x0000408810202002L });

    public static final BitSet FOLLOW_ON_in_sql_select_tables244 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_column_name_in_sql_select_tables246 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000020L });

    public static final BitSet FOLLOW_69_in_sql_select_tables248 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_column_name_in_sql_select_tables250 = new BitSet(
            new long[] { 0x0000400810202002L });

    public static final BitSet FOLLOW_WHERE_in_where268 = new BitSet(
            new long[] { 0x0000000000000200L, 0x0000000000000100L });

    public static final BitSet FOLLOW_sql_select_where_kv_all_in_where270 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_kv_in_sql_select_where_kv285 = new BitSet(
            new long[] { 0x0000010000000022L });

    public static final BitSet FOLLOW_and_or_in_sql_select_where_kv291 = new BitSet(
            new long[] { 0x0000000000000200L, 0x0000000000000100L });

    public static final BitSet FOLLOW_kv_in_sql_select_where_kv300 = new BitSet(
            new long[] { 0x0000010000000022L });

    public static final BitSet FOLLOW_72_in_sql_select_where_kv309 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_kv_in_sql_select_where_kv311 = new BitSet(
            new long[] { 0x0000010000000020L });

    public static final BitSet FOLLOW_and_or_in_sql_select_where_kv314 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_sql_select_where_kv_in_sql_select_where_kv316 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000200L });

    public static final BitSet FOLLOW_73_in_sql_select_where_kv319 = new BitSet(
            new long[] { 0x0000010000000022L });

    public static final BitSet FOLLOW_column_name_in_sql_select_where_kv330 = new BitSet(
            new long[] { 0x4000000008040000L, 0x00000000000000FCL });

    public static final BitSet FOLLOW_op_in_sql_select_where_kv332 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000100L });

    public static final BitSet FOLLOW_72_in_sql_select_where_kv334 = new BitSet(
            new long[] { 0x0001000000000000L });

    public static final BitSet FOLLOW_sql_select_in_sql_select_where_kv336 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000200L });

    public static final BitSet FOLLOW_73_in_sql_select_where_kv338 = new BitSet(
            new long[] { 0x0000010000000022L });

    public static final BitSet FOLLOW_72_in_sql_select_where_kv349 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_column_name_in_sql_select_where_kv351 = new BitSet(
            new long[] { 0x4000000008040000L, 0x00000000000000FCL });

    public static final BitSet FOLLOW_op_in_sql_select_where_kv353 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000100L });

    public static final BitSet FOLLOW_72_in_sql_select_where_kv355 = new BitSet(
            new long[] { 0x0001000000000000L });

    public static final BitSet FOLLOW_sql_select_in_sql_select_where_kv357 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000200L });

    public static final BitSet FOLLOW_73_in_sql_select_where_kv359 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000200L });

    public static final BitSet FOLLOW_73_in_sql_select_where_kv361 = new BitSet(
            new long[] { 0x0000010000000022L });

    public static final BitSet FOLLOW_sql_select_where_kv_in_sql_select_where_kv_all383 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_72_in_sql_select_where_kv_all390 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_sql_select_where_kv_in_sql_select_where_kv_all392 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000200L });

    public static final BitSet FOLLOW_73_in_sql_select_where_kv_all394 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_BASIC_NAME_in_func407 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000100L });

    public static final BitSet FOLLOW_72_in_func409 = new BitSet(
            new long[] { 0x8000000000000200L });

    public static final BitSet FOLLOW_set_in_func411 = new BitSet(new long[] {
            0x0000000000000000L, 0x0000000000000200L });

    public static final BitSet FOLLOW_73_in_func417 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_func_in_func_and_alias431 = new BitSet(
            new long[] { 0x0000000000000242L });

    public static final BitSet FOLLOW_AS_in_func_and_alias434 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_BASIC_NAME_in_func_and_alias437 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_column_name_in_select_column_and_alias451 = new BitSet(
            new long[] { 0x0000000000000242L });

    public static final BitSet FOLLOW_AS_in_select_column_and_alias454 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_BASIC_NAME_in_select_column_and_alias457 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_select_column_and_alias_in_select_column471 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_func_and_alias_in_select_column473 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_63_in_select_column475 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_select_column_in_select_columns488 = new BitSet(
            new long[] { 0x0000000000000002L, 0x0000000000000001L });

    public static final BitSet FOLLOW_64_in_select_columns491 = new BitSet(
            new long[] { 0x8000000000000200L });

    public static final BitSet FOLLOW_select_column_in_select_columns493 = new BitSet(
            new long[] { 0x0000000000000002L, 0x0000000000000001L });

    public static final BitSet FOLLOW_table_name_in_table527 = new BitSet(
            new long[] { 0x0000000000000242L });

    public static final BitSet FOLLOW_AS_in_table531 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_alias_in_table535 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_table_in_tables551 = new BitSet(
            new long[] { 0x0000000000000002L, 0x0000000000000001L });

    public static final BitSet FOLLOW_64_in_tables554 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_table_in_tables556 = new BitSet(
            new long[] { 0x0000000000000002L, 0x0000000000000001L });

    public static final BitSet FOLLOW_BASIC_NAME_in_table_name572 = new BitSet(
            new long[] { 0x0000000000000002L, 0x0000000000000002L });

    public static final BitSet FOLLOW_65_in_table_name576 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_BASIC_NAME_in_table_name579 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_BASIC_NAME_in_alias592 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_BASIC_NAME_in_column_name604 = new BitSet(
            new long[] { 0x0000000000000002L, 0x0000000000000002L });

    public static final BitSet FOLLOW_65_in_column_name608 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_BASIC_NAME_in_column_name611 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_column_name_in_insertColumn625 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_column_name_in_kv640 = new BitSet(
            new long[] { 0x4000000008040000L, 0x00000000000000FCL });

    public static final BitSet FOLLOW_op_in_kv642 = new BitSet(new long[] {
            0x0000080000000000L, 0x0000000000000100L });

    public static final BitSet FOLLOW_PRE_SET_in_kv645 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_72_in_kv647 = new BitSet(
            new long[] { 0x0000080000000000L });

    public static final BitSet FOLLOW_PRE_SET_in_kv649 = new BitSet(new long[] {
            0x0000000000000000L, 0x0000000000000200L });

    public static final BitSet FOLLOW_73_in_kv651 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_column_name_in_kv663 = new BitSet(
            new long[] { 0x4000000008040000L, 0x00000000000000FCL });

    public static final BitSet FOLLOW_op_in_kv665 = new BitSet(new long[] {
            0x0008000000000000L, 0x0000000000000100L });

    public static final BitSet FOLLOW_TEXT_STRING_in_kv668 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_72_in_kv670 = new BitSet(
            new long[] { 0x0008000000000000L });

    public static final BitSet FOLLOW_TEXT_STRING_in_kv672 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000200L });

    public static final BitSet FOLLOW_73_in_kv674 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_column_name_in_kv682 = new BitSet(
            new long[] { 0x4000000008040000L, 0x00000000000000FCL });

    public static final BitSet FOLLOW_op_in_kv684 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_column_name_in_kv686 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_column_name_in_kv692 = new BitSet(
            new long[] { 0x4000000008040000L, 0x00000000000000FCL });

    public static final BitSet FOLLOW_op_in_kv694 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_func2_in_kv696 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_column_name_in_kv705 = new BitSet(
            new long[] { 0x0000000000000400L });

    public static final BitSet FOLLOW_opbetween_in_kv707 = new BitSet(
            new long[] { 0x0000080000000000L, 0x0000000000000100L });

    public static final BitSet FOLLOW_opand_in_kv709 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_BASIC_NAME_in_func2726 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000100L });

    public static final BitSet FOLLOW_72_in_func2730 = new BitSet(new long[] {
            0x0008000000000200L, 0x0000000000000200L });

    public static final BitSet FOLLOW_column_name_in_func2738 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000201L });

    public static final BitSet FOLLOW_TEXT_STRING_in_func2740 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000201L });

    public static final BitSet FOLLOW_64_in_func2744 = new BitSet(
            new long[] { 0x0008000000000200L });

    public static final BitSet FOLLOW_column_name_in_func2747 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000201L });

    public static final BitSet FOLLOW_TEXT_STRING_in_func2749 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000201L });

    public static final BitSet FOLLOW_73_in_func2759 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_BETWEEN_in_opbetween800 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_PRE_SET_in_opand810 = new BitSet(
            new long[] { 0x0000000000000020L });

    public static final BitSet FOLLOW_72_in_opand812 = new BitSet(
            new long[] { 0x0000080000000000L });

    public static final BitSet FOLLOW_PRE_SET_in_opand814 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000200L });

    public static final BitSet FOLLOW_73_in_opand816 = new BitSet(
            new long[] { 0x0000000000000020L });

    public static final BitSet FOLLOW_AND_in_opand819 = new BitSet(new long[] {
            0x0000080000000000L, 0x0000000000000100L });

    public static final BitSet FOLLOW_PRE_SET_in_opand822 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_72_in_opand824 = new BitSet(
            new long[] { 0x0000080000000000L });

    public static final BitSet FOLLOW_PRE_SET_in_opand826 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000200L });

    public static final BitSet FOLLOW_73_in_opand828 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_ORDER_in_orderby840 = new BitSet(
            new long[] { 0x0000000000000800L });

    public static final BitSet FOLLOW_BY_in_orderby842 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_column_name_in_orderby844 = new BitSet(
            new long[] { 0x0000000000010082L, 0x0000000000000001L });

    public static final BitSet FOLLOW_64_in_orderby854 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_column_name_in_orderby856 = new BitSet(
            new long[] { 0x0000000000010082L, 0x0000000000000001L });

    public static final BitSet FOLLOW_GROUP_in_groupby877 = new BitSet(
            new long[] { 0x0000000000000800L });

    public static final BitSet FOLLOW_BY_in_groupby879 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_column_name_in_groupby881 = new BitSet(
            new long[] { 0x0000000000000002L, 0x0000000000000001L });

    public static final BitSet FOLLOW_64_in_groupby884 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_column_name_in_groupby886 = new BitSet(
            new long[] { 0x0000000000000002L, 0x0000000000000001L });

    public static final BitSet FOLLOW_HAVING_in_having899 = new BitSet(
            new long[] { 0x0000000000000200L });

    public static final BitSet FOLLOW_column_name_in_having902 = new BitSet(
            new long[] { 0x4000000008040000L, 0x00000000000000FCL });

    public static final BitSet FOLLOW_func_in_having904 = new BitSet(
            new long[] { 0x4000000008040000L, 0x00000000000000FCL });

    public static final BitSet FOLLOW_op_in_having907 = new BitSet(
            new long[] { 0x0008080000000200L });

    public static final BitSet FOLLOW_column_name_in_having910 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_func_in_having912 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_TEXT_STRING_in_having914 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_PRE_SET_in_having916 = new BitSet(
            new long[] { 0x0000000000000002L });
}