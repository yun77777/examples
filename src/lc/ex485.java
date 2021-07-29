package lc;

public class ex485 {
	public static void main(String[] args) {
		int[] nums= {1,1,0,1,1,1};
		System.err.println(findMaxConsecutiveOnes(nums));
	}

    
    public static int findMaxConsecutiveOnes(int[] nums) {
    	int max=0,sum=0,i=0;
    	while(i<nums.length) {
    		if(nums[i]==0)
    			sum=0;
    		else
    			sum++;
    		if(sum>max)
    			max=sum;
    		i++;
    	}
    	return max;
    }
	
//	public static int findMaxConsecutiveOnes(int[] nums) {
//    	int max=0, sum=0;
//    	for(int n : nums) {
//    		max=Math.max(max, sum= n==0 ? 0 : sum+1);
//    	}
//    	return max;
//	}
}