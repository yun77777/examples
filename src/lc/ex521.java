package lc;

public class ex521 {
    public int findLUSlength(String a, String b) {
    	return a.equals(b) ? -1 : Math.max(a.length(),b.length());
	}
}
