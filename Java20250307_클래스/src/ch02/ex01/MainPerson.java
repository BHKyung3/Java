package ch02.ex01;

public class MainPerson {

	public static void main(String[] args) { //클래스 생성 시 3번째 미체크하면 해당 값이 뜨지 않음.

		Person p1 = new Person("두마리닭다리 "); //참조변수
		
//		p1.name = "두마리닭다리 "; 멤버변수는 private이기 때문에 외부에서 접근 불가.
		
		p1.run();
		p1.eat();
		
		Person p2 = new Person("홍길동", 20, "010-1111-2222");
		
//		Person p3 = new Person();
		
		p2.setName("까미");
		p2.eat();
		p2.setAge(20);
		
		String name = p2.getName();
		int age = p2.getAge();
		System.out.println(name);
		System.out.println(age);
	}

}
