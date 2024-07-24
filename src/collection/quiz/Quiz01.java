package collection.quiz;

import java.util.ArrayList;

public class Quiz01 {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();

		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		Member member4 = new Member(1004, "희동이");

		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		memberArrayList.addMember(member4);
		

		memberArrayList.showAllMember();

		System.out.println();

		memberArrayList.removeMember(1004);

		memberArrayList.showAllMember();

	}

}

// 회원 리스트 클래스
class MemberArrayList {

	// 회원 목록
	ArrayList<Member> list; // 리스트 선언

	public MemberArrayList() {
		list = new ArrayList<Member>();
	}

	// 멤버 추가 메소드
	public void addMember(Member member) {
		list.add(member);
	}

	// 아이디로 회원 삭제 메소드
	public void removeMember(int memberId) {
		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			int id = member.memberId;

			if (id == memberId) {
				list.remove(i);
				System.out.println(memberId + "번 회원 삭제");
				return;
			}
		}
		System.out.println(memberId + "번 회원은 없음");
	}

	// 모든 회원 조회
	public void showAllMember() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
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