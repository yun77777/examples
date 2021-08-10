package prgrmrs;

import java.util.LinkedList;
import java.util.Queue;

public class ex16_lv2 {

	public static void main(String[] args) {
		int bridge_length=2, weight=10;
		int[] truck_weights= {7,4,5,6};
		System.err.println(solution(bridge_length, weight, truck_weights));
	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		Queue<int[]> queue=new LinkedList<>();
		int idx=0, time=0;
		while(idx<truck_weights.length) {
			if(!queue.isEmpty() && time==queue.peek()[1]) {//트럭이 다리 건넘
				int[] truck=queue.poll();
				weight+=truck[0];//트럭 무게 다시 더함
			}
			
			if(weight>=truck_weights[idx]) {
				queue.add(new int[] {truck_weights[idx],time+bridge_length});//트럭 무게, 경과 시간
				weight-=truck_weights[idx++];//트럭 무게 뺌
			}
			time++;
		}
		return time+bridge_length;//총 경과 시간
	}
}
