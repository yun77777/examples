package review.prgrmrs;

public class targetNumber_lv2 {

	public static void main(String[] args) {
		int[] numbers= {1, 1, 1, 1, 1};
		System.err.println(solution(numbers, 3));
	}

	public static int solution(int[] numbers, int target) {
		int cnt=count(numbers,target,1,numbers[0])+count(numbers,target,1,-numbers[0]);
		System.err.println(cnt);
		return cnt;
	}
	
	public static int count(int[] numbers, int target, int idx, int total) {
		if(idx==numbers.length) {
			if(total==target) {
				return 1;
			}
			return 0;
		}
		int cnt=0;
		cnt+=count(numbers, target, idx+1, total+numbers[idx]);
		cnt+=count(numbers, target, idx+1, total-numbers[idx]);
//		System.err.println("CNT:"+cnt);
		return cnt;
	}
}
