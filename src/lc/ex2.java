package lc;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int T=sc.nextInt();
//		int[] nums=new int[T];
//		int[] result=new int[2];
//		int target=0;
//		for(int i=0;i<T;i++) {
//			nums[i]=sc.nextInt();
//		}
//		target=sc.nextInt();
//		result=twoSum(nums,target);
//		for(int i=0;i<T;i++) {
//			System.out.println(result[i]);
//		}
			
	}
	
	/**
	 * Definition for singly-linked list.
	 */
	public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode p, dummy=new ListNode(0);
    	p=dummy;
    	int carry=0;
    	while(l1!=null||l2!=null||carry!=0) {
    		if(l1!=null) {
    			carry+=l1.val;
    			l1=l1.next;
    		}
    		if(l2!=null) {
    			carry+=l2.val;
    			l2=l2.next;
    		}
    		p.next=new ListNode(carry%10);
    		carry/=10;
    		p=p.next;
    	}
    	
    	return dummy.next;
        
    }
    
    //2,4,3
    //5,6,4
    //7
    //0,10->0, carry=1
    //8
    //7,0,8
    
    
}
