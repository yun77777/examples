package prgrmrs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class tuple_lv2 {

	public static void main(String[] args) {
		int[] res=solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
//		int[] res=solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
		for (int i = 0; i < res.length; i++) {
			System.err.println(res[i]);
		}
	}
	//way1) 문자열 내 가장 긴 {} 찾아서 숫자만 꺼내서 배열에 담음 -x
	//way2) 숫자인지 판별 후 숫자만 Set에 담음(한글자씩 담으면 안됨) -x
	//way3) HashMap map(숫자, 중복 횟수) 내림차순
	//way4) { } 공백문자로 대체
	public static int[] solution(String s) {
		List<Integer> list=new ArrayList<Integer>();
		Map<String,Integer> map=new HashMap<String, Integer>();
		int startIdx=0,endIdx=0;
		s=s.replace('{', ' ');
		s=s.replace('}', ' ');
		s=s.trim();
		System.err.println(s);
		String[] strs=s.split(",");
//		Arrays.sort(strs);
		
		
		
		
		int tmp=Integer.parseInt(strs[0].trim());
		list.add(tmp);
		for (int i = 0; i < strs.length; i++) {
			
//			if(list.contains(Integer.parseInt(strs[i].trim()))) continue;
			map.put(strs[i].trim(),map.getOrDefault(strs[i].trim(), 0)+1);
//			if(tmp==Integer.parseInt(strs[i].trim()) || list.contains(strs[i].trim())) continue;
			System.err.println(tmp);
			tmp=Integer.parseInt(strs[i].trim());
			list.add(tmp);
			
		}
		System.err.println("MMMMMMMMMMMMMMMMM");
		for(int n:map.values()) System.err.println(n);
		System.err.println("MMMMMMMMMMMMMMMMM");
		List<String> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
        
        System.err.println(keySetList);
		System.err.println(list);
		int[] answer= new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i]=list.get(i);
		}
		return answer;
	}
}
