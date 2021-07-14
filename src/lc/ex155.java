package lc;

import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ex155 {
	public void main(String[] args) throws IOException {
		 MinStack obj = new MinStack();
		 obj.push(val);
		 obj.pop();
		 int param_3 = obj.top();
		 int param_4 = obj.getMin();
	}
	/**
	 * Your MinStack object will be instantiated and called as such:
	 * MinStack obj = new MinStack();
	 * obj.push(val);
	 * obj.pop();
	 * int param_3 = obj.top();
	 * int param_4 = obj.getMin();
	 */
    /** initialize your data structure here. */
	class MinStack {
		private Node head;
	    /** initialize your data structure here. */
	    public MinStack() {
	        
	    }
	    
	    public void push(int val) {
	        if(head==null)
	        	head=new Node(val,val);
	        else
	        	head=new Node(val,Math.min(val, head.min),head);
	    }
	    
	    public void pop() {
	        head=head.next;
	    }
	    
	    public int top() {
	        return head.val;
	    }
	    
	    public int getMin() {
	        return head.min;
	    }
	    
	    private class Node{
	    	int val;
	    	int min;
	    	Node next;
	    	
	    	private Node(int val,int min) {
	    		this(val,min,null);
	    	}
	    	
	    	private Node(int val,int min,Node next) {
	    		this.val=val;
	    		this.min=min;
	    		this.next=next;
	    	}
	    }
	}
}
