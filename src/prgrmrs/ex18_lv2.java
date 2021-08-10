package prgrmrs;

public class ex18_lv2 {

	public static void main(String[] args) {
		int[] answer=solution(24, 24);
		System.err.println(answer[0]+" "+answer[1]);
	}

	public static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		for(int i=yellow; i>=yellow/i; i--) {
			if(yellow%i!=0) continue;
			if(brown==(2*i)+(2*(yellow/i))+4){
				answer[0]=i+2;
				answer[1]=(yellow/i)+2;
				break;
			}
		}
		return answer;
	}
}
