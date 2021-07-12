package lc;

import java.io.IOException;

public class ex121 {
	public static void main(String[] args) throws IOException {
		int[] prices= {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
			
	}
	public static int maxProfit(int[] prices) {
		 if (prices.length == 0) {
			 return 0 ;
		 }
		 
		 int max = 0 ;
		 int minSofar = prices[0] ;
	     for (int i = 0 ; i < prices.length ; ++i) {
	    	 if(prices[i]<minSofar)
	    		 minSofar=prices[i];
	    	 if(prices[i]-minSofar>max)
	    		 max=prices[i]-minSofar;
	    	 //max=Math.max(max,prices[i]-minSofar);
	     }	     
	    return  max ;
	 }
//	public static int maxProfit(int[] prices) {
//		if (prices.length == 0) {
//			return 0 ;
//		}
//		
//		int max = 0 ;
//		int sofarMin = prices[0] ;
//		for (int i = 0 ; i < prices.length ; ++i) {
//			if (prices[i] > sofarMin) {
//				max = Math.max(max, prices[i] - sofarMin) ;
//			} else{
//				sofarMin = prices[i]; 
//			}
//		}	     
//		return  max ;
//	}
}
