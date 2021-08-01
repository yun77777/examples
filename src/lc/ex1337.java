package lc;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ex1337 {
	public static void main(String[] args) {
		int[][] mat={{1,1,0,0,0},
				 {1,1,1,1,0},
				 {1,0,0,0,0},
				 {1,1,0,0,0},
				 {1,1,1,1,1}};
		int k=3;
		System.err.println(kWeakestRows(mat,k));
	}
    public static int[] kWeakestRows(int[][] mat, int k) {
//    	IntStream.of(mat);
//    public static int[] kWeakestRows(int[][] mat, int k) {
//    	int rows=mat.length;
//    	int cols=mat[0].length;
//    	int[] score=new int[rows];
//    	int j;
//    	for (int i = 0; i < rows; i++) {
//    		j=0;
//    		for(;j<cols;j++) {
//    			if(mat[i][j]==0)break;
//    		}
//    		score[i]=j*rows+i;
//    	}
//    	Arrays.sort(score);
//    	for (int i = 0; i < score.length; i++) {
//    		score[i]=score[i]%rows;
//    	}
//    	return Arrays.copyOfRange(score,0,k);
//    }
}
