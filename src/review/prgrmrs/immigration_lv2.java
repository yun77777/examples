package review.prgrmrs;

import java.util.Arrays;

public class immigration_lv2 {

	public static void main(String[] args) {
		int[] times= {7,10};
		System.err.println(solution(6, times));
	}

	public static long solution(int n, int[] times) {
		Arrays.sort(times);
		long left=0;
		long right=(long)n*times[times.length-1];
		long mid=0;//최장 소요 시간
		long answer=0;
		while(left<=right) {
			//소요시간/심사시간=대기자수
			mid=(left+right)/2;
			int sum=0;//대기자수
			for (int i = 0; i < times.length; i++) {
				sum+=mid/times[i];
			}
			System.err.println(sum);
			if(sum<n) left=mid+1;
			else {
				right=mid-1;
				answer=mid;
			}
//			else return mid;
		}
		
		return answer;
	}
}
