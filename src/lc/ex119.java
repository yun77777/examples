package lc;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ex119 {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int T=sc.nextInt();
//		int[] nums=new int[T];
//		int[] result=new int[2];
//		int target=0;
//		for(int i=0;i<T;i++) {
//			nums[i]=sc.nextInt();
//		}
//		target=sc.nextInt();
//		result=twoSum(nums,target);
//		for(int i=0;i<T;i++) {
//			System.out.println(result[i]);
//		}
			
	}
	public List<List<Integer>> generate(int numRows)
	{
		List<List<Integer>> allrows = new ArrayList<List<Integer>>();
		ArrayList<Integer> row = new ArrayList<Integer>();
		for(int i=0;i<numRows;i++)
		{
			row.add(0, 1);
			for(int j=1;j<row.size()-1;j++)
				row.set(j, row.get(j)+row.get(j+1));
			allrows.add(new ArrayList<Integer>(row));
		}
		return allrows;
		
	}
}
