package review.prgrmrs;

import java.util.HashMap;
import java.util.Map;

public class camouflage_lv2 {

	public static void main(String[] args) {
		String[][] clothes= {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.err.println(solution(clothes));
	}

	public static int solution(String[][] clothes) {
		int answer = 1;
		Map<String, Integer> map=new HashMap<>(); //map(종류, 수);
		for (int i = 0; i < clothes.length; i++)
			map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
		System.err.println(map);
		
		for(int val: map.values()) answer*=(val+1);//안입는 경우+1
		return answer-1;//하나도 안입는 경우 제외(-1)
	}
}
