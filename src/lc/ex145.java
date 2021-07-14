package lc;

import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ex145 {
	public void main(String[] args) throws IOException {
			
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
	
    public List<Integer> preorderTraversal(TreeNode root) {
    	List<Integer> list=new LinkedList<>();
    	Deque<TreeNode> stack=new LinkedList<>();
    	stack.push(root);
//    	Stack<TreeNode> rights=new Stack<TreeNode>();
    	while(!stack.isEmpty()) {
    		TreeNode node=stack.pop();
    		if(node!=null) {
    			list.add(node.val);
    			stack.push(node.right);
    			stack.push(node.left);
    		}
    	}
        return list;
    }
}
