package lc;

public class ex342 {
	static int[] nums;
	public static void main(String[] args) {
		System.err.println(isPowerOfFour(16));
	}
	
    public static boolean isPowerOfFour(int n) {
    	//100
    	if(n==0) return false;
    	else if(n==1) return true;
    	return n%4==0 ? isPowerOfFour(n>>2) : false;
    }
}
