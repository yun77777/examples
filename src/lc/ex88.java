package lc;

import java.util.Scanner;

public class ex88 {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int T=sc.nextInt();
//		int[] nums=new int[T];
//		int[] result=new int[2];
//		int target=0;
//		for(int i=0;i<T;i++) {
//			nums[i]=sc.nextInt();
//		}
//		target=sc.nextInt();
//		result=twoSum(nums,target);
//		for(int i=0;i<T;i++) {
//			System.out.println(result[i]);
//		}
			
	}
	
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    	int k=0,tmp=0;
    	for (int i = 0; i < nums1.length; i++) {
			if(nums1[i]==0) {
				nums1[i]=nums2[k++];
			}
		}
    	for (int i = 0; i < nums1.length; i++) {
    		for (int j = i+1; j < nums1.length-1; j++) {
				if(nums1[i]>nums1[j]) {
					tmp=nums1[i];
					nums1[i]=nums1[j];
					nums1[j]=tmp;
				}
			}
    	}
    }
    
}
