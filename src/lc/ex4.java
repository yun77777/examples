package lc;

import java.util.Arrays;

public class ex4 {
	public static void main(String[] args) {
		int [] nums1= {1,2},nums2= {3,4};
		System.err.println(findMedianSortedArrays(nums1, nums2));
	}
	
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	if(nums1==null) nums1=nums2;
    	if(nums2==null) nums2=nums1;
    	int[] res=new int[nums1.length+nums2.length];
    	double avg=0.0;
    	int i=0;
    	for(int n:nums1) res[i++]=n;
    	for(int n:nums2) res[i++]=n;
    	Arrays.sort(res);
    	int mid=(res.length-1)/2;
    	return res.length%2==0?(res[mid]+res[mid+1])/2.0:res[mid];
    }
}
