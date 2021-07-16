package lc;


public class ex206 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s=sc.nextLine();
//		System.out.println(isValid(s));

	}
	
	public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

	public static ListNode reverseList(ListNode head) {
		if(head==null) return null;
		ListNode prev=null;
		ListNode curr=head;
		while(curr!=null) {
			ListNode temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		
		return prev;
	}
}

