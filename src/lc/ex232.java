package lc;

import java.util.Stack;

public class ex232 {
	public void main(String[] args) {
		/**
		 * Your MyQueue object will be instantiated and called as such:
		 */
		MyQueue obj = new MyQueue();
		 obj.push(1);
		 int param_2 = obj.pop();
		 int param_3 = obj.peek();
		 boolean param_4 = obj.empty();
	}

	class MyQueue {

	    /** Initialize your data structure here. */
		Stack<Integer> stack1;
		Stack<Integer> stack2;
		
	    public MyQueue() {
	        stack1=new Stack<>();
	        stack2=new Stack<>();
	    }
	    
	    /** Push element x to the back of queue. */
	    public void push(int x) {
	        stack1.push(x);
	    }
	    
	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	        while(!stack1.empty()) {
	        	stack2.push(stack1.pop());
	        }
	        int top=stack2.pop();
	        while(!stack1.empty()) {
	        	stack1.push(stack2.pop());
	        }
	        return top;
	    }
	    
	    /** Get the front element. */
	    public int peek() {
	        while(!stack1.empty()) {
	        	stack2.push(stack1.pop());
	        }
	        int top=stack2.peek();
	        while(!stack2.empty()) {
	        	stack1.push(stack2.pop());
	        }
	        return top;
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        return stack1.empty();
	    }
	}

	
}
