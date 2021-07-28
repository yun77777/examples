package binarySearchTree;

public class BST {
	private Node root;
	
	public BST() {}
	public boolean isEmpty() {
		if(root==null) return true;
		return false;
	}
	
	public void insert(int data) {
		root=insertBST(root,data);
	}
	private Node insertBST(Node temp, int data) {
		if(temp==null) {
			temp=new Node(data);
		} else if(data<temp.data) {
			temp.left=insertBST(temp.left,data);
		} else if(data>temp.data) {
			temp.right=insertBST(temp.right,data);
		}
		return temp;
	}
	
	public void delet(int data) {}
	private Node deleteBST(Node temp, int data) {
		Node p;
		
		if(temp.data>data) {
			temp.left=deleteBST(temp.right,data);
		} else if(temp.data<data) {
			temp.right=deleteBST(temp.right,data);
		} else if(temp.left==null&&temp.right==null) {
			temp=null;
		} else if(temp.right==null) {
			p=temp;
			temp=temp.left;
			p=null;
		} else if(temp.left==null) {
			p=temp;
			temp=temp.right;
			p=null;
		} else {
			boolean flag;
			if(getHeight(temp.left)>getHeight(temp.right)) {
				p=findMaxNode(temp.left);
				flag=true;
			} else if(getHeight(temp.left)<getHeight(temp.right)) {
				p=findMinNode(temp.right);
				flag=false;
			} else {
				if(getNumOfNode(temp.left)>=getNumOfNode(temp.right)) {
					p=findMaxNode(temp.left);
					flag=true;
				} else {
					p=findMinNode(temp.right);
					flag=false;
				}
			}
			temp.data=p.data;
			if(flag) {
				temp.left=deleteBST(temp.left,p.data);
			} else {
				temp.right=deleteBST(temp.right,p.data);
			}
		}
		
		return temp;
	}
	
	private int getHeight(Node temp) {
		if(temp==null) return -1;
		int leftSubTreeHeight=getHeight(temp.left)+1;
		int rightSubTreeHeight=getHeight(temp.right)+1;
		return leftSubTreeHeight>rightSubTreeHeight?leftSubTreeHeight:rightSubTreeHeight;
	}
	private int getNumOfNode(Node temp) {
		if(temp==null) return -1;
		int leftSubTreeHeight=getHeight(temp.left)+1;
		int rightSubTreeHeight=getHeight(temp.right)+1;
		return leftSubTreeHeight+rightSubTreeHeight+1;
	}
	private Node findMaxNode(Node temp) {
		if(temp.right==null) return temp;
		else return findMaxNode(temp.right);
	}
	private Node findMinNode(Node temp) {
		if(temp.left==null) return temp;
		else return findMinNode(temp.left);
	}
	
	public void print() {
		if(this.isEmpty()) {
			System.out.println("empty tree");
		} else {
			inorder(this.root);
			System.out.println();
		}
	}
	private void inorder(Node temp) {
		if(temp!=null) {
			inorder(temp.left);
			System.out.println(temp.data+" ");
			inorder(temp.right);
		}
	}
	
}
