package prgrmrs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ex7_lv2 {

	public static void main(String[] args) {
		int[] progresses = { 95, 90, 99, 99, 80, 99 };
		int[] speeds = { 1, 1, 1, 1, 1, 1 };
		System.err.println(solution(progresses, speeds));
	}

//[1, 3, 2]
	public static int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> queue=new LinkedList<Integer>();
		List<Integer> list=new ArrayList<Integer>();
		boolean[] bool=new boolean[progresses.length];
		int cnt=0;
		int order=0;
		for(int p: progresses) queue.offer(p);
		while(!queue.isEmpty()||order<progresses.length) {
			cnt=0;
			for (int i = 0; i < progresses.length; i++) {
				if(bool[i]) continue;
				progresses[i]+=speeds[i];
				if(progresses[i]>=100) {
					progresses[i]=100;
//					if(order>progresses.length) continue;
					while(order<progresses.length&&progresses[order]>=100) {
						order++;
						cnt++;
						queue.poll();
					}
				}
				System.err.println("progresses:"+progresses[i]);
			}
			System.err.println("CNT:"+cnt);
			if(cnt>0)
				list.add(cnt);
			System.err.println("List:"+list);
		}
		System.err.println(list);
		
		int[] answer=new int[list.size()];
		int idx=0;
		for(int n:list) answer[idx++]=n;
		for (int ii = 0; ii < answer.length; ii++) {
			System.err.println(answer[ii]);
		}
		return answer;
	}
}
