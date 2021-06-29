package lc;

import java.util.Scanner;

public class ex35 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s=sc.nextLine();
//		String ss=sc.nextLine();
		int[] a= {1,3,5,6};
		System.out.println(searchInsert(a,5));
	}

	public static int searchInsert(int[] nums, int target) {
		int tmp = 0, idx = 0;
		int[] result = new int[nums.length + 1];
		for (int i = 0; i < nums.length; i++) {
			result[i] = nums[i];
		}
		result[nums.length] = target;
		for (int i = 0; i < result.length - 1; i++) {
			for (int j = i + 1; j < result.length; j++) {
				if (result[j] < result[i]) {
					tmp = result[i];
					result[i] = result[j];
					result[j] = tmp;
				}
			}
		}
//		for (int i = 0; i < result.length; i++) 
//			System.err.println("re:"+result[i]);
//		
		for (int i = 0; i < result.length; i++) {
			if (result[i] == target) {
				idx = i;
				break;

			}
		}
		return idx;

//    	int tmp=0,idx=0; 
//    	int[] result=new int[nums.length+1];
//    	for (int i = 0; i < nums.length; i++) {
//    		result[i]=nums[i];
//    	}
//    	result[nums.length]=target;
//    	for (int i = 0; i < result.length-1; i++) {
//    		for (int j = i+1; j < result.length; j++) {
//    			if(result[j]>result[i]) {
//    				tmp=result[i];
//    				result[i]=result[j];
//    				result[j]=tmp;
//    			}
//    		}
//    	}
//    	for (int i = 0; i < result.length; i++) {
//    		if(result[i]==target)
//    			idx=i;
//    		if(result[i]<target) {
//    			idx=i;
//    		} else {
//    			idx=i;
//    		}
//    	}
//    	return idx;
	}
}