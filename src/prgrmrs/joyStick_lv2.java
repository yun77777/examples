package prgrmrs;

public class joyStick_lv2 {

	public static void main(String[] args) {
		System.err.println(solution("JEROEN"));
	}

	public static int solution(String name) {
		int answer = 0, mov=0;
		int len=name.length();
		int min=len-1; //최소 이동 횟수
		int idx=0;
		for(int i=0; i<len; i++) {
			char ch=name.charAt(i);
			answer+=Math.abs('A'-ch) < Math.abs('Z'-ch+1) ? Math.abs('A'-ch) : Math.abs('Z'-ch+1); // 앞 뒤(+1: A에서 출발) 중 최단 이동 거리
			
			int nextIdx=i+1;
			while(nextIdx<len && name.charAt(nextIdx)=='A') //다음 단어가 A면 스킵
				nextIdx++;
			
			min=Math.min(min,(i*2)+len-nextIdx);//좌우 최단 이동 거리
			
		}
		
		return answer+min;
	}
	
//	public static int solution(String name) {
//		int answer = 0;
//		int len=name.length();
//		int min=len-1;
//		for (int i = 0; i <len; i++) {
//			char c=name.charAt(i);
//			int mov=(Math.abs('A'-c)<Math.abs('Z'-c)) ? (c-'A') : ('Z'-c+1);
////			int mov=(c-'A' < 'Z'-c+1) ? (c-'A') : ('Z'-c+1);
//			System.err.println(c+"-'A': "+(c-'A'));
//			System.err.println("('Z'-"+c+"+1): "+('Z'-c+1));
//			answer+=mov;
//			
//			int nextIdx=i+1;
//			while(nextIdx<len && name.charAt(nextIdx)=='A')
//				nextIdx++;
//			
//			//조이스틱 원위치 이동(i*2) + 끝에서 nextIdx 위치만큼 이동(거꾸로 가는게 최단일 경우)
//			
//			min=Math.min(min,(i*2)+len-nextIdx);
//		}
//		answer+=min;
//		
//		return answer;
//	}
}
