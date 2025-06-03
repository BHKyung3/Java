package ch01.ex03;

public class 함수오버로딩 { //클래스

	public static void main(String[] args) { //메소드

		functionA(); //함수 이름은 같으나 매개 변수에 때라 값이 불어와지는 것 : 함수오버로딩
		
	}
	
	public static void functionA() { //매개변수에 아무것도 없음
		System.out.println("functionA()");
	}
	public static void functionA(int n) { //매개변수에 정수값 1개 받음
		System.out.println("functionA()");
	}
	public static void functionA(double n) { //매개변수에 실수값 1개 받음
		System.out.println("functionA()");
	}
	public static void functionA(int n1, int n2) { //매개변수에 정수값 2개 받음
		System.out.println("functionA()");
	}

}
