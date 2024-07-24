package map;

import java.util.Collection;
import java.util.HashMap;

public class Ex01 {

	public static void main(String[] args) {
		
		// int형 키, String형 value를 저장하는 맵 생
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1001, "둘리");
		map.put(1002, "또치");
		map.put(1003, "도우너");
		
		System.out.println("hashMap: " + map);
		System.out.println();
		
		System.out.println("key: 1001, value: " + map.get(1001));
		System.out.println("key: 1002, value: " + map.get(1002));
		System.out.println("key: 1003, value: " + map.get(1003));
		System.out.println();
		
		// 데이터 수정(기존 key값, 교체할 value값
		map.replace(1001, "희동이");
		System.out.println("key: 1001, value: " + map.get(1001));
		System.out.println();
		
		// 데이터 삭제(key값)
		map.remove(1001);
		System.out.println("hashMap: " + map);
		System.out.println();
		
		// map 크기 구하기
		int size = map.size();
		System.out.println("map 크기: " + size);
		System.out.println();
		
		// value값 목록 조회
		Collection<String> values = map.values();
		System.out.println("값 목록: " + values);
		System.out.println();
		
		// 특정 key값이 존재하는지 확인하기
		if(map.containsKey(1001)) {
			System.out.println("key값 o");
		}else {
			System.out.println("key값 x");
		}
	}

}
