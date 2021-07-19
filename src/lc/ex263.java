package lc;

public class ex263 {
	public void main(String[] args) {
		System.err.println(isUgly(7));
	}
	public boolean isUgly(int n) {
		if(n==1) return true;
		if(n%2==0) n/=2;
		else if(n%3==0) n/=3;
		else if(n%5==0) n/=5;
		else return false;
		
		return n==0 ? false : isUgly(n);
    }
}
