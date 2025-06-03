package ex01;

import java.util.Scanner;

public class ExceptionExam01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력> ");
		int num1 = sc.nextInt();
		int num2 = 0;
		
		while(true) { // 정수 0을 입력할 경우 프로그램 종료가 되기 때문에 0을 입력하지 않도록 막는 목적
			num2 = sc.nextInt();
			
			if(num2 == 0) {
				System.out.println("0은 입력하지 마세요...콱!!");
				System.out.println("0 제외 정수입력>");
				continue;
			}
			break;
		}
		
		
		
		System.out.println("합: " + (num1+num2)); //꼭 묶어야함(묶지 않으면 정수로 기억됨)
		System.out.println("뺄셈 : " + (num1-num2));
		System.out.println("곱 : " + (num1*num2));
		System.out.println("나누기 : " + (num1/num2));
		
		System.out.println("프로그램 종료!");
	}

}
