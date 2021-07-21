package lc;

public class ex344 {
	static int[] nums;

	public static void main(String[] args) {
		char[] s = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
//		char[] s= {'h','e','l','l','o'};
		System.err.println(s);
		System.err.println("["+s.length+"]");
		reverseString(s);
		System.err.println(s);
		System.err.println("["+s.length+"]");
	}
	
	public static void reverseString(char[] s) {
		int i = s.length - 1, j = 0;
		char tmp;
		for (char c : s) {
			System.err.println("i:" + i);
			System.err.println("@@@c:" + c);
//			if (i == s.length / 2)
//				break;
			if(s[i]!=s[j]) {
				tmp = s[j];
				s[j] = s[i];
				s[i] = tmp;
			}
			if (i == s.length / 2)
				break;
			System.err.println("###c:" + c);
			System.err.println("###s[i]:" + s[i]);
			i--;
			j++;
		}
	}
}
