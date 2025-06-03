package ch01.ex01_클래스;

public class BookTest extends Book {

	public static void main(String[] args) {

		Book[] book = new Book[5];
		
		book [0] = new Book();
		book [1] = new Book("파이썬", "황재호", 25000);
		book [2] = new Book("갤럭시", "이재용", 1800000);
		book [3] = new Book("아이폰", "스잡", 2000000);
		book [4] = new Book("소니", " 몰랑", 1000000);
		
		for(int i=0; i<book.length; i++) {
			System.out.println(book[i].getBookInfo());
		}
	}

}
