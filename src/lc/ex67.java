package lc;

import java.util.Scanner;

public class ex67 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String ss=sc.nextLine();
		System.out.println(addBinary(s,ss));
	}
	
	public static String addBinary(String a, String b) {
//		if(a.equals("0")&&b.equals("0")) return "0";
		
		StringBuilder sb=new StringBuilder();
		int i=a.length()-1,j=b.length()-1,carry=0;
		while(i>=0||j>=0) {
			int sum=carry;
			if(i>=0) sum+=a.charAt(i--)-'0';
			if(j>=0) sum+=b.charAt(j--)-'0';
			sb.append(sum%2);
			carry=sum/2;
		}
		if(carry!=0) sb.append(carry);
		return sb.reverse().toString();
		
//		if(a.equals("0")&&b.equals("0")) return "0";
//		
//		String result="",res="";
//		int lenA=a.length(),lenB=b.length();
//		//...421
//		
//		int intA=0,intB=0,sum=0;
//		
//		for (int i = a.length()-1; i >= 0; i--) {
//			if(a.charAt(i)=='1')
//				intA+=Math.pow(2,a.length()-1-i);
//		}
//		for (int i = b.length()-1; i >= 0; i--) {
//			if(b.charAt(i)=='1')
//				intB+=Math.pow(2,b.length()-1-i);
//		}
//		sum=intA+intB;
//		while(sum>0) {
////			System.err.println("while:"+sum%2);
//			result+=Integer.toString(sum%2);
//			sum/=2;
//		}
//		for (int i = result.length()-1; i>=0;i--) {
//			res+=result.charAt(i);
//		}
//		
////		System.err.println("A:"+intA);
////		System.err.println("B:"+intB);
////		System.err.println("result:"+result);
////		System.err.println("res:"+res);
//		
//		return res;
    }
}