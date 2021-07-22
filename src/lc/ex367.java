package lc;

public class ex367 {
	static int[] nums;

	public static void main(String[] args) {
		System.err.println(isPerfectSquare(16));
	}
	
    public static boolean isPerfectSquare(int num) {
		if(num==1) return true;
		for (int i = 0; i < num; i++) {
			if(i*i==num)
				return true;
		}
		return false;
	}
}
