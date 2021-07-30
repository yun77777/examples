package lc;

public class ex606 {

	public String tree2str(TreeNode root) {
		StringBuilder sb=new StringBuilder();
		helper(sb,root);
		return sb.toString();
	}
	private void helper(StringBuilder sb,TreeNode root) {
		if(root==null)return;
		sb.append(root.val);
		if(root.left!=null||root.right!=null) {
			sb.append("(");
			helper(sb,root.left);
			sb.append(")");
			if(root.right!=null) {
				sb.append("(");
				helper(sb,root.right);
				sb.append(")");
			}
			
		}
	}
}
