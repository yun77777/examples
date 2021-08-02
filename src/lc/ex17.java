package lc;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ex17 {

	public static void main(String[] args) {
		String digits = "23";
		System.err.println(letterCombinations(digits));
	}
    public static List<String> letterCombinations(String digits) {
    	LinkedList<String> res=new LinkedList<String>();
        if(digits.length()==0) return res; 
    	Map<Integer,String> map=new HashMap<Integer, String>();
    	map.put(1,"");
    	map.put(2,"abc");
    	map.put(3,"def");
    	map.put(4,"ghi");
    	map.put(5,"jkl");
    	map.put(6,"mno");
    	map.put(7,"pqrs");
    	map.put(8,"tuv");
    	map.put(9,"wxyz");
    	
    	res.add("");
    	for (int i = 0; i < digits.length(); i++) {
    		int x=Character.getNumericValue(digits.charAt(i));
    		System.err.println(x+","+res);
    		while(res.peek().length()==i) {
    			String t=res.remove();
    			for(char s:map.get(x).toString().toCharArray()) res.add(t+s);
    		}
    	}
    	
//    	for (int i = 0; i < digits.length()-1; i++) {
//    		for (int j = i+1; j < digits.length(); j++) {
//    			if(digits.charAt(j)-'0'==i) {
//    				System.err.println(map.get(i));
//    				for (int k = 0; k < map.get(i).length(); k++) {
//    					System.err.println(map.get(i).charAt(k));
//    					res.add(map.get(i).charAt(k)+"");
//					}
//    			}
//			}
//			
//		}
    	return res;
    }
}
