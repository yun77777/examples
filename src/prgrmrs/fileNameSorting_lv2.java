package prgrmrs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class fileNameSorting_lv2 {
	public static int start,end;
	public static void main(String[] args) {
		//100글자 이내
		//영문 대소문자, 숫자, " ", ".", "-"
		//영문자 시작, 숫자 하나 이상 포함
		//HEAD/ NUMBER(1~5)/ TAIL(나머지)
		//HEAD: 사전순, 대소문자 구분 안함
		//NUMBER: 012=12
		//HEAD: 순서 그대로
		
		String[] files= {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		String[] res=solution(files);
		for (int i = 0; i < res.length; i++) {
			System.err.println(res[i]);
		}
	}

	public static String[] solution(String[] files) {
		//대소문자 구분 안함
		//사전순 정렬
		//숫자 기준 정렬
		Arrays.sort(files, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				String[] str1=substr(s1);
				String[] str2=substr(s2);
				
				int isHeadSame=str1[0].compareTo(str2[0]);//같으면 0  
				if(isHeadSame==0) {//같으면 number 비교
					int number1=Integer.parseInt(str1[1]);
					int number2=Integer.parseInt(str2[1]);
					
					return number1-number2;
				}else return isHeadSame;
			}
		});
		
		return files;
	}
	public static String[] substr(String file) {
		int idx=0;
		String head="", number="", tail="";
		for (; idx < file.length(); idx++) {
			char ch=file.charAt(idx);
			if(!(ch>='0' && ch<='9'))
				head+=ch;
			else
				break;
		}
		for (; idx < file.length(); idx++) {
			char ch=file.charAt(idx);
			if(ch>='0' && ch<='9')
				number+=ch;
			else
				break;
		}
		tail=file.substring(idx,file.length());
		
		return new String[] {head.toUpperCase(),number,tail};
	}
}
//package prgrmrs;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.Map.Entry;
//
//public class fileNameSorting_lv2 {
//	public static int start,end;
//	public static void main(String[] args) {
//		//100글자 이내
//		//영문 대소문자, 숫자, " ", ".", "-"
//		//영문자 시작, 숫자 하나 이상 포함
//		//HEAD/ NUMBER(1~5)/ TAIL(나머지)
//		//HEAD: 사전순, 대소문자 구분 안함
//		//NUMBER: 012=12
//		//HEAD: 순서 그대로
//		
//		String[] files= {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
//		String[] res=solution(files);
//		for (int i = 0; i < res.length; i++) {
//			System.err.println(res[i]);
//		}
//	}
//	
//	public static String[] solution(String[] files) {
//		//숫자만나기전까지 자름
//		//숫자만 자름
//		//나머지
//		
//		//대소문자 구분 안함
//		
//		//HEAD 부분만
//		//사전순 정렬
//		
//		//숫자 기준 정렬
//		//NUMBER: map(idx, NUMBER); // 정렬
//		//NUMBER: list.add(NUMBER) // 정렬
//		
//		Arrays.sort(files, new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				String[] str1=substr(s1);
//				String[] str2=substr(s2);
//				
//				int headVal=str1[0].compareTo(str2[0]);// compareTo(): 같으면 0 반환
//				if(headVal==0) {
//					int num1=Integer.parseInt(str1[1]);
//					int num2=Integer.parseInt(str2[1]);
//					
//					return num1-num2;
//				} else return headVal;
//			}
//			//문자열 자르는 함수
//			public String[] substr(String str) { // {HEAD, NUMBER, TAIL}
////				int start=0, end=0;
//				String head="";
//				String number="";
//				String tail="";
//				
//				int idx=0;
//				System.err.println(str);
//				for (; idx < str.length(); idx++) {
//					if(str.charAt(idx)>'A'||str.charAt(idx)>'Z') break;
//					head+=str.charAt(idx);
//				}
//				
//				System.err.println(head);
//				for(; idx<str.length(); idx++) {
//					if(str.charAt(idx)<'0'||str.charAt(idx)>'9') break;
//					number+=str.charAt(idx);
//				}
//				for(; idx<str.length(); idx++) {
//					tail+=str.charAt(idx);
//				}
//				
//				String[] res= {head.toUpperCase(), number, tail};
//				return res;
//			}
//		});
//		
//		return files;
//	}
//	
//}
