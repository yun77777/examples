package review.prgrmrs;

import java.util.Stack;

public class greedy_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println(solution(new int[] {70, 50, 80, 50}, 100));
	}
	public static int solution(int[] people, int limit) {
        int answer = 0;
        Stack<Integer> stack=new Stack<>();
        stack.push(people[0]);
        limit-=stack.peek();
        int idx=1;
        while(!stack.isEmpty()||idx<people.length) {
        	System.err.println(stack);
        	if(limit>people[idx]) {
        		stack.push(people[idx]);
        		limit-=people[idx];
        	} else {
        		for(int i=0;i<stack.size();i++)
        			limit+=stack.pop();
        	}
        	
        	idx++;
        }
        return answer;
    }
}
