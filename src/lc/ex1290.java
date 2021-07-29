package lc;

public class ex1290 {
	static int[] nums;

	public static void main(String[] args) {
	}
	public int staticgetDecimalValue(ListNode head) {
		int res=0;
		while(head!=null) {
			res=(res<<1)|head.val;
			head=head.next;
		}
		return res;
	}
	
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

		
	}
}