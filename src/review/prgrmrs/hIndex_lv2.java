package review.prgrmrs;

import java.util.Arrays;

public class hIndex_lv2 {

	public static void main(String[] args) {
		int[] citations= {3, 0, 6, 1, 5};
		System.err.println(solution(citations));
	}

	public static int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);
		for(int i=citations.length-1; i>=0; i--) {
			if(citations[i]>answer) answer++;
			else break;
		}
		return answer;
	}
}
