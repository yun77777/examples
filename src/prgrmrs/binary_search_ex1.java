package prgrmrs;

import java.util.Stack;

public class binary_search_ex1 {

	public static void main(String[] args) {
		int[] times= {7,10};
		System.err.println(solution(6, times));
	}
	
	public static long solution(int n, int[] times) {
        long answer = 0;
        Stack<Integer> stack=new Stack<>();
        for(int j=0;j<n;j++) {
	        for (int i = times.length-1; i >= 0; i--) {
				stack.push(times[i]);
			}
        }
        while(!stack.isEmpty()) {
        	//7 10
        	//7(1) 14 21
        	//10 20
        	
        	int num=stack.pop();
        	System.err.println("NUM:"+num);
        	answer+=num;
        }
        
        return answer;
    }
}
