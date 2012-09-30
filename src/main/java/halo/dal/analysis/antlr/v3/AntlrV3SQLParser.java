package halo.dal.analysis.antlr.v3;

//$ANTLR 3.4 /Users/akwei/antlrpro/sql2/AntlrV3SQL.g 2012-09-30 22:04:52
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

	public static final String[] tokenNames = new String[] {
			"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AND", "AS", "ASC",
			"B", "BASIC_NAME", "BETWEEN", "BY", "C", "CROSS", "D", "DELETE",
			"DESC", "E", "EXISTS", "F", "FROM", "FULL", "G", "GROUP", "H",
			"HAVING", "I", "IN", "INNER", "INSERT", "INTO", "J", "JOIN", "K",
			"L", "LEFT", "M", "N", "O", "ON", "OR", "ORDER", "OVER", "P",
			"PRE_SET", "Q", "R", "RIGHT", "ROWNUMBER", "S", "SELECT", "SET",
			"T", "TEXT_STRING", "U", "UPDATE", "V", "VALUES", "W", "WHERE",
			"WS", "X", "Y", "Z", "'!='", "'*'", "','", "'.'", "'<'", "'<='",
			"'<>'", "'='", "'>'", "'>='", "'\\('", "'\\)'"
	};

	public static final int EOF = -1;

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

	public static final int T__74 = 74;

	public static final int T__75 = 75;

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

	public static final int OVER = 42;

	public static final int P = 43;

	public static final int PRE_SET = 44;

	public static final int Q = 45;

	public static final int R = 46;

	public static final int RIGHT = 47;

	public static final int ROWNUMBER = 48;

	public static final int S = 49;

	public static final int SELECT = 50;

	public static final int SET = 51;

	public static final int T = 52;

	public static final int TEXT_STRING = 53;

	public static final int U = 54;

	public static final int UPDATE = 55;

	public static final int V = 56;

	public static final int VALUES = 57;

	public static final int W = 58;

	public static final int WHERE = 59;

	public static final int WS = 60;

	public static final int X = 61;

	public static final int Y = 62;

	public static final int Z = 63;

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
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:21:1: start : ( sql_insert |
	// sql_delete | sql_update | sql_select );
	public final void start() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:21:7: ( sql_insert |
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
				NoViableAltException nvae =
						new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
			case 1:
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:22:2: sql_insert
			{
				pushFollow(FOLLOW_sql_insert_in_start23);
				sql_insert();
				state._fsp--;
			}
				break;
			case 2:
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:22:13: sql_delete
			{
				pushFollow(FOLLOW_sql_delete_in_start25);
				sql_delete();
				state._fsp--;
			}
				break;
			case 3:
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:22:24: sql_update
			{
				pushFollow(FOLLOW_sql_update_in_start27);
				sql_update();
				state._fsp--;
			}
				break;
			case 4:
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:22:35: sql_select
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
			recover(input, re);
		}
		finally {
			// do for sure before leaving
		}
		return;
	}

	// $ANTLR end "start"
	// $ANTLR start "sql_insert"
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:24:1: sql_insert : INSERT INTO
	// table '\\(' insertColumn ( ',' insertColumn )* '\\)' VALUES '\\(' (
	// PRE_SET | ( ',' PRE_SET ) )* '\\)' ;
	public final void sql_insert() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:25:2: ( INSERT INTO table
			// '\\(' insertColumn ( ',' insertColumn )* '\\)' VALUES '\\(' (
			// PRE_SET | ( ',' PRE_SET ) )* '\\)' )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:26:2: INSERT INTO table
			// '\\(' insertColumn ( ',' insertColumn )* '\\)' VALUES '\\(' (
			// PRE_SET | ( ',' PRE_SET ) )* '\\)'
			{
				match(input, INSERT, FOLLOW_INSERT_in_sql_insert40);
				match(input, INTO, FOLLOW_INTO_in_sql_insert42);
				pushFollow(FOLLOW_table_in_sql_insert44);
				table();
				state._fsp--;
				match(input, 74, FOLLOW_74_in_sql_insert46);
				pushFollow(FOLLOW_insertColumn_in_sql_insert48);
				insertColumn();
				state._fsp--;
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:26:38: ( ','
				// insertColumn )*
				loop2: do {
					int alt2 = 2;
					int LA2_0 = input.LA(1);
					if ((LA2_0 == 66)) {
						alt2 = 1;
					}
					switch (alt2) {
					case 1:
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:26:39: ','
					// insertColumn
					{
						match(input, 66, FOLLOW_66_in_sql_insert51);
						pushFollow(FOLLOW_insertColumn_in_sql_insert53);
						insertColumn();
						state._fsp--;
					}
						break;
					default:
						break loop2;
					}
				}
				while (true);
				match(input, 75, FOLLOW_75_in_sql_insert57);
				match(input, VALUES, FOLLOW_VALUES_in_sql_insert59);
				match(input, 74, FOLLOW_74_in_sql_insert61);
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:26:75: ( PRE_SET | (
				// ',' PRE_SET ) )*
				loop3: do {
					int alt3 = 3;
					int LA3_0 = input.LA(1);
					if ((LA3_0 == PRE_SET)) {
						alt3 = 1;
					}
					else if ((LA3_0 == 66)) {
						alt3 = 2;
					}
					switch (alt3) {
					case 1:
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:26:76: PRE_SET
					{
						match(input, PRE_SET, FOLLOW_PRE_SET_in_sql_insert64);
					}
						break;
					case 2:
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:26:84: ( ','
					// PRE_SET )
					{
						// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:26:84: ( ','
						// PRE_SET )
						// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:26:85: ','
						// PRE_SET
						{
							match(input, 66, FOLLOW_66_in_sql_insert67);
							match(input, PRE_SET,
									FOLLOW_PRE_SET_in_sql_insert69);
						}
					}
						break;
					default:
						break loop3;
					}
				}
				while (true);
				match(input, 75, FOLLOW_75_in_sql_insert74);
				this.antlrParserDelegate
						.setSqlOp(AntlrParserDelegate.SQLOP_INSERT);
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
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:30:1: sql_delete : DELETE FROM
	// table ( WHERE kv ( and_or kv )* )? ;
	public final void sql_delete() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:31:2: ( DELETE FROM table
			// ( WHERE kv ( and_or kv )* )? )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:32:2: DELETE FROM table (
			// WHERE kv ( and_or kv )* )?
			{
				match(input, DELETE, FOLLOW_DELETE_in_sql_delete91);
				match(input, FROM, FOLLOW_FROM_in_sql_delete93);
				pushFollow(FOLLOW_table_in_sql_delete95);
				table();
				state._fsp--;
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:32:20: ( WHERE kv (
				// and_or kv )* )?
				int alt5 = 2;
				int LA5_0 = input.LA(1);
				if ((LA5_0 == WHERE)) {
					alt5 = 1;
				}
				switch (alt5) {
				case 1:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:32:21: WHERE kv (
				// and_or kv )*
				{
					match(input, WHERE, FOLLOW_WHERE_in_sql_delete98);
					pushFollow(FOLLOW_kv_in_sql_delete100);
					kv();
					state._fsp--;
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:32:30: ( and_or
					// kv )*
					loop4: do {
						int alt4 = 2;
						int LA4_0 = input.LA(1);
						if ((LA4_0 == AND || LA4_0 == OR)) {
							alt4 = 1;
						}
						switch (alt4) {
						case 1:
						// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:32:31: and_or
						// kv
						{
							pushFollow(FOLLOW_and_or_in_sql_delete103);
							and_or();
							state._fsp--;
							pushFollow(FOLLOW_kv_in_sql_delete105);
							kv();
							state._fsp--;
						}
							break;
						default:
							break loop4;
						}
					}
					while (true);
				}
					break;
				}
				this.antlrParserDelegate
						.setSqlOp(AntlrParserDelegate.SQLOP_DELETE);
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
	// SET kv ( ',' kv )* ( WHERE kv ( and_or kv )* )? ;
	public final void sql_update() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:37:2: ( UPDATE table SET
			// kv ( ',' kv )* ( WHERE kv ( and_or kv )* )? )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:38:2: UPDATE table SET kv
			// ( ',' kv )* ( WHERE kv ( and_or kv )* )?
			{
				match(input, UPDATE, FOLLOW_UPDATE_in_sql_update126);
				pushFollow(FOLLOW_table_in_sql_update128);
				table();
				state._fsp--;
				match(input, SET, FOLLOW_SET_in_sql_update130);
				pushFollow(FOLLOW_kv_in_sql_update132);
				kv();
				state._fsp--;
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:38:22: ( ',' kv )*
				loop6: do {
					int alt6 = 2;
					int LA6_0 = input.LA(1);
					if ((LA6_0 == 66)) {
						alt6 = 1;
					}
					switch (alt6) {
					case 1:
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:38:23: ',' kv
					{
						match(input, 66, FOLLOW_66_in_sql_update135);
						pushFollow(FOLLOW_kv_in_sql_update137);
						kv();
						state._fsp--;
					}
						break;
					default:
						break loop6;
					}
				}
				while (true);
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:38:32: ( WHERE kv (
				// and_or kv )* )?
				int alt8 = 2;
				int LA8_0 = input.LA(1);
				if ((LA8_0 == WHERE)) {
					alt8 = 1;
				}
				switch (alt8) {
				case 1:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:38:33: WHERE kv (
				// and_or kv )*
				{
					match(input, WHERE, FOLLOW_WHERE_in_sql_update142);
					pushFollow(FOLLOW_kv_in_sql_update144);
					kv();
					state._fsp--;
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:38:42: ( and_or
					// kv )*
					loop7: do {
						int alt7 = 2;
						int LA7_0 = input.LA(1);
						if ((LA7_0 == AND || LA7_0 == OR)) {
							alt7 = 1;
						}
						switch (alt7) {
						case 1:
						// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:38:43: and_or
						// kv
						{
							pushFollow(FOLLOW_and_or_in_sql_update147);
							and_or();
							state._fsp--;
							pushFollow(FOLLOW_kv_in_sql_update149);
							kv();
							state._fsp--;
						}
							break;
						default:
							break loop7;
						}
					}
					while (true);
				}
					break;
				}
				this.antlrParserDelegate
						.setSqlOp(AntlrParserDelegate.SQLOP_UPDATE);
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
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:42:1: sql_select : SELECT
	// select_columns ( ',' db2_paging )? FROM ( sqlAfterFrom | inner_select ) (
	// WHERE kv_sql )? ( orderby | groupby | having )* ;
	public final void sql_select() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:43:2: ( SELECT
			// select_columns ( ',' db2_paging )? FROM ( sqlAfterFrom |
			// inner_select ) ( WHERE kv_sql )? ( orderby | groupby | having )*
			// )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:44:2: SELECT
			// select_columns ( ',' db2_paging )? FROM ( sqlAfterFrom |
			// inner_select ) ( WHERE kv_sql )? ( orderby | groupby | having )*
			{
				match(input, SELECT, FOLLOW_SELECT_in_sql_select171);
				pushFollow(FOLLOW_select_columns_in_sql_select173);
				select_columns();
				state._fsp--;
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:44:24: ( ','
				// db2_paging )?
				int alt9 = 2;
				int LA9_0 = input.LA(1);
				if ((LA9_0 == 66)) {
					alt9 = 1;
				}
				switch (alt9) {
				case 1:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:44:25: ',' db2_paging
				{
					match(input, 66, FOLLOW_66_in_sql_select176);
					pushFollow(FOLLOW_db2_paging_in_sql_select177);
					db2_paging();
					state._fsp--;
				}
					break;
				}
				match(input, FROM, FOLLOW_FROM_in_sql_select181);
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:44:46: ( sqlAfterFrom
				// | inner_select )
				int alt10 = 2;
				int LA10_0 = input.LA(1);
				if ((LA10_0 == BASIC_NAME)) {
					alt10 = 1;
				}
				else if ((LA10_0 == 74)) {
					alt10 = 2;
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
					throw nvae;
				}
				switch (alt10) {
				case 1:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:44:47: sqlAfterFrom
				{
					pushFollow(FOLLOW_sqlAfterFrom_in_sql_select184);
					sqlAfterFrom();
					state._fsp--;
				}
					break;
				case 2:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:44:60: inner_select
				{
					pushFollow(FOLLOW_inner_select_in_sql_select186);
					inner_select();
					state._fsp--;
				}
					break;
				}
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:44:74: ( WHERE kv_sql
				// )?
				int alt11 = 2;
				int LA11_0 = input.LA(1);
				if ((LA11_0 == WHERE)) {
					alt11 = 1;
				}
				switch (alt11) {
				case 1:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:44:75: WHERE kv_sql
				{
					match(input, WHERE, FOLLOW_WHERE_in_sql_select190);
					pushFollow(FOLLOW_kv_sql_in_sql_select192);
					kv_sql();
					state._fsp--;
				}
					break;
				}
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:44:90: ( orderby |
				// groupby | having )*
				loop12: do {
					int alt12 = 4;
					switch (input.LA(1)) {
					case ORDER: {
						alt12 = 1;
					}
						break;
					case GROUP: {
						alt12 = 2;
					}
						break;
					case HAVING: {
						alt12 = 3;
					}
						break;
					}
					switch (alt12) {
					case 1:
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:44:91: orderby
					{
						pushFollow(FOLLOW_orderby_in_sql_select197);
						orderby();
						state._fsp--;
					}
						break;
					case 2:
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:44:99: groupby
					{
						pushFollow(FOLLOW_groupby_in_sql_select199);
						groupby();
						state._fsp--;
					}
						break;
					case 3:
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:44:107: having
					{
						pushFollow(FOLLOW_having_in_sql_select201);
						having();
						state._fsp--;
					}
						break;
					default:
						break loop12;
					}
				}
				while (true);
				this.antlrParserDelegate
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
	// $ANTLR start "sqlAfterFrom"
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:48:1: sqlAfterFrom : tables ( (
	// FULL | CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '='
	// column_name )? )* ;
	public final void sqlAfterFrom() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:49:2: ( tables ( ( FULL |
			// CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '='
			// column_name )? )* )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:50:2: tables ( ( FULL |
			// CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name '='
			// column_name )? )*
			{
				pushFollow(FOLLOW_tables_in_sqlAfterFrom218);
				tables();
				state._fsp--;
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:50:9: ( ( FULL |
				// CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON column_name
				// '=' column_name )? )*
				loop14: do {
					int alt14 = 2;
					int LA14_0 = input.LA(1);
					if ((LA14_0 == CROSS || LA14_0 == FULL || LA14_0 == INNER
							|| LA14_0 == LEFT || LA14_0 == RIGHT)) {
						alt14 = 1;
					}
					switch (alt14) {
					case 1:
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:50:10: ( FULL |
					// CROSS | INNER | LEFT | RIGHT ) JOIN table ( ON
					// column_name '=' column_name )?
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
						match(input, JOIN, FOLLOW_JOIN_in_sqlAfterFrom233);
						pushFollow(FOLLOW_table_in_sqlAfterFrom235);
						table();
						state._fsp--;
						// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:50:51: ( ON
						// column_name '=' column_name )?
						int alt13 = 2;
						int LA13_0 = input.LA(1);
						if ((LA13_0 == ON)) {
							alt13 = 1;
						}
						switch (alt13) {
						case 1:
						// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:50:52: ON
						// column_name '=' column_name
						{
							match(input, ON, FOLLOW_ON_in_sqlAfterFrom238);
							pushFollow(FOLLOW_column_name_in_sqlAfterFrom240);
							column_name();
							state._fsp--;
							match(input, 71, FOLLOW_71_in_sqlAfterFrom242);
							pushFollow(FOLLOW_column_name_in_sqlAfterFrom244);
							column_name();
							state._fsp--;
						}
							break;
						}
					}
						break;
					default:
						break loop14;
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

	// $ANTLR end "sqlAfterFrom"
	// $ANTLR start "kv_sql_wrapper"
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:52:1: kv_sql_wrapper : ( kv_sql |
	// '\\(' kv_sql '\\)' );
	public final void kv_sql_wrapper() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:53:2: ( kv_sql | '\\('
			// kv_sql '\\)' )
			int alt15 = 2;
			int LA15_0 = input.LA(1);
			if ((LA15_0 == BASIC_NAME)) {
				alt15 = 1;
			}
			else if ((LA15_0 == 74)) {
				alt15 = 2;
			}
			else {
				NoViableAltException nvae =
						new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
			case 1:
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:54:2: kv_sql
			{
				pushFollow(FOLLOW_kv_sql_in_kv_sql_wrapper258);
				kv_sql();
				state._fsp--;
			}
				break;
			case 2:
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:54:11: '\\(' kv_sql '\\)'
			{
				match(input, 74, FOLLOW_74_in_kv_sql_wrapper262);
				pushFollow(FOLLOW_kv_sql_in_kv_sql_wrapper264);
				kv_sql();
				state._fsp--;
				match(input, 75, FOLLOW_75_in_kv_sql_wrapper266);
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

	// $ANTLR end "kv_sql_wrapper"
	// $ANTLR start "kv_sql"
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:56:1: kv_sql : kv ( and_or ( kv |
	// '\\(' kv ( and_or kv )* '\\)' ) )* ;
	public final void kv_sql() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:56:8: ( kv ( and_or ( kv
			// | '\\(' kv ( and_or kv )* '\\)' ) )* )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:57:2: kv ( and_or ( kv |
			// '\\(' kv ( and_or kv )* '\\)' ) )*
			{
				pushFollow(FOLLOW_kv_in_kv_sql277);
				kv();
				state._fsp--;
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:57:5: ( and_or ( kv |
				// '\\(' kv ( and_or kv )* '\\)' ) )*
				loop18: do {
					int alt18 = 2;
					int LA18_0 = input.LA(1);
					if ((LA18_0 == AND || LA18_0 == OR)) {
						alt18 = 1;
					}
					switch (alt18) {
					case 1:
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:57:7: and_or ( kv
					// | '\\(' kv ( and_or kv )* '\\)' )
					{
						pushFollow(FOLLOW_and_or_in_kv_sql281);
						and_or();
						state._fsp--;
						// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:57:14: ( kv |
						// '\\(' kv ( and_or kv )* '\\)' )
						int alt17 = 2;
						int LA17_0 = input.LA(1);
						if ((LA17_0 == BASIC_NAME)) {
							alt17 = 1;
						}
						else if ((LA17_0 == 74)) {
							alt17 = 2;
						}
						else {
							NoViableAltException nvae =
									new NoViableAltException("", 17, 0, input);
							throw nvae;
						}
						switch (alt17) {
						case 1:
						// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:57:15: kv
						{
							pushFollow(FOLLOW_kv_in_kv_sql284);
							kv();
							state._fsp--;
						}
							break;
						case 2:
						// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:57:20: '\\('
						// kv ( and_or kv )* '\\)'
						{
							match(input, 74, FOLLOW_74_in_kv_sql288);
							pushFollow(FOLLOW_kv_in_kv_sql290);
							kv();
							state._fsp--;
							// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:57:28: (
							// and_or kv )*
							loop16: do {
								int alt16 = 2;
								int LA16_0 = input.LA(1);
								if ((LA16_0 == AND || LA16_0 == OR)) {
									alt16 = 1;
								}
								switch (alt16) {
								case 1:
								// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:57:29:
								// and_or kv
								{
									pushFollow(FOLLOW_and_or_in_kv_sql293);
									and_or();
									state._fsp--;
									pushFollow(FOLLOW_kv_in_kv_sql295);
									kv();
									state._fsp--;
								}
									break;
								default:
									break loop16;
								}
							}
							while (true);
							match(input, 75, FOLLOW_75_in_kv_sql299);
						}
							break;
						}
					}
						break;
					default:
						break loop18;
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

	// $ANTLR end "kv_sql"
	// $ANTLR start "inner_select"
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:60:1: inner_select : '\\('
	// sql_select '\\)' ( AS )? ( BASIC_NAME )? ;
	public final void inner_select() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:61:2: ( '\\(' sql_select
			// '\\)' ( AS )? ( BASIC_NAME )? )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:62:2: '\\(' sql_select
			// '\\)' ( AS )? ( BASIC_NAME )?
			{
				match(input, 74, FOLLOW_74_in_inner_select316);
				pushFollow(FOLLOW_sql_select_in_inner_select318);
				sql_select();
				state._fsp--;
				match(input, 75, FOLLOW_75_in_inner_select320);
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:62:23: ( AS )?
				int alt19 = 2;
				int LA19_0 = input.LA(1);
				if ((LA19_0 == AS)) {
					alt19 = 1;
				}
				switch (alt19) {
				case 1:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:62:23: AS
				{
					match(input, AS, FOLLOW_AS_in_inner_select322);
				}
					break;
				}
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:62:27: ( BASIC_NAME
				// )?
				int alt20 = 2;
				int LA20_0 = input.LA(1);
				if ((LA20_0 == BASIC_NAME)) {
					alt20 = 1;
				}
				switch (alt20) {
				case 1:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:62:27: BASIC_NAME
				{
					match(input, BASIC_NAME,
							FOLLOW_BASIC_NAME_in_inner_select325);
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

	// $ANTLR end "inner_select"
	// $ANTLR start "func"
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:65:1: func : BASIC_NAME '\\(' (
	// BASIC_NAME | '*' )? '\\)' ;
	public final void func() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:66:2: ( BASIC_NAME '\\('
			// ( BASIC_NAME | '*' )? '\\)' )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:67:2: BASIC_NAME '\\(' (
			// BASIC_NAME | '*' )? '\\)'
			{
				match(input, BASIC_NAME, FOLLOW_BASIC_NAME_in_func338);
				match(input, 74, FOLLOW_74_in_func340);
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:67:18: ( BASIC_NAME |
				// '*' )?
				int alt21 = 2;
				int LA21_0 = input.LA(1);
				if ((LA21_0 == BASIC_NAME || LA21_0 == 65)) {
					alt21 = 1;
				}
				switch (alt21) {
				case 1:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
				{
					if (input.LA(1) == BASIC_NAME || input.LA(1) == 65) {
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
				match(input, 75, FOLLOW_75_in_func349);
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
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:70:1: func_and_alias : func ( (
	// AS )? BASIC_NAME )? ;
	public final void func_and_alias() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:71:2: ( func ( ( AS )?
			// BASIC_NAME )? )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:72:2: func ( ( AS )?
			// BASIC_NAME )?
			{
				pushFollow(FOLLOW_func_in_func_and_alias363);
				func();
				state._fsp--;
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:72:7: ( ( AS )?
				// BASIC_NAME )?
				int alt23 = 2;
				int LA23_0 = input.LA(1);
				if ((LA23_0 == AS || LA23_0 == BASIC_NAME)) {
					alt23 = 1;
				}
				switch (alt23) {
				case 1:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:72:8: ( AS )?
				// BASIC_NAME
				{
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:72:8: ( AS )?
					int alt22 = 2;
					int LA22_0 = input.LA(1);
					if ((LA22_0 == AS)) {
						alt22 = 1;
					}
					switch (alt22) {
					case 1:
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:72:8: AS
					{
						match(input, AS, FOLLOW_AS_in_func_and_alias366);
					}
						break;
					}
					match(input, BASIC_NAME,
							FOLLOW_BASIC_NAME_in_func_and_alias369);
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
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:75:1: select_column_and_alias :
	// column_name ( ( AS )? BASIC_NAME )? ;
	public final void select_column_and_alias() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:76:2: ( column_name ( (
			// AS )? BASIC_NAME )? )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:77:2: column_name ( ( AS
			// )? BASIC_NAME )?
			{
				pushFollow(FOLLOW_column_name_in_select_column_and_alias383);
				column_name();
				state._fsp--;
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:77:14: ( ( AS )?
				// BASIC_NAME )?
				int alt25 = 2;
				int LA25_0 = input.LA(1);
				if ((LA25_0 == AS || LA25_0 == BASIC_NAME)) {
					alt25 = 1;
				}
				switch (alt25) {
				case 1:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:77:15: ( AS )?
				// BASIC_NAME
				{
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:77:15: ( AS )?
					int alt24 = 2;
					int LA24_0 = input.LA(1);
					if ((LA24_0 == AS)) {
						alt24 = 1;
					}
					switch (alt24) {
					case 1:
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:77:15: AS
					{
						match(input, AS,
								FOLLOW_AS_in_select_column_and_alias386);
					}
						break;
					}
					match(input, BASIC_NAME,
							FOLLOW_BASIC_NAME_in_select_column_and_alias389);
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
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:80:1: select_column : (
	// select_column_and_alias | func_and_alias | '*' );
	public final void select_column() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:81:2: (
			// select_column_and_alias | func_and_alias | '*' )
			int alt26 = 3;
			int LA26_0 = input.LA(1);
			if ((LA26_0 == BASIC_NAME)) {
				int LA26_1 = input.LA(2);
				if ((LA26_1 == 74)) {
					alt26 = 2;
				}
				else if ((LA26_1 == AS || LA26_1 == BASIC_NAME
						|| LA26_1 == FROM || (LA26_1 >= 66 && LA26_1 <= 67))) {
					alt26 = 1;
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 26, 1, input);
					throw nvae;
				}
			}
			else if ((LA26_0 == 65)) {
				alt26 = 3;
			}
			else {
				NoViableAltException nvae =
						new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
			case 1:
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:82:2:
			// select_column_and_alias
			{
				pushFollow(FOLLOW_select_column_and_alias_in_select_column403);
				select_column_and_alias();
				state._fsp--;
			}
				break;
			case 2:
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:82:26: func_and_alias
			{
				pushFollow(FOLLOW_func_and_alias_in_select_column405);
				func_and_alias();
				state._fsp--;
			}
				break;
			case 3:
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:82:41: '*'
			{
				match(input, 65, FOLLOW_65_in_select_column407);
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
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:85:1: select_columns :
	// select_column ( ',' select_column )* ;
	public final void select_columns() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:86:2: ( select_column (
			// ',' select_column )* )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:87:2: select_column ( ','
			// select_column )*
			{
				pushFollow(FOLLOW_select_column_in_select_columns420);
				select_column();
				state._fsp--;
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:87:16: ( ','
				// select_column )*
				loop27: do {
					int alt27 = 2;
					int LA27_0 = input.LA(1);
					if ((LA27_0 == 66)) {
						int LA27_1 = input.LA(2);
						if ((LA27_1 == BASIC_NAME || LA27_1 == 65)) {
							alt27 = 1;
						}
					}
					switch (alt27) {
					case 1:
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:87:17: ','
					// select_column
					{
						match(input, 66, FOLLOW_66_in_select_columns423);
						pushFollow(FOLLOW_select_column_in_select_columns425);
						select_column();
						state._fsp--;
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

	// $ANTLR end "select_columns"
	// $ANTLR start "and_or"
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:90:1: and_or : ( AND | OR );
	public final void and_or() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:90:8: ( AND | OR )
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
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:94:1: table : table_name ( ( AS
	// )? alias )? ;
	public final void table() throws RecognitionException {
		AntlrV3SQLParser.table_name_return table_name1 = null;
		AntlrV3SQLParser.alias_return alias2 = null;
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:94:7: ( table_name ( ( AS
			// )? alias )? )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:95:2: table_name ( ( AS
			// )? alias )?
			{
				pushFollow(FOLLOW_table_name_in_table455);
				table_name1 = table_name();
				state._fsp--;
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:95:13: ( ( AS )?
				// alias )?
				int alt29 = 2;
				int LA29_0 = input.LA(1);
				if ((LA29_0 == AS || LA29_0 == BASIC_NAME)) {
					alt29 = 1;
				}
				switch (alt29) {
				case 1:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:95:14: ( AS )? alias
				{
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:95:14: ( AS )?
					int alt28 = 2;
					int LA28_0 = input.LA(1);
					if ((LA28_0 == AS)) {
						alt28 = 1;
					}
					switch (alt28) {
					case 1:
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:95:15: AS
					{
						match(input, AS, FOLLOW_AS_in_table459);
					}
						break;
					}
					pushFollow(FOLLOW_alias_in_table463);
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
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:101:1: tables : ( table ( ','
	// table )* ) ;
	public final void tables() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:101:8: ( ( table ( ','
			// table )* ) )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:102:2: ( table ( ','
			// table )* )
			{
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:102:2: ( table ( ','
				// table )* )
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:102:3: table ( ','
				// table )*
				{
					pushFollow(FOLLOW_table_in_tables479);
					table();
					state._fsp--;
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:102:9: ( ','
					// table )*
					loop30: do {
						int alt30 = 2;
						int LA30_0 = input.LA(1);
						if ((LA30_0 == 66)) {
							alt30 = 1;
						}
						switch (alt30) {
						case 1:
						// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:102:10: ','
						// table
						{
							match(input, 66, FOLLOW_66_in_tables482);
							pushFollow(FOLLOW_table_in_tables484);
							table();
							state._fsp--;
						}
							break;
						default:
							break loop30;
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
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:105:1: table_name : BASIC_NAME (
	// ( '.' ) BASIC_NAME )? ;
	public final AntlrV3SQLParser.table_name_return table_name()
			throws RecognitionException {
		AntlrV3SQLParser.table_name_return retval = new AntlrV3SQLParser.table_name_return();
		retval.start = input.LT(1);
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:106:2: ( BASIC_NAME ( (
			// '.' ) BASIC_NAME )? )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:107:2: BASIC_NAME ( ( '.'
			// ) BASIC_NAME )?
			{
				match(input, BASIC_NAME, FOLLOW_BASIC_NAME_in_table_name500);
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:107:13: ( ( '.' )
				// BASIC_NAME )?
				int alt31 = 2;
				int LA31_0 = input.LA(1);
				if ((LA31_0 == 67)) {
					alt31 = 1;
				}
				switch (alt31) {
				case 1:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:107:14: ( '.' )
				// BASIC_NAME
				{
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:107:14: ( '.' )
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:107:15: '.'
					{
						match(input, 67, FOLLOW_67_in_table_name504);
					}
					match(input, BASIC_NAME, FOLLOW_BASIC_NAME_in_table_name507);
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
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:110:1: alias : BASIC_NAME ;
	public final AntlrV3SQLParser.alias_return alias()
			throws RecognitionException {
		AntlrV3SQLParser.alias_return retval = new AntlrV3SQLParser.alias_return();
		retval.start = input.LT(1);
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:110:7: ( BASIC_NAME )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:111:2: BASIC_NAME
			{
				match(input, BASIC_NAME, FOLLOW_BASIC_NAME_in_alias520);
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
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:114:1: column_name : BASIC_NAME (
	// ( '.' ) BASIC_NAME )? ;
	public final AntlrV3SQLParser.column_name_return column_name()
			throws RecognitionException {
		AntlrV3SQLParser.column_name_return retval = new AntlrV3SQLParser.column_name_return();
		retval.start = input.LT(1);
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:115:2: ( BASIC_NAME ( (
			// '.' ) BASIC_NAME )? )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:116:2: BASIC_NAME ( ( '.'
			// ) BASIC_NAME )?
			{
				match(input, BASIC_NAME, FOLLOW_BASIC_NAME_in_column_name532);
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:116:13: ( ( '.' )
				// BASIC_NAME )?
				int alt32 = 2;
				int LA32_0 = input.LA(1);
				if ((LA32_0 == 67)) {
					alt32 = 1;
				}
				switch (alt32) {
				case 1:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:116:14: ( '.' )
				// BASIC_NAME
				{
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:116:14: ( '.' )
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:116:15: '.'
					{
						match(input, 67, FOLLOW_67_in_column_name536);
					}
					match(input, BASIC_NAME,
							FOLLOW_BASIC_NAME_in_column_name539);
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
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:119:1: insertColumn : column_name
	// ;
	public final void insertColumn() throws RecognitionException {
		AntlrV3SQLParser.column_name_return column_name3 = null;
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:120:2: ( column_name )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:121:2: column_name
			{
				pushFollow(FOLLOW_column_name_in_insertColumn553);
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
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:131:1: kv : ( ( column_name op (
	// PRE_SET | '\\(' PRE_SET '\\)' ) ) | column_name op TEXT_STRING | (
	// column_name BETWEEN PRE_SET AND PRE_SET ) | column_name op column_name |
	// column_name op func2 | column_name op '\\(' sql_select '\\)' );
	public final void kv() throws RecognitionException {
		AntlrV3SQLParser.column_name_return column_name4 = null;
		AntlrV3SQLParser.op_return op5 = null;
		AntlrV3SQLParser.column_name_return column_name6 = null;
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:131:4: ( ( column_name op
			// ( PRE_SET | '\\(' PRE_SET '\\)' ) ) | column_name op TEXT_STRING
			// | ( column_name BETWEEN PRE_SET AND PRE_SET ) | column_name op
			// column_name | column_name op func2 | column_name op '\\('
			// sql_select '\\)' )
			int alt34 = 6;
			int LA34_0 = input.LA(1);
			if ((LA34_0 == BASIC_NAME)) {
				switch (input.LA(2)) {
				case 67: {
					int LA34_2 = input.LA(3);
					if ((LA34_2 == BASIC_NAME)) {
						int LA34_5 = input.LA(4);
						if ((LA34_5 == EXISTS || LA34_5 == IN || LA34_5 == 64 || (LA34_5 >= 68 && LA34_5 <= 73))) {
							switch (input.LA(5)) {
							case PRE_SET: {
								alt34 = 1;
							}
								break;
							case 74: {
								int LA34_7 = input.LA(6);
								if ((LA34_7 == PRE_SET)) {
									alt34 = 1;
								}
								else if ((LA34_7 == SELECT)) {
									alt34 = 6;
								}
								else {
									NoViableAltException nvae =
											new NoViableAltException("", 34, 7,
													input);
									throw nvae;
								}
							}
								break;
							case TEXT_STRING: {
								alt34 = 2;
							}
								break;
							case BASIC_NAME: {
								int LA34_9 = input.LA(6);
								if ((LA34_9 == 74)) {
									alt34 = 5;
								}
								else if ((LA34_9 == EOF || LA34_9 == AND
										|| LA34_9 == GROUP || LA34_9 == HAVING
										|| (LA34_9 >= OR && LA34_9 <= ORDER)
										|| LA34_9 == WHERE
										|| (LA34_9 >= 66 && LA34_9 <= 67) || LA34_9 == 75)) {
									alt34 = 4;
								}
								else {
									NoViableAltException nvae =
											new NoViableAltException("", 34, 9,
													input);
									throw nvae;
								}
							}
								break;
							default:
								NoViableAltException nvae =
										new NoViableAltException("", 34, 3,
												input);
								throw nvae;
							}
						}
						else if ((LA34_5 == BETWEEN)) {
							alt34 = 3;
						}
						else {
							NoViableAltException nvae =
									new NoViableAltException("", 34, 5, input);
							throw nvae;
						}
					}
					else {
						NoViableAltException nvae =
								new NoViableAltException("", 34, 2, input);
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
				case 73: {
					switch (input.LA(3)) {
					case PRE_SET: {
						alt34 = 1;
					}
						break;
					case 74: {
						int LA34_7 = input.LA(4);
						if ((LA34_7 == PRE_SET)) {
							alt34 = 1;
						}
						else if ((LA34_7 == SELECT)) {
							alt34 = 6;
						}
						else {
							NoViableAltException nvae =
									new NoViableAltException("", 34, 7, input);
							throw nvae;
						}
					}
						break;
					case TEXT_STRING: {
						alt34 = 2;
					}
						break;
					case BASIC_NAME: {
						int LA34_9 = input.LA(4);
						if ((LA34_9 == 74)) {
							alt34 = 5;
						}
						else if ((LA34_9 == EOF || LA34_9 == AND
								|| LA34_9 == GROUP || LA34_9 == HAVING
								|| (LA34_9 >= OR && LA34_9 <= ORDER)
								|| LA34_9 == WHERE
								|| (LA34_9 >= 66 && LA34_9 <= 67) || LA34_9 == 75)) {
							alt34 = 4;
						}
						else {
							NoViableAltException nvae =
									new NoViableAltException("", 34, 9, input);
							throw nvae;
						}
					}
						break;
					default:
						NoViableAltException nvae =
								new NoViableAltException("", 34, 3, input);
						throw nvae;
					}
				}
					break;
				case BETWEEN: {
					alt34 = 3;
				}
					break;
				default:
					NoViableAltException nvae =
							new NoViableAltException("", 34, 1, input);
					throw nvae;
				}
			}
			else {
				NoViableAltException nvae =
						new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
			case 1:
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:132:2: ( column_name op (
			// PRE_SET | '\\(' PRE_SET '\\)' ) )
			{
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:132:2: ( column_name
				// op ( PRE_SET | '\\(' PRE_SET '\\)' ) )
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:132:3: column_name op
				// ( PRE_SET | '\\(' PRE_SET '\\)' )
				{
					pushFollow(FOLLOW_column_name_in_kv570);
					column_name4 = column_name();
					state._fsp--;
					pushFollow(FOLLOW_op_in_kv572);
					op5 = op();
					state._fsp--;
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:132:18: ( PRE_SET
					// | '\\(' PRE_SET '\\)' )
					int alt33 = 2;
					int LA33_0 = input.LA(1);
					if ((LA33_0 == PRE_SET)) {
						alt33 = 1;
					}
					else if ((LA33_0 == 74)) {
						alt33 = 2;
					}
					else {
						NoViableAltException nvae =
								new NoViableAltException("", 33, 0, input);
						throw nvae;
					}
					switch (alt33) {
					case 1:
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:132:19: PRE_SET
					{
						match(input, PRE_SET, FOLLOW_PRE_SET_in_kv575);
					}
						break;
					case 2:
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:132:27: '\\('
					// PRE_SET '\\)'
					{
						match(input, 74, FOLLOW_74_in_kv577);
						match(input, PRE_SET, FOLLOW_PRE_SET_in_kv579);
						match(input, 75, FOLLOW_75_in_kv581);
					}
						break;
					}
				}
				if (this.antlrParserDelegate != null) {
					this.antlrParserDelegate.onFindColExper(
							(column_name4 != null ? input.toString(
									column_name4.start, column_name4.stop)
									: null),
							(op5 != null ? input.toString(op5.start, op5.stop)
									: null));
				}
			}
				break;
			case 2:
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:139:2: column_name op
			// TEXT_STRING
			{
				pushFollow(FOLLOW_column_name_in_kv592);
				column_name();
				state._fsp--;
				pushFollow(FOLLOW_op_in_kv594);
				op();
				state._fsp--;
				match(input, TEXT_STRING, FOLLOW_TEXT_STRING_in_kv596);
			}
				break;
			case 3:
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:141:2: ( column_name
			// BETWEEN PRE_SET AND PRE_SET )
			{
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:141:2: ( column_name
				// BETWEEN PRE_SET AND PRE_SET )
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:141:3: column_name
				// BETWEEN PRE_SET AND PRE_SET
				{
					pushFollow(FOLLOW_column_name_in_kv603);
					column_name6 = column_name();
					state._fsp--;
					match(input, BETWEEN, FOLLOW_BETWEEN_in_kv605);
					match(input, PRE_SET, FOLLOW_PRE_SET_in_kv607);
					match(input, AND, FOLLOW_AND_in_kv609);
					match(input, PRE_SET, FOLLOW_PRE_SET_in_kv611);
				}
				this.antlrParserDelegate.onFindColExper(
						(column_name6 != null ? input.toString(
								column_name6.start, column_name6.stop) : null),
						">=");
				this.antlrParserDelegate.onFindColExper(
						(column_name6 != null ? input.toString(
								column_name6.start, column_name6.stop) : null),
						"=<");
			}
				break;
			case 4:
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:147:2: column_name op
			// column_name
			{
				pushFollow(FOLLOW_column_name_in_kv622);
				column_name();
				state._fsp--;
				pushFollow(FOLLOW_op_in_kv624);
				op();
				state._fsp--;
				pushFollow(FOLLOW_column_name_in_kv626);
				column_name();
				state._fsp--;
			}
				break;
			case 5:
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:149:2: column_name op
			// func2
			{
				pushFollow(FOLLOW_column_name_in_kv632);
				column_name();
				state._fsp--;
				pushFollow(FOLLOW_op_in_kv634);
				op();
				state._fsp--;
				pushFollow(FOLLOW_func2_in_kv636);
				func2();
				state._fsp--;
			}
				break;
			case 6:
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:151:2: column_name op
			// '\\(' sql_select '\\)'
			{
				pushFollow(FOLLOW_column_name_in_kv642);
				column_name();
				state._fsp--;
				pushFollow(FOLLOW_op_in_kv644);
				op();
				state._fsp--;
				match(input, 74, FOLLOW_74_in_kv646);
				pushFollow(FOLLOW_sql_select_in_kv648);
				sql_select();
				state._fsp--;
				match(input, 75, FOLLOW_75_in_kv650);
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
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:154:1: func2 : BASIC_NAME '\\(' (
	// ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING ) )* )?
	// '\\)' ;
	public final void func2() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:154:7: ( BASIC_NAME '\\('
			// ( ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING
			// ) )* )? '\\)' )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:155:2: BASIC_NAME '\\(' (
			// ( column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING )
			// )* )? '\\)'
			{
				match(input, BASIC_NAME, FOLLOW_BASIC_NAME_in_func2661);
				match(input, 74, FOLLOW_74_in_func2665);
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:157:2: ( (
				// column_name | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING
				// ) )* )?
				int alt38 = 2;
				int LA38_0 = input.LA(1);
				if ((LA38_0 == BASIC_NAME || LA38_0 == TEXT_STRING)) {
					alt38 = 1;
				}
				switch (alt38) {
				case 1:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:158:2: ( column_name
				// | TEXT_STRING ) ( ',' ( column_name | TEXT_STRING ) )*
				{
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:158:2: (
					// column_name | TEXT_STRING )
					int alt35 = 2;
					int LA35_0 = input.LA(1);
					if ((LA35_0 == BASIC_NAME)) {
						alt35 = 1;
					}
					else if ((LA35_0 == TEXT_STRING)) {
						alt35 = 2;
					}
					else {
						NoViableAltException nvae =
								new NoViableAltException("", 35, 0, input);
						throw nvae;
					}
					switch (alt35) {
					case 1:
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:158:3:
					// column_name
					{
						pushFollow(FOLLOW_column_name_in_func2673);
						column_name();
						state._fsp--;
					}
						break;
					case 2:
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:158:15:
					// TEXT_STRING
					{
						match(input, TEXT_STRING,
								FOLLOW_TEXT_STRING_in_func2675);
					}
						break;
					}
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:158:28: ( ',' (
					// column_name | TEXT_STRING ) )*
					loop37: do {
						int alt37 = 2;
						int LA37_0 = input.LA(1);
						if ((LA37_0 == 66)) {
							alt37 = 1;
						}
						switch (alt37) {
						case 1:
						// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:158:29: ',' (
						// column_name | TEXT_STRING )
						{
							match(input, 66, FOLLOW_66_in_func2679);
							// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:158:33: (
							// column_name | TEXT_STRING )
							int alt36 = 2;
							int LA36_0 = input.LA(1);
							if ((LA36_0 == BASIC_NAME)) {
								alt36 = 1;
							}
							else if ((LA36_0 == TEXT_STRING)) {
								alt36 = 2;
							}
							else {
								NoViableAltException nvae =
										new NoViableAltException("", 36, 0,
												input);
								throw nvae;
							}
							switch (alt36) {
							case 1:
							// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:158:34:
							// column_name
							{
								pushFollow(FOLLOW_column_name_in_func2682);
								column_name();
								state._fsp--;
							}
								break;
							case 2:
							// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:158:46:
							// TEXT_STRING
							{
								match(input, TEXT_STRING,
										FOLLOW_TEXT_STRING_in_func2684);
							}
								break;
							}
						}
							break;
						default:
							break loop37;
						}
					}
					while (true);
				}
					break;
				}
				match(input, 75, FOLLOW_75_in_func2694);
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
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:163:1: op : ( '=' | '>' | '>=' |
	// '<' | '<=' | '!=' | '<>' | IN | EXISTS ) ;
	public final AntlrV3SQLParser.op_return op() throws RecognitionException {
		AntlrV3SQLParser.op_return retval = new AntlrV3SQLParser.op_return();
		retval.start = input.LT(1);
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:164:2: ( ( '=' | '>' |
			// '>=' | '<' | '<=' | '!=' | '<>' | IN | EXISTS ) )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:
			{
				if (input.LA(1) == EXISTS || input.LA(1) == IN
						|| input.LA(1) == 64
						|| (input.LA(1) >= 68 && input.LA(1) <= 73)) {
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
	// $ANTLR start "orderby"
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:168:1: orderby : ORDER BY
	// column_name ( DESC | ASC )? ( ',' column_name ( DESC | ASC )? )* ;
	public final void orderby() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:168:9: ( ORDER BY
			// column_name ( DESC | ASC )? ( ',' column_name ( DESC | ASC )? )*
			// )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:169:2: ORDER BY
			// column_name ( DESC | ASC )? ( ',' column_name ( DESC | ASC )? )*
			{
				match(input, ORDER, FOLLOW_ORDER_in_orderby736);
				match(input, BY, FOLLOW_BY_in_orderby738);
				pushFollow(FOLLOW_column_name_in_orderby740);
				column_name();
				state._fsp--;
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:169:23: ( DESC | ASC
				// )?
				int alt39 = 2;
				int LA39_0 = input.LA(1);
				if ((LA39_0 == ASC || LA39_0 == DESC)) {
					alt39 = 1;
				}
				switch (alt39) {
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
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:169:35: ( ','
				// column_name ( DESC | ASC )? )*
				loop41: do {
					int alt41 = 2;
					int LA41_0 = input.LA(1);
					if ((LA41_0 == 66)) {
						alt41 = 1;
					}
					switch (alt41) {
					case 1:
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:169:36: ','
					// column_name ( DESC | ASC )?
					{
						match(input, 66, FOLLOW_66_in_orderby750);
						pushFollow(FOLLOW_column_name_in_orderby752);
						column_name();
						state._fsp--;
						// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:169:52: (
						// DESC | ASC )?
						int alt40 = 2;
						int LA40_0 = input.LA(1);
						if ((LA40_0 == ASC || LA40_0 == DESC)) {
							alt40 = 1;
						}
						switch (alt40) {
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
					}
						break;
					default:
						break loop41;
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
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:172:1: groupby : GROUP BY
	// column_name ( ',' column_name )* ;
	public final void groupby() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:172:9: ( GROUP BY
			// column_name ( ',' column_name )* )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:173:2: GROUP BY
			// column_name ( ',' column_name )*
			{
				match(input, GROUP, FOLLOW_GROUP_in_groupby773);
				match(input, BY, FOLLOW_BY_in_groupby775);
				pushFollow(FOLLOW_column_name_in_groupby777);
				column_name();
				state._fsp--;
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:173:23: ( ','
				// column_name )*
				loop42: do {
					int alt42 = 2;
					int LA42_0 = input.LA(1);
					if ((LA42_0 == 66)) {
						alt42 = 1;
					}
					switch (alt42) {
					case 1:
					// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:173:24: ','
					// column_name
					{
						match(input, 66, FOLLOW_66_in_groupby780);
						pushFollow(FOLLOW_column_name_in_groupby782);
						column_name();
						state._fsp--;
					}
						break;
					default:
						break loop42;
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
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:176:1: having : HAVING (
	// column_name | func ) op ( column_name | func | TEXT_STRING | PRE_SET ) ;
	public final void having() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:176:8: ( HAVING (
			// column_name | func ) op ( column_name | func | TEXT_STRING |
			// PRE_SET ) )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:177:2: HAVING (
			// column_name | func ) op ( column_name | func | TEXT_STRING |
			// PRE_SET )
			{
				match(input, HAVING, FOLLOW_HAVING_in_having795);
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:177:9: ( column_name
				// | func )
				int alt43 = 2;
				int LA43_0 = input.LA(1);
				if ((LA43_0 == BASIC_NAME)) {
					int LA43_1 = input.LA(2);
					if ((LA43_1 == 74)) {
						alt43 = 2;
					}
					else if ((LA43_1 == EXISTS || LA43_1 == IN || LA43_1 == 64 || (LA43_1 >= 67 && LA43_1 <= 73))) {
						alt43 = 1;
					}
					else {
						NoViableAltException nvae =
								new NoViableAltException("", 43, 1, input);
						throw nvae;
					}
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 43, 0, input);
					throw nvae;
				}
				switch (alt43) {
				case 1:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:177:10: column_name
				{
					pushFollow(FOLLOW_column_name_in_having798);
					column_name();
					state._fsp--;
				}
					break;
				case 2:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:177:22: func
				{
					pushFollow(FOLLOW_func_in_having800);
					func();
					state._fsp--;
				}
					break;
				}
				pushFollow(FOLLOW_op_in_having803);
				op();
				state._fsp--;
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:177:31: ( column_name
				// | func | TEXT_STRING | PRE_SET )
				int alt44 = 4;
				switch (input.LA(1)) {
				case BASIC_NAME: {
					int LA44_1 = input.LA(2);
					if ((LA44_1 == 74)) {
						alt44 = 2;
					}
					else if ((LA44_1 == EOF || LA44_1 == GROUP
							|| LA44_1 == HAVING || LA44_1 == ORDER
							|| LA44_1 == 67 || LA44_1 == 75)) {
						alt44 = 1;
					}
					else {
						NoViableAltException nvae =
								new NoViableAltException("", 44, 1, input);
						throw nvae;
					}
				}
					break;
				case TEXT_STRING: {
					alt44 = 3;
				}
					break;
				case PRE_SET: {
					alt44 = 4;
				}
					break;
				default:
					NoViableAltException nvae =
							new NoViableAltException("", 44, 0, input);
					throw nvae;
				}
				switch (alt44) {
				case 1:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:177:32: column_name
				{
					pushFollow(FOLLOW_column_name_in_having806);
					column_name();
					state._fsp--;
				}
					break;
				case 2:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:177:44: func
				{
					pushFollow(FOLLOW_func_in_having808);
					func();
					state._fsp--;
				}
					break;
				case 3:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:177:49: TEXT_STRING
				{
					match(input, TEXT_STRING, FOLLOW_TEXT_STRING_in_having810);
				}
					break;
				case 4:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:177:61: PRE_SET
				{
					match(input, PRE_SET, FOLLOW_PRE_SET_in_having812);
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
	// $ANTLR start "db2_paging"
	// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:180:1: db2_paging : ROWNUMBER
	// '\\(' '\\)' OVER '\\(' orderby '\\)' ( AS )? BASIC_NAME ;
	public final void db2_paging() throws RecognitionException {
		try {
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:181:2: ( ROWNUMBER '\\('
			// '\\)' OVER '\\(' orderby '\\)' ( AS )? BASIC_NAME )
			// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:182:2: ROWNUMBER '\\('
			// '\\)' OVER '\\(' orderby '\\)' ( AS )? BASIC_NAME
			{
				match(input, ROWNUMBER, FOLLOW_ROWNUMBER_in_db2_paging826);
				match(input, 74, FOLLOW_74_in_db2_paging827);
				match(input, 75, FOLLOW_75_in_db2_paging828);
				match(input, OVER, FOLLOW_OVER_in_db2_paging830);
				match(input, 74, FOLLOW_74_in_db2_paging831);
				pushFollow(FOLLOW_orderby_in_db2_paging832);
				orderby();
				state._fsp--;
				match(input, 75, FOLLOW_75_in_db2_paging834);
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:182:41: ( AS )?
				int alt45 = 2;
				int LA45_0 = input.LA(1);
				if ((LA45_0 == AS)) {
					alt45 = 1;
				}
				switch (alt45) {
				case 1:
				// /Users/akwei/antlrpro/sql2/AntlrV3SQL.g:182:42: AS
				{
					match(input, AS, FOLLOW_AS_in_db2_paging837);
				}
					break;
				}
				match(input, BASIC_NAME, FOLLOW_BASIC_NAME_in_db2_paging841);
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

	// $ANTLR end "db2_paging"
	// Delegated rules
	public static final BitSet FOLLOW_sql_insert_in_start23 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_sql_delete_in_start25 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_sql_update_in_start27 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_sql_select_in_start29 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_INSERT_in_sql_insert40 = new BitSet(
			new long[] { 0x0000000040000000L });

	public static final BitSet FOLLOW_INTO_in_sql_insert42 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_table_in_sql_insert44 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000400L });

	public static final BitSet FOLLOW_74_in_sql_insert46 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_insertColumn_in_sql_insert48 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000804L });

	public static final BitSet FOLLOW_66_in_sql_insert51 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_insertColumn_in_sql_insert53 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000804L });

	public static final BitSet FOLLOW_75_in_sql_insert57 = new BitSet(
			new long[] { 0x0200000000000000L });

	public static final BitSet FOLLOW_VALUES_in_sql_insert59 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000400L });

	public static final BitSet FOLLOW_74_in_sql_insert61 = new BitSet(
			new long[] { 0x0000100000000000L, 0x0000000000000804L });

	public static final BitSet FOLLOW_PRE_SET_in_sql_insert64 = new BitSet(
			new long[] { 0x0000100000000000L, 0x0000000000000804L });

	public static final BitSet FOLLOW_66_in_sql_insert67 = new BitSet(
			new long[] { 0x0000100000000000L });

	public static final BitSet FOLLOW_PRE_SET_in_sql_insert69 = new BitSet(
			new long[] { 0x0000100000000000L, 0x0000000000000804L });

	public static final BitSet FOLLOW_75_in_sql_insert74 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_DELETE_in_sql_delete91 = new BitSet(
			new long[] { 0x0000000000100000L });

	public static final BitSet FOLLOW_FROM_in_sql_delete93 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_table_in_sql_delete95 = new BitSet(
			new long[] { 0x0800000000000002L });

	public static final BitSet FOLLOW_WHERE_in_sql_delete98 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_kv_in_sql_delete100 = new BitSet(
			new long[] { 0x0000010000000022L });

	public static final BitSet FOLLOW_and_or_in_sql_delete103 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_kv_in_sql_delete105 = new BitSet(
			new long[] { 0x0000010000000022L });

	public static final BitSet FOLLOW_UPDATE_in_sql_update126 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_table_in_sql_update128 = new BitSet(
			new long[] { 0x0008000000000000L });

	public static final BitSet FOLLOW_SET_in_sql_update130 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_kv_in_sql_update132 = new BitSet(
			new long[] { 0x0800000000000002L, 0x0000000000000004L });

	public static final BitSet FOLLOW_66_in_sql_update135 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_kv_in_sql_update137 = new BitSet(
			new long[] { 0x0800000000000002L, 0x0000000000000004L });

	public static final BitSet FOLLOW_WHERE_in_sql_update142 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_kv_in_sql_update144 = new BitSet(
			new long[] { 0x0000010000000022L });

	public static final BitSet FOLLOW_and_or_in_sql_update147 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_kv_in_sql_update149 = new BitSet(
			new long[] { 0x0000010000000022L });

	public static final BitSet FOLLOW_SELECT_in_sql_select171 = new BitSet(
			new long[] { 0x0000000000000200L, 0x0000000000000002L });

	public static final BitSet FOLLOW_select_columns_in_sql_select173 = new BitSet(
			new long[] { 0x0000000000100000L, 0x0000000000000004L });

	public static final BitSet FOLLOW_66_in_sql_select176 = new BitSet(
			new long[] { 0x0001000000000000L });

	public static final BitSet FOLLOW_db2_paging_in_sql_select177 = new BitSet(
			new long[] { 0x0000000000100000L });

	public static final BitSet FOLLOW_FROM_in_sql_select181 = new BitSet(
			new long[] { 0x0000000000000200L, 0x0000000000000400L });

	public static final BitSet FOLLOW_sqlAfterFrom_in_sql_select184 = new BitSet(
			new long[] { 0x0800020002800002L });

	public static final BitSet FOLLOW_inner_select_in_sql_select186 = new BitSet(
			new long[] { 0x0800020002800002L });

	public static final BitSet FOLLOW_WHERE_in_sql_select190 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_kv_sql_in_sql_select192 = new BitSet(
			new long[] { 0x0000020002800002L });

	public static final BitSet FOLLOW_orderby_in_sql_select197 = new BitSet(
			new long[] { 0x0000020002800002L });

	public static final BitSet FOLLOW_groupby_in_sql_select199 = new BitSet(
			new long[] { 0x0000020002800002L });

	public static final BitSet FOLLOW_having_in_sql_select201 = new BitSet(
			new long[] { 0x0000020002800002L });

	public static final BitSet FOLLOW_tables_in_sqlAfterFrom218 = new BitSet(
			new long[] { 0x0000800810202002L });

	public static final BitSet FOLLOW_set_in_sqlAfterFrom221 = new BitSet(
			new long[] { 0x0000000100000000L });

	public static final BitSet FOLLOW_JOIN_in_sqlAfterFrom233 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_table_in_sqlAfterFrom235 = new BitSet(
			new long[] { 0x0000808810202002L });

	public static final BitSet FOLLOW_ON_in_sqlAfterFrom238 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_column_name_in_sqlAfterFrom240 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000080L });

	public static final BitSet FOLLOW_71_in_sqlAfterFrom242 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_column_name_in_sqlAfterFrom244 = new BitSet(
			new long[] { 0x0000800810202002L });

	public static final BitSet FOLLOW_kv_sql_in_kv_sql_wrapper258 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_74_in_kv_sql_wrapper262 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_kv_sql_in_kv_sql_wrapper264 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000800L });

	public static final BitSet FOLLOW_75_in_kv_sql_wrapper266 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_kv_in_kv_sql277 = new BitSet(
			new long[] { 0x0000010000000022L });

	public static final BitSet FOLLOW_and_or_in_kv_sql281 = new BitSet(
			new long[] { 0x0000000000000200L, 0x0000000000000400L });

	public static final BitSet FOLLOW_kv_in_kv_sql284 = new BitSet(
			new long[] { 0x0000010000000022L });

	public static final BitSet FOLLOW_74_in_kv_sql288 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_kv_in_kv_sql290 = new BitSet(new long[] {
			0x0000010000000020L, 0x0000000000000800L });

	public static final BitSet FOLLOW_and_or_in_kv_sql293 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_kv_in_kv_sql295 = new BitSet(new long[] {
			0x0000010000000020L, 0x0000000000000800L });

	public static final BitSet FOLLOW_75_in_kv_sql299 = new BitSet(
			new long[] { 0x0000010000000022L });

	public static final BitSet FOLLOW_74_in_inner_select316 = new BitSet(
			new long[] { 0x0004000000000000L });

	public static final BitSet FOLLOW_sql_select_in_inner_select318 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000800L });

	public static final BitSet FOLLOW_75_in_inner_select320 = new BitSet(
			new long[] { 0x0000000000000242L });

	public static final BitSet FOLLOW_AS_in_inner_select322 = new BitSet(
			new long[] { 0x0000000000000202L });

	public static final BitSet FOLLOW_BASIC_NAME_in_inner_select325 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_BASIC_NAME_in_func338 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000400L });

	public static final BitSet FOLLOW_74_in_func340 = new BitSet(new long[] {
			0x0000000000000200L, 0x0000000000000802L });

	public static final BitSet FOLLOW_75_in_func349 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_func_in_func_and_alias363 = new BitSet(
			new long[] { 0x0000000000000242L });

	public static final BitSet FOLLOW_AS_in_func_and_alias366 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_BASIC_NAME_in_func_and_alias369 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_column_name_in_select_column_and_alias383 = new BitSet(
			new long[] { 0x0000000000000242L });

	public static final BitSet FOLLOW_AS_in_select_column_and_alias386 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_BASIC_NAME_in_select_column_and_alias389 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_select_column_and_alias_in_select_column403 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_func_and_alias_in_select_column405 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_65_in_select_column407 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_select_column_in_select_columns420 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000004L });

	public static final BitSet FOLLOW_66_in_select_columns423 = new BitSet(
			new long[] { 0x0000000000000200L, 0x0000000000000002L });

	public static final BitSet FOLLOW_select_column_in_select_columns425 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000004L });

	public static final BitSet FOLLOW_table_name_in_table455 = new BitSet(
			new long[] { 0x0000000000000242L });

	public static final BitSet FOLLOW_AS_in_table459 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_alias_in_table463 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_table_in_tables479 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000004L });

	public static final BitSet FOLLOW_66_in_tables482 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_table_in_tables484 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000004L });

	public static final BitSet FOLLOW_BASIC_NAME_in_table_name500 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000008L });

	public static final BitSet FOLLOW_67_in_table_name504 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_BASIC_NAME_in_table_name507 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_BASIC_NAME_in_alias520 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_BASIC_NAME_in_column_name532 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000008L });

	public static final BitSet FOLLOW_67_in_column_name536 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_BASIC_NAME_in_column_name539 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_column_name_in_insertColumn553 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_column_name_in_kv570 = new BitSet(
			new long[] { 0x0000000008040000L, 0x00000000000003F1L });

	public static final BitSet FOLLOW_op_in_kv572 = new BitSet(new long[] {
			0x0000100000000000L, 0x0000000000000400L });

	public static final BitSet FOLLOW_PRE_SET_in_kv575 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_74_in_kv577 = new BitSet(
			new long[] { 0x0000100000000000L });

	public static final BitSet FOLLOW_PRE_SET_in_kv579 = new BitSet(new long[] {
			0x0000000000000000L, 0x0000000000000800L });

	public static final BitSet FOLLOW_75_in_kv581 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_column_name_in_kv592 = new BitSet(
			new long[] { 0x0000000008040000L, 0x00000000000003F1L });

	public static final BitSet FOLLOW_op_in_kv594 = new BitSet(
			new long[] { 0x0020000000000000L });

	public static final BitSet FOLLOW_TEXT_STRING_in_kv596 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_column_name_in_kv603 = new BitSet(
			new long[] { 0x0000000000000400L });

	public static final BitSet FOLLOW_BETWEEN_in_kv605 = new BitSet(
			new long[] { 0x0000100000000000L });

	public static final BitSet FOLLOW_PRE_SET_in_kv607 = new BitSet(
			new long[] { 0x0000000000000020L });

	public static final BitSet FOLLOW_AND_in_kv609 = new BitSet(
			new long[] { 0x0000100000000000L });

	public static final BitSet FOLLOW_PRE_SET_in_kv611 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_column_name_in_kv622 = new BitSet(
			new long[] { 0x0000000008040000L, 0x00000000000003F1L });

	public static final BitSet FOLLOW_op_in_kv624 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_column_name_in_kv626 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_column_name_in_kv632 = new BitSet(
			new long[] { 0x0000000008040000L, 0x00000000000003F1L });

	public static final BitSet FOLLOW_op_in_kv634 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_func2_in_kv636 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_column_name_in_kv642 = new BitSet(
			new long[] { 0x0000000008040000L, 0x00000000000003F1L });

	public static final BitSet FOLLOW_op_in_kv644 = new BitSet(new long[] {
			0x0000000000000000L, 0x0000000000000400L });

	public static final BitSet FOLLOW_74_in_kv646 = new BitSet(
			new long[] { 0x0004000000000000L });

	public static final BitSet FOLLOW_sql_select_in_kv648 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000800L });

	public static final BitSet FOLLOW_75_in_kv650 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_BASIC_NAME_in_func2661 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000400L });

	public static final BitSet FOLLOW_74_in_func2665 = new BitSet(new long[] {
			0x0020000000000200L, 0x0000000000000800L });

	public static final BitSet FOLLOW_column_name_in_func2673 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000804L });

	public static final BitSet FOLLOW_TEXT_STRING_in_func2675 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000804L });

	public static final BitSet FOLLOW_66_in_func2679 = new BitSet(
			new long[] { 0x0020000000000200L });

	public static final BitSet FOLLOW_column_name_in_func2682 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000804L });

	public static final BitSet FOLLOW_TEXT_STRING_in_func2684 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000804L });

	public static final BitSet FOLLOW_75_in_func2694 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_ORDER_in_orderby736 = new BitSet(
			new long[] { 0x0000000000000800L });

	public static final BitSet FOLLOW_BY_in_orderby738 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_column_name_in_orderby740 = new BitSet(
			new long[] { 0x0000000000010082L, 0x0000000000000004L });

	public static final BitSet FOLLOW_66_in_orderby750 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_column_name_in_orderby752 = new BitSet(
			new long[] { 0x0000000000010082L, 0x0000000000000004L });

	public static final BitSet FOLLOW_GROUP_in_groupby773 = new BitSet(
			new long[] { 0x0000000000000800L });

	public static final BitSet FOLLOW_BY_in_groupby775 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_column_name_in_groupby777 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000004L });

	public static final BitSet FOLLOW_66_in_groupby780 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_column_name_in_groupby782 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000004L });

	public static final BitSet FOLLOW_HAVING_in_having795 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_column_name_in_having798 = new BitSet(
			new long[] { 0x0000000008040000L, 0x00000000000003F1L });

	public static final BitSet FOLLOW_func_in_having800 = new BitSet(
			new long[] { 0x0000000008040000L, 0x00000000000003F1L });

	public static final BitSet FOLLOW_op_in_having803 = new BitSet(
			new long[] { 0x0020100000000200L });

	public static final BitSet FOLLOW_column_name_in_having806 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_func_in_having808 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_TEXT_STRING_in_having810 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_PRE_SET_in_having812 = new BitSet(
			new long[] { 0x0000000000000002L });

	public static final BitSet FOLLOW_ROWNUMBER_in_db2_paging826 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000400L });

	public static final BitSet FOLLOW_74_in_db2_paging827 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000800L });

	public static final BitSet FOLLOW_75_in_db2_paging828 = new BitSet(
			new long[] { 0x0000040000000000L });

	public static final BitSet FOLLOW_OVER_in_db2_paging830 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000400L });

	public static final BitSet FOLLOW_74_in_db2_paging831 = new BitSet(
			new long[] { 0x0000020000000000L });

	public static final BitSet FOLLOW_orderby_in_db2_paging832 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000800L });

	public static final BitSet FOLLOW_75_in_db2_paging834 = new BitSet(
			new long[] { 0x0000000000000240L });

	public static final BitSet FOLLOW_AS_in_db2_paging837 = new BitSet(
			new long[] { 0x0000000000000200L });

	public static final BitSet FOLLOW_BASIC_NAME_in_db2_paging841 = new BitSet(
			new long[] { 0x0000000000000002L });
}