package generic.quiz;

import java.util.ArrayList;

public class Quiz02 {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		
		for(Character character : list) {
			if(character == 'A') {
				list.remove(character);
			}
		}
		System.out.println(list);
	}

}
