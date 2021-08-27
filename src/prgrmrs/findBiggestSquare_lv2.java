package prgrmrs;

public class findBiggestSquare_lv2 {

	public static void main(String[] args) {
		int[][] board= {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		System.err.println(solution(board));
	}
	//DP
	public static int solution(int[][] board) {
		int[][] dp=new int[board.length][board[0].length];
		int answer=0;
		
		if(board.length==1 || board[0].length==1) return 1;
		
		for(int i=0; i<board.length; i++)
			dp[i][0]=board[i][0];
		
		for(int i=0; i<board[0].length; i++)
			dp[0][i]=board[0][i];
		
		for (int i = 1; i < board.length; i++) {
			for (int j = 1; j < board[0].length; j++) {
				if(board[i][j]==1) {
					dp[i][j]=Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1])+1;//최솟값+1(board[i][j]값)
				}
				answer=dp[i][j]>answer ? dp[i][j] : answer;
			}
		}
		return (int)Math.pow(answer, 2);
	}
}
//package prgrmrs;
//
//public class findBiggestSquare_lv2 {
//	
//	public static void main(String[] args) {
//		int[][] board= {{0,1,1,1},{1,1,1,0},{1,1,0,1},{0,0,1,0}};
//		System.err.println(solution(board));
//	}
//	
//	public static int solution(int[][] board) {
//		for (int i = 1; i < board.length; i++) {
//			dfs(board, i, 0, 0);
//		}
//		System.err.println(count);
//		return count;
//	}
//	public static int count=0;
//	public static void dfs(int[][] board, int i, int j, int cnt) {
//		if(board[i][j]!=0) return;
//		if(j-1>=0 && board[i][j-1]==1)
//			dfs(board, i, j-1, cnt+1);
//		if(i-1>=0 && board[i-1][j]==1)
//			dfs(board, i-1, j, cnt+1);
//		if(j+1<board[0].length && board[i][j+1]==1)
//			dfs(board, i, j+1, cnt+1);
//		if(i+1<board.length && board[i+1][j]==1)
//			dfs(board, i+1, j, cnt+1);
//		count+=cnt;
//	}
//}
