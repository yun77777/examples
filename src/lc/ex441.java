package lc;

public class ex441 {
	static int[] nums;

	public static void main(String[] args) {
		System.err.println(arrangeCoins(8));
	}
    public static int arrangeCoins(int n) {
    	int i=0;
    	while(n>0) {
    		i++;
    		n-=i;
    	}
    	return n==0 ? i :  i-1;
    }
}
