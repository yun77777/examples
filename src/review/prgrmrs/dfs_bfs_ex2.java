package review.prgrmrs;

public class dfs_bfs_ex2 {

	public static void main(String[] args) {
		System.err.println(solution(3, new int[][] {{1,1,0},{1,1,0},{0,0,1}}));
	}
	
	public static boolean[] visited;
	public static int solution(int n, int[][] computers) {
        int total=0;
        visited=new boolean[computers.length];
        for (int i = 0; i < computers.length; i++) {
        	if(!visited[i]) {
        		dfs(n, i, computers);
        		total++;
        	}
		}
        return total;
    }
	
	public static void dfs(int n, int i, int[][] computers) {
		visited[i]=true;
		
		for (int j = 0; j < computers.length; j++) {
			if(i!=j && computers[i][j]==1 && !visited[j])
				dfs(n, j, computers);
		}
		
	}
}
