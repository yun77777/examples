package lc;

import java.util.Arrays;

public class ex41 {

	public static void main(String[] args) {
//		int nums[]= {1,2,0};
//		int nums[]= {1,1};
//		int nums[]= {7,8,9,11,12};
//		int nums[]= {2,1};
//		int nums[]= {-1,-2,-60,40,43};
//		int nums[]= {2};
//		int nums[]= {1};
		int nums[]= {3,4,-1,1};
		System.err.println(firstMissingPositive(nums));
	}
    public static int firstMissingPositive(int[] nums) {
    	//120
    	//34-11
    	//7891112
    	//1 0 -1
    	Arrays.sort(nums);
    	
    	int n=1;
    	for (int i = 0; i < nums.length-1; i++) {
    		if(nums[i]==nums[i+1]) continue;
    		
			if(nums[i]>0) {
				if(nums[i]==n) n++;
				else break;
			}
		}
    	
    	if(nums[nums.length-1]==n) n++;
    	
    	return n;
    }
}
