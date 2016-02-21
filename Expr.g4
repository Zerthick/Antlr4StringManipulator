/** Grammar from tour chapter augmented with actions */
grammar Expr;

@header {
import java.util.*;
}

@parser::members {
    /** "memory" for our calculator; variable/value pairs go here */
    Map<String, Object> memory = new HashMap<>();

    int eval(int left, int op, int right) {
        switch ( op ) {
            case MUL : return left * right;
            case DIV : return left / right;
            case ADD : return left + right;
            case SUB : return left - right;
        }
        return 0;
    }
}

prog:   stat+ ;

stat:   PRINT e (NEWLINE | ';')           {System.out.println($e.v);}
    |   ID ':=' e (NEWLINE | ';')    {memory.put($ID.text, $e.v);}
    |   NEWLINE                   
    ;

e returns [Object v]
    : a=e op=('*'|'/') b=e  {$v = eval((Integer)$a.v, $op.type, (Integer)$b.v);}
    | a=e op=('+'|'-') b=e  {$v = eval((Integer)$a.v, $op.type, (Integer)$b.v);}
    | '-' INT               {$v = -1 * $INT.int;}
    | INT                   {$v = $INT.int;}    
    | ID
      {
      String id = $ID.text;
      $v = memory.containsKey(id) ? memory.get(id) : 0;
      }
    | '(' e ')'             {$v = $e.v;}       
    ; 

//Operations
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;

//KEYWORDS
VAR : 'var' ;
PRINT : 'print' ;
STRING : 'string' ;
INTEGER : 'int' ;
 
//Tokens
INT :   [0-9]+ ;                // match integers
STR: '"' [a-zA-Z0-9]* '"' ;     // match strings
ID  :   [a-zA-Z]+[0-9]* ;       // match identifiers
NEWLINE:'\r'? '\n' ;            // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ;        // toss out whitespace
