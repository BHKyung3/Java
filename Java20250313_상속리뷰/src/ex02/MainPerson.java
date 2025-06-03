package ex02;

public class MainPerson {

	public static void main(String[] args) {

		UniversityStudent u1 = new UniversityStudent("지리산", 20, "한체대", 3, "전산");
		u1.introduce();
		
		Person p1 = new Person("내장산", 20);
		p1.introduce();
		
		Student s1 = new Student("치악산", 15, "천호초등학교", 3);
		s1.introduce();
		
		System.out.println("--------------------");
		
		System.out.println(p1); //Person 클래스 참고
		System.out.println(s1.toString());
		System.out.println(u1.toString());
		
		System.out.println("------↓ 상위클래스는 하위클래스 참조 가능--------------");
		
		Person p2 = new Student();
		Student s2 = new UniversityStudent();
	
		System.out.println("------↓ 하위클래스는 상위클래스 참조 불가--------------");
		
//		Student s3 = new Person(); ← 오류 : 사용할 수 있는것에 제한이 생겨서
//		↑ Student 하위클래스 Person는 상위클래스로 참조할 수 없음
		
		System.out.println("------↓ 하위클래스는 상위클래스 참조 가능한 경우--------------");
		
		Person p4 = new Student();
		Student s4 = (Student)p4; // ← 가능 : 기능 제한이 없음
		
		p4 = new Person();
//		s4 = (Student)p4; ← 오류 : p4는 Person만 있기 때문에 
		
		p4 = new UniversityStudent();
		s4 = (Student)p4; // ← 가능
		
		System.out.println("------↓ 다 형 성--------------");
//		조건 : 자동변환이 되어 있어야하고 오버라이딩이 되어 있어야함(Override, introduce)
		
		Person p5 = new Person();
		p5.sleep();
		p5.introduce(); //void introduce()의 내용이 출력
		System.out.println(p5); //public String toString()의 내용이 출력
		
		p5 = new Student();
		p5.sleep();
		p5.introduce();
		System.out.println(p5);
		
		p5 = new UniversityStudent();
		p5.eat();
		p5.introduce();
		System.out.println(p5);
		
		
		
		
	}
}
