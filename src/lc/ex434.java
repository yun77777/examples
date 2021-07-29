package lc;

public class ex434 {
	static int[] nums;

	public static void main(String[] args) {
		System.err.println(countSegments(", , , ,        a, eaefa"));
//		System.err.println(countSegments("Hello, my name is John"));
	}
    public static int countSegments(String s) {
    	if(s==null||s.length()==0) return 0;
    	String[] arr=s.split(" ");
    	int cnt=0;
    	for(String a: arr) {
    		System.err.println("a:"+a);
    		if(!a.equals(""))
    			cnt++;
    	}
    	return cnt;
    }
}
