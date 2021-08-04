package prgrmrs;

import java.util.stream.IntStream;

public class dfs_bfs_ex1 {

	public static void main(String[] args) {
		int[] numbers= {1,1,1,1,1};
		System.err.println(solution(numbers, 3));
	}
	
	public static int solution(int[] numbers, int target) {
		if(numbers.length<2||numbers.length>20) return 0;
		if(target<1||target>1000) return 0;
		
        int answer = 0;//count
        answer=countWays(numbers, 1, target,numbers[0])+countWays(numbers, 1, target,-numbers[0]);
        System.err.println("CNT:"+countWays(numbers, 1, target,numbers[0]));
        System.err.println("CNT:"+countWays(numbers, 1, target,numbers[0]));
//        System.err.println(countWays(numbers, 0, target, 0, 0));
        return answer;
    }
	public static int cnt=0;
	public static int total=0;
	public static int countWays(int[] numbers,int idx,int target,int total) {
		if(idx==numbers.length) {
			
		if(total==target) {
		System.err.println("TARGET:"+target);return 1;
		}
		else return 0;
		}
//		if(target==IntStream.of(numbers).sum()) cnt++;
		int res=0;
		res+=countWays(numbers, idx+1, target,total+numbers[idx]);
		res+=countWays(numbers, idx+1, target,total-numbers[idx]);
//		int plus=countWays(numbers, idx+1, target-numbers[idx],"+");
//		int minus=countWays(numbers, idx+1, target+numbers[idx],"-");
		return res;
	}
}
