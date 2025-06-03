package Example0312;

public class Me {

	public String name;
	public int age;
	
	Me () {} 
	Me(String name, int age){
		this.name = name;
		this.age = age;
}
	
	void a () {
		System.out.println("두마리닭다리");
	}
	
	void b () {
		System.out.println(26);
	}
}

class You extends Me {
	
	public String job;
	public int year;
	
	You () {} 
	You(String name, int age, String job, int year){
		super(name, age);
		this.job = job;
		this.year = year;		
	}
	
	void c () {
		System.out.println("사무직");
	}
	
	void d () {
		System.out.println(8);
	}
}

class I extends You {
	
	public String address;
	
	I () {}
	I(String name, int age, String job, int year, String address){
		super(name, age, job, year);
		this.address = address;
	}
	
	void e () {
		System.out.println("중랑구");
	}
}
