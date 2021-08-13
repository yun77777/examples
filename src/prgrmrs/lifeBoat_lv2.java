package prgrmrs;

import java.util.Arrays;

public class lifeBoat_lv2 {

	public static void main(String[] args) {
		int[] people= { 70, 50, 80, 50 };
		System.err.println(solution(people, 100));
	}
	
	public static int solution(int[] people, int limit) {
		int answer = 0;
		Arrays.sort(people);
		int min=0;
		//50 50 70 80
		for(int max=people.length-1; min<=max; max--) {
			if(people[min]+people[max]<=limit) min++;
			answer++;
		}
		return answer;
	}
}
