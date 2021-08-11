package review.prgrmrs;

import java.util.Comparator;
import java.util.PriorityQueue;

public class printer_lv2 {

	public static void main(String[] args) {
		int[] priorities= {2, 1, 3, 2};
		System.err.println(solution(priorities, 2));
	}

	public static int solution(int[] priorities, int location) {
		int answer = 1;
		PriorityQueue<Integer> queue=new PriorityQueue<>(Comparator.reverseOrder());
		for(int p: priorities) queue.offer(p);
		System.err.println(queue);
		while(!queue.isEmpty()) {
			for (int i = 0; i < priorities.length; i++) {
				if(queue.peek()==priorities[i]) {
					if(location==i) return answer;
					answer++;
					queue.poll();
				}
			}
		}
		return answer;
	}
}
