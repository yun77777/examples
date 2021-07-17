package lc;

import java.util.ArrayDeque;
import java.util.Queue;

public class ex225 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s=sc.nextLine();
//		System.out.println(isValid(s));

	}
	
	class MyStack {
		Queue<Integer> mainQ;
		Queue<Integer> helperQ;

		public MyStack() {
		    mainQ = new ArrayDeque<>();
		    helperQ = new ArrayDeque<>();
		}

		public void push(int x) {
		    mainQ.add(x);
		}

		public int pop() {
		    if(mainQ.size() == 0){
		      System.out.println("Stack underflow");
		      return -1;
		  }else{
		      while(mainQ.size() > 1){
		          helperQ.add(mainQ.remove());
		      }
		      int val = mainQ.remove();
		      while(helperQ.size() > 0){
		          mainQ.add(helperQ.remove());
		      }
		      return val;
		  }
		}

		public int top() {
		    if(mainQ.size() == 0){
		      System.out.println("Stack underflow");
		      return -1;
		  }else{
		      while(mainQ.size() > 1){
		          helperQ.add(mainQ.remove());
		      }
		      int val = mainQ.remove();
		        helperQ.add(val);
		      while(helperQ.size() > 0){
		          mainQ.add(helperQ.remove());
		      }
		      return val;
		  }
		}
		public boolean empty() {
		    if(mainQ.size() == 0)
		        return true;
		    return false;
			}
		}
}

