package lc;


public class ex21 {
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

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//		if(l1==null) return l2;
//		if(l2==null) return l1;
//		if(l1.val<l2.val) {
//			l1.next=mergeTwoLists(l1.next,l2);
//			return l1;
//		} else {
//			l2.next=mergeTwoLists(l1,l2.next);
//			return l2;
//		}
		
		if(l1==null) return l2;
		else if(l2==null) return l1;
		ListNode dummy=new ListNode(0);
		ListNode curr=dummy;
		while(l1!=null && l2!=null) {
			if(l1.val<l2.val) {
				curr.next=l1;
				l1=l1.next;
			} else {
				curr.next=l2;
				l2=l2.next;
			}
			curr=curr.next;
		}
		curr.next= l1==null? l2:l1;
		return dummy.next;
	}
}

