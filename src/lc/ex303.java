package lc;

public class ex303 {
	static int[] nums;
	public static void main(String[] args) {
		/**
		 * Your NumArray object will be instantiated and called as such:
		 */
		int[] nums= {-2, 0, 3, -5, 2, -1};
		ex303 obj = new ex303(nums);
		int param_1 = obj.sumRange(1,2);
	}
	
	public ex303(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			
		}
		this.nums=nums;
    }
    
    public static int sumRange(int left, int right) {
    	int sum=0;
        for (int i = left; i <= right; i++) {
        	sum+=nums[i];
		}
        return sum;
    }
}
