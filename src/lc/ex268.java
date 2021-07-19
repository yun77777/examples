package lc;

public class ex268 {
	public static void main(String[] args) {
		int [] nums= {1};
		System.err.println(missingNumber(nums));
	}
	
	public static int missingNumber(int[] nums) {
		if(nums==null||nums.length==1&&nums[0]==0) return 1;
		int[] res=new int[nums.length+1];
        int i=0;
        while(i<res.length) {
        	res[i++]=0;
        }
        
        i=0;
        while(i<nums.length) {
        	res[nums[i]]++;
//        	System.err.println("res"+i+":"+res[i]);
        	i++;
        }
        
//        i=0;
//        while(i<res.length) {
//        	System.err.println("res:"+res[i++]);
//        }
//        
        i=0;
        while(i<res.length) {
//        	System.err.println("RES"+i+":"+res[i]);
        	if(res[i]==0)
        		break;
        	i++;
        }
        return i;
    }
}
