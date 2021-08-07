package prgrmrs;

public class ex5_lv2 {

	public static void main(String[] args) {
		System.err.println(solution(5));
	}
	//124
	
	//1 2 4 11 12 14 21 22 24 41 42 44 111
	public static String solution(int n) {
        String answer = "";
        String[] num= {"4","1","2"};
        while(n>0) {
        	answer=num[n%3]+answer;
        	n=(n-1)/3;
        }
        return answer;
    }
}
