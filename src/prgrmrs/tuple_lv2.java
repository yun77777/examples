package prgrmrs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class tuple_lv2 {

	public static void main(String[] args) {
		int[] res=solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
		for (int i = 0; i < res.length; i++) {
			System.err.println(res[i]);
		}
	}
	
	public static int[] solution(String s) {
		
		String[] strs=s.replaceAll("[{}]"," ").trim().split(" ,");
		int[] res=new int[strs.length];
		Set<Integer> set=new HashSet<>();
		Arrays.sort(strs, (a,b)->(a.length()-b.length()));//람다식
		int idx=0;
		for (int i = 0; i < strs.length; i++) {
			System.err.println(strs[i]);
		}
		
		for(String str:strs) {
			for(String st:str.split(",")) {
				int n=Integer.parseInt(st.trim());
				if(set.contains(n)) continue;//중복값 필터링
				set.add(n);
				res[idx++]=n;
			}
		}
		return res;
	}
	
	//way1) 문자열 내 가장 긴 {} 찾아서 숫자만 꺼내서 배열에 담음 -x
	//way2) 숫자인지 판별 후 숫자만 Set에 담음(한글자씩 담으면 안됨) -x
	//way3) HashMap map(숫자, 중복 횟수) 내림차순 -x
	//way4) { } 공백문자로 대체
	//way5) 길이 오름차순 {} 내 숫자 하나씩 저장(각 {} 내 새로 추가되는 숫자 저장)
}
