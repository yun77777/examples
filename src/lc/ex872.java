package lc;

public class ex872 {
	Integer min=Integer.MAX_VALUE, pre=null;
    public int minDiffInBST(TreeNode root) {
    	if(root.left!=null) minDiffInBST(root.left);
    	if(pre!=null) min=Math.min(min, root.val-pre);
    	pre=root.val;
    	if(root.right!=null)minDiffInBST(root.right);
    	return min;
	}
}
