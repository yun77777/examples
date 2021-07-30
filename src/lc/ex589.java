package lc;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ex589 {
    public List<Integer> preorder(Node root) {
    	List<Integer> res=new ArrayList<Integer>();
    	preorder(res,root);
    	return res;
    }
    
    private void preorder(List<Integer> res,Node root) {
    	if(root==null) return;
    	Stack<Node> stack=new Stack<Node>();
    	stack.push(root);
    	while(!stack.isEmpty()) {
    		Node node=stack.pop();
    		res.add(node.val);
    		for(int i=node.children.size()-1;i>=0;i--) stack.push(node.children.get(i));
//			for(Node child:root.children) {
//				stack.push(child);
//			}
    	}
    }
    
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
