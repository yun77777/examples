package lc;

import java.util.ArrayList;
import java.util.List;

public class ex228 {
	public void main(String[] args) {
		int [] nums= {0,1,2,4,5,7};
		System.err.println("ff");
//		System.err.println(summaryRanges(nums));
	}

	public List<String> summaryRanges(int[] nums) {
		List<String> list=new ArrayList<String>();
		StringBuilder sb=new StringBuilder();
		int i=0;

		while(i<nums.length) {
			int temp=nums[i];
			sb.append(nums[i++]);
			while(i<nums.length && nums[i]-nums[i-1]==1) i++;
			if(temp!=nums[i-1]) sb.append("->").append(nums[i-1]);
			list.add(sb.toString());
			sb.setLength(0);
		}
		return list;
	}
}
