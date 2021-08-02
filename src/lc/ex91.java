package lc;

public class ex91 {
	public static void main(String[] args) {
		System.err.println(numDecodings("11106"));
	}
	
    public static int numDecodings(String s) {
    	return s.length()==0?0:numDecodings(s,0);
    }
    public static int numDecodings(String s, int p) {
    	int n=s.length();
    	if(p==n) return 1;
    	if(s.charAt(p)=='0') return 0;
    	int res=numDecodings(s,p+1);
    	if(p<n-1&&(s.charAt(p)=='1'||s.charAt(p)=='2'&&s.charAt(p+1)<'7')) res+=numDecodings(s,p+2);
    	return res;
    }
}
