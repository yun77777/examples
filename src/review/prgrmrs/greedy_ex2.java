package review.prgrmrs;

public class greedy_ex2 {

	public static void main(String[] args) {
		System.err.println(solution("JAN"));
	}

	public static int solution(String name) {
		int answer = 0, move=0, min=name.length()-1;
		//"AAAAAA" 시작
		for(int i=0; i<name.length(); i++) {
			char ch=name.charAt(i); // 'J'
			move = Math.abs(ch-'A') < Math.abs(ch-'Z')+1 ? (Math.abs(ch-'A')) : Math.abs(ch-'Z')+1;//위 or 아래 이동
			System.err.println(ch+","+move);
			//문자가 A일 경우 왼쪽 or 오른쪽 최소 이동값
			int moveIdx=i+1;
			while(moveIdx<name.length() && name.charAt(moveIdx)=='A')
				moveIdx++;
			min=Math.min(min,(i*2)+name.length()-moveIdx);
			answer+=move;
		}
		return answer+min;
	}
}
