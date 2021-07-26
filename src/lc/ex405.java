package lc;

public class ex405 {
	static int[] nums;

	public static void main(String[] args) {
		System.err.println(toHex(26));
	}
	public static String toHex(int num) {
//		hexadecimal representation
		if(num==0) return "0";
		String hex="0123456789abcdef";
//		String res="";
		StringBuilder res=new StringBuilder();
		char[] hexArr=hex.toCharArray();
		while(num!=0) {
			res.append(hexArr[(num&15)]);
			num>>>=4;
		}
		return res.reverse().toString();
    }
	
	
//	public static String toHex(int num) {
//		if(num==0) return "0";
//		StringBuilder res=new StringBuilder();
//		int digit=0;
//		while(num!=0) {
//			digit=num&0xf;
//			res.append(digit<10 ? (char)(digit+'0') : (char)(digit-10+'a'));
//			num>>>=4;
//		}
//		return res.reverse().toString();
//	}
}
