package lc;

public class ex476 {
	public static void main(String[] args) {
		System.err.println(findComplement(5));
	}

    public static int findComplement(int num) {
    	int i=0, j=0;
    	//100110
    	//011001
    	//111111
    	while(i<num) {
    		i+=Math.pow(2, j++);
    	}
    	return i-num;
	}
    
//    public static int findComplement(int num) {
//    	return ~num & (Integer.highestOneBit(num)-1);
//    }
}