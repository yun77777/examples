package prgrmrs;

import java.util.Stack;

public class rightParentheses_lv2 {

	public static void main(String[] args) {
		System.err.println(solution("(())()"));
//		System.err.println(solution("(())()"));
	}

	public static boolean solution(String s) {
		if(s.length()%2!=0) return false;
		if(s.charAt(s.length()-1)=='(') return false;
		
		Stack<Character> stack=new Stack<>();
		int i=0;
		for (i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='(') stack.push('(');
			if(!stack.isEmpty() && stack.peek()=='(' && s.charAt(i)==')') stack.pop();
			System.err.println(stack);
		}
		return stack.isEmpty() &&  i>=s.length() ? true : false;
	}
}
