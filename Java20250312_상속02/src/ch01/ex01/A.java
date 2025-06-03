package ch01.ex01;

public class A {
	private String name;
	
	A(){}
	A(String name){
		this.name = name;
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
	
	void funC() {
		System.out.println("funC()");
	}
}

