package lc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ex653 {

    public boolean findTarget(TreeNode root, int k) {
    	List<Integer> nums=new ArrayList<Integer>();
    	inorder(root,nums);
    	for(int i=0,j=nums.size();i<j;) {
    		if(nums.get(i)+nums.get(j)==k)return true;
    		if(nums.get(i)+nums.get(j)<k)i++;
    		else j--;
    	}
	}
    public void inorder(TreeNode root, List<Integer> nums) {
    	if(root==null) return;
    	inorder(root.left,nums);
    	nums.add(root.val);
    	inorder(root.right,nums);
    }
//    public boolean findTarget(TreeNode root, int k) {
//    	//DFS
//    	HashSet<Integer> set=new HashSet<>();
//    	return dfs(root,set,k);
//    }
//    public boolean dfs(TreeNode root, HashSet<Integer> set, int k) {
//    	if(root==null)return false;
//    	if(set.contains(k-root.val))return true;
//    	set.add(root.val);
//    	return dfs(root.left,set,k)||dfs(root.right,set,k);
//    }
}
