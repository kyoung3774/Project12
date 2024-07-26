package collection;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {

		// 회원 리스트 생성
		ArrayList<Member> list = new ArrayList<>();

		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");

		list.add(member1);
		list.add(member2);
		list.add(member3);
		list.add(member3); // 리스트의 특징: 순서 o , 중복 o

		Member m = list.get(0);

		System.out.println(list);
		System.out.println();

		System.out.println(m);
		System.out.println();

		System.out.println(list.get(0));
		System.out.println();

		list.remove(0);
		System.out.println("전체 회원 수: " + list.size());
		System.out.println();

		// 리스트 출력하기
		System.out.println(list);
		System.out.println();

		// for문 전체 회원 정보 출력
		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			System.out.println(member);
		}
	}

}

// 쇼핑몰 회원
class Member {
	int memberId;
	String memberName;

	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}

}