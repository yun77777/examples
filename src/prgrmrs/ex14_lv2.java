package prgrmrs;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ex14_lv2 {

	public static void main(String[] args) {
		int[] priorities= {2, 1, 3, 2};
		System.err.println(solution(priorities, 2));
	}

	//우선순위 큐
	public static int solution(int[] priorities, int location) {
		int answer = 1;
		PriorityQueue<Integer> queue=new PriorityQueue<>(Comparator.reverseOrder());
		for(int i: priorities) queue.offer(i);
		System.err.println(queue);
		while(!queue.isEmpty()) {
			for (int i = 0; i < priorities.length; i++) {
				if(priorities[i]==queue.peek()) {
					if(location==i) return answer;
					answer++;
					queue.poll();
				}
			}
		}
		return answer;
	}
}
