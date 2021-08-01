package lc;

public class ex704 {
	public static void main(String[] args) {
		int[] nums= {2,5};
//		int[] nums= {-1,0,3,5,9,12};
		System.err.println(search(nums,9));
	}
    public static int search(int[] nums, int target) {
    	int low=0,high=nums.length-1;
    	if(high==0&&nums[0]==target) return 0;
    	while(low<=high) {
    		int mid=(low+high)/2;
    		System.err.println(mid+","+nums[mid]);
    		if(nums[mid]==target)
    			return mid;
    		else if(nums[mid]>target)
    			high=mid-1;
    		else
    			low=mid+1;
    	}
    	return -1;
	}
}
