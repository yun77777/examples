package lc;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ex15 {
	public static void main(String[] args) {
//		int[] nums= {0,0};
		int[] nums= {-1,0,1,2,-1,-4};
		System.err.println(threeSum(nums));
	}

	public static List<List<Integer>> threeSum(int[] nums) {
	}
//	public static List<List<Integer>> threeSum(int[] nums) {
//		List<List<Integer>> res = new ArrayList<List<Integer>>();
//		List<Integer> list = new ArrayList<Integer>();
//		for (int i = 0; i < nums.length - 1; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				for (int k = j+1; k < nums.length; k++) {
//					if(nums[i]+nums[j]+nums[k]==0) {
//						list.add(nums[i]);
//						list.add(nums[j]);
//						list.add(nums[k]);
//						list.sort(null);
//						if(!res.contains(list))
//							res.add(list);
//						list = new ArrayList<Integer>();
//					}
//				}
//			}
//		}
//		return res;
//	}
}
