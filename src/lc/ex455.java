package lc;

import java.util.Arrays;
public class ex455 {
	public static void main(String[] args) {
		int[] g= {1,2,3};
		int[] s= {3};
		System.err.println(findContentChildren(g, s));
	}

	public static int findContentChildren(int[] g, int[] s) {
		int i=0, j=0;
		Arrays.sort(g);
		Arrays.sort(s);
		
		while(i<g.length && j<s.length) {
			if(g[i]<=s[j]) i++;
			j++;
		}
		return i;
	}
}