package prgrmrs;

public class ex20_lv2 {

	public static void main(String[] args) {
		System.out.println(solution("4177252841", 4));
	}

	public static String solution(String number, int k) {
		StringBuilder sb=new StringBuilder();
		int max=-1;
		int left=0;
		int cnt=number.length()-k;
		int right=number.length()-cnt;
		int idx=0;
		while(cnt>0) {
			max=-1;
			for(int i=left; i<=right; i++) {
				int num=number.charAt(i)-'0';
				if(num>max) {
					max=num;
					idx=i;
				}
			}
			sb.append(max);
			left=idx+1;
			right=number.length()- --cnt;
		}
		
		return sb.toString();
	}
}
