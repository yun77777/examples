package prgrmrs;

import java.util.ArrayList;
import java.util.List;

//짝지어 제거하기
public class ex1_lv2 {

	public static void main(String[] args) {
		System.err.println(solution("baabaa"));
		
	}
	
	public static int solution(String s)
    {
        int answer = -1;
        List<Character> list=new ArrayList<Character>();
        for(char c:s.toCharArray()) list.add(c);
        deletePair(list);
        if(list.size()==0) answer=1;
        else answer=0;
        return answer;
    }
	public static void deletePair(List<Character> list) {
		if(list.size()==0) return;
		System.err.println("LIST before:"+list);
		System.err.println(list.get(0));
		for (int i = 0; i < list.size()-1; i++) {
//			System.err.println(list.get(i)+","+list.get(i+1));
			if(list.get(i)==list.get(i+1)){
				System.err.println(list.get(i)+" is SAME as "+list.get(i+1));
				list.remove(i);
				list.remove(i);
				System.err.println("after removing:"+list);
				deletePair(list);
			}
		}

//		deletePair(list);
		System.err.println("LIST after:"+list);
	}
	
}
