package lc;

public class ex326 {
	static int[] nums;
	public static void main(String[] args) {
		System.err.println(isPowerOfThree(0));
	}
	
    public static boolean isPowerOfThree(int n) {
    	System.err.println(n);
    	if(n==0) return false;
    	else if(n==1) return true;
    	
    	return n%3==0 ? isPowerOfThree(n/3) : false;
    }
}
