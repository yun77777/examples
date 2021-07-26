package lc;

import java.util.HashSet;

public class ex409 {
	static int[] nums;

	public static void main(String[] args) {
		System.err.println(longestPalindrome("abccccdd"));
	}
    public static int longestPalindrome(String s) {
    	if(s==null || s.length()==0) return 0;
        HashSet<Character> hs=new HashSet<Character>();
        int cnt=0;
        for(int i=0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                cnt++;
            } else
                hs.add(s.charAt(i));
        }
        return hs.isEmpty() ? cnt*2 : cnt*2+1;
    }
}
