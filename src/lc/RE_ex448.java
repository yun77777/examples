package lc;

import java.util.ArrayList;
import java.util.List;

public class RE_ex448 {
	static int[] nums;

	public static void main(String[] args) {
		int[] nums= {4,3,2,7,8,2,3,1};
		System.err.println(findDisappearedNumbers(nums));
	}
    public static List<Integer> findDisappearedNumbers(int[] nums) {
    	int tmp=0;
    	for (int i = 0; i < nums.length; i++) {
			while(nums[i]!=i+1 && nums[i]!=nums[nums[i]-1]) {
				tmp=nums[i];
				nums[i]=nums[tmp-1];
				nums[tmp-1]=tmp;
			}
		}
    	List<Integer> res=new ArrayList<Integer>();
    	for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=i+1)
				res.add(i+1);
		}
    	return res;
    }
}
