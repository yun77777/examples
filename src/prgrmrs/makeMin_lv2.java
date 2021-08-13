package prgrmrs;

import java.util.Arrays;

public class makeMin_lv2 {

	public static void main(String[] args) {
		int[] A = { 1, 4, 2 }, B = { 5, 4, 4 };
		System.err.println(solution(A, B));
	}

	public static int solution(int[] A, int[] B) {
		int answer = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		for (int i = 0, j=A.length-1; i < A.length; i++, j--) {
			answer+=A[i]*B[j];
		}
		return answer;
	}
}
