package lc;

import java.util.ArrayList;
import java.util.List;

public class ex412 {
	static int[] nums;

	public static void main(String[] args) {
    	List<String> res=fizzBuzz(3);
		System.err.println(res);
	}
    public static List<String> fizzBuzz(int n) {
    	List<String> res=new ArrayList<String>();
    	for (int i = 1; i <= n; i++) {
    		if(i%3==0 && i%5==0) {
    			res.add("FizzBuzz");
    		} else {
    			if(i%3==0) {
    				res.add("Fizz");
    			} else if(i%5==0) {
    				res.add("Buzz");
    			} else
    				res.add(Integer.toString(i));
    				//res.add(""+i);
    		}
		}
    	return res;
    }
}
