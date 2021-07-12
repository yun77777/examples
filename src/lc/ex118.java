package lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex118 {
	public static void main(String[] args) {
		System.out.println(generate(2));
			
	}
    public static List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> allRows=new ArrayList<List<Integer>>();
    	List<Integer> row=new ArrayList<Integer>();
    	for (int i = 0; i < numRows; i++) {
			row.add(0,1);
			for (int j = 1; j < row.size()-1; j++) {
				row.set(j, row.get(j)+row.get(j+1));
			}
			allRows.add(new ArrayList<Integer>(row));
		}
    	
    	return allRows;
    	
//        Integer[] arr = new Integer[k + 1];
//        Arrays.fill(arr, 0);
//        arr[0] = 1;
//        
//        for (int i = 1; i <= k; i++) 
//            for (int j = i; j > 0; j--) 
//                arr[j] = arr[j] + arr[j - 1];
//        
//        return Arrays.asList(arr);
    }
}
