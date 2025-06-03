package ch01.ex04;

public class MainPerson {

	public static void main(String[] args) {

		Person p1 = new Person("설악산", 50); //객체생성, p1 스택공간에서 각각 생성
		Person p2 = new Person("지리산", 20); //객체생성, p2 스택공간에서 각각 생성
//		↑ 기본 생성자가 없을 경우 나타내야할 값을 직접 입력해야함.
		
		
		System.out.println(p1.displayInfo());
		
		p1.setName("내장산");
		p1.setAge(111);
		
		System.out.println(p1.displayInfo());
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

			
	}

}
