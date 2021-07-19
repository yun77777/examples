package lc;

public class ex234 {
	public void main(String[] args) {
		System.err.println("a");
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head=head.next;
		head.next=new ListNode(2);
		head=head.next;
		head.next=new ListNode(1);
		System.err.println(head.val);
	}
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	 public boolean isPalindrome(ListNode head) {
		 if(head==null) return false;
		 ListNode rev=reverse(head);
		 while(head!=null) {
			 if(head.val!=rev.val)
				 return false;
			 head=head.next;
			 rev=rev.next;
		 }
		 return true;
     }
	 
	 public ListNode reverse(ListNode head) {
		 ListNode prev=null;
		 while(head!=null) {
			 ListNode next=head.next;
			 head.next=prev;
			 prev=head;
			 head=next;
		 }
		 return prev;
	 }
	
}
