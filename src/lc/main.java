package lc;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class main {

	public static void main(String[] args) {
//		TreeNode root = new TreeNode(2);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(3);
//		TreeNode root2 = new TreeNode(2);
//		root.left = new TreeNode(3);
//		root.right = new TreeNode(2);
//		System.err.println(leafSimilar(root, root2));
	}

	public int rangeSumBST(TreeNode root, int low, int high) {
		if (root == null)
			return 0;
		if (root.val >= low)
			rangeSumBST(root.left, low, high);
		if (root.val <= high)
			rangeSumBST(root.right, low, high);
		return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
	}
}
