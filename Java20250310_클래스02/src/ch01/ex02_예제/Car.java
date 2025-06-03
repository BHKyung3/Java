package ch01.ex02_예제;

public class Car {
	
	private String company;
	private String model;
	private String color;
	private int maxSeed;
	public static int count; //정적변수
	
//	정적 변수 : static
	static String companyState = "GM";
	
//	정적 메소스 ↓ : 공유할 내용이면 정적 메소드
	public static void runState() {
//	정적 메소드 안에서 사용할 수 있는 변수 및 메소드는 static이 붙여있는 정적메소드 정적 변수 안에서만 사용 가능
		System.out.println("Static Run()");
	}
	
	public Car() {
//		this(), super() -> 다른 생성자 호출 문장은 함수 맨 앞에 와야함.
		this("현대", "그랜저", "검정", 200);
		System.out.println(++count);
	}
	
	public Car(String company, String model, String color, int maxSeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSeed = maxSeed;
		this.count = count;
	}
	public void displayInfo() {
		System.out.println(company);
		System.out.println(model);
		System.out.println(color);
		System.out.println(maxSeed);
		System.out.println(count);
	}
}
