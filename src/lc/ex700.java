package lc;

import java.util.Stack;

public class ex700 {
	public static void main(String[] args) {
		TreeNode root=new TreeNode(4);
		root.left=new TreeNode(2);
		root.right=new TreeNode(7);
		root.left.left=new TreeNode(1);
		root.left.right=new TreeNode(3);
		System.err.println(searchBST(root,2));
		System.err.println(root.val);
	}
    public static TreeNode searchBST(TreeNode root, int val) {
    	//DFS
    	if(root==null)return null;
    	Stack<TreeNode> stack=new Stack<>();
    	stack.push(root);
    	while(!stack.isEmpty()) {
    		TreeNode node=stack.pop();
    		if(node.right!=null)stack.push(node.right);
    		if(node.left!=null)stack.push(node.left);
    		if(node.val==val) {
//    			root=node;
    			return node;
//    			System.err.println(node.val+" FOUNDED");
//    			System.err.println(node.left.val+" left");
//    			System.err.println(node.right.val+" right");
    		}
    		
    	}
    	return null;
	}
}
