package review.prgrmrs;

public class carpet_lv2 {

	public static void main(String[] args) {
		int[] answer=solution(10, 2);
		for (int i = 0; i < answer.length; i++) {
			System.err.println(answer[i]);
		}
	}

	public static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		//yellow=a*b
		//brown=2a+2b+4
		//{w,h}->{a+2,b+2}
		for(int i=1; i<=yellow/i; i++) { // i=b
			if(brown==(2*yellow/i)+(2*i)+4) {
				answer[0]=(yellow/i)+2;
				answer[1]=i+2;
			}
		}
		return answer;
	}
}
