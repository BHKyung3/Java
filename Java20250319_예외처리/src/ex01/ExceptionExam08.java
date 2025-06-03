package ex01;

import java.util.Scanner;

public class ExceptionExam08 {

	public static void main(String[] args) {
		
		int result = divide(10, 0);
		System.out.println(result);
		
		System.out.println("프로그램 종료!");
	}
	
//		함수에서 직접 처리한 경우
	private static int divide(int num1, int num2) {
		int result = 0;
		try {
			result = num1/num2;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
