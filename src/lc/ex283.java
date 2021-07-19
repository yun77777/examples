package lc;

public class ex283 {
	public static void main(String[] args) {
		int[] nums= {0,1,0,3,12};
		moveZeroes(nums);
	}
	
    public static void moveZeroes(int[] nums) {
    	if(nums==null||nums.length==0) return;
    	int idx=0;
    	for(int num:nums) {
    		if(num!=0) nums[idx++]=num;
    	}
    	while(idx<nums.length) {
    		nums[idx++]=0;
    	}
    }
}
