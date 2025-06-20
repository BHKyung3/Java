package ex02;

class Student{
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		
		return this.no == s.no && this.name.equals(s.name);
	}
	
	@Override
	public int hashCode() {
		int result = Integer.hashCode(no);
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return super.hashCode();
	}
}

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student(1, "홍길동");
		Student student2 = new Student(1, "홍길동");
		
		System.out.println(student1.equals(student2));

	}

}
