package lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ex350 {
	static int[] nums;

	public static void main(String[] args) {
		int[] nums1= {1,2,2,1};
		int[] nums2= {2,2};
//		int[] nums1= {54,93,21,73,84,60,18,62,59,89,83,89,25,39,41,55,78,27,65,82,94,61,12,38,76,5,35,6,51,48,61,0,47,60,84,9,13,28,38,21,55,37,4,67,64,86,45,33,41};
//		int[] nums2= {17,17,87,98,18,53,2,69,74,73,20,85,59,89,84,91,84,34,44,48,20,42,68,84,8,54,66,62,69,52,67,27,87,49,92,14,92,53,22,90,60,14,8,71,0,61,94,1,22,84,10,55,55,60,98,76,27,35,84,28,4,2,9,44,86,12,17,89,35,68,17,41,21,65,59,86,42,53,0,33,80,20};
		int[] res= intersection(nums1, nums2);
		for (int k = 0; k < res.length; k++) {
			System.err.println(res[k]);
		}
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		if(nums1==null||nums2==null) return null;
    	Map<Integer, Integer> m=new HashMap<Integer, Integer>();
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
    	int i=0,j=0;
    	List<Integer> list=new ArrayList<Integer>();
    	while(i<nums1.length) {
    		j=m.size();
//    		j=0;
    		while(j<nums2.length) {
    			System.err.println("IJ:"+i+","+j);
    			if(nums1[i]==nums2[j]&&!m.containsKey(nums1[i])) {
    				System.err.println("equal");
    				m.put(j,nums1[i]);
    				list.add(nums1[i]);
    				break;
    			}
    			j++;
    		}
    		i++;
    	}
    	System.err.println(list);
    	int k=0;
    	int[] res=new int[list.size()];
//    	int[] res=new int[m.size()];
    	for (int l = 0; l < list.size(); l++) {
    		res[k++]=list.get(l);
		}
    	
    	for(Object key:m.keySet()) {
//    		res[k++]=Integer.parseInt(m.get(key).toString());
    	}
    	return res;
	}
}
