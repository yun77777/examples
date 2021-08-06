package prgrmrs;

//멀쩡한 사각형
public class ex2_lv2 {

	public static void main(String[] args) {
		System.err.println(solution(8, 12));
	}

	public static long solution(long w, long h) {
		long res=0;
		for(int i=0;i<w;i++) {
			res+=h*i/w;
			System.err.println(h+"*"+i+"/"+w+"="+res);
		}
		return res*2;
	}

}
