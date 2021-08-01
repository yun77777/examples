package lc;

import java.io.IOException;
import java.util.TreeSet;

public class ex1385 {
	public static void main(String[] args) throws IOException {
		int[] arr1= {4,5,8},arr2= {10,9,1,8};
		int d=2;
		System.err.println(findTheDistanceValue(arr1, arr2, d));
	}

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
    	int res=0;
    	TreeSet<Integer> ts=new TreeSet<>();
    	for(int n:arr2) ts.add(n);
    	for(int n:arr1) {
    		Integer high=ts.ceiling(n);
    		Integer low=ts.floor(n);
    		int dif=0;
    		if(high==null) dif=Math.abs(low-n);
    		else if(low==null) dif=Math.abs(high-n);
    		else dif=Math.min(high-n,n-low);
        	if(dif>d) res++;
    	}
    	return res;
	}
}
