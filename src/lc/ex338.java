package lc;

public class ex338 {
	static int[] nums;
	public static void main(String[] args) {
		System.err.println(countBits(2));
	}
	
    public static int[] countBits(int n) {
    	int[] nums=new int[n+1];
    	
    	for (int i = 0; i <= n; i++) {
			nums[i]=cntOne(i);
		}
    	return nums;
    }
    public static int cntOne(int n) {
    	int cnt=0;
    	
    	while(n>0) {
    		if(n%2==1) cnt++;
    		n/=2;
    	}
    	return cnt;
    }
}
