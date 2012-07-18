package halo.dal.analysis.antlr.v3;

//$ANTLR 3.4 /Users/akwei/antlrpro/sql2/AntlrV3SQL.g 2012-07-18 01:04:24

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


// List<String[]> tables = new ArrayList<String[]>();
// List<String[]> colExprs=new ArrayList<String[]>();
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
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:30:1: sql_delete : DELETE FROM table ( WHERE kv ( and_or kv )* )? ;
 public final void sql_delete() throws RecognitionException {
     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:31:2: ( DELETE FROM table ( WHERE kv ( and_or kv )* )? )
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:32:2: DELETE FROM table ( WHERE kv ( and_or kv )* )?
         {
         match(input,DELETE,FOLLOW_DELETE_in_sql_delete86); 

         match(input,FROM,FOLLOW_FROM_in_sql_delete88); 

         pushFollow(FOLLOW_table_in_sql_delete90);
         table();

         state._fsp--;


         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:32:20: ( WHERE kv ( and_or kv )* )?
         int alt5=2;
         int LA5_0 = input.LA(1);

         if ( (LA5_0==WHERE) ) {
             alt5=1;
         }
         switch (alt5) {
             case 1 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:32:21: WHERE kv ( and_or kv )*
                 {
                 match(input,WHERE,FOLLOW_WHERE_in_sql_delete93); 

                 pushFollow(FOLLOW_kv_in_sql_delete95);
                 kv();

                 state._fsp--;


                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:32:30: ( and_or kv )*
                 loop4:
                 do {
                     int alt4=2;
                     int LA4_0 = input.LA(1);

                     if ( (LA4_0==AND||LA4_0==OR) ) {
                         alt4=1;
                     }


                     switch (alt4) {
                     case 1 :
                         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:32:31: and_or kv
                         {
                         pushFollow(FOLLOW_and_or_in_sql_delete98);
                         and_or();

                         state._fsp--;


                         pushFollow(FOLLOW_kv_in_sql_delete100);
                         kv();

                         state._fsp--;


                         }
                         break;

                     default :
                         break loop4;
                     }
                 } while (true);


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
 // $ANTLR end "sql_delete"



 // $ANTLR start "sql_update"
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:34:1: sql_update : UPDATE table SET kv ( ',' kv )* ( WHERE kv ( and_or kv )* )? ;
 public final void sql_update() throws RecognitionException {
     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:35:2: ( UPDATE table SET kv ( ',' kv )* ( WHERE kv ( and_or kv )* )? )
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:36:2: UPDATE table SET kv ( ',' kv )* ( WHERE kv ( and_or kv )* )?
         {
         match(input,UPDATE,FOLLOW_UPDATE_in_sql_update116); 

         pushFollow(FOLLOW_table_in_sql_update118);
         table();

         state._fsp--;


         match(input,SET,FOLLOW_SET_in_sql_update120); 

         pushFollow(FOLLOW_kv_in_sql_update122);
         kv();

         state._fsp--;


         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:36:22: ( ',' kv )*
         loop6:
         do {
             int alt6=2;
             int LA6_0 = input.LA(1);

             if ( (LA6_0==63) ) {
                 alt6=1;
             }


             switch (alt6) {
             case 1 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:36:23: ',' kv
                 {
                 match(input,63,FOLLOW_63_in_sql_update125); 

                 pushFollow(FOLLOW_kv_in_sql_update127);
                 kv();

                 state._fsp--;


                 }
                 break;

             default :
                 break loop6;
             }
         } while (true);


         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:36:32: ( WHERE kv ( and_or kv )* )?
         int alt8=2;
         int LA8_0 = input.LA(1);

         if ( (LA8_0==WHERE) ) {
             alt8=1;
         }
         switch (alt8) {
             case 1 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:36:33: WHERE kv ( and_or kv )*
                 {
                 match(input,WHERE,FOLLOW_WHERE_in_sql_update132); 

                 pushFollow(FOLLOW_kv_in_sql_update134);
                 kv();

                 state._fsp--;


                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:36:42: ( and_or kv )*
                 loop7:
                 do {
                     int alt7=2;
                     int LA7_0 = input.LA(1);

                     if ( (LA7_0==AND||LA7_0==OR) ) {
                         alt7=1;
                     }


                     switch (alt7) {
                     case 1 :
                         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:36:43: and_or kv
                         {
                         pushFollow(FOLLOW_and_or_in_sql_update137);
                         and_or();

                         state._fsp--;


                         pushFollow(FOLLOW_kv_in_sql_update139);
                         kv();

                         state._fsp--;


                         }
                         break;

                     default :
                         break loop7;
                     }
                 } while (true);


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
 // $ANTLR end "sql_update"



 // $ANTLR start "sql_select"
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:38:1: sql_select : SELECT select_columns FROM tables ( ( FULL | CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '=' column_name )? )* ( WHERE kv ( and_or ( kv | column_name op '\\(' sql_select '\\)' ) )* )? ( orderby | groupby | having )* ;
 public final void sql_select() throws RecognitionException {
     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:39:2: ( SELECT select_columns FROM tables ( ( FULL | CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '=' column_name )? )* ( WHERE kv ( and_or ( kv | column_name op '\\(' sql_select '\\)' ) )* )? ( orderby | groupby | having )* )
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:40:2: SELECT select_columns FROM tables ( ( FULL | CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '=' column_name )? )* ( WHERE kv ( and_or ( kv | column_name op '\\(' sql_select '\\)' ) )* )? ( orderby | groupby | having )*
         {
         match(input,SELECT,FOLLOW_SELECT_in_sql_select155); 

         pushFollow(FOLLOW_select_columns_in_sql_select157);
         select_columns();

         state._fsp--;


         match(input,FROM,FOLLOW_FROM_in_sql_select159); 

         pushFollow(FOLLOW_tables_in_sql_select161);
         tables();

         state._fsp--;


         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:41:2: ( ( FULL | CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '=' column_name )? )*
         loop10:
         do {
             int alt10=2;
             int LA10_0 = input.LA(1);

             if ( (LA10_0==CROSS||LA10_0==FULL||LA10_0==INNER||LA10_0==LEFT||LA10_0==RIGHT) ) {
                 alt10=1;
             }


             switch (alt10) {
             case 1 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:41:3: ( FULL | CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '=' column_name )?
                 {
                 if ( input.LA(1)==CROSS||input.LA(1)==FULL||input.LA(1)==INNER||input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
                     input.consume();
                     state.errorRecovery=false;
                 }
                 else {
                     MismatchedSetException mse = new MismatchedSetException(null,input);
                     throw mse;
                 }


                 match(input,JOIN,FOLLOW_JOIN_in_sql_select178); 

                 pushFollow(FOLLOW_table_in_sql_select180);
                 table();

                 state._fsp--;


                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:41:44: ( ON column_name '=' column_name )?
                 int alt9=2;
                 int LA9_0 = input.LA(1);

                 if ( (LA9_0==ON) ) {
                     alt9=1;
                 }
                 switch (alt9) {
                     case 1 :
                         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:41:45: ON column_name '=' column_name
                         {
                         match(input,ON,FOLLOW_ON_in_sql_select183); 

                         pushFollow(FOLLOW_column_name_in_sql_select185);
                         column_name();

                         state._fsp--;


                         match(input,68,FOLLOW_68_in_sql_select187); 

                         pushFollow(FOLLOW_column_name_in_sql_select189);
                         column_name();

                         state._fsp--;


                         }
                         break;

                 }


                 }
                 break;

             default :
                 break loop10;
             }
         } while (true);


         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:42:2: ( WHERE kv ( and_or ( kv | column_name op '\\(' sql_select '\\)' ) )* )?
         int alt13=2;
         int LA13_0 = input.LA(1);

         if ( (LA13_0==WHERE) ) {
             alt13=1;
         }
         switch (alt13) {
             case 1 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:42:3: WHERE kv ( and_or ( kv | column_name op '\\(' sql_select '\\)' ) )*
                 {
                 match(input,WHERE,FOLLOW_WHERE_in_sql_select198); 

                 pushFollow(FOLLOW_kv_in_sql_select200);
                 kv();

                 state._fsp--;


                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:42:12: ( and_or ( kv | column_name op '\\(' sql_select '\\)' ) )*
                 loop12:
                 do {
                     int alt12=2;
                     int LA12_0 = input.LA(1);

                     if ( (LA12_0==AND||LA12_0==OR) ) {
                         alt12=1;
                     }


                     switch (alt12) {
                     case 1 :
                         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:42:15: and_or ( kv | column_name op '\\(' sql_select '\\)' )
                         {
                         pushFollow(FOLLOW_and_or_in_sql_select205);
                         and_or();

                         state._fsp--;


                         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:42:23: ( kv | column_name op '\\(' sql_select '\\)' )
                         int alt11=2;
                         int LA11_0 = input.LA(1);

                         if ( (LA11_0==BASIC_NAME) ) {
                             int LA11_1 = input.LA(2);

                             if ( (LA11_1==64) ) {
                                 int LA11_2 = input.LA(3);

                                 if ( (LA11_2==BASIC_NAME) ) {
                                     int LA11_4 = input.LA(4);

                                     if ( (LA11_4==EXISTS||LA11_4==IN||LA11_4==61||(LA11_4 >= 65 && LA11_4 <= 70)) ) {
                                         int LA11_3 = input.LA(5);

                                         if ( (LA11_3==BASIC_NAME||LA11_3==PRE_SET||LA11_3==TEXT_STRING) ) {
                                             alt11=1;
                                         }
                                         else if ( (LA11_3==71) ) {
                                             alt11=2;
                                         }
                                         else {
                                             NoViableAltException nvae =
                                                 new NoViableAltException("", 11, 3, input);

                                             throw nvae;

                                         }
                                     }
                                     else {
                                         NoViableAltException nvae =
                                             new NoViableAltException("", 11, 4, input);

                                         throw nvae;

                                     }
                                 }
                                 else {
                                     NoViableAltException nvae =
                                         new NoViableAltException("", 11, 2, input);

                                     throw nvae;

                                 }
                             }
                             else if ( (LA11_1==EXISTS||LA11_1==IN||LA11_1==61||(LA11_1 >= 65 && LA11_1 <= 70)) ) {
                                 int LA11_3 = input.LA(3);

                                 if ( (LA11_3==BASIC_NAME||LA11_3==PRE_SET||LA11_3==TEXT_STRING) ) {
                                     alt11=1;
                                 }
                                 else if ( (LA11_3==71) ) {
                                     alt11=2;
                                 }
                                 else {
                                     NoViableAltException nvae =
                                         new NoViableAltException("", 11, 3, input);

                                     throw nvae;

                                 }
                             }
                             else {
                                 NoViableAltException nvae =
                                     new NoViableAltException("", 11, 1, input);

                                 throw nvae;

                             }
                         }
                         else {
                             NoViableAltException nvae =
                                 new NoViableAltException("", 11, 0, input);

                             throw nvae;

                         }
                         switch (alt11) {
                             case 1 :
                                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:42:24: kv
                                 {
                                 pushFollow(FOLLOW_kv_in_sql_select209);
                                 kv();

                                 state._fsp--;


                                 }
                                 break;
                             case 2 :
                                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:42:29: column_name op '\\(' sql_select '\\)'
                                 {
                                 pushFollow(FOLLOW_column_name_in_sql_select213);
                                 column_name();

                                 state._fsp--;


                                 pushFollow(FOLLOW_op_in_sql_select215);
                                 op();

                                 state._fsp--;


                                 match(input,71,FOLLOW_71_in_sql_select217); 

                                 pushFollow(FOLLOW_sql_select_in_sql_select219);
                                 sql_select();

                                 state._fsp--;


                                 match(input,72,FOLLOW_72_in_sql_select221); 

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
                 break;

         }


         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:43:2: ( orderby | groupby | having )*
         loop14:
         do {
             int alt14=4;
             switch ( input.LA(1) ) {
             case ORDER:
                 {
                 alt14=1;
                 }
                 break;
             case GROUP:
                 {
                 alt14=2;
                 }
                 break;
             case HAVING:
                 {
                 alt14=3;
                 }
                 break;

             }

             switch (alt14) {
             case 1 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:43:3: orderby
                 {
                 pushFollow(FOLLOW_orderby_in_sql_select233);
                 orderby();

                 state._fsp--;


                 }
                 break;
             case 2 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:43:11: groupby
                 {
                 pushFollow(FOLLOW_groupby_in_sql_select235);
                 groupby();

                 state._fsp--;


                 }
                 break;
             case 3 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:43:19: having
                 {
                 pushFollow(FOLLOW_having_in_sql_select237);
                 having();

                 state._fsp--;


                 }
                 break;

             default :
                 break loop14;
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
 // $ANTLR end "sql_select"



 // $ANTLR start "func"
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:46:1: func : BASIC_NAME '\\(' ( BASIC_NAME | '*' ) '\\)' ;
 public final void func() throws RecognitionException {
     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:47:2: ( BASIC_NAME '\\(' ( BASIC_NAME | '*' ) '\\)' )
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:48:2: BASIC_NAME '\\(' ( BASIC_NAME | '*' ) '\\)'
         {
         match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_func251); 

         match(input,71,FOLLOW_71_in_func253); 

         if ( input.LA(1)==BASIC_NAME||input.LA(1)==62 ) {
             input.consume();
             state.errorRecovery=false;
         }
         else {
             MismatchedSetException mse = new MismatchedSetException(null,input);
             throw mse;
         }


         match(input,72,FOLLOW_72_in_func261); 

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
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:51:1: func_and_alias : func ( ( AS )? BASIC_NAME )? ;
 public final void func_and_alias() throws RecognitionException {
     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:52:2: ( func ( ( AS )? BASIC_NAME )? )
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:53:2: func ( ( AS )? BASIC_NAME )?
         {
         pushFollow(FOLLOW_func_in_func_and_alias275);
         func();

         state._fsp--;


         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:53:7: ( ( AS )? BASIC_NAME )?
         int alt16=2;
         int LA16_0 = input.LA(1);

         if ( (LA16_0==AS||LA16_0==BASIC_NAME) ) {
             alt16=1;
         }
         switch (alt16) {
             case 1 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:53:8: ( AS )? BASIC_NAME
                 {
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:53:8: ( AS )?
                 int alt15=2;
                 int LA15_0 = input.LA(1);

                 if ( (LA15_0==AS) ) {
                     alt15=1;
                 }
                 switch (alt15) {
                     case 1 :
                         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:53:8: AS
                         {
                         match(input,AS,FOLLOW_AS_in_func_and_alias278); 

                         }
                         break;

                 }


                 match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_func_and_alias281); 

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
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:56:1: select_column_and_alias : column_name ( ( AS )? BASIC_NAME )? ;
 public final void select_column_and_alias() throws RecognitionException {
     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:57:2: ( column_name ( ( AS )? BASIC_NAME )? )
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:58:2: column_name ( ( AS )? BASIC_NAME )?
         {
         pushFollow(FOLLOW_column_name_in_select_column_and_alias295);
         column_name();

         state._fsp--;


         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:58:14: ( ( AS )? BASIC_NAME )?
         int alt18=2;
         int LA18_0 = input.LA(1);

         if ( (LA18_0==AS||LA18_0==BASIC_NAME) ) {
             alt18=1;
         }
         switch (alt18) {
             case 1 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:58:15: ( AS )? BASIC_NAME
                 {
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:58:15: ( AS )?
                 int alt17=2;
                 int LA17_0 = input.LA(1);

                 if ( (LA17_0==AS) ) {
                     alt17=1;
                 }
                 switch (alt17) {
                     case 1 :
                         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:58:15: AS
                         {
                         match(input,AS,FOLLOW_AS_in_select_column_and_alias298); 

                         }
                         break;

                 }


                 match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_select_column_and_alias301); 

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
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:61:1: select_column : ( select_column_and_alias | func_and_alias | '*' );
 public final void select_column() throws RecognitionException {
     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:62:2: ( select_column_and_alias | func_and_alias | '*' )
         int alt19=3;
         int LA19_0 = input.LA(1);

         if ( (LA19_0==BASIC_NAME) ) {
             int LA19_1 = input.LA(2);

             if ( (LA19_1==71) ) {
                 alt19=2;
             }
             else if ( (LA19_1==AS||LA19_1==BASIC_NAME||LA19_1==FROM||(LA19_1 >= 63 && LA19_1 <= 64)) ) {
                 alt19=1;
             }
             else {
                 NoViableAltException nvae =
                     new NoViableAltException("", 19, 1, input);

                 throw nvae;

             }
         }
         else if ( (LA19_0==62) ) {
             alt19=3;
         }
         else {
             NoViableAltException nvae =
                 new NoViableAltException("", 19, 0, input);

             throw nvae;

         }
         switch (alt19) {
             case 1 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:63:2: select_column_and_alias
                 {
                 pushFollow(FOLLOW_select_column_and_alias_in_select_column315);
                 select_column_and_alias();

                 state._fsp--;


                 }
                 break;
             case 2 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:63:26: func_and_alias
                 {
                 pushFollow(FOLLOW_func_and_alias_in_select_column317);
                 func_and_alias();

                 state._fsp--;


                 }
                 break;
             case 3 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:63:41: '*'
                 {
                 match(input,62,FOLLOW_62_in_select_column319); 

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
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:66:1: select_columns : select_column ( ',' select_column )* ;
 public final void select_columns() throws RecognitionException {
     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:67:2: ( select_column ( ',' select_column )* )
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:68:2: select_column ( ',' select_column )*
         {
         pushFollow(FOLLOW_select_column_in_select_columns332);
         select_column();

         state._fsp--;


         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:68:16: ( ',' select_column )*
         loop20:
         do {
             int alt20=2;
             int LA20_0 = input.LA(1);

             if ( (LA20_0==63) ) {
                 alt20=1;
             }


             switch (alt20) {
             case 1 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:68:17: ',' select_column
                 {
                 match(input,63,FOLLOW_63_in_select_columns335); 

                 pushFollow(FOLLOW_select_column_in_select_columns337);
                 select_column();

                 state._fsp--;


                 }
                 break;

             default :
                 break loop20;
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
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:71:1: and_or : ( AND | OR );
 public final void and_or() throws RecognitionException {
     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:71:8: ( AND | OR )
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
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:75:1: table : table_name ( ( AS )? alias )? ;
 public final void table() throws RecognitionException {
     AntlrV3SQLParser.table_name_return table_name1 =null;

     AntlrV3SQLParser.alias_return alias2 =null;


     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:75:7: ( table_name ( ( AS )? alias )? )
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:76:2: table_name ( ( AS )? alias )?
         {
         pushFollow(FOLLOW_table_name_in_table367);
         table_name1=table_name();

         state._fsp--;


         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:76:13: ( ( AS )? alias )?
         int alt22=2;
         int LA22_0 = input.LA(1);

         if ( (LA22_0==AS||LA22_0==BASIC_NAME) ) {
             alt22=1;
         }
         switch (alt22) {
             case 1 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:76:14: ( AS )? alias
                 {
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:76:14: ( AS )?
                 int alt21=2;
                 int LA21_0 = input.LA(1);

                 if ( (LA21_0==AS) ) {
                     alt21=1;
                 }
                 switch (alt21) {
                     case 1 :
                         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:76:15: AS
                         {
                         match(input,AS,FOLLOW_AS_in_table371); 

                         }
                         break;

                 }


                 pushFollow(FOLLOW_alias_in_table375);
                 alias2=alias();

                 state._fsp--;


                 }
                 break;

         }



//             tables.add(new String[]{(table_name1!=null?input.toString(table_name1.start,table_name1.stop):null),(alias2!=null?input.toString(alias2.start,alias2.stop):null)}); 
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
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:89:1: tables : ( table ( ',' table )* ) ;
 public final void tables() throws RecognitionException {
     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:89:8: ( ( table ( ',' table )* ) )
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:90:2: ( table ( ',' table )* )
         {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:90:2: ( table ( ',' table )* )
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:90:3: table ( ',' table )*
         {
         pushFollow(FOLLOW_table_in_tables391);
         table();

         state._fsp--;


         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:90:9: ( ',' table )*
         loop23:
         do {
             int alt23=2;
             int LA23_0 = input.LA(1);

             if ( (LA23_0==63) ) {
                 alt23=1;
             }


             switch (alt23) {
             case 1 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:90:10: ',' table
                 {
                 match(input,63,FOLLOW_63_in_tables394); 

                 pushFollow(FOLLOW_table_in_tables396);
                 table();

                 state._fsp--;


                 }
                 break;

             default :
                 break loop23;
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
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:93:1: table_name : BASIC_NAME ( ( '.' ) BASIC_NAME )? ;
 public final AntlrV3SQLParser.table_name_return table_name() throws RecognitionException {
     AntlrV3SQLParser.table_name_return retval = new AntlrV3SQLParser.table_name_return();
     retval.start = input.LT(1);


     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:94:2: ( BASIC_NAME ( ( '.' ) BASIC_NAME )? )
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:95:2: BASIC_NAME ( ( '.' ) BASIC_NAME )?
         {
         match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_table_name412); 

         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:95:13: ( ( '.' ) BASIC_NAME )?
         int alt24=2;
         int LA24_0 = input.LA(1);

         if ( (LA24_0==64) ) {
             alt24=1;
         }
         switch (alt24) {
             case 1 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:95:14: ( '.' ) BASIC_NAME
                 {
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:95:14: ( '.' )
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:95:15: '.'
                 {
                 match(input,64,FOLLOW_64_in_table_name416); 

                 }


                 match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_table_name419); 

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
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:98:1: alias : BASIC_NAME ;
 public final AntlrV3SQLParser.alias_return alias() throws RecognitionException {
     AntlrV3SQLParser.alias_return retval = new AntlrV3SQLParser.alias_return();
     retval.start = input.LT(1);


     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:98:7: ( BASIC_NAME )
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:99:2: BASIC_NAME
         {
         match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_alias432); 

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
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:102:1: column_name : BASIC_NAME ( ( '.' ) BASIC_NAME )? ;
 public final AntlrV3SQLParser.column_name_return column_name() throws RecognitionException {
     AntlrV3SQLParser.column_name_return retval = new AntlrV3SQLParser.column_name_return();
     retval.start = input.LT(1);


     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:103:2: ( BASIC_NAME ( ( '.' ) BASIC_NAME )? )
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:104:2: BASIC_NAME ( ( '.' ) BASIC_NAME )?
         {
         match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_column_name444); 

         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:104:13: ( ( '.' ) BASIC_NAME )?
         int alt25=2;
         int LA25_0 = input.LA(1);

         if ( (LA25_0==64) ) {
             alt25=1;
         }
         switch (alt25) {
             case 1 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:104:14: ( '.' ) BASIC_NAME
                 {
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:104:14: ( '.' )
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:104:15: '.'
                 {
                 match(input,64,FOLLOW_64_in_column_name448); 

                 }


                 match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_column_name451); 

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
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:107:1: insertColumn : column_name ;
 public final void insertColumn() throws RecognitionException {
     AntlrV3SQLParser.column_name_return column_name3 =null;


     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:108:2: ( column_name )
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:109:2: column_name
         {
         pushFollow(FOLLOW_column_name_in_insertColumn465);
         column_name3=column_name();

         state._fsp--;



//             colExprs.add(new String[]{(column_name3!=null?input.toString(column_name3.start,column_name3.stop):null),"="});
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
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:121:1: kv : ( ( column_name op PRE_SET ) | ( column_name op TEXT_STRING ) | column_name op column_name | column_name op func2 );
 public final void kv() throws RecognitionException {
     AntlrV3SQLParser.column_name_return column_name4 =null;

     AntlrV3SQLParser.op_return op5 =null;


     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:121:4: ( ( column_name op PRE_SET ) | ( column_name op TEXT_STRING ) | column_name op column_name | column_name op func2 )
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
                         case TEXT_STRING:
                             {
                             alt26=2;
                             }
                             break;
                         case BASIC_NAME:
                             {
                             int LA26_7 = input.LA(6);

                             if ( (LA26_7==71) ) {
                                 alt26=4;
                             }
                             else if ( (LA26_7==EOF||LA26_7==AND||LA26_7==GROUP||LA26_7==HAVING||(LA26_7 >= OR && LA26_7 <= ORDER)||LA26_7==WHERE||(LA26_7 >= 63 && LA26_7 <= 64)||LA26_7==72) ) {
                                 alt26=3;
                             }
                             else {
                                 NoViableAltException nvae =
                                     new NoViableAltException("", 26, 7, input);

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
                 case TEXT_STRING:
                     {
                     alt26=2;
                     }
                     break;
                 case BASIC_NAME:
                     {
                     int LA26_7 = input.LA(4);

                     if ( (LA26_7==71) ) {
                         alt26=4;
                     }
                     else if ( (LA26_7==EOF||LA26_7==AND||LA26_7==GROUP||LA26_7==HAVING||(LA26_7 >= OR && LA26_7 <= ORDER)||LA26_7==WHERE||(LA26_7 >= 63 && LA26_7 <= 64)||LA26_7==72) ) {
                         alt26=3;
                     }
                     else {
                         NoViableAltException nvae =
                             new NoViableAltException("", 26, 7, input);

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
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:122:2: ( column_name op PRE_SET )
                 {
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:122:2: ( column_name op PRE_SET )
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:122:3: column_name op PRE_SET
                 {
                 pushFollow(FOLLOW_column_name_in_kv480);
                 column_name4=column_name();

                 state._fsp--;


                 pushFollow(FOLLOW_op_in_kv482);
                 op5=op();

                 state._fsp--;


                 match(input,PRE_SET,FOLLOW_PRE_SET_in_kv484); 

                 }



//                     colExprs.add(new String[]{(column_name4!=null?input.toString(column_name4.start,column_name4.stop):null),(op5!=null?input.toString(op5.start,op5.stop):null)});
                     if (this.antlrParserDelegate != null) {
                                                         this.antlrParserDelegate.onFindColExper(
                                                                 (column_name4!=null?input.toString(column_name4.start,column_name4.stop):null),
                                                                 (op5!=null?input.toString(op5.start,op5.stop):null));
                                                     }
                     

                 }
                 break;
             case 2 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:134:2: ( column_name op TEXT_STRING )
                 {
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:134:2: ( column_name op TEXT_STRING )
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:134:3: column_name op TEXT_STRING
                 {
                 pushFollow(FOLLOW_column_name_in_kv495);
                 column_name();

                 state._fsp--;


                 pushFollow(FOLLOW_op_in_kv497);
                 op();

                 state._fsp--;


                 match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_kv499); 

                 }


                 }
                 break;
             case 3 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:136:2: column_name op column_name
                 {
                 pushFollow(FOLLOW_column_name_in_kv506);
                 column_name();

                 state._fsp--;


                 pushFollow(FOLLOW_op_in_kv508);
                 op();

                 state._fsp--;


                 pushFollow(FOLLOW_column_name_in_kv510);
                 column_name();

                 state._fsp--;


                 }
                 break;
             case 4 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:138:2: column_name op func2
                 {
                 pushFollow(FOLLOW_column_name_in_kv516);
                 column_name();

                 state._fsp--;


                 pushFollow(FOLLOW_op_in_kv518);
                 op();

                 state._fsp--;


                 pushFollow(FOLLOW_func2_in_kv520);
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
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:141:1: func2 : BASIC_NAME '\\(' ( ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING ) )* )? '\\)' ;
 public final void func2() throws RecognitionException {
     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:141:7: ( BASIC_NAME '\\(' ( ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING ) )* )? '\\)' )
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:142:2: BASIC_NAME '\\(' ( ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING ) )* )? '\\)'
         {
         match(input,BASIC_NAME,FOLLOW_BASIC_NAME_in_func2531); 

         match(input,71,FOLLOW_71_in_func2535); 

         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:144:2: ( ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING ) )* )?
         int alt30=2;
         int LA30_0 = input.LA(1);

         if ( (LA30_0==BASIC_NAME||LA30_0==TEXT_STRING) ) {
             alt30=1;
         }
         switch (alt30) {
             case 1 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:145:2: ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING ) )*
                 {
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:145:2: ( column_name | TEXT_STRING )
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
                         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:145:3: column_name
                         {
                         pushFollow(FOLLOW_column_name_in_func2543);
                         column_name();

                         state._fsp--;


                         }
                         break;
                     case 2 :
                         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:145:15: TEXT_STRING
                         {
                         match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_func2545); 

                         }
                         break;

                 }


                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:145:28: ( ',' ( column_name | TEXT_STRING ) )*
                 loop29:
                 do {
                     int alt29=2;
                     int LA29_0 = input.LA(1);

                     if ( (LA29_0==63) ) {
                         alt29=1;
                     }


                     switch (alt29) {
                     case 1 :
                         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:145:29: ',' ( column_name | TEXT_STRING )
                         {
                         match(input,63,FOLLOW_63_in_func2549); 

                         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:145:33: ( column_name | TEXT_STRING )
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
                                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:145:34: column_name
                                 {
                                 pushFollow(FOLLOW_column_name_in_func2552);
                                 column_name();

                                 state._fsp--;


                                 }
                                 break;
                             case 2 :
                                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:145:46: TEXT_STRING
                                 {
                                 match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_func2554); 

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


         match(input,72,FOLLOW_72_in_func2564); 

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
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:150:1: op : ( '=' | '>' | '>=' | '<' | '<=' | '!=' | '<>' | IN | EXISTS ) ;
 public final AntlrV3SQLParser.op_return op() throws RecognitionException {
     AntlrV3SQLParser.op_return retval = new AntlrV3SQLParser.op_return();
     retval.start = input.LT(1);


     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:151:2: ( ( '=' | '>' | '>=' | '<' | '<=' | '!=' | '<>' | IN | EXISTS ) )
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
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:155:1: orderby : ORDER BY column_name ( DESC | ASC )? ( ',' column_name ( DESC | ASC )? )* ;
 public final void orderby() throws RecognitionException {
     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:155:9: ( ORDER BY column_name ( DESC | ASC )? ( ',' column_name ( DESC | ASC )? )* )
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:156:2: ORDER BY column_name ( DESC | ASC )? ( ',' column_name ( DESC | ASC )? )*
         {
         match(input,ORDER,FOLLOW_ORDER_in_orderby606); 

         match(input,BY,FOLLOW_BY_in_orderby608); 

         pushFollow(FOLLOW_column_name_in_orderby610);
         column_name();

         state._fsp--;


         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:156:23: ( DESC | ASC )?
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


         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:156:35: ( ',' column_name ( DESC | ASC )? )*
         loop33:
         do {
             int alt33=2;
             int LA33_0 = input.LA(1);

             if ( (LA33_0==63) ) {
                 alt33=1;
             }


             switch (alt33) {
             case 1 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:156:36: ',' column_name ( DESC | ASC )?
                 {
                 match(input,63,FOLLOW_63_in_orderby620); 

                 pushFollow(FOLLOW_column_name_in_orderby622);
                 column_name();

                 state._fsp--;


                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:156:52: ( DESC | ASC )?
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
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:159:1: groupby : GROUP BY column_name ( ',' column_name )* ;
 public final void groupby() throws RecognitionException {
     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:159:9: ( GROUP BY column_name ( ',' column_name )* )
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:160:2: GROUP BY column_name ( ',' column_name )*
         {
         match(input,GROUP,FOLLOW_GROUP_in_groupby643); 

         match(input,BY,FOLLOW_BY_in_groupby645); 

         pushFollow(FOLLOW_column_name_in_groupby647);
         column_name();

         state._fsp--;


         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:160:23: ( ',' column_name )*
         loop34:
         do {
             int alt34=2;
             int LA34_0 = input.LA(1);

             if ( (LA34_0==63) ) {
                 alt34=1;
             }


             switch (alt34) {
             case 1 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:160:24: ',' column_name
                 {
                 match(input,63,FOLLOW_63_in_groupby650); 

                 pushFollow(FOLLOW_column_name_in_groupby652);
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
 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:163:1: having : HAVING ( column_name | func ) op ( column_name | func | TEXT_STRING | PRE_SET ) ;
 public final void having() throws RecognitionException {
     try {
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:163:8: ( HAVING ( column_name | func ) op ( column_name | func | TEXT_STRING | PRE_SET ) )
         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:164:2: HAVING ( column_name | func ) op ( column_name | func | TEXT_STRING | PRE_SET )
         {
         match(input,HAVING,FOLLOW_HAVING_in_having665); 

         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:164:9: ( column_name | func )
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
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:164:10: column_name
                 {
                 pushFollow(FOLLOW_column_name_in_having668);
                 column_name();

                 state._fsp--;


                 }
                 break;
             case 2 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:164:22: func
                 {
                 pushFollow(FOLLOW_func_in_having670);
                 func();

                 state._fsp--;


                 }
                 break;

         }


         pushFollow(FOLLOW_op_in_having673);
         op();

         state._fsp--;


         // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:164:31: ( column_name | func | TEXT_STRING | PRE_SET )
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
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:164:32: column_name
                 {
                 pushFollow(FOLLOW_column_name_in_having676);
                 column_name();

                 state._fsp--;


                 }
                 break;
             case 2 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:164:44: func
                 {
                 pushFollow(FOLLOW_func_in_having678);
                 func();

                 state._fsp--;


                 }
                 break;
             case 3 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:164:49: TEXT_STRING
                 {
                 match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_having680); 

                 }
                 break;
             case 4 :
                 // /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:164:61: PRE_SET
                 {
                 match(input,PRE_SET,FOLLOW_PRE_SET_in_having682); 

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
 public static final BitSet FOLLOW_table_in_sql_delete90 = new BitSet(new long[]{0x0100000000000002L});
 public static final BitSet FOLLOW_WHERE_in_sql_delete93 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_kv_in_sql_delete95 = new BitSet(new long[]{0x0000008000000022L});
 public static final BitSet FOLLOW_and_or_in_sql_delete98 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_kv_in_sql_delete100 = new BitSet(new long[]{0x0000008000000022L});
 public static final BitSet FOLLOW_UPDATE_in_sql_update116 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_table_in_sql_update118 = new BitSet(new long[]{0x0001000000000000L});
 public static final BitSet FOLLOW_SET_in_sql_update120 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_kv_in_sql_update122 = new BitSet(new long[]{0x8100000000000002L});
 public static final BitSet FOLLOW_63_in_sql_update125 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_kv_in_sql_update127 = new BitSet(new long[]{0x8100000000000002L});
 public static final BitSet FOLLOW_WHERE_in_sql_update132 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_kv_in_sql_update134 = new BitSet(new long[]{0x0000008000000022L});
 public static final BitSet FOLLOW_and_or_in_sql_update137 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_kv_in_sql_update139 = new BitSet(new long[]{0x0000008000000022L});
 public static final BitSet FOLLOW_SELECT_in_sql_select155 = new BitSet(new long[]{0x4000000000000200L});
 public static final BitSet FOLLOW_select_columns_in_sql_select157 = new BitSet(new long[]{0x0000000000080000L});
 public static final BitSet FOLLOW_FROM_in_sql_select159 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_tables_in_sql_select161 = new BitSet(new long[]{0x0100210409501002L});
 public static final BitSet FOLLOW_set_in_sql_select166 = new BitSet(new long[]{0x0000000080000000L});
 public static final BitSet FOLLOW_JOIN_in_sql_select178 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_table_in_sql_select180 = new BitSet(new long[]{0x0100214409501002L});
 public static final BitSet FOLLOW_ON_in_sql_select183 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_column_name_in_sql_select185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
 public static final BitSet FOLLOW_68_in_sql_select187 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_column_name_in_sql_select189 = new BitSet(new long[]{0x0100210409501002L});
 public static final BitSet FOLLOW_WHERE_in_sql_select198 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_kv_in_sql_select200 = new BitSet(new long[]{0x0000018001400022L});
 public static final BitSet FOLLOW_and_or_in_sql_select205 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_kv_in_sql_select209 = new BitSet(new long[]{0x0000018001400022L});
 public static final BitSet FOLLOW_column_name_in_sql_select213 = new BitSet(new long[]{0x2000000004020000L,0x000000000000007EL});
 public static final BitSet FOLLOW_op_in_sql_select215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
 public static final BitSet FOLLOW_71_in_sql_select217 = new BitSet(new long[]{0x0000800000000000L});
 public static final BitSet FOLLOW_sql_select_in_sql_select219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
 public static final BitSet FOLLOW_72_in_sql_select221 = new BitSet(new long[]{0x0000018001400022L});
 public static final BitSet FOLLOW_orderby_in_sql_select233 = new BitSet(new long[]{0x0000010001400002L});
 public static final BitSet FOLLOW_groupby_in_sql_select235 = new BitSet(new long[]{0x0000010001400002L});
 public static final BitSet FOLLOW_having_in_sql_select237 = new BitSet(new long[]{0x0000010001400002L});
 public static final BitSet FOLLOW_BASIC_NAME_in_func251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
 public static final BitSet FOLLOW_71_in_func253 = new BitSet(new long[]{0x4000000000000200L});
 public static final BitSet FOLLOW_set_in_func255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
 public static final BitSet FOLLOW_72_in_func261 = new BitSet(new long[]{0x0000000000000002L});
 public static final BitSet FOLLOW_func_in_func_and_alias275 = new BitSet(new long[]{0x0000000000000242L});
 public static final BitSet FOLLOW_AS_in_func_and_alias278 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_BASIC_NAME_in_func_and_alias281 = new BitSet(new long[]{0x0000000000000002L});
 public static final BitSet FOLLOW_column_name_in_select_column_and_alias295 = new BitSet(new long[]{0x0000000000000242L});
 public static final BitSet FOLLOW_AS_in_select_column_and_alias298 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_BASIC_NAME_in_select_column_and_alias301 = new BitSet(new long[]{0x0000000000000002L});
 public static final BitSet FOLLOW_select_column_and_alias_in_select_column315 = new BitSet(new long[]{0x0000000000000002L});
 public static final BitSet FOLLOW_func_and_alias_in_select_column317 = new BitSet(new long[]{0x0000000000000002L});
 public static final BitSet FOLLOW_62_in_select_column319 = new BitSet(new long[]{0x0000000000000002L});
 public static final BitSet FOLLOW_select_column_in_select_columns332 = new BitSet(new long[]{0x8000000000000002L});
 public static final BitSet FOLLOW_63_in_select_columns335 = new BitSet(new long[]{0x4000000000000200L});
 public static final BitSet FOLLOW_select_column_in_select_columns337 = new BitSet(new long[]{0x8000000000000002L});
 public static final BitSet FOLLOW_table_name_in_table367 = new BitSet(new long[]{0x0000000000000242L});
 public static final BitSet FOLLOW_AS_in_table371 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_alias_in_table375 = new BitSet(new long[]{0x0000000000000002L});
 public static final BitSet FOLLOW_table_in_tables391 = new BitSet(new long[]{0x8000000000000002L});
 public static final BitSet FOLLOW_63_in_tables394 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_table_in_tables396 = new BitSet(new long[]{0x8000000000000002L});
 public static final BitSet FOLLOW_BASIC_NAME_in_table_name412 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
 public static final BitSet FOLLOW_64_in_table_name416 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_BASIC_NAME_in_table_name419 = new BitSet(new long[]{0x0000000000000002L});
 public static final BitSet FOLLOW_BASIC_NAME_in_alias432 = new BitSet(new long[]{0x0000000000000002L});
 public static final BitSet FOLLOW_BASIC_NAME_in_column_name444 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
 public static final BitSet FOLLOW_64_in_column_name448 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_BASIC_NAME_in_column_name451 = new BitSet(new long[]{0x0000000000000002L});
 public static final BitSet FOLLOW_column_name_in_insertColumn465 = new BitSet(new long[]{0x0000000000000002L});
 public static final BitSet FOLLOW_column_name_in_kv480 = new BitSet(new long[]{0x2000000004020000L,0x000000000000007EL});
 public static final BitSet FOLLOW_op_in_kv482 = new BitSet(new long[]{0x0000040000000000L});
 public static final BitSet FOLLOW_PRE_SET_in_kv484 = new BitSet(new long[]{0x0000000000000002L});
 public static final BitSet FOLLOW_column_name_in_kv495 = new BitSet(new long[]{0x2000000004020000L,0x000000000000007EL});
 public static final BitSet FOLLOW_op_in_kv497 = new BitSet(new long[]{0x0004000000000000L});
 public static final BitSet FOLLOW_TEXT_STRING_in_kv499 = new BitSet(new long[]{0x0000000000000002L});
 public static final BitSet FOLLOW_column_name_in_kv506 = new BitSet(new long[]{0x2000000004020000L,0x000000000000007EL});
 public static final BitSet FOLLOW_op_in_kv508 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_column_name_in_kv510 = new BitSet(new long[]{0x0000000000000002L});
 public static final BitSet FOLLOW_column_name_in_kv516 = new BitSet(new long[]{0x2000000004020000L,0x000000000000007EL});
 public static final BitSet FOLLOW_op_in_kv518 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_func2_in_kv520 = new BitSet(new long[]{0x0000000000000002L});
 public static final BitSet FOLLOW_BASIC_NAME_in_func2531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
 public static final BitSet FOLLOW_71_in_func2535 = new BitSet(new long[]{0x0004000000000200L,0x0000000000000100L});
 public static final BitSet FOLLOW_column_name_in_func2543 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000100L});
 public static final BitSet FOLLOW_TEXT_STRING_in_func2545 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000100L});
 public static final BitSet FOLLOW_63_in_func2549 = new BitSet(new long[]{0x0004000000000200L});
 public static final BitSet FOLLOW_column_name_in_func2552 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000100L});
 public static final BitSet FOLLOW_TEXT_STRING_in_func2554 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000100L});
 public static final BitSet FOLLOW_72_in_func2564 = new BitSet(new long[]{0x0000000000000002L});
 public static final BitSet FOLLOW_ORDER_in_orderby606 = new BitSet(new long[]{0x0000000000000400L});
 public static final BitSet FOLLOW_BY_in_orderby608 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_column_name_in_orderby610 = new BitSet(new long[]{0x8000000000008082L});
 public static final BitSet FOLLOW_63_in_orderby620 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_column_name_in_orderby622 = new BitSet(new long[]{0x8000000000008082L});
 public static final BitSet FOLLOW_GROUP_in_groupby643 = new BitSet(new long[]{0x0000000000000400L});
 public static final BitSet FOLLOW_BY_in_groupby645 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_column_name_in_groupby647 = new BitSet(new long[]{0x8000000000000002L});
 public static final BitSet FOLLOW_63_in_groupby650 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_column_name_in_groupby652 = new BitSet(new long[]{0x8000000000000002L});
 public static final BitSet FOLLOW_HAVING_in_having665 = new BitSet(new long[]{0x0000000000000200L});
 public static final BitSet FOLLOW_column_name_in_having668 = new BitSet(new long[]{0x2000000004020000L,0x000000000000007EL});
 public static final BitSet FOLLOW_func_in_having670 = new BitSet(new long[]{0x2000000004020000L,0x000000000000007EL});
 public static final BitSet FOLLOW_op_in_having673 = new BitSet(new long[]{0x0004040000000200L});
 public static final BitSet FOLLOW_column_name_in_having676 = new BitSet(new long[]{0x0000000000000002L});
 public static final BitSet FOLLOW_func_in_having678 = new BitSet(new long[]{0x0000000000000002L});
 public static final BitSet FOLLOW_TEXT_STRING_in_having680 = new BitSet(new long[]{0x0000000000000002L});
 public static final BitSet FOLLOW_PRE_SET_in_having682 = new BitSet(new long[]{0x0000000000000002L});

}