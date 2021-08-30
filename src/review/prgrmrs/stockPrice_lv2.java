package review.prgrmrs;

import java.util.ArrayList;
import java.util.List;

public class stockPrice_lv2 {

	public static void main(String[] args) {
		int res[]=solution(new int[] {1,2,3,2,3});
		for (int i = 0; i < res.length; i++) {
			System.err.println(res[i]);
		}
	}
	
	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		//4, 3, 1, 1, 0
		List<Integer> list=new ArrayList<>();
		int idx=0,i=0;
		
		while(idx<prices.length) {
			for (i = idx; i < prices.length; i++) {
				if(prices[idx]>prices[i]) {
					i++;
					break;
				}
			}
			list.add(--i -idx);
			idx++;
		}
		
		for (int j = 0; j < answer.length; j++) {
			answer[j]=list.get(j);
		}
		return answer;
	}

}
