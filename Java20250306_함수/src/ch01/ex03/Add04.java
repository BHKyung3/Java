package ch01.ex03;

import java.util.Scanner;

/*
 					**********2개 값을 입력받아서, 더하는 기능을 수행(매개변수 O, 반환 O)**********
 */
public class Add04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	

		System.out.println("main함수 시작");
		
		int num1 = (int)(Math.random()*100) + 1; //1~100까지 랜덤하게 추출 / int가 없을 경우 99.9999 등 난수 발생으로 int 사용
		int num2 = (int)(Math.random()*100) + 1; //1~100까지 랜덤하게 추출 / int가 없을 경우 99.9999 등 난수 발생으로 int 사용
		
		int result = add(num1, num2); // 함수이름 / () 안에 아무것도 없으면 매개변수 없음, 있다면 있음 / 1번
		
		System.out.println(result);
		
		System.out.println("프로그램 종료");
		
	} 	
	
		public static int add(int numA, int numB) {  //2번
		
			System.out.println("add() 시작"); 
			
//		System.out.println("numA=" + numA + ", " + "numB=" + numB);
		int sum = numA + numB;  //3번
		
		return sum; //4번
		}
	}
