grammar AntlrV3SQL;

@header {
import java.util.List;
import java.util.ArrayList;
}

@members {
    private AntlrParserDelegate antlrParserDelegate;

    public void setAntlrParserDelegate(AntlrParserDelegate antlrParserDelegate) {
        this.antlrParserDelegate = antlrParserDelegate;
    }

@Override
    public void reportError(RecognitionException e) {
    }

}

start	:
	sql_insert|sql_delete|sql_update|sql_select;

sql_insert 
	:
	INSERT INTO table '\(' insertColumn (',' insertColumn)* '\)' VALUES '\(' (PRE_SET|(',' PRE_SET))* '\)' 
	{this.antlrParserDelegate.setSqlOp(AntlrParserDelegate.SQLOP_INSERT);}
	;

sql_delete
	:	
	DELETE FROM table (WHERE kv_sql)? 
	{this.antlrParserDelegate.setSqlOp(AntlrParserDelegate.SQLOP_DELETE);}
	;

sql_update
	:	
	UPDATE table SET kv (',' kv)* (WHERE kv_sql)? 
	{this.antlrParserDelegate.setSqlOp(AntlrParserDelegate.SQLOP_UPDATE);}
	;
	
sql_select 
	:
	SELECT select_columns (','db2_paging)? FROM (sqlAfterFrom|inner_select) (WHERE kv_sql)? (orderby|groupby|having)*
	{this.antlrParserDelegate.setSqlOp(AntlrParserDelegate.SQLOP_SELECT);}
	;

sqlAfterFrom
	:
	tables ((FULL|CROSS|INNER|LEFT|RIGHT) JOIN table (ON column_name '=' column_name)?)*;

kv_sql_wrapper
	:
	kv_sql | '\(' kv_sql '\)'
	;
kv_sql	:	
	kv ( and_or (kv | '\(' kv (and_or kv)* '\)')  )*
	;

inner_select
	:
	'\(' sql_select '\)' AS? BASIC_NAME?
	;

func
	:
	BASIC_NAME '\(' (BASIC_NAME|'*')? '\)' 
	;
	
func_and_alias
	:
	func (AS? BASIC_NAME)?
	;

select_column_and_alias
	:
	column_name (AS? BASIC_NAME)?
	;

select_column
	:
	select_column_and_alias|func_and_alias|'*'
	;
	
select_columns
	:
	select_column (',' select_column)*
	;
	
and_or	:	
	AND|OR
	;
	
table	:	
	table_name ((AS)? alias)? {
	if (this.antlrParserDelegate != null) {
            this.antlrParserDelegate.onFindTable( $table_name.text, $alias.text);
        }
	}; 
	
tables	:
	(table (',' table)*)
	;

table_name 
	:
	BASIC_NAME (('.') BASIC_NAME)?
	;

alias	:
	BASIC_NAME
	;

column_name
	:
	BASIC_NAME (('.') BASIC_NAME)?
	;

insertColumn
	:
	column_name
	{
	if (this.antlrParserDelegate != null) {
            this.antlrParserDelegate.onFindColExper(
                    $column_name.text, "=");
        }
	}
	;
	

kv	:
	(column_name op (PRE_SET|'\(' PRE_SET '\)'))
	{
	if (this.antlrParserDelegate != null) {
            this.antlrParserDelegate.onFindColExper( $column_name.text,  $op.text);
        }
	}
	|
	column_name op TEXT_STRING
	|
	(column_name BETWEEN PRE_SET AND PRE_SET)
		{
		this.antlrParserDelegate.onFindColExper($column_name.text, ">=");
		this.antlrParserDelegate.onFindColExper($column_name.text, "=<");
		}
	|
	column_name op column_name
	|
	column_name op func2
	|
	column_name op '\(' sql_select '\)'
	|
	(column_name op '\(' inexpr  '\)'  )
	{
	if (this.antlrParserDelegate != null) {
	    String s=$inexpr.text;
	    int cnt=s.split(",").length;
	    for(int i=0;i<cnt;++i)
            this.antlrParserDelegate.onFindColExper( $column_name.text,  $op.text);
        }
	}
	;
inexpr	:
	PRE_SET ',' PRE_SET (',' PRE_SET)*
	;

func2	:
	BASIC_NAME 
	'\(' 
	(
	(column_name|TEXT_STRING) (',' (column_name|TEXT_STRING))*
	)?
	'\)'
	;

op
	:	
	('='|'>'|'>='|'<'|'<='|'!='|'<>'|IN|EXISTS)
	;

orderby	:
	ORDER BY column_name (DESC|ASC)? (',' column_name (DESC|ASC)?)*
	;
	
groupby	:
	GROUP BY column_name (',' column_name)*
	;

having	:
	HAVING (column_name|func) op (column_name|func|TEXT_STRING|PRE_SET)
	;

db2_paging
	:	
	ROWNUMBER'\(''\)' OVER'\('orderby '\)' (AS)? BASIC_NAME
	;
	
SELECT	:S E L E C T;
INSERT 	:I N S E R T;
UPDATE	:U P D A T E;
DELETE	:D E L E T E;
ROWNUMBER 
	:R O W N U M B E R;
OVER	:O V E R;
BETWEEN	:B E T W E E N;
AND	:A N D;
OR	:O R;
WHERE	:W H E R E;
GROUP	:G R O U P;
HAVING	:H A V I N G;
BY	:B Y;
ORDER	:O R D E R;
DESC	:D E S C;
ASC	:A S C;
SET	:S E T;
ON	:O N;
FULL	:F U L L;
INNER	:I N N E R;
AS	:A S;
FROM	:F R O M;
LEFT	:L E F T;
RIGHT	:R I G H T;
CROSS	:C R O S S;
JOIN	:J O I N;
VALUES	:V A L U E S;
INTO	:I N T O;
IN	:I N;
EXISTS	:E X I S T S;
PRE_SET	:'?';

BASIC_NAME
	:
	('a'..'z'|'A'..'Z'|'0'..'9'|'_')+;

TEXT_STRING:
	  ('\'' 
	  	( 
	  		  options{greedy=true;}: ~('\'' | '\r' | '\n' ) | '\'' '\'' 
	  		  	  	)* 
	  		  	  		  '\'' )
		 
	;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;


fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');