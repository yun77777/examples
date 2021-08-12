package review.prgrmrs;

public class network_lv3 {

	public static void main(String[] args) {
		int[][] computers={{1,1,0},{1,1,0},{0,0,1}};
//		int[][] computers = { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } };
		System.err.println(solution(3, computers));
	}
	static boolean[] visited;
	public static int solution(int n, int[][] computers) {
		int answer = 0;
		visited = new boolean[computers.length];
		for (int i = 0; i < computers.length; i++) {
			if(!visited[i])
				answer += dfs(computers, i);
		}
		return answer;
	}
	public static int dfs(int[][] computers, int i) {
		visited[i]=true;
		int cnt=0;
		for (int j = 0; j < computers[0].length; j++) {
			if(i!=j && computers[i][j]==1 && !visited[j]) {
				dfs(computers, j);
				System.err.println(cnt);
			}
		}
		return 1;
	}
}
