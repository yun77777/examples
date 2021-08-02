package review;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
//		System.out.println(reverse(-123));

	}
    public static int reverse(int x) {
//    	if(x>Integer.MAX_VALUE||x<Integer.MIN_VALUE) return 0;
    	System.err.println(Integer.MAX_VALUE);
    	long res=0;
    	while(x!=0) {
    		res=res*10+x%10;
    		x/=10;
    		if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE) return 0;
    	}
    	return (int)res;
    }
}
