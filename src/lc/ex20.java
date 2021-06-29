package lc;

import java.util.Scanner;

public class ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(isValid(s));

	}
	
    public static boolean isValid(String s) {
    	String tmp="";
    	int len=s.length();
    	if(s==null||s.length()<2||s.length()%2!=0) return false;
    	for (int i = 0; i < s.length(); i++) {
    		tmp=s.substring(i,i+2);
//			System.err.println("END:"+s.charAt(s.length()-1-i));
//    		System.err.println("TMP:"+tmp);
    		if(tmp.equals("()")||tmp.equals("{}")||tmp.equals("[]")) {
    			i++;
    			continue;
    		} else if(s.charAt(s.length()-1-i)==s.charAt(i)) {
    			continue;
    		} else {
    			return false;
    		}
		}
    	return true;
    }
}

