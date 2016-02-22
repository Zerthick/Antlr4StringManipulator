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
        //Error
        return 0;
    }
    
    String eval(String left, int op, String right) {
        switch (op) {
            case ADD : return left + right;
        }
        //Error
        return "";
    }
    
    String eval(String left, int op, int right) {
        switch (op) {
            case MUL :
                if ( right > 0 ){
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < right; i++) {
                        sb.append(left);
                    }
                    return sb.toString();
                }
                //Error
                return "";
            case ADD :
                if ( right > 0 ) {
                    if ( right < left.length() ){
                        return left.substring(right);
                    } else {
                        return "";
                    }
                } else {
                    if ( (right * -1) < left.length() ){
                        return left.substring(0, left.length() + right);
                    } else {
                        return "";
                    }
                }
            case SUB :
                if ( right > 0) {
                    if ( right < left.length() ){
                        return left.substring(0, left.length() - right);
                    } else {
                        return "";
                    }
                } else {
                    if ( (right * -1) < left.length() ){
                        return left.substring(right * -1);
                    } else {
                        return "";
                    }
                }
        }
        //Error
        return "";
    }
}

prog:   stat+ ;

stat:   PRINT e (NEWLINE | ';')             {System.out.println($e.v);}
    |   ID ':=' e (NEWLINE | ';')           {memory.put($ID.text, $e.v);}
    |   ID '=' e (NEWLINE | ';')            
        {
            if(memory.containsKey($ID.text)){
                memory.put($ID.text, $e.v);
            }
            //Error
        }
    |   VAR a=idList STRING (NEWLINE | ';') 
        {
            for (String id : $a.list){
                memory.put(id, "");
            }
        }
    |   VAR a=idList INTEGER (NEWLINE | ';') 
        {
            for (String id : $a.list){
                memory.put(id, 0);
            }
        }
    |   VAR a=idList STRING b=eList (NEWLINE | ';') 
        {
            List<String> ids = $a.list;
            List<Object> exprs = $b.list;
            if(ids.size() == exprs.size()){
                for (int i = 0; i < ids.size(); i++){
                    if(exprs.get(i) instanceof String){
                        memory.put(ids.get(i), (String)exprs.get(i));
                    }
                    //Error
                }
            }
        }
    |   VAR a=idList INTEGER b=eList (NEWLINE | ';') 
        {
            List<String> ids = $a.list;
            List<Object> exprs = $b.list;
            if(ids.size() == exprs.size()){
                for (int i = 0; i < ids.size(); i++){
                    if(exprs.get(i) instanceof Integer){
                        memory.put(ids.get(i), (Integer)exprs.get(i));
                    }
                    //Error
                }
            }
        }
    |   NEWLINE 
    |   ';'                  
    ;

e returns [Object v]
    : a=e op=( MUL | DIV ) b=e  
        {   
            if ($a.v instanceof Integer && $b.v instanceof Integer){
                $v = eval((Integer)$a.v, $op.type, (Integer)$b.v);
            }
            if ($a.v instanceof String && $b.v instanceof Integer){
                $v = eval((String)$a.v, $op.type, (Integer)$b.v);
            }
            if ($a.v instanceof Integer && $b.v instanceof String){
                $v = eval((String)$b.v, $op.type, (Integer)$a.v);
            }
            //Error
        }
    | a=e op=( ADD | SUB ) b=e  
        {
            if ($a.v instanceof Integer && $b.v instanceof Integer){
                $v = eval((Integer)$a.v, $op.type, (Integer)$b.v);
            }
            if ($a.v instanceof String && $b.v instanceof String){
                $v = eval((String)$a.v, $op.type, (String)$b.v);
            }
            if ($a.v instanceof String && $b.v instanceof Integer){
                $v = eval((String)$a.v, $op.type, (Integer)$b.v);
            }
            if ($a.v instanceof Integer && $b.v instanceof String){
                $v = eval((String)$b.v, $op.type, (Integer)$a.v);
            }
            //Error
        }
    | SUB INT               {$v = -1 * $INT.int;}
    | INT                   {$v = $INT.int;}
    | STR                   {$v = $STR.text.replaceAll("\"", "");}    
    | ID
      {
        String id = $ID.text;
        $v = memory.containsKey(id) ? memory.get(id) : 0;
        //Error
      }
    | '(' a=e ')'             {$v = $a.v;}       
    ; 

//ID List
idList returns [List<String> list]
locals [
    List<String> ids = new ArrayList<>();
]
    : ID {$ids.add($ID.text);} (',' ID {$ids.add($ID.text);})* {$list = $ids;};

//Expression List
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
