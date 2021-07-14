package lc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex160 {
	public void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//파일에서 입력받을 경우에는 new BufferedReader(new FileReader("ex.java"));
		//라인단위로 입력받기(Enter를 경계로)
		//String str = bf.readLine();
		//정수형 입력이라면, 형변환 필수!
//		int i = Integer.parseInt(bf.readLine());
		//Space를 경계로 끊어야 할 때
		//String arr[] = str.split(" ");
		//또는 StringTokenizer 클래스 이용)
			
	}
	/**
	 * Definition for singly-linked list.
	 */
	class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) {
	         val = x;
	         next = null;
	     }
	 }
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null) return null;
        
        ListNode a=headA;
        ListNode b=headB;
        
        while(a!=b) {
        	a= a==null? headB:a.next;
        	b= b==null? headA:b.next;
        }
        
        return a;
    }
}
