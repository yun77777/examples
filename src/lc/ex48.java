package lc;

public class ex48 {

	public static void main(String[] args) {
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
	}
    public static void rotate(int[][] matrix) {
    	for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[0].length; j++) {
				int tmp=0;
				tmp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=tmp;
			}
		}
    	for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length/2; j++) {
				int tmp=0;
				tmp=matrix[i][j];
				matrix[i][j]=matrix[i][matrix.length-1-j];
				matrix[i][matrix.length-1-j]=tmp;
			}
		}
    	for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.err.print(matrix[i][j]);
			}
			System.err.println();
		}
    	
    }
}
