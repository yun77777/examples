package review.lc;

public class ex242 {
    public boolean isAnagram(String s, String t) {
    	if(s==null||t==null) return false;
    	if(s.length()!=t.length()) return false;
    	char[] ch=new char[26];
    	for(char c:s.toCharArray())
    		ch[c-'a']++;
    	for(char c:t.toCharArray()) {
    		ch[c-'a']--;
    	}
       for(char c:t.toCharArray()) {
    		if(ch[c-'a']!=0) return false;
    	}
    	return true;
    }
}
