package review.prgrmrs;

import java.util.ArrayList;
import java.util.HashSet;

public class candidateKey_lv2 {

	
	public static void main(String[] args) {
		String[][] relation={{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
		System.err.println(solution(relation));
	}
	
	static ArrayList<HashSet<Integer>> candidateKey;
	static int length;
	static int answer;
	public static int solution(String[][] relation) {
		answer = 0;
        candidateKey = new ArrayList<HashSet<Integer>>();
		length=relation[0].length;
		for(int i=0; i<relation.length; i++) {
			makeCombinations(relation, -1, i, 0, new HashSet<Integer>());
		}
		System.err.println(candidateKey);
		return answer;
	}
	
	public static void makeCombinations(String[][] relation, int start, int end, int count, HashSet<Integer> set) {
		if(count==end) {
			if(!isUnique(relation, set)) return;
			for(HashSet<Integer> key: candidateKey) {
				if(set.containsAll(key))
					return;
			}
			answer++;
			candidateKey.add(set);
			return;
		}
		
		for(int i=start+1; i<length; i++) {
			HashSet<Integer> newSet=new HashSet<Integer>(set);
			newSet.add(i);
			makeCombinations(relation, i, end, count+1, newSet);
		}
	}
	
	public static boolean isUnique(String[][] relation, HashSet<Integer> set) {
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0; i<relation.length; i++) {
			String temp="";
			for(int index: set) {
				temp+=relation[i][index];
			}
			if(!list.contains(temp))
				list.add(temp);
			else return false;
		}
		return true;
	}
}