package lc;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class main {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(2);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		TreeNode root2=new TreeNode(2);
		root.left=new TreeNode(3);
		root.right=new TreeNode(2);
		System.err.println(leafSimilar(root,root2));
	}

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    	List<Integer> res1=new ArrayList<>();
    	List<Integer> res2=new ArrayList<>();
    	res1=searchLeaves(root1);
    	res2=searchLeaves(root2);
    	if(res1.size()!=res2.size()) return false;
    	for (int i = 0; i < res1.size(); i++) {
			if(res1.get(i)!=res2.get(i)) return false;
		}
    	return true;

	}
    private List<Integer> searchLeaves(TreeNode root){
    	if(root==null) return null;
    	List<Integer> res=new ArrayList<>();
    	Stack<TreeNode> stack=new Stack<>();
    	stack.push(root);
    	while(!stack.isEmpty()) {
    		TreeNode node=stack.pop();
    		if(node.left!=null) stack.push(node.left);
    		if(node.right!=null) stack.push(node.right);
    		if(node.left==null&&node.right==null) {
    			res.add(node.val);
    		}
    	}
    	return res;
    }
}
