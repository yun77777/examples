package lc;

import java.io.IOException;
import java.util.HashMap;

public class ex204 {
	public static void main(String[] args) throws IOException {
		System.err.println(isIsomorphic("egg","add"));
	}

    public static boolean isIsomorphic(String s, String t) {
    	HashMap<Character, Character> hm = new HashMap<Character, Character>();
		
 	   /*looping through strig once and comparing 
 	   the characters if hashed and if not then mapping it.*/
 	   
        for(int i=0; i<s.length(); i++){ 
         
             if(hm.containsKey(s.charAt(i))){
                 if(hm.get(s.charAt(i))!=t.charAt(i))
                     return false;}
            
             else if(hm.containsValue(t.charAt(i)))
                     return false;
            
             else
                hm.put(s.charAt(i), t.charAt(i));
            
           }
            
            return true;
   }
}
