package review.prgrmrs;

import java.util.Arrays;

public class greedy_ex1 {

	public static void main(String[] args) {
		int[] lost= {2,4};
		int[] reserve= {3};
		System.err.println(solution(5, lost, reserve));
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n-lost.length; //체육 수업 들을 수 있는 학생의 최댓값
		Arrays.sort(lost);
		Arrays.sort(reserve);
		
		//여벌 체육복 가져온 학생이 체육복 도난 당한 경우 다른 학생에게 체육복 빌려줄 수 없음
		for (int i = 0; i < reserve.length; i++) {
			for (int j = 0; j < lost.length; j++) {
				if(reserve[i]==lost[j]) {
					answer++;
					reserve[i]=-1;//중복 연산 방지
					lost[j]=-1;
					break;
				}
			}
		}
		
		//여벌 체육복을 가져온 학생이 체육복을 도난당한 학생에게 빌려줄 경우
		for (int i = 0; i < reserve.length; i++) {
			for (int j = 0; j < lost.length; j++) {
				if(reserve[i]-1==lost[j] || reserve[i]+1==lost[j]) {
					answer++;
					reserve[i]=-1;
					break;
				}
			}
		}
		
		return answer;
	}
}
