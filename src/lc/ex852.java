package lc;

public class ex852 {
	public static void main(String[] args) {
	}
    public int peakIndexInMountainArray(int[] arr) {
    	for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]>arr[i+1]) return i;
		}
    	return -1;
	}
}
