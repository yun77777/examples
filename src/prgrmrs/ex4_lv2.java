package prgrmrs;

import java.util.PriorityQueue;

public class ex4_lv2 {
	
	public static void main(String[] args) {
		int[] scoville= {1, 2, 3, 9, 10, 12};
		System.err.println(solution(scoville, 7));
	}
	//섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
	//우선순위 큐
	public static int solution(int[] scoville, int K) {
		int answer=0;
		PriorityQueue<Integer> heap=new PriorityQueue();
		for(int n:scoville) heap.offer(n);
		System.err.println(heap);
		while(heap.peek()<=K) {
			if(heap.size()==1) return -1;
			int a=heap.poll();
			int b=heap.poll();
			int res=a+(b*2);
			heap.offer(res);
			answer++;
		}
		return answer;
    }
}
