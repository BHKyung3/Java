package ch01.ex03;
/*
 					**********2개 값을 입력받아서, 더하는 기능을 수행(매개변수, 반환 x)**********
 */
public class Add01 {

	public static void main(String[] args) {

		System.out.println("main함수 시작"); //1번 
		
		
		
		
		add(); //2번 : 함수이름 지정필수
		
		
		
		
		
		
		System.out.println("프로그램 종료"); //4번
	}
	public static void add() { 
		
		int num1 = (int)(Math.random()*100) + 1; //1~100까지 랜덤하게 추출 / int가 없을 경우 99.9999 등 난수 발생으로 int 사용
		int num2 = (int)(Math.random()*100) + 1; //1~100까지 랜덤하게 추출 / int가 없을 경우 99.9999 등 난수 발생으로 int 사용
		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2)); //(num1+num2) 괄호가 없을 경우 문자로 출력됨.
		System.out.println("add() 시작"); //3번
	}
}
