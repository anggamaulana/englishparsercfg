
grammar EnglishRules;

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/
WS : [ \t\n\r]+ -> skip;

s : np vp|vp|AUX np vp|np vp ADVERB;
c : CONJUNCTION;


np : DETERMINAN nominal|DETERMINAN ADJECTIVE* NOUN|PRONOUN NOUN|NOUNPHRASE|NOUN|PRONOUN;
nominal : pp+|NOUN+|NOUN;

vp : pp+|VERB np|AUX ADVERB* ADJECTIVE np|AUX VERB+ np* ADVERB*|AUX NOUN np*|AUX np|VERB;

pp : PREPOSITION np;

DETERMINAN : 'D';
VERB : 'V'|'t';
NOUN : 'N';
PREPOSITION:'P';
PRONOUN:'r'|'his'|'her'|'their'|'my'|'your'|'its'|'he'|'she'|'it'|'i'|'you';
NOUNPHRASE:'h';
ADVERB : 'v';
ADJECTIVE : 'A';
INTERJECTION : '!';
AUX : 'am'|'is'|'was'|'were'|'will'|'shall'|'may';
CONJUNCTION : 'C'|'and'|'or'|'but'|'then'|'unless'|'when'|'while';



