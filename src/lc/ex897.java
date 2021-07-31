package lc;

public class ex897 {
	TreeNode res,pre;
    public TreeNode increasingBST(TreeNode root) {
    	inorder(root);
    	return res;
	}
    private void inorder(TreeNode root) {
    	if(root==null) return;
    	inorder(root.left);
    	if(res==null)res=root;
    	else pre.right=root;
    	pre=root;
    	root.left=null;
    	inorder(root.right);
    }
}
