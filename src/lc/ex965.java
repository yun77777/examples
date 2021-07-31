package lc;

public class ex965 {
    TreeNode pre;
    public boolean isUnivalTree(TreeNode root) {
    	if(root==null) return true;
    	if(pre==null) pre=root;
    	//DFS
    	// if(pre.val!=root.val) return false;
    	return pre.val==root.val&&isUnivalTree(root.left)&&isUnivalTree(root.right);
	}
}
