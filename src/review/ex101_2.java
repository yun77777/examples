package review;

import lc.TreeNode;

public class ex101_2 {
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(2);
		System.err.println(root.val);
		System.err.println(isSymmetric(root));
	}
    public static boolean isSymmetric(TreeNode root) {
    	return root==null ||isSymmetricHelp(root.left,root.right);
    }
    private static boolean isSymmetricHelp(TreeNode left, TreeNode right) {
    	if(left==null||right==null) return left==right;
    	if(left.val!=right.val) return false;
    	return isSymmetricHelp(left.left, right.right)&&isSymmetricHelp(left.right, right.left);
    }
}
