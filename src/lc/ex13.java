package lc;

import java.util.Scanner;

public class ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(romanToInt(s));

	}
	
	public static int romanToInt(String s) {
		int roman[]=new int[s.length()];
		int result=0;
		for(int i=0;i<s.length();i++) {
			switch(s.charAt(i)) {
			case 'M':
                roman[i]=1000;
                break;
            case 'D':
                roman[i]=500;
                break;
            case 'C':
                roman[i]=100;
                break;
            case 'L':
                roman[i]=50;
                break;
            case 'X' :
                roman[i]=10;
                break;
            case 'V':
                roman[i]=5;
                break;
            case 'I':
                roman[i]=1;
                break;
			}
		}
		for(int i=0;i<roman.length-1;i++) {
			if(roman[i]<roman[i+1])
				result-=roman[i];
			else
				result+=roman[i];
		}
		return result+roman[roman.length-1];
    }
	
//	public static int romanToInt(String s) {
//		int result=0;
//		for(int i=0;i<s.length()-1;i++) {
//			System.err.println(s.charAt(i));
//			if(s.charAt(i)=='I') {
//				if(s.charAt(i+1)=='V') {
//					result+=4;
//					i++;
//					continue;
//				}else if(s.charAt(i+1)=='X') {
//					result+=9;
//					i++;
//					continue;
//				} else {
//					result+=1;
//				} //MCMXCIV
//			} else if(s.charAt(i)=='X') {
//				if(s.charAt(i+1)=='L') {
//					result+=50;
//					i++;
//					continue;
//				}else if(s.charAt(i+1)=='C') {
//					result+=90;
//					i++;
//					continue;
//				} else {
//					result+=10;
//				} 
//			} else if(s.charAt(i)=='C') {
//				if(s.charAt(i+1)=='D') {
//					result+=500;
//					i++;
//					continue;
//				}else if(s.charAt(i+1)=='M') {
//					result+=900;
//					i++;
//					continue;
//				} else {
//					result+=100;
//				} 
//			} else {
//				if(s.charAt(i)=='V')
//					result+=5;
//				else if(s.charAt(i)=='L')
//					result+=50;
//				else if(s.charAt(i)=='D')
//					result+=500;
//				else if(s.charAt(i)=='M')
//					result+=1000;
//			}
//		}
//		
//		if(s.length()%2!=0) {
//			if(s.charAt(s.length()-1)=='I')
//				result+=1;
//			else if(s.charAt(s.length()-1)=='V')
//				result+=5;
//			else if(s.charAt(s.length()-1)=='X')
//				result+=10;
//			else if(s.charAt(s.length()-1)=='L')
//				result+=50;
//			else if(s.charAt(s.length()-1)=='C')
//				result+=100;
//			else if(s.charAt(s.length()-1)=='D')
//				result+=500;
//			else if(s.charAt(s.length()-1)=='M')
//				result+=1000;
//		}
//		return result;
//	}
}

