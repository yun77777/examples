package review.prgrmrs;

public class countSquares_lv2 {

	public static void main(String[] args) {
		System.err.println(solution(8, 12));
	}

	public static long solution(long w, long h) {
		long answer = 0;
		for (long i = 0; i < w; i++) {
			answer+=(h*i)/w;
			System.err.println((h*i)/w);
		}
		return answer*2;
	}
}
