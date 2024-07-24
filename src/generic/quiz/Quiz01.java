package generic.quiz;

import java.util.ArrayList;

public class Quiz01 {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<Character>();

		list.add('a');
		list.add('b');
		list.add('c');

		for (Character character : list) {
			System.out.println(character);
		}
		System.out.println();
		list.remove(0);
		
		System.out.println(list.size());
		System.out.println();
		
		for (Character character : list) {
			System.out.println(character);
		}
	}

}
