package lc;

import java.io.IOException;

public class ex172 {
	public static void main(String[] args) throws IOException {
		System.out.println(trailingZeroes(30));
	}
    public static int trailingZeroes(int n) {
    	return n>0 ? n/5+trailingZeroes(n/5) : 0;
//    	long facNum=factorial(n);
//    	int cnt=0;
//    	System.err.println("factN:"+facNum);
//    	while(facNum>0) {
//    		if(facNum%10==0)
//    			cnt++;
//    		else
//    			break;
//    		facNum/=10;
//    	}
//    	return cnt;
    }
//    public static long factorial(int n) {
//    	if(n==0) return 0;
//    	return n==1 ? 1 : n*factorial(n-1);
//    }
    
  //5 120 1
	//6 720 1
	//7 5040 1
	//8 40320 1
	//9 362880 1
    
	//10 3628800 2
	//14 50803200 2
    
	//15 762048000 3
    //20 4
    //25 6
    
//	if(n==1) return 1;
//	return n*trailingZeroes(n-1);
}
