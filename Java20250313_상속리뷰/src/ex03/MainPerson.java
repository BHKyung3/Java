package ex03;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p2 = new UniversityStudent(); //기제는 가능하나 사용은 불가
		

		Person p1 = new Person();
		Student s1 = new Student();
		UniversityStudent u1 = new UniversityStudent();
		
		method(u1); //Person, Student, UniversityStudent 다 가능
		method(s1); //Person, Student만 전달 가능
		method(p1); //Person만 전달 가능
//		u1를 전달 할 경우 3가지 다 가능하나 s1의 경우는 UniversityStudent 전달 불가
	}
	
//		셜명) ↓ p가 참조하고 있는 대상은 Person 객체 이거나 Person를 상속한 객체
	static void method(Person p) {
//		  	설명)  ↓ p가 참조하는 개체가 UniversityStudent이니? 묻는것
		if(p instanceof UniversityStudent) {
			UniversityStudent u = (UniversityStudent)p; // 객체 타입 확인
			u.sleep();
			u.study();
			u.registerCourse();
//			설명)  ↓ p가 참조하는 개체가 Student이니? 묻는것
		} else if(p instanceof Student) { // 객체 타입 확인
			Student s = (Student)p;
			s.sleep();
			s.study();
		}else {
			p.sleep();
		}
		System.out.println("-------------------");
	}
}
