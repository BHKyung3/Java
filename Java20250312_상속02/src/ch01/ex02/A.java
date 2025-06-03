package ch01.ex02;

public class A {
	private String name;
	
	A(){}
	A(String name){
		this.name = name;
	}
	
	void test() {
		System.out.println("A class");
	}
	
	void funA() { //클래스
		System.out.println("funA()");
	}
}

class B  extends A {
	private String address;
	
	B(){}
	B(String name, String address){
		super(name);
		this.address = address;
	}
	
	@Override //메소드 오버라이딩(상위클래스와 이름이 동일하다는 의미)
	void test() {
		System.out.println("B class");
	}
	
	void funB() {
		System.out.println("funB()");
	}
}

class C  extends B {
	private int age;
	
	C(){}
	C(String name, String address, int age){
		super(name, address);
		this.age = age;
	}
	
	@Override
	void test() {
		System.out.println("C class");
	}
	
	void funC() {
		System.out.println("funC()");
	}
}

