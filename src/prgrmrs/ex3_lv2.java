package prgrmrs;

import java.util.ArrayList;
import java.util.List;

public class ex3_lv2 {

	public static void main(String[] args) {
		System.err.println(solution("abcabcdede"));
	}
	
	//1개 이상 문자 압축 최소 길이
	public static int solution(String s) {
        int answer = 0;
        //aabbaccc
        //2a2ba3c
        //개별 문자 개수+중복 숫자 개수=전체 길이
        StringBuilder sb=new StringBuilder();
        
        List<String> list=new ArrayList<>();
        for(int i=s.length()/2; i>0; i--) {
        	sb=new StringBuilder();
        	if(check(s, i, sb)) break;
        }
//        
        check(s, 3, sb);
//        System.err.println(check("ababcdcdababcdcd", 2, sb));
        
        
        return sb.toString().length();
    }
	//ababcdcdababcdcd
	//abab cdcd abab cdcd
	
	//abcabcdede
	//abc abc dede
	//2abcdede
	public static boolean check(String s, int n, StringBuilder sb) {
		if(s.length()%n!=0) return false;
		if(s.length()==0) return true;
		int cnt=1;
		for(int j=0; j<s.length(); j+=n*cnt) {
			String str=s.substring(j,j+n);
			System.err.println("j:"+j);
			System.err.println("==================================================STR:"+str);
			cnt=1;
			for(int i=j+n;i<s.length();i+=n) {
				String tmp=s.substring(i,i+n);
				
//				System.err.println("STR:"+str);
				System.err.println("TMP:"+tmp);
				
				if(str.equals(tmp)) {
//					System.err.println("TMP:"+tmp);
	//				sb.append(n+tmp);
					cnt++;
				} else break;
			}
			System.err.println("CNT:"+cnt);
			sb.append(cnt>1?cnt+str:str);
			System.err.println(sb);
		}
		return sb.length()<s.length() ? true : false;
	}
	
}
