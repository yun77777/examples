package review;

import lc.TreeNode;

public class ex110 {
	boolean res=true;
    public boolean isBalanced(TreeNode root) {
    	maxDepth(root);
    	return res;
	}
   
   int maxDepth(TreeNode root) {
	   if(root==null) return 0;
	   int left=maxDepth(root.left);
	   int right=maxDepth(root.right);
	   if(Math.abs(left-right)>1) res=false;;
	   return 1+Math.max(left,right);
   }
}