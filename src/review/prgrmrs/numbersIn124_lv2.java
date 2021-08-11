package review.prgrmrs;

public class numbersIn124_lv2 {

	public static void main(String[] args) {
		System.err.println(solution(6));
	}

	//1 2 4
	//11 12 14
	public static String solution(int n) {
		StringBuilder sb=new StringBuilder();
		String num="412";
		while(n>0) {
			sb.append(num.charAt(n%3));
			n=(n-1)/3;
		}
		
		return sb.reverse().toString();
	}
}
