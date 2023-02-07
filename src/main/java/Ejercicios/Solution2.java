package Ejercicios;

/*
 * This class validates if a text chain has the next signs: '(',')','{','}','[',']' 
 * and evaluates if these open and close correctly.
 */

import java.util.*;


class Solution2{

  public static void main(String[] args) {
  
    /*String chain = "{ [] ( ) }";*/
    /*String chain = "{ [(] ) }";*/
    /*String chain = "{ [ }"*/;
    String chain = "(This (is) a [correct{string}], return (true))";
//    String chain = "(This (is} an [incorrect{string}], return (false])";

//    String chain = "var myNumbers = [9,78,1,9,3,1,0];"+
//    "myNumbers.sort(function(a,b){"+
//      "const array = [3,5,1,8,9,10]"+
//      "if( array.indexOf(a) !== -1 ){"+
//        "return a;"+
//      "}"+
//      "return b-a;"+
//    "});";

    System.out.println("Response: "+validateChain(chain));

  }

  /*
  * Method to validate signs.
  */
  private static boolean validateChain(String chain){
      
      //Map with validate signs.
      Map<String,String>signs = new HashMap<>();
      signs.put("(",")");
      signs.put("{","}");
      signs.put("[","]");

      //Stack to save the openers.
      Stack<Map.Entry<String,String>> stack = new Stack<>();

      //Iterate each of signs in the chain.
      for(char sign : chain.toCharArray()){
        
        //Get the current sign to validate.
        String thisSign = String.valueOf(sign);

          //If the current sign is in map as a key, then push it in stack.
          Map.Entry<String,String> keyReturned = getOpener(signs,thisSign);
          if( keyReturned != null ){
            stack.push(keyReturned);
            continue;
          }

          //If this sign is a closer and this belong to the last opener, then remove the last opener from the stack.
          if( signs.containsValue(thisSign) ) {
            if( stack.isEmpty() ){
                return false;
            }
            if( stack.peek().getValue().equals(thisSign) ){
               stack.pop();
            } else {
                return false;
            }
          }
        
      }

      //If the stack is empty, the chain text is correct.
      if( stack.isEmpty() ){
        return true;
      }

      return false;
    }

    /**
    * Method to iterate each of elements in map to get the key from the value sent.
    **/
    private static Map.Entry<String,String> getOpener(Map<String,String>map, String key){

      for(Map.Entry<String,String> entry : map.entrySet()){
        if( key.equals(entry.getKey()) ){
          return entry;
        }
      }
      return null;
    }
}
