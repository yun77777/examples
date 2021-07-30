package review;

import lc.TreeNode;

public class ex104_2 {
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(2);
		System.err.println(maxDepth(root));
	}
    public static int maxDepth(TreeNode root) {
    	if(root==null) return 0;
    	int left=maxDepth(root.left);
    	int right=maxDepth(root.right);
    	return 1+Math.max(left, right);
    }
}
