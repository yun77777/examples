package prgrmrs;

public class ex8_lv2 {

	public static void main(String[] args) {
		int[][] picture={{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
		int[] sol=solution(6, 4, picture);
		for (int i = 0; i < sol.length; i++) {
			System.err.println(sol[i]);
		}
	}

	public static int[] solution(int m, int n, int[][] picture) {
		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;
		int[] answer = new int[2];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(picture[i][j]>0) {
					numberOfArea++;
					int cnt=cnt(picture, i, j);
					maxSizeOfOneArea=Math.max(maxSizeOfOneArea, cnt);
				}
			}
		}
		
		
		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
		return answer;
	}
	
	public static int cnt(int[][] picture, int i, int j) {
		int area = 1;
        int prev = picture[i][j];
        picture[i][j] = -prev;
        
        if((i >= 1) && (picture[i-1][j] == prev))
            area += cnt(picture,i-1,j);
        if((i <= picture.length - 2) && (picture[i+1][j] == prev))
            area += cnt(picture,i+1,j);
        if((j >= 1) && (picture[i][j-1] == prev))
            area += cnt(picture,i,j-1);
        if((j <= picture[0].length - 2) && (picture[i][j+1] == prev))
            area += cnt(picture,i,j+1);
        
        return area;
		
	}
}
