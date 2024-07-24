package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03 {

	public static void main(String[] args) {

		// HashSet 선언 및 생성
		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("둘리");
		hashSet.add("또치");
		hashSet.add("도우너");
		hashSet.add("도우너"); // 중복된 값 추가 불가
		System.out.println("set 목록:" + hashSet + " 크기:" + hashSet.size());
		System.out.println();

		hashSet.remove("도우너"); // 순서가 없는 set은 인덱스 대신 remove 사용
		System.out.println("set 목록:" + hashSet + " 크기:" + hashSet.size());
		System.out.println();

		// Iterator 객체 생성
		Iterator<String> ir = hashSet.iterator();

		// 1.
		while (ir.hasNext()) { // 다음 요소의 존재 확인 (반환값:boolean)
			String member = ir.next(); // 다음 요소를 가져옴(반환값:제네릭)
			System.out.print("값: ");
			System.out.print(member + ", ");
			if (ir.next() != "") {
				System.out.println(member);
			}
		}
		System.out.println();

		// 2.
		for (String member : hashSet) {
			System.out.print("값: ");
			System.out.print(member + ", ");
			if (member != "") {
				System.out.println(member);
			}
		}
	}

}
