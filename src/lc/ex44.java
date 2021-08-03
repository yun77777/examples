package lc;

public class ex44 {

	public static void main(String[] args) {
//		System.err.println(isMatch("aa", "a"));
		System.err.println(isMatch("adceb", "*a*b"));
	}
    public static boolean isMatch(String s, String p) {
    	int j=p.length()-1;
    	for(int i=s.length()-1;i>=0;i--) {
    		if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?') {
    			j--;
    		}else if(p.charAt(j)=='*') {
    			
    		}
    	}
    	return true;
    }
    
//    public static boolean isMatch(String s, String p) {
//    	//DP
//    	boolean[][] match=new boolean[s.length()+1][p.length()+1];
//    	match[s.length()][p.length()]=true;
//    	for(int i=p.length()-1;i>=0;i--) {
//    		if(p.charAt(i)!='*')break;
//    		else match[s.length()][i]=true;
//    	}
//    	for(int i=s.length()-1;i>=0;i--) {
//    		for(int j=p.length()-1;j>=0;j--) {
//    			if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?')
//    				match[i][j]=match[i+1][j+1];
//    			else if(p.charAt(j)=='*')
//    				match[i][j]=match[i+1][j+1]||match[i][j+1];
//    			else
//    				match[i][j]=false;
//    		}
//    	}
//    	return match[0][0];
//    }
}
