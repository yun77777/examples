package prgrmrs;

public class ex3_lv2 {

	public static void main(String[] args) {
		System.err.println(solution("abcabcdede"));
	}
	
	//1개 이상 문자 압축 최소 길이
	public static int solution(String s) {
		StringBuilder sb=new StringBuilder();
		return check(s,sb,0);
    }

	public static int check(String s, StringBuilder sb, int cnt) {
		if(s.length()==1) return 1;
		int count=1;
//		for(int i=1; i<=s.length()/2; i++) {
		for(int i=s.length()/2-1; i>=1; i--) {
			String str="";
			String tmp="";
			count=1;
			for(int j=0; j<s.length()/i; j++) {
				if(tmp.equals(s.substring(j*i,(j*i)+i))) {
					count++;
					continue;
				}
				if(count>1) {
					str+=count+tmp;
					count=1;
				}else str+=tmp;
				
				
				
				tmp=s.substring(j*i,(j*i)+i);
			}
			if(count>1) str+=count+tmp;
			else str+=tmp;
			if(s.length()%i!=0) str+=s.substring(s.length()-s.length()%i,s.length());
			
			System.err.println("STR:"+str);
			System.err.println("TMP:"+tmp);
			if(str.length()<s.length()) return str.length();
		}
		
		return s.length();
	}
	
//	//1개 이상 문자 압축 최소 길이
//	public static int solution(String s) {
//		int answer = 0;
//		//aabbaccc
//		//2a2ba3c
//		//개별 문자 개수+중복 숫자 개수=전체 길이
//		StringBuilder sb=new StringBuilder();
//		
//		List<String> list=new ArrayList<>();
//		for(int i=s.length()/2; i>0; i--) {
//			sb=new StringBuilder();
//			if(check(s, i, sb)) break;
//		}
////        
//		check(s, 3, sb);
////        System.err.println(check("ababcdcdababcdcd", 2, sb));
//		
//		
//		return sb.toString().length();
//	}
//	//ababcdcdababcdcd
//	//abab cdcd abab cdcd
//	
//	//abcabcdede
//	//abc abc dede
//	//2abcdede
//	public static boolean check(String s, int n, StringBuilder sb) {
//		if(s.length()%n!=0) return false;
//		if(s.length()==0) return true;
//		int cnt=1;
//		for(int j=0; j<s.length(); j+=n*cnt) {
//			String str=s.substring(j,j+n);
//			System.err.println("j:"+j);
//			System.err.println("==================================================STR:"+str);
//			cnt=1;
//			for(int i=j+n;i<s.length();i+=n) {
//				String tmp=s.substring(i,i+n);
//				
////				System.err.println("STR:"+str);
//				System.err.println("TMP:"+tmp);
//				
//				if(str.equals(tmp)) {
////					System.err.println("TMP:"+tmp);
//					//				sb.append(n+tmp);
//					cnt++;
//				} else break;
//			}
//			System.err.println("CNT:"+cnt);
//			sb.append(cnt>1?cnt+str:str);
//			System.err.println(sb);
//		}
//		return sb.length()<s.length() ? true : false;
//	}
	
}
