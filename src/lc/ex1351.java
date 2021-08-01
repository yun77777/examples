package lc;

import java.io.IOException;

public class ex1351 {
	public static void main(String[] args) throws IOException {
		int[][] grid={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		System.err.println(grid);
	}

	public int countNegatives(int[][] grid) {
		int cnt=0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if(grid[i][j]<0) cnt++;
			}
		}
		return cnt;
	}
}
