package ch01.ex04;

/*
  		클래스
  		출력 값 변경 -> setter : 저장할 때, getter : 불러올 때
  		
  		간추려 내는 과정을 추상화라고 한다.
 */

public class Person { //public 외부 접근 가능.(외부에서 접근이 가능하게 하려면 public를 기재해야함.)
	
	private String name; //private : 외부에서 접근하지 못하게 한다.
	private int age;
	
	public String getName(){ //값을 1개씩 불러온다.
		return name;
	}
	public int getAge(){
		return age;
	}
	
	void setName(String name){ //void 반환타입 없음, set 변경값 저장
		this.name = name;
	}
	void setAge(int age){ //void 반환타입 없음, set 변경값 저장
		this.age = age;
	}
	
	public Person(){
		this("남산", 1); //this는 맨 위에 기재 ↓ 아래 주석과 같은 표현 방식.
//		name = "남산";
//		age = 1;
	}
	
	public Person(String name){
		this(name, 1);
//		this.name = name;
//		age = 1;
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
