package lc;

import java.io.IOException;

public class ex167 {
	public  void main(String[] args) throws IOException {
		int[] numbers= {2,7,11,15};
		System.out.println(twoSum(numbers,9));
			
	}
	 public int[] twoSum(int[] numbers, int target) {
		 int[] result=new int[2];
	        for (int i = 0; i < numbers.length-1; i++) {
				for (int j = i+1; j < numbers.length; j++) {
					if(numbers[i]+numbers[j]==target) {
						result[0]=i+1;
						result[1]=j+1;
						return result;
					}
				}
			}
	        return null;
	    }
}
