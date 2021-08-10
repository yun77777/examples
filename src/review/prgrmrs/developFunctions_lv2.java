package review.prgrmrs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class developFunctions_lv2 {

	public static void main(String[] args) {
//		int[] progresses = { 95, 90, 99, 99, 80, 99 }, speeds = { 10, 10, 10, 10, 10, 1 };
		int[] progresses = { 95, 90, 99, 99, 80, 99 }, speeds = { 1, 1, 1, 1, 1, 1 };
//		int[] progresses = { 93, 30, 55 }, speeds = { 1, 30, 5 };
		int[] ans=solution(progresses, speeds);
		for (int i = 0; i < ans.length; i++) {
			System.err.println(ans[i]);
		}
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		List<Integer> list=new ArrayList<>();
		Queue<Integer> queue = new LinkedList<Integer>();
		int[] res=new int[progresses.length];
		for(int i=0;i<progresses.length;i++) res[i]=progresses[i];
		int cnt=0, idx=0;
		
		for (int p : progresses) queue.add(p);
		while(!queue.isEmpty()) {
			cnt=0;
			for (int i = 0; i < progresses.length; i++) {
				if(res[i]>=100) {
					res[i]=100;
//					cnt++;
//					if(queue.peek()==progresses[i]) {//중복일 경우 오류 발생 가능(중복값 순서 구분 못함)
//						int n=queue.poll();
//						cnt++;
//					}
				}
				System.err.println(i+": "+res[i]);
				res[i]+=speeds[i];
			}
			while(idx<res.length && res[idx]>=100) {
				queue.poll();
				idx++;
				cnt++;
			}
			if(cnt>0) list.add(cnt);
		}
		
		
		System.err.println(list);
		int[] ans=new int[list.size()];
		for(int i=0; i<list.size(); i++) ans[i]=list.get(i);
		
		return ans;
	}
}
