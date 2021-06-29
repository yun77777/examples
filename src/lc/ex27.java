package lc;


public class ex27 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s=sc.nextLine();
//		System.out.println(isValid(s));

	}
	

    public static int removeElement(int[] nums, int val) {
    	int i=0;
    	for(int num:nums) {
    		if(num==val) {
    			continue;
    		}else {
    			nums[i++]=num;
    		}
    	}
    	
    	return i;
	}
}