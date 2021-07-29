package review;

import java.util.Stack;

import lc.TreeNode;

public class ex101 {
//    public boolean isSymmetric(TreeNode root) {
//    	if(root==null) return true;
//    	return isMirror(root.left,root.right);
//	}
//    public boolean isMirror(TreeNode p, TreeNode q) {
//    	if(p==null&&q==null) return true;
//    	if(p==null||q==null) return false;
//    	return (p.val==q.val)&&isMirror(p.left,q.right)&&isMirror(p.right,q.left); 
//    }
    
    public boolean isSymmetric(TreeNode root) {
    	if(root==null) return true;
    	Stack<TreeNode> stack=new Stack<TreeNode>();
    	stack.push(root.left);
    	stack.push(root.right);
    	while(!stack.empty()) {
    		TreeNode n1=stack.pop(), n2=stack.pop();
    		if(n1==null&&n2==null) continue;
    		if(n1==null||n2==null||n1.val!=n2.val) return false;
    		stack.push(n1.left);
    		stack.push(n2.right);
    		stack.push(n1.right);
    		stack.push(n2.left);
    	}
    	return true;
    }
    
//    public boolean isSymmetric(TreeNode root) {
//    	return root==null || isSymmetricHelp(root.left,root.right);
//    }
//    private boolean isSymmetricHelp(TreeNode left, TreeNode right) {
//    	if(left==null||right==null) return left==right;
//    	if(left.val!=right.val) return false;
//    	return isSymmetricHelp(left.left,right.right)&&isSymmetricHelp(left.right,right.left);
//    }
}