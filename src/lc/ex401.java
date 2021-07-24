package lc;

import java.util.ArrayList;
import java.util.List;

public class ex401 {
	static int[] nums;

	public static void main(String[] args) {
	}
    public static List<String> readBinaryWatch(int turnedOn) {
    	List<String> times = new ArrayList<>();
        for (int h=0; h<12; h++)
            for (int m=0; m<60; m++)
                if (Integer.bitCount(h * 64 + m) == turnedOn)//시간을 분 단위로 환
                    times.add(String.format("%d:%02d", h, m));
        return times; 
    }
}
