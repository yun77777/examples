package lc;

public class ex8 {
	public static void main(String[] args) {
		System.err.println(myAtoi("       -42"));
//		System.err.println(myAtoi("42"));
		System.err.println(myAtoi("-91283472332"));
		System.err.println(myAtoi("3.14159"));
	}

	public static int myAtoi(String s) {
		int idx=0,sign=1,res=0;
		if(s.length()==0)return 0;
		while(s.charAt(idx)==' '&&idx<s.length()) idx++;
		if(s.charAt(idx)=='+'||s.charAt(idx)=='-') {
			sign=s.charAt(idx)=='+'?1:-1;
			idx++;
		}
		while(idx<s.length()) {
			int digit=s.charAt(idx)-'0';
			if(digit<0||digit>9) break;
			res=res*10+digit;
			if(Integer.MAX_VALUE/10 < res || Integer.MAX_VALUE/10 == res && Integer.MAX_VALUE %10 < digit)
				return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
			
//			res=res*10+digit;
			idx++;
		}
		return res*sign;
	}
}
