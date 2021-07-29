package lc;

public class ex530 {
    public int getMinimumDifference(TreeNode root) {
    	traverse(root);
    	return min;
	}
    int min=Integer.MAX_VALUE;
    Integer pre;
    void traverse(TreeNode root) {
    	if(root==null) return;
    	traverse(root.left);
    	if(pre!=null && min>Math.abs(pre-root.val)) {
    		min=Math.abs(pre-root.val);
    	}
    	pre=root.val;
    	traverse(root.right);
    }
}
