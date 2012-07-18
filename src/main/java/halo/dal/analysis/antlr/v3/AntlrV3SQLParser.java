package halo.dal.analysis.antlr.v3;

// $ANTLR 3.4 /Users/akwei/antlrpro/sql2/AntlrV3SQL.g 2012-07-18 15:54:41

import halo.dal.analysis.antlr.AntlrParserDelegate;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AntlrV3SQLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AND", "AS", "ASC", "B", "BASIC_NAME", "BY", "C", "CROSS", "D", "DELETE", "DESC", "E", "EXISTS", "F", "FROM", "FULL", "G", "GROUP", "H", "HAVING", "I", "IN", "INNER", "INSERT", "INTO", "J", "JOIN", "K", "L", "LEFT", "M", "N", "O", "ON", "OR", "ORDER", "P", "PRE_SET", "Q", "R", "RIGHT", "S", "SELECT", "SET", "T", "TEXT_STRING", "U", "UPDATE", "V", "VALUES", "W", "WHERE", "WS", "X", "Y", "Z", "'!='", "'*'", "','", "'.'", "'<'", "'<='", "'<>'", "'='", "'>'", "'>='", "'\\('", "'\\)'"
    };

    public static final int EOF=-1;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int A=4;
    public static final int AND=5;
    public static final int AS=6;
    public static final int ASC=7;
    public static final int B=8;
    public static final int BASIC_NAME=9;
    public static final int BY=10;
    public static final int C=11;
    public static final int CROSS=12;
    public static final int D=13;
    public static final int DELETE=14;
    public static final int DESC=15;
    public static final int E=16;
    public static final int EXISTS=17;
    public static final int F=18;
    public static final int FROM=19;
    public static final int FULL=20;
    public static final int G=21;
    public static final int GROUP=22;
    public static final int H=23;
    public static final int HAVING=24;
    public static final int I=25;
    public static final int IN=26;
    public static final int INNER=27;
    public static final int INSERT=28;
    public static final int INTO=29;
    public static final int J=30;
    public static final int JOIN=31;
    public static final int K=32;
    public static final int L=33;
    public static final int LEFT=34;
    public static final int M=35;
    public static final int N=36;
    public static final int O=37;
    public static final int ON=38;
    public static final int OR=39;
    public static final int ORDER=40;
    public static final int P=41;
    public static final int PRE_SET=42;
    public static final int Q=43;
    public static final int R=44;
    public static final int RIGHT=45;
    public static final int S=46;
    public static final int SELECT=47;
    public static final int SET=48;
    public static final int T=49;
    public static final int TEXT_STRING=50;
    public static final int U=51;
    public static final int UPDATE=52;
    public static final int V=53;
    public static final int VALUES=54;
    public static final int W=55;
    public static final int WHERE=56;
    public static final int WS=57;
    public static final int X=58;
    public static final int Y=59;
    public static final int Z=60;

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
    public String getGrammarFileName() { return "/Users/akwei/antlrpro/sql2/AntlrV3SQL.g"; }


//    List<String[]> tables = new ArrayList<String[]>();
//    List<String[]> colExprs=new ArrayList<String[]>();
        private AntlrParserDelegate antlrParserDelegate;
    
        public void setAntlrParserDelegate(AntlrParserDelegate antlrParserDelegate) {
            this.antlrParserDelegate = antlrParserDelegate;
        }

    @Override
        public void reportError(RecognitionException e) {
        }




    // $ANTLR start "start"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:23:1: start : ( sql_insert | sql_delete | sql_update | sql_select );
    public final void start() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:23:7: ( sql_insert | sql_delete | sql_update | sql_select )
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
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:24:2: sql_insert
                    {
                    pushFollow(FOLLOW_sql_insert_in_start23);
                    sql_insert();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:24:13: sql_delete
                    {
                    pushFollow(FOLLOW_sql_delete_in_start25);
                    sql_delete();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:24:24: sql_update
                    {
                    pushFollow(FOLLOW_sql_update_in_start27);
                    sql_update();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:24:35: sql_select
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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:26:1: sql_insert : INSERT INTO table '\\(' insertColumn ( ',' insertColumn )* '\\)' VALUES '\\(' ( PRE_SET | ( ',' PRE_SET ) )* '\\)' ;
    public final void sql_insert() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:27:2: ( INSERT INTO table '\\(' insertColumn ( ',' insertColumn )* '\\)' VALUES '\\(' ( PRE_SET | ( ',' PRE_SET ) )* '\\)' )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:28:2: INSERT INTO table '\\(' insertColumn ( ',' insertColumn )* '\\)' VALUES '\\(' ( PRE_SET | ( ',' PRE_SET ) )* '\\)'
            {
            match(input,INSERT,FOLLOW_INSERT_in_sql_insert40); 

            match(input,INTO,FOLLOW_INTO_in_sql_insert42); 

            pushFollow(FOLLOW_table_in_sql_insert44);
            table();

            state._fsp--;


            match(input,71,FOLLOW_71_in_sql_insert46); 

            pushFollow(FOLLOW_insertColumn_in_sql_insert48);
            insertColumn();

            state._fsp--;


            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:28:38: ( ',' insertColumn )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==63) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:28:39: ',' insertColumn
            	    {
            	    match(input,63,FOLLOW_63_in_sql_insert51); 

            	    pushFollow(FOLLOW_insertColumn_in_sql_insert53);
            	    insertColumn();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,72,FOLLOW_72_in_sql_insert57); 

            match(input,VALUES,FOLLOW_VALUES_in_sql_insert59); 

            match(input,71,FOLLOW_71_in_sql_insert61); 

            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:28:75: ( PRE_SET | ( ',' PRE_SET ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PRE_SET) ) {
                    alt3=1;
                }
                else if ( (LA3_0==63) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:28:76: PRE_SET
            	    {
            	    match(input,PRE_SET,FOLLOW_PRE_SET_in_sql_insert64); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:28:84: ( ',' PRE_SET )
            	    {
            	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:28:84: ( ',' PRE_SET )
            	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:28:85: ',' PRE_SET
            	    {
            	    match(input,63,FOLLOW_63_in_sql_insert67); 

            	    match(input,PRE_SET,FOLLOW_PRE_SET_in_sql_insert69); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input,72,FOLLOW_72_in_sql_insert74); 

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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:30:1: sql_delete : DELETE FROM table where ;
    public final void sql_delete() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:31:2: ( DELETE FROM table where )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:32:2: DELETE FROM table where
            {
            match(input,DELETE,FOLLOW_DELETE_in_sql_delete86); 

            match(input,FROM,FOLLOW_FROM_in_sql_delete88); 

            pushFollow(FOLLOW_table_in_sql_delete90);
            table();

            state._fsp--;


            pushFollow(FOLLOW_where_in_sql_delete92);
            where();

            state._fsp--;


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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:34:1: sql_update : UPDATE table SET kv ( ',' kv )* where ;
    public final void sql_update() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:35:2: ( UPDATE table SET kv ( ',' kv )* where )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:36:2: UPDATE table SET kv ( ',' kv )* where
            {
            match(input,UPDATE,FOLLOW_UPDATE_in_sql_update104); 

            pushFollow(FOLLOW_table_in_sql_update106);
            table();

            state._fsp--;


            match(input,SET,FOLLOW_SET_in_sql_update108); 

            pushFollow(FOLLOW_kv_in_sql_update110);
            kv();

            state._fsp--;


            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:36:22: ( ',' kv )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==63) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:36:23: ',' kv
            	    {
            	    match(input,63,FOLLOW_63_in_sql_update113); 

            	    pushFollow(FOLLOW_kv_in_sql_update115);
            	    kv();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            pushFollow(FOLLOW_where_in_sql_update119);
            where();

            state._fsp--;


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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:38:1: sql_select : SELECT select_columns FROM ( ( sql_select_tables where ( orderby | groupby | having )* ) | ( '\\(' sql_select '\\)' ) ) ;
    public final void sql_select() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:39:2: ( SELECT select_columns FROM ( ( sql_select_tables where ( orderby | groupby | having )* ) | ( '\\(' sql_select '\\)' ) ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:40:2: SELECT select_columns FROM ( ( sql_select_tables where ( orderby | groupby | having )* ) | ( '\\(' sql_select '\\)' ) )
            {
            match(input,SELECT,FOLLOW_SELECT_in_sql_select131); 

            pushFollow(FOLLOW_select_columns_in_sql_select133);
            select_columns();

            state._fsp--;


            match(input,FROM,FOLLOW_FROM_in_sql_select135); 

            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:41:2: ( ( sql_select_tables where ( orderby | groupby | having )* ) | ( '\\(' sql_select '\\)' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==BASIC_NAME) ) {
                alt6=1;
            }
            else if ( (LA6_0==71) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:42:2: ( sql_select_tables where ( orderby | groupby | having )* )
                    {
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:42:2: ( sql_select_tables where ( orderby | groupby | having )* )
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:42:3: sql_select_tables where ( orderby | groupby | having )*
                    {
                    pushFollow(FOLLOW_sql_select_tables_in_sql_select143);
                    sql_select_tables();

                    state._fsp--;


                    pushFollow(FOLLOW_where_in_sql_select145);
                    where();

                    state._fsp--;


                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:42:27: ( orderby | groupby | having )*
                    loop5:
                    do {
                        int alt5=4;
                        switch ( input.LA(1) ) {
                        case ORDER:
                            {
                            alt5=1;
                            }
                            break;
                        case GROUP:
                            {
                            alt5=2;
                            }
                            break;
                        case HAVING:
                            {
                            alt5=3;
                            }
                            break;

                        }

                        switch (alt5) {
                    	case 1 :
                    	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:42:28: orderby
                    	    {
                    	    pushFollow(FOLLOW_orderby_in_sql_select148);
                    	    orderby();

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:42:36: groupby
                    	    {
                    	    pushFollow(FOLLOW_groupby_in_sql_select150);
                    	    groupby();

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 3 :
                    	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:42:44: having
                    	    {
                    	    pushFollow(FOLLOW_having_in_sql_select152);
                    	    having();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:44:2: ( '\\(' sql_select '\\)' )
                    {
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:44:2: ( '\\(' sql_select '\\)' )
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:44:3: '\\(' sql_select '\\)'
                    {
                    match(input,71,FOLLOW_71_in_sql_select162); 

                    pushFollow(FOLLOW_sql_select_in_sql_select164);
                    sql_select();

                    state._fsp--;


                    match(input,72,FOLLOW_72_in_sql_select166); 

                    }


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
    // $ANTLR end "sql_select"



    // $ANTLR start "sql_select_tables"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:48:1: sql_select_tables : tables ( ( FULL | CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '=' column_name )? )* ;
    public final void sql_select_tables() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:49:2: ( tables ( ( FULL | CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '=' column_name )? )* )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:50:2: tables ( ( FULL | CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '=' column_name )? )*
            {
            pushFollow(FOLLOW_tables_in_sql_select_tables183);
            tables();

            state._fsp--;


            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:51:2: ( ( FULL | CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '=' column_name )? )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==CROSS||LA8_0==FULL||LA8_0==INNER||LA8_0==LEFT||LA8_0==RIGHT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:51:3: ( FULL | CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '=' column_name )?
            	    {
            	    if ( input.LA(1)==CROSS||input.LA(1)==FULL||input.LA(1)==INNER||input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    match(input,JOIN,FOLLOW_JOIN_in_sql_select_tables200); 

            	    pushFollow(FOLLOW_table_in_sql_select_tables202);
            	    table();

            	    state._fsp--;


            	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:51:44: ( ON column_name '=' column_name )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==ON) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:51:45: ON column_name '=' column_name
            	            {
            	            match(input,ON,FOLLOW_ON_in_sql_select_tables205); 

            	            pushFollow(FOLLOW_column_name_in_sql_select_tables207);
            	            column_name();

            	            state._fsp--;


            	            match(input,68,FOLLOW_68_in_sql_select_tables209); 

            	            pushFollow(FOLLOW_column_name_in_sql_select_tables211);
            	            column_name();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "sql_select_tables"



    // $ANTLR start "where"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:54:1: where : ( WHERE sql_select_where_kv_all )? ;
    public final void where() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:55:2: ( ( WHERE sql_select_where_kv_all )? )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:56:2: ( WHERE sql_select_where_kv_all )?
            {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:56:2: ( WHERE sql_select_where_kv_all )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==WHERE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:56:3: WHERE sql_select_where_kv_all
                    {
                    match(input,WHERE,FOLLOW_WHERE_in_where229); 

                    pushFollow(FOLLOW_sql_select_where_kv_all_in_where231);
                    sql_select_where_kv_all();

                    state._fsp--;


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
    // $ANTLR end "where"



    // $ANTLR start "sql_select_where_kv"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:59:1: sql_select_where_kv : kv ( and_or ( kv | ( '\\(' kv ( and_or sql_select_where_kv ) '\\)' ) | ( column_name op '\\(' sql_select '\\)' ) | ( '\\(' column_name op '\\(' sql_select '\\)' '\\)' ) ) )* ;
    public final void sql_select_where_kv() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:60:2: ( kv ( and_or ( kv | ( '\\(' kv ( and_or sql_select_where_kv ) '\\)' ) | ( column_name op '\\(' sql_select '\\)' ) | ( '\\(' column_name op '\\(' sql_select '\\)' '\\)' ) ) )* )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:61:2: kv ( and_or ( kv | ( '\\(' kv ( and_or sql_select_where_kv ) '\\)' ) | ( column_name op '\\(' sql_select '\\)' ) | ( '\\(' column_name op '\\(' sql_select '\\)' '\\)' ) ) )*
            {
            pushFollow(FOLLOW_kv_in_sql_select_where_kv246);
            kv();

            state._fsp--;


            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:62:2: ( and_or ( kv | ( '\\(' kv ( and_or sql_select_where_kv ) '\\)' ) | ( column_name op '\\(' sql_select '\\)' ) | ( '\\(' column_name op '\\(' sql_select '\\)' '\\)' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AND||LA11_0==OR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:63:2: and_or ( kv | ( '\\(' kv ( and_or sql_select_where_kv ) '\\)' ) | ( column_name op '\\(' sql_select '\\)' ) | ( '\\(' column_name op '\\(' sql_select '\\)' '\\)' ) )
            	    {
            	    pushFollow(FOLLOW_and_or_in_sql_select_where_kv252);
            	    and_or();

            	    state._fsp--;


            	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:64:3: ( kv | ( '\\(' kv ( and_or sql_select_where_kv ) '\\)' ) | ( column_name op '\\(' sql_select '\\)' ) | ( '\\(' column_name op '\\(' sql_select '\\)' '\\)' ) )
            	    int alt10=4;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==BASIC_NAME) ) {
            	        int LA10_1 = input.LA(2);

            	        if ( (LA10_1==64) ) {
            	            int LA10_3 = input.LA(3);

            	            if ( (LA10_3==BASIC_NAME) ) {
            	                int LA10_6 = input.LA(4);

            	                if ( (LA10_6==EXISTS||LA10_6==IN||LA10_6==61||(LA10_6 >= 65 && LA10_6 <= 70)) ) {
            	                    int LA10_4 = input.LA(5);

            	                    if ( (LA10_4==BASIC_NAME||LA10_4==PRE_SET||LA10_4==TEXT_STRING) ) {
            	                        alt10=1;
            	                    }
            	                    else if ( (LA10_4==71) ) {
            	                        int LA10_8 = input.LA(6);

            	                        if ( (LA10_8==PRE_SET||LA10_8==TEXT_STRING) ) {
            	                            alt10=1;
            	                        }
            	                        else if ( (LA10_8==SELECT) ) {
            	                            alt10=3;
            	                        }
            	                        else {
            	                            NoViableAltException nvae =
            	                                new NoViableAltException("", 10, 8, input);

            	                            throw nvae;

            	                        }
            	                    }
            	                    else {
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("", 10, 4, input);

            	                        throw nvae;

            	                    }
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 10, 6, input);

            	                    throw nvae;

            	                }
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 10, 3, input);

            	                throw nvae;

            	            }
            	        }
            	        else if ( (LA10_1==EXISTS||LA10_1==IN||LA10_1==61||(LA10_1 >= 65 && LA10_1 <= 70)) ) {
            	            int LA10_4 = input.LA(3);

            	            if ( (LA10_4==BASIC_NAME||LA10_4==PRE_SET||LA10_4==TEXT_STRING) ) {
            	                alt10=1;
            	            }
            	            else if ( (LA10_4==71) ) {
            	                int LA10_8 = input.LA(4);

            	                if ( (LA10_8==PRE_SET||LA10_8==TEXT_STRING) ) {
            	                    alt10=1;
            	                }
            	                else if ( (LA10_8==SELECT) ) {
            	                    alt10=3;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 10, 8, input);

            	                    throw nvae;

            	                }
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 10, 4, input);

            	                throw nvae;

            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 10, 1, input);

            	            throw nvae;

            	        }
            	    }
            	    else if ( (LA10_0==71) ) {
            	        int LA10_2 = input.LA(2);

            	        if ( (LA10_2==BASIC_NAME) ) {
            	            int LA10_5 = input.LA(3);

            	            if ( (LA10_5==64) ) {
            	                int LA10_9 = input.LA(4);

            	                if ( (LA10_9==BASIC_NAME) ) {
            	                    int LA10_12 = input.LA(5);

            	                    if ( (LA10_12==EXISTS||LA10_12==IN||LA10_12==61||(LA10_12 >= 65 && LA10_12 <= 70)) ) {
            	                        int LA10_10 = input.LA(6);

            	                        if ( (LA10_10==BASIC_NAME||LA10_10==PRE_SET||LA10_10==TEXT_STRING) ) {
            	                            alt10=2;
            	                        }
            	                        else if ( (LA10_10==71) ) {
            	                            int LA10_14 = input.LA(7);

            	                            if ( (LA10_14==PRE_SET||LA10_14==TEXT_STRING) ) {
            	                                alt10=2;
            	                            }
            	                            else if ( (LA10_14==SELECT) ) {
            	                                alt10=4;
            	                            }
            	                            else {
            	                                NoViableAltException nvae =
            	                                    new NoViableAltException("", 10, 14, input);

            	                                throw nvae;

            	                            }
            	                        }
            	                        else {
            	                            NoViableAltException nvae =
            	                                new NoViableAltException("", 10, 10, input);

            	                            throw nvae;

            	                        }
            	                    }
            	                    else {
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("", 10, 12, input);

            	                        throw nvae;

            	                    }
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 10, 9, input);

            	                    throw nvae;

            	                }
            	            }
            	            else if ( (LA10_5==EXISTS||LA10_5==IN||LA10_5==61||(LA10_5 >= 65 && LA10_5 <= 70)) ) {
            	                int LA10_10 = input.LA(4);

            	                if ( (LA10_10==BASIC_NAME||LA10_10==PRE_SET||LA10_10==TEXT_STRING) ) {
            	                    alt10=2;
            	                }
            	                else if ( (LA10_10==71) ) {
            	                    int LA10_14 = input.LA(5);

            	                    if ( (LA10_14==PRE_SET||LA10_14==TEXT_STRING) ) {
            	                        alt10=2;
            	                    }
            	                    else if ( (LA10_14==SELECT) ) {
            	                        alt10=4;
            	                    }
            	                    else {
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("", 10, 14, input);

            	                        throw nvae;

            	                    }
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 10, 10, input);

            	                    throw nvae;

            	                }
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 10, 5, input);

            	                throw nvae;

            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 10, 2, input);

            	            throw nvae;

            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:65:3: kv
            	            {
            	            pushFollow(FOLLOW_kv_in_sql_select_where_kv261);
            	            kv();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:67:3: ( '\\(' kv ( and_or sql_select_where_kv ) '\\)' )
            	            {
            	            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:67:3: ( '\\(' kv ( and_or sql_select_where_kv ) '\\)' )
            	            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:67:4: '\\(' kv ( and_or sql_select_where_kv ) '\\)'
            	            {
            	            match(input,71,FOLLOW_71_in_sql_select_where_kv270); 

            	            pushFollow(FOLLOW_kv_in_sql_select_where_kv272);
            	            kv();

            	            state._fsp--;


            	            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:67:12: ( and_or sql_select_where_kv )
            	            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:67:13: and_or sql_select_where_kv
            	            {
            	            pushFollow(FOLLOW_and_or_in_sql_select_where_kv275);
            	            and_or();

            	            state._fsp--;


            	            pushFollow(FOLLOW_sql_select_where_kv_in_sql_select_where_kv277);
            	            sql_select_where_kv();

            	            state._fsp--;


            	            }


            	            match(input,72,FOLLOW_72_in_sql_select_where_kv280); 

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:69:3: ( column_name op '\\(' sql_select '\\)' )
            	            {
            	            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:69:3: ( column_name op '\\(' sql_select '\\)' )
            	            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:69:4: column_name op '\\(' sql_select '\\)'
            	            {
            	            pushFollow(FOLLOW_column_name_in_sql_select_where_kv291);
            	            column_name();

            	            state._fsp--;


            	            pushFollow(FOLLOW_op_in_sql_select_where_kv293);
            	            op();

            	            state._fsp--;


            	            match(input,71,FOLLOW_71_in_sql_select_where_kv295); 

            	            pushFollow(FOLLOW_sql_select_in_sql_select_where_kv297);
            	            sql_select();

            	            state._fsp--;


            	            match(input,72,FOLLOW_72_in_sql_select_where_kv299); 

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:71:3: ( '\\(' column_name op '\\(' sql_select '\\)' '\\)' )
            	            {
            	            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:71:3: ( '\\(' column_name op '\\(' sql_select '\\)' '\\)' )
            	            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:71:4: '\\(' column_name op '\\(' sql_select '\\)' '\\)'
            	            {
            	            match(input,71,FOLLOW_71_in_sql_select_where_kv310); 

            	            pushFollow(FOLLOW_column_name_in_sql_select_where_kv312);
            	            column_name();

            	            state._fsp--;


            	            pushFollow(FOLLOW_op_in_sql_select_where_kv314);
            	            op();

            	            state._fsp--;


            	            match(input,71,FOLLOW_71_in_sql_select_where_kv316); 

            	            pushFollow(FOLLOW_sql_select_in_sql_select_where_kv318);
            	            sql_select();

            	            state._fsp--;


            	            match(input,72,FOLLOW_72_in_sql_select_where_kv320); 

            	            match(input,72,FOLLOW_72_in_sql_select_where_kv322); 

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "sql_select_where_kv"



    // $ANTLR start "sql_select_where_kv_all"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:76:1: sql_select_where_kv_all : ( sql_select_where_kv | ( '\\(' sql_select_where_kv '\\)' ) );
    public final void sql_select_where_kv_all() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:77:2: ( sql_select_where_kv | ( '\\(' sql_select_where_kv '\\)' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==BASIC_NAME) ) {
                alt12=1;
            }
            else if ( (LA12_0==71) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:78:2: sql_select_where_kv
                    {
                    pushFollow(FOLLOW_sql_select_where_kv_in_sql_select_where_kv_all345);
                    sql_select_where_kv();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:80:2: ( '\\(' sql_select_where_kv '\\)' )
                    {
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:80:2: ( '\\(' sql_select_where_kv '\\)' )
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:80:3: '\\(' sql_select_where_kv '\\)'
                    {
                    match(input,71,FOLLOW_71_in_sql_select_where_kv_all352); 

                    pushFollow(FOLLOW_sql_select_where_kv_in_sql_select_where_kv_all354);
                    sql_select_where_kv();

                    state._fsp--;


                    match(input,72,FOLLOW_72_in_sql_select_where_kv_all356); 

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
    // $ANTLR end "sql_select_where_kv_all"



    // $ANTLR start "func"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:83:1: func : BASIC_NAME '\\(' ( BASIC_NAME | '*' ) '\\)' ;
    public final void func() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:84:2: ( BASIC_NAME '\\(' ( BASIC_NAME | '*' ) '\\)' )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:85:2: BASIC_NAME '\\(' ( BASIC_NAME | '*' ) '\\)'
            {
            match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_func369); 

            match(input,71,FOLLOW_71_in_func371); 

            if ( input.LA(1)==BASIC_NAME||input.LA(1)==62 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,72,FOLLOW_72_in_func379); 

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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:88:1: func_and_alias : func ( ( AS )? BASIC_NAME )? ;
    public final void func_and_alias() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:89:2: ( func ( ( AS )? BASIC_NAME )? )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:90:2: func ( ( AS )? BASIC_NAME )?
            {
            pushFollow(FOLLOW_func_in_func_and_alias393);
            func();

            state._fsp--;


            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:90:7: ( ( AS )? BASIC_NAME )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==AS||LA14_0==BASIC_NAME) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:90:8: ( AS )? BASIC_NAME
                    {
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:90:8: ( AS )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==AS) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:90:8: AS
                            {
                            match(input,AS,FOLLOW_AS_in_func_and_alias396); 

                            }
                            break;

                    }


                    match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_func_and_alias399); 

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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:93:1: select_column_and_alias : column_name ( ( AS )? BASIC_NAME )? ;
    public final void select_column_and_alias() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:94:2: ( column_name ( ( AS )? BASIC_NAME )? )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:95:2: column_name ( ( AS )? BASIC_NAME )?
            {
            pushFollow(FOLLOW_column_name_in_select_column_and_alias413);
            column_name();

            state._fsp--;


            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:95:14: ( ( AS )? BASIC_NAME )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==AS||LA16_0==BASIC_NAME) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:95:15: ( AS )? BASIC_NAME
                    {
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:95:15: ( AS )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==AS) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:95:15: AS
                            {
                            match(input,AS,FOLLOW_AS_in_select_column_and_alias416); 

                            }
                            break;

                    }


                    match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_select_column_and_alias419); 

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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:98:1: select_column : ( select_column_and_alias | func_and_alias | '*' );
    public final void select_column() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:99:2: ( select_column_and_alias | func_and_alias | '*' )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==BASIC_NAME) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==71) ) {
                    alt17=2;
                }
                else if ( (LA17_1==AS||LA17_1==BASIC_NAME||LA17_1==FROM||(LA17_1 >= 63 && LA17_1 <= 64)) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA17_0==62) ) {
                alt17=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:100:2: select_column_and_alias
                    {
                    pushFollow(FOLLOW_select_column_and_alias_in_select_column433);
                    select_column_and_alias();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:100:26: func_and_alias
                    {
                    pushFollow(FOLLOW_func_and_alias_in_select_column435);
                    func_and_alias();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:100:41: '*'
                    {
                    match(input,62,FOLLOW_62_in_select_column437); 

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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:103:1: select_columns : select_column ( ',' select_column )* ;
    public final void select_columns() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:104:2: ( select_column ( ',' select_column )* )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:105:2: select_column ( ',' select_column )*
            {
            pushFollow(FOLLOW_select_column_in_select_columns450);
            select_column();

            state._fsp--;


            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:105:16: ( ',' select_column )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==63) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:105:17: ',' select_column
            	    {
            	    match(input,63,FOLLOW_63_in_select_columns453); 

            	    pushFollow(FOLLOW_select_column_in_select_columns455);
            	    select_column();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:110:1: and_or : ( AND | OR );
    public final void and_or() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:110:8: ( AND | OR )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:114:1: table : table_name ( ( AS )? alias )? ;
    public final void table() throws RecognitionException {
        AntlrV3SQLParser.table_name_return table_name1 =null;

        AntlrV3SQLParser.alias_return alias2 =null;


        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:114:7: ( table_name ( ( AS )? alias )? )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:115:2: table_name ( ( AS )? alias )?
            {
            pushFollow(FOLLOW_table_name_in_table489);
            table_name1=table_name();

            state._fsp--;


            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:115:13: ( ( AS )? alias )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==AS||LA20_0==BASIC_NAME) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:115:14: ( AS )? alias
                    {
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:115:14: ( AS )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==AS) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:115:15: AS
                            {
                            match(input,AS,FOLLOW_AS_in_table493); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_alias_in_table497);
                    alias2=alias();

                    state._fsp--;


                    }
                    break;

            }



//            	tables.add(new String[]{(table_name1!=null?input.toString(table_name1.start,table_name1.stop):null),(alias2!=null?input.toString(alias2.start,alias2.stop):null)}); 
            if (this.antlrParserDelegate != null) {
                                            this.antlrParserDelegate.onFindTable(
                                                    (table_name1 != null ? input.toString(table_name1.start,
                                                            table_name1.stop) : null),
                                                    (alias2 != null ? input.toString(alias2.start,
                                                            alias2.stop) : null));
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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:128:1: tables : ( table ( ',' table )* ) ;
    public final void tables() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:128:8: ( ( table ( ',' table )* ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:129:2: ( table ( ',' table )* )
            {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:129:2: ( table ( ',' table )* )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:129:3: table ( ',' table )*
            {
            pushFollow(FOLLOW_table_in_tables513);
            table();

            state._fsp--;


            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:129:9: ( ',' table )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==63) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:129:10: ',' table
            	    {
            	    match(input,63,FOLLOW_63_in_tables516); 

            	    pushFollow(FOLLOW_table_in_tables518);
            	    table();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:132:1: table_name : BASIC_NAME ( ( '.' ) BASIC_NAME )? ;
    public final AntlrV3SQLParser.table_name_return table_name() throws RecognitionException {
        AntlrV3SQLParser.table_name_return retval = new AntlrV3SQLParser.table_name_return();
        retval.start = input.LT(1);


        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:133:2: ( BASIC_NAME ( ( '.' ) BASIC_NAME )? )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:134:2: BASIC_NAME ( ( '.' ) BASIC_NAME )?
            {
            match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_table_name534); 

            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:134:13: ( ( '.' ) BASIC_NAME )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==64) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:134:14: ( '.' ) BASIC_NAME
                    {
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:134:14: ( '.' )
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:134:15: '.'
                    {
                    match(input,64,FOLLOW_64_in_table_name538); 

                    }


                    match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_table_name541); 

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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:137:1: alias : BASIC_NAME ;
    public final AntlrV3SQLParser.alias_return alias() throws RecognitionException {
        AntlrV3SQLParser.alias_return retval = new AntlrV3SQLParser.alias_return();
        retval.start = input.LT(1);


        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:137:7: ( BASIC_NAME )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:138:2: BASIC_NAME
            {
            match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_alias554); 

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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:141:1: column_name : BASIC_NAME ( ( '.' ) BASIC_NAME )? ;
    public final AntlrV3SQLParser.column_name_return column_name() throws RecognitionException {
        AntlrV3SQLParser.column_name_return retval = new AntlrV3SQLParser.column_name_return();
        retval.start = input.LT(1);


        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:142:2: ( BASIC_NAME ( ( '.' ) BASIC_NAME )? )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:143:2: BASIC_NAME ( ( '.' ) BASIC_NAME )?
            {
            match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_column_name566); 

            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:143:13: ( ( '.' ) BASIC_NAME )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==64) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:143:14: ( '.' ) BASIC_NAME
                    {
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:143:14: ( '.' )
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:143:15: '.'
                    {
                    match(input,64,FOLLOW_64_in_column_name570); 

                    }


                    match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_column_name573); 

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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:146:1: insertColumn : column_name ;
    public final void insertColumn() throws RecognitionException {
        AntlrV3SQLParser.column_name_return column_name3 =null;


        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:147:2: ( column_name )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:148:2: column_name
            {
            pushFollow(FOLLOW_column_name_in_insertColumn587);
            column_name3=column_name();

            state._fsp--;



//            	colExprs.add(new String[]{(column_name3!=null?input.toString(column_name3.start,column_name3.stop):null),"="});
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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:160:1: kv : ( ( column_name op ( PRE_SET | '\\(' PRE_SET '\\)' ) ) | ( column_name op ( TEXT_STRING | '\\(' TEXT_STRING '\\)' ) ) | column_name op column_name | column_name op func2 );
    public final void kv() throws RecognitionException {
        AntlrV3SQLParser.column_name_return column_name4 =null;

        AntlrV3SQLParser.op_return op5 =null;


        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:160:4: ( ( column_name op ( PRE_SET | '\\(' PRE_SET '\\)' ) ) | ( column_name op ( TEXT_STRING | '\\(' TEXT_STRING '\\)' ) ) | column_name op column_name | column_name op func2 )
            int alt26=4;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==BASIC_NAME) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==64) ) {
                    int LA26_2 = input.LA(3);

                    if ( (LA26_2==BASIC_NAME) ) {
                        int LA26_4 = input.LA(4);

                        if ( (LA26_4==EXISTS||LA26_4==IN||LA26_4==61||(LA26_4 >= 65 && LA26_4 <= 70)) ) {
                            switch ( input.LA(5) ) {
                            case PRE_SET:
                                {
                                alt26=1;
                                }
                                break;
                            case 71:
                                {
                                int LA26_6 = input.LA(6);

                                if ( (LA26_6==PRE_SET) ) {
                                    alt26=1;
                                }
                                else if ( (LA26_6==TEXT_STRING) ) {
                                    alt26=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 26, 6, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case TEXT_STRING:
                                {
                                alt26=2;
                                }
                                break;
                            case BASIC_NAME:
                                {
                                int LA26_8 = input.LA(6);

                                if ( (LA26_8==71) ) {
                                    alt26=4;
                                }
                                else if ( (LA26_8==EOF||LA26_8==AND||LA26_8==GROUP||LA26_8==HAVING||(LA26_8 >= OR && LA26_8 <= ORDER)||LA26_8==WHERE||(LA26_8 >= 63 && LA26_8 <= 64)||LA26_8==72) ) {
                                    alt26=3;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 26, 8, input);

                                    throw nvae;

                                }
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 26, 3, input);

                                throw nvae;

                            }

                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 2, input);

                        throw nvae;

                    }
                }
                else if ( (LA26_1==EXISTS||LA26_1==IN||LA26_1==61||(LA26_1 >= 65 && LA26_1 <= 70)) ) {
                    switch ( input.LA(3) ) {
                    case PRE_SET:
                        {
                        alt26=1;
                        }
                        break;
                    case 71:
                        {
                        int LA26_6 = input.LA(4);

                        if ( (LA26_6==PRE_SET) ) {
                            alt26=1;
                        }
                        else if ( (LA26_6==TEXT_STRING) ) {
                            alt26=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 6, input);

                            throw nvae;

                        }
                        }
                        break;
                    case TEXT_STRING:
                        {
                        alt26=2;
                        }
                        break;
                    case BASIC_NAME:
                        {
                        int LA26_8 = input.LA(4);

                        if ( (LA26_8==71) ) {
                            alt26=4;
                        }
                        else if ( (LA26_8==EOF||LA26_8==AND||LA26_8==GROUP||LA26_8==HAVING||(LA26_8 >= OR && LA26_8 <= ORDER)||LA26_8==WHERE||(LA26_8 >= 63 && LA26_8 <= 64)||LA26_8==72) ) {
                            alt26=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 8, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 3, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:161:2: ( column_name op ( PRE_SET | '\\(' PRE_SET '\\)' ) )
                    {
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:161:2: ( column_name op ( PRE_SET | '\\(' PRE_SET '\\)' ) )
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:161:3: column_name op ( PRE_SET | '\\(' PRE_SET '\\)' )
                    {
                    pushFollow(FOLLOW_column_name_in_kv602);
                    column_name4=column_name();

                    state._fsp--;


                    pushFollow(FOLLOW_op_in_kv604);
                    op5=op();

                    state._fsp--;


                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:161:18: ( PRE_SET | '\\(' PRE_SET '\\)' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==PRE_SET) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==71) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;

                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:161:19: PRE_SET
                            {
                            match(input,PRE_SET,FOLLOW_PRE_SET_in_kv607); 

                            }
                            break;
                        case 2 :
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:161:27: '\\(' PRE_SET '\\)'
                            {
                            match(input,71,FOLLOW_71_in_kv609); 

                            match(input,PRE_SET,FOLLOW_PRE_SET_in_kv611); 

                            match(input,72,FOLLOW_72_in_kv613); 

                            }
                            break;

                    }


                    }



//                    	colExprs.add(new String[]{(column_name4!=null?input.toString(column_name4.start,column_name4.stop):null),(op5!=null?input.toString(op5.start,op5.stop):null)});
                    	if (this.antlrParserDelegate != null) {
                                                            this.antlrParserDelegate.onFindColExper(
                                                                    (column_name4!=null?input.toString(column_name4.start,column_name4.stop):null),
                                                                    (op5!=null?input.toString(op5.start,op5.stop):null));
                                                        }
                    	

                    }
                    break;
                case 2 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:173:2: ( column_name op ( TEXT_STRING | '\\(' TEXT_STRING '\\)' ) )
                    {
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:173:2: ( column_name op ( TEXT_STRING | '\\(' TEXT_STRING '\\)' ) )
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:173:3: column_name op ( TEXT_STRING | '\\(' TEXT_STRING '\\)' )
                    {
                    pushFollow(FOLLOW_column_name_in_kv625);
                    column_name();

                    state._fsp--;


                    pushFollow(FOLLOW_op_in_kv627);
                    op();

                    state._fsp--;


                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:173:18: ( TEXT_STRING | '\\(' TEXT_STRING '\\)' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==TEXT_STRING) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==71) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;

                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:173:19: TEXT_STRING
                            {
                            match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_kv630); 

                            }
                            break;
                        case 2 :
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:173:31: '\\(' TEXT_STRING '\\)'
                            {
                            match(input,71,FOLLOW_71_in_kv632); 

                            match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_kv634); 

                            match(input,72,FOLLOW_72_in_kv636); 

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:175:2: column_name op column_name
                    {
                    pushFollow(FOLLOW_column_name_in_kv644);
                    column_name();

                    state._fsp--;


                    pushFollow(FOLLOW_op_in_kv646);
                    op();

                    state._fsp--;


                    pushFollow(FOLLOW_column_name_in_kv648);
                    column_name();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:177:2: column_name op func2
                    {
                    pushFollow(FOLLOW_column_name_in_kv654);
                    column_name();

                    state._fsp--;


                    pushFollow(FOLLOW_op_in_kv656);
                    op();

                    state._fsp--;


                    pushFollow(FOLLOW_func2_in_kv658);
                    func2();

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
    // $ANTLR end "kv"



    // $ANTLR start "func2"
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:180:1: func2 : BASIC_NAME '\\(' ( ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING ) )* )? '\\)' ;
    public final void func2() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:180:7: ( BASIC_NAME '\\(' ( ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING ) )* )? '\\)' )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:181:2: BASIC_NAME '\\(' ( ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING ) )* )? '\\)'
            {
            match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_func2669); 

            match(input,71,FOLLOW_71_in_func2673); 

            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:183:2: ( ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==BASIC_NAME||LA30_0==TEXT_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:184:2: ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING ) )*
                    {
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:184:2: ( column_name | TEXT_STRING )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==BASIC_NAME) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==TEXT_STRING) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;

                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:184:3: column_name
                            {
                            pushFollow(FOLLOW_column_name_in_func2681);
                            column_name();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:184:15: TEXT_STRING
                            {
                            match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_func2683); 

                            }
                            break;

                    }


                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:184:28: ( ',' ( column_name | TEXT_STRING ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==63) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:184:29: ',' ( column_name | TEXT_STRING )
                    	    {
                    	    match(input,63,FOLLOW_63_in_func2687); 

                    	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:184:33: ( column_name | TEXT_STRING )
                    	    int alt28=2;
                    	    int LA28_0 = input.LA(1);

                    	    if ( (LA28_0==BASIC_NAME) ) {
                    	        alt28=1;
                    	    }
                    	    else if ( (LA28_0==TEXT_STRING) ) {
                    	        alt28=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 28, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt28) {
                    	        case 1 :
                    	            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:184:34: column_name
                    	            {
                    	            pushFollow(FOLLOW_column_name_in_func2690);
                    	            column_name();

                    	            state._fsp--;


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:184:46: TEXT_STRING
                    	            {
                    	            match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_func2692); 

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,72,FOLLOW_72_in_func2702); 

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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:189:1: op : ( '=' | '>' | '>=' | '<' | '<=' | '!=' | '<>' | IN | EXISTS ) ;
    public final AntlrV3SQLParser.op_return op() throws RecognitionException {
        AntlrV3SQLParser.op_return retval = new AntlrV3SQLParser.op_return();
        retval.start = input.LT(1);


        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:190:2: ( ( '=' | '>' | '>=' | '<' | '<=' | '!=' | '<>' | IN | EXISTS ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
            {
            if ( input.LA(1)==EXISTS||input.LA(1)==IN||input.LA(1)==61||(input.LA(1) >= 65 && input.LA(1) <= 70) ) {
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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:194:1: orderby : ORDER BY column_name ( DESC | ASC )? ( ',' column_name ( DESC | ASC )? )* ;
    public final void orderby() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:194:9: ( ORDER BY column_name ( DESC | ASC )? ( ',' column_name ( DESC | ASC )? )* )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:195:2: ORDER BY column_name ( DESC | ASC )? ( ',' column_name ( DESC | ASC )? )*
            {
            match(input,ORDER,FOLLOW_ORDER_in_orderby744); 

            match(input,BY,FOLLOW_BY_in_orderby746); 

            pushFollow(FOLLOW_column_name_in_orderby748);
            column_name();

            state._fsp--;


            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:195:23: ( DESC | ASC )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==ASC||LA31_0==DESC) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
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


            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:195:35: ( ',' column_name ( DESC | ASC )? )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==63) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:195:36: ',' column_name ( DESC | ASC )?
            	    {
            	    match(input,63,FOLLOW_63_in_orderby758); 

            	    pushFollow(FOLLOW_column_name_in_orderby760);
            	    column_name();

            	    state._fsp--;


            	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:195:52: ( DESC | ASC )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==ASC||LA32_0==DESC) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
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
            	    break loop33;
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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:198:1: groupby : GROUP BY column_name ( ',' column_name )* ;
    public final void groupby() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:198:9: ( GROUP BY column_name ( ',' column_name )* )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:199:2: GROUP BY column_name ( ',' column_name )*
            {
            match(input,GROUP,FOLLOW_GROUP_in_groupby781); 

            match(input,BY,FOLLOW_BY_in_groupby783); 

            pushFollow(FOLLOW_column_name_in_groupby785);
            column_name();

            state._fsp--;


            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:199:23: ( ',' column_name )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==63) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:199:24: ',' column_name
            	    {
            	    match(input,63,FOLLOW_63_in_groupby788); 

            	    pushFollow(FOLLOW_column_name_in_groupby790);
            	    column_name();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:202:1: having : HAVING ( column_name | func ) op ( column_name | func | TEXT_STRING | PRE_SET ) ;
    public final void having() throws RecognitionException {
        try {
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:202:8: ( HAVING ( column_name | func ) op ( column_name | func | TEXT_STRING | PRE_SET ) )
            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:203:2: HAVING ( column_name | func ) op ( column_name | func | TEXT_STRING | PRE_SET )
            {
            match(input,HAVING,FOLLOW_HAVING_in_having803); 

            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:203:9: ( column_name | func )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==BASIC_NAME) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==71) ) {
                    alt35=2;
                }
                else if ( (LA35_1==EXISTS||LA35_1==IN||LA35_1==61||(LA35_1 >= 64 && LA35_1 <= 70)) ) {
                    alt35=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:203:10: column_name
                    {
                    pushFollow(FOLLOW_column_name_in_having806);
                    column_name();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:203:22: func
                    {
                    pushFollow(FOLLOW_func_in_having808);
                    func();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_op_in_having811);
            op();

            state._fsp--;


            // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:203:31: ( column_name | func | TEXT_STRING | PRE_SET )
            int alt36=4;
            switch ( input.LA(1) ) {
            case BASIC_NAME:
                {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==71) ) {
                    alt36=2;
                }
                else if ( (LA36_1==EOF||LA36_1==GROUP||LA36_1==HAVING||LA36_1==ORDER||LA36_1==64||LA36_1==72) ) {
                    alt36=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;

                }
                }
                break;
            case TEXT_STRING:
                {
                alt36=3;
                }
                break;
            case PRE_SET:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:203:32: column_name
                    {
                    pushFollow(FOLLOW_column_name_in_having814);
                    column_name();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:203:44: func
                    {
                    pushFollow(FOLLOW_func_in_having816);
                    func();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:203:49: TEXT_STRING
                    {
                    match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_having818); 

                    }
                    break;
                case 4 :
                    // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:203:61: PRE_SET
                    {
                    match(input,PRE_SET,FOLLOW_PRE_SET_in_having820); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_sql_insert_in_start23 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_delete_in_start25 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_update_in_start27 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_select_in_start29 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_sql_insert40 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_INTO_in_sql_insert42 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_table_in_sql_insert44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_sql_insert46 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_insertColumn_in_sql_insert48 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_63_in_sql_insert51 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_insertColumn_in_sql_insert53 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_sql_insert57 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_VALUES_in_sql_insert59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_sql_insert61 = new BitSet(new long[]{0x8000040000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_PRE_SET_in_sql_insert64 = new BitSet(new long[]{0x8000040000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_63_in_sql_insert67 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_PRE_SET_in_sql_insert69 = new BitSet(new long[]{0x8000040000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_sql_insert74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_sql_delete86 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_FROM_in_sql_delete88 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_table_in_sql_delete90 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_where_in_sql_delete92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_sql_update104 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_table_in_sql_update106 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SET_in_sql_update108 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_kv_in_sql_update110 = new BitSet(new long[]{0x8100000000000000L});
    public static final BitSet FOLLOW_63_in_sql_update113 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_kv_in_sql_update115 = new BitSet(new long[]{0x8100000000000000L});
    public static final BitSet FOLLOW_where_in_sql_update119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_sql_select131 = new BitSet(new long[]{0x4000000000000200L});
    public static final BitSet FOLLOW_select_columns_in_sql_select133 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_FROM_in_sql_select135 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000080L});
    public static final BitSet FOLLOW_sql_select_tables_in_sql_select143 = new BitSet(new long[]{0x0100010001400000L});
    public static final BitSet FOLLOW_where_in_sql_select145 = new BitSet(new long[]{0x0000010001400002L});
    public static final BitSet FOLLOW_orderby_in_sql_select148 = new BitSet(new long[]{0x0000010001400002L});
    public static final BitSet FOLLOW_groupby_in_sql_select150 = new BitSet(new long[]{0x0000010001400002L});
    public static final BitSet FOLLOW_having_in_sql_select152 = new BitSet(new long[]{0x0000010001400002L});
    public static final BitSet FOLLOW_71_in_sql_select162 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_sql_select_in_sql_select164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_sql_select166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tables_in_sql_select_tables183 = new BitSet(new long[]{0x0000200408101002L});
    public static final BitSet FOLLOW_set_in_sql_select_tables188 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_JOIN_in_sql_select_tables200 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_table_in_sql_select_tables202 = new BitSet(new long[]{0x0000204408101002L});
    public static final BitSet FOLLOW_ON_in_sql_select_tables205 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_column_name_in_sql_select_tables207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_sql_select_tables209 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_column_name_in_sql_select_tables211 = new BitSet(new long[]{0x0000200408101002L});
    public static final BitSet FOLLOW_WHERE_in_where229 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000080L});
    public static final BitSet FOLLOW_sql_select_where_kv_all_in_where231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kv_in_sql_select_where_kv246 = new BitSet(new long[]{0x0000008000000022L});
    public static final BitSet FOLLOW_and_or_in_sql_select_where_kv252 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000080L});
    public static final BitSet FOLLOW_kv_in_sql_select_where_kv261 = new BitSet(new long[]{0x0000008000000022L});
    public static final BitSet FOLLOW_71_in_sql_select_where_kv270 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_kv_in_sql_select_where_kv272 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_and_or_in_sql_select_where_kv275 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_sql_select_where_kv_in_sql_select_where_kv277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_sql_select_where_kv280 = new BitSet(new long[]{0x0000008000000022L});
    public static final BitSet FOLLOW_column_name_in_sql_select_where_kv291 = new BitSet(new long[]{0x2000000004020000L,0x000000000000007EL});
    public static final BitSet FOLLOW_op_in_sql_select_where_kv293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_sql_select_where_kv295 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_sql_select_in_sql_select_where_kv297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_sql_select_where_kv299 = new BitSet(new long[]{0x0000008000000022L});
    public static final BitSet FOLLOW_71_in_sql_select_where_kv310 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_column_name_in_sql_select_where_kv312 = new BitSet(new long[]{0x2000000004020000L,0x000000000000007EL});
    public static final BitSet FOLLOW_op_in_sql_select_where_kv314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_sql_select_where_kv316 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_sql_select_in_sql_select_where_kv318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_sql_select_where_kv320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_sql_select_where_kv322 = new BitSet(new long[]{0x0000008000000022L});
    public static final BitSet FOLLOW_sql_select_where_kv_in_sql_select_where_kv_all345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_sql_select_where_kv_all352 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_sql_select_where_kv_in_sql_select_where_kv_all354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_sql_select_where_kv_all356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASIC_NAME_in_func369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_func371 = new BitSet(new long[]{0x4000000000000200L});
    public static final BitSet FOLLOW_set_in_func373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_func379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_func_and_alias393 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_AS_in_func_and_alias396 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_BASIC_NAME_in_func_and_alias399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_select_column_and_alias413 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_AS_in_select_column_and_alias416 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_BASIC_NAME_in_select_column_and_alias419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_column_and_alias_in_select_column433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_and_alias_in_select_column435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_select_column437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_column_in_select_columns450 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_select_columns453 = new BitSet(new long[]{0x4000000000000200L});
    public static final BitSet FOLLOW_select_column_in_select_columns455 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_table_name_in_table489 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_AS_in_table493 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_alias_in_table497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_in_tables513 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_tables516 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_table_in_tables518 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_BASIC_NAME_in_table_name534 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_table_name538 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_BASIC_NAME_in_table_name541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASIC_NAME_in_alias554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASIC_NAME_in_column_name566 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_column_name570 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_BASIC_NAME_in_column_name573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_insertColumn587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_kv602 = new BitSet(new long[]{0x2000000004020000L,0x000000000000007EL});
    public static final BitSet FOLLOW_op_in_kv604 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PRE_SET_in_kv607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_kv609 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_PRE_SET_in_kv611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_kv613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_kv625 = new BitSet(new long[]{0x2000000004020000L,0x000000000000007EL});
    public static final BitSet FOLLOW_op_in_kv627 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_STRING_in_kv630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_kv632 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TEXT_STRING_in_kv634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_kv636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_kv644 = new BitSet(new long[]{0x2000000004020000L,0x000000000000007EL});
    public static final BitSet FOLLOW_op_in_kv646 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_column_name_in_kv648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_kv654 = new BitSet(new long[]{0x2000000004020000L,0x000000000000007EL});
    public static final BitSet FOLLOW_op_in_kv656 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_func2_in_kv658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASIC_NAME_in_func2669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_func2673 = new BitSet(new long[]{0x0004000000000200L,0x0000000000000100L});
    public static final BitSet FOLLOW_column_name_in_func2681 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_STRING_in_func2683 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_63_in_func2687 = new BitSet(new long[]{0x0004000000000200L});
    public static final BitSet FOLLOW_column_name_in_func2690 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_STRING_in_func2692 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_func2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_orderby744 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BY_in_orderby746 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_column_name_in_orderby748 = new BitSet(new long[]{0x8000000000008082L});
    public static final BitSet FOLLOW_63_in_orderby758 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_column_name_in_orderby760 = new BitSet(new long[]{0x8000000000008082L});
    public static final BitSet FOLLOW_GROUP_in_groupby781 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BY_in_groupby783 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_column_name_in_groupby785 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_groupby788 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_column_name_in_groupby790 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_HAVING_in_having803 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_column_name_in_having806 = new BitSet(new long[]{0x2000000004020000L,0x000000000000007EL});
    public static final BitSet FOLLOW_func_in_having808 = new BitSet(new long[]{0x2000000004020000L,0x000000000000007EL});
    public static final BitSet FOLLOW_op_in_having811 = new BitSet(new long[]{0x0004040000000200L});
    public static final BitSet FOLLOW_column_name_in_having814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_having816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_STRING_in_having818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRE_SET_in_having820 = new BitSet(new long[]{0x0000000000000002L});

}