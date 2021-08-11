package review.prgrmrs;

import java.util.Arrays;
import java.util.Comparator;

public class biggestNum_lv2 {

	public static void main(String[] args) {
		int[] numbers = { 3, 30, 34, 5, 9 };
		System.err.println(solution(numbers));
	}

	public static String solution(int[] numbers) {
		
		String[] str=new String[numbers.length];
		for(int i=0; i<str.length; i++) str[i]=String.valueOf(numbers[i]);
		
		Arrays.sort(str,new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return (b+a).compareTo(a+b);
			}
		});
		for (int i = 0; i < str.length; i++) {
			System.err.println(str[i]);
		}
		return str.toString();
	}
}
