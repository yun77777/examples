package review;

import java.util.ArrayList;
import java.util.List;

public class ex22 {

	public static void main(String[] args) {
		System.err.println(generateParenthesis(3));
	}
    public static List<String> generateParenthesis(int n) {
    	List<String> res=new ArrayList<String>();
    	backtrack(res,"",0,0,n);
    	return res;
    }
    public static void backtrack(List<String> res, String str, int open, int close, int max) {
    	if(str.length()==max*2) {
    		res.add(str);
    		return;
    	}
    	
    	if(open<max)
    		backtrack(res, str+"(", open+1, close, max);
    	if(close<open)
    		backtrack(res, str+")", open, close+1, max);
    }
    
    
//    public static List<String> generateParenthesis(int n) {
//    	List<String> res=new ArrayList<String>();
//    	backtrack(res,"",0,0,n);
//    	return res;
//    }
//    public static void backtrack(List<String> res, String str, int open, int close, int max) {
//    	if(str.length()==max*2) {
//    		res.add(str);
//    		return;
//    	}
//    	
//    	if(open<max)
//    		backtrack(res, str+"(", open+1, close, max);
//    	if(close<open)
//    		backtrack(res, str+")", open, close+1, max);
//    }
}
