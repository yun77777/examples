package lc;

import java.util.ArrayList;
import java.util.List;

public class ex119 {
	public static void main(String[] args) {
		System.out.println(getRow(3));
			
	}
	
    public static List<Integer> getRow(int rowIndex)
	{
		List<List<Integer>> allRows = new ArrayList<List<Integer>>();
		ArrayList<Integer> row = new ArrayList<Integer>();
		for(int i=0;i<=rowIndex;i++)
		{
			row.add(0,1);
			for(int j=1;j<row.size()-1;j++) {
				row.set(j, row.get(j)+row.get(j+1));
			}
			allRows.add(new ArrayList<Integer>(row));
		}
		return allRows.get(rowIndex);
	}
//	public static List<List<Integer>> generate(int numRows)
//	{
//		List<List<Integer>> allrows = new ArrayList<List<Integer>>();
//		ArrayList<Integer> row = new ArrayList<Integer>();
//		for(int i=0;i<numRows;i++)
//		{
//			row.add(0, 1);
//			for(int j=1;j<row.size()-1;j++)
//				row.set(j, row.get(j)+row.get(j+1));
//			allrows.add(new ArrayList<Integer>(row));
//		}
//		return allrows;
//	}
}
