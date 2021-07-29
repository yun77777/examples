package review;

import java.util.ArrayList;
import java.util.Stack;

public class ex226 {
	public void main(String[] args) {
			
	}
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	
	//DFS
//    public TreeNode invertTree(TreeNode root) {
//    	if(root==null) return null;
//    	TreeNode left=root.left, right=root.right;
//    	//final TreeNode left=root.left, right=root.right;
//    	root.left=invertTree(right);
//    	root.right=invertTree(left);
//    	return root;
//    }
//    
    //using stack
    public TreeNode invertTree(TreeNode root) {
    	if(root==null) return null;
    	Stack<TreeNode> stack=new Stack<>();
//    	final Deque(TreeNode) stack=new LinkedList<>();
    	stack.push(root);
    	while(!stack.isEmpty()) {
    		TreeNode node=stack.pop();
    		TreeNode left=node.left;
    		node.left=node.right;
    		node.right=left;
    		if(node.left!=null)
    			stack.push(node.left);
    		if(node.right!=null)
    			stack.push(node.right);
    	}
    	return root;
    }
}
