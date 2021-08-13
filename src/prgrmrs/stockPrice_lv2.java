package prgrmrs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class stockPrice_lv2 {

	public static void main(String[] args) {
		int[] prices= {1, 2, 3, 2, 3};
		int[] res=solution(prices);
		for (int i = 0; i < res.length; i++) {
			System.err.println(res[i]);
		}
		
	}

	//큐 이용
	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		//4, 3, 1, 1, 0
		List<Integer> list=new ArrayList<>();
		Queue<int[]> queue=new LinkedList<>();
		
		int idx=0, i=0;
		for(int p: prices) {
			queue.offer(new int[] {prices[i],i});
			i++;
		}
		while(!queue.isEmpty()||idx<prices.length) {
			for (i = idx; i < prices.length; i++) {
				if(queue.peek()[0]>prices[i]) {
					i++;
					break;
				}
			}
			int[] tmp=queue.poll();
			System.err.println(tmp[0]+","+tmp[1]);
			list.add(--i-tmp[1]);
			idx++;
			System.err.println(list);
		}
		
		
		System.err.println(list);
		for (int j = 0; j < answer.length; j++) {
			answer[j]=list.get(j);
		}
		return answer;
	}
	
//	//반복문만 이용
//	public static int[] solution(int[] prices) {
//		int[] answer = new int[prices.length];
//		//4, 3, 1, 1, 0
//		List<Integer> list=new ArrayList<>();
//		int idx=0,i=0;
//		
//		while(idx<prices.length) {
//			for (i = idx; i < prices.length; i++) {
//				if(prices[idx]>prices[i]) {
//					i++;
//					break;
//				}
//			}
//			System.err.println("i:"+i+",idx:"+idx);
//			list.add(--i -idx);
//			idx++;
//		}
//		
//		System.err.println(list);
//		for (int j = 0; j < answer.length; j++) {
//			answer[j]=list.get(j);
//		}
//		return answer;
//	}
}
