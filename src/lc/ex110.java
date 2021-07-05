package lc;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ex110 {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int T=sc.nextInt();
//		int[] nums=new int[T];
//		int[] result=new int[2];
//		int target=0;
//		for(int i=0;i<T;i++) {
//			nums[i]=sc.nextInt();
//		}
//		target=sc.nextInt();
//		result=twoSum(nums,target);
//		for(int i=0;i<T;i++) {
//			System.out.println(result[i]);
//		}
			
	}
	/**
	 * Definition for a binary tree node.
	 */
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
	public boolean isBalanced(TreeNode root) {
	    if(root==null){
	        return true;
	    }
	    return height(root)!=-1;
	    
	}
	public int height(TreeNode node){
	    if(node==null){
	        return 0;
	    }
	    int lH=height(node.left);
	    if(lH==-1){
	        return -1;
	    }
	    int rH=height(node.right);
	    if(rH==-1){
	        return -1;
	    }
	    if(lH-rH<-1 || lH-rH>1){
	        return -1;
	    }
	    return Math.max(lH,rH)+1;
	}
}
