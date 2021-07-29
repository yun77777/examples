package lc;

public class ex507 {
	public static boolean checkPerfectNumber(int num) {
    	if(num==0||num==1) return false;
    	int i=2, sum=1;
    	//1 28
    	
    	//2 14
    	//4 7
    	
    	//1 6
    	//2 3
    	
    	//1 120
    	//2 60
    	//3 20
    	//4 30
    	while(i<num/i) {
    		if(num%i==0)
    			sum+=i+num/i;
    		i++;
    	}
    	System.err.println("sum:"+sum);
    	System.err.println("num:"+num);
    	return sum==num ? true : false;
	}
}
