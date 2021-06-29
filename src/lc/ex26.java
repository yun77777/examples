package lc;


public class ex26 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s=sc.nextLine();
//		System.out.println(isValid(s));

	}
	

    public static int removeDuplicates(int[] nums) {
    	int i=0;
    	for(int num:nums) 
    		if(i==0||num>nums[i-1])
    			nums[i++]=num;
    	return i;
    	
    	
//    	int [] temp=new int[nums.length];
//    	temp[0]=nums[0];
//    	int k=0;
//    	int tmp=0;
//    	
//    	for (int i = 1; i < nums.length; i++) {
//			if(temp[k++]==nums[i]) {
//				continue;
//			} else {
//				temp[k++]=nums[i];
//			}
//		}
//    	
//    	for (int i = 0; i < temp.length-1; i++) {
//			for (int j = i+1; j < temp.length; j++) {
//				if(temp[j]>temp[i]) {
//					tmp=temp[i];
//					temp[i]=temp[j];
//					temp[j]=tmp;
//				}
//			}
//		}
//    	
//    	return temp.length;
    	
	}
}