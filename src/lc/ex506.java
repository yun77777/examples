package lc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ex506 {
	private static String[] findRelativeRanks(int[] score) {
		int[] ranks=score.clone();
		Arrays.sort(ranks);
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		for (int i = 0; i < ranks.length; i++) {
			map.put(ranks[i],score.length-i);
		}
		String[] res=new String[score.length];
		for (int i = 0; i < score.length; i++) {
			int rank=map.get(score[i]);
			String rankStr=Integer.toString(rank);
			if(rank==1) rankStr="Gold Medal";
			else if(rank==2) rankStr="Silver Medal";
			else if(rank==3) rankStr="Bronze Medal";
			res[i]=rankStr;
		}
		return res;
	}
}
