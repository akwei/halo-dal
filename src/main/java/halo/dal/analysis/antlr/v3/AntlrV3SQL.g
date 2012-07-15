grammar AntlrV3SQL;

tokens{
	INSERT='insert';
	SELECT='select';
	DELETE='delete';
	UPDATE='update';
	FROM='from';
	SET='set';
	ON='on';
	AS='as';
	WHERE='where';
	AND='and';
	OR='or';
	LEFT='left';
	RIGHT='right';
	CROSS='cross';
	JOIN='join';
	INNER='inner';
	FULL='full';
	VALUES='values';
	INTO='into';
	LEFT_CLOSE='(';
	RIGHT_CLOSE=')';
	PRE_SET='?';
	INSERT_='INSERT';
	SELECT_='SELECT';
	DELETE_='DELETE';
	UPDATE_='UPDATE';
	FROM_='FROM';
	SET_='SET';
	ON_='ON';
	AS_='AS';
	WHERE_='WHERE';
	AND_='AND';
	OR_='OR';
	LEFT_='LEFT';
	RIGHT_='RIGHT';
	CROSS_='CROSS';
	JOIN_='JOIN';
	INNER_='INNER';
	FULL_='FULL';
	VALUES_='VALUES';
	INTO_='INTO';
}

@header {
import java.util.List;
import java.util.ArrayList;
}

@members {
List<String[]> tables = new ArrayList<String[]>();
List<String[]> colExprs=new ArrayList<String[]>();
//    private AntlrParserDelegate antlrParserDelegate;
//
//    public void setAntlrParserDelegate(AntlrParserDelegate antlrParserDelegate) {
//        this.antlrParserDelegate = antlrParserDelegate;
//    }

//@Override
//    public void reportError(RecognitionException e) {
//    }

}

proc	:	
	insertSQL|selectSQL|deleteSQL|updateSQL;

insertSQL
	:
	(INSERT|INSERT_) (INTO|INTO_) table LEFT_CLOSE insertColumn (',' insertColumn)* RIGHT_CLOSE (VALUES|VALUES_) LEFT_CLOSE (PRE_SET|(',' PRE_SET))* RIGHT_CLOSE ;
	
insertColumn
	:	
	WORD {
	colExprs.add(new String[]{$WORD.text,"="});
	//if (this.antlrParserDelegate != null) {
        //    this.antlrParserDelegate.onFindColExper(
        //            (WORD1 != null ? WORD1.getText() : null), "=");
        //}
	};
	
deleteSQL
	:	
	(DELETE|DELETE_) (FROM|FROM_) table whereSQL?;
	
selectSQL
	:	
	(SELECT|SELECT_) selectColums (FROM|FROM_) tables ((FULL|FULL_|CROSS|CROSS_|INNER|INNER_|LEFT|LEFT_|RIGHT|RIGHT_) (JOIN|JOIN_) table ((ON|ON_) WORD '=' WORD)?)? selectWhereSQL? other*;
	
selectWhereSQL
	:	
	(WHERE|WHERE_) (k_v|k_v2) (  and_or (k_v|k_v2) | and_or WORD op '(' selectSQL ')'  )*;

updateSQL
	:	
	(UPDATE|UPDATE_) table (SET|SET_) (k_v (',' k_v)*) whereSQL?;


table	:	
	name ((AS|AS_)? alias)? {
	tables.add(new String[]{$name.text,$alias.text});
	//                if (this.antlrParserDelegate != null) {
//                    this.antlrParserDelegate.onFindTable(
//                            (name2 != null ? input.toString(name2.start,
//                                    name2.stop) : null),
//                            (alias3 != null ? input.toString(alias3.start,
//                                    alias3.stop) : null));
//                }
	};
	
tables	:
	(table (',' table)*);

k_v2	:	
	WORD op ( WORD|('\'' WORD '\''));

k_v	:	
	WORD op PRE_SET {
	colExprs.add(new String[]{$WORD.text,$op.text});
	//                if (this.antlrParserDelegate != null) {
//                    this.antlrParserDelegate.onFindColExper(
//                            (WORD4 != null ? WORD4.getText() : null),
//                            (op5 != null ? input.toString(op5.start, op5.stop)
//                                    : null));
//                }
	};

column	:	
	name ((AS|AS_)? alias)?;
	
sel_column	:	
	sel_name ((AS|AS_)? sel_alias)?;

selectColums
	:
	(sel_column (',' sel_column)*) ;

whereSQL:		
	(WHERE|WHERE_) (k_v|k_v2) (and_or (k_v|k_v2))*;
		
and_or	:	
	(AND|AND_|OR|OR_);

op
	:	
	('='|'>'|'>='|'<'|'<='|'!='|'<>'|'in'|'IN'|'exists'|'EXISTS');
	
other	:	
	('group'|'GROUP'|'order'|'ORDER'|'having'|'HAVING'|'by'|'BY')+ WORD ('desc'|'DESC'|'asc'|'ASC');

sel_name:	
	WORD (LEFT_CLOSE WORD RIGHT_CLOSE)*;
	
sel_alias:	
	WORD (LEFT_CLOSE WORD RIGHT_CLOSE)*;

name	:	
	WORD;

alias	:	
	WORD;
	
WORD	:	
	('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'.'|'*'|'\\'|'\"')+;



WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

