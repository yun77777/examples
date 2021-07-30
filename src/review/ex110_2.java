package review;

import lc.TreeNode;

public class ex110_2 {
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(2);
		root.left.left=new TreeNode(3);
		root.left.right=new TreeNode(3);
		root.left.right.left=null;
		root.left.right.right=null;
		root.left.left.left=new TreeNode(4);
		root.left.left.right=new TreeNode(4);
		System.err.println(isBalanced(root));
	}
    static boolean res=true;
    public static boolean isBalanced(TreeNode root) {
    	checkBalance(root);
    	return res;
    }
    private static int checkBalance(TreeNode root) {
    	if(root==null) return 0;
    	int left=checkBalance(root.left);
    	int right=checkBalance(root.right);
//    	System.err.println("ROOT:"+root.val);
        if(Math.abs(left-right)>1) res=false;
    	return 1+Math.max(left,right);
    }
}

//	1
// 2 2
//3 3
//44