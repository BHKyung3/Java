package ex01;

import java.io.FileInputStream;

public class ExceptionExam10 {

	public static void main(String[] args) {
		int result = 0;
		
		try {
			result = divide(10, 0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(result);
		
		System.out.println("프로그램 종료!");
	}
	
//		함수에서 직접 처리하지 않고 던지는 경우
	private static int divide(int num1, int num2) throws ArithmeticException{ // throw 던지겠다는 의미
		
		if(num2 == 0) throw new ArithmeticException("0으로 나눌 수는 없습니다.");
		int result = num1/num2;
		
		return result+100;
	}

}
