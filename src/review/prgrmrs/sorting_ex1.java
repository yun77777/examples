package review.prgrmrs;

import java.util.Arrays;

public class sorting_ex1 {

	public static void main(String[] args) {
		System.err.println(solution(new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][] {{2,5,3},{4,4,1},{1,7,3}}));
	}
	//배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
			answer[i]=findKthNumber(array, commands[i]);
		}
        return answer;
    }
	
	public static int findKthNumber(int[] array, int[] command) {
		int[] arr=new int[command[1]-command[0]+1];
		for(int i=command[0]; i<=command[1]; i++) {
			arr[i-1]=array[i-1];
			System.err.println(array[i-1]);
		}
		Arrays.sort(arr);
		return arr[command[2]-1];
	}
}
