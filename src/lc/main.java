package lc;

import java.util.LinkedList;
import java.util.Queue;

public class main {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(2);
		root.left=new TreeNode(2);
		root.right=new TreeNode(5);
		root.right.left=new TreeNode(5);
		root.right.right=new TreeNode(7);
		System.err.println(findSecondMinimumValue(root));
	}

	public static int findSecondMinimumValue(TreeNode root) {
		//Divide and Conquer
    	if(root==null) return -1;
    	if(root.left==null&&root.right==null) return -1;
    	
    	int left=root.left.val;
    	int right=root.right.val;
    	
    	if(root.left.val==root.val) {
    		left=findSecondMinimumValue(root.left);
    	}
    	if(root.right.val==root.val) {
    		right=findSecondMinimumValue(root.right);
    	}
    	
    	if(left!=-1&&right!=-1)
    		return Math.min(left,right);
    	else if(left!=-1)
    		return left;
    	else
    		return right;
	}
//	public static int findSecondMinimumValue(TreeNode root) {
//		//BFS
//		if(root==null) return -1;
//		Queue<TreeNode> q=new LinkedList<>();
//		q.offer(root);
//		Integer secondMin=null;
//		while(!q.isEmpty()) {
//			TreeNode curr=q.poll();
//			if(curr.right!=null)q.offer(curr.right);
//			if(curr.left!=null)q.offer(curr.left);
//			if(curr.val!=root.val) {
//				if(secondMin==null)secondMin=curr.val;
//				else secondMin=Math.min(secondMin, curr.val);
//			}
//		}
//		return secondMin==null?-1:secondMin;
//	}

}
