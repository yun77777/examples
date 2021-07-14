package lc;

import java.io.IOException;

public class ex169 {
	public static void main(String[] args) throws IOException {
		int[] nums={2,2,1,1,1,2,2};
		int i=0;
//		while(i<nums.length) {
//			if(cnt(nums[i],nums)>=nums.length/2) {
//				System.out.println(nums[i]);
//				break;
//			}
//		}
	}
    public static int cnt(int[] nums) {
    	int count=0;
    	for (int i = 0; i < nums.length; i++) {
    		count=0;
			for (int j = 0; j < nums.length; j++) {
				if(nums[i]==nums[j])
					count++;
			}
			if(count>nums.length/2)
				return nums[i];
		}
    	return 0;
    }
//    public static int cnt(int num,int[] nums) {
//    	int count=0,i=0;
//    	while(i<nums.length) {
//    		if(num==nums[i])
//    			count++;
//    		i++;
//    	}
//    	return count;
//    }
}
