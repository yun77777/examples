package prgrmrs;

public class dfs_bfs_ex2 {

	public static void main(String[] args) {
		int n=3;
		int[][] computers= {{1,1,0},{1,1,0},{0,0,1}};
		
		System.err.println(solution(n, computers));
	}
	
	public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(computers,visited,i);
                answer++;
            }
        }
        return answer;
    }
    public static boolean[] dfs(int[][] computers, boolean[] visited, int i){
        visited[i]=true;
        for(int j=0;j<visited.length;j++){
            if(i!=j && computers[i][j]==1 && !visited[j]) dfs(computers,visited,j);
        }
        return visited;
    }	
	
	
	
	
//	public static int solution(int n, int[][] computers) {
//        int answer = 0;
//        boolean[] visited=new boolean[n];
//        
//        for(int i=0;i<n;i++) {
//        	if(!visited[i]) {//미방문했을 경우
//        		dfs(computers, visited, i);
//        		answer++;//탐색 후 answer++
//        	}
//        }
//        
//        return answer;
//    }
//	
//	public static boolean[] dfs(int[][] computers, boolean[] visited, int i) {
//		visited[i]=true;//방문함
//		for(int j=0;j<visited.length;j++) {
//			if(i!=j && computers[i][j]==1 && !visited[j]) dfs(computers, visited, j);
//		}
//		return visited;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static int solution(int n, int[][] computers) {
//		int answer = 0;
//		if(n==0) return 0;
//		
//		boolean[] visited=new boolean[n];
//		
//		for(int i=0;i<n;i++) {
//			if(!visited[i]) {
//				dfs(computers,i,visited);
//				answer++;
//			}
//		}
//		return answer;
//	}
//	
//	public static boolean[] dfs(int[][] computers, int i, boolean[] visited) {
//		visited[i]=true;
//		for(int j=0;j<computers.length;j++) {
//			if(i!=j && computers[i][j]==1 && visited[j]==false) visited=dfs(computers, j, visited);
//		}
//		return visited;
//	}
}
