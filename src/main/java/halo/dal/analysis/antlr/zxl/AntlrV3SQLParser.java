package halo.dal.analysis.antlr.zxl;// $ANTLR 3.4 AntlrV3SQL.g 2015-10-22 18:48:42

import java.util.List;
import java.util.ArrayList;


import halo.dal.analysis.antlr.AntlrParserDelegate;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AntlrV3SQLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AND", "AS", "ASC", "B", "BASIC_NAME", "BETWEEN", "BY", "C", "CROSS", "D", "DELETE", "DESC", "E", "EXISTS", "F", "FROM", "FULL", "G", "GROUP", "H", "HAVING", "I", "IN", "INNER", "INSERT", "INTO", "J", "JOIN", "K", "L", "LEFT", "M", "N", "O", "ON", "OR", "ORDER", "OVER", "P", "PRE_SET", "Q", "R", "RIGHT", "ROWNUMBER", "S", "SELECT", "SET", "T", "TEXT_STRING", "U", "UPDATE", "V", "VALUES", "W", "WHERE", "WS", "X", "Y", "Z", "'!='", "'*'", "','", "'.'", "'<'", "'<='", "'<>'", "'='", "'>'", "'>='", "'\\('", "'\\)'"
    };

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

    public String[] getTokenNames() { return AntlrV3SQLParser.tokenNames; }
    public String getGrammarFileName() { return "AntlrV3SQL.g"; }


        private AntlrParserDelegate antlrParserDelegate;

        public void setAntlrParserDelegate(AntlrParserDelegate antlrParserDelegate) {
            this.antlrParserDelegate = antlrParserDelegate;
        }

    @Override
        public void reportError(RecognitionException e) {
        }




    // $ANTLR start "start"
    // AntlrV3SQL.g:21:1: start : ( sql_insert | sql_delete | sql_update | sql_select );
    public final void start() throws RecognitionException {
        try {
            // AntlrV3SQL.g:21:7: ( sql_insert | sql_delete | sql_update | sql_select )
            int alt1=4;
            switch ( input.LA(1) ) {
            case INSERT:
                {
                alt1=1;
                }
                break;
            case DELETE:
                {
                alt1=2;
                }
                break;
            case UPDATE:
                {
                alt1=3;
                }
                break;
            case SELECT:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // AntlrV3SQL.g:22:2: sql_insert
                    {
                    pushFollow(FOLLOW_sql_insert_in_start23);
                    sql_insert();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // AntlrV3SQL.g:22:13: sql_delete
                    {
                    pushFollow(FOLLOW_sql_delete_in_start25);
                    sql_delete();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // AntlrV3SQL.g:22:24: sql_update
                    {
                    pushFollow(FOLLOW_sql_update_in_start27);
                    sql_update();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // AntlrV3SQL.g:22:35: sql_select
                    {
                    pushFollow(FOLLOW_sql_select_in_start29);
                    sql_select();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "start"



    // $ANTLR start "sql_insert"
    // AntlrV3SQL.g:24:1: sql_insert : INSERT INTO table '\\(' insertColumn ( ',' insertColumn )* '\\)' VALUES '\\(' ( PRE_SET | ( ',' PRE_SET ) )* '\\)' ;
    public final void sql_insert() throws RecognitionException {
        try {
            // AntlrV3SQL.g:25:2: ( INSERT INTO table '\\(' insertColumn ( ',' insertColumn )* '\\)' VALUES '\\(' ( PRE_SET | ( ',' PRE_SET ) )* '\\)' )
            // AntlrV3SQL.g:26:2: INSERT INTO table '\\(' insertColumn ( ',' insertColumn )* '\\)' VALUES '\\(' ( PRE_SET | ( ',' PRE_SET ) )* '\\)'
            {
            match(input,INSERT,FOLLOW_INSERT_in_sql_insert40); 

            match(input,INTO,FOLLOW_INTO_in_sql_insert42); 

            pushFollow(FOLLOW_table_in_sql_insert44);
            table();

            state._fsp--;


            match(input,74,FOLLOW_74_in_sql_insert46); 

            pushFollow(FOLLOW_insertColumn_in_sql_insert48);
            insertColumn();

            state._fsp--;


            // AntlrV3SQL.g:26:38: ( ',' insertColumn )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==66) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // AntlrV3SQL.g:26:39: ',' insertColumn
            	    {
            	    match(input,66,FOLLOW_66_in_sql_insert51); 

            	    pushFollow(FOLLOW_insertColumn_in_sql_insert53);
            	    insertColumn();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,75,FOLLOW_75_in_sql_insert57); 

            match(input,VALUES,FOLLOW_VALUES_in_sql_insert59); 

            match(input,74,FOLLOW_74_in_sql_insert61); 

            // AntlrV3SQL.g:26:75: ( PRE_SET | ( ',' PRE_SET ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PRE_SET) ) {
                    alt3=1;
                }
                else if ( (LA3_0==66) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // AntlrV3SQL.g:26:76: PRE_SET
            	    {
            	    match(input,PRE_SET,FOLLOW_PRE_SET_in_sql_insert64); 

            	    }
            	    break;
            	case 2 :
            	    // AntlrV3SQL.g:26:84: ( ',' PRE_SET )
            	    {
            	    // AntlrV3SQL.g:26:84: ( ',' PRE_SET )
            	    // AntlrV3SQL.g:26:85: ',' PRE_SET
            	    {
            	    match(input,66,FOLLOW_66_in_sql_insert67); 

            	    match(input,PRE_SET,FOLLOW_PRE_SET_in_sql_insert69); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input,75,FOLLOW_75_in_sql_insert74); 

            this.antlrParserDelegate.setSqlOp(AntlrParserDelegate.SQLOP_INSERT);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "sql_insert"



    // $ANTLR start "sql_delete"
    // AntlrV3SQL.g:30:1: sql_delete : DELETE FROM table ( WHERE kv_sql )? ;
    public final void sql_delete() throws RecognitionException {
        try {
            // AntlrV3SQL.g:31:2: ( DELETE FROM table ( WHERE kv_sql )? )
            // AntlrV3SQL.g:32:2: DELETE FROM table ( WHERE kv_sql )?
            {
            match(input,DELETE,FOLLOW_DELETE_in_sql_delete91); 

            match(input,FROM,FOLLOW_FROM_in_sql_delete93); 

            pushFollow(FOLLOW_table_in_sql_delete95);
            table();

            state._fsp--;


            // AntlrV3SQL.g:32:20: ( WHERE kv_sql )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==WHERE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // AntlrV3SQL.g:32:21: WHERE kv_sql
                    {
                    match(input,WHERE,FOLLOW_WHERE_in_sql_delete98); 

                    pushFollow(FOLLOW_kv_sql_in_sql_delete100);
                    kv_sql();

                    state._fsp--;


                    }
                    break;

            }


            this.antlrParserDelegate.setSqlOp(AntlrParserDelegate.SQLOP_DELETE);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "sql_delete"



    // $ANTLR start "sql_update"
    // AntlrV3SQL.g:36:1: sql_update : UPDATE table SET kv ( ',' kv )* ( WHERE kv_sql )? ;
    public final void sql_update() throws RecognitionException {
        try {
            // AntlrV3SQL.g:37:2: ( UPDATE table SET kv ( ',' kv )* ( WHERE kv_sql )? )
            // AntlrV3SQL.g:38:2: UPDATE table SET kv ( ',' kv )* ( WHERE kv_sql )?
            {
            match(input,UPDATE,FOLLOW_UPDATE_in_sql_update119); 

            pushFollow(FOLLOW_table_in_sql_update121);
            table();

            state._fsp--;


            match(input,SET,FOLLOW_SET_in_sql_update123); 

            pushFollow(FOLLOW_kv_in_sql_update125);
            kv();

            state._fsp--;


            // AntlrV3SQL.g:38:22: ( ',' kv )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==66) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // AntlrV3SQL.g:38:23: ',' kv
            	    {
            	    match(input,66,FOLLOW_66_in_sql_update128); 

            	    pushFollow(FOLLOW_kv_in_sql_update130);
            	    kv();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AntlrV3SQL.g:38:32: ( WHERE kv_sql )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==WHERE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // AntlrV3SQL.g:38:33: WHERE kv_sql
                    {
                    match(input,WHERE,FOLLOW_WHERE_in_sql_update135); 

                    pushFollow(FOLLOW_kv_sql_in_sql_update137);
                    kv_sql();

                    state._fsp--;


                    }
                    break;

            }


            this.antlrParserDelegate.setSqlOp(AntlrParserDelegate.SQLOP_UPDATE);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "sql_update"



    // $ANTLR start "sql_select"
    // AntlrV3SQL.g:42:1: sql_select : SELECT select_columns ( ',' db2_paging )? FROM ( sqlAfterFrom | inner_select ) ( WHERE kv_sql )? ( orderby | groupby | having )* ;
    public final void sql_select() throws RecognitionException {
        try {
            // AntlrV3SQL.g:43:2: ( SELECT select_columns ( ',' db2_paging )? FROM ( sqlAfterFrom | inner_select ) ( WHERE kv_sql )? ( orderby | groupby | having )* )
            // AntlrV3SQL.g:44:2: SELECT select_columns ( ',' db2_paging )? FROM ( sqlAfterFrom | inner_select ) ( WHERE kv_sql )? ( orderby | groupby | having )*
            {
            match(input,SELECT,FOLLOW_SELECT_in_sql_select157); 

            pushFollow(FOLLOW_select_columns_in_sql_select159);
            select_columns();

            state._fsp--;


            // AntlrV3SQL.g:44:24: ( ',' db2_paging )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==66) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // AntlrV3SQL.g:44:25: ',' db2_paging
                    {
                    match(input,66,FOLLOW_66_in_sql_select162); 

                    pushFollow(FOLLOW_db2_paging_in_sql_select163);
                    db2_paging();

                    state._fsp--;


                    }
                    break;

            }


            match(input,FROM,FOLLOW_FROM_in_sql_select167); 

            // AntlrV3SQL.g:44:46: ( sqlAfterFrom | inner_select )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==BASIC_NAME) ) {
                alt8=1;
            }
            else if ( (LA8_0==74) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // AntlrV3SQL.g:44:47: sqlAfterFrom
                    {
                    pushFollow(FOLLOW_sqlAfterFrom_in_sql_select170);
                    sqlAfterFrom();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // AntlrV3SQL.g:44:60: inner_select
                    {
                    pushFollow(FOLLOW_inner_select_in_sql_select172);
                    inner_select();

                    state._fsp--;


                    }
                    break;

            }


            // AntlrV3SQL.g:44:74: ( WHERE kv_sql )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==WHERE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // AntlrV3SQL.g:44:75: WHERE kv_sql
                    {
                    match(input,WHERE,FOLLOW_WHERE_in_sql_select176); 

                    pushFollow(FOLLOW_kv_sql_in_sql_select178);
                    kv_sql();

                    state._fsp--;


                    }
                    break;

            }


            // AntlrV3SQL.g:44:90: ( orderby | groupby | having )*
            loop10:
            do {
                int alt10=4;
                switch ( input.LA(1) ) {
                case ORDER:
                    {
                    alt10=1;
                    }
                    break;
                case GROUP:
                    {
                    alt10=2;
                    }
                    break;
                case HAVING:
                    {
                    alt10=3;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // AntlrV3SQL.g:44:91: orderby
            	    {
            	    pushFollow(FOLLOW_orderby_in_sql_select183);
            	    orderby();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // AntlrV3SQL.g:44:99: groupby
            	    {
            	    pushFollow(FOLLOW_groupby_in_sql_select185);
            	    groupby();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // AntlrV3SQL.g:44:107: having
            	    {
            	    pushFollow(FOLLOW_having_in_sql_select187);
            	    having();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            this.antlrParserDelegate.setSqlOp(AntlrParserDelegate.SQLOP_SELECT);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "sql_select"



    // $ANTLR start "sqlAfterFrom"
    // AntlrV3SQL.g:48:1: sqlAfterFrom : tables ( ( FULL | CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '=' column_name )? )* ;
    public final void sqlAfterFrom() throws RecognitionException {
        try {
            // AntlrV3SQL.g:49:2: ( tables ( ( FULL | CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '=' column_name )? )* )
            // AntlrV3SQL.g:50:2: tables ( ( FULL | CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '=' column_name )? )*
            {
            pushFollow(FOLLOW_tables_in_sqlAfterFrom204);
            tables();

            state._fsp--;


            // AntlrV3SQL.g:50:9: ( ( FULL | CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '=' column_name )? )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==CROSS||LA12_0==FULL||LA12_0==INNER||LA12_0==LEFT||LA12_0==RIGHT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // AntlrV3SQL.g:50:10: ( FULL | CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '=' column_name )?
            	    {
            	    if ( input.LA(1)==CROSS||input.LA(1)==FULL||input.LA(1)==INNER||input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    match(input,JOIN,FOLLOW_JOIN_in_sqlAfterFrom219); 

            	    pushFollow(FOLLOW_table_in_sqlAfterFrom221);
            	    table();

            	    state._fsp--;


            	    // AntlrV3SQL.g:50:51: ( ON column_name '=' column_name )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==ON) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // AntlrV3SQL.g:50:52: ON column_name '=' column_name
            	            {
            	            match(input,ON,FOLLOW_ON_in_sqlAfterFrom224); 

            	            pushFollow(FOLLOW_column_name_in_sqlAfterFrom226);
            	            column_name();

            	            state._fsp--;


            	            match(input,71,FOLLOW_71_in_sqlAfterFrom228); 

            	            pushFollow(FOLLOW_column_name_in_sqlAfterFrom230);
            	            column_name();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "sqlAfterFrom"



    // $ANTLR start "kv_sql_wrapper"
    // AntlrV3SQL.g:52:1: kv_sql_wrapper : ( kv_sql | '\\(' kv_sql '\\)' );
    public final void kv_sql_wrapper() throws RecognitionException {
        try {
            // AntlrV3SQL.g:53:2: ( kv_sql | '\\(' kv_sql '\\)' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==BASIC_NAME) ) {
                alt13=1;
            }
            else if ( (LA13_0==74) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // AntlrV3SQL.g:54:2: kv_sql
                    {
                    pushFollow(FOLLOW_kv_sql_in_kv_sql_wrapper244);
                    kv_sql();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // AntlrV3SQL.g:54:11: '\\(' kv_sql '\\)'
                    {
                    match(input,74,FOLLOW_74_in_kv_sql_wrapper248); 

                    pushFollow(FOLLOW_kv_sql_in_kv_sql_wrapper250);
                    kv_sql();

                    state._fsp--;


                    match(input,75,FOLLOW_75_in_kv_sql_wrapper252); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "kv_sql_wrapper"



    // $ANTLR start "kv_sql"
    // AntlrV3SQL.g:56:1: kv_sql : kv ( and_or ( kv | '\\(' kv ( and_or kv )* '\\)' ) )* ;
    public final void kv_sql() throws RecognitionException {
        try {
            // AntlrV3SQL.g:56:8: ( kv ( and_or ( kv | '\\(' kv ( and_or kv )* '\\)' ) )* )
            // AntlrV3SQL.g:57:2: kv ( and_or ( kv | '\\(' kv ( and_or kv )* '\\)' ) )*
            {
            pushFollow(FOLLOW_kv_in_kv_sql263);
            kv();

            state._fsp--;


            // AntlrV3SQL.g:57:5: ( and_or ( kv | '\\(' kv ( and_or kv )* '\\)' ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==AND||LA16_0==OR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // AntlrV3SQL.g:57:7: and_or ( kv | '\\(' kv ( and_or kv )* '\\)' )
            	    {
            	    pushFollow(FOLLOW_and_or_in_kv_sql267);
            	    and_or();

            	    state._fsp--;


            	    // AntlrV3SQL.g:57:14: ( kv | '\\(' kv ( and_or kv )* '\\)' )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==BASIC_NAME) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==74) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // AntlrV3SQL.g:57:15: kv
            	            {
            	            pushFollow(FOLLOW_kv_in_kv_sql270);
            	            kv();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // AntlrV3SQL.g:57:20: '\\(' kv ( and_or kv )* '\\)'
            	            {
            	            match(input,74,FOLLOW_74_in_kv_sql274); 

            	            pushFollow(FOLLOW_kv_in_kv_sql276);
            	            kv();

            	            state._fsp--;


            	            // AntlrV3SQL.g:57:28: ( and_or kv )*
            	            loop14:
            	            do {
            	                int alt14=2;
            	                int LA14_0 = input.LA(1);

            	                if ( (LA14_0==AND||LA14_0==OR) ) {
            	                    alt14=1;
            	                }


            	                switch (alt14) {
            	            	case 1 :
            	            	    // AntlrV3SQL.g:57:29: and_or kv
            	            	    {
            	            	    pushFollow(FOLLOW_and_or_in_kv_sql279);
            	            	    and_or();

            	            	    state._fsp--;


            	            	    pushFollow(FOLLOW_kv_in_kv_sql281);
            	            	    kv();

            	            	    state._fsp--;


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop14;
            	                }
            	            } while (true);


            	            match(input,75,FOLLOW_75_in_kv_sql285); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "kv_sql"



    // $ANTLR start "inner_select"
    // AntlrV3SQL.g:60:1: inner_select : '\\(' sql_select '\\)' ( AS )? ( BASIC_NAME )? ;
    public final void inner_select() throws RecognitionException {
        try {
            // AntlrV3SQL.g:61:2: ( '\\(' sql_select '\\)' ( AS )? ( BASIC_NAME )? )
            // AntlrV3SQL.g:62:2: '\\(' sql_select '\\)' ( AS )? ( BASIC_NAME )?
            {
            match(input,74,FOLLOW_74_in_inner_select302); 

            pushFollow(FOLLOW_sql_select_in_inner_select304);
            sql_select();

            state._fsp--;


            match(input,75,FOLLOW_75_in_inner_select306); 

            // AntlrV3SQL.g:62:23: ( AS )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==AS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // AntlrV3SQL.g:62:23: AS
                    {
                    match(input,AS,FOLLOW_AS_in_inner_select308); 

                    }
                    break;

            }


            // AntlrV3SQL.g:62:27: ( BASIC_NAME )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==BASIC_NAME) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // AntlrV3SQL.g:62:27: BASIC_NAME
                    {
                    match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_inner_select311); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "inner_select"



    // $ANTLR start "func"
    // AntlrV3SQL.g:65:1: func : BASIC_NAME '\\(' ( BASIC_NAME | '*' )? '\\)' ;
    public final void func() throws RecognitionException {
        try {
            // AntlrV3SQL.g:66:2: ( BASIC_NAME '\\(' ( BASIC_NAME | '*' )? '\\)' )
            // AntlrV3SQL.g:67:2: BASIC_NAME '\\(' ( BASIC_NAME | '*' )? '\\)'
            {
            match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_func324); 

            match(input,74,FOLLOW_74_in_func326); 

            // AntlrV3SQL.g:67:18: ( BASIC_NAME | '*' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==BASIC_NAME||LA19_0==65) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // AntlrV3SQL.g:
                    {
                    if ( input.LA(1)==BASIC_NAME||input.LA(1)==65 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            match(input,75,FOLLOW_75_in_func335); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "func"



    // $ANTLR start "func_and_alias"
    // AntlrV3SQL.g:70:1: func_and_alias : func ( ( AS )? BASIC_NAME )? ;
    public final void func_and_alias() throws RecognitionException {
        try {
            // AntlrV3SQL.g:71:2: ( func ( ( AS )? BASIC_NAME )? )
            // AntlrV3SQL.g:72:2: func ( ( AS )? BASIC_NAME )?
            {
            pushFollow(FOLLOW_func_in_func_and_alias349);
            func();

            state._fsp--;


            // AntlrV3SQL.g:72:7: ( ( AS )? BASIC_NAME )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==AS||LA21_0==BASIC_NAME) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // AntlrV3SQL.g:72:8: ( AS )? BASIC_NAME
                    {
                    // AntlrV3SQL.g:72:8: ( AS )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==AS) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // AntlrV3SQL.g:72:8: AS
                            {
                            match(input,AS,FOLLOW_AS_in_func_and_alias352); 

                            }
                            break;

                    }


                    match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_func_and_alias355); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "func_and_alias"



    // $ANTLR start "select_column_and_alias"
    // AntlrV3SQL.g:75:1: select_column_and_alias : column_name ( ( AS )? BASIC_NAME )? ;
    public final void select_column_and_alias() throws RecognitionException {
        try {
            // AntlrV3SQL.g:76:2: ( column_name ( ( AS )? BASIC_NAME )? )
            // AntlrV3SQL.g:77:2: column_name ( ( AS )? BASIC_NAME )?
            {
            pushFollow(FOLLOW_column_name_in_select_column_and_alias369);
            column_name();

            state._fsp--;


            // AntlrV3SQL.g:77:14: ( ( AS )? BASIC_NAME )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==AS||LA23_0==BASIC_NAME) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // AntlrV3SQL.g:77:15: ( AS )? BASIC_NAME
                    {
                    // AntlrV3SQL.g:77:15: ( AS )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==AS) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // AntlrV3SQL.g:77:15: AS
                            {
                            match(input,AS,FOLLOW_AS_in_select_column_and_alias372); 

                            }
                            break;

                    }


                    match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_select_column_and_alias375); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "select_column_and_alias"



    // $ANTLR start "select_column"
    // AntlrV3SQL.g:80:1: select_column : ( select_column_and_alias | func_and_alias | '*' );
    public final void select_column() throws RecognitionException {
        try {
            // AntlrV3SQL.g:81:2: ( select_column_and_alias | func_and_alias | '*' )
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==BASIC_NAME) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==74) ) {
                    alt24=2;
                }
                else if ( (LA24_1==AS||LA24_1==BASIC_NAME||LA24_1==FROM||(LA24_1 >= 66 && LA24_1 <= 67)) ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA24_0==65) ) {
                alt24=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // AntlrV3SQL.g:82:2: select_column_and_alias
                    {
                    pushFollow(FOLLOW_select_column_and_alias_in_select_column389);
                    select_column_and_alias();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // AntlrV3SQL.g:82:26: func_and_alias
                    {
                    pushFollow(FOLLOW_func_and_alias_in_select_column391);
                    func_and_alias();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // AntlrV3SQL.g:82:41: '*'
                    {
                    match(input,65,FOLLOW_65_in_select_column393); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "select_column"



    // $ANTLR start "select_columns"
    // AntlrV3SQL.g:85:1: select_columns : select_column ( ',' select_column )* ;
    public final void select_columns() throws RecognitionException {
        try {
            // AntlrV3SQL.g:86:2: ( select_column ( ',' select_column )* )
            // AntlrV3SQL.g:87:2: select_column ( ',' select_column )*
            {
            pushFollow(FOLLOW_select_column_in_select_columns406);
            select_column();

            state._fsp--;


            // AntlrV3SQL.g:87:16: ( ',' select_column )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==66) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==BASIC_NAME||LA25_1==65) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // AntlrV3SQL.g:87:17: ',' select_column
            	    {
            	    match(input,66,FOLLOW_66_in_select_columns409); 

            	    pushFollow(FOLLOW_select_column_in_select_columns411);
            	    select_column();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "select_columns"



    // $ANTLR start "and_or"
    // AntlrV3SQL.g:90:1: and_or : ( AND | OR );
    public final void and_or() throws RecognitionException {
        try {
            // AntlrV3SQL.g:90:8: ( AND | OR )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)==AND||input.LA(1)==OR ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "and_or"



    // $ANTLR start "table"
    // AntlrV3SQL.g:94:1: table : table_name ( ( AS )? alias )? ;
    public final void table() throws RecognitionException {
        table_name_return table_name1 =null;

        alias_return alias2 =null;


        try {
            // AntlrV3SQL.g:94:7: ( table_name ( ( AS )? alias )? )
            // AntlrV3SQL.g:95:2: table_name ( ( AS )? alias )?
            {
            pushFollow(FOLLOW_table_name_in_table441);
            table_name1=table_name();

            state._fsp--;


            // AntlrV3SQL.g:95:13: ( ( AS )? alias )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==AS||LA27_0==BASIC_NAME) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // AntlrV3SQL.g:95:14: ( AS )? alias
                    {
                    // AntlrV3SQL.g:95:14: ( AS )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==AS) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // AntlrV3SQL.g:95:15: AS
                            {
                            match(input,AS,FOLLOW_AS_in_table445); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_alias_in_table449);
                    alias2=alias();

                    state._fsp--;


                    }
                    break;

            }



            	if (this.antlrParserDelegate != null) {
                        this.antlrParserDelegate.onFindTable( (table_name1!=null?input.toString(table_name1.start,table_name1.stop):null), (alias2!=null?input.toString(alias2.start,alias2.stop):null));
                    }
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "table"



    // $ANTLR start "tables"
    // AntlrV3SQL.g:101:1: tables : ( table ( ',' table )* ) ;
    public final void tables() throws RecognitionException {
        try {
            // AntlrV3SQL.g:101:8: ( ( table ( ',' table )* ) )
            // AntlrV3SQL.g:102:2: ( table ( ',' table )* )
            {
            // AntlrV3SQL.g:102:2: ( table ( ',' table )* )
            // AntlrV3SQL.g:102:3: table ( ',' table )*
            {
            pushFollow(FOLLOW_table_in_tables465);
            table();

            state._fsp--;


            // AntlrV3SQL.g:102:9: ( ',' table )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==66) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // AntlrV3SQL.g:102:10: ',' table
            	    {
            	    match(input,66,FOLLOW_66_in_tables468); 

            	    pushFollow(FOLLOW_table_in_tables470);
            	    table();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "tables"


    public static class table_name_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "table_name"
    // AntlrV3SQL.g:105:1: table_name : BASIC_NAME ( ( '.' ) BASIC_NAME )? ;
    public final table_name_return table_name() throws RecognitionException {
        table_name_return retval = new table_name_return();
        retval.start = input.LT(1);


        try {
            // AntlrV3SQL.g:106:2: ( BASIC_NAME ( ( '.' ) BASIC_NAME )? )
            // AntlrV3SQL.g:107:2: BASIC_NAME ( ( '.' ) BASIC_NAME )?
            {
            match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_table_name486); 

            // AntlrV3SQL.g:107:13: ( ( '.' ) BASIC_NAME )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==67) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // AntlrV3SQL.g:107:14: ( '.' ) BASIC_NAME
                    {
                    // AntlrV3SQL.g:107:14: ( '.' )
                    // AntlrV3SQL.g:107:15: '.'
                    {
                    match(input,67,FOLLOW_67_in_table_name490); 

                    }


                    match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_table_name493); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // AntlrV3SQL.g:110:1: alias : BASIC_NAME ;
    public final alias_return alias() throws RecognitionException {
        alias_return retval = new alias_return();
        retval.start = input.LT(1);


        try {
            // AntlrV3SQL.g:110:7: ( BASIC_NAME )
            // AntlrV3SQL.g:111:2: BASIC_NAME
            {
            match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_alias506); 

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    // AntlrV3SQL.g:114:1: column_name : BASIC_NAME ( ( '.' ) BASIC_NAME )? ;
    public final column_name_return column_name() throws RecognitionException {
        column_name_return retval = new column_name_return();
        retval.start = input.LT(1);


        try {
            // AntlrV3SQL.g:115:2: ( BASIC_NAME ( ( '.' ) BASIC_NAME )? )
            // AntlrV3SQL.g:116:2: BASIC_NAME ( ( '.' ) BASIC_NAME )?
            {
            match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_column_name518); 

            // AntlrV3SQL.g:116:13: ( ( '.' ) BASIC_NAME )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==67) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // AntlrV3SQL.g:116:14: ( '.' ) BASIC_NAME
                    {
                    // AntlrV3SQL.g:116:14: ( '.' )
                    // AntlrV3SQL.g:116:15: '.'
                    {
                    match(input,67,FOLLOW_67_in_column_name522); 

                    }


                    match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_column_name525); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_name"



    // $ANTLR start "insertColumn"
    // AntlrV3SQL.g:119:1: insertColumn : column_name ;
    public final void insertColumn() throws RecognitionException {
        column_name_return column_name3 =null;


        try {
            // AntlrV3SQL.g:120:2: ( column_name )
            // AntlrV3SQL.g:121:2: column_name
            {
            pushFollow(FOLLOW_column_name_in_insertColumn539);
            column_name3=column_name();

            state._fsp--;



            	if (this.antlrParserDelegate != null) {
                        this.antlrParserDelegate.onFindColExper(
                                (column_name3!=null?input.toString(column_name3.start,column_name3.stop):null), "=");
                    }
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "insertColumn"



    // $ANTLR start "kv"
    // AntlrV3SQL.g:131:1: kv : ( ( column_name op ( PRE_SET | '\\(' PRE_SET '\\)' ) ) | column_name op TEXT_STRING | ( column_name BETWEEN PRE_SET AND PRE_SET ) | column_name op column_name | column_name op func2 | column_name op '\\(' sql_select '\\)' | ( column_name op '\\(' inexpr '\\)' ) );
    public final void kv() throws RecognitionException {
        column_name_return column_name4 =null;

        op_return op5 =null;

        column_name_return column_name6 =null;

        inexpr_return inexpr7 =null;

        column_name_return column_name8 =null;

        op_return op9 =null;


        try {
            // AntlrV3SQL.g:131:4: ( ( column_name op ( PRE_SET | '\\(' PRE_SET '\\)' ) ) | column_name op TEXT_STRING | ( column_name BETWEEN PRE_SET AND PRE_SET ) | column_name op column_name | column_name op func2 | column_name op '\\(' sql_select '\\)' | ( column_name op '\\(' inexpr '\\)' ) )
            int alt32=7;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==BASIC_NAME) ) {
                switch ( input.LA(2) ) {
                case 67:
                    {
                    int LA32_2 = input.LA(3);

                    if ( (LA32_2==BASIC_NAME) ) {
                        int LA32_5 = input.LA(4);

                        if ( (LA32_5==EXISTS||LA32_5==IN||LA32_5==64||(LA32_5 >= 68 && LA32_5 <= 73)) ) {
                            switch ( input.LA(5) ) {
                            case PRE_SET:
                                {
                                alt32=1;
                                }
                                break;
                            case 74:
                                {
                                int LA32_7 = input.LA(6);

                                if ( (LA32_7==PRE_SET) ) {
                                    int LA32_10 = input.LA(7);

                                    if ( (LA32_10==75) ) {
                                        alt32=1;
                                    }
                                    else if ( (LA32_10==66) ) {
                                        alt32=7;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 32, 10, input);

                                        throw nvae;

                                    }
                                }
                                else if ( (LA32_7==SELECT) ) {
                                    alt32=6;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 32, 7, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case TEXT_STRING:
                                {
                                alt32=2;
                                }
                                break;
                            case BASIC_NAME:
                                {
                                int LA32_9 = input.LA(6);

                                if ( (LA32_9==74) ) {
                                    alt32=5;
                                }
                                else if ( (LA32_9==EOF||LA32_9==AND||LA32_9==GROUP||LA32_9==HAVING||(LA32_9 >= OR && LA32_9 <= ORDER)||LA32_9==WHERE||(LA32_9 >= 66 && LA32_9 <= 67)||LA32_9==75) ) {
                                    alt32=4;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 32, 9, input);

                                    throw nvae;

                                }
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 3, input);

                                throw nvae;

                            }

                        }
                        else if ( (LA32_5==BETWEEN) ) {
                            alt32=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 2, input);

                        throw nvae;

                    }
                    }
                    break;
                case EXISTS:
                case IN:
                case 64:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                    {
                    switch ( input.LA(3) ) {
                    case PRE_SET:
                        {
                        alt32=1;
                        }
                        break;
                    case 74:
                        {
                        int LA32_7 = input.LA(4);

                        if ( (LA32_7==PRE_SET) ) {
                            int LA32_10 = input.LA(5);

                            if ( (LA32_10==75) ) {
                                alt32=1;
                            }
                            else if ( (LA32_10==66) ) {
                                alt32=7;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 10, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA32_7==SELECT) ) {
                            alt32=6;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 7, input);

                            throw nvae;

                        }
                        }
                        break;
                    case TEXT_STRING:
                        {
                        alt32=2;
                        }
                        break;
                    case BASIC_NAME:
                        {
                        int LA32_9 = input.LA(4);

                        if ( (LA32_9==74) ) {
                            alt32=5;
                        }
                        else if ( (LA32_9==EOF||LA32_9==AND||LA32_9==GROUP||LA32_9==HAVING||(LA32_9 >= OR && LA32_9 <= ORDER)||LA32_9==WHERE||(LA32_9 >= 66 && LA32_9 <= 67)||LA32_9==75) ) {
                            alt32=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 9, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 3, input);

                        throw nvae;

                    }

                    }
                    break;
                case BETWEEN:
                    {
                    alt32=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // AntlrV3SQL.g:132:2: ( column_name op ( PRE_SET | '\\(' PRE_SET '\\)' ) )
                    {
                    // AntlrV3SQL.g:132:2: ( column_name op ( PRE_SET | '\\(' PRE_SET '\\)' ) )
                    // AntlrV3SQL.g:132:3: column_name op ( PRE_SET | '\\(' PRE_SET '\\)' )
                    {
                    pushFollow(FOLLOW_column_name_in_kv556);
                    column_name4=column_name();

                    state._fsp--;


                    pushFollow(FOLLOW_op_in_kv558);
                    op5=op();

                    state._fsp--;


                    // AntlrV3SQL.g:132:18: ( PRE_SET | '\\(' PRE_SET '\\)' )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==PRE_SET) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==74) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;

                    }
                    switch (alt31) {
                        case 1 :
                            // AntlrV3SQL.g:132:19: PRE_SET
                            {
                            match(input,PRE_SET,FOLLOW_PRE_SET_in_kv561); 

                            }
                            break;
                        case 2 :
                            // AntlrV3SQL.g:132:27: '\\(' PRE_SET '\\)'
                            {
                            match(input,74,FOLLOW_74_in_kv563); 

                            match(input,PRE_SET,FOLLOW_PRE_SET_in_kv565); 

                            match(input,75,FOLLOW_75_in_kv567); 

                            }
                            break;

                    }


                    }



                    	if (this.antlrParserDelegate != null) {
                                this.antlrParserDelegate.onFindColExper( (column_name4!=null?input.toString(column_name4.start,column_name4.stop):null),  (op5!=null?input.toString(op5.start,op5.stop):null));
                            }
                    	

                    }
                    break;
                case 2 :
                    // AntlrV3SQL.g:139:2: column_name op TEXT_STRING
                    {
                    pushFollow(FOLLOW_column_name_in_kv578);
                    column_name();

                    state._fsp--;


                    pushFollow(FOLLOW_op_in_kv580);
                    op();

                    state._fsp--;


                    match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_kv582); 

                    }
                    break;
                case 3 :
                    // AntlrV3SQL.g:141:2: ( column_name BETWEEN PRE_SET AND PRE_SET )
                    {
                    // AntlrV3SQL.g:141:2: ( column_name BETWEEN PRE_SET AND PRE_SET )
                    // AntlrV3SQL.g:141:3: column_name BETWEEN PRE_SET AND PRE_SET
                    {
                    pushFollow(FOLLOW_column_name_in_kv589);
                    column_name6=column_name();

                    state._fsp--;


                    match(input,BETWEEN,FOLLOW_BETWEEN_in_kv591); 

                    match(input,PRE_SET,FOLLOW_PRE_SET_in_kv593); 

                    match(input,AND,FOLLOW_AND_in_kv595); 

                    match(input,PRE_SET,FOLLOW_PRE_SET_in_kv597); 

                    }



                    		this.antlrParserDelegate.onFindColExper((column_name6!=null?input.toString(column_name6.start,column_name6.stop):null), ">=");
                    		this.antlrParserDelegate.onFindColExper((column_name6!=null?input.toString(column_name6.start,column_name6.stop):null), "=<");
                    		

                    }
                    break;
                case 4 :
                    // AntlrV3SQL.g:147:2: column_name op column_name
                    {
                    pushFollow(FOLLOW_column_name_in_kv608);
                    column_name();

                    state._fsp--;


                    pushFollow(FOLLOW_op_in_kv610);
                    op();

                    state._fsp--;


                    pushFollow(FOLLOW_column_name_in_kv612);
                    column_name();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // AntlrV3SQL.g:149:2: column_name op func2
                    {
                    pushFollow(FOLLOW_column_name_in_kv618);
                    column_name();

                    state._fsp--;


                    pushFollow(FOLLOW_op_in_kv620);
                    op();

                    state._fsp--;


                    pushFollow(FOLLOW_func2_in_kv622);
                    func2();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // AntlrV3SQL.g:151:2: column_name op '\\(' sql_select '\\)'
                    {
                    pushFollow(FOLLOW_column_name_in_kv628);
                    column_name();

                    state._fsp--;


                    pushFollow(FOLLOW_op_in_kv630);
                    op();

                    state._fsp--;


                    match(input,74,FOLLOW_74_in_kv632); 

                    pushFollow(FOLLOW_sql_select_in_kv634);
                    sql_select();

                    state._fsp--;


                    match(input,75,FOLLOW_75_in_kv636); 

                    }
                    break;
                case 7 :
                    // AntlrV3SQL.g:153:2: ( column_name op '\\(' inexpr '\\)' )
                    {
                    // AntlrV3SQL.g:153:2: ( column_name op '\\(' inexpr '\\)' )
                    // AntlrV3SQL.g:153:3: column_name op '\\(' inexpr '\\)'
                    {
                    pushFollow(FOLLOW_column_name_in_kv643);
                    column_name8=column_name();

                    state._fsp--;


                    pushFollow(FOLLOW_op_in_kv645);
                    op9=op();

                    state._fsp--;


                    match(input,74,FOLLOW_74_in_kv647); 

                    pushFollow(FOLLOW_inexpr_in_kv649);
                    inexpr7=inexpr();

                    state._fsp--;


                    match(input,75,FOLLOW_75_in_kv652); 

                    }



                    	if (this.antlrParserDelegate != null) {
                    	    String s=(inexpr7!=null?input.toString(inexpr7.start,inexpr7.stop):null);
                    	    int cnt=s.split(",").length;
                    	    for(int i=0;i<cnt;++i)
                                this.antlrParserDelegate.onFindColExper( (column_name8!=null?input.toString(column_name8.start,column_name8.stop):null),  (op9!=null?input.toString(op9.start,op9.stop):null));
                            }
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "kv"


    public static class inexpr_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "inexpr"
    // AntlrV3SQL.g:163:1: inexpr : PRE_SET ',' PRE_SET ( ',' PRE_SET )* ;
    public final inexpr_return inexpr() throws RecognitionException {
        inexpr_return retval = new inexpr_return();
        retval.start = input.LT(1);


        try {
            // AntlrV3SQL.g:163:8: ( PRE_SET ',' PRE_SET ( ',' PRE_SET )* )
            // AntlrV3SQL.g:164:2: PRE_SET ',' PRE_SET ( ',' PRE_SET )*
            {
            match(input,PRE_SET,FOLLOW_PRE_SET_in_inexpr668); 

            match(input,66,FOLLOW_66_in_inexpr670); 

            match(input,PRE_SET,FOLLOW_PRE_SET_in_inexpr672); 

            // AntlrV3SQL.g:164:22: ( ',' PRE_SET )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==66) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // AntlrV3SQL.g:164:23: ',' PRE_SET
            	    {
            	    match(input,66,FOLLOW_66_in_inexpr675); 

            	    match(input,PRE_SET,FOLLOW_PRE_SET_in_inexpr677); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inexpr"



    // $ANTLR start "func2"
    // AntlrV3SQL.g:167:1: func2 : BASIC_NAME '\\(' ( ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING ) )* )? '\\)' ;
    public final void func2() throws RecognitionException {
        try {
            // AntlrV3SQL.g:167:7: ( BASIC_NAME '\\(' ( ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING ) )* )? '\\)' )
            // AntlrV3SQL.g:168:2: BASIC_NAME '\\(' ( ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING ) )* )? '\\)'
            {
            match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_func2690); 

            match(input,74,FOLLOW_74_in_func2694); 

            // AntlrV3SQL.g:170:2: ( ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==BASIC_NAME||LA37_0==TEXT_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // AntlrV3SQL.g:171:2: ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING ) )*
                    {
                    // AntlrV3SQL.g:171:2: ( column_name | TEXT_STRING )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==BASIC_NAME) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==TEXT_STRING) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;

                    }
                    switch (alt34) {
                        case 1 :
                            // AntlrV3SQL.g:171:3: column_name
                            {
                            pushFollow(FOLLOW_column_name_in_func2702);
                            column_name();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // AntlrV3SQL.g:171:15: TEXT_STRING
                            {
                            match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_func2704); 

                            }
                            break;

                    }


                    // AntlrV3SQL.g:171:28: ( ',' ( column_name | TEXT_STRING ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==66) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // AntlrV3SQL.g:171:29: ',' ( column_name | TEXT_STRING )
                    	    {
                    	    match(input,66,FOLLOW_66_in_func2708); 

                    	    // AntlrV3SQL.g:171:33: ( column_name | TEXT_STRING )
                    	    int alt35=2;
                    	    int LA35_0 = input.LA(1);

                    	    if ( (LA35_0==BASIC_NAME) ) {
                    	        alt35=1;
                    	    }
                    	    else if ( (LA35_0==TEXT_STRING) ) {
                    	        alt35=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 35, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt35) {
                    	        case 1 :
                    	            // AntlrV3SQL.g:171:34: column_name
                    	            {
                    	            pushFollow(FOLLOW_column_name_in_func2711);
                    	            column_name();

                    	            state._fsp--;


                    	            }
                    	            break;
                    	        case 2 :
                    	            // AntlrV3SQL.g:171:46: TEXT_STRING
                    	            {
                    	            match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_func2713); 

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,75,FOLLOW_75_in_func2723); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "func2"


    public static class op_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "op"
    // AntlrV3SQL.g:176:1: op : ( '=' | '>' | '>=' | '<' | '<=' | '!=' | '<>' | IN | EXISTS ) ;
    public final op_return op() throws RecognitionException {
        op_return retval = new op_return();
        retval.start = input.LT(1);


        try {
            // AntlrV3SQL.g:177:2: ( ( '=' | '>' | '>=' | '<' | '<=' | '!=' | '<>' | IN | EXISTS ) )
            // AntlrV3SQL.g:
            {
            if ( input.LA(1)==EXISTS||input.LA(1)==IN||input.LA(1)==64||(input.LA(1) >= 68 && input.LA(1) <= 73) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "op"



    // $ANTLR start "orderby"
    // AntlrV3SQL.g:181:1: orderby : ORDER BY column_name ( DESC | ASC )? ( ',' column_name ( DESC | ASC )? )* ;
    public final void orderby() throws RecognitionException {
        try {
            // AntlrV3SQL.g:181:9: ( ORDER BY column_name ( DESC | ASC )? ( ',' column_name ( DESC | ASC )? )* )
            // AntlrV3SQL.g:182:2: ORDER BY column_name ( DESC | ASC )? ( ',' column_name ( DESC | ASC )? )*
            {
            match(input,ORDER,FOLLOW_ORDER_in_orderby765); 

            match(input,BY,FOLLOW_BY_in_orderby767); 

            pushFollow(FOLLOW_column_name_in_orderby769);
            column_name();

            state._fsp--;


            // AntlrV3SQL.g:182:23: ( DESC | ASC )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ASC||LA38_0==DESC) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // AntlrV3SQL.g:
                    {
                    if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            // AntlrV3SQL.g:182:35: ( ',' column_name ( DESC | ASC )? )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==66) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // AntlrV3SQL.g:182:36: ',' column_name ( DESC | ASC )?
            	    {
            	    match(input,66,FOLLOW_66_in_orderby779); 

            	    pushFollow(FOLLOW_column_name_in_orderby781);
            	    column_name();

            	    state._fsp--;


            	    // AntlrV3SQL.g:182:52: ( DESC | ASC )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==ASC||LA39_0==DESC) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // AntlrV3SQL.g:
            	            {
            	            if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
            	                input.consume();
            	                state.errorRecovery=false;
            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                throw mse;
            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "orderby"



    // $ANTLR start "groupby"
    // AntlrV3SQL.g:185:1: groupby : GROUP BY column_name ( ',' column_name )* ;
    public final void groupby() throws RecognitionException {
        try {
            // AntlrV3SQL.g:185:9: ( GROUP BY column_name ( ',' column_name )* )
            // AntlrV3SQL.g:186:2: GROUP BY column_name ( ',' column_name )*
            {
            match(input,GROUP,FOLLOW_GROUP_in_groupby802); 

            match(input,BY,FOLLOW_BY_in_groupby804); 

            pushFollow(FOLLOW_column_name_in_groupby806);
            column_name();

            state._fsp--;


            // AntlrV3SQL.g:186:23: ( ',' column_name )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==66) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // AntlrV3SQL.g:186:24: ',' column_name
            	    {
            	    match(input,66,FOLLOW_66_in_groupby809); 

            	    pushFollow(FOLLOW_column_name_in_groupby811);
            	    column_name();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "groupby"



    // $ANTLR start "having"
    // AntlrV3SQL.g:189:1: having : HAVING ( column_name | func ) op ( column_name | func | TEXT_STRING | PRE_SET ) ;
    public final void having() throws RecognitionException {
        try {
            // AntlrV3SQL.g:189:8: ( HAVING ( column_name | func ) op ( column_name | func | TEXT_STRING | PRE_SET ) )
            // AntlrV3SQL.g:190:2: HAVING ( column_name | func ) op ( column_name | func | TEXT_STRING | PRE_SET )
            {
            match(input,HAVING,FOLLOW_HAVING_in_having824); 

            // AntlrV3SQL.g:190:9: ( column_name | func )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==BASIC_NAME) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==74) ) {
                    alt42=2;
                }
                else if ( (LA42_1==EXISTS||LA42_1==IN||LA42_1==64||(LA42_1 >= 67 && LA42_1 <= 73)) ) {
                    alt42=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // AntlrV3SQL.g:190:10: column_name
                    {
                    pushFollow(FOLLOW_column_name_in_having827);
                    column_name();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // AntlrV3SQL.g:190:22: func
                    {
                    pushFollow(FOLLOW_func_in_having829);
                    func();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_op_in_having832);
            op();

            state._fsp--;


            // AntlrV3SQL.g:190:31: ( column_name | func | TEXT_STRING | PRE_SET )
            int alt43=4;
            switch ( input.LA(1) ) {
            case BASIC_NAME:
                {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==74) ) {
                    alt43=2;
                }
                else if ( (LA43_1==EOF||LA43_1==GROUP||LA43_1==HAVING||LA43_1==ORDER||LA43_1==67||LA43_1==75) ) {
                    alt43=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;

                }
                }
                break;
            case TEXT_STRING:
                {
                alt43=3;
                }
                break;
            case PRE_SET:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }

            switch (alt43) {
                case 1 :
                    // AntlrV3SQL.g:190:32: column_name
                    {
                    pushFollow(FOLLOW_column_name_in_having835);
                    column_name();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // AntlrV3SQL.g:190:44: func
                    {
                    pushFollow(FOLLOW_func_in_having837);
                    func();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // AntlrV3SQL.g:190:49: TEXT_STRING
                    {
                    match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_having839); 

                    }
                    break;
                case 4 :
                    // AntlrV3SQL.g:190:61: PRE_SET
                    {
                    match(input,PRE_SET,FOLLOW_PRE_SET_in_having841); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "having"



    // $ANTLR start "db2_paging"
    // AntlrV3SQL.g:193:1: db2_paging : ROWNUMBER '\\(' '\\)' OVER '\\(' orderby '\\)' ( AS )? BASIC_NAME ;
    public final void db2_paging() throws RecognitionException {
        try {
            // AntlrV3SQL.g:194:2: ( ROWNUMBER '\\(' '\\)' OVER '\\(' orderby '\\)' ( AS )? BASIC_NAME )
            // AntlrV3SQL.g:195:2: ROWNUMBER '\\(' '\\)' OVER '\\(' orderby '\\)' ( AS )? BASIC_NAME
            {
            match(input,ROWNUMBER,FOLLOW_ROWNUMBER_in_db2_paging855); 

            match(input,74,FOLLOW_74_in_db2_paging856); 

            match(input,75,FOLLOW_75_in_db2_paging857); 

            match(input,OVER,FOLLOW_OVER_in_db2_paging859); 

            match(input,74,FOLLOW_74_in_db2_paging860); 

            pushFollow(FOLLOW_orderby_in_db2_paging861);
            orderby();

            state._fsp--;


            match(input,75,FOLLOW_75_in_db2_paging863); 

            // AntlrV3SQL.g:195:41: ( AS )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==AS) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // AntlrV3SQL.g:195:42: AS
                    {
                    match(input,AS,FOLLOW_AS_in_db2_paging866); 

                    }
                    break;

            }


            match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_db2_paging870); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "db2_paging"

    // Delegated rules


 

    public static final BitSet FOLLOW_sql_insert_in_start23 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_delete_in_start25 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_update_in_start27 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_select_in_start29 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_sql_insert40 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_INTO_in_sql_insert42 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_table_in_sql_insert44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_sql_insert46 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_insertColumn_in_sql_insert48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_66_in_sql_insert51 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_insertColumn_in_sql_insert53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_75_in_sql_insert57 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VALUES_in_sql_insert59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_sql_insert61 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_PRE_SET_in_sql_insert64 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_66_in_sql_insert67 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PRE_SET_in_sql_insert69 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_75_in_sql_insert74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_sql_delete91 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_FROM_in_sql_delete93 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_table_in_sql_delete95 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_WHERE_in_sql_delete98 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_kv_sql_in_sql_delete100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_sql_update119 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_table_in_sql_update121 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SET_in_sql_update123 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_kv_in_sql_update125 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_sql_update128 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_kv_in_sql_update130 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_WHERE_in_sql_update135 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_kv_sql_in_sql_update137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_sql_select157 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000002L});
    public static final BitSet FOLLOW_select_columns_in_sql_select159 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_sql_select162 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_db2_paging_in_sql_select163 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_FROM_in_sql_select167 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000400L});
    public static final BitSet FOLLOW_sqlAfterFrom_in_sql_select170 = new BitSet(new long[]{0x0800020002800002L});
    public static final BitSet FOLLOW_inner_select_in_sql_select172 = new BitSet(new long[]{0x0800020002800002L});
    public static final BitSet FOLLOW_WHERE_in_sql_select176 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_kv_sql_in_sql_select178 = new BitSet(new long[]{0x0000020002800002L});
    public static final BitSet FOLLOW_orderby_in_sql_select183 = new BitSet(new long[]{0x0000020002800002L});
    public static final BitSet FOLLOW_groupby_in_sql_select185 = new BitSet(new long[]{0x0000020002800002L});
    public static final BitSet FOLLOW_having_in_sql_select187 = new BitSet(new long[]{0x0000020002800002L});
    public static final BitSet FOLLOW_tables_in_sqlAfterFrom204 = new BitSet(new long[]{0x0000800810202002L});
    public static final BitSet FOLLOW_set_in_sqlAfterFrom207 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_JOIN_in_sqlAfterFrom219 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_table_in_sqlAfterFrom221 = new BitSet(new long[]{0x0000808810202002L});
    public static final BitSet FOLLOW_ON_in_sqlAfterFrom224 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_column_name_in_sqlAfterFrom226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_sqlAfterFrom228 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_column_name_in_sqlAfterFrom230 = new BitSet(new long[]{0x0000800810202002L});
    public static final BitSet FOLLOW_kv_sql_in_kv_sql_wrapper244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_kv_sql_wrapper248 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_kv_sql_in_kv_sql_wrapper250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_kv_sql_wrapper252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kv_in_kv_sql263 = new BitSet(new long[]{0x0000010000000022L});
    public static final BitSet FOLLOW_and_or_in_kv_sql267 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000400L});
    public static final BitSet FOLLOW_kv_in_kv_sql270 = new BitSet(new long[]{0x0000010000000022L});
    public static final BitSet FOLLOW_74_in_kv_sql274 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_kv_in_kv_sql276 = new BitSet(new long[]{0x0000010000000020L,0x0000000000000800L});
    public static final BitSet FOLLOW_and_or_in_kv_sql279 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_kv_in_kv_sql281 = new BitSet(new long[]{0x0000010000000020L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_kv_sql285 = new BitSet(new long[]{0x0000010000000022L});
    public static final BitSet FOLLOW_74_in_inner_select302 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_sql_select_in_inner_select304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_inner_select306 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_AS_in_inner_select308 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_BASIC_NAME_in_inner_select311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASIC_NAME_in_func324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_func326 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000802L});
    public static final BitSet FOLLOW_75_in_func335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_func_and_alias349 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_AS_in_func_and_alias352 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_BASIC_NAME_in_func_and_alias355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_select_column_and_alias369 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_AS_in_select_column_and_alias372 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_BASIC_NAME_in_select_column_and_alias375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_column_and_alias_in_select_column389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_and_alias_in_select_column391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_select_column393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_column_in_select_columns406 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_select_columns409 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000002L});
    public static final BitSet FOLLOW_select_column_in_select_columns411 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_table_name_in_table441 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_AS_in_table445 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_alias_in_table449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_in_tables465 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_tables468 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_table_in_tables470 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_BASIC_NAME_in_table_name486 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_table_name490 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_BASIC_NAME_in_table_name493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASIC_NAME_in_alias506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASIC_NAME_in_column_name518 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_column_name522 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_BASIC_NAME_in_column_name525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_insertColumn539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_kv556 = new BitSet(new long[]{0x0000000008040000L,0x00000000000003F1L});
    public static final BitSet FOLLOW_op_in_kv558 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_PRE_SET_in_kv561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_kv563 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PRE_SET_in_kv565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_kv567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_kv578 = new BitSet(new long[]{0x0000000008040000L,0x00000000000003F1L});
    public static final BitSet FOLLOW_op_in_kv580 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_TEXT_STRING_in_kv582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_kv589 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BETWEEN_in_kv591 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PRE_SET_in_kv593 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_AND_in_kv595 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PRE_SET_in_kv597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_kv608 = new BitSet(new long[]{0x0000000008040000L,0x00000000000003F1L});
    public static final BitSet FOLLOW_op_in_kv610 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_column_name_in_kv612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_kv618 = new BitSet(new long[]{0x0000000008040000L,0x00000000000003F1L});
    public static final BitSet FOLLOW_op_in_kv620 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_func2_in_kv622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_kv628 = new BitSet(new long[]{0x0000000008040000L,0x00000000000003F1L});
    public static final BitSet FOLLOW_op_in_kv630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_kv632 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_sql_select_in_kv634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_kv636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_kv643 = new BitSet(new long[]{0x0000000008040000L,0x00000000000003F1L});
    public static final BitSet FOLLOW_op_in_kv645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_kv647 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_inexpr_in_kv649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_kv652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRE_SET_in_inexpr668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_inexpr670 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PRE_SET_in_inexpr672 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_inexpr675 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PRE_SET_in_inexpr677 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_BASIC_NAME_in_func2690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_func2694 = new BitSet(new long[]{0x0020000000000200L,0x0000000000000800L});
    public static final BitSet FOLLOW_column_name_in_func2702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_TEXT_STRING_in_func2704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_66_in_func2708 = new BitSet(new long[]{0x0020000000000200L});
    public static final BitSet FOLLOW_column_name_in_func2711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_TEXT_STRING_in_func2713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_75_in_func2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_orderby765 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BY_in_orderby767 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_column_name_in_orderby769 = new BitSet(new long[]{0x0000000000010082L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_orderby779 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_column_name_in_orderby781 = new BitSet(new long[]{0x0000000000010082L,0x0000000000000004L});
    public static final BitSet FOLLOW_GROUP_in_groupby802 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BY_in_groupby804 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_column_name_in_groupby806 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_groupby809 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_column_name_in_groupby811 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_HAVING_in_having824 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_column_name_in_having827 = new BitSet(new long[]{0x0000000008040000L,0x00000000000003F1L});
    public static final BitSet FOLLOW_func_in_having829 = new BitSet(new long[]{0x0000000008040000L,0x00000000000003F1L});
    public static final BitSet FOLLOW_op_in_having832 = new BitSet(new long[]{0x0020100000000200L});
    public static final BitSet FOLLOW_column_name_in_having835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_having837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_STRING_in_having839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRE_SET_in_having841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROWNUMBER_in_db2_paging855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_db2_paging856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_db2_paging857 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_OVER_in_db2_paging859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_db2_paging860 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_orderby_in_db2_paging861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_db2_paging863 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_AS_in_db2_paging866 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_BASIC_NAME_in_db2_paging870 = new BitSet(new long[]{0x0000000000000002L});

}