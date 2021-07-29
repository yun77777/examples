package lc;

import java.util.stream.IntStream;

public class ex453 {
	static int[] nums;

	public static void main(String[] args) {
//		int[] nums= {1,1,1};
		int[] nums = { 1, 2, 3 };
		System.err.println(minMoves(nums));
	}
	// 123 233 334 /444 (1,2,3)
	// 122 232 /333(1,2,2)
	public static int minMoves(int[] nums) {
		return IntStream.of(nums).sum()-nums.length*IntStream.of(nums).min().getAsInt();
	}
//	public static int minMoves(int[] nums) {
//		int cnt = 0;// 123 233 334 444
//		// 6-3=3
//		if (nums.length == 0)
//			return 0;
//		int min = nums[0];
//		for (int n : nums) {
//			min = Math.min(min, n);
//		}
//		int res = 0;
//		// res+=n-min
//		for (int n : nums)
//			res += n - min;
//		return res;
//	}
}
//    	boolean flag=true;
//    	
//    	for (int i = 0; i < nums.length; i++) {
//    		for (int j = 0; j < nums.length; j++) {
//				if(nums[i]!=nums[j]) {
//					flag=false;
//					break;
//				}
//			}
//    		if(flag)
//				return cnt;
//    		System.err.println(nums[i]);
//    		Arrays.sort(nums);
//			for (int j = 0; j < nums.length-1; j++) {
//				System.err.println("N:"+nums[j]);
//				nums[j]++;
//				System.err.println("@@@@@:"+nums[j]);
//			}
//			
//			cnt++;
//			
//			
//		}
//    	for (int i = 0; i < nums.length; i++) {
//			System.err.println("$$$$$$$$$$$$$$$$$"+nums[i]);
//		}
//    	return cnt;
//    }
//}
