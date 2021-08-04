package lc;

import java.util.HashSet;
import java.util.Set;

public class ex36 {

	public static void main(String[] args) {
		char[][] board={{'5','3','.','.','7','.','.','.','.'}
						,{'6','.','.','1','9','5','.','.','.'}
						,{'.','9','8','.','.','.','.','6','.'}
						,{'8','.','.','.','6','.','.','.','3'}
						,{'4','.','.','8','.','3','.','.','1'}
						,{'7','.','.','.','2','.','.','.','6'}
						,{'.','6','.','.','.','.','2','8','.'}
						,{'.','.','.','4','1','9','.','.','5'}
						,{'.','.','.','.','8','.','.','7','9'}};
		System.err.println(isValidSudoku(board));

	}
    public static boolean isValidSudoku(char[][] board) {
    	Set set=new HashSet();
    	for(int i=0;i<9;i++) {
    		for(int j=0;j<9;j++) {
    			if(board[i][j]!='.') {
    				String b="("+board[i][j]+")";
    				System.err.println(b+i);
    				System.err.println(i+b);
    				System.err.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        			if(!set.add(b+i)||!set.add(j+b)||!set.add(i/3+b+j/3)) return false;
    			}
    		}
    	}
    	return true;
    }
}
