package prgrmrs.difficult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ex10_lv2 {

	public static void main(String[] args) {
		String[] orders= {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course= {2,3,4};
		String[] sol=solution(orders, course);
		for (int i = 0; i < sol.length; i++) {
			System.err.println(sol[i]);
		}
	}
	
	static HashMap<String, Integer> map;
	
	//조합 combination
	public static String[] solution(String[] orders, int[] course) {
		map=new HashMap<>();
		for(String o:orders) {
			char[] order=o.toCharArray();
			Arrays.sort(order);
			for(int i=0; i<course.length; i++) combination(0,0,course[i],order,"");
		}
		int[] max=new int[course[course.length-1]+1];
		for(String key: map.keySet()) {
			if(map.get(key)>=2)
				max[key.length()]=Math.max(map.get(key),max[key.length()]);
		}
		List<String> answerTemp=new ArrayList<String>();
		for(String key: map.keySet()) {
			for(int i=0; i<max.length; i++) {
				if(max[i]==0) continue;
				if(key.length()==i && map.get(key)==max[i]){
					answerTemp.add(key);
				}
			}
		}
		Collections.sort(answerTemp);
		String[] res=new String[answerTemp.size()];
		int i=0;
		for(String str: answerTemp) res[i++]=str;
		
		return res;
	}
	
	public static void combination(int cnt,int start, int limit, char[] order, String res) {
		if(cnt==limit) {
			map.put(res, map.getOrDefault(res,0)+1);//메뉴 중복 시 개수 증가
			return;
		}
		for(int i=start; i<order.length; i++) {
			combination(cnt+1,i+1,limit,order,res+order[i]);
		}
	}
	
}
