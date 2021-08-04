package lc;

public class ex79 {

	public static void main(String[] args) {
		char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCCED";
		System.err.println(exist(board, word));
	}
	
    public static boolean exist(char[][] board, String word) {
    	boolean[][] visited=new boolean[board.length][board[0].length];
    	for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(search(board,word,i,j,0,visited)) return true;
			}
		}
    	return false;
    }
    
    public static boolean search(char[][] board, String word, int i, int j, int idx,boolean[][] visited) {
    	if(idx==word.length()) return true;
    	
    	if(i<0||j<0|i>=board.length||j>=board[0].length||board[i][j]!=word.charAt(idx)||visited[i][j]) return false;
    	
    	visited[i][j]=true;
    	if(search(board, word, i-1, j, idx+1, visited)||search(board, word, i+1, j, idx+1, visited)||search(board, word, i, j-1, idx+1, visited)||search(board, word, i, j+1, idx+1, visited)) return true;
    	visited[i][j]=false;
    	return false;
    	
    }
    
//    public static boolean exist(char[][] board, String word) {
//    	boolean[][] visited=new boolean[board.length][board[0].length];
//    	for (int i = 0; i < board.length; i++) {
//    		for (int j = 0; j < board[i].length; j++) {
////				System.err.println(search(board,word,i,j,0,visited));
//    			if(search(board, word, i, j, 0, visited)) return true;
//    		}
//    	}
//    	return false;
//    }
//    
//    public static boolean search(char[][] board, String word, int i, int j, int idx,boolean[][] visited) {
//    	if(idx==word.length()) return true;
//    	if(i<0||j<0||i>=board.length||j>=board[i].length||board[i][j]!=word.charAt(idx)||visited[i][j]) return false;
//    	visited[i][j]=true;
//    	if(search(board, word, i-1, j, idx+1, visited)||search(board, word, i+1, j, idx+1, visited)||search(board, word, i, j-1, idx+1, visited)||search(board, word, i, j+1, idx+1, visited)) return true;
//    	visited[i][j]=false;
//    	return false;
//    }
}
