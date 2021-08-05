package prgrmrs;

import java.util.Arrays;

public class binary_search_ex1 {

	public static void main(String[] args) {
		int[] times= {7,10};
		System.err.println(solution(6, times));
	}
	
	public static long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long left=1;
        long right=(long)n*times[times.length-1];
        while(left<=right){
            long mid=(left+right)/2;
            long sum=0;
            for(int i=0;i<times.length;i++) sum+=mid/times[i];
            if(sum<n) left=mid+1;
            else{
                right=mid-1;
                answer=mid;
            }
        }
        return answer;
    }
	
//	public static long solution(int n, int[] times) {
//		long answer = 0;
//		Arrays.sort(times);
//		long left=1;
//		long right=(long)n*times[times.length-1];
//		while(left<=right) {
//			long mid=(left+right)/2;
//			long sum=0;
//			for(int i=0;i<times.length;i++) sum+=mid/times[i];
//			if(sum<n) left=mid+1;
//			else {
//				right=mid-1;
//				answer=mid;
//			}
//		}
//		return answer;
//	}
	
//	public static long solution(int n, int[] times) {
//		long answer = 0;
//		
//		Arrays.sort(times);
//		long left=0;//1분 이상 1,000,000,000분 이하 시간 범위
//		long right=(long)n*times[times.length-1];//최악의 경우 최대 소요 시간
//		while(left<=right) {//이분 탐색
//			long mid=(left+right)/2;
//			long sum=0;//심사관 수
//			for(int i=0;i<times.length;i++) sum+=mid/times[i];//심사관 수=mid/소요시간
//			if(sum<n) left=mid+1;
//			else {
//				right=mid-1;
//				answer=mid;
//			}
//		}
//		
//		return answer;
//	}
	
}
