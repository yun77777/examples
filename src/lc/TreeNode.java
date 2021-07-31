package lc;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
//	public TreeNode root;

	TreeNode() {
	}

	public TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
//	void makeTree(int[] arr) {
//		root=makeTreeR(arr, 0, arr.length - 1);
//	}
//	static TreeNode makeTreeR(int[] arr, int start, int end) {
//		if (start > end)
//			return null;
//		int mid = (start + end) / 2;
//		TreeNode current = new TreeNode(arr[mid]);
//		current.left = makeTreeR(arr, start, mid - 1);
//		current.right = makeTreeR(arr, mid + 1, end);
//		return current;
//	}
}
