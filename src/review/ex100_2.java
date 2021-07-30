package review;

import lc.TreeNode;

public class ex100_2 {
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		TreeNode root2=new TreeNode(1);
		root2.left=new TreeNode(2);
		root2.right=new TreeNode(3);
		System.err.println(root.val);
		System.err.println(root2.val);
		System.err.println(isSameTree(root,root2));
	}
    public static boolean isSameTree(TreeNode p, TreeNode q) {
    	if(p==null&&q==null) return true;
    	if(p==null||q==null) return false;
    	if(p.val!=q.val)return false;
    	return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
