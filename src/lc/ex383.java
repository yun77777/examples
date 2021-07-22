package lc;

public class ex383 {
	static int[] nums;

	public static void main(String[] args) {
		System.err.println(canConstruct("aa","aab"));
	}
	public static boolean canConstruct(String ransomNote, String magazine) {
		int[] arr=new int[26];
		for (int i = 0; i < magazine.length(); i++) {
			arr[magazine.charAt(i)-'a']++;
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			if(--arr[ransomNote.charAt(i)-'a']<0)
				return false;
		}
		return true;
    }
//	public static boolean canConstruct(String ransomNote, String magazine) {
//		if(ransomNote==null||magazine==null) return false;
//		int i=0,j=0;
//		boolean flag=false;
//		while(i<ransomNote.length()) {
//			while(j<magazine.length()) {
//				if(ransomNote.charAt(i)!=magazine.charAt(j))
//					flag=true;
//				else
//					flag=false;
//				j++;
//			}
//			i++;
//			return flag==true ? false : true;
//			
//		}
//		return magazine.contains(ransomNote) ? true : false;
//	}
}
