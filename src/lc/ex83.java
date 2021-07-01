package lc;

import java.util.Scanner;

public class ex83 {
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
	
   public static ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        head.next=deleteDuplicates(head.next);
        return head.val==head.next.val ? head.next : head;
    }
    
}
