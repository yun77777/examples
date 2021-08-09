package prgrmrs;

import java.util.Arrays;
import java.util.Comparator;

public class ex12_lv2 {

	public static void main(String[] args) {
		int[] numbers= {3, 30, 34, 5, 9};
		System.err.println(solution(numbers));
	}

	//Comparator
	//a.compareTo(b)
	//내림차순: (o2+o1).compareTo(o1+o2);
	//오름차순: (o1+o2).compareTo(o1+o2);
	public static String solution(int[] numbers) {
		String answer = "";
		
		String[] str=new String[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			str[i]=String.valueOf(numbers[i]);
		}
		
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return (b+a).compareTo(a+b);//내림차순 정렬
			}
		});
		
		if(str[0].equals("0")) return "0";
		
		for(String s: str) answer+=s;
		
		return answer;
	}
}
