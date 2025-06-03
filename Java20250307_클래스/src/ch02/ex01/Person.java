package ch02.ex01;

public class Person {
	
/*
 	멤버 변수 ->값 세팅하는 방법
 	1. 생성자를 이용하는 방식
 	2.setter를 이용하는 방식 : 값을 변경하는 것
 	3. getter : 값을 읽어오는 것
 */
	
	private String name; //private 해당 값 반드시 반드시 기재!!! / 기재 시 외부 클래스에서는 사용할 수 없다.
	private int age; //이 3가지를 멤버변수 라고 한다.
	private String phone;
	
	public Person() { //생성자 호출 : 내가 만들지 않으면 자바가 대신하여 만들어줌
		System.out.println("Person()");
	}
	public Person(String n) { //생성자 호출 : 내가 만들지 않으면 자바가 대신하여 만들어줌
		System.out.println("Person(String n)");
		name = n;
	}
	public Person(String n, int a, String p) { //생성자 호출 : 내가 만들지 않으면 자바가 대신하여 만들어줌
		System.out.println("Person(String n, int age, String p)");
		name = n;
		age = a;
		phone = p;
	}
	
	void setName(String n) {
		name = n;
	}
	void setAge(int a) { //변수의 값을 변경하는 것을 set라고 한다. 카멜표기법에 의해 set 뒤에 대문자를 기재한다.
		age = a;
	}
	
	String getName() {
		return name; //이름을 돌려준다.
	}
	int getAge() {
		return age; //나이를 돌려준다.
	}
	
	public void run() { //run, sleep, eat : 메소드
		System.out.println(name + "달리다!");
	}
	public void sleep() {
		System.out.println(name + "자다!");
	}
	public void eat() {
		System.out.println(name + "먹다!");
	}
}

