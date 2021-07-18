package lc;

import java.util.LinkedList;
import java.util.Queue;

public class ex226 {
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
    	if(root==null) return root;
    	
    	Queue<TreeNode> q=new LinkedList<TreeNode>();
    	q.offer(root);
    	
    	while(!q.isEmpty()) {
    		int size=q.size();
    		for (int i = 0; i < size; i++) {
				TreeNode current=q.poll();
				swap(current);
				if(current.left!=null)
					q.offer(current.left);
				if(current.right!=null)
					q.offer(current.right);
			}
    	}
    	return root;
    }
    private void swap(TreeNode cur) {
    	TreeNode temp=cur.left;
    	cur.left=cur.right;
    	cur.right=temp;
    }
}
