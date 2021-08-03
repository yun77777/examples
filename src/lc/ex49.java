package lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ex49 {

	public static void main(String[] args) {
		String[] strs= {"eat","tea","tan","ate","nat","bat"};
		System.err.println(groupAnagrams(strs));
	}
    public static List<List<String>> groupAnagrams(String[] strs) {
    	if(strs==null||strs.length==0) return new ArrayList<>();
    	Map<String, List<String>> map=new HashMap<>();
    	for(String s:strs) {
    		char[] ch=new char[26];
    		for(char c:s.toCharArray()) ch[c-'a']++;
			String str=String.valueOf(ch);
    		if(!map.containsKey(str)) map.put(str,new ArrayList<>());
    		map.get(str).add(s);
    	}
    	return new ArrayList<>(map.values());
    }
}
