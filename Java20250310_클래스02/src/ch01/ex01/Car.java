package ch01.ex01;

public class Car {

	private String company; //← 생성자 선언
	private String model;
	private String color;
	private int maxSeed;
	
	String getCompany(){ //값 중 하나만 출력하고 싶을 때
		return company;
	}
	
	void setColor(String color) { //set 고정 값을 변경하고 싶을 때
		this.color = color; 
	}
	
//	public Car() {} // ← 기본 생성자 만들기
	
	public Car() { //초기값 설정 ↓ 또는 실행화면 괄호 안에 기재(디폴트 생성자)
//		this.company = "현대";
//		this.model = "그랜저";
//		this.color = "검정";
//		this.maxSeed = 250;
		this("현대", "그랜저", "검정", 250); //this의 역활 : 객체 소환하기.
	}
		
	public Car(String company, String model) {
//		this.company = company;
//		this.model = model;
		this(company, model, "검정", 250);
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
