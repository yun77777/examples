package lc;

import java.util.Scanner;

public class ex28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String ss=sc.nextLine();
		System.out.println(strStr(s,ss));

	}
	

    public static int strStr(String haystack, String needle) {
    	if(needle==null||needle.length()==0) return 0;
    	else if(haystack.length()==1&&needle.length()==1)
    		if(haystack.charAt(0)==needle.charAt(0))
    			return 0;
    	int len=needle.length();
    	boolean flag=false;
    	int idx=0;
    	String tmp="";
    	for (int i = 0; i <= haystack.length()-len; i++) {
    		tmp="";
    		for (int j = 0; j < len; j++) {
    			tmp+=haystack.charAt(i+j);
			}
    		//System.err.println("tmp:"+tmp);
    		if(tmp.equals(needle)) {
    			flag=true;
				idx=i;
				break;
			} else {
				flag=false;
			}
		}
    	if(flag)
    		return idx;
    	else
    		return -1;
	}
}