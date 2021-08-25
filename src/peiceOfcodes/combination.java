package peiceOfcodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//조합 구하기
public class combination {

	public static List<HashSet<String>> list;
	public static int len;
	public static void main(String[] args) {
		list=new ArrayList<HashSet<String>>();
		
		String[][] relation={{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
		len=relation[0].length;
		
		for (int i = 0; i < relation.length; i++) {
			makeCombinations(-1, i, 0, new HashSet<String>(),relation[i]);
		}
		System.err.println(list);
	}
	
	public static void makeCombinations(int start, int end, int count, HashSet<String> hs, String[] strs) {
		if(count==end) {
			list.add(hs);
			return;
		}
		for(int i=start+1; i<len; i++) {
			HashSet<String> newHs=new HashSet<String>(hs);
			newHs.add(strs[i]);
			makeCombinations(i, end, count+1, newHs, strs);
		}
	}
}
