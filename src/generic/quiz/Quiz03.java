package generic.quiz;

import java.util.ArrayList;

public class Quiz03 {

	public static void main(String[] args) {

		ArrayList<Book> list = new ArrayList<Book>();
		list.add(new Book(1001, "둘리"));
		list.add(new Book(1002, "또치"));
		list.add(new Book(1003, "도우너"));
		
		for(Book book : list) {
			System.out.println(book);
		}
		
		list.clear(); // 조건 x
		list.removeAll(list); // 조건 o
		
		for(Book book : list) {
			System.out.println(book);
		}
	}

}

// Book 클래스
class Book{
	int bookNum;
	String bookTitle;
	
	public Book(int bookNum, String bookTitle) {
		super();
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
		
		
	}

	@Override
	public String toString() {
		return "Book [bookNum=" + bookNum + ", bookTitle=" + bookTitle + "]";
	}
	
	
}