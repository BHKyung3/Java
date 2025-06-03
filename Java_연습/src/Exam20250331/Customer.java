package Exam20250331;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private String name;
	private List<Product> cart;
	
	public Customer () {}
	
	public Customer (String name) {
		this.name = name;
		this.cart = new ArrayList<>();
	}
//	장바구니에 제품 추가 코드 
	public void addToCart(Product product) {
		
	}

}
