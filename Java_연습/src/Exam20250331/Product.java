package Exam20250331;

public class Product {
	
	private String name;
	private int price;
	
	public Product () {}
	
	public Product (String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}
