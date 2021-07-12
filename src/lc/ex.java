package lc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex {
	public static void main(String[] args) throws IOException {
		//선언
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//파일에서 입력받을 경우에는 new BufferedReader(new FileReader("ex.java"));
		//라인단위로 입력받기(Enter를 경계로)
		String str = bf.readLine();
		//정수형 입력이라면, 형변환 필수!
		int i = Integer.parseInt(bf.readLine());
		//Space를 경계로 끊어야 할 때
		String arr[] = str.split(" ");
		//또는 StringTokenizer 클래스 이용)
		int[] prices= {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
			
	}
	public static int maxProfit(int[] prices) {
		 if (prices.length == 0) {
			 return 0 ;
		 }		
		 int max = 0 ;
		 int sofarMin = prices[0] ;
	     for (int i = 0 ; i < prices.length ; ++i) {
	    	 if (prices[i] > sofarMin) {
	    		 max = Math.max(max, prices[i] - sofarMin) ;
	    	 } else{
	    		sofarMin = prices[i]; 
	    	 }
	     }	     
	    return  max ;
	 }
}
