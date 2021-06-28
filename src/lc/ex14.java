package lc;

import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String []strs=new String[3];
		for (int i = 0; i < strs.length; i++) {
			strs[i]=sc.nextLine();
		}
		System.out.println(longestCommonPrefix(strs));

	}
	
    public static String longestCommonPrefix(String[] strs) {
    	int len=strs[0].length();
    	char c;
    	if(strs==null||strs.length==0) return "";
    	if(strs.length==1)
    		return strs[0];
    	for(String str:strs)
    		if(str.length()<len) len=str.length();
    	
    	for (int i = 0; i < len; i++) {
			c=strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if(strs[j].charAt(i)!=c) {
					return strs[0].substring(0,i);
				}
			}
		}
    	
		return strs[0].substring(0,len);
    	
//    	String tmp="";
//    	
//    	if(strs.length==1)
//    		return strs[0];
//    	else {
//    		for (int i = 0; i < strs.length-2; i++) {
//
//    			for (int j = 0; j < strs[i].length(); j++) {
//    				if(strs[i+1].length()-1<j ||strs[i+2].length()-1<j)
//    					break;
//    				if(strs[i].charAt(j)==strs[i+1].charAt(j)&&strs[i].charAt(j)==strs[i+2].charAt(j)
//    					&&strs[i].charAt(j)==strs[i+2].charAt(j))
//    					tmp+=strs[i].charAt(j);
//    				else
//    					break;
//    			}
//    		}
//    	}
//    		
//		return tmp;
    }
	
}

