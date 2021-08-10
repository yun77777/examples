package prgrmrs;

import java.util.HashMap;
import java.util.Map;

public class ex15_lv2 {

	public static void main(String[] args) {
		String[][] clothes= {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.err.println(solution(clothes));
	}

	public static int solution(String[][] clothes) {
		int answer = 1;
		Map<String, Integer> map=new HashMap<>();
		for (int i = 0; i < clothes.length; i++) {
			map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);// map(종류,종류 개수)
		}
//		System.err.println(map.values());
		for(int val:map.values()) {
			answer*=(val+1);//착용하지 않을 경우: 1
		}
		return answer-1;//최소한 한 가지는 착용해야하므로 모두 착용 안할 경우 제외
	}
}
