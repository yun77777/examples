package prgrmrs;

public class fibonacci_lv2 {

	public static void main(String[] args) {
		System.err.println(solution(5));
	}

	//2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수
	public static int solution(int n) {
		int a=0, b=1, i=2, c=1;
		while(i<n) {
			a=b;
			b=c;
			c=(a+b)%1234567;
			i++;
			System.err.println(a+","+b+","+c);
		}
		System.err.println(c);
		return c;
	}
}
