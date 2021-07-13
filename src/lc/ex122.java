package lc;

import java.io.IOException;

public class ex122 {
	public static void main(String[] args) throws IOException {
		int[] prices= {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
			
	}
	public static int maxProfit(int[] prices) {
		int buy = prices[0], sell = prices[0], profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i-1]) {
                profit += sell - buy;
                buy = prices[i];
            }
            sell = prices[i];
        }
        return profit + sell - buy;
	 }
}
