package Example0307;

public class student_연습 {

	public static void main(String[] args) {

		Student_연습01 student = new Student_연습01("홍길동", 20, "졸림");
		
		System.out.println("이름: " + student.name);
		System.out.println("나이: " + student.age);
		System.out.println("상태: " + student.mood);
	}

}
