package lc;

import java.util.Scanner;

public class ex69 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(climbStairs(x));
	}
	
	
	public static int climbStairs(int n) {
		int a=1,b=2,c=0;
		if(n<=0) return 0;
		if(n==1) return 1;
		if(n==2) return 2;
		for (int i = 2; i < n; i++) {
			c=a+b;
			a=b;
			b=c;
		}
		return c;
    }
}