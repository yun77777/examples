package lc;

public class ex392 {
	static int[] nums;

	public static void main(String[] args) {
		System.err.println(isSubsequence("abc","ahbgdc"));
	}
    public static boolean isSubsequence(String s, String t) {
    	if(s.length()==0) return true;
    	int idxS=0, idxT=0;
    	while(idxT<t.length()) {
    		if(t.charAt(idxT)==s.charAt(idxS)) {
    			idxS++;
    			if(idxS==s.length()) return true;
    		}
    		idxT++;
    	}
    	return false;
    }
}
