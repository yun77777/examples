package lc;

public class ex492 {
	public static void main(String[] args) {
		int[] area=constructRectangle(37);
		System.err.println(area[0]+", "+area[1]);
	}

    
    public static int[] constructRectangle(int area) {
    	int w=(int) Math.sqrt(area);
    	while(area%w!=0) w--;
    	return new int[] {area/w, w};
    }
}