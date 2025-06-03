package ex01;

/*
	코딩은 오류를 발생하지 않게 하는 것이 목적으로 기존에는 if문 등으로 막았으나 현재는 아래와 같은 방식으로 막는다.(try, catch 사용)
	프로그램 자체가 중단되지 않게 하는것이 목적
	if문으로 오류를 잡을 경우 코드가 난잡해짐으로 예외처리로 진행
	
*/

import java.util.Scanner;

public class ExceptionExam03 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("합: " + (num1+num2)); //꼭 묶어야함(묶지 않으면 정수로 기억됨)
		System.out.println("뺄셈 : " + (num1-num2));
		System.out.println("곱 : " + (num1*num2));
		
		int[] arr = new int[5]; // ArrayIndexOutOfBoundsException 배열공간 부족
		String str = null; // NullPointerException 참조 대상이 없다
		
		try {
			System.out.println("나누기 : " + (num1/num2)); //나누셈은 0으로 나눌 때 오류 발생으로 오류가 발생될 소지가 있는 것은 try 안에 기재한다.(예외 발생 가능 코드)
			arr[5] = 10;
			System.out.println(str.length());
			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 때 발생");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 공간 부족");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("참조하는 대상이 없다");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("프로그램 종료!");
	}

}
