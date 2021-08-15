package prgrmrs;

public class jadenCase_lv2 {

	public static void main(String[] args) {
		System.err.println(solution("3zZZCXZSDa sda       sdzx cCCX   "));
//		System.err.println(solution("3people unFollowed me"));
	}

	public static String solution(String s) {
		StringBuilder sb=new StringBuilder();
		String[] tmp=s.toLowerCase().split("");//다쪼갬
		tmp[0]=tmp[0].toUpperCase();
		for (int i = 0; i < tmp.length-1; i++) {
			if(tmp[i].equals(" ")) {
				if(tmp[i+1].equals(" ")) continue;
				else tmp[i+1]=tmp[i+1].toUpperCase();
			}
		}
		for (int i = 0; i < tmp.length; i++) {
			sb.append(tmp[i]);
		}
		//3people Unfollowed Me
		return sb.toString();
	}
}
