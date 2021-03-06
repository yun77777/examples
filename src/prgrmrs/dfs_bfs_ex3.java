package prgrmrs;

import java.util.ArrayList;
import java.util.Arrays;

public class dfs_bfs_ex3 {

	public static void main(String[] args) {
		String[] words = { "hot", "dot", "dog", "lot", "log", "cog" };
		String begin = "hit", target = "cog";
		System.err.println(solution(begin, target, words));
	}

	static int answer = 0;
	public static int solution(String begin, String target, String[] words) {
//		int answer = 0;
		boolean[] visited=new boolean[words.length];
		dfs(begin, target, words, visited,0);
		return answer;
	}
	public static boolean[] dfs(String begin, String target, String[] words, boolean[] visited, int cnt) {//cnt for counting depth
		if(begin.equals(target)) {
			answer=cnt;
			return visited;
		}
		
		for (int i = 0; i < words.length; i++) {
			if(visited[i]) continue;
			int count=0;
			for (int j = 0; j < begin.length(); j++) {
				if(words[i].charAt(j)!=begin.charAt(j)) count++;
			}
			
			if(count==1) {
				visited[i]=true;
				dfs(words[i], target, words, visited,cnt+1);
				visited[i]=false;
			}
		}
		return visited;
		
	}
}
//    public static int solution(String begin, String target, String[] words) {
//    	int answer = 0;
//    	ArrayList<String> stack=new ArrayList<String>();
//    	ArrayList<String> sub=new ArrayList<String>();
//    	ArrayList<String> wordList=new ArrayList<String>(Arrays.asList(words));
//    	stack.add(begin);
//    	int count=0;
//    	String word;
//    	if(!wordList.contains(target)) return 0;
//    	
//    	while(wordList.size()>0) {
//    		sub.clear();
//    		for(String s:stack) {
//    			for(int w=0;w<wordList.size();w++) {
//    				count=0;
//    				word=wordList.get(w);
//    				for(int i=0;i<s.length();i++) {
//    					if(s.charAt(i)!=word.charAt(i)) count++;
//    					if(count==2) break;
//    				}
//    				if(count==1) {
//    					sub.add(word);
//    					wordList.remove(word);
//    					w--;
//    				}
//    			}
//    		}
//    		answer++;
//    		if(sub.contains(target)) return answer;
//    		stack.clear();
//    		stack.addAll(sub);
//    	}
//    	return answer;
//    }

//}
