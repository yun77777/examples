package review.prgrmrs;

import java.util.PriorityQueue;

public class moreSpicy_lv2 {

	public static void main(String[] args) {
		int[] scoville= {1, 2, 3, 9, 10, 12};
		int K=7;
		System.err.println(solution(scoville, K));
	}
	
	//섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
	//섞어야 하는 최소 횟수
	public static int solution(int[] scoville, int K) {
		int cnt=0;
		PriorityQueue<Integer> heap=new PriorityQueue<Integer>();
		for(int s:scoville) heap.offer(s);
		while(heap.peek()<K) {
			if(heap.size()==1) return -1;
			int a=heap.poll();
			int b=heap.poll();
			int c=a+(b*2);
			heap.offer(c);
			cnt++;
		}
		return cnt;
	}
}
