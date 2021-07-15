package lc;

import java.io.IOException;

public class ex204 {
	public static void main(String[] args) throws IOException {
		System.err.println(countPrimes(10));
	}

	//에라토스테네스의 체 이용해서 소수 찾기
    public static int countPrimes(int n) {
    	boolean[] notPrime=new boolean[n];
    	int cnt=0;
    	for(int i=2;i<n;i++) {
    		if(!notPrime[i]) {
    			cnt++;
    			for(int j=2;i*j<n;j++)
    				notPrime[i*j]=true;
    		}
    	}
		return cnt;
	}
//    public static int countPrimes(int n) {
//    	if(n<2) return 0;
//    	int cnt=0,i=2;
//    	while(i!=n) {
//    		if(isPrime(i))
//    			cnt++;
//    		i++;
//    	}
//    	System.err.println("cnt:"+cnt);
//    	return cnt;
//    }
//    public static boolean isPrime(int n) {
//    	int i=2;
//    	while(i!=n) {
//    		if(n%i==0) {
//    			return false;
//    		}
//    		i++;
//    	}
//    	return true;
//    }
}
