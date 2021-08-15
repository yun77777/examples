package prgrmrs;

public class leastCommonMultiple_lv2 {
	public static void main(String[] args) {
		int[] arr= {2,6,8,14};
		System.err.println(solution(arr));
	}

	//유클리드 호제법
	//최소공배수=두 수의 곱/두 수의 최대공약수
	public static int solution(int[] arr) {
		int res=arr[0];
		for (int i = 0; i < arr.length; i++) {
			res=lcm(res,arr[i]);
		}
		return res;
	}
	//최대공약수 gcd
	public static int gcd(int a, int b) {
		while(b!=0) {
			int r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
	
	//최소공배수 lcm
	public static int lcm(int a, int b) {
		return a*b/gcd(a,b);
	}
}
