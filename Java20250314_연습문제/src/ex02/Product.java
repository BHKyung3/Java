package ex02;

import java.text.DecimalFormat;

public class Product {

	private String name;
	private int balance;
	private int price;
	
	Product(){
		this("듀크인형", 5, 10000);
	}
	
	Product(String name, int balance, int price){
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	
	@Override
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("#,###");
		return name + ", " + balance + "개, " + formatter.format(price) + "원";
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int getPrice() {
		return price;
	}

}
