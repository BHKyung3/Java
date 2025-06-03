package ch01.ex02;

/*
 		상속 전제 조건
 		1. 하위클래스는 상위클래스 지원접근 가능.(private 제외)
 		2. 상위클래스는 하위클리스 접근 불가.
 		
 */

public class Main {

	public static void main(String[] args) {

/*		@Override 관련
		상위클래스는 하위클래슨 침조는 가능하나 사용은 불가하다.
		다만, Override 사용이 되어 있다면 가까운 본인 것을 사용한다!!!
*/		
		
		A a1 = new A();
		a1.test();
		
		B b1 = new B();
		b1.test();
		
		C c1 = new C();
		c1.test(); //test는 3개이지만 Override 사용은 가장 가까운 본인 것을 먼저 사용한다.
		
		System.out.println("-------다형성-------");
		
		A a2 = new C(); //a2로 불어오지만 오버라이딩이 되어 있으면 c로 참조하여 불러옴
		a2.test();
		
		A a3 = new B();
		a3.test();
		
		B b2 = new C();
		b2.test();
		
	}
}
