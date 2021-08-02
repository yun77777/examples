package review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex88 {
	public static void main(String[] args) {
		int[] nums1= {0,0,0,0,0};
//		int[] nums1= {1,3,5,0,0,0,0,0};
		int[] nums2= {2,4,6,8,10};
		merge(nums1,0,nums2,5);
//		merge(nums1,3,nums2,3);
		for(int n:nums1)
			System.err.println(n);
		System.err.println("=====");
	}
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    	int i=m-1, j=n-1, k=m+n-1;
    	while(i>=0&&j>=0) {
    		if(nums1[i]<nums2[j]) nums1[k--]=nums2[j--];
    		else nums1[k--]=nums1[i--];
    	}
    	while(j>=0) {
    		nums1[j]=nums2[j];
    		j--;
    	}
    }
}
