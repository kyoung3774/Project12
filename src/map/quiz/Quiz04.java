package map.quiz;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Quiz04 {

	public static void main(String[] args) {
		
		// map 선언 및 생성
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		
		// map의 value값 인스턴스 생성
		Student student1 = new Student(1001, "둘리", 90, 80, 70);
		Student student2 = new Student(1002, "또치", 55, 65, 75);
		Student student3 = new Student(1003, "도우너", 80, 50, 50);
		
		// map에 key값과 value값 삽입
		map.put(student1.studentID, student1);
		map.put(student2.studentID, student2);
		map.put(student3.studentID, student3);
		
		//
		Collection<Student> values = map.values();

		for (Student student : values) {
			int sum = student.korScore + student.mathScore + student.engScore;
			double avg = sum / 3.0;
			System.out.println(student.name + "학생의 총점:" + sum + ", 평균:" + avg);
		}
		System.out.println();
		
		// 
		Set<Integer> keyset = map.keySet();

		int totalScore_kor = 0;
		int totalScore_math = 0;
		int totalScore_eng = 0;

		for (int key : keyset) {
			System.out.println(
					map.get(key).name + "|" + " 총점:" + map.get(key).totalScore() + " 평균:" + map.get(key).average());
			totalScore_kor += map.get(key).korScore;
			totalScore_math += map.get(key).mathScore;
			totalScore_eng += map.get(key).engScore;
		}
		System.out.println();
		System.out.println("국어 총점:" + totalScore_kor);
		System.out.println("수학 총점:" + totalScore_math);
		System.out.println("영어 총점:" + totalScore_eng);
	}

}

// 학생 클래스
class Student {
	int studentID;
	String name;
	int korScore;
	int mathScore;
	int engScore;

	public Student(int studentID, String name, int korScore, int mathScore, int engScore) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}

	public int totalScore() {
		return this.korScore + this.mathScore + this.engScore;
	}

	public double average() {
		return (this.korScore + this.mathScore + this.engScore) / 3;
	}
}