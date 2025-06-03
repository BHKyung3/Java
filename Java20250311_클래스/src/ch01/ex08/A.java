package ch01.ex08;

public class A { //3번 생성자 찾기

	private String name;
	private int age;
	
	A(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	A() {} //필수 기재
	
	void funcA() { //메소드 선언
		System.out.println("funcA()");
	}
	
	void info() { //A에서 가지고 있는 메소드
		System.out.println(name);
		System.out.println(age);
	}
}

class B extends A { // 2번 생성자 찾기 
	private String address;
		
	B() {} //필수 기재
		
	B(String name, int age, String address){
		super(name, age); //상위클래스 생성자 호출
		this.address = address;
		}
	
//	↓ 상위클래스가 가지고 있는 메소드 -> 재정의, 오버라이딩
	@Override //상위클래스에 있 메소드를 재정의 하고 있다. / 재정의 오타 방지(상위클래스 명과 동일해야함)
	void info() {
		System.out.println("B class");
	}
	void infoB() {
		info();
		System.out.println(address);
	}
		
	void funcB() {
		System.out.println("funcB()");
		}
	}
