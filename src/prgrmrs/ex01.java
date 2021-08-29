package prgrmrs;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] res=findPoint(new int[][] {{1,4},{3,4},{3,10}});
		for (int i = 0; i < res.length; i++) {
			System.err.println(res[i]);
		}
		
	}
	public static int[] findPoint(int[][] v) {
		int x=0,y=0;
		int cnt=0;
		
		if(v[0][0]==v[1][0])
			x=v[2][0];
		else if(v[0][0]==v[2][0])
			x=v[1][0];
		else
			x=v[0][0];
		
		if(v[0][1]==v[1][1])
			y=v[2][1];
		else if(v[0][1]==v[2][1])
			y=v[1][1];
		else
			y=v[0][1];
		
		return new int[] {x,y};
	}
}
