package ch01.ex04;

class GrandParent{
	private String 할아버지성함;
	
	GrandParent() {}
	
	GrandParent(String 할아버지성함){
		this.할아버지성함 = 할아버지성함;
	}
	void displayInfo() {
		System.out.println("할아버지 성함은" + " " + 할아버지성함 + "입니다.");
		
	}
}

class Parent extends GrandParent { //extends 소속된 클래스.
	private int 아버지나이;
	
	Parent () {}
	
	Parent(String 할아버지성함, int 아버지나이){
		super(할아버지성함); //상위클래스 생성자 호출(인자값 1개 받을 수 있는)
		this.아버지나이 = 아버지나이;
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("아버지 연세는" + " " + 아버지나이 + "세입니다.");
	}
}

class Child extends Parent{
	String 나의취미;
	
	Child() {}
	
	public Child(String 할아버지성함, int 아버지나이, String 나의취미){
		super(할아버지성함, 아버지나이); //상위클래스 생성자 호출(인자값 2개 받을 수 있는), 상위클래스에 있는 메소드 호출기능이 있음
		this.나의취미 = 나의취미;
	}
	
	void displayInfo() {
		super.displayInfo();
		System.out.println("나의 취미는" + " " + 나의취미 + "입니다.");
	}
}
public class MainClass {

	public static void main(String[] args) {
		
		Child child = new Child("김철수", 50, "야구");
		child.displayInfo(); //가장 가까운 값부터 출력
		
//		같은 페이지에 다수에 같은 함수가 기재되어 있는 것 : 오버라이딩
//		같은 함수가 있을 경우 출력값에 가장 가까운 값부터 출력이 된다.
	}
	
}
