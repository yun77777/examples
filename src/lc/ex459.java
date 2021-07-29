package lc;

public class ex459 {
	public static void main(String[] args) {
		System.err.println(repeatedSubstringPattern("abcabcabcabc"));
	}

    public static boolean repeatedSubstringPattern(String s) {
    	int l=s.length();
    	for(int i=l/2; i>=1; i--) {
    		int m=l/i;
    		String subStr=s.substring(0,i);
    		StringBuilder sb=new StringBuilder();
    		m=l/i;
    		subStr=s.substring(0,i);
    		for(int j=0; j<m; j++) {
    			sb.append(subStr);
    		}
    		if(sb.toString().equals(s)) return true;
    	}
    	return false;
	}
    
//    public static boolean repeatedSubstringPattern(String s) {
//    	int len=s.length(),i=1;
//    	StringBuffer sb=new StringBuffer();
//    	sb.append(s.charAt(0));
////    	StringBuilder ss=new StringBuilder();
//    	while(i<s.length()) {
//    		sb.append(s.charAt(i++));
//    		System.err.println("sb:"+sb);
//    		System.err.println("s.contains(sb):"+s.contains(sb));
//    		if(s.contains(sb))
//    			break;
//    		
//    	}
//    	if(s.length()%sb.length()!=0)
//    		return false;
//    	System.err.println("@@");
//    	i=sb.length();
//    	while(i<s.length()) {
//    		System.err.println(s.substring(i, i+sb.length()));
//    		if(!sb.toString().equals(s.substring(i, i+sb.length())))
//    			return false;
//    		i+=sb.length();
//    	}
//    	System.err.println("@@");
//    	System.err.println(sb);
//    	System.err.println(sb.toString());
//    	
//    	return (s.contains(sb));
//    }
}