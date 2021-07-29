package lc;

public class ex495 {
	public static void main(String[] args) {
		int[] timeSeries= {1,2,3,4,5};
		int duration=5;
		System.err.println(findPoisonedDuration(timeSeries, duration));
	}

    
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
    	int total=0;
    	for (int i = 0; i < timeSeries.length-1; i++) {
			total+=(timeSeries[i+1]-timeSeries[i]>=duration ? duration : timeSeries[i+1]-timeSeries[i]);
		}
    	return total+duration;
    }
}