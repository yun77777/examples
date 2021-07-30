package review;

public class ex463_2 {
	public static void main(String[] args) {
	}
    public int islandPerimeter(int[][] grid) {
    	int islands=0, neighbors=0;
    	for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if(grid[i][j]==1) {
					islands++;
					if(i<grid.length-1&&grid[i+1][j]==1)neighbors++;
					if(j<grid[i].length-1&&grid[i][j+1]==1)neighbors++;
				}
			}
		}
    	return islands*4-2*neighbors;
    }
}

//	1
// 2 2
//3 3
//44