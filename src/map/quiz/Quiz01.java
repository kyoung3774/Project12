package map.quiz;

import java.util.HashMap;
import java.util.Set;

public class Quiz01 {

	public static void main(String[] args) {

		HashMap<Character, String> map = new HashMap<Character, String>();

		Fruit fruit1 = new Fruit('a', "사과");
		Fruit fruit2 = new Fruit('b', "바나나");
		Fruit fruit3 = new Fruit('c', "코코넛");

		map.put(fruit1.key, "사과");
		map.put(fruit2.key, "바나나");
		map.put(fruit3.key, "코코넛");

		System.out.println(map.get('b'));
		
		Set<Character> keyset = map.keySet();
		
		for(Character character : keyset) {
			if(character.equals(map.get('b'))) {
				System.out.println('b');
			}
		}

		map.replace('b', "블루베리");
		System.out.println(map.get('b'));

		map.remove('c');
		System.out.println(map);
	}

}

// 과일 클래스
class Fruit {
	char key;
	String name;

	public Fruit(char key, String name) {
		super();
		this.key = key;
		this.name = name;
	}

}