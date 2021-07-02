package lc;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ex94 {
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
	
	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list=new ArrayList<Integer>();
		Stack<TreeNode> stack=new Stack<TreeNode>();
		TreeNode cur=root;
		while(cur!=null||!stack.empty()) {
			while(cur!=null) {
				stack.add(cur);
				cur=cur.left;
			}
			cur=stack.pop();
			list.add(cur.val);
			cur=cur.right;
		}
		return list;
	}
}
