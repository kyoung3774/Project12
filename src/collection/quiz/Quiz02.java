package collection.quiz;

import java.util.HashSet;
import java.util.Iterator;

public class Quiz02 {

	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		
		System.out.println("Set의 구조: " + hashSet);
		System.out.println();
		
		System.out.println("Set의 크기: " + hashSet.size());
		System.out.println();
		
		Iterator<Integer> ir = hashSet.iterator(); 
		
		while(ir.hasNext()) {
			int member = ir.next();
			System.out.print(member + " ");
		}
		System.out.println();
		System.out.println();
		
		for (Integer integer : hashSet) {
			System.out.print(integer + " ");
		}
	}

}
