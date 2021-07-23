package lc;

public class ex387 {
	static int[] nums;

	public static void main(String[] args) {
		System.err.println(firstUniqChar("loveleetcode"));
	}
    public static int firstUniqChar(String s) {
    	if(s==null) return -1;
    	int[] arr=new int[26];
    	for (int i = 0; i < s.length(); i++) {
    		arr[s.charAt(i)-'a']++;
//    		System.err.println("arr:"+arr[s.charAt(i)-'a']);
		}
    	for (int i = 0; i < s.length(); i++) {
    		System.err.println(s.charAt(i)+":"+arr[s.charAt(i)-'a']);
    		if(arr[s.charAt(i)-'a']==1)
    			return i;
    	}
    	
    	return -1;
    }
}
