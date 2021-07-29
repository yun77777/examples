package review;

import java.util.ArrayList;
import java.util.List;

import lc.TreeNode;

public class ex501 {
	List<Integer> ans=new ArrayList<>();
	Integer pre;
	int maxCnt=0, currCnt=0;
	
    public int[] findMode(TreeNode root) {
    	traverse(root);
    	int[] res=new int[ans.size()];
    	for (int i = 0; i < res.length; i++) res[i]=ans.get(i);
    	return res;
	}
    private void traverse(TreeNode root) {
    	if(root==null) return;
    	traverse(root.left);
    	if(pre!=null&&root.val==pre) currCnt++;
    	else currCnt=1;
    	if(currCnt==maxCnt) {
    		ans.add(root.val);
    	} else if(currCnt>maxCnt) {
    		maxCnt=currCnt;
    		ans=new ArrayList<>();
    		ans.add(root.val);
    	}
    	pre=root.val;
    	traverse(root.right);
    }
}

//public class ex501 {
//	public int[] findMode(TreeNode root) {
//		inorder(root);
//		modes=new int[modeCnt];
//		modeCnt=0;
//		currCnt=0;
//		inorder(root);
//		return modes;
//	}
//	private int currVal;
//	private int currCnt=0;
//	private int maxCnt=0;
//	private int modeCnt=0;
//	private int[] modes;
//	
//	private void handleValue(int val) {
//		if(val!=currVal) {
//			currVal=val;
//			currCnt=0;
//		}
//		currCnt++;
//		if(currCnt>maxCnt){
//			maxCnt=currCnt;
//			modeCnt=1;
//		} else if(currCnt==maxCnt) {
//			if(modes!=null)
//				modes[modeCnt]=currVal;
//			modeCnt++;
//		}
//	}
//	
//	private void inorder(TreeNode root) {
//		if(root==null) return;
//		inorder(root.left);
//		handleValue(root.val);
//		inorder(root.right);
//	}
//}