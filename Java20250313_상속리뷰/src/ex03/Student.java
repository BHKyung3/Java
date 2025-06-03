package ex03;

public class Student extends Person {
	
	private String schoolName;
	private int grade; //학년
	
	Student() {}
	
	Student(String name, int age, String schoolName, int grade){
		super(name, age); //Person class에 name, age에 두 항목을 전달한다
		this.schoolName = schoolName;
		this.grade = grade;
	}
	
	void study() {
		System.out.println("공부가 어려워");
	}
	
	@Override
	public String toString() { //toString : 내 형태의 맞게 재정의한다.
		return schoolName + ", " + grade + "입니다.";
		
	}
	
	@Override //동일한 introduce 선언이나 가장 최근 선언을 우선 순위로 한다
	void introduce() {
		System.out.println("안녕하세요, 저는 " + schoolName + "에 다니는 " + grade + "학년" + " " + getName() + "입니다.");
	}
}
