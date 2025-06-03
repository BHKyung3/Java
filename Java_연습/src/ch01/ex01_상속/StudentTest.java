package ch01.ex01_상속;

public class StudentTest {

	public static void main(String[] args) {

		Student[] student = new Student[3];
		
		student[0] = new Student("홍길동", 20, 171, 81, "201101", "영문");
		student[1] = new Student("고길동", 21, 183, 72, "201102", "건축");
		student[2] = new Student("박길동", 22, 175, 65, "201103", "컴공");
		
		for(int i=0; i<student.length; i++) {
			System.out.println(student[i]);
		}
	}

}
