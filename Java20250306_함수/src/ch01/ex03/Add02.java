package ch01.ex03;
/*
 					**********2개 값을 입력받아서, 더하는 기능을 수행(매개변수 o, 반환 x)**********
 */
public class Add02 {

	public static void main(String[] args) {

		System.out.println("main함수 시작"); // 1번
		
		
		int num1 = (int)(Math.random()*100) + 1; //1~100까지 랜덤하게 추출 / int가 없을 경우 99.9999 등 난수 발생으로 int 사용
		int num2 = (int)(Math.random()*100) + 1; //1~100까지 랜덤하게 추출 / int가 없을 경우 99.9999 등 난수 발생으로 int 사용
		
		
		add(num1, num2); // 함수이름 / 2번 () 안에 아무것도 없으면 매개변수 없음, 있다면 있음
		
		
		
		
		
		
		System.out.println("프로그램 종료"); // 5번
	}
	public static void add(int numA, int numB) { // 3번
		
		
		System.out.println("add() 시작"); // 
		
		System.out.println(numA + " + " + numB + " = " + (numA+numB)); //(num1+num2) 괄호가 없을 경우 문자로 출력됨. / 4번
	}
}
