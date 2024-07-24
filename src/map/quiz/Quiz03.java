package map.quiz;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Quiz03 {

	public static void main(String[] args) {

		HashMap<String, Float> map = new HashMap<String, Float>();

		map.put("국어", 80.0f);
		map.put("수학", 90.0f);
		map.put("영어", 100.0f);
		
		// key값 한개씩 출력
		Set<String> keyset = map.keySet();
		for (String key : keyset) {
			System.out.println("과목명:[" + key + "] ");
		}
		System.out.println();
		
		// value값 한개씩 출력
		Collection<Float> values = map.values();
		for(float f : values) {
			System.out.println(f);
		}
	}

}
