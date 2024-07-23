package generic;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {
		
		// 숫자를 저장하는 리스트 생성
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		Integer i = list1.get(0);
		System.out.println(i);
		
		// 문자열을 사용하는 리스트 생성
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("aaa");
		String str = list2.get(0);
		System.out.println(str);
	
	}

}
