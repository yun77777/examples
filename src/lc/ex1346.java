package lc;

import java.util.HashSet;
import java.util.Set;

public class ex1346 {
	public static void main(String[] args) {
		int[] arr= {-2,0,10,-19,4,6,-8};
		System.err.println(checkIfExist(arr));
	}
	
    public static boolean checkIfExist(int[] arr) {
    	for (int i = 0; i < arr.length; i++) {
    		for (int j = 0; j < arr.length; j++) {
    			if(arr[i]==2*arr[j]&&i!=j) return true;
    		}
    	}
    	
    	for (int j2 = 0; j2 < arr.length; j2++) {
    		System.err.println(arr[j2]);
    	}
    	return false;
    }
}

