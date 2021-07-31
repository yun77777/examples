package lc;

public class ex1022 {
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(0);
		root.left.left=new TreeNode(0);
		root.left.right=new TreeNode(1);
		root.right=new TreeNode(1);
		root.right.left=new TreeNode(0);
		root.right.right=new TreeNode(1);
		System.err.println(sumRootToLeaf(root));
	}
    public static int sumRootToLeaf(TreeNode root) {
    	int sum=0;
    	return dfs(root,sum);
	}
    private static int dfs(TreeNode root,int sum) {
    	if(root==null) return 0;
    	if(root.left==null&&root.right==null)
    	sum=sum*2+root.val;
    	System.err.println("VAL:"+root.val);
    	System.err.println("sum:"+sum);
    	System.err.println("====================");
    	return root.left==null&&root.right==null?sum:0+dfs(root.left,sum)+dfs(root.right,sum);
    }
}
