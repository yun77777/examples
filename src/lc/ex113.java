package lc;

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
//    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
//    	List<List<Integer>> res=new ArrayList<List<Integer>>();
//    	List<Integer> path=new ArrayList<Integer>();
//    	Stack<TreeNode> stack=new Stack<TreeNode>();
//    	int sum=0;
//    	TreeNode cur=root;
//    	TreeNode pre=null;
//    	while(cur!=null||!stack.isEmpty()) {
//    		while(cur!=null) {
//    			stack.push(cur);
//    			path.add(cur.val);
//    			sum+=cur.val;
//    			cur=cur.left;
//    		}
//    		cur=stack.peek();
//    		if(cur.right!=null&&cur.right!=pre) {
//    			cur=cur.right;
//    			continue;
//    		}
//    		pre=cur;
//    		stack.pop();
//    		path.remove(path.size()-1);
//    		sum-=cur.val;
//    		cur=null;
//    	}
//    	return res;
//	}
	
//	2.recursive
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    	List<List<Integer>> res=new ArrayList<List<Integer>>();
    	List<Integer> path=new ArrayList<Integer>();
    	dfs(root,targetSum,res,path);
    	return res;
    }
    
    public void dfs(TreeNode root, int sum, List<List<Integer>> res, List<Integer> path) {
    	if(root==null) return;
    	path.add(root.val);
    	if(root.left==null&&root.right==null) {
    		if(root.val==sum)
    			res.add(new ArrayList<Integer>(path));
    		return;
    	}
    	if(root.left!=null) {
    		dfs(root.left,sum-root.val,res,path);
    		path.remove(path.size()-1);
    	}
    	if(root.right!=null) {
    		dfs(root.right,sum-root.val,res,path);
    		path.remove(path.size()-1);
    	}
    }
}
