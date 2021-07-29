package lc;

public class ex482 {
	public static void main(String[] args) {
		System.err.println(licenseKeyFormatting("2-5g-3-J",2));
//		System.err.println(licenseKeyFormatting("5F3Z-2e-9-w",4));
	}

    public static String licenseKeyFormatting(String s, int k) {
    	StringBuilder sb=new StringBuilder();
    	for(int i=s.length()-1; i>=0; i--) {
    		if(s.charAt(i)!='-')
    			sb.append(sb.length()%(k+1)==k ? "-" : "").append(s.charAt(i));
    	}
    	System.err.println(sb);
    	return sb.reverse().toString().toUpperCase();
	}
    
}