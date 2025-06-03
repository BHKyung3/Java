package emp;

//		abstract -> 추상클래스(미완성클래스)
public abstract class Employee {
	
	private String name;
	private int number;
	private String department;
	private int salary;
	
	public Employee(){}
	
	public Employee(String name, int number, String department, int salary){
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	public abstract double tax();
	
	int getsalary() {
		return salary;
	}
	void setsalary(int salary) {
		this.salary = salary;
	
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public String getDepartment() {
		return department;
	}

}
