package review.prgrmrs;

import java.util.Arrays;
import java.util.Comparator;

public class biggestNum_lv2 {

	public static void main(String[] args) {
		int[] numbers = { 3, 30, 34, 5, 9 };
		System.err.println(solution(numbers));
	}

	public static String solution(int[] numbers) {
		//문자열 두개씩 더해서 내림차순 정렬(303 < 330)
		StringBuilder sb=new StringBuilder();
		String[] str=new String[numbers.length];
		for(int i=0; i<numbers.length; i++) str[i]=String.valueOf(numbers[i]);
		Arrays.sort(str,new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return (b+a).compareTo(a+b);
			}
		});
		if(str[0].equals("0")) return "0";
        for(String s:str) sb.append(s);
		return sb.toString();
	}
}
