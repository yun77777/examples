package lc;

import java.util.Scanner;

public class ex53 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s=sc.nextLine();
//		String ss=sc.nextLine();
		int[] a= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(a));
	}

    public static int maxSubArray(int[] nums) {
    	if(nums.length==1) return nums[0];
    	int max=nums[0],sum=0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		sum=0;
    		for (int j = i; j < nums.length; j++) {
				sum+=nums[j];
				if(sum>max)
					max=sum;
			}
		}
    	
    	return max;
    }
}