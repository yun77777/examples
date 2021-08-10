package review.lc;

import java.util.ArrayList;
import java.util.Stack;

public class ex226_2 {
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
	
    public TreeNode invertTree(TreeNode root) {
    	if(root==null) return null;
    	Stack<TreeNode> stack=new Stack<>();
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
