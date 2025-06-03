package ch01.ex05;

/*
  		static(정적) <==> 인스턴트 static 기대된걸 인스턴트라고 한다.
  		인스턴트 변수(멤버변수), 인스턴트 메소드(멤버메소드)
  		정적변수, 정적메소드
  		인스턴트에서는 인스턴트 변수, 메소드, 정적변수, 메소드 다 사용 가능.
 */

public class Person { //public 외부 접근 가능.(외부에서 접근이 가능하게 하려면 public를 기재해야함.)
	
	private String name; //private : 외부에서 접근하지 못하게 한다.
	private int age;
	
	static int count; //정적변수
	
	static void f1() {} //static 붙어있는 값은 다 사용 가능.
	
	static void func1() {
		count++;
		f1();
	}
	
	public static void func() {
		System.out.println("정적메소드 func()");
	}
	
	public Person(String name, int age){ //생성자, 기본 생성자는 별개로 생성해야함.
		this.name = name; //this가 기재되지 않을 경우 정확하게 가르킨 쪽을 알 수 없어 실행 불가.
		this.age = age;
	}
	
	public String displayInfo() {
		return name + " : " + age;
	}

	void run() { //run, eat 동작을 가지고 클래스를 만든다.
		System.out.println("run...........");
	}
	
	void eat() {
		System.out.println("eat...........");
	}
}
