package prgrmrs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class newsClustering_lv {

	public static void main(String[] args) {
//		System.err.println(solution("aa1+aa2", "AAAA12"));
//		System.err.println(solution("handshake", "shake hands"));
		System.err.println(solution("FRANCE", "french"));
	}
	
	public static int solution(String str1, String str2) {
		System.err.println((int)'A'+","+(int)'a');
		str1=str1.toUpperCase();
		str2=str2.toUpperCase();
//		if(str1.equals(str2)) return 65536;
		List<String> hs1=similiarity(str1);
		List<String> hs2=similiarity(str2);
		System.err.println("hs1:"+hs1);
		System.err.println("hs2:"+hs2);
		List<String> union=new ArrayList<>();//합집합
		List<String> intersection=new ArrayList<>();//교집합
		
		System.err.println(intersection);
		
		Collections.sort(hs1);
		Collections.sort(hs2);
		
		for(String str:hs1) {
			if(hs2.remove(str))
				intersection.add(str);
			union.add(str);
		}
		for(String str:hs2) {
			union.add(str);
		}
		System.err.println("union:"+union);
		System.err.println("intersection:"+intersection);
		int uni=union.size();
		int inter=intersection.size();
		System.err.println(inter+"/"+uni);
		System.err.println((int)((float)inter/uni*65536));
		
		//'A'~'z'
//		for(int i=1; i<str1.length(); i++) {
//			//해당 문자 쌍이 영문 대소문자 아니면 해당 문자열 버림(저장 안함)
//			if(str1.charAt(i-1)<'A'||str1.charAt(i-1)>'z'||str1.charAt(i)<'A'||str1.charAt(i)>'z')
//				continue;
//			hs.add(str1.substring(i-1,i+1));
//		}
//		System.err.println(hs);
		
		System.err.println(hs1);
		System.err.println(hs2);
		if(uni==0) return 65536;
		return (int)((float)inter/uni*65536);
	}
	
	public static List<String> similiarity(String str) {
		List<String> hs=new ArrayList<>();
		for(int i=1; i<str.length(); i++) {
			//해당 문자 쌍이 영문 대소문자 아니면 해당 문자열 버림(저장 안함)
//			if(str.charAt(i-1)<'A'||str.charAt(i-1)>'z')
			if(str.charAt(i-1)<'A'||str.charAt(i-1)>'Z'||str.charAt(i)<'A'||str.charAt(i)>'Z')
				continue;
			hs.add(str.substring(i-1,i+1));
		}
		return hs;
	}
}
//package prgrmrs;
//
//import java.util.HashSet;
//
//public class newsClustering_lv {
//	
//	public static void main(String[] args) {
//		System.err.println(solution("aa1+aa2", "AAAA12"));
////		System.err.println(solution("handshake", "shake hands"));
////		System.err.println(solution("FRANCE", "french"));
//	}
//	
//	public static int solution(String str1, String str2) {
//		System.err.println((int)'A'+","+(int)'a');
//		str1=str1.toUpperCase();
//		str2=str2.toUpperCase();
//		if(str1.equals(str2)) return 65536;
//		HashSet<String> hs1=similiarity(str1);
//		HashSet<String> hs2=similiarity(str2);
//		System.err.println("hs1:"+hs1);
//		System.err.println("hs2:"+hs2);
//		HashSet<String> union=new HashSet<>(hs1);//합집합
//		HashSet<String> intersection=new HashSet<>();//교집합
//		union.addAll(hs2);
//		System.err.println("union:"+union);
//		System.err.println("intersection:"+intersection);
//		
//		for(String str:hs1) {
//			if(hs2.contains(str))
//				intersection.add(str);
//		}
//		System.err.println(intersection);
//		
//		int uni=union.size();
//		int inter=intersection.size();
//		System.err.println(inter+"/"+uni);
//		System.err.println((int)((float)inter/uni*65536));
//		
//		//'A'~'z'
////		for(int i=1; i<str1.length(); i++) {
////			//해당 문자 쌍이 영문 대소문자 아니면 해당 문자열 버림(저장 안함)
////			if(str1.charAt(i-1)<'A'||str1.charAt(i-1)>'z'||str1.charAt(i)<'A'||str1.charAt(i)>'z')
////				continue;
////			hs.add(str1.substring(i-1,i+1));
////		}
////		System.err.println(hs);
//		
//		System.err.println(hs1);
//		System.err.println(hs2);
//		
//		return (int)((float)inter/uni*65536);
//	}
//	
//	public static HashSet<String> similiarity(String str) {
//		HashSet<String> hs=new HashSet<>();
//		for(int i=1; i<str.length(); i++) {
//			//해당 문자 쌍이 영문 대소문자 아니면 해당 문자열 버림(저장 안함)
////			if(str.charAt(i-1)<'A'||str.charAt(i-1)>'z')
//			if(str.charAt(i-1)<'A'||str.charAt(i-1)>'z'||str.charAt(i)<'A'||str.charAt(i)>'z')
//				continue;
//			hs.add(str.substring(i-1,i+1));
//		}
//		return hs;
//	}
//}
