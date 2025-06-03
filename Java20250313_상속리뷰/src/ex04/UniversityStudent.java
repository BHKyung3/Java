package ex04;

public class UniversityStudent extends Student {
	
	private String major; //전공
	
	UniversityStudent() {}
	
	UniversityStudent(String name, int age, String schoolName, int grade, String major){
		super(name, age, schoolName, grade);
		this.major = major;
	}
	
	void registerCourse() {
		System.out.println("망했어요.");
	}
//	registerCourse : 수강 신청
	
	@Override
	public String toString() { //toString : 내 형태의 맞게 재정의한다.
		return "전공은 " + major + "입니다.";
	}
	
	@Override
	void introduce() {
		System.out.println("안녕하세요, 저는 " + major + "을 전공하고 있는 " + getName() + "입니다.");
	}
}
