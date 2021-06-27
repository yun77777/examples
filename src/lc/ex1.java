package lc;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int[] nums=new int[T];
		int[] result=new int[2];
		int target=0;
		for(int i=0;i<T;i++) {
			nums[i]=sc.nextInt();
		}
		target=sc.nextInt();
		result=twoSum(nums,target);
		for(int i=0;i<T;i++) {
			System.out.println(result[i]);
		}
			
	}
	public static int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        boolean flag=false;
        for(int i=0;i<nums.length-1;i++){
            if(flag)
                break;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                	result[0]=i;
                	result[1]=j;
                    flag=true;
                }
            }
        }
        return result;
    }
}
