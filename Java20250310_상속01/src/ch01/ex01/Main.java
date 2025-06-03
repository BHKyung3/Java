package ch01.ex01;

// 상위클래스의 내용은 사용할 수 있지만 밑에 클래스 내용은 사용할 수 없다.
// 단 클래스 안에 private가 기재되어 있을 경우 상속을 해도 사용할 수 없다.(private는 본인 클래스에서만 사용하겠다는 의미)

class K{
	
}

class A{
	
	String name;
	int age;
	
	A() {}
	
	A(String name, int age){
		this.name = name;
		this.age = age;
	}
	void run() {
		System.out.println("run()");
	}
	void eat() {
		System.out.println("eat()");
	}
}

// ↓ B클래스가 상위클래스인 A클래스를 상속하겠다는 의미.(extends A) A클래스에 있는 내용을 B클래스에서 사용할 수 있음.
class B extends A{
	String id;
	
	B() {} //반드시 기재
	B(String name, int age, String id){
		super(name, age); //super : 값을 상위클래스한테 넘겨 준다. A가 받을 2개의 생성자를 전달한다(A: name, age) / this보다 위에 기재되어 있어야함.
		this.id = id;
	}
}

// ↓ final : 상위 클래스의 내용을 가지고 오지 않음. 다중상속을 허용하지 않음(extends B, K)
final class C extends B{ 
	String pw;


	C() {}
	C(String name, int age, String id, String pw){
		super(name, age, id);
		this.pw = pw;
	}
	
	void displayInfo() {
		System.out.println("A class: " + name);
		System.out.println("A class: " + age);
		System.out.println("A class: " + id);
		System.out.println("A class: " + pw);
	}
		
		}
// class D extends C{
//	String g; => final 기재로 사용 불가.

public class Main {

	public static void main(String[] args) {
		
		C c = new C("홍길동", 20, "test", "1234");
		c.displayInfo();
		
	}

}
