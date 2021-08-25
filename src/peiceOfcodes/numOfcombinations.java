package peiceOfcodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//총 조합 수 구하기
public class numOfcombinations {

	public static List<HashSet<Integer>> list;
	public static int ans;//총 조합 개수
	public static int len;
	public static void main(String[] args) {
		ans=0;
		list=new ArrayList<HashSet<Integer>>();
		
		String[][] relation={{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
		len=relation[0].length;
		
		for (int i = 0; i < relation.length; i++) {
			makeCombinations(-1, i, 0, new HashSet<Integer>());
		}
		System.err.println(list);
	}
	
	public static void makeCombinations(int start, int end, int count, HashSet<Integer> hs) {
		if(count==end) {
			ans++;
			list.add(hs);
			return;
		}
		for(int i=start+1; i<len; i++) {
			HashSet<Integer> newHs=new HashSet<Integer>(hs);
			newHs.add(i);
			makeCombinations(i, end, count+1, newHs);
		}
	}
}
