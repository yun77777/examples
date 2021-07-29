package review;

import lc.TreeNode;

public class ex530 {
	int minDiff=Integer.MAX_VALUE;
	TreeNode prev;
	
    public int getMinimumDifference(TreeNode root) {
    	inorder(root);
    	return minDiff;
	}
    private void inorder(TreeNode root) {
    	if(root==null) return;
    	inorder(root.left);
    	if(prev!=null) minDiff=Math.min(minDiff,root.val-prev.val);
    	prev=root;
    	inorder(root.right);
    }
}
