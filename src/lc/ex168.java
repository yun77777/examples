package lc;

import java.io.IOException;

public class ex168 {
	public static void main(String[] args) throws IOException {
		System.out.println(convertToTitle(28));
	}
    public static String convertToTitle(int columnNumber) {
    	String result="";
    	
    	if(columnNumber==0)
    		return "";
    	else {
    		return convertToTitle(--columnNumber/26)+(char)('A'+columnNumber%26);
    	}
//    	return columnNumber==0 ? "" : convertToTitle(--columnNumber/26)+(char)('A'+(columnNumber%26));
    }
}
