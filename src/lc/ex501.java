package lc;

public class ex501 {
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		System.err.println(findMode(root));
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	private static int currVal;
	private static int currCnt=0;
	private static int maxCnt=0;
	private static int modeCnt=0;
	
	private static int[] modes;
	
	public static int[] findMode(TreeNode root) {
		inorder(root);
		modes=new int[modeCnt];
		modeCnt=0;
		currCnt=0;
		inorder(root);
		return modes;
	}

	private static void handleValue(int val) {
		if(val!=currVal) {
			currVal=val;
			currCnt=0;
		}
		currCnt++;
		if(currCnt>maxCnt) {
			maxCnt=currCnt;
			modeCnt=1;
		} else if(currCnt==maxCnt) {
			if(modes!=null)
				modes[modeCnt]=currVal;
			modeCnt++;
		}
	}
	
	private static void inorder(TreeNode root) {
		if(root==null) return;
		inorder(root.left);
		handleValue(root.val);
		inorder(root.right);
	}
}

