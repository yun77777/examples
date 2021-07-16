package lc;

import java.util.HashMap;
import java.util.Map;

public class ex219 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s=sc.nextLine();
//		System.out.println(isValid(s));
		int[] nums= {1,2,3,1};
		System.err.println(containsDuplicate(nums,3));

	}

	public static boolean containsDuplicate(int[] nums, int k) {
		Map<Integer,Integer> mp=new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(mp.containsKey(nums[i])) {
				if(i-mp.get(nums[i])<=k)
					return true;
				else
					mp.put(nums[i],i);
			}
			else
				mp.put(nums[i],i);
		}
		return false;
	}
//	public static boolean containsDuplicate(int[] nums) {
//		int i=0,j=0;
//		while(i<nums.length-1) {
//			j=i+1;
//			while(j<nums.length) {
//				if(nums[i]==nums[j]&&i!=j)
//					return true;
//				j++;
//			}
//			
//			i++;
//		}
//		return false;
//	}
	
//	public static boolean containsDuplicate(int[] nums) {
//		for (int i = 0; i < nums.length-1; i++) {
//			for (int j = i+1; j < nums.length; j++) {
//				if(nums[i]==nums[j]) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
}
