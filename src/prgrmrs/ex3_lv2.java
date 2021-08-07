package prgrmrs;

public class ex3_lv2 {

	public static void main(String[] args) {
		System.err.println(solution("abcabcdede"));
	}
	
	//1개 이상 문자 압축 최소 길이-재귀함수
	public static int solution(String s) {
		return check(s, s.length()/2-1);
    }

	public static int check(String s, int n) {
		if(s.length()==1) return 1;
		
		int count=1;
		String str="";
		String tmp="";
		
		for(int j=0; j<s.length()/n; j++) {
			if(tmp.equals(s.substring(j*n,(j*n)+n))) {
				count++;
				continue;
			}
			if(count>1) {
				str+=count+tmp;
				count=1;
			}else str+=tmp;
			
			tmp=s.substring(j*n,(j*n)+n);
		}
		if(count>1) str+=count+tmp;
		else str+=tmp;
		if(s.length()%n!=0) str+=s.substring(s.length()-s.length()%n,s.length());
		
		System.err.println("STR:"+str);
		System.err.println("TMP:"+tmp);
		
		if(str.length()<s.length()) return str.length();
		return check(s, n-1);
	}
	//1개 이상 문자 압축 최소 길이-반복문
//	public static int check(String s, StringBuilder sb, int cnt) {
//		if(s.length()==1) return 1;
//		int count=1;
////		for(int i=1; i<=s.length()/2; i++) {
//		for(int i=s.length()/2-1; i>=1; i--) {
//			String str="";
//			String tmp="";
//			count=1;
//			for(int j=0; j<s.length()/i; j++) {
//				if(tmp.equals(s.substring(j*i,(j*i)+i))) {
//					count++;
//					continue;
//				}
//				if(count>1) {
//					str+=count+tmp;
//					count=1;
//				}else str+=tmp;
//				
//				tmp=s.substring(j*i,(j*i)+i);
//			}
//			if(count>1) str+=count+tmp;
//			else str+=tmp;
//			if(s.length()%i!=0) str+=s.substring(s.length()-s.length()%i,s.length());
//			
//			System.err.println("STR:"+str);
//			System.err.println("TMP:"+tmp);
//			if(str.length()<s.length()) return str.length();
//		}
//		
//		return s.length();
//	}
}
