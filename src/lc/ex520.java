package lc;

public class ex520 {
	public static boolean detectCapitalUse(String word) {
		char[] comp=word.toLowerCase().toCharArray();
		comp[0]=word.toUpperCase().charAt(0);
		StringBuilder sb=new StringBuilder();
		
		System.err.println(word);
		System.err.println(comp);
		System.err.println(sb.toString());
		for (int i = 0; i < comp.length; i++) {
			sb.append(comp[i]);
		}
		return word.equals(word.toUpperCase()) ? true : 
			(word.equals(word.toLowerCase()) ? true : (word.equals(sb.toString()) ? true : false));
	}
}
