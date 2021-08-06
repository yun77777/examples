package prgrmrs;

import java.util.Stack;

//짝지어 제거하기
public class ex1_lv2 {

	public static void main(String[] args) {
		System.err.println(solution("baabaa"));
	}
	//스택 이용
	public static int solution(String s)
    {
		Stack<Character> stack=new Stack<>();
		for(char c:s.toCharArray()) {
			if(stack.isEmpty()) stack.push(c);
			else {
				System.err.println("c:"+c);
				char ch=stack.peek();
				if(c==ch) stack.pop();
				else stack.push(c);
			}
			System.err.println("STACK"+stack);
		}
		return stack.size()==0? 1 : 0;
    }
	
//	//스택 이용
//	public static int solution(String s)
//	{
//		Stack<String> stack=new Stack<>();
//		for(int i=0;i<s.length();i++) {
//			if(stack.isEmpty()) stack.push(String.valueOf(s.charAt(i)));
//			else {
//				String lastVal=stack.peek();
//				String currVal=String.valueOf(s.charAt(i));
//				if(!lastVal.equals(currVal)) stack.push(currVal);
//				else stack.pop();
//			}
//		}
//		return stack.size()==0?1:0;
//	}
	
	
//	public static int solution(String s)
//	{
//		int answer = -1;
//		List<Character> list=new ArrayList<Character>();
//		for(char c:s.toCharArray()) list.add(c);
//		deletePair(list);
//		if(list.size()==0) answer=1;
//		else answer=0;
//		return answer;
//	}
//	//효율성 문제 발생
//	public static void deletePair(List<Character> list) {
//		if(list.size()==0) return;
//		boolean flag=false;
//		System.err.println("LIST before:"+list);
//		System.err.println(list.get(0));
//		for (int i = 0; i < list.size()-1; i++) {
//			if(list.get(i)==list.get(i+1)){
//				System.err.println(list.get(i)+" is SAME as "+list.get(i+1));
//				list.remove(i);
//				list.remove(i);
//				System.err.println("after removing:"+list);
////				deletePair(list);
//				flag=true;
//				break;
//			}
//		}
//		if(!flag) return;
//		deletePair(list);
//		System.err.println("LIST after:"+list);
//	}
//	
}
