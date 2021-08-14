package prgrmrs;

public class numberExpression_lv2 {

	public static void main(String[] args) {
		System.err.println(solution(15));
	}
	public static int count = 0;
	public static int solution(int n) {
		for(int i=1;i<=n;i++)
			countNumber(n,i, 0);
		
		return count;
	}
	
	public static void countNumber(int n, int i, int cnt) {
		if(cnt==n) {
			count++;
			return;
		} else if(cnt>n) return;
		
		countNumber(n,i+1,cnt+i);
		
	}
}
