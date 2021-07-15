package lc;

import java.io.IOException;

public class ex202 {
	public static void main(String[] args) throws IOException {
		System.out.println(isHappy(19));
		//4
		//16
		//1+36=37
		//9+49=58
		//25+64=89
		//64+81=145
		//1+16+25=42
		//16+4=20
		
		
		//
		//49->16+81
		//97->81+49
		//130->1+9=10
		//10->1
		
		//64
		//36+16=52
		//25+4=29
		//4+81=85
		//16+25=41
		//16+1=17
		//1+49=50
		//25
		//4+25=29
	}
    public static boolean isHappy(int n) {
    	if(n==0) return false;
    	int num=0;
    	while(n!=num) {
    		if(n>0) {
    			num+=Math.pow(n%10,2);
				n/=10;
    		} else {
    			System.err.println("num:"+num);
    			if(num==1) return true;
    			n=num;
    			num=0;
    		}
    		
    	}
    	return false;
    }
}
