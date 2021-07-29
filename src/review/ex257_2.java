package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ex257_2 {
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
	
    public List<String> binaryTreePaths(TreeNode root) {
    	List<String> res=new ArrayList<String>();
    	if(root!=null) searchBT(root,"",res);
    	return res;
    }
    private void searchBT(TreeNode root,String path, List<String> res) {
    	if(root.left==null&&root.right==null) res.add(path+root.val);
    	if(root.left!=null) searchBT(root.left,path+root.val+"->",res);
    	if(root.right!=null) searchBT(root.right,path+root.val+"->",res);
    }
}
