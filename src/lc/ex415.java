package lc;

public class ex415 {
	static int[] nums;

	public static void main(String[] args) {
		System.err.println(addStrings("123456789","987654321"));
	}
    public static String addStrings(String num1, String num2) {
    	StringBuilder sb=new StringBuilder();
    	int carry=0, a=0, b=0;
    	for(int i=num1.length()-1, j=num2.length()-1; i>=0 || j>=0 || carry==1; i--, j--) {
    		a=i<0 ? 0: num1.charAt(i)-'0';
    		b=j<0 ? 0: num2.charAt(j)-'0';
    		sb.append((a+b+carry)%10);
    		carry=(a+b+carry)/10;
    	}
    	return sb.reverse().toString();
    }
    
//	public static int makeInt(char[] arr) {
//		int res=0;
//		System.err.println(arr);
//		for(char c : arr) {
//			System.err.println("char->int:"+(c-'1'+1));
//			res*=10;
//			res+=(c-'1'+1)*10;
//		}
//		System.err.println("RES:"+res/10);
//		return res/=10;
//	}
}
