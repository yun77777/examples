package review.lc;

public class ex283 {
    public void moveZeroes(int[] nums) {
    	if(nums==null||nums.length==0) return;
    	int idx=0;
    	for(int n:nums)
    		if(n!=0) nums[idx++]=n;
    	while(idx<nums.length) nums[idx++]=0;
    }
//    public void moveZeroes(int[] nums) {
//    	int tmp=0;
//    	for (int i = 0; i < nums.length-1; i++) {
//    		for (int j = i+1; j < nums.length; j++) {
//    			if(nums[i]==0) {
//    				tmp=nums[i];
//    				nums[i]=nums[j];
//    				nums[j]=tmp;
//    			}
//    		}
//    	}
//    }
}
