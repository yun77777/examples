package review.lc;

import java.util.LinkedList;
import java.util.Queue;

import lc.TreeNode;

public class ex993 {
	public boolean isCousins(TreeNode root, int x, int y) {
    	//BFS
		boolean isXexist=false,isYexist=false;
		int xDepth=0,yDepth=0;
         if(root==null) return true;
         Queue<TreeNode> queue=new LinkedList<>();
         queue.offer(root);
         while(!queue.isEmpty()){
             int size=queue.size();
             
             for(int i=0;i<size;i++) {
            	 TreeNode node=queue.poll();
            	 if(node.left!=null&&node.right!=null) {
            		 if(node.left.val==x&&node.right.val==y) return false;
            		 if(node.left.val==y&&node.right.val==x) return false;
            	 }
            	 if(node.val==x) isXexist=true;
            	 if(node.val==y) isYexist=true;
            	 
            	 if(node.left!=null) queue.offer(node.left);
                 if(node.right!=null) queue.offer(node.right);
             }
             
             if(isXexist&&isYexist) return true;

         }
         return false;
	}
}
