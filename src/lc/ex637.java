package lc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ex637 {

    public List<Double> averageOfLevels(TreeNode root) {
    	//BFS
    	List<Double> res=new ArrayList<>();
    	Queue<TreeNode> q=new LinkedList<>();
    	q.add(root);
    	while(!q.isEmpty()) {
    		int n=q.size();
    		double sum=0.0;
    		for(int i=0; i<n; i++) {
    			TreeNode node=q.poll();
    			if(node.left!=null)q.offer(node.left);
    			if(node.right!=null)q.offer(node.right);
    			sum+=node.val;
    		}
    		res.add(sum/n);
    	}
    	return res;
	}
}
