package review.prgrmrs;

import java.util.Arrays;

public class hash_ex1 {

	public static void main(String[] args) {
		String[] participant= {"leo", "kiki", "eden"};
		String[] completion= {"eden", "kiki"};
		System.err.println(solution(participant, completion));
	}
	
	//효율성문제
	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		int i=0;
		
		for (i = 0; i < completion.length; i++) {
			if(!participant[i].equals(completion[i]))
				return participant[i];
		}
		return participant[i];

    }
//	//효율성문제
//	public static String solution(String[] participant, String[] completion) {
//		String answer = "";
//		List<String> hs=new ArrayList<String>();
////        HashSet<String> hs=new HashSet<String>();
//		for(String p: participant) {
//			hs.add(p);
//		}
//		System.err.println(hs);
//		
//		for(String c: completion) {
//			if(!hs.contains(c))
//				hs.remove(c);
//		}
//		System.err.println(hs);
//		return hs.get(0);
//	}
}
