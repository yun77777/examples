package prgrmrs;

public class nextBigNumber_lv2 {

	public static void main(String[] args) {
		System.err.println(solution(78));
	}

	public static int solution(int n) {
		int answer = 0, tmp=n, cnt=0;
		//1개수
        answer=countOne(n);
		
		for(int i=n+1; i<1000000; i++) {
			if(countOne(i)==answer) {
				return i;
			}
		}
		
		return answer;
	}
	public static int countOne(int n) {
		int cnt=0;
		while(n>0) {
			cnt+=(n%2)&1;
			n/=2;
		}
		
		return cnt;
	}
}
