package review.prgrmrs;

import java.util.Stack;

public class deletePairs_lv2 {

	public static void main(String[] args) {
		System.err.println(solution("baabaa"));
	}
	public static int solution(String s) {
		Stack<Character> stack=new Stack<>();
		for(char c:s.toCharArray()) {
			if(stack.isEmpty()) stack.push(c);
			else {
				if(stack.peek()!=c) stack.push(c);
				else stack.pop();
			}
			
		}
		return stack.isEmpty() ? 1 : 0;
	}
}
