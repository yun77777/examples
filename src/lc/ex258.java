package lc;

public class ex258 {
	public void main(String[] args) {
	}
	public int addDigits(int num) {
		int res=0;
        while(true) {
        	res=0;
        	while(num>0) {
        		res+=num%10;
        		num/=10;
        	}
            num=res;
        	if(res<10) break;
        }
        return res;
    }
}
