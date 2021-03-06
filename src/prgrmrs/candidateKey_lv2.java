package prgrmrs;

import java.util.ArrayList;
import java.util.HashSet;

public class candidateKey_lv2 {

	
	public static void main(String[] args) {
		String[][] relation={{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
		System.err.println(solution(relation));
	}
	
	static ArrayList<HashSet<Integer>> candidateKey;
	static String table[][];//복사한 테이블
	static int length;
	static int answer;

	public static int solution(String[][] relation) {
		answer = 0;
        candidateKey = new ArrayList<HashSet<Integer>>();
        table = relation;
		length=relation[0].length;
		//모든 속성 조합 구하기
		//이미 만들어진 후보키 포함하는지 확인
		//반환
		for(int i=0; i<relation.length; i++) {
			makeCombinations(-1, i, 0, new HashSet<Integer>());//-1 : makeCombinations 내 for문 인덱스+1부터 시작
		}
		System.err.println(candidateKey);
		return answer;
	}
	
	//문자열 조합
	//start,end,count,set
	public static void makeCombinations(int start, int end, int count, HashSet<Integer> set) {
		if(count==end) {
			if(!isUnique(set)) return;
			for(HashSet<Integer> key: candidateKey) {
				if(set.containsAll(key))//최소성 확인(포함 여부 확인)
					return;
			}
			answer++;
			candidateKey.add(set);
			return;
		}
		
		for(int i=start+1; i<length; i++) {
			HashSet<Integer> newSet=new HashSet<Integer>(set);
			newSet.add(i);//해당 인덱스 더해 나감
			makeCombinations(i, end, count+1, newSet);
		}
	}
	
	//유일성 판별
	public static boolean isUnique(HashSet<Integer> set) {
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0; i<table.length; i++) {
			String temp="";
			for(int index: set) {
				temp+=table[i][index];
			}
			if(!list.contains(temp))
				list.add(temp);
			else return false;
		}
		return true;
	}
}
//package prgrmrs;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//
//public class candidateKey_lv2 {
//	
//	
//	public static void main(String[] args) {
//		String[][] relation={{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
//		System.err.println(solution(relation));
//	}
//	
//	static ArrayList<HashSet<Integer>> candidateKey;
//	static String table[][];
//	static int length;
//	static int answer;
//	
//	public static int solution(String[][] relation) {
//		answer = 0;
//		candidateKey = new ArrayList<HashSet<Integer>>();
//		table = relation;
//		length=relation[0].length;
//		//모든 속성 조합 구하기
//		//이미 만들어진 후보키 포함하는지 확인
//		//반환
//		for(int i=0; i<relation.length; i++) {
//			makeCombinations(-1, i, 0, new HashSet<Integer>());//-1 : makeCombinations 내 for문 인덱스+1부터 시작
//		}
//		System.err.println(candidateKey);
//		return answer;
//	}
//	
//	//문자열 조합
//	//start,end,count,set
//	public static void makeCombinations(int start, int end, int count, HashSet<Integer> set) {
//		if(count==end) {
//			if(!isUnique(set)) return;
//			for(HashSet<Integer> key: candidateKey) {
//				if(set.containsAll(key))//최소성 확인(포함 여부 확인)
//					return;
//			}
//			answer++;
//			candidateKey.add(set);
//			return;
//		}
//		
//		for(int i=start+1; i<length; i++) {
//			HashSet<Integer> newSet=new HashSet<Integer>(set);
//			newSet.add(i);//해당 인덱스 더해 나감
//			makeCombinations(i, end, count+1, newSet);
//		}
//	}
//	
//	//유일성 판별
//	public static boolean isUnique(HashSet<Integer> set) {
//		ArrayList<String> list=new ArrayList<String>();
//		for(int i=0; i<table.length; i++) {
//			String temp="";
//			for(int index: set) {
//				temp+=table[i][index];
//			}
//			if(!list.contains(temp))
//				list.add(temp);
//			else return false;
//		}
//		return true;
//	}
//}