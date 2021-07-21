package lc;

import java.util.ArrayList;
import java.util.List;

public class ex345 {
	static int[] nums;

	public static void main(String[] args) {
		System.err.println(reverseVowels("Aa"));
//		System.err.println(reverseVowels("hello"));
	}
	
    public static String reverseVowels(String s) {
    	char[] vowels= {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
//    	char[] arr= new char[s.length()];
    	List<Character> arr=new ArrayList<Character>();
    	String res="";
    	char tmp;
    	int k=0;
    	for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if(s.charAt(i)==vowels[j]) {
					arr.add(vowels[j]);
//					arr[i]=vowels[j];
					break;
				}
			}
		}
    	for (int i = 0; i < arr.size()/2; i++) {
			System.err.println(arr.get(i));
			System.err.println(arr.get(arr.size()-1-i));
			tmp=arr.get(i);
			arr.set(i, arr.get(arr.size()-1-i));
			arr.set(arr.size()-1-i, tmp);
			System.err.println(arr.get(i));
			System.err.println(arr.get(arr.size()-1-i));
		}
    	
//    	for (int i = 0; i < s.length(); i++) {
//    		for (int j = 0; j < vowels.length; j++) {
//				if(s.charAt(i)==vowels[j]) {
//					res+=arr.get(k++);
//					System.err.println("RES:"+res);
//				}
//				else
//					res+=s.charAt(i);
//				break;
//			}
//		}
    	boolean isVowel=false;
    	for (int i = 0; i < s.length(); i++) {
    		isVowel=false;
    		System.err.println("@:"+s.charAt(i));
			for (int j = 0; j < vowels.length; j++) {
				if(s.charAt(i)==vowels[j]) {
					res+=arr.get(k++);
					System.err.println("RES:"+res);
					isVowel=true;
					break;
				}
			}
			if(!isVowel) {
				res+=s.charAt(i);
				isVowel=false;
			}
			
		}
    	return res;
//    	return arr.toString();
    	
	}
}
