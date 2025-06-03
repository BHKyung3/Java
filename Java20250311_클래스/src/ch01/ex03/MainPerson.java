package ch01.ex03;

public class MainPerson {

	public static void main(String[] args) {

		Person p1 = new Person("설악산", 50); //객체생성, p1 스택공간에서 각각 생성
		Person p2 = new Person("지리산", 20); //객체생성, p2 스택공간에서 각각 생성
//		↑ 기본 생성자가 없을 경우 나타내야할 값을 직접 입력해야함.
		
//		String result = p1.displayInfo();	
//		System.out.println(result); ↓ 아래 내용과 동일한 표현 방식, 짧은게 좋음
		
		System.out.println(p1.displayInfo());
		
		System.out.println();
		
		Person p3 = new Person();
			System.out.println(p3.displayInfo());
		
			System.out.println();
			
			Person p4 = new Person("치악산");
			System.out.println(p4.displayInfo());
			
	}

}
