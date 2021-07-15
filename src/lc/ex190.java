package lc;

import java.io.IOException;

public class ex190 {
	public static void main(String[] args) throws IOException {
		System.out.println(hammingWeight(5));
	}
    public static int hammingWeight(int n) {
    	if(n==0) return 0;
    	int cnt=0;
    	for(int i=0;i<32;i++) {
    		System.err.println("n:"+n+" n&1:"+(n&1));
    		if((n&1)==1) cnt++;
    		n>>=1;
    	}
    	return cnt;
        
    }
}
