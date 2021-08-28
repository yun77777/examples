package review.prgrmrs;

public class dfs_bfs_ex1 {

	public static void main(String[] args) {
		System.err.println(solution(new int[] {1,1,1,1,1}, 3));
	}
	
	public static int solution(int[] numbers, int target) {
		int total=0;
		total=dfs(numbers, numbers[0], target, 1)+dfs(numbers, -numbers[0], target, 1);// idx 다음 인덱스
		return total;
	}
	
	public static int dfs(int[] numbers, int number, int target, int idx) {
		if(idx==numbers.length) {
			if(number==target) {
				return 1;
			}else return 0;
		}
		
		int total=0;
		total+=dfs(numbers, number+numbers[idx], target, idx+1);
		total+=dfs(numbers, number-numbers[idx], target, idx+1);
		return total;
	}
}
