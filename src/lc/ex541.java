package lc;

public class ex541 {
	public static String reverseStr(String s, int k) {
		int len = s.length(), i = 0;
		StringBuilder sb = new StringBuilder();
		while (i < s.length()) {
			if (len < 2) {
				sb.append(s.charAt(i));
				break;
			}
			if(k<len) {
				sb.append(""+s.charAt(i)+s.charAt(i+1));
    		}
    		else {
    			sb.append(""+s.charAt(i+1)+s.charAt(i));
//    			sb.append(s.charAt(i+1));
//    			sb.append(s.charAt(i));
    		}
			i += len >= 2 ? 2 : len % 2;
			len -= len >= 2 ? 2 : len % 2;

		}
		return sb.toString();
	}
}
