package review.prgrmrs;

import java.util.LinkedList;
import java.util.Queue;

public class trucksPassingByBridge_lv2 {

	public static void main(String[] args) {
		int[] truck_weights= {7,4,5,6};
		System.err.println(solution(2, 10, truck_weights));
	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int time=0, idx=0;
		Queue<int[]> queue=new LinkedList<>();
		while(idx<truck_weights.length) {
			if(!queue.isEmpty() && time==queue.peek()[1]) {
				int[] truck=queue.poll();
				weight+=truck[0];//무게 다시 더함(연산 반복하기 위해 원래 무게로 복원)
			}
			if(weight>=truck_weights[idx]) {
				queue.offer(new int[] {truck_weights[idx],time+bridge_length});//트럭무게, 다리 지났을 때 시간
				weight-=truck_weights[idx++];
			}
			time++;
		}
		return time+bridge_length;
	}

}
