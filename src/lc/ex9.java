package lc;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(isPalindrome(x));

	}
	public static boolean isPalindrome(int x) {
        boolean result=false;
        if(x<0||(x!=0 && x%10==0)) return false;
        int rev=0;
        while(x>rev) {
        	rev=rev*10+x%10;
        	x=x/10;
        }
        return (x==rev||x==rev/10);
    }
}

//121
//12>1
//1<12