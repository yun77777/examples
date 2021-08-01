package lc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ex1539 {
	public static void main(String[] args) throws IOException {
		int[] arr= {2,3,4,7,11};
		int k=5;
		System.err.println(findKthPositive(arr, k));
	}

    public static int findKthPositive(int[] arr, int k) {
    	int low=0,high=arr.length-1;
    	while(low<high) {
    		int mid=(low+high)/2;
    		if(arr[mid]-mid<k)
    			low=mid+1;
    		else high=mid-1;
    	}
    	return low+k;
	}
}
