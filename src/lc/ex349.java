package lc;

import java.util.ArrayList;
import java.util.List;

public class ex349 {
	static int[] nums;

	public static void main(String[] args) {
		int[] nums1= {1,2,2,1};
		int[] nums2= {2,2};
		int[] res= intersection(nums1, nums2);
		for (int k = 0; k < res.length; k++) {
			System.err.println(res[k]);
		}
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		if(nums1==null||nums2==null) return null;
//    	Map m=new HashMap();
    	List<Integer> list=new ArrayList<Integer>();
    	
    	int i=0,j=0;
    	while(i<nums1.length) {
    		j=0;
    		while(j<nums2.length) {
//    			System.err.println("IJ:"+i+","+j);
    			if(nums1[i]==nums2[j]&&!list.contains(nums1[i])) {
//    				if(nums1[i]==nums2[j]&&list.contains(nums1[i])) {
    				list.add(nums1[i]);
//    				System.err.println(nums1[i]);
    				break;
    			}
    			j++;
//    			System.err.println(list.contains(nums1[i]));
    		}
    		i++;
    	}
//    	System.err.println(list);
    	int[] res=new int[list.size()];
    	for (int k = 0; k < list.size(); k++) {
			res[k]=list.get(k);
		}
    	
    	return res;
	}
}
