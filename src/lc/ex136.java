package lc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex136 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//파일에서 입력받을 경우에는 new BufferedReader(new FileReader("ex.java"));
		//라인단위로 입력받기(Enter를 경계로)
		//String str = bf.readLine();
		//정수형 입력이라면, 형변환 필수!
//		int i = Integer.parseInt(bf.readLine());
		//Space를 경계로 끊어야 할 때
		//String arr[] = str.split(" ");
		//또는 StringTokenizer 클래스 이용)
		int[] nums= {2,2,1};
		System.out.println(singleNumber(nums));
			
	}
    public static int singleNumber(int[] nums) {
    	int result=0,cnt=0;
    	for (int i = 0; i < nums.length; i++) {
    		cnt=0;
			for (int j = 0; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					System.err.println("same:"+nums[i]);
					cnt++;
				}
			}
			System.err.println("cnt:"+cnt);
			if(cnt==1) {
				result=nums[i];
			}
		}
		return result;
	 }
}
