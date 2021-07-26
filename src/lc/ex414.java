package lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ex414 {
	static int[] nums;

	public static void main(String[] args) {
//		int[] nums= {3,1};
//		int[] nums= {1,3,2,5,7};
		int[] nums= {3,2,1};
		System.err.println(thirdMax(nums));
	}
    public static int thirdMax(int[] nums) {
    	Set<Integer> hs=new HashSet<Integer>();
    	Arrays.sort(nums);
    	for (int i = nums.length-1; i>=0; i--) {
    		System.err.println(nums[i]);
			hs.add(nums[i]);
			if(hs.size()>2)
				break;
		}
    	System.err.println("h:"+hs);
    	List<Integer> res=new ArrayList(hs);
    	return res.size()<3 ? res.get(res.size()-1) : res.get(0);
    }
}
