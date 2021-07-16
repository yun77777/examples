package lc;

import java.util.HashSet;
import java.util.Set;

public class ex217 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s=sc.nextLine();
//		System.out.println(isValid(s));
		int[] nums= {1,2,3,1};
		System.err.println(containsDuplicate(nums));

	}

	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set=new HashSet<>();
		for (int i = 0; i < nums.length-1; i++) {
			if(set.contains(nums[i]))
				return true;
			set.add(nums[i]);
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
