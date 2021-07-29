package review;

import java.util.ArrayList;
import java.util.List;

import lc.TreeNode;

public class ex501_2 {
	List<Integer> ans=new ArrayList<>();
	Integer pre;
	int curCnt,maxCnt;
    public int[] findMode(TreeNode root) {
    	traverse(root);
    	int[] res=new int[ans.size()];
    	for (int i = 0; i < res.length; i++) res[i]=ans.get(i);
    	return res;
	}
    void traverse(TreeNode root) {
    	if(root==null)return;
    	traverse(root.left);
    	if(pre!=null&&root.val==pre) curCnt++;
    	else curCnt=1;
    	if(curCnt==maxCnt)
    		ans.add(root.val);
    	else if(curCnt>maxCnt) {
    		maxCnt=curCnt;
    		ans=new ArrayList<>();
    		ans.add(root.val);
    	}
    	pre=root.val;
    	traverse(root.right);
    }
}
