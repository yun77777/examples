package prgrmrs;

public class ex3_lv2 {

	public static void main(String[] args) {
		System.err.println(solution("ababcdcdababcdcd"));
	}
	
	//1개 이상 문자 압축 최소 길이-재귀함수
	public static int solution(String s) {
        int min=s.length();
		for(int i=1; i<=s.length()/2; i++) {
			if(s.length()==1) return 1;
	        int cnt=1;
	        String str="";
	        String tmp="";
	        for(int j=0; j<s.length()/i; j++){
	            if(tmp.equals(s.substring(i*j,(i*j)+i))){
	                cnt++;
	                continue;
	            }
	            
	            if(cnt>1){
	                str+=cnt+tmp;
	                cnt=1;
	            } else str+=tmp;
	            tmp=s.substring(i*j,(i*j)+i);
	        }
	        
	        if(cnt>1) str+=cnt+tmp;
	        else str+=tmp;
	        if(s.length()%i!=0) str+=s.substring(s.length()-s.length()%i,s.length());
	        System.err.println("STR:"+str);
	        System.err.println("TMP:"+tmp);
	        min=Math.min(min, str.length());
		}
		return min;
    }

}
