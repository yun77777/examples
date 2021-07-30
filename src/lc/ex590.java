package lc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ex590 {
    public List<Integer> postorder(Node root) {
    	List<Integer> res=new ArrayList<>();
        if(root==null) return res;
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node node=stack.pop();
            res.add(node.val);
            for(Node child:node.children)
                stack.push(child);
        }
        Collections.reverse(res);
        return res;
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
