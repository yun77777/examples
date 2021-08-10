package prgrmrs;

import java.util.Arrays;

public class ex17_lv2 {

	public static void main(String[] args) {
		int[] citations = { 3, 0, 6, 1, 5 };
		System.err.println(solution(citations));
	}

	public static int solution(int[] citations) {
		int answer=0;
		int[] sorted=Arrays.stream(citations).sorted().toArray();
		
		for(int i=sorted.length-1; i>=0; i--) {
			if(sorted[i]>answer) answer++;
			else break;
		}

		return answer;
	}
}
