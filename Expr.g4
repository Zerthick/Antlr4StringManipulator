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
    |   VAR a=eList STRING (NEWLINE | ';') {System.out.println($a.list);}
    |   NEWLINE                   
    ;

e returns [Object v]
    : a=e op=( MUL | DIV ) b=e  
        {   
            if ($a.v instanceof Integer && $b.v instanceof Integer){
                $v = eval((Integer)$a.v, $op.type, (Integer)$b.v);
            }
        }
    | a=e op=( ADD | SUB ) b=e  
        {
            if ($a.v instanceof Integer && $b.v instanceof Integer){
                $v = eval((Integer)$a.v, $op.type, (Integer)$b.v);
            }
        }
    | SUB INT               {$v = -1 * $INT.int;}
    | INT                   {$v = $INT.int;}
    | STR                {$v = $STR.text;}    
    | ID
      {
        String id = $ID.text;
        $v = memory.containsKey(id) ? memory.get(id) : 0;
      }
    | '(' e ')'             {$v = $e.v;}       
    ; 

idList: ID (',' ID)* ;
eList returns [List<Object> list]
locals [
    List<Object> exprs = new ArrayList<>();
]
    : a=e {$exprs.add($a.v);} (',' b=e {$exprs.add($b.v);})* {$list = $exprs;};

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
