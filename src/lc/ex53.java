package lc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex53 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(lengthOfLastWord(br.readLine()));
		br.close();
	}

    public static int lengthOfLastWord(String s) {
    	if(s.length()==0||s.equals(" ")||s==null||s.trim().length()==0) return 0;
    	String[] arr=s.split(" ");
//    	for (int i = 0; i < arr.length; i++) {
//			System.err.println(arr[i]);
//		}
//    	System.err.println("last:"+arr[arr.length-1]);
    	int result=arr[arr.length-1].length();
    	return result;
    }
}