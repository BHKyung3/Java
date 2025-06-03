package ch01.ex05;

public class MainPerson {

	public static void main(String[] args) {

		Person p1 = new Person("설악산", 10); //객체생성, p1 스택공간에서 각각 생성
		Person p2 = new Person("지리산", 30); //객체생성, p2 스택공간에서 각각 생성
//		↑ 기본 생성자가 없을 경우 나타내야할 값을 직접 입력해야함.	
		
		System.out.println(p1.displayInfo());
		
		p1.count += 100; // ← 의미 : p1.count = p1.count+100
		
		System.out.println(p1.count);	//공유자원 접근, 아래 내용과 같은 방식
		System.out.println(p2.count);	//공유자원 접근, 아래 내용과 같은 방식
		System.out.println(Person.count);	// ← 해당 방식을 주로 사용(변수) 
		
		p1.func();
		p2.func();
		
		Person.func(); // ← 해당 방식을 주로 사용(메소드) 
	}

}
