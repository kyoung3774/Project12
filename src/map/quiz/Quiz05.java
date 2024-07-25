package map.quiz;

import java.util.Collection;
import java.util.HashMap;

public class Quiz05 {

	public static void main(String[] args) {

		MemberHashMap hashMap = new MemberHashMap();

		hashMap.addMember(new Member(1001, "둘리"));
		hashMap.addMember(new Member(1002, "또치"));
		hashMap.addMember(new Member(1003, "도우너"));
		hashMap.addMember(new Member(1004, "희동이"));

		hashMap.removeMember(1001);
		
		hashMap.showAllMember();
	}

}

//회원 리스트 클래스
class MemberHashMap {

	// 회원 목록
	HashMap<Integer, Member> map;

	// 생성자의 목적: 인스턴스 생성 + 초기화
	public MemberHashMap() {
		map = new HashMap<>();
	}

	// map에 멤버 추가 메소드
	public void addMember(Member member) {
		map.put(member.memberID, member);
	}

	// 아이디로 회원 삭제 메소드
	public void removeMember(int memberID) {

		if (map.containsKey(memberID)) { //containsKey(Object key) / 반환타입:boolean / 설명: hashMap에 지정된 key가 포함되어있는지 확인
			map.remove(memberID);
			System.out.println(memberID + "번 회원을 삭제");
			return;
		}
		System.out.println(memberID + "번 회원이 존재하지 않음");
	}

	// 모든 회원 조회
	public void showAllMember() {
		
		// map은 for문을 사용 할 수 없기에 Collection으로 변경해 for문 사용
		Collection<Member> values = map.values();
		for (Member member : values) {
			System.out.println(member);
		}
	}

}

//쇼핑몰 회원
class Member {
	int memberID;
	String memberName;

	public Member(int memberId, String memberName) {
		super();
		this.memberID = memberId;
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberID + ", memberName=" + memberName + "]";
	}

}