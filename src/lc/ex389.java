package lc;

public class ex389 {
	static int[] nums;

	public static void main(String[] args) {
		System.err.println(findTheDifference("abcd","abcde"));
	}
    public static char findTheDifference(String s, String t) {
    	int[] arr=new int[26];
    	char ch=' ';
    	
    	for(char c : s.toCharArray()) {
    		arr[c-'a']++;
    	}
    	
    	for(char c : t.toCharArray()) {
    		if(--arr[c-'a']<0)
    			return c;
    	}
    		
    	return 0;
    }
}
