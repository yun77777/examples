package review.prgrmrs;

import java.util.HashSet;
import java.util.Set;

public class findPrimes_lv2 {

	public static void main(String[] args) {
		System.err.println(solution("11"));
	}

	static Set<Integer> set=new HashSet<>();
	static boolean[] bool=new boolean[7];
	static String origin="";
	static int cnt=0;
	public static int solution(String numbers) {
		origin=numbers;
		generateNumbers("",0);
		
		return set.size();
	}
	
	public static void generateNumbers(String str, int cnt) {
		if(cnt==origin.length()) {
			System.err.println("aa");
			if(!str.equals("") && isPrime(Integer.parseInt(str)))
				set.add(Integer.parseInt(str));
			System.err.println(set);
			
		}
		for (int i = 0; i < origin.length(); i++) {
			if(bool[i]) continue;
			bool[i]=true;
			generateNumbers(str+origin.charAt(i), cnt+1);
			generateNumbers(str, cnt+1);
			bool[i]=false;
		}
	}
	
	public static boolean isPrime(int num) {
		if(num==0||num==1) return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if(num%i==0) return false;
		}
			
		return true;
	}
}
