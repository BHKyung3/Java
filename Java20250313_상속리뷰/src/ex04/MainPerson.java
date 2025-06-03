package ex04;

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
	
	static void method(Person p) {
//		   ↓ p가 참조하는 개체가 UniversityStudent이니? 묻는것
		if(p instanceof UniversityStudent) {
			UniversityStudent u = (UniversityStudent)p; 
			((UniversityStudent)p).sleep();
			((UniversityStudent)p).study();
			((UniversityStudent)p).registerCourse();
		} else if(p instanceof Student) { 
			Student s = (Student)p;
			((Student)p).sleep();
			((Student)p).study();
		}else {
			p.sleep();
//			Java20250313 프로젝트에 ex03 MainPerson과 같은 내용이나 다르게 표기
		}
		System.out.println("-------------------");
	}
}
