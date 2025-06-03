package ch01.ex02;

// 인스턴트 멤버 : 객체 생성 후 접근 가능

public class Car {

	private String company; //← 생성자 선언
	private String model;
	private String color;
	private int maxSeed;
	
//	정적 변수 : static
	public static String companyState = "GM";
	
//	정적 메소스 ↓
	public static void runState() {
		System.out.println("Static Run()");
	}
	
//	public Car() {} // ← 기본 생성자 만들기
	
	public Car() { 
		this("현대", "그랜저", "검정", 250);
	}
	
//	생성자 만들기 ↓
	public Car(String company, String model, String color, int maxSeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSeed = maxSeed;
		
	}
	public void run() {
		System.out.println(company + "달린다.");
	}
	
	public void displayInfo() {
		System.out.println(company);
		System.out.println(model);
		System.out.println(color);
		System.out.println(maxSeed);
	}
}
