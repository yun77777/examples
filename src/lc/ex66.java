package lc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex66 {
	public static void main(String[] args) throws IOException {
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] digits={9,8,7,6,5,4,3,2,1,0};
		int[] result=plusOne(digits);
		
//		for (int i = 0; i < result.length; i++) {
//			System.err.println(result[i]);
//		}
//		br.close();
	}

    public static int[] plusOne(int[] digits) {
    	 int num=0,len=digits.length;

     	for (int i = 0; i < len ; i++) {
 			num+=digits[i]*Math.pow(10, len-1-i);
 		}
         
     	num++;
//         System.err.println("num:"+num);
         
         int cnt=0;
         int tmp=num;
         
         while(tmp>0){
             tmp/=10;
             cnt++;
         }
         
//         System.err.println("cnt:"+cnt);
     	int[] result=new int[cnt];

     	for (int i = cnt-1;i>=0;i--) {
             result[i]=num%10;
             num/=10;
 		}
     	
//     	for (int i = 0; i < result.length; i++) {
//         	System.err.println(result[i]);
// 		}
//     	
     	return result;
     }
}