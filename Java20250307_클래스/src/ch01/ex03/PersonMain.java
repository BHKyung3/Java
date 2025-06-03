package ch01.ex03;

public class PersonMain {

	public static void main(String[] args) {
		
//		dong1 = 스택, name/age/kor/eng/math = 힙

/*
 		Person dog1 = new Person(); //클래스가 있을 경우 반드시 기재 해야한다.
 		
 		dog1.name = "까미";
		dog1.age = 15;
		dog1.kor = 90;
		dog1.eng = 40;
		dog1.math = 10;
		
		dog1.공부하기(dog1.name);
		dog1.시험보기(dog1.kor, dog1.eng, dog1.math);
		
		Person p1 = new Person(); //메모리 공간 안에 Person을 만든다. 
		int  num1 = 10;
		
		p1.name = "홍길동";
		p1.age = 35;
		p1.공부하기(p1.name);
 */
		
//		이름, 나이, 전화번호만 입력하시고, 메소드 호출해서 출력
		
		Person person 
		 = new Person("두마리닭다리", 50, "010-1111-2222");
		
		
		
		person.나이();
		person.이름();
		person.전화번호();
		
		
		Person p2 = new Person("홍길동", 20, "1111-2222");
			p2.이름();
			p2.나이();
			p2.전화번호();
		
		

	}

}
