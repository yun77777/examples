package review.lc;

import java.util.ArrayList;
import java.util.List;

import lc.TreeNode;

public class ex501_3 {
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=null;
		root.right=new TreeNode(2);
		root.left=new TreeNode(2);
		System.err.println(findMode(root));
	}
    public static int[] findMode(TreeNode root) {
    	traverse(root);
    	int[] ans=new int[res.size()];
    	for (int i = 0; i < ans.length; i++) {
			ans[i]=res.get(i);
			System.err.println(ans[i]);
		}
    	return ans;
    }
    static int frequency=0;
	static int cur=0;
    static Integer pre;
    static List<Integer> res=new ArrayList<Integer>();
    
    static void traverse(TreeNode root) {
    	if(root==null)return;
    	traverse(root.left);
    	if(pre!=null&&pre==root.val)
    		cur++;
    	else
    		cur=1;
    	if(frequency<cur) {
    		frequency=cur;
    		res=new ArrayList<Integer>();
    		res.add(root.val);
    	}else if(frequency==cur)
    		res.add(root.val);
    	pre=root.val;
    	traverse(root.right);
    }
}
