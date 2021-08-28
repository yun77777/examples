package review.prgrmrs;

import java.util.ArrayList;
import java.util.List;

public class dfs_bfs_ex3 {

	public static void main(String[] args) {
		System.err.println(solution("hit","cog", new String[] {"hot", "dot", "dog", "lot", "log", "cog"}));
	}
	
	public static boolean visited[];
	public static int min;
	//begin->target 최소 단계
	public static int solution(String begin, String target, String[] words) {
        int answer = 0;
        visited=new boolean[words.length];
        min=Integer.MAX_VALUE;
        dfs(begin, target, words, 0);
        return min;
    }
	
	public static void dfs(String begin, String target, String[] words, int cnt) {
		List<String> list=new ArrayList<>();
		for(String str: words) {
			list.add(str);
		}
		if(!list.contains(target)) {
			min=0;
			return;
		}
		if(begin.equals(target)) {
			if(cnt<min) {
				min=cnt;
			}
			return;
		}
		int count=0;
		//한 글자 다른 경우
		for (int i = 0; i < words.length; i++) {
			count=0;
			for (int j = 0; j < words[0].length(); j++) {
				if(begin.charAt(j)!=words[i].charAt(j))
					count++;
				if(count>1)
					break;
			}
			if(count==1) {
				if(!visited[i]) {
					visited[i]=true;
					dfs(words[i], target, words, cnt+1);
					visited[i]=false;
				}
			}
		}
	}
}
