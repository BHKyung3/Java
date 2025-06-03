package ch01.ex01_클래스;

public class Book {
	
	private String  title;
	private String  author;
	private int  price;
	
	Book() {
		title = "이것이자바다";
		author = "신용권";
		price = 38000;
	}
	
	Book(String  title, String  author, int  price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	String getBookInfo() {
		return "title: " + title + "author: " + author + "price: " + price;
		
	}
	
	

}
