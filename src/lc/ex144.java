package lc;

import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ex144 {
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
    			stack.push(node.left);
    			stack.push(node.right);
    			list.add(node.val);
    		}
    	}
        return list;
    }
}
