package lc;

public class ex29 {

	public static void main(String[] args) {
//		System.err.println(divide(15, 3));
//		System.err.println(divide(0, 0));
		System.err.println(divide(7, -3));
//		System.err.println(divide(-1, -1));
//		System.err.println(divide(10, 3));
	}
	//divide two integers without using multiplication, division, and mod operator.
	// *, / , % (X) 
    public static int divide(int dividend, int divisor) {
    	if(dividend== 1<<31 && divisor==-1) return (1<<31)-1;
    	int a=Math.abs(dividend), b=Math.abs(divisor), res=0, x=0;
    	
//    	System.err.println(2<<1<<2);
//    	System.err.println(3<<2<<2);
//    	System.err.println(2<<1);
//    	System.err.println(1<<2);
    	
    	while(a-b>=0) {
    		//it needs to be checked at least once(b<<x<<1)
    		for(x=0;a-(b<<x<<1)>=0;x++);
    		res+=1<<x;
    		a-=b<<x;
    	}
    	return (dividend>0)==(divisor>0)?res:-res;
    }

}
