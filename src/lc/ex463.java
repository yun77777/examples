package lc;

public class ex463 {
	public static void main(String[] args) {
		int[][] grid= {{0,1,0,0},{1,1,1,0},{0,1,0,0}};
		System.err.println(islandPerimeter(grid));
	}

    public static int islandPerimeter(int[][] grid) {
    	int islands=0, neighbors=0;
    	for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if(grid[i][j]==1) {
					islands++;
					if(i<grid.length-1 && grid[i+1][j]==1) neighbors++;
					if(j<grid[i].length-1 && grid[i][j+1]==1) neighbors++;
				}
			}
		}
    	
    	return islands*4-neighbors*2;
	}
}