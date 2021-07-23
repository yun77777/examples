package lc;

public class ex389 {
	static int[] nums;

	public static void main(String[] args) {
		System.err.println(findTheDifference("abcd","abcde"));
	}
    public static char findTheDifference(String s, String t) {
    	if(s==null||s==null) return ' ';
    	if(s.equals(t)) return ' ';
    	int[] arr=new int[26];
    	char ch=' ';

    	for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)-'a']++;
		}
    	for (int i = 0; i < t.length(); i++) {
			arr[t.charAt(i)-'a']--;
		}
    	for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0)
				ch=(char) (i+'a');
		}
    	
    	//abb
    	//acbb->abbc
    	
    	//acc
    	//abcc
    		
    	return ch;
    }
}
