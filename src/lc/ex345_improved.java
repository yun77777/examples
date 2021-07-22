package lc;

public class ex345_improved {
	static int[] nums;

	public static void main(String[] args) {
		System.err.println(reverseVowels("Aa"));
//		System.err.println(reverseVowels("hello"));
	}
	
    public static String reverseVowels(String s) {
    	if(s==null||s.length()==0) return s;
//    	char[] vowels= {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
    	String vowels="aeiouAEIOU";
    	char[] chars=s.toCharArray();
    	int start=0;
    	int end=s.length()-1;
    	char temp=' ';
    	
    	while(start<end) {
    		while(start<end && !vowels.contains(chars[start]+"")) {
    			start++;
    		}
    		while(start<end && !vowels.contains(chars[end]+"")) {
    			end--;
    		}
    		temp=chars[start];
    		chars[start]=chars[end];
    		chars[end]=temp;
    		
    		start++;
    		end--;
    	}
    	return new String(chars);
//    	return chars.toString();
    	
	}
}
