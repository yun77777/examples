package lc;

public class ex461 {
	public static void main(String[] args) {
		System.err.println(hammingDistance(93,73));
	}

    public static int hammingDistance(int x, int y) {
    	int d=0;
    	int bitXor=x^y;
    	while(bitXor>0) {
    		if(bitXor%2==1)
    			d++;
    		bitXor>>=1;
    	}
    	return d;
    	
    	//64 16 8 4 1
    	//64 8 1
    	//1 0 1 1 1 0 1
    	//1 0 0 1 0 0 1
    	//0 0 1 0 1 0 0
    	
	}
}