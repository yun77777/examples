package prgrmrs;

import java.util.HashMap;

public class ex9_lv2 {

	public static void main(String[] args) {
		String[] data = { "N~F=0", "R~T>2" };
		System.err.println(solution(data.length, data));
	}
	
	//순열 permutation
	static String[] d;
	static HashMap<Character, Integer> map;
	static boolean[] visited;
	static int[] ch;//position of characters
	static int answer;
	
	public static int solution(int n, String[] data) {
		d=data;
		map=new HashMap<>();
		visited=new boolean[8];
		ch=new int[8];
		answer=0;
		
		map.put('A',0);
		map.put('C',1);
		map.put('F',2);
		map.put('J',3);
		map.put('M',4);
		map.put('N',5);
		map.put('R',6);
		map.put('T',7);
		
		dfs(0);
		
		return answer;
	}
	
	public static void dfs(int idx) {
		if(idx==8) {//순서 결정 완료
			if(check()) answer++;
		} else {
			for(int i=0; i<8; i++) {
				if(!visited[i]) {
					visited[i]=true;
					ch[idx]=i;
					dfs(idx+1);
					visited[i]=false;
				}
			}
		}
	}
	
	public static boolean check() {
		int a=0, b=0, res=0;
		char op;
		for(String s: d) {
			a=ch[map.get(s.charAt(0))];//character1
			b=ch[map.get(s.charAt(2))];//character2
			op=s.charAt(3);//operator
			res=s.charAt(4)-'0'+1;//distance
			
			if(op=='=') {
				if(Math.abs(a-b)!=res)
					return false;
			} else if(op=='>') {
				if(Math.abs(a-b)<=res)
					return false;
			} else {
				if(Math.abs(a-b)>=res)
					return false;
			}
		}
		return true;
	}
}
