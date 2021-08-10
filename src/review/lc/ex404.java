package review.lc;

import java.util.Stack;

import lc.TreeNode;

public class ex404 {

	public static int sumOfLeftLeaves(TreeNode root) {
		if(root==null) return 0;
		int ans=0;
		if(root.left!=null) {
			if(root.left.left==null&&root.left.right==null) ans+=root.left.val;
			else ans+=sumOfLeftLeaves(root.left);
		}
		ans+=sumOfLeftLeaves(root.right);
		return ans;
	}
	
//	public static int sumOfLeftLeaves(TreeNode root) {
//		if(root==null) return 0;
//		Stack<TreeNode> stack=new Stack<TreeNode>();
//		stack.push(root);
//		int ans=0;
//		while(!stack.isEmpty()) {
//			TreeNode node=stack.pop();
//			if(node.left!=null) {
//				if(node.left.left==null&&node.left.left==null)
//					ans+=node.left.val;
//				else
//					stack.push(node.left);
//			}
//			if(node.right!=null) {
//				if(node.right.left!=null||node.right.right!=null)
//					stack.push(node.right);
//			}
//		}
//		return ans;
//	}
}
