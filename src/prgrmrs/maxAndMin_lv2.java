package prgrmrs;

import java.util.Arrays;

public class maxAndMin_lv2 {

	public static void main(String[] args) {
		System.err.println(solution("1 2 3 4"));
	}

	//최소값 최대값
	public static String solution(String s) {
		String[] strs=s.split(" ");
		int[] nums=new int[strs.length];
		int idx=0;
		for(String str: strs) {
			nums[idx++]=Integer.parseInt(str);
		}
		
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			System.err.println(nums[i]);
		}
		
		return nums[0]+" "+nums[strs.length-1];
	}
}
