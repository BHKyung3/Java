package ex03;

public class Person {
	
	private String name; //필드선언
	private int age;
	
	Person() {}
	
	Person(String name, int age){ //생성자 선언
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	void sleep() {
		System.out.println("잘자라");
	} //메소드 선언
	void eat() {}
	
	@Override
	public String toString() { //MainPerson 클래스 참고
//	toString : 내 형태의 맞게 재정의한다.
		return name + ", " + age + "입니다.";
	}
	
	void introduce() { //introduce : 소개하다
		System.out.println("안녕하세요, 저는 " + name + "이고, 나이는 " + age + "살 입니다.");
	}

}
