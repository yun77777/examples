package prgrmrs;

import java.util.HashSet;

public class relayWords_lv2 {

	public static void main(String[] args) {
		String[] words= {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
//		String[] words= {"hello", "hello", "even", "never", "now", "world", "draw"};
//		String[] words= {"hello", "one", "even", "never", "now", "world", "draw"};
//		String[] words= {"ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		int[] res=solution(2, words);
		System.err.println(res[0]+"번째");
		System.err.println(res[1]+"차례");
	}

	public static int[] solution(int n, String[] words) {
		int[] res=new int[] {0,0};
		HashSet<String> hs=new HashSet<>();
		int num=1, order=1;
		char ch=words[0].charAt(0);
		for(String word: words) {
			if(hs.contains(word)||ch!=word.charAt(0)) return new int[] {num,order};
			hs.add(word);
			ch=word.charAt(word.length()-1);
			if(++num>n) {
				num=1;
				order++;
			}
		}
		return res;
	}
}
