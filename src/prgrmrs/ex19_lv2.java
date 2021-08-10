package prgrmrs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ex19_lv2 {

	public static void main(String[] args) {
		String numbers="17";
		System.err.println(solution(numbers));
	}
	static Set<Integer> set;
	public static int solution(String numbers) {
		set=new HashSet<>();
		for(int i=0; i<numbers.length(); i++) {
			permutation(numbers.split(""),0,numbers.length(),i+1);
		}
		return isPrime();
	}
	
	public static void permutation(String[] str, int depth, int n, int r) {
		if(depth==r) {
			StringBuilder sb=new StringBuilder();
			for(int i=0; i<r; i++) sb.append(str[i]);
			set.add(Integer.parseInt(sb.toString()));
			System.err.println(set);
			return;
		}
		for(int i=depth; i<n; i++) {
			swap(str,i,depth);
			permutation(str,depth+1,n,r);
			swap(str,i,depth);
		}
	}
	
	public static void swap(String[] str, int i, int j) {
		String temp=str[i];
		str[i]=str[j];
		str[j]=temp;
	}
	
	public static int isPrime() {
		int count=0;
		Iterator<Integer> iter=set.iterator();
		while(iter.hasNext()) {
			boolean flag=true;
			int num=iter.next();
			iter.remove();
			if(num==0 || num==1) continue;
			for(int i=2; i<=Math.sqrt(num); i++) {
				if(i%num==0) {
					flag=false;
					break;
				}
			}
			if(flag) count++;
		}
		return  count;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static Set<Integer> set;
//	public static int solution(String numbers) {
//		set=new HashSet<Integer>();
//		for(int i=0; i<numbers.length(); i++) {
//			permutation(numbers.split(""),0,numbers.length(),i+1);
//		}
//		System.err.println(set);
//		return isPrime();
//	}
//	public static void permutation(String[] arr, int depth, int n, int r) {
//		if(depth==r) {//문자열 이어 붙임
//			StringBuilder sb=new StringBuilder();
//			for(int i=0; i<r; i++) sb.append(arr[i]);
//			set.add(Integer.parseInt(sb.toString()));
//			System.err.println(set);
//			return;
//		}
//		for(int i=depth; i<n; i++) {
//			swap(arr,i,depth);//문자열 뒤집음
//			permutation(arr,depth+1,n,r);
//			swap(arr,i,depth);
//		}
//	}
//	
//	public static void swap(String[] arr, int i, int j) {
//		String temp=arr[i];
//		arr[i]=arr[j];
//		arr[j]=temp;
//	}
//	
//	public static int isPrime() {//소수 개수 계산
//		int count=0;
//		Iterator<Integer> iter=set.iterator();
//		while(iter.hasNext()) {
//			boolean flag=true;
//			int num=iter.next();
//			iter.remove();
//			if(num==0 || num==1) continue;
//			for(int i=num; i<=Math.sqrt(num); i++) {
//				if(num%i==0) {
//					flag=false;
//					break;
//				}
//			}
//			if(flag) count++;
//		}
//		return count;
//	}
}
