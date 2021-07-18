package lc;

public class ex231 {
	public void main(String[] args) {
		System.err.println(isPowerOfTwo(16));
	}

    public boolean isPowerOfTwo(int n) {
    	int i=0;
    	while(Math.pow(2, i)<=n) {
    		if(Math.pow(2, i)==n)
    			return true;
    		i++;
    	}
		return false;
	}
}
