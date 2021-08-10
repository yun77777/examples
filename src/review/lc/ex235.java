package review.lc;

import lc.TreeNode;

public class ex235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	if(root.val>Math.max(p.val,q.val))
    		return lowestCommonAncestor(root.left,p,q);
    	else if(root.val<Math.min(p.val, q.val))
    		return lowestCommonAncestor(root.right, p, q);
    	else
    		return root;
	}
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//    	while((root.val-p.val)*(root.val-q.val)>0)
//    		root=p.val<root.val?root.left:root.right;
//    	return root;
//    }
}