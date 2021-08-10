package review.lc;

import lc.TreeNode;

public class ex104 {
    public int maxDepth(TreeNode root) {
    	if(root==null) return 0;
    	
    	return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
//    	return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
	}
}