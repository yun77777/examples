package lc;

import java.io.IOException;

public class ex203 {
	public static void main(String[] args) throws IOException {
	}
	public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

	public ListNode removeElements(ListNode head, int val) {
		ListNode tempHead=new ListNode(-1);
		tempHead.next=head;
		ListNode curr=head, prev=tempHead;
		
		while(curr!=null) {
			if(curr.val==val)
				prev.next=curr.next;
			else
				prev=prev.next;
			curr=curr.next;
		}
		
		return tempHead.next;
	}
//	public ListNode removeElements(ListNode head, int val) {
//		if(head==null) return null;
//		head.next=removeElements(head.next,val);
//		return head.val==val ? head.next : head;
//	}
}
