package ch01.ex01;

/*
 		상속 전제 조건
 		1. 하위클래스는 상위클래스 지원접근 가능.(private 제외)
 		2. 상위클래스는 하위클리스 접근 불가.
 */

public class Main {

	public static void main(String[] args) {

		C c1 = new C("지리산", "전북 남원", 40);
		c1.funA();
		c1.funB();
		c1.funC();
		
		B b1 = new 	B("남산", "서울");
		b1.funA();
		b1.funB();
		
		A a1 = new A("내장산");
		a1.funA();
		System.out.println("---------↓ 자동 타입 변환-----------");
		
		/*
		 상위클래스는 하위클래스를 참조는 할 수 있다.
		 단, 하위클래스 자원에는 접근 불가하다!!!
		 자신 클래스에만 접근 가능
		 */
		
//		B b2 = new B("치악산", "원주");
//		A a2 = (A)b2;    ↑ 위에 항목과 동일한 표현방식
		
		A a2 = new B("치악산", "원주"); //상위클래스는 하위클래스 접근 가능
		a2.funA();
//		a2.funB(); 오류 발생(접근 불가)
		
		A a3 = new C("한라산", "제주", 31);
		
		System.out.println("---------↓ 강제 타입 변환-----------");
		
		A a5 = new A();
		B b3 = new B();
	
//		a5 = (A)b3; 자동 타입 변환(가능)
		
/*		b3 = a5; <= 불가로 강제 타입 변환으로 ↓ 아래 처럼 기재
		b3 = (B)a5;
		b3.funA(); //오류, 강제타입 변환 허용하지 않음.
		↑ b는 a,b 둘 다 참조 가능하나 강제 타입으로 b만 참조하라고 하여 오류 발생
*/		
		A a6 = new B();
		B b4 = new B();
		b4 = (B)a6; // 강제타입 변환 가능
		b4.funA();
		
		A a7 = new C();
		B b5;
		b5 = (B)a7; // 강제타입 변환 가능
		b5.funA();
		
		
		A a8 = new C();
		C c2;
		c2 = (C)a8; // 강제타입 변환 가능
		c2.funC(); 
		
		System.out.println("----------");
		
		A a10 = new A();
		B b6 = new B();
		
		a10 = b6;
		B b7 = (B)a10; // 강제타입 변환 가능
		b7.funB();
		
		
		
		
		
		A a4 = new B("백두산", "함경북도");
		
		B b2 = new B("백두산", "함경북도");
	}
}
