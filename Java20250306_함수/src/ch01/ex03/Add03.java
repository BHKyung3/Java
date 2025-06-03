package ch01.ex03;
/*
 					**********2개 값을 입력받아서, 더하는 기능을 수행(매개변수 X, 반환 O)**********
 */
public class Add03 {

	public static void main(String[] args) {

		System.out.println("main함수 시작"); // 1번
		
		
		
		int result = add(); // 함수이름 / 2번 //() 안에 아무것도 없으면 매개변수 없음, 있다면 있음
		System.out.println(result);
		
		
		
		System.out.println("프로그램 종료"); // 5번
	}
	public static int add() { //() 안에 아무것도 없으면 매개변수 없음, 있다면 있음
		
		
		System.out.println("add() 시작"); // 
		
		int num1 = (int)(Math.random()*100) + 1; //1~100까지 랜덤하게 추출 / int가 없을 경우 99.9999 등 난수 발생으로 int 사용
		int num2 = (int)(Math.random()*100) + 1; //1~100까지 랜덤하게 추출 / int가 없을 경우 99.9999 등 난수 발생으로 int 사용
		
		System.out.println("num1=" + num1 + ", " + "num2=" + num2);
		int sum = num1 + num2; 
		
		return sum; //번
	}
}
