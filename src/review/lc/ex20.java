package review.lc;

import java.util.Stack;

public class ex20 {
	public static void main(String[] args) {
		System.err.println(isValid("(([))"));
	}
    public static boolean isValid(String s) {
    	if(s.length()==0) return false;
    	Stack<Character> stack=new Stack<Character>();
    	for(char c:s.toCharArray()) {
    		if(c=='(') stack.push(')');
    		else if(c=='{') stack.push('}');
    		else if(c=='[') stack.push(']');
    		else if(stack.isEmpty()||stack.pop()!=c)
    			return false;
    	}
    	return stack.isEmpty();
    }
}
