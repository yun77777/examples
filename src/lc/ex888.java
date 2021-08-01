package lc;

public class ex888 {
	public static void main(String[] args) {
		int[] a= {2},b= {1,3};
		System.err.println(fairCandySwap(a, b));
	}
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
    	int[] res=new int[2];
    	int sumA=0,sumB=0;
    	for(int a: aliceSizes) sumA+=a;
    	for(int b: bobSizes) sumB+=b;
    	System.err.println(sumA+","+sumB);
    	
    	for (int i = 0; i < aliceSizes.length; i++) {
			for (int j = 0; j < bobSizes.length; j++) {
				System.err.println("==="+sumA+","+sumB);
				if((sumA-aliceSizes[i]+bobSizes[j])==(sumB-bobSizes[j]+aliceSizes[i])) {
					res[0]=aliceSizes[i];
					res[1]=bobSizes[j];
					return res;
				}
			}
		}
    	return null;
	}
}
