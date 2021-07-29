package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ex113 {
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
//	1. iterative
	
//	2.recursive
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    	List<List<Integer>> res=new ArrayList<List<Integer>>();
    	List<Integer> path=new ArrayList<Integer>();
    	dfs(root,targetSum,res,path);
    	return res;
    }
    public void dfs(TreeNode root, int targetSum, List<List<Integer>> res, List<Integer> path) {
    	if(root==null) return;
    	path.add(root.val);
    	if(root.left==null && root.right==null) {
    		if(root.val==targetSum)
    			res.add(new ArrayList<Integer>(path));
//    		return;
    	}
    	if(root.left!=null) {
    		dfs(root.left,targetSum-root.val,res,path);
    		path.remove(path.size()-1);
    	}
    	if(root.right!=null) {
    		dfs(root.right,targetSum-root.val,res,path);
    		path.remove(path.size()-1);
    	}
    }
}
