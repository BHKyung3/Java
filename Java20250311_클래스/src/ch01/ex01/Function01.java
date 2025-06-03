package ch01.ex01;
/*
 			함수
 			반환타입 O, 매개변수 O 
 */
public class Function01 {

	public static void main(String[] args) {
		
		Function01 f1 = new Function01(); //객체생성 필수!!, 객체 생성 없이 진행하는 방법은 Function02 버전 참고
		
		int num1 = 10; //매개 변수
		int num2 = 20;
		
		int result = f1.add(num1, num2); // 함수호출
		
		System.out.println("result =  " + result);
	}

	int add(int n1, int n2) { // ←, ↓ 함수, int 앞에 static 기재 시 객체 생성하지 않아도 출력 가능
		return n1 + n2;
	}
}
