package lc;

public class ex563 {
	int res=0;
    public int findTilt(TreeNode root) {
    	postOrder(root);
    	return res;
	}
   
    private int postOrder(TreeNode root) {
    	if(root==null) return 0;
    	int left=postOrder(root.left);
    	int right=postOrder(root.right);
    	res+=Math.abs(left-right);
    	return left+right+root.val;
    }
}
