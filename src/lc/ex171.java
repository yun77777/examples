package lc;

import java.io.IOException;

public class ex171 {
	public static void main(String[] args) throws IOException {
		System.out.println(titleToNumber("AB"));
	}
	public static int titleToNumber(String columnTitle) {
    	int result=0;
    	result+=columnTitle.charAt(columnTitle.length()-1)-'A'+1;

    	if(columnTitle.equals("")) return 0;
    	else {
    		for (int i = 0; i < columnTitle.length()-1; i++) {
				result+=(columnTitle.charAt(i)-'A'+1)*Math.pow(26,columnTitle.length()-i-1);
			}
    	}
    	return result;
//    	return columnNumber==0 ? "" : convertToTitle(--columnNumber/26)+(char)('A'+(columnNumber%26));
    }
}
