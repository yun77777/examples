package review.lc;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import lc.TreeNode;

public class ex144 {
    public List<Integer> preorderTraversal(TreeNode root) {
    	List<Integer> res=new LinkedList<Integer>();
    	Deque<TreeNode> stack=new LinkedList<>();
    	TreeNode node=root;
    	while(node!=null||!stack.isEmpty()) {
    		if(node!=null) {
    			res.add(node.val);
    			stack.push(node.right);
    			node=node.left;
    		} else
    			node=stack.pop();
    	}
    	return res;
    }
//    public List<Integer> preorderTraversal(TreeNode root) {
//    	List<Integer> res=new LinkedList<Integer>();
//    	Deque<TreeNode> stack=new LinkedList<>();
//    	stack.push(root);
//    	while(!stack.isEmpty()) {
//    		TreeNode node=stack.pop();
//    		if(node!=null) {
//    			res.add(node.val);
//    			stack.push(node.right);
//    			stack.push(node.left);;
//    		}
//    	}
//    	return res;
//    }
}
