package lc;

import java.util.HashMap;
import java.util.Map;

public class ex5 {
	public static void main(String[] args) {
		System.err.println(longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
	}
	
    public static String longestPalindrome(String s) {
    	int n=s.length();
    	String res=null;
    	boolean[][] dp=new boolean[n][n];
    	for(int i=n-1;i>=0;i--) {
    		for(int j=i;j<n;j++) {
    			dp[i][j]=s.charAt(i)==s.charAt(j)&&(j-i<3||dp[i+1][j-1]);
    			if(dp[i][j]&&(res==null||j-i+1>res.length())) {
    				res=s.substring(i,j+1);
    			}
    		}
    	}
    	return res;
    }
    
//    public static String longestPalindrome(String s) {
//    	if(s.length()==0) return null;
//    	int max=0;
//    	StringBuilder sb=new StringBuilder();
//    	Map<Integer,String> map=new HashMap<>();
//    	
//    	for (int i = 0; i < s.length(); i++) {
//    		for (int j = i; j < s.length(); j++) {
//    			sb.append(s.charAt(j));
//    			System.err.println("SB:"+sb+",palin:"+isPalindrome(sb.toString()));
//    			if(isPalindrome(sb.toString())) {
//    				if(sb.toString().length()>max) {
//    					max=sb.toString().length();
//    					map.put(max,sb.toString());
//    				}
//    			}
//    		}
//    		sb.delete(0, sb.length()-1);
//    	}
//    	return map.get(max);
//    }
//    private static boolean isPalindrome(String s) {
//    	if(s==null) return true;
//    	int m=(s.length()-1)/2,i=0,j=s.length()-1;
//    	while(i<=m) {
//    		if(s.charAt(i++)!=s.charAt(j--)) return false;
//    	}
//    	return true;
//    }
}
