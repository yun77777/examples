package review.prgrmrs;

public class greedy_ex3 {

	public static void main(String[] args) {
		System.err.println(solution("4177252841", 4));
	}

	public static int max;
	//number 중 k개의 숫자를 제외한 숫자 중 가장 큰 숫자
	public static String solution(String number, int k) {
		StringBuilder sb=new StringBuilder();
		//775841
		int idx=0;
		int tmp=0;
		for (int i = 0; i < number.length()-k; i++) {
			tmp=0;
			for (int j = idx; j <= i+k; j++) {
				char ch=number.charAt(j);
				if(tmp<ch-'0') {
					tmp=ch-'0';
					idx=j+1;
				}
			}
			sb.append(tmp);
		}
		return sb.toString();
	}
}
