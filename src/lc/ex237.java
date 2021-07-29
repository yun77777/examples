package lc;

public class ex237 {
	static int[] nums;

	public static void main(String[] args) {
		ListNode node=new ListNode(5);
		node.next=new ListNode(1);
		deleteNode(node);
	}
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
		}
	}
	 
    public static void deleteNode(ListNode node) {
    	node.val=node.next.val;
    	node.next=node.next.next;
    }
    
}
