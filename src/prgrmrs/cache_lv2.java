package prgrmrs;

import java.util.LinkedList;

public class cache_lv2 {

	public static void main(String[] args) {
		String[] cities= {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		System.err.println(solution(3, cities));
	}
	
//	LRU(Least Recently Used): 가장 오랫동안 참조하지 않은 페이지를 캐시에서 교체하는 것
//	캐시 적중: 이미 캐시에 있던 페이지를 가장 처음으로 가져옴
//	->기존에 있던 페이지를 지우고 Queue의 가장 처음에 삽입
//	캐시 미스: 캐시가 가득 찬 경우
//	->가장 뒤(참조한지 가장 오래된)의 페이지를 삭제하고 가장 앞에 새 페이지를 삽입한다.
//	캐시에 자리가 있는 경우 가장 앞에 새 페이지를 삽입한다.
//	캐시 사이즈가 0일때는 모든 경우에 캐시 미스가 발생하기 때문에 총 페이지 수 * 5를 반환
	
	static final int CACHE_HIT=1;
	static final int CACHE_MISS=5;
	public static int solution(int cacheSize, String[] cities) {
		if(cacheSize==0) return CACHE_MISS*cities.length;
		int answer = 0;
		
		LinkedList<String> cache=new LinkedList<>();
		
//		cities 대소문자 구분 없음
		for (int i = 0; i < cities.length; i++) {
			String city=cities[i].toUpperCase();
			if(cache.remove(city)) {
				cache.addFirst(city);
				answer+=CACHE_HIT;
			} else {
				int currentSize=cache.size();
				if(currentSize==cacheSize)
					cache.pollLast();
				cache.addFirst(city);
				answer+=CACHE_MISS;
			}
		}
		
		return answer;
	}
}
