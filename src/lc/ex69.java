package lc;

import java.util.Scanner;

public class ex69 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(mySqrt(x));
	}
	
	//x=4
	//x=8
	//1-8
	//4-8
	//9-8
	
	
	public static int mySqrt(int x) {
		if(x==0) return 0;
		int left=1, right=x;
		while(true) {
			int mid=left+(right-left)/2;
			if(mid>x/mid)
				right=mid-1;
			else {
				if(mid+1>x/(mid+1))
					return mid;
				left=mid+1;
			}
		}
		
		
//		int min=x,idx=0;
//		for (int i = 0;i<x; i++) {
//			System.err.println(i+"th i*i-1"+(i*i-x)*(i*i-x));
//			if((i*i-x)*(i*i-x)<min) {
//				min=(i*i-x)*(i*i-x);
//				idx=i;
//			}
//			if(i*i-x==0)
//				return i;
//			
//		}
//		return idx;
    }
}