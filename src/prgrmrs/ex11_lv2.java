package prgrmrs;

import java.util.Arrays;

public class ex11_lv2 {

	public static void main(String[] args) {
		String[] phone_book= {"119", "97674223", "1195524421"};
		System.err.println(solution(phone_book));
	}
	
	//어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return
	public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length-1; i++) {
			if(phone_book[i+1].startsWith(phone_book[i])) return false;
		}
        
        return true;
    }
	
//	//효율성 문제 발생
//	//어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return
//	public static boolean solution(String[] phone_book) {
//		boolean answer = true;
////        Arrays.sort(phone_book);
//		for (int i = 0; i < phone_book.length; i++) {
//			if(!check(phone_book,i)) return false;
////        	 System.err.println(check(phone_book,i));
//		}
//		
//		return answer;
//	}
//	public static boolean check(String[] phone_book,int i) {
//		String str=phone_book[i];
//		for (int j = 0; j < phone_book.length; j++) {
//			if(i!=j && str.length()<=phone_book[j].length()) {
//				System.err.println("STR:"+str);
//				if(str.equals(phone_book[j].substring(0,str.length()))) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}
}
