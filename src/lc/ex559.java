package lc;

import java.util.List;

public class ex559 {
    public int maxDepth(Node root) {
    	if(root==null) return 0;
    	int max=0;
    	for(Node child:root.children) {
    		int val=maxDepth(child);
    		if(val>max)
    			max=val;
    	}
    	return max+1;
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
