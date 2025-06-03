package ch01.ex01;
/*
 			함수
 			반환타입 O, 매개변수 O 
 */
public class Function02 {

	public static void main(String[] args) {
		
		
		
		int num1 = 10; //매개변수
		int num2 = 20;
		
		int result = add(num1, num2); // num1, num2 매개 변수
		
		System.out.println("result =  " + result);
	}

	static int add(int n1, int n2) { // ←, ↓ 함수, static 객체 생성 없이 생성할 수 있음
		return n1 + n2;
	}
}
