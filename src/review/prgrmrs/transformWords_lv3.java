package review.prgrmrs;

public class transformWords_lv3 {

	public static void main(String[] args) {
		String[] words= {"hot", "dot", "dog", "lot", "log", "cog"};
		System.err.println(solution("hit", "cog", words));
	}

	public static boolean[] visited;
	public static int count=0;
	public static int solution(String begin, String target, String[] words) {
		visited=new boolean[words.length];
		dfs(begin, target, words, 0);
		return count;
	}
	
	public static void dfs(String begin, String target, String[] words, int cnt) {
		if(begin.equals(target)) {
			count=cnt;
			return;
		}
		for (int i = 0; i < words.length; i++) {
			if(visited[i]) continue;
			if(check(begin, words[i])) {
				visited[i]=true;
				dfs(words[i], target, words, cnt+1);
				visited[i]=false;
			}
		}
	}
	
	//check if there's only one word difference between two sentences
	public static boolean check(String str1, String str2) {
		int cnt=0;
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i)!=str2.charAt(i)) cnt++;
			if(cnt>1) return false;
		}
		return true;
	}
	
}
