package lc;

import java.util.HashMap;
import java.util.Map;

public class ex290 {
	public static void main(String[] args) {
		String pattern="ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
		String s="s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
		System.err.println(wordPattern(pattern,s));
//		System.err.println(wordPattern("a","a"));
//		System.err.println(wordPattern("abba","dog cat cat dog"));
//		System.err.println(wordPattern("abba","dog cat cat fish"));
//		System.err.println(wordPattern("abba","dog dog dog dog"));
	}
	
	public static boolean wordPattern(String pattern, String s) {
		String[] words = s.split(" ");
	    if (words.length != pattern.length())
	        return false;
	    Map index = new HashMap();
	    for (Integer i=0; i<words.length; ++i)
	        if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
	            return false;
	    return true;
    }
//	public static boolean wordPattern(String pattern, String s) {
//		if(pattern==null||s==null) return false;
//		String[] str=s.split(" ");
//		if(str.length!=pattern.length()) return false;
//		Map m=new HashMap();
//		for (int i = 0; i < str.length; i++) {
////			System.err.println(m.containsKey(pattern.charAt(i)));
////			System.err.println("PA:"+pattern.charAt(i));
////			System.err.println("KEY:"+m.containsValue(""+pattern.charAt(i)));
//			
////				if(m.get(""+pattern.charAt(i))==null&&!m.containsKey(pattern.charAt(i))&&!m.containsValue(""+pattern.charAt(i)))
////				m.put(""+pattern.charAt(i),str[i]);
////			else
////			if(m.containsKey(str[i]))
////				continue;
////			System.err.println("a:"+m.containsKey(str[i]));
//			if(m.putIfAbsent(pattern.charAt(i),i)!=m.putIfAbsent(str[i], i))
////				if(m.put(pattern.charAt(i),i)!=m.put(str[i], i))
//				return false;
////			System.err.println("VAL:"+m.containsValue(str[i]));
//			System.err.println(pattern.charAt(i)+","+m.get(pattern.charAt(i))+","+m.get(str[i]));
////			System.err.println("DATA:"+m.get(""+pattern.charAt(i)));
//			
//		}
////		
//		return true;
//	}
//	public static boolean wordPattern(String pattern, String s) {
//		if(pattern==null||s==null) return false;
//		String[] str=s.split(" ");
//		if(str.length!=pattern.length()) return false;
//		
//		Map m=new HashMap();
//		int i=0;
//		
//		while(i<pattern.length()) {
////			System.err.println(m.containsKey(pattern.charAt(i)));
////			System.err.println("PA:"+pattern.charAt(i));
////			System.err.println("KEY:"+m.containsValue(""+pattern.charAt(i)));
//			
////				if(m.get(""+pattern.charAt(i))==null&&!m.containsKey(pattern.charAt(i))&&!m.containsValue(""+pattern.charAt(i)))
////				m.put(""+pattern.charAt(i),str[i]);
////			else
////			if(m.containsKey(str[i]))
////				continue;
////			System.err.println("a:"+m.containsKey(str[i]));
//			if(m.put(pattern.charAt(i),i)!=m.put(str[i], i))
//				return false;
////			System.err.println("VAL:"+m.containsValue(str[i]));
//			System.err.println(pattern.charAt(i)+","+m.get(pattern.charAt(i)));
////			System.err.println("DATA:"+m.get(""+pattern.charAt(i)));
//			
//			i++;
//		}
//		return true;
//	}
}
