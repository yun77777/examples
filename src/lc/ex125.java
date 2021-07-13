package lc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex125 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//파일에서 입력받을 경우에는 new BufferedReader(new FileReader("ex.java"));
		//라인단위로 입력받기(Enter를 경계로)
		//String str = bf.readLine();
		//정수형 입력이라면, 형변환 필수!
//		int i = Integer.parseInt(bf.readLine());
		//Space를 경계로 끊어야 할 때
		//String arr[] = str.split(" ");
		//또는 StringTokenizer 클래스 이용)
		String str="0P";
//		String str="race a car";
//		String str="A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(str));
			
	}
    public static boolean isPalindrome(String s) {
    	if(s.isEmpty()) return true;
    	s=s.toLowerCase().trim();
    	String str="";
    	for (int i = 0; i < s.length(); i++) {
			if(Character.isLetterOrDigit(s.charAt(i)))
//				if(s.charAt(i)>='a' && s.charAt(i)<='z')
				str+=s.charAt(i);
		}
    	for (int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
				return false;
		}
    	System.err.println(str);
        return true;
	 }
}
