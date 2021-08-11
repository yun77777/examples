package review.prgrmrs;

public class compressString_lv2 {

	public static void main(String[] args) {
		System.err.println(solution("aabbaccc"));
	}
	public static int solution(String s) {
        int answer = 0;
        int min=s.length();
        for(int i=1; i<=s.length()/2; i++) {//문자열 인덱스
        	String str="";
        	String tmp="";
        	int cnt=1;
        	for(int j=0; j<s.length()/i; j++) {//문자열 쪼갤 크기
        		tmp=s.substring(i*j,(i*j)+i);
        		if(str.equals(tmp)) {
        			cnt++;
        			continue;
        		}
        		if(cnt>1) {
        			str+=cnt+tmp;
        			cnt=1;
        		}
        		else str+=tmp;
        		System.err.println(str);
        		
        		System.err.println(cnt);
        	}
        	if(cnt>1) str+=cnt+tmp;
        	else str+=tmp;
        	if(s.length()%i!=0) str+=s.substring(s.length()-s.length()%i,s.length());
        	min=Math.min(min, s.length());
        }
        
        return min;
    }
}
